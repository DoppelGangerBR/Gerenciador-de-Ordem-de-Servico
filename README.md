# Gerenciador-de-Ordem-de-Servico

CREATE SEQUENCE public.cliente_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1; ALTER TABLE public.cliente_id_seq OWNER TO postgres;

CREATE SEQUENCE public.ordem_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1; ALTER TABLE public.ordem_id_seq OWNER TO postgres;
            
CREATE SEQUENCE public.usuario_id_seq INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1; ALTER TABLE public.usuario_id_seq OWNER TO postgres;                
            
CREATE TABLE public.cadastro_clientes ( id_cliente integer NOT NULL DEFAULT nextval('cliente_id_seq'::regclass), nome character varying, telefone character varying, celular character varying, endereco character varying, cpfcnpj character varying, bairro character varying, cidade character varying, estado character varying, ativo integer, numero character varying, CONSTRAINT cadastro_clientes_pkey PRIMARY KEY (id_cliente) ) WITH ( OIDS=FALSE ); ALTER TABLE public.cadastro_clientes OWNER TO postgres;
            
CREATE TABLE public.ordem_servico ( id_os integer NOT NULL DEFAULT nextval('ordem_id_seq'::regclass), usuario_id integer NOT NULL, cadastro_clientes_id integer NOT NULL, modelo character varying, marca character varying, numero_serie character varying, equipamento character varying, acessorios character varying, problema_reclamado character varying, data_abertura date, status_os integer, aberta_fechada integer, obsos character varying, CONSTRAINT ordem_servico_pkey PRIMARY KEY (id_os), CONSTRAINT ordem_servico_cadastro_clientes_id_fkey FOREIGN KEY (cadastro_clientes_id) REFERENCES public.cadastro_clientes (id_cliente) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION ) WITH ( OIDS=FALSE ); ALTER TABLE public.ordem_servico OWNER TO postgres;

CREATE TABLE public.usuario ( id_usuario integer NOT NULL DEFAULT nextval('usuario_id_seq'::regclass), usuario character varying, senha character varying, CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario) ) WITH ( OIDS=FALSE ); ALTER TABLE public.usuario OWNER TO postgres;

CREATE DATABASE ordem_servico_db WITH OWNER = postgres ENCODING = 'UTF8' TABLESPACE = pg_default LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252' CONNECTION LIMIT = -1;
