import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BannerComponent } from './components/Header/banner/banner.component';
import { NavbarComponent } from './components/Header/navbar/navbar.component';
import { SidebarComponent } from './components/Main/sidebar/sidebar.component';
import { SeccionesComponent } from './components/Main/secciones/secciones.component';
import { PerfilComponent } from './components/Main/secciones/perfil/perfil.component';
import { AcercaDeComponent } from './components/Main/Secciones/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './components/Main/Secciones/experiencia/experiencia.component';
import { HistorialAcademicoComponent } from './components/Main/Secciones/historial-academico/historial-academico.component';
import { CursosRealizadosComponent } from './components/Main/Secciones/cursos-realizados/cursos-realizados.component';
import { HardSkillsComponent } from './components/Main/Secciones/hard-skills/hard-skills.component';
import { SoftSkillsComponent } from './components/Main/Secciones/soft-skills/soft-skills.component';
import { ProyectosComponent } from './components/Main/Secciones/proyectos/proyectos.component';

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
    ProyectosComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
