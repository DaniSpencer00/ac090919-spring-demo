INSERT INTO persona (id,nome,cognome) VALUES (1,"Mario","Red"), (2,"Fabio","Green"), (3,"Ciuseppe","Blue"), (4,"Massimo","Yellow"), (5,"Zio","Bo"), (6,"Sasso","Fono");
INSERT INTO livelli (descrizione, difficolta) VALUES ("facile", 1);
INSERT INTO livelli (descrizione, difficolta) VALUES ("medio", 2);
INSERT INTO livelli (descrizione, difficolta) VALUES ("difficile", 3);

insert into guida (nome, url, descrizione, image_path, livello_id) values
("html5", "", "Con questa guida imparerai le basi di html5", "", 1),
("java", "", "", "", 2),
("mongoDB", "www.bacciocchi-fogli.universitaPrestigiosa.com", "Con questa guida diventerai un PRO in MongoDB", "qwertyuioplkjhgfdsazxcvbnm", 3);