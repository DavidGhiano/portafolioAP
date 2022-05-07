import { Component } from '@angular/core';
import { ApiPortafolioService } from './services/api-portafolio.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: []
})
export class AppComponent {
  title = 'PortafolioAP';

  persona: any = {};


  constructor(
    private apiPortafolio: ApiPortafolioService
  ) { 
    this.apiPortafolio.getPersona()
        .subscribe( ( data:any ) => 
            { 
              this.persona = data;
              console.log(data);
            }, ( errorServicio ) => 
            {
              console.log( errorServicio.message );
            }); 
  }
}
