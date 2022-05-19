import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-secciones',
  templateUrl: './secciones.component.html',
  styleUrls: []
})
export class SeccionesComponent implements OnInit {
  @Input() persona!: any;
  @Input() login!:boolean;
  @Output() personaCambio = new EventEmitter<any>();
  constructor() {
   }

  ngOnInit(): void {
    this.personaCambio.emit(this.persona);
  }

}
