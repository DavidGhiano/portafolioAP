import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiPortafolioService {

  url:string ="http://localhost:8080";
  body:any = {};

  constructor(
    private http: HttpClient
  ) { }

  public getPersona(): Observable<any> {
    const URL = `/portafolio/personas/traer/1`;
    return this.http.get<any>( URL );
  }

  public getSoloNombre(){
    const URL = `/portafolio/personas/traer/1/nombreapellido`;
    return this.http.get( URL );
  }

  public guardarPersona(persona:any): Observable<any>{
    const URL = `/portafolio/personas/editar/1`;
    this.body = { 
      "nombre": persona.nombre,
      "apellido": persona.apellido,
      "email": persona.email,
      "celular": persona.celular,
      "titulo": persona.titulo,
      "urlFacebook": persona.urlFacebook,
      "urlTwitter": persona.urlTwitter,
      "urlLinkedin": persona.urlLinkedin,
      "urlGithub": persona.urlGithub,
      "urlWeb": persona.urlWeb
    }

    console.log( this.body );
    return this.http.put<any>( URL, persona );
  }
}
