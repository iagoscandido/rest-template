CREATE SEQUENCE address_id_seq MINVALUE 1;
ALTER TABLE address ALTER id SET DEFAULT nextval('address_id_seq');
ALTER SEQUENCE address_id_seq OWNED BY address.id;