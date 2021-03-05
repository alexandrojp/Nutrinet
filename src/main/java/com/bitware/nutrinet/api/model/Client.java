package com.bitware.nutrinet.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@ToString
@Document(collection = "Clients")
public class Client {
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    @Field("Cliente_ID")
    @JsonProperty("Client_ID")
    private long id;

    @Indexed(name = "username_unique_index", unique=true)
    @Field("Nombre_Usuario")
    @JsonProperty("Nombre_Usuario")
    private String username;

    @Field("Contraseña")
    @JsonProperty("Contraseña")
    private String password;

    @Field("Nombre")
    @JsonProperty("Nombre")
    private String firstName;

    @Field("Apellidos")
    @JsonProperty("Apellidos")
    private String lastName;

    @Indexed(name = "email_unique_index", unique=true)
    @Field("Correo_Electronico")
    @JsonProperty("Correo_Electronico")
    private String email;

    @Field("Edad")
    @JsonProperty("Edad")
    private int age;

    @Field("Estatura")
    @JsonProperty("Estatura")
    private float height;

    @Field("Peso")
    @JsonProperty("Peso")
    private float bodyWeight;

    @JsonProperty("IMC")
    private float IMC;

    @JsonProperty("GEB")
    private float GEB;

    @JsonProperty("ETA")
    private float ETA;

    @CreatedDate
    @Field("Fecha_Creacion")
    @JsonProperty("Fecha_Creacion")
    private Date createdAt;

    @LastModifiedDate
    @Field("Fecha_Actualizacion")
    @JsonProperty("Fecha_Actualizacion")
    private Date updatedAt;

    @Version
    @JsonIgnore
    public Integer version;
}
