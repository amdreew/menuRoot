package com.transunion.menuroot.infra.adapters.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "APLICATIVOS_MENU_RAIZ")
public class AppMenuRootEntity {
    @Id
    @Column(name = "codigo_producto")
    private String productCode;

    @NotNull(message = "Este atributo no puede ser nulo")
    @NotEmpty(message = "Este atributo no puede ser vacio")
    @Column(name = "nombre_producto", nullable = false)
    private String productName;

    @NotNull(message = "Este atributo no puede ser nulo")
    @NotEmpty(message = "Este atributo no puede ser vacio")
    @Column(nullable = false)
    private String url;

    @NotNull(message = "Este atributo no puede ser nulo")
    @NotEmpty(message = "Este atributo no puede ser vacio")
    @Column(name = "estado", nullable = false)
    private String status;

    @NotNull(message = "Este atributo no puede ser nulo")
    @NotEmpty(message = "Este atributo no puede ser vacio")
    @Column(name = "fecha_creacion", nullable = false)
    private Date createAt;

    @NotNull(message = "Este atributo no puede ser nulo")
    @NotEmpty(message = "Este atributo no puede ser vacio")
    @Column(name = "fecha_actualizacion", nullable = false)
    private Date updateAt;

    @NotNull(message = "Este atributo no puede ser nulo")
    @NotEmpty(message = "Este atributo no puede ser vacio")
    @Column(name = "usuario_creacion", nullable = false)
    private String createUser;

    @NotNull(message = "Este atributo no puede ser nulo")
    @NotEmpty(message = "Este atributo no puede ser vacio")
    @Column(name = "usuario_actualizacion", nullable = false)
    private String updateUser;

}

