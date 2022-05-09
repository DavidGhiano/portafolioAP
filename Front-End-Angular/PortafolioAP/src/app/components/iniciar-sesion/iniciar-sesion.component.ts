import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AutenticacionService } from '../../services/autenticacion.service';

@Component({
  selector: 'app-iniciar-sesion',
  templateUrl: './iniciar-sesion.component.html'
})
export class IniciarSesionComponent implements OnInit {
  form:FormGroup;
  constructor(
              private formBuilder:FormBuilder,
              private auth:AutenticacionService
  ) 
  { 
    this.form = this.formBuilder.group(
      {
         email:['',[Validators.required, Validators.email]],
         password:['',[Validators.required, Validators.minLength(8)]]
      }
    );
  }

  ngOnInit(): void {
  }

  get Email()
  {
    return this.form.get('email');
  }

  get Password()
  {
    return this.form.get('password');
  }

  onEnviar(event:Event)
  {
    event.preventDefault();
    this.auth.IniciarSesion(this.form.value).subscribe( data =>
      {
        console.log("Data: " + JSON.stringify(data));
        
      });
  }
}
