
--    INSERTANDO DATOS DE PRUEBA A LA BASE DE DATOS


--PROVEEDORES
INSERT INTO PROVEEDORES (NAME) VALUES('COLANTA');
INSERT INTO PROVEEDORES (NAME) VALUES ('ALPINA');
INSERT INTO PROVEEDORES (NAME) VALUES ('FRUCO');
INSERT INTO PROVEEDORES (NAME) VALUES ('BIMBO');
INSERT INTO PROVEEDORES (NAME) VALUES ('POSTOBON');
INSERT INTO PROVEEDORES (NAME) VALUES ('COCA - COLA');
INSERT INTO PROVEEDORES (NAME) VALUES ('COLOMBINA');
INSERT INTO PROVEEDORES (NAME) VALUES ('BABARIA');

-- PRODUCTOS
INSERT INTO PRODUCTOS (NAME, DESCPRI, PRECIO, UNIDAD) VALUES ('LECHE', 'BOLSA DE LECHE', 3000, '1L');
INSERT INTO PRODUCTOS (NAME, DESCPRI, PRECIO, UNIDAD) VALUES ('BONYOURG', 'VASO DE YOGURT CON CEREAL', 1500, 'UNIT');
INSERT INTO PRODUCTOS (NAME, DESCPRI, PRECIO, UNIDAD) VALUES ('SALSA DE TOMATE', 'POTE DE SALSA DE TOMATE', 1500, 'UNIT');
INSERT INTO PRODUCTOS (NAME, DESCPRI, PRECIO, UNIDAD) VALUES ('PAN', 'ALMOHADILLA DE PAM', 2500, 'UNIT');
INSERT INTO PRODUCTOS (NAME, DESCPRI, PRECIO, UNIDAD) VALUES ('JUGO HIT', 'BOTELLA DE HIT', 1800, '500ML');
INSERT INTO PRODUCTOS (NAME, DESCPRI, PRECIO, UNIDAD) VALUES ('GASEOSA', 'BOTELLA DE GASEOSA', 3000, '1L');
INSERT INTO PRODUCTOS (NAME, DESCPRI, PRECIO, UNIDAD) VALUES ('BOM-BON-BUM', 'BOM-BON-BUM', 500, 'UNIT');
INSERT INTO PRODUCTOS (NAME, DESCPRI, PRECIO, UNIDAD) VALUES ('CLUB COLOMBIA', 'BOTELLA DE CERVEZA', 5000, '330ML');
INSERT INTO PRODUCTOS (NAME, DESCPRI, PRECIO, UNIDAD) VALUES ('AGUILA', 'BOTELLA DE CERVEZA', 2800, '330ML');


--FACTURAS
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (1,1,50);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (2,1,30);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (2,2,10);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (3,3,50);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (4,4,50);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (5,5,20);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (5,6,60);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (6,6,70);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (7,7,100);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (8,8,150);
INSERT INTO FACTURAS (ID_PROVEE, ID_PROD,CANT_PROD) VALUES (8,9,300);