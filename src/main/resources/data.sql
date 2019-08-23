/*POPULATE DATA*/
INSERT INTO posts (title, subtitle, author, text_body, categoria, photo, create_at, update_at)
VALUES ('Ejemplo de post 1', 'Este es un ejemplo','Alex','Ejemplo de blog. Texto de prueba aquí.', '_TEST_','','2018-07-21','2019-08-01');

INSERT INTO tags (tag) VALUES ('_TESTING_');

INSERT INTO tags_post VALUES (1,1)