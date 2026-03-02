### DQL ( Data Query Language )
- used to query the database
- SELECT, PROJECTION, SELECTION, JOIN

#### SELECT
- used to display data from a table ( result table )
- SELECT is responsible for generating the result table, it does not modify the original table

#### PROJECTION
- fetch the data from a table by selecting specific columns
- SELECT, FROM
- SELECT */[DISTINCT] column1, column2, ... FROM table_name;

#### DISTINCT
- used to return only distinct (different) values
- SELECT DISTINCT column1, column2, ... FROM table_name;

#### SELECTION
- fetch the data from a table by selecting specific rows based on a condition
- SELECT, FROM, WHERE

#### WHERE
- used to filter records based on a specified condition
- SELECT column1, column2, ... FROM table_name WHERE condition;