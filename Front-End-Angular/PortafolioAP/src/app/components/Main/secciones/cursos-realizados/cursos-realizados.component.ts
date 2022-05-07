import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-cursos-realizados',
  templateUrl: './cursos-realizados.component.html',
  styleUrls: []
})
export class CursosRealizadosComponent implements OnInit {
  @Input() persona: any = {}
  constructor() { }

  ngOnInit(): void {
  }

}
