# Nutrinet
API with spring boot and mongo db

## What Nutrinet do?
It is a CRUD API with spring boot and mongo db of clients, but you can also taste the follows entrypoints:

### Method POST - Save a new client
```bash
/Nutrinet/Cliente
```
Body content
```json
{
    "Nombre": "Jose Luis",
    "Apellidos": "Lopez Gutierrez",
    "Nombre_Usuario": "jlopez",
    "Contraseña": "afryeg4534tsdasdgarg34g",
    "Correo_Electronico": "gutierres.fake@gsmail.com"
}
```

### Method GET - Get all clients register
```
/Nutrinet/Cliente/
```

### Method GET - Get a specific client by id
```
/Nutrinet/Cliente/[id]
```

### Method PUT - Update a client (Edad, Estatura, Peso and GEB)
```
/Nutrinet/Cliente/[id]
```
Body content example:
```json
{
    "Edad": 39,
    "Estatura": 1.90,
    "Peso": 120,
    "GEB": 1500
}
```
