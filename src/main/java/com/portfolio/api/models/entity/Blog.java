package com.portfolio.api.models.entity;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="blogs")
public class Blog implements Serializable {


    private static final long serialVersionUID = 479799998135563720L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false)
    private String title;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false)
    private String subtitle;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false)
    private String autor;

    @Lob
    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false)
    private String post;

    private String photo;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false, name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @NotEmpty(message="no puede estar vacío")
    @Column(nullable = false, name = "update_at")
    @Temporal(TemporalType.DATE)
    private Date updateAt;


    @OneToMany(mappedBy = "tag",cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ItemTag> items;


    public Blog() {
        this.items = new ArrayList<ItemTag>();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public List<ItemTag> getItems() {
        return items;
    }

    public void setItems(List<ItemTag> items) {
        this.items = items;
    }

    public void addItemTag(ItemTag itemTag){
        this.items.add(itemTag);
    }
}
