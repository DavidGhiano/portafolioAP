import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: []
})
export class ExperienciaComponent implements OnInit {
  @Input() persona: any = {};
  constructor() { }

  ngOnInit(): void {
  }

}
