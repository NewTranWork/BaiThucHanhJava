package com.example.BaiThucHanhJava.entity;

import com.example.BaiThucHanhJava.validator.annotation.ValidUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 50, nullable = false, unique = true)
    @NotBlank(message = "Username is  required")
    @Size(max = 50, message = "Username must be less than 50 character")
    @ValidUsername
    private String username;

    @Column(name = "password", length = 250, nullable = false)
    @NotBlank(message = "Password is required")
    private String password;

    @Column(name = "email", length = 50)
    @Size(max = 50, message = "Email must be less than 50 character")
    private String email;

    @Column(name = "name", length = 50, nullable = false)
    @NotBlank(message = "Username is  required")
    @Size(max = 50, message = "Username must be less than 50 character")
    private String name;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Username is  required") @Size(max = 50, message = "Username must be less than 50 character") String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank(message = "Username is  required") @Size(max = 50, message = "Username must be less than 50 character") String username) {
        this.username = username;
    }

    public @NotBlank(message = "Password is required") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is required") String password) {
        this.password = password;
    }

    public @Size(max = 50, message = "Email must be less than 50 character") String getEmail() {
        return email;
    }

    public void setEmail(@Size(max = 50, message = "Email must be less than 50 character") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Username is  required") @Size(max = 50, message = "Username must be less than 50 character") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Username is  required") @Size(max = 50, message = "Username must be less than 50 character") String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
