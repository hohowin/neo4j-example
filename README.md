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
