import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-experiencia-tarjeta',
  templateUrl: './experiencia-tarjeta.component.html',
  styles: [`
    ul{
      list-style-type: square;
    }
    li{
      margin: 0 0;
    }
  `]
})
export class ExperienciaTarjetaComponent implements OnInit {
  @Input() experiencias: any = {};
  @Input() index: number = 0;
  @Input() login!:boolean;
  lugar: any = {};

  constructor() 
  {
    this.lugar = this.experiencias.lugar;
  }


  ngOnInit(): void {
  }

}
