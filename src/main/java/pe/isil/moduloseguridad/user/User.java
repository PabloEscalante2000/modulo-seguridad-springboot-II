package pe.isil.moduloseguridad.user;

import javax.persistence.*;

@Entity
@Table (name = "tbl_user",
    uniqueConstraints = {
        @UniqueConstraint(name = "mail_unique", columnNames = "mail"),
        @UniqueConstraint(name = "document_unique", columnNames = "document")

    }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "mail", nullable = false)
    private String email;

    @Column(name = "pass",nullable = false)
    private String password;

    @Column(name = "username", nullable = true)
    private String name;

    @Column(name = "document",nullable = false)
    private String document;

    //Get and Set

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
