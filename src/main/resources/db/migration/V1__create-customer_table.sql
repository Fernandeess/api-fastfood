CREATE TABLE customers(
    id SERIAL PRIMARY KEY NOT NULL,
    name varchar(100) NOT NULL,
    email varchar(255) NOT NULL UNIQUE
)