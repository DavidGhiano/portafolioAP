import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: []
})
export class ProyectosComponent implements OnInit {
  @Input() persona: any = {};
  @Input() login!: boolean;

  agregar: boolean = false;


  tecnologias: any[] = [];
  tecnologia: any = {};

  tecnologiaForm: string[] = [];

  form: FormGroup;

  constructor(private formBuilder: FormBuilder) {
    this.form = this.formBuilder.group(
      {
        nombre: ['', Validators.required],
        url: ['', Validators.required],
        descripcion: ['', Validators.required],
        tecnologia: ['']
      }
    )
  }

  ngOnInit(): void {
  }

  onAgregar() {
    this.agregar = !this.agregar;
  }

  onEnviar(event: Event) {
    event.preventDefault();

    let proyectos = this.persona.proyectos;

    let proyecto =
    {
      nombre: this.form.get('nombre')?.value,
      url: this.form.get('url')?.value,
      descripcion: this.form.get('descripcion')?.value,
      tecnologias: []
    }
    proyecto.tecnologias = this.registrarTecnologias();
    proyectos.push(proyecto);
    this.persona.proyectos = proyectos;
    /*
    Guardar persona en BACKEND
    */
   console.log(this.persona);
   this.tecnologiaForm = [];
   this.form.reset();
   this.agregar = !this.agregar;
  }

  registrarTecnologias(): any {
    this.tecnologias = [];
    this.tecnologiaForm.forEach(tec => {
      this.tecnologia = { nombre: tec };
      //Registrar las tecnologias en BACKEND
      //Obtener ID
      /*
        llamar SERVICIO
      */
      this.tecnologias.push(this.tecnologia);
    });
    return this.tecnologias;
  }

  agregarTecnologia() {
    if (this.form.get('tecnologia')?.value != '') {
      this.tecnologiaForm.push(this.form.get('tecnologia')?.value);
      this.form.get('tecnologia')?.reset();
    }
  }

  onBorrarTecnologia(nombre: string) {
    let newArray: string[] = [];
    newArray = this.tecnologiaForm.filter(tec => tec != nombre);
    this.tecnologiaForm = newArray;
  }
}
