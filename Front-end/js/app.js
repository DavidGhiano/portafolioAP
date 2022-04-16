eventListeners();

function eventListeners(){
    document.addEventListener('DOMContentLoaded', () =>{
        $(window).scroll(function(){
            var scroll = $(window).scrollTop();
            if( scroll > 400 ){
                $('.sidebar').addClass('fixed');
                if($(window).width() > 769){
                    $('.secciones').addClass('fixed-secciones');
                }
            }else{
                $('.sidebar').removeClass('fixed');
                if($(window).width() > 769){
                    $('.secciones').removeClass('fixed-secciones');
                }
            }
        })
    });
}




