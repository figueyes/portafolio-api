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
@Table(name = "profiles")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "users"})
public class Profile {

    @Id
    @Column(length = 20)
    private String role;

    @NotEmpty
    @Column(length = 50)
    private String identifier;

    @NotEmpty
    @Column(length = 50)
    private String description;

    @ManyToMany(mappedBy = "profiles",
            cascade = CascadeType.ALL)
    private List<User> users;

    public Profile() {
        this.users = new ArrayList<>();
    }
}
