import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-historial-academico',
  templateUrl: './historial-academico.component.html',
  styleUrls: []
})
export class HistorialAcademicoComponent implements OnInit {
  @Input() persona: any = {};
  @Input() login!:boolean;
  
  constructor() { }

  ngOnInit(): void {
  }

}
