import { Component, OnInit, Input } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ApiPortafolioService } from '../../../../services/api-portafolio.service';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: []
})


export class PerfilComponent implements OnInit {
  
  @Input() persona: any = {};
  @Input() login!:boolean;
  
  editar:boolean = false;
  form:FormGroup;

  constructor(
              private formBuilder: FormBuilder,
              private apiPortafolio: ApiPortafolioService
  ) { 
    this.form = this.formBuilder.group(
      {
        nombre:['',Validators.required],
        apellido:['',Validators.required],
        email:['',Validators.required],
        celular:['',Validators.required],
        titulo:['',Validators.required],
        urlFacebook:[''],
        urlTwitter:[''],
        urlLinkedin:[''],
        urlGithub:[''],
        urlWeb:['']
      });
  }

  ngOnInit(): void {
    
  }

  get Nombre(){
    return this.form.get('nombre');
  }
  get Apellido(){
    return this.form.get('apellido');
  }

  onEditar(event:Event)
  {
    event.preventDefault();
    this.editar = !this.editar;
    this.llenarCampo();
  }

  onEnviar(event:Event)
  {
    event.preventDefault();
    //this.apiPortafolio.guardarPersona(this.form.value).subscribe();
    this.persona.nombre = this.form.get('nombre')?.value;
    this.persona.apellido = this.form.get('apellido')?.value;
    this.persona.nombreCompleto = this.form.get('nombre')?.value + " " + this.form.get('apellido')?.value;
    this.persona.email = this.form.get('email')?.value;
    this.persona.celular = this.form.get('celular')?.value;
    this.persona.titulo = this.form.get('titulo')?.value;
    this.persona.urlFacebook = this.form.get('urlFacebook')?.value;
    this.persona.urlTwitter = this.form.get('urlTwitter')?.value;
    this.persona.urlLinkedin = this.form.get('urlLinkedin')?.value;
    this.persona.urlGithub = this.form.get('urlGithub')?.value;
    this.persona.urlWeb = this.form.get('urlWeb')?.value;
    this.editar = !this.editar;
    console.log(this.form.value);
    
  }


  llenarCampo(){
    this.form.patchValue(
      { 
        nombre: this.persona.nombre,
        apellido: this.persona.apellido,
        email: this.persona.email,
        celular: this.persona.celular,
        titulo: this.persona.titulo,
        urlFacebook: this.persona.urlFacebook,
        urlTwitter: this.persona.urlTwitter,
        urlLinkedin: this.persona.urlLinkedin,
        urlGithub: this.persona.urlGithub,
        urlWeb: this.persona.urlWeb
      });
  }
}
