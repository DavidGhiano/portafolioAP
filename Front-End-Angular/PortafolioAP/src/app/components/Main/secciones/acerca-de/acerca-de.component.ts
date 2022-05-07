import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-acercade',
  templateUrl: './acerca-de.component.html',
  styleUrls: []
})
export class AcercaDeComponent implements OnInit {
  @Input() persona: any = {}
  constructor() { }

  ngOnInit(): void {
  }

}
