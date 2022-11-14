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
INSERT INTO "Voluntary" (rut, name, age, avalaible) VALUES ('0-0', 'Mister Musculo', 100, true);

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
INSERT INTO "Ability" (name_ability, description_ability) VALUES ('ability1', 'descripcion ability1');


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
INSERT INTO "Vol_ability" (voluntary_rut, id_ability) VALUES ('0-0', 21);

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

INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Terremoto', 1, ST_GeomFromText('POINT(-70.650844 -33.43787)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Incendio', 2, ST_GeomFromText('POINT(-70.660551 -33.46137)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Inundacion', 3, ST_GeomFromText('POINT(-72.953223 -41.479667)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Fuga de gas', 1, ST_GeomFromText('POINT(-70.387151 -23.709667)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Invasion Alienigena', 4, ST_GeomFromText('POINT(-70.702027 -33.496740)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Tsunami', 5, ST_GeomFromText('POINT(-70.397190 -23.638113)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Gato en Arbol', 6, ST_GeomFromText('POINT(-70.735232 -33.426330)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Derrumbe', 7, ST_GeomFromText('POINT(-70.610955 -33.46384)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Accidente automovilistico', 8, ST_GeomFromText('POINT(-70.394970 -23.653598)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Murallas vandalizadas', 9, ST_GeomFromText('POINT(-70.40099 -23.664877)' , 4326 ), 'Activo');
INSERT INTO "Emergency" (name, id_institution, ubication_emergency, status) VALUES ('Gente atrapada', 10, ST_GeomFromText('POINT(-72.931732 -41.468872)' , 4326 ), 'Activo');


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
INSERT INTO "State_task" (state) VALUES ('Activo');
INSERT INTO "State_task" (state) VALUES ('Finalizado');


-------------------------------------------------------
-- 8. Task (10)
-------------------------------------------------------

INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Limpiar escombros', 1, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaTerremoto1', 1, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaTerremoto2', 1, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaTerremoto3', 1, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaTerremoto4', 1, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Rescatar afectados', 2, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaIncendio1', 2, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaIncendio2', 2, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaIncendio3', 2, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaIncendio4', 2, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Asistir gente que no sabe nadar', 3, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaInundacion1', 3, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaInundacion2', 3, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaInundacion3', 3, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaInundacion4', 3, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Alimentar a personas', 4, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaHuracan1', 4, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaHuracan2', 4, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaHuracan3', 4, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaHuracan4', 4, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Trasladar personas', 5, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaTsunami1', 5, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaTsunami2', 5, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaTsunami3', 5, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaTsunami4', 5, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Encontrar escalera', 6, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaGato1', 6, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaGato2', 6, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaGato3', 6, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaGato4', 6, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Buscar personas', 7, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaDerrumbe1', 7, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaDerrumbe2', 7, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaDerrumbe3', 7, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaDerrumbe4', 7, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Asistir afectados', 8, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaAccidenteAutomovilistico1', 8, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaAccidenteAutomovilistico2', 8, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaAccidenteAutomovilistico3', 8, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaAccidenteAutomovilistico4', 8, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Pintar muros', 9, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaMurallasVandalisadas', 9, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaMurallasVandalisadas2', 9, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaMurallasVandalisadas3', 9, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaMurallasVandalisadas4', 9, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('Asistencia psicologica', 10, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaGenteAtrapada1', 10, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaGenteAtrapada2', 10, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaGenteAtrapada3', 10, 1);
INSERT INTO "Task" (name, id_emergency, id_state_task) VALUES ('TareaGenteAtrapada4', 10, 1);

-------------------------------------------------------
-- 9. Task_ability (10)
-------------------------------------------------------

INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (1, 1);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (1, 2);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (1, 3);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (1, 4);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (1, 5);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (2, 6);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (2, 7);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (2, 8);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (2, 9);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (2, 10);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (3, 11);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (3, 12);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (3, 13);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (3, 14);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (3, 15);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (4, 16);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (4, 17);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (4, 18);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (4, 19);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (4, 20);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (5, 21);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (5, 22);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (5, 23);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (5, 24);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (5, 25);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (6, 26);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (6, 27);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (6, 28);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (6, 29);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (6, 30);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (7, 31);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (7, 32);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (7, 33);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (7, 34);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (7, 35);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (8, 36);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (8, 37);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (8, 38);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (8, 39);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (8, 40);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (9, 41);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (9, 42);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (9, 43);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (9, 44);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (9, 45);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (10, 46);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (10, 47);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (10, 48);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (10, 49);
INSERT INTO "Task_ability" (id_eme_ability, id_task) VALUES (10, 50);

-------------------------------------------------------
-- 10. ranking (10)
-------------------------------------------------------

INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (1, '1-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (1, '10-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (1, '15-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (1, '17-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (1, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (1, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (2, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (2, '5-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (2, '16-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (2, '19-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (2, '20-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (2, '2-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (2, '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (2, '10-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (3, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (3, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (3, '6-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (4, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (4, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (5, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (5, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (5, '5-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '2-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '10-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '12-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '15-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '17-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (6, '20-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (7, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (7, '2-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (7, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (7, '10-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (7, '15-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (7, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (8, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (8, '20-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (8, '5-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (8, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (8, '19-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '5-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '1-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '20-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '18-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '15-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '13-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (9, '19-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (10, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (10, '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (11, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (11, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (11, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (11, '4-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (12, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (12, '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (12, '13-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (12, '15-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (12, '17-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (12, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (13, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (13, '11-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (13, '12-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (13, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (13, '2-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (13, '16-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (13, '17-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (13, '20-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (13, '1-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (14, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (14, '2-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (14, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (14, '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (14, '19-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (14, '20-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (14, '1-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (15, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (15, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (15, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (16, '4-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (16, '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (17, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (17, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (18, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (18, '20-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (18, '18-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (18, '12-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (19, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (19, '2-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (19, '4-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (19, '5-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (19, '6-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (19, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (19, '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (19, '19-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (20, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (20, '1-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (20, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (20, '6-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (21, '5-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (21, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (21, '6-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (21, '5-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (22, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (22, '4-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (22, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (22, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (22, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (22, '1-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (22, '2-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (23, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (23, '1-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (23, '2-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (23, '3-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (24, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (24, '4-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (24, '5-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (24, '6-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (25, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (25, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (26, '6-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (26, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (26, '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (27, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (28, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (28, '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (29, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (29, '10-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (29, '11-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (29, '12-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (30, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (31, '7-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (32, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (33, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (34, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (35, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (36, '8-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (37, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (38, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (39, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (40, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (41, '9-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (42, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (43, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (44, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (45, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (46, '10-9');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (47, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (48, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (49, '0-0');
INSERT INTO "Ranking" (id_task, rut_voluntary) VALUES (50, '0-0');