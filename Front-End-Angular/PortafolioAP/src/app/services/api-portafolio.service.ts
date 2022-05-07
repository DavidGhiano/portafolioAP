import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiPortafolioService {

  constructor(
    private http: HttpClient
  ) { }

  public getPersona(){
    const URL = `http://localhost:8080/portafolio/personas/traer/1`;
    return this.http.get( URL );
  }
}
