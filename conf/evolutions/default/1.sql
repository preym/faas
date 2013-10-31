# Users schema

# --- !Ups

CREATE TABLE Feedback (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar(30) NOT NULL
    email varchar(25) NOT NULL,
    phone bigint(20) NOT NULL,
   feedback_type varchar(20) NOT NULL,
    message varchar(255) NOT NULL,
    PRIMARY KEY (id)
);

# --- !Downs

DROP TABLE Feedback;
