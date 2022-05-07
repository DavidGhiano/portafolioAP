import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: []
})
export class PerfilComponent implements OnInit {
  @Input() persona: any = {};

  constructor() { }

  ngOnInit(): void {
  }

}
