import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-proyecto-tarjeta',
  templateUrl: './proyecto-tarjeta.component.html'
})
export class ProyectoTarjetaComponent implements OnInit {
  @Input() proyecto:any = {};
  @Input() index:number = 0;
  constructor() { }

  ngOnInit(): void {
  }

}
