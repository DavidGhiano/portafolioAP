import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-soft-skills',
  templateUrl: './soft-skills.component.html',
  styleUrls: []
})
export class SoftSkillsComponent implements OnInit {
  @Input() persona: any = {};
  @Input() login!:boolean;
  
  agregar:boolean = false;

  constructor() {}

  ngOnInit(): void {
  }

  onAgregar(){
    this.agregar=!this.agregar;
  }
}
