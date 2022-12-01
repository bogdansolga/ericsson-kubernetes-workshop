-- run these commands before starting the project, in order to setup the database and the connecting user
CREATE USER kubernetes_workshop WITH PASSWORD 'kubernetes_workshop';

CREATE DATABASE kubernetes_workshop;
GRANT ALL PRIVILEGES ON DATABASE kubernetes_workshop TO kubernetes_workshop;