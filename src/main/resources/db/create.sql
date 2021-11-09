SET MODE PostgreSQL;

CREATE DATABASE wildlife-tracker;

\c wildlife-tracker;

CREATE TABLE IF NOT EXISTS animals (
 id serial PRIMARY KEY, name text, danger text, health text, age text, location text, ranger text, created timestamp
);


CREATE TABLE IF NOT EXISTS sightings (
  id serial PRIMARY KEY, animal id int, location text, rangername text, lastsighting timestamp
);

