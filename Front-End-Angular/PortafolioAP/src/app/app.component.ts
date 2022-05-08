import { Component, Input } from '@angular/core';
import { ApiPortafolioService } from './services/api-portafolio.service';
import { Title } from '@angular/platform-browser'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: []
})
export class AppComponent {
  persona: any = {};
  nombre:string ="";

  constructor(
    private apiPortafolio: ApiPortafolioService,
    private title: Title
  ) { 
    this.apiPortafolio.getPersona()
        .subscribe( ( data:any ) => 
        { 
          this.persona = data;
          this.title.setTitle("PortafolioAP | " + data.nombreCompleto)
          console.log( data );
        }, ( errorServicio ) => 
        {
          console.log( errorServicio.message );
        });
    
  }
}
