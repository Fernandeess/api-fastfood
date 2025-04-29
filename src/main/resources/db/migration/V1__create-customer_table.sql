CREATE TABLE customers(
    id SERIAL PRIMARY KEY NOT NULL,
    name varchar(100),
    email varchar(255) UNIQUE,
    cpf VARCHAR(11) UNIQUE
)