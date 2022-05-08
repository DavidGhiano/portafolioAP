import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-hard-skills-tarjeta',
  templateUrl: './hard-skills-tarjeta.component.html'
})
export class HardSkillsTarjetaComponent implements OnInit {
  @Input() skill: any = {};
  @Input() index:number = 0;

  porcentaje: number = 0;
  porcentajeStyle: string = "";
  
  constructor() {
    this.porcentaje = ((this.skill.porcentaje * 100) / 180);
    this.porcentajeStyle = `rotate(${this.porcentaje}deg)`; 
  }

  ngOnInit(): void {
  }

}
