regen:
	psql jooq_test pablogonzalez -a -f schema.sql
	mvn generate-sources

