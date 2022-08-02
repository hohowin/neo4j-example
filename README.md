# neo4j-example

## Test Deployment

Start DB:

```bash
docker-compose up -d
```

- Browser: http://localhost:7474
- Login: `neo4j/streams`

Try to create a relationship:

```bash
CREATE (c1: Character{name: 'Johnny Depp'})-[r:AUNT]->(c2: Character{name:'Jane Doe'}) RETURN c1, r, c2
```

## Springboot example

Youtube: [Spring Boot with Neo4J Example | Graph Database | Spring Data Neo4j | Tech Primers](https://youtu.be/GerN3MGm9Js)

## Insert Data

```bash
CREATE (Inception:Movie {title: 'Inception', director:'Chris Nolan' })
CREATE (DarkKnight:Movie {title: 'The Dark Knight', director:'Chris Nolan' })

CREATE (Peter:User {name: 'Peter', age: 30})
CREATE (Sam:User {name: 'Sam', age: 28})
CREATE (Ryan:User {name: 'Ryan', age: 19})

CREATE (Inception)-[:RATED {rating: 9}]->(Peter)
CREATE (Inception)-[:RATED {rating: 8}]->(Sam)
CREATE (DarkKnight)-[:RATED {rating: 9}]->(Sam)
CREATE (DarkKnight)-[:RATED {rating: 8}]->(Peter)
```

## Test Springboot

http://localhost:8081/rest/neo4j/user