-- MySQL Script generated by MySQL Workbench
-- Thu Oct  3 16:51:15 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema computer
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema computer
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `computer` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `computer` ;

-- -----------------------------------------------------
-- Table `computer`.`Warranty`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Warranty` ;

CREATE TABLE IF NOT EXISTS `computer`.`Warranty` (
  `warranty_id` INT NOT NULL AUTO_INCREMENT,
  `warranty_duration` INT NULL,
  `start_date` DATE NULL,
  PRIMARY KEY (`warranty_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`Device`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Device` ;

CREATE TABLE IF NOT EXISTS `computer`.`Device` (
  `device_id` INT NOT NULL AUTO_INCREMENT,
  `brand` VARCHAR(45) NULL,
  `model` VARCHAR(45) NULL,
  `Warranty_warranty_id` INT NOT NULL,
  PRIMARY KEY (`device_id`, `Warranty_warranty_id`),
  INDEX `fk_Device_Warranty_idx` (`Warranty_warranty_id` ASC) VISIBLE,
  CONSTRAINT `fk_Device_Warranty`
    FOREIGN KEY (`Warranty_warranty_id`)
    REFERENCES `computer`.`Warranty` (`warranty_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`GPU`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`GPU` ;

CREATE TABLE IF NOT EXISTS `computer`.`GPU` (
  `gpu_id` INT NOT NULL AUTO_INCREMENT,
  `gpu_memory` VARCHAR(45) NULL,
  `memory` INT NULL,
  PRIMARY KEY (`gpu_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`CPU`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`CPU` ;

CREATE TABLE IF NOT EXISTS `computer`.`CPU` (
  `cpu_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `cores` INT NULL,
  PRIMARY KEY (`cpu_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`Computer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Computer` ;

CREATE TABLE IF NOT EXISTS `computer`.`Computer` (
  `computer_id` INT NOT NULL AUTO_INCREMENT,
  `GPU_gpu_id` INT NULL,
  `temperature` DOUBLE NULL,
  `CPU_cpu_id` INT NULL,
  `Device_Warranty_warranty_id` INT NOT NULL,
  `Device_device_id` INT NOT NULL,
  `Device_Warranty_warranty_id1` INT NOT NULL,
  INDEX `fk_Computer_GPU1_idx` (`GPU_gpu_id` ASC) VISIBLE,
  INDEX `fk_Computer_CPU1_idx` (`CPU_cpu_id` ASC) VISIBLE,
  PRIMARY KEY (`computer_id`),
  INDEX `fk_Computer_Device1_idx` (`Device_device_id` ASC, `Device_Warranty_warranty_id1` ASC) VISIBLE,
  CONSTRAINT `fk_Computer_GPU1`
    FOREIGN KEY (`GPU_gpu_id`)
    REFERENCES `computer`.`GPU` (`gpu_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Computer_CPU1`
    FOREIGN KEY (`CPU_cpu_id`)
    REFERENCES `computer`.`CPU` (`cpu_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Computer_Device1`
    FOREIGN KEY (`Device_device_id` , `Device_Warranty_warranty_id1`)
    REFERENCES `computer`.`Device` (`device_id` , `Warranty_warranty_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`Laptop`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Laptop` ;

CREATE TABLE IF NOT EXISTS `computer`.`Laptop` (
  `laptop_id` INT NOT NULL AUTO_INCREMENT,
  `screen_size` DOUBLE NULL,
  `screen_type` VARCHAR(45) NULL,
  `battery_level` INT NULL,
  `Laptopcol` VARCHAR(45) NULL,
  `Computer_computer_id` INT NOT NULL,
  PRIMARY KEY (`laptop_id`),
  INDEX `fk_Laptop_Computer1_idx` (`Computer_computer_id` ASC) VISIBLE,
  CONSTRAINT `fk_Laptop_Computer1`
    FOREIGN KEY (`Computer_computer_id`)
    REFERENCES `computer`.`Computer` (`computer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`Desktop`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Desktop` ;

CREATE TABLE IF NOT EXISTS `computer`.`Desktop` (
  `size` VARCHAR(45) NULL,
  `desktop_id` INT NOT NULL,
  `Computer_Device_Warranty_warranty_id` INT NOT NULL,
  `Computer_computer_id` INT NOT NULL,
  PRIMARY KEY (`desktop_id`, `Computer_Device_Warranty_warranty_id`, `Computer_computer_id`),
  INDEX `fk_Desktop_Computer1_idx` (`Computer_computer_id` ASC) VISIBLE,
  CONSTRAINT `fk_Desktop_Computer1`
    FOREIGN KEY (`Computer_computer_id`)
    REFERENCES `computer`.`Computer` (`computer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`Components`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Components` ;

CREATE TABLE IF NOT EXISTS `computer`.`Components` (
  `computer_id` INT NOT NULL AUTO_INCREMENT,
  `component_name` VARCHAR(45) NULL,
  PRIMARY KEY (`computer_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`Computer_has_Components`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Computer_has_Components` ;

CREATE TABLE IF NOT EXISTS `computer`.`Computer_has_Components` (
  `Computer_computer_id` INT NOT NULL,
  `Computer_Device_Warranty_warranty_id` INT NOT NULL,
  `Components_computer_id` INT NOT NULL,
  PRIMARY KEY (`Computer_computer_id`, `Computer_Device_Warranty_warranty_id`, `Components_computer_id`),
  INDEX `fk_Computer_has_Components_Components1_idx` (`Components_computer_id` ASC) VISIBLE,
  INDEX `fk_Computer_has_Components_Computer1_idx` (`Computer_computer_id` ASC, `Computer_Device_Warranty_warranty_id` ASC) VISIBLE,
  CONSTRAINT `fk_Computer_has_Components_Computer1`
    FOREIGN KEY (`Computer_computer_id` , `Computer_Device_Warranty_warranty_id`)
    REFERENCES `computer`.`Computer` (`computer_id` , `Device_Warranty_warranty_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Computer_has_Components_Components1`
    FOREIGN KEY (`Components_computer_id`)
    REFERENCES `computer`.`Components` (`computer_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`Network`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Network` ;

CREATE TABLE IF NOT EXISTS `computer`.`Network` (
  `network_id` INT NOT NULL AUTO_INCREMENT,
  `network_name` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`network_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`Server`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Server` ;

CREATE TABLE IF NOT EXISTS `computer`.`Server` (
  `server_id` INT NOT NULL,
  `numer_of_cpus` INT NULL,
  `Desktop_Computer_Device_Warranty_warranty_id` INT NOT NULL,
  `Desktop_desktop_id` INT NOT NULL,
  `Desktop_Computer_Device_Warranty_warranty_id1` INT NOT NULL,
  PRIMARY KEY (`server_id`, `Desktop_Computer_Device_Warranty_warranty_id`),
  INDEX `fk_Server_Desktop1_idx` (`Desktop_desktop_id` ASC, `Desktop_Computer_Device_Warranty_warranty_id1` ASC) VISIBLE,
  CONSTRAINT `fk_Server_Desktop1`
    FOREIGN KEY (`Desktop_desktop_id` , `Desktop_Computer_Device_Warranty_warranty_id1`)
    REFERENCES `computer`.`Desktop` (`desktop_id` , `Computer_Device_Warranty_warranty_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `computer`.`Server_IPs`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `computer`.`Server_IPs` ;

CREATE TABLE IF NOT EXISTS `computer`.`Server_IPs` (
  `Server_server_id` INT NOT NULL,
  `ip_address` VARCHAR(45) NULL,
  `Server_Desktop_Computer_Device_Warranty_warranty_id` INT NOT NULL,
  PRIMARY KEY (`Server_server_id`, `Server_Desktop_Computer_Device_Warranty_warranty_id`),
  CONSTRAINT `fk_Server_IPs_Server1`
    FOREIGN KEY (`Server_server_id` , `Server_Desktop_Computer_Device_Warranty_warranty_id`)
    REFERENCES `computer`.`Server` (`server_id` , `Desktop_Computer_Device_Warranty_warranty_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
