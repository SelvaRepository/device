CREATE DATABASE IF NOT EXISTS device;
USE device;
CREATE TABLE IF NOT EXISTS device(
                                   id bigint AUTO_INCREMENT,
                                   name varchar(255),
                                   brand varchar(255),
                                   state varchar(255)
    PRIMARY KEY (id)
    );
INSERT INTO
    device(name,brand,state)
VALUES
    ("11us","Dell","in-use"),
    ("522st","Dell","in-use");