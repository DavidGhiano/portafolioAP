import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-historial-academico-tarjeta',
  templateUrl: './historial-academico-tarjeta.component.html'
})
export class HistorialAcademicoTarjetaComponent implements OnInit {
  @Input() academicos:any = {};
  @Input() login!:boolean;
  
  index: number = 0;
  
  constructor() { }

  ngOnInit(): void {
  }

}
