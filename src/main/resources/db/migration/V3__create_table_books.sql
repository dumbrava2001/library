CREATE TABLE books
(
    book_id    SERIAL PRIMARY KEY,
    book_title VARCHAR(50) NOT NULL,
    author_id  INT         NOT NULL,
    type_id    INT         NOT NULL,
    book_year  INT,
    CONSTRAINT author_fk FOREIGN KEY (author_id) REFERENCES authors (author_id),
    CONSTRAINT type_fk FOREIGN KEY (type_id) REFERENCES types (type_id)
);