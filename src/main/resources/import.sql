INSERT into formapagamento(id, descricao)VALUES(1, "A VISTA"),(2, "CARTAO"),(3, "DINHEIRO");
INSERT into estado(id, nome)VALUES(1, "SP"),(2, "PR");
INSERT into cidade(id, id_estado, nome)VALUES(1, 1,"Marilia"),(2, 2, "Curitiba");

INSERT into cozinha(nome)VALUES("MINEIRA"),("JAPONEZA");
INSERT into restaurante(descricao, id_cozinha)VALUES("O Mineirinho", 1),("Japakitos", 2);
