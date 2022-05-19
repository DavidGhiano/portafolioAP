import { Pipe, PipeTransform } from '@angular/core';
import { DomSanitizer  } from '@angular/platform-browser';

@Pipe({
  name: 'domseguro'
})
export class DomseguroPipe implements PipeTransform {

  constructor( private domSanitizer:DomSanitizer ){ }

  transform( value: string): any {
    const url = 'C:/Users/dg260/Desktop/';
    return this.domSanitizer.bypassSecurityTrustResourceUrl( url + value );
  }

}
