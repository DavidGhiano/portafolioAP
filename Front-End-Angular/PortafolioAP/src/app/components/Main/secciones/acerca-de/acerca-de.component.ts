import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-acercade',
  templateUrl: './acerca-de.component.html',
  styleUrls: []
})
export class AcercaDeComponent implements OnInit {
  @Input() persona: any = {}
  @Input() login!:boolean;
  editar:boolean = false;
  form:FormGroup;

  constructor(private formBuilder: FormBuilder) 
  { 
    this.form = this.formBuilder.group({
      descripction:['', Validators.required]
    });
  }

  ngOnInit(): void {
  }

  get Descriccion(){
    return this.form.get('descripction');
  }

  onEditar(event: Event): void {
    this.editar = !this.editar;
    this.form.patchValue(
      {
        descripction:this.persona.descripction
      })
  }

  onEnviar(event: Event){
    event.preventDefault();

    this.editar = !this.editar;

    this.persona.descripction = this.form.get('descripction')?.value;
  }

}
