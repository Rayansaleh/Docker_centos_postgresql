#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL


CREATE DATABASE EntEbiz;

CREATE USER Boldo;

CREATE PASSWORD jmarsjhe43;

CREATE TABLE entreprise (
	ent_id		integer		PRIMARY KEY,
	ent_nom		char(40)
);

CREATE TABLE salarie (
	sal_id		integer		PRIMARY KEY,
	sal_nom 	char(40),
	sal_ent_id	integer
);

EOSQL
