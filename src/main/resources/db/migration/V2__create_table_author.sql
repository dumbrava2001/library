CREATE TABLE authors
(
    author_id       SERIAL PRIMARY KEY,
    author_name     VARCHAR(50) NOT NULL,
    author_lastname VARCHAR(50) NOT NULL
);