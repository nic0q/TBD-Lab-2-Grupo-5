-------------------------------------------------------
-- Crear VoluntariadoDB
-- Database: VoluntariadoDB
-------------------------------------------------------
DROP DATABASE IF EXISTS "VoluntariadoDB";
CREATE EXTENSION postgis;

CREATE DATABASE "VoluntariadoDB"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Chile.1252'
    LC_CTYPE = 'Spanish_Chile.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
    
-------------------------------------------------------
--Table "Voluntary"
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Voluntary" (
    "rut" VARCHAR(10) NOT NULL,
    "name" VARCHAR(45) NOT NULL,
    "age" INT NOT NULL,
	"avalaible" BOOLEAN NOT NULL,
    PRIMARY KEY ("rut"));

-------------------------------------------------------
--Table "ability"
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Ability" (
    "id_ability" SERIAL NOT NULL,
    "name_ability" VARCHAR(45) NOT NULL,
    "description_ability" VARCHAR(150) NOT NULL,
    PRIMARY KEY ("id_ability")
);
-------------------------------------------------------
--Table "vol_ability"
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Vol_ability" (
    "id_vol_ability" SERIAL NOT NULL,
	"voluntary_rut" VARCHAR(10),
	"id_ability" int,
    PRIMARY KEY ("id_vol_ability"),
    CONSTRAINT "fk_voluntary"
        FOREIGN KEY ("voluntary_rut")
        REFERENCES "Voluntary" ("rut")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
	CONSTRAINT "fk_ability"
        FOREIGN KEY ("id_ability")
        REFERENCES "Ability" ("id_ability")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION	
);
-------------------------------------------------------
--Table "institution"
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Institution"(
    "id_institution" SERIAL NOT NULL,
    "name" VARCHAR(50) NOT NULL,
    "name_coordinator" VARCHAR(50) NOT NULL,
    PRIMARY KEY ("id_institution")
);
-------------------------------------------------------
--Table "emergency"
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Emergency" (
    "id_emergency" SERIAL NOT NULL,
    "emergency_details" VARCHAR(500) NOT NULL,
	"id_institution" int,
	"ubication_emergency" GEOMETRY (point),
    "status" VARCHAR(20) NOT NULL,
    PRIMARY KEY ("id_emergency"),
    CONSTRAINT "fk_institution"
        FOREIGN KEY ("id_institution")
        REFERENCES "Institution" ("id_institution")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
);
-------------------------------------------------------
--Table "eme_ability"
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Eme_ability" (
    "id_eme_ability" SERIAL NOT NULL,
	"id_ability" int,
	"id_emergency" int,
    PRIMARY KEY ("id_eme_ability"),
    CONSTRAINT "fk_emergency"
        FOREIGN KEY ("id_emergency")
        REFERENCES "Emergency" ("id_emergency")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
    CONSTRAINT "fk_hability"
        FOREIGN KEY ("id_ability")
        REFERENCES "Ability" ("id_ability")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
);
-------------------------------------------------------
--Table "state_task"
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "State_task"(
    "id_state_task" SERIAL NOT NULL,
    "state" VARCHAR(20) NOT NULL,
    PRIMARY KEY ("id_state_task")
);
-------------------------------------------------------
--Table "task"
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Task"(
    "id_task" SERIAL NOT NULL,
    "name" VARCHAR(300),
	"id_emergency" int,
	"ubication_task" GEOMETRY(point),
	"id_state_task" int,
    PRIMARY KEY ("id_task"),
    CONSTRAINT "fk_emergency"
        FOREIGN KEY ("id_emergency")
        REFERENCES "Emergency" ("id_emergency")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
    CONSTRAINT "fk_state_task"
        FOREIGN KEY ("id_state_task")
        REFERENCES "State_task" ("id_state_task")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
);
-------------------------------------------------------
--Table "task_ability" -------------------------------
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Task_ability"(
    "id_task_ability" SERIAL NOT NULL,
	"id_eme_ability" int,
	"id_task" int,
    PRIMARY KEY ("id_task_ability"),
    CONSTRAINT "fk_task"
        FOREIGN KEY ("id_task")
        REFERENCES "Task" ("id_task")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
    CONSTRAINT "fk_hability"
        FOREIGN KEY ("id_eme_ability")
        REFERENCES "Eme_ability" ("id_eme_ability")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
);
-------------------------------------------------------
--Table "ranking" -------------------------------------
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "Ranking"(
    "id_ranking" SERIAL NOT NULL,
	"id_task" int,
	"rut_voluntary" VARCHAR(10) NOT NULL,
    PRIMARY KEY ("id_ranking"),
    CONSTRAINT "fk_task"
        FOREIGN KEY ("id_task")
        REFERENCES "Task" ("id_task")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
    CONSTRAINT "fk_voluntary"
        FOREIGN KEY ("rut_voluntary")
        REFERENCES "Voluntary" ("rut")
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
);

-------------------------------------------------------
--Table "log_action" ----------------------------------
-------------------------------------------------------
CREATE TABLE IF NOT EXISTS "log_action"(
    "id" SERIAL NOT NULL,
    "id_action" INT,
    "state" VARCHAR(50),
    "date_action" TIMESTAMP WITH TIME ZONE,
    PRIMARY KEY ("id")
);



-------------------------------------------------------
--Función para trigger al insertar una emergencia -----
-------------------------------------------------------

CREATE FUNCTION insert_emergency_log_action()
    RETURNS TRIGGER AS
    $$
BEGIN
INSERT INTO "log_action"(id_action, state, date_action)
VALUES (NEW.id_emergency, NEW.status, CURRENT_TIMESTAMP);

RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';

-------------------------------------------------------
--Función para trigger al actualizar una emergencia ---
-------------------------------------------------------
CREATE FUNCTION update_emergency_log_action()
    RETURNS TRIGGER AS
    $$
BEGIN
INSERT INTO "log_action"(id_action, state, date_action)
VALUES (NEW.id_emergency, NEW.status, CURRENT_TIMESTAMP);

RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';

-------------------------------------------------------
--Trigger al insertar una emergencia ------------------
-------------------------------------------------------
CREATE TRIGGER trg_insert_emergency_log_action
    AFTER INSERT ON "Emergency"
    FOR EACH ROW
    EXECUTE PROCEDURE insert_emergency_log_action();

-------------------------------------------------------
--Trigger al actualizar una emergencia ----------------
-------------------------------------------------------
CREATE TRIGGER trg_update_emergency_log_action
    AFTER UPDATE ON "Emergency"
    FOR EACH ROW
    EXECUTE PROCEDURE update_emergency_log_action();


-------------------------------------------------------
--Función para trigger al insertar una tarea ----------
-------------------------------------------------------
CREATE FUNCTION insert_task_log_action()
    RETURNS TRIGGER AS
    $$
BEGIN
INSERT INTO "log_action"(id_action, state, date_action)
VALUES (NEW.id_task, NEW.id_state_task, CURRENT_TIMESTAMP);

RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';

-------------------------------------------------------
--Función para trigger al actualizar una tarea --------
-------------------------------------------------------
CREATE FUNCTION update_task_log_action()
    RETURNS TRIGGER AS
    $$
BEGIN
INSERT INTO "log_action"(id_action, state, date_action)
VALUES (NEW.id_task, NEW.id_state_task, CURRENT_TIMESTAMP);

RETURN NEW;
END;
$$
LANGUAGE 'plpgsql';

-------------------------------------------------------
--Trigger al insertar una tarea -----------------------
-------------------------------------------------------

CREATE TRIGGER trg_insert_task_log_action
    AFTER INSERT ON "Task"
    FOR EACH ROW
    EXECUTE PROCEDURE insert_task_log_action();

-------------------------------------------------------
--Trigger al actualizar una tarea ---------------------
-------------------------------------------------------

CREATE TRIGGER trg_update_task_log_action
    AFTER UPDATE ON "Task"
    FOR EACH ROW
    EXECUTE PROCEDURE update_task_log_action();