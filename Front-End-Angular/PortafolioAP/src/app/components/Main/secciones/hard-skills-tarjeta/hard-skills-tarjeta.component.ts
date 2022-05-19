import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-hard-skills-tarjeta',
  templateUrl: './hard-skills-tarjeta.component.html'
})
export class HardSkillsTarjetaComponent implements OnInit {
  @Input() skill: any = {};
  @Input() index:number = 0;

  porcentaje: number = Math.round((this.skill.porcentaje * 180) / 100);
  porcentajeStyle: string = `rotate(${this.porcentaje}deg)`;
  
  constructor() {
  }
  
  ngOnInit(): void {
    this.porcentaje = Math.round((this.skill.porcentaje * 180) / 100);
    this.porcentajeStyle = `rotate(${this.porcentaje}deg)`; 
  }

}
