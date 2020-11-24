// Código sql para criar o banco Pharmacy e a tabela de Medicines
CREATE DATABASE pharmacy
CREATE TABLE public.medicines (
    code serial NOT NULL,
    name varchar(50) NOT NULL,
    description varchar(255) NULL,
    composition varchar(255) NULL,
    price float4 NOT NULL,
    CONSTRAINT medicines_pkey PRIMARY KEY (code)
);

