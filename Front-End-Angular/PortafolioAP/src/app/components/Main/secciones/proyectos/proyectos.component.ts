import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: []
})
export class ProyectosComponent implements OnInit {
  @Input() persona: any = {};
  constructor() { }

  ngOnInit(): void {
  }

}
