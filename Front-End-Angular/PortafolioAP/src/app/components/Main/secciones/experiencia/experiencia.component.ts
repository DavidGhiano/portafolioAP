import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styles: []
})
export class ExperienciaComponent implements OnInit {
  @Input() persona: any = {};
  @Input() login!:boolean;
  
  agregar:boolean = false;
  
  experiencias:any[] = [];
  experiencia:any = {};
 
  actividades:any[] = [];
  actividad:any = {};
  //actividades mostrados en FORM
  actividadesForm:string[] = [];

  form:FormGroup;

  constructor( private formBuilder: FormBuilder ) 
  {
    this.form = this.formBuilder.group({
      nombre:['', Validators.required],
      posicion:['', Validators.required],
      jornada:['', Validators.required],
      urlExperiencia:[''],
      comienzo:['', Validators.required],
      finalizado:[''],
      actividad:['']
    });
  }

  ngOnInit(): void {
  }

  onAgregar(){
    this.agregar = !this.agregar;
  }

  onEnviar(event: Event){
    event.preventDefault();
    // a la variable experienciaS lo igualdo por lo que traigo desde el back-end
    this.experiencias = this.persona.experiencias; 
    //agrego a experiencia los datos obtenidos del formulario 
    this.experiencia =
    {
      nombre: this.form.get('nombre')?.value,
      posicion: this.form.get('posicion')?.value,
      jornada: this.form.get('jornada')?.value,
      // urlExperiencia: this.form.get('urlExperiencia')?.value.slice(12),
      urlExperiencia: '',
      comienzo: this.form.get('comienzo')?.value,
      finalizado: this.form.get('finalizado')?.value
    }
    // a la variable experiencia les agrego las actividades
    this.experiencia.actividades = this.registrarActividad();
    // al array experienciaS le agrego la experiencia
    this.experiencias.push(this.experiencia);
    // al objeto persona le agrego el array experienciaS obtenida
    this.persona.experiencias = this.experiencias;
    /*
      aquí código para guardar el objeto en back-end
    */
    console.log(this.persona);
    this.actividadesForm = [];
    this.form.reset();
    this.agregar = !this.agregar;

  }

  registrarActividad(): any[]{
    this.actividades = [];
    this.actividadesForm.forEach(actividad => {
      this.actividad ={ nombre: actividad };
      // Acá registramos las actividades en bases de datos y tenemos que obtener la actividad con el id
      /*
       codigo con servicio
      */
      //agregamo la actividad recibida en el array
      this.actividades.push( this.actividad );
    });
    return this.actividades;
  }

  agregarActividad(){
    this.actividadesForm.push(this.form.get('actividad')?.value);
    this.form.get('actividad')?.reset();
  }

  onBorrarActividad(nombre:string){
    let newArray: string[]  = [];
    newArray = this.actividadesForm.filter( act => act != nombre);
    this.actividadesForm = newArray;
  }
}
