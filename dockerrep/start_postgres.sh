#!/bin/bash

exec su postgres -c "/usr/pgsql-10/bin/postgres -D /var/lib/pgsql/10/data"

exec su postgres -c "psql -c \"alter user postgres password 'password'\";"

psql <<-EOSQL


CREATE DATABASE EntEbiz;

CREATE TABLE entreprise (
        ent_id          integer         PRIMARY KEY,
        ent_nom         char(40)
);

CREATE TABLE salarie (
        sal_id          integer         PRIMARY KEY,
        sal_nom         char(40),
        sal_ent_id      integer
);

EOSQL





