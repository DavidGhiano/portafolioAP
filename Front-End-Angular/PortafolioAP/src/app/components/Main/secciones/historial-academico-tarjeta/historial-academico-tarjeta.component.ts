import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-historial-academico-tarjeta',
  templateUrl: './historial-academico-tarjeta.component.html'
})
export class HistorialAcademicoTarjetaComponent implements OnInit {
  @Input() academico:any = {};
  @Input() index: number = 0;
  constructor() { }

  ngOnInit(): void {
  }

}