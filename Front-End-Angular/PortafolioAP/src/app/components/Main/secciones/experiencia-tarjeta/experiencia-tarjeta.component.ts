import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-experiencia-tarjeta',
  templateUrl: './experiencia-tarjeta.component.html'
})
export class ExperienciaTarjetaComponent implements OnInit {
  @Input() experiencia: any = {};
  @Input() index: number = 0;
  lugar: any = {};

  constructor() 
  {
    this.lugar = this.experiencia.lugar;
  }


  ngOnInit(): void {
  }

}
