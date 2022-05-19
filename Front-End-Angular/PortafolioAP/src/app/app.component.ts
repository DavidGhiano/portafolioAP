import { Component, Input, Output, EventEmitter } from '@angular/core';
import { ApiPortafolioService } from './services/api-portafolio.service';
import { Title } from '@angular/platform-browser'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  providers: [ApiPortafolioService]
})
export class AppComponent {
  @Input() persona: any = {};
  @Output() personaCambio = new EventEmitter<any>();
  nombre:string ="";

  login:boolean = true;

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

  ngOnInit(){
    this.personaCambio.emit(this.persona);
  }
}
