/*Populate Tables*/
/* Table blogs */
INSERT INTO blogs (id, autor, create_at, photo, post, subtitle, title, update_At)
VALUES (1, 'figueyes', '2019-08-19','','Este es un post de prueba para mi Web de Portafolio. Pronto se vienen novedades. ',
        'un ejemplo de blog','Ejemplo', NOW());

INSERT INTO blogs (id, autor, create_at, photo, post, subtitle, title, update_At)
VALUES (2, 'figueyes', '2019-08-21','',
        'Este es un segundo post de prueba para mi Web de Portafolio. Pronto se vienen novedades.
Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illum neque perspiciatis rerum temporibus velit.
Aliquam blanditiis deserunt eligendi nesciunt provident quia quo sapiente ut vel voluptates! Harum laudantium
mollitia sunt? Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illum neque perspiciatis rerum temporibus
velit. Aliquam blanditiis deserunt eligendi nesciunt provident quia quo sapiente ut vel voluptates! Harum laudantium
mollitia sunt? Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illum neque perspiciatis rerum temporibus
velit. Aliquam blanditiis deserunt eligendi nesciunt provident quia quo sapiente ut vel voluptates! Harum laudantium
mollitia sunt? Lorem ipsum dolor sit amet, consectetur adipisicing elit. Illum neque perspiciatis rerum temporibus
velit. Aliquam blanditiis deserunt eligendi nesciunt provident quia quo sapiente ut vel voluptates! Harum laudantium
mollitia sunt?','un segundo ejemplo de blog','Ejemplo',NOW());

/* Table tags */
INSERT INTO tags VALUES (1,'_test_','primer tag');
INSERT INTO tags VALUES (2, '_test_','segundo tag');
INSERT INTO tags VALUES (3, '_test_','tercer tag');

/* Table tag_items */
INSERT INTO item_tags (id, tag_id) VALUES (1,1);