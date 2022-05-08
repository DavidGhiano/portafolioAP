import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiPortafolioService {

  url:string ="http://localhost:8080";

  constructor(
    private http: HttpClient
  ) { }

  public getPersona(){
    const URL = `${ this.url }/portafolio/personas/traer/1`;
    return this.http.get( URL );
  }

  public getSoloNombre(){
    const URL = `${ this.url }/portafolio/personas/traer/1/nombreapellido`;
    return this.http.get( URL );
  }
}
