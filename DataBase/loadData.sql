-------------------------------------------------------
-- Datos Dummy
-------------------------------------------------------
-------------------------------------------------------
-- 1. Voluntary (20)
-------------------------------------------------------

INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('1-9', 'Juan Perez', 20, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('2-9', 'Pedro Gomez', 25, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('3-9', 'Maria Lopez', 30, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('4-9', 'Alberto Ron', 35, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('5-9', 'Carlos Silva', 40, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('6-9', 'Maria Jose', 45, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('7-9', 'Josefina Pinto', 50, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('8-9', 'Vicente Segundo', 55, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('9-9', 'Mario Gariglio', 60, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('10-9', 'Juan Pinto', 65, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('11-9', 'Fabian Astorga', 70, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('12-9', 'Javiera Cortez', 25, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('13-9', 'Juan Moya', 30, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('14-9', 'Pedro Pinto', 35, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('15-9', 'Maria Silva', 40, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('16-9', 'Josefina Lopez', 45, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('17-9', 'Vicente Gomez', 50, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('18-9', 'Mario Perez', 55, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('19-9', 'Juan Ron', 60, true);
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('20-9', 'Fabian Segundo', 65, true);


-------------------------------------------------------
-- 2. Ability (20)
-------------------------------------------------------

INSERT INTO "Ability" (name_ability, description_ability) VALUES ('resistencia', 'se requiere resistencia para escalar');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('rescate', 'se requiere rescatar para asistir a personas');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('natacion', 'se requiere nadar para asistir lugares marinos o fluviales');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('cocinar', 'se requiere cocinar para alimentar a personas');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('conducir', 'se requiere conducir para trasladar personas');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('manejo de maquinaria', 'se requiere manejar maquinaria para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('fuerza', 'se requiere fuerza para levantar objetos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('velocidad', 'se requiere velocidad para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('comprension', 'se requiere comprension para hablar con personas afectadas');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('agilidad', 'se requiere agilidad para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('habilidad', 'se requiere habilidad para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('inteligencia', 'se requiere inteligencia para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('destreza', 'se requiere destreza para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('paciencia', 'se requiere paciencia para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('trabajo en equipo', 'se requiere trabajo en equipo para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('liderazgo', 'se requiere liderazgo para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('responsabilidad', 'se requiere responsabilidad para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('programacion', 'se requiere programacion para realizar trabajos');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('medico', 'se requiere ser medico para atender personas');
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('psicologo', 'se requiere ser psicologo para atender personas');


-------------------------------------------------------
-- 3. vol_ability (20)
-------------------------------------------------------

INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('1-9', 1);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('2-9', 2);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('3-9', 3);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('4-9', 4);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('5-9', 5);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('6-9', 6);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('7-9', 7);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('8-9', 8);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('9-9', 9);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('10-9', 10);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('11-9', 11);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('12-9', 12);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('13-9', 13);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('14-9', 14);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('15-9', 15);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('16-9', 16);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('17-9', 17);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('18-9', 18);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('19-9', 19);
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('20-9', 20);

-------------------------------------------------------
-- 4. Institution (12)
-------------------------------------------------------

INSERT INTO "Institution" (name, name_coordinator) VALUES ('Hospital', 'Banana');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Escuela', 'Vixo');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Casa hogar', 'John');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Marina Armada', 'Vene');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Policia', 'Forkfan');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Bomberos', 'Xavi');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Carabineros', 'Miguel');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Cruz Roja', 'Constanza');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Fuerza Aerea', 'Gaspar');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Clinica', 'Cristian');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('Municipalidad', 'Jorge');
INSERT INTO "Institution" (name, name_coordinator) VALUES ('ONG', 'Pablo');


-------------------------------------------------------
-- 5. Emergency (10)
-------------------------------------------------------

INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Terremoto', '1', 'Creado');
INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Incendio', '2', 'Creado');
INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Inundacion', '3', 'Creado');
INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Huracan', '4', 'Creado');
INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Tsunami', '5', 'Creado');
INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Gato en Arbol', '6', 'Creado');
INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Derrumbe', '7', 'Creado');
INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Accidente automovilistico', '8', 'Creado');
INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Murallas vandalisadas', '9', 'Creado');
INSERT INTO "Emergency" (emergency_details, id_institution, status) VALUES ('Gente atrapada', '10', 'Creado');

-------------------------------------------------------
-- 6. eme_ability (20)
-------------------------------------------------------

INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (1, 1);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (2, 2);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (3, 3);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (4, 4);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (5, 5);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (6, 1);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (7, 2);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (8, 3);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (9, 4);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (10, 5);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (11, 6);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (12, 7);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (13, 8);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (14, 9);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (15, 10);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (16, 6);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (17, 7);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (18, 8);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (19, 9);
INSERT INTO "Eme_ability" (id_ability, id_emergency) VALUES (20, 10);

-------------------------------------------------------
-- 7. State_task (3)
-------------------------------------------------------

INSERT INTO "State_task" (state) VALUES ('Creado');
INSERT INTO "State_task" (state) VALUES ('Iniciado');
INSERT INTO "State_task" (state) VALUES ('Finalizado');


-------------------------------------------------------
-- 8. Task (10)
-------------------------------------------------------

INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Limpiar escombros', '1', '1');
INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Rescatar afectados', '2', '1');
INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Asistir gente que no sabe nadar', '3', '1');
INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Alimentar a personas', '4', '1');
INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Trasladar personas', '5', '1');
INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Curar heridos', '6', '1');
INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Buscar personas', '7', '1');
INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Reparar carreteras', '8', '1');
INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Pintar muros', '9', '1');
INSERT INTO "Task" (description, id_emergency, id_state_task) VALUES ('Asistencia psicologica', '10', '1');

-------------------------------------------------------
-- 9. Task_ability (10)
-------------------------------------------------------

INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (1, 1);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (2, 2);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (3, 3);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (4, 4);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (5, 5);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (6, 6);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (7, 7);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (8, 8);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (9, 9);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (10, 10);


-------------------------------------------------------
-- 10. ranking (10)
-------------------------------------------------------

INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('1', '1-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('2', '2-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('3', '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('4', '4-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('5', '5-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('6', '6-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('7', '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('8', '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('9', '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES ('10', '10-9');
