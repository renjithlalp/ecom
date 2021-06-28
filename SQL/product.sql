-- mysoftcorner.product definition

-- Drop table

-- DROP TABLE mysoftcorner.product;

CREATE TABLE mysoftcorner.product (
	product_id varchar NULL,
	productname varchar NULL,
	price_perunit float8 NULL,
	basic_unit varchar NULL,
	tax_percentage float8 NULL,
	active_for_sale bool NULL
);