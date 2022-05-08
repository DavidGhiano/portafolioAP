import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { BannerComponent } from './components/Header/banner/banner.component';
import { NavbarComponent } from './components/Header/navbar/navbar.component';
import { SidebarComponent } from './components/Main/sidebar/sidebar.component';
import { SeccionesComponent } from './components/Main/secciones/secciones.component';
import { PerfilComponent } from './components/Main/secciones/perfil/perfil.component';
import { AcercaDeComponent } from './components/Main/secciones/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './components/Main/secciones/experiencia/experiencia.component';
import { HistorialAcademicoComponent } from './components/Main/secciones/historial-academico/historial-academico.component';
import { CursosRealizadosComponent } from './components/Main/secciones/cursos-realizados/cursos-realizados.component';
import { HardSkillsComponent } from './components/Main/secciones/hard-skills/hard-skills.component';
import { SoftSkillsComponent } from './components/Main/secciones/soft-skills/soft-skills.component';
import { ProyectosComponent } from './components/Main/secciones/proyectos/proyectos.component';
import { ExperienciaTarjetaComponent } from './components/Main/secciones/experiencia-tarjeta/experiencia-tarjeta.component';
import { HistorialAcademicoTarjetaComponent } from './components/Main/secciones/historial-academico-tarjeta/historial-academico-tarjeta.component';
import { CursosRealizadosTarjetaComponent } from './components/Main/secciones/cursos-realizados-tarjeta/cursos-realizados-tarjeta.component';
import { HardSkillsTarjetaComponent } from './components/Main/secciones/hard-skills-tarjeta/hard-skills-tarjeta.component';
import { SoftSkillsTarjetaComponent } from './components/Main/secciones/soft-skills-tarjeta/soft-skills-tarjeta.component';
import { ProyectoTarjetaComponent } from './components/Main/secciones/proyecto-tarjeta/proyecto-tarjeta.component';
import { NoimagePipe } from './pipes/noimage.pipe';

@NgModule({
  declarations: [
    AppComponent,
    BannerComponent,
    NavbarComponent,
    SidebarComponent,
    SeccionesComponent,
    PerfilComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    HistorialAcademicoComponent,
    CursosRealizadosComponent,
    HardSkillsComponent,
    SoftSkillsComponent,
    ProyectosComponent,
    ExperienciaTarjetaComponent,
    HistorialAcademicoTarjetaComponent,
    CursosRealizadosTarjetaComponent,
    HardSkillsTarjetaComponent,
    SoftSkillsTarjetaComponent,
    ProyectoTarjetaComponent,
    NoimagePipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
