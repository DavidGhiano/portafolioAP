import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-cursos-realizados',
  templateUrl: './cursos-realizados.component.html',
  styleUrls: []
})
export class CursosRealizadosComponent implements OnInit {
  @Input() persona: any = {}
  @Input() login!:boolean;
  
  agregar:boolean = false;
  

  form:FormGroup;

  constructor( private formBuilder: FormBuilder) 
  { 
    this.form = this.formBuilder.group(
      {
        nombre:['', Validators.required],
        dictadoPor:['',Validators.required],
        urlCertificado:[''],
        comienzo:['', Validators.required],
        finalizado:['']
      });
  }

  ngOnInit(): void {
  }

  onAgregar(){
    this.agregar = !this.agregar;
  }

  onEnviar(event: Event){
    event.preventDefault();

    let cursos:any[] = this.persona.cursos;
    
    let curso =
    {
      nombre: this.form.get('nombre')?.value,
      dictadoPor: this.form.get('dictadoPor')?.value,
      urlCertificado: this.form.get('urlCertificado')?.value,
      comienzo: this.form.get('comienzo')?.value,
      finalizado: this.form.get('finalizado')?.value
    }
    
    /*
      ACA REGISTRAMOS CURSO EN BACKEND Y VOLVEMOS EL MISCO CURSO CON ID
    */


    cursos.push(curso);

    this.persona.cursos = cursos;

    /*
      ACA CODIGO DE PERSONA A BACKEND
    */
   console.log(this.persona.cursos);
   this.form.reset();
   this.agregar = !this.agregar;

  }

}
