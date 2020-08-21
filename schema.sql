SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

DROP SCHEMA if exists dealers cascade;
CREATE SCHEMA dealers;

CREATE TABLE dealers.channel (
    id serial primary key,
    code character(10) not null,
    name character varying not null
);

CREATE TABLE dealers.subchannel (
    id serial primary key,
    code character(10) not null,
    name character varying not null,
	main_channel_id integer not null references dealers.channel(id)
);

CREATE TABLE dealers.level (
    id serial primary key,
    hierarchical_level integer not null,
    description character varying not null,
	main_channel_id integer references dealers.channel(id)
);

CREATE TABLE dealers.manager (
    id serial primary key,
    code character(30) not null,
    name character varying not null,
	surname character varying,
	type character varying,
	user_created character varying,
	user_updated character varying,
	user_deleted character varying,
	creation_date timestamptz,
	update_date timestamptz,
	deletion_date timestamptz
);

CREATE TABLE dealers.dealer_status (
    id serial primary key,
    code character(10) not null,
    description character varying not null
);

CREATE TABLE dealers.dealer (
    id serial primary key,
    code character(10) not null,
	comercial_name character varying not null,
    level_id integer not null references dealers.level(id),
	status_id integer not null references dealers.dealer_status(id),
	parent_id integer references dealers.dealer(id),
	subchannel_id integer references dealers.subchannel(id),
	internal_manager_id integer references dealers.manager(id),
	external_manager_id integer references dealers.manager(id),
	commissioning_section varchar(10),
	store_type character(20),
	company_type character(20),
	document_type character(10),
	document_number character(20),
	company_name character varying,
	address character varying,
	city character varying,
	province character varying,
	user_created character varying,
	user_updated character varying,
	user_deleted character varying,
	creation_date timestamptz,
	update_date timestamptz,
	deletion_date timestamptz
);

CREATE TABLE dealers.accounting_system (
    id serial primary key,
    code character(20) not null,
	description character varying,
	user_created character varying,
	user_updated character varying,
	user_deleted character varying,
	creation_date timestamptz,
	update_date timestamptz,
	deletion_date timestamptz
);

CREATE TABLE dealers.dealer_accounting_system (
    id serial primary key,
    dealer_id integer not null references dealers.dealer(id),
	system_id integer not null references dealers.accounting_system(id),
	user_created character varying,
	user_updated character varying,
	user_deleted character varying,
	creation_date timestamptz,
	update_date timestamptz,
	deletion_date timestamptz
);

CREATE TABLE dealers.contact_information (
    id serial primary key,
    name character varying not null,
	email character varying,
	phone_number character varying,
	user_created character varying,
	user_updated character varying,
	user_deleted character varying,
	creation_date timestamptz,
	update_date timestamptz,
	deletion_date timestamptz
);

CREATE TABLE dealers.purpose (
    id serial primary key,
    name character varying not null
);

CREATE TABLE dealers.contact_purpose (
    id serial primary key,
    contact_information_id integer not null references dealers.contact_information(id),
	purpose_id integer not null references dealers.purpose(id),
	user_created character varying,
	user_updated character varying,
	user_deleted character varying,
	creation_date timestamptz,
	update_date timestamptz,
	deletion_date timestamptz
);

CREATE TABLE dealers.dealer_contact (
    id serial primary key,
    contact_information_id integer not null references dealers.contact_information(id),
	dealer_id integer not null references dealers.dealer(id),
	user_created character varying,
	user_updated character varying,
	user_deleted character varying,
	creation_date timestamptz,
	update_date timestamptz,
	deletion_date timestamptz
);

