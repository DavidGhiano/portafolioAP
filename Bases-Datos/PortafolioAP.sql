-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema PortafolioAP
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema PortafolioAP
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `PortafolioAP` DEFAULT CHARACTER SET utf8 ;
USE `PortafolioAP` ;

-- -----------------------------------------------------
-- Table `PortafolioAP`.`Lugar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Lugar` (
  `idLugar` INT NOT NULL AUTO_INCREMENT,
  `ciudad` VARCHAR(45) NOT NULL,
  `provincia` VARCHAR(45) NOT NULL,
  `pais` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idLugar`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortafolioAP`.`Persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Persona` (
  `idPersona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `celular` VARCHAR(45) NOT NULL,
  `url_foto` VARCHAR(45) NOT NULL,
  `url_portada` VARCHAR(45) NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  `url_facebook` VARCHAR(45) NULL,
  `url_twitter` VARCHAR(45) NULL,
  `url_web` VARCHAR(45) NULL,
  `url_linkedin` VARCHAR(45) NULL,
  `url_instagram` VARCHAR(45) NULL,
  `url_github` VARCHAR(45) NULL,
  `idLugar` INT NOT NULL,
  PRIMARY KEY (`idPersona`, `idLugar`),
  INDEX `fk_Persona_Lugar1_idx` (`idLugar` ASC) VISIBLE,
  CONSTRAINT `fk_Persona_Lugar1`
    FOREIGN KEY (`idLugar`)
    REFERENCES `PortafolioAP`.`Lugar` (`idLugar`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortafolioAP`.`Experiencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Experiencia` (
  `idExperiencia` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `posicion` VARCHAR(45) NOT NULL,
  `jornada` VARCHAR(45) NOT NULL,
  `comienzo` DATE NOT NULL,
  `finalizacion` DATE NULL,
  `idPersona` INT NOT NULL,
  `idLugar` INT NOT NULL,
  PRIMARY KEY (`idExperiencia`, `idPersona`, `idLugar`),
  INDEX `fk_Experiencia_Persona1_idx` (`idPersona` ASC) VISIBLE,
  INDEX `fk_Experiencia_Lugar1_idx` (`idLugar` ASC) VISIBLE,
  CONSTRAINT `fk_Experiencia_Persona1`
    FOREIGN KEY (`idPersona`)
    REFERENCES `PortafolioAP`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Experiencia_Lugar1`
    FOREIGN KEY (`idLugar`)
    REFERENCES `PortafolioAP`.`Lugar` (`idLugar`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortafolioAP`.`Actividad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Actividad` (
  `idActividad` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(150) NOT NULL,
  `idExperiencia` INT NOT NULL,
  PRIMARY KEY (`idActividad`, `idExperiencia`),
  INDEX `fk_Actividad_Experiencia_idx` (`idExperiencia` ASC) VISIBLE,
  CONSTRAINT `fk_Actividad_Experiencia`
    FOREIGN KEY (`idExperiencia`)
    REFERENCES `PortafolioAP`.`Experiencia` (`idExperiencia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortafolioAP`.`Academico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Academico` (
  `idAcademico` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  `comienzo` DATE NOT NULL,
  `finalizacion` DATE NULL,
  `url_carrera` VARCHAR(45) NULL,
  `estado` VARCHAR(45) NULL,
  `idLugar` INT NOT NULL,
  `idPersona` INT NOT NULL,
  PRIMARY KEY (`idAcademico`, `idLugar`, `idPersona`),
  INDEX `fk_Academico_Lugar1_idx` (`idLugar` ASC) VISIBLE,
  INDEX `fk_Academico_Persona1_idx` (`idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Academico_Lugar1`
    FOREIGN KEY (`idLugar`)
    REFERENCES `PortafolioAP`.`Lugar` (`idLugar`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Academico_Persona1`
    FOREIGN KEY (`idPersona`)
    REFERENCES `PortafolioAP`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortafolioAP`.`Cursos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Cursos` (
  `idCursos` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `dictado` VARCHAR(45) NOT NULL,
  `comienzo` DATE NOT NULL,
  `finalizacion` DATE NULL,
  `url_certificado` VARCHAR(45) NULL,
  `idPersona` INT NOT NULL,
  PRIMARY KEY (`idCursos`, `idPersona`),
  INDEX `fk_Cursos_Persona1_idx` (`idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Cursos_Persona1`
    FOREIGN KEY (`idPersona`)
    REFERENCES `PortafolioAP`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortafolioAP`.`Skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Skills` (
  `idSkills` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `tipo` ENUM('hard', 'soft') NOT NULL,
  `porcentaje` INT NOT NULL,
  `url_img` VARCHAR(45) NOT NULL,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idSkills`, `Persona_idPersona`),
  INDEX `fk_Skills_Persona1_idx` (`Persona_idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Skills_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `PortafolioAP`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortafolioAP`.`Proyectos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Proyectos` (
  `idProyectos` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `url` VARCHAR(45) NOT NULL,
  `descripcion` VARCHAR(90) NULL,
  `idPersona` INT NOT NULL,
  PRIMARY KEY (`idProyectos`, `idPersona`),
  INDEX `fk_Proyectos_Persona1_idx` (`idPersona` ASC) VISIBLE,
  CONSTRAINT `fk_Proyectos_Persona1`
    FOREIGN KEY (`idPersona`)
    REFERENCES `PortafolioAP`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortafolioAP`.`Tecnologia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Tecnologia` (
  `idTecnologia` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTecnologia`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortafolioAP`.`Proyectos_has_Tecnologia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortafolioAP`.`Proyectos_has_Tecnologia` (
  `Proyectos_idProyectos` INT NOT NULL,
  `Tecnologia_idTecnologia` INT NOT NULL,
  PRIMARY KEY (`Proyectos_idProyectos`, `Tecnologia_idTecnologia`),
  INDEX `fk_Proyectos_has_Tecnologia_Tecnologia1_idx` (`Tecnologia_idTecnologia` ASC) VISIBLE,
  INDEX `fk_Proyectos_has_Tecnologia_Proyectos1_idx` (`Proyectos_idProyectos` ASC) VISIBLE,
  CONSTRAINT `fk_Proyectos_has_Tecnologia_Proyectos1`
    FOREIGN KEY (`Proyectos_idProyectos`)
    REFERENCES `PortafolioAP`.`Proyectos` (`idProyectos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Proyectos_has_Tecnologia_Tecnologia1`
    FOREIGN KEY (`Tecnologia_idTecnologia`)
    REFERENCES `PortafolioAP`.`Tecnologia` (`idTecnologia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
