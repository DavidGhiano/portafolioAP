import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-hard-skills',
  templateUrl: './hard-skills.component.html',
  styleUrls: []
})
export class HardSkillsComponent implements OnInit {
  @Input() persona: any = {};
  @Input() login!:boolean;

  agregar:boolean = false;
  
  constructor() { }

  ngOnInit(): void {
  }

  onAgregar()
  {
    this.agregar = !this.agregar
  }

}
