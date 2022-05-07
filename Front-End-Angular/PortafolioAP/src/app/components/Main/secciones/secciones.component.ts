import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-secciones',
  templateUrl: './secciones.component.html',
  styleUrls: []
})
export class SeccionesComponent implements OnInit {
  @Input() persona: any = {};

  constructor() { }

  ngOnInit(): void {
  }

}
