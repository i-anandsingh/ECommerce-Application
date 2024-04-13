# ID Generator Client
Generates unique Ids for Seller, Customer & Products.

Fetch the MySQL DB and checks if the generated ID is already present in the DB. If present then recursively calls the respective generator functions and then store the new ID in the db.
