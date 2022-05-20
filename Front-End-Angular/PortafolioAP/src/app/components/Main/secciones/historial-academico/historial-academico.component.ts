import { Component, OnInit, Input } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-historial-academico',
  templateUrl: './historial-academico.component.html',
  styleUrls: []
})
export class HistorialAcademicoComponent implements OnInit {
  @Input() persona: any = {};
  @Input() login!:boolean;
  
  agregar:boolean = false;

  form:FormGroup;

  constructor( private formBuilder:FormBuilder ) 
  { 
    this.form = this.formBuilder.group(
      {
        nombre:['', Validators.required],
        titulo:['', Validators.required],
        urlCarrera:[''],
        urlLogo:[''],
        estado:['', Validators.required],
        comienzo:['', Validators.required],
        finalizado:['']
      }
    )
  }

  ngOnInit(): void {
  }

  onAgregar(){
    this.agregar = !this.agregar;
  }

  onEnviar(event: Event){
    event.preventDefault();

    let academicos:any[] = this.persona.academicos;

    let academico:any =
    {
      nombre: this.form.get('nombre')?.value,
      titulo: this.form.get('titulo')?.value,
      urlCarrera: this.form.get('urlCarrera')?.value,
      urlLogo: this.form.get('urlLogo')?.value,
      estado: this.form.get('estado')?.value,
      comienzo: this.form.get('comienzo')?.value,
      finalizado: this.form.get('finalizado')?.value,
    }

    academicos.push(academico);

    this.persona.academicos = academicos;

    /*
      ACÁ CÓDIGO DE PERSONA A BACKEND
    */

    console.log(this.persona.academicos);
    this.form.reset();
    this.agregar = !this.agregar;
  }
}
