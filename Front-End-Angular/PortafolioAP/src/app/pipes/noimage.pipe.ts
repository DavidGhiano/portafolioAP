import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'noimage'
})
export class NoimagePipe implements PipeTransform {

  transform( imagen: string ): string {
    if( imagen == null || imagen=='' ){
      return 'assets/img/noimage.png'
    }else{
      return imagen;
    }
  }

}
