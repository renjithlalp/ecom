-- mysoftcorner.customer definition

-- Drop table

-- DROP TABLE mysoftcorner.customer;

CREATE TABLE mysoftcorner.customer (
	customer_id varchar NULL,
	first_name varchar NULL,
	last_name varchar NULL,
	email varchar NULL,
	address_id varchar NULL,
	active bool NULL,
	create_date date NULL,
	last_update date NULL
);
