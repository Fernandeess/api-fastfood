

CREATE TABLE products(
    id SERIAL PRIMARY KEY NOT NULL,
    name varchar(100) UNIQUE,
    url_image varchar ,
    category varchar(255)
);



