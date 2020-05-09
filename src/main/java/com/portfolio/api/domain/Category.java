package com.portfolio.api.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category {

    @Id
    private Long idCategory;
    private String category;
    private Date createdat;
    private Date updatedat;


    @Override
    public String toString() {
        return "Category{" +
                "idCategory=" + idCategory +
                ", category='" + category + '\'' +
                ", createdAt=" + createdat +
                ", updatedAt=" + updatedat +
                '}';
    }
}
