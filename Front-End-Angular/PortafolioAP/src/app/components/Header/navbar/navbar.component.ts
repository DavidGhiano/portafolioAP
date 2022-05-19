import { Component, Input, Output, EventEmitter, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: []
})
export class NavbarComponent implements OnInit{
  @Input() persona!: any;
  @Output() personaCambio = new EventEmitter<any>();
  constructor() { }

  ngOnInit(): void {
    this.personaCambio.emit(this.persona);
  }
  
}
