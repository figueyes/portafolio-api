package com.portfolio.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "countries")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "users"})
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_country")
    private Long idCountry;

    @NotEmpty
    @Column(length = 60)
    private String country;

    @OneToMany(mappedBy = "country",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<User> users;

    public Country() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }
}
