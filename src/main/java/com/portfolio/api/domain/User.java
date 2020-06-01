package com.portfolio.api.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private Long idUser;

    @NotEmpty
    @Column(length = 20)
    private String username;

    @NotEmpty
    @Column(length = 20)
    private String password;

    @NotEmpty
    @Email
    @Column(unique = true,
    length = 60)
    private String email;

    @NotEmpty
    @Column(length = 20)
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_country")
    private Country country;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_author")
    private Author author;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "user_profile",
            joinColumns = {@JoinColumn(name = "id_user")},
            inverseJoinColumns = {@JoinColumn(name = "role")})
    private List<Profile> profiles;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @PrePersist
    private void prePersist() {
        this.createdAt = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = new Date();
    }

    public User() {
        this.profiles = new ArrayList<>();
    }

    public void addProfile(Profile profile) {
        this.profiles.add(profile);
    }

    public void removeProfile(Profile profile) {
        this.profiles.remove(profile);
    }
}
