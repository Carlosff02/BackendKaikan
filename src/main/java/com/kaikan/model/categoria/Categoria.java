package com.kaikan.model.categoria;


import com.kaikan.generics.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Categoria extends BaseEntity {
    private String nombre;
    private String img_url;
}
