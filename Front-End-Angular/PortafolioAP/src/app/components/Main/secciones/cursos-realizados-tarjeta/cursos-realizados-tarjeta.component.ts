import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-cursos-realizados-tarjeta',
  templateUrl: './cursos-realizados-tarjeta.component.html'
})
export class CursosRealizadosTarjetaComponent implements OnInit {
  @Input() cursos:any = {};
  @Input() login!:boolean;
  
  constructor() { }

  ngOnInit(): void {
  }

}
