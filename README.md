# spring-boot-cassandra


Download Apache Cassandra Cassandra
Set up CASANDRA_HOME
Install python and set up Environment variable Path

Docker commands:

    docker pull cassandra
    docker run --name cassandra -p 9042:9042 -p 9160:9160   -d cassandra
    docker ps
    docker exec -it  /bin/bash

    nodetool status
    nodetool netstats
    cqlsh

Cassandra Queries:

    CREATE KEYSPACE reference_keyspace WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 1};
    
    DESCRIBE keyspaces;
    
    USE reference_keyspace;
    
    CREATE TABLE reference_keyspace.payment_details ( payment_id text,transaction_id text,auth_status text PRIMARY KEY(payment_id) );
    
