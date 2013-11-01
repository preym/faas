# Users schema

# --- !Ups

CREATE TABLE Feedback (
    name varchar(30) NOT NULL,
    email varchar(25) NOT NULL,
    phone bigint(20) NOT NULL,
   feedback_type varchar(20) NOT NULL,
    message varchar(255) NOT NULL,

);

# --- !Downs

# DROP TABLE Feedback;
