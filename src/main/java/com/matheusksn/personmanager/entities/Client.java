package com.matheusksn.personmanager.entities;

import com.matheusksn.personmanager.enums.ClientType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@Data
@Generated
@Validated
@NoArgsConstructor
@AllArgsConstructor
@Document("Client")

public class Client implements Serializable {

    @Id
    private ObjectId _id;

    @NotEmpty
    @NotNull
    private ClientType type;

    @NotNull
    private Person person;

    @NotEmpty
    @NotNull
    private Double Money;

}
