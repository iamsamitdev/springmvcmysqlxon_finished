package com.itgenius.springmvcmysqlxon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {
    
    // Constructure
    public User() {
        // Initial Value
    }

    // Create Field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 5)
    private int id;

    @Column(name = "firtname", length = 64)
    @Size(min = 3, max = 32)
    @NotBlank(message = "This field is required")
    private String firstName;

    @Column(name = "lastname", length = 64)
    @NotBlank(message = "This field is required")
    private String lastName;

    @Column(name = "email", length = 64)
	@NotBlank(message = "ป้อนอีเมล์ก่อน")
	@Email(message = "รูปแบบอีเมล์ไม่ถูกต้อง")
    private String emailName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

}
