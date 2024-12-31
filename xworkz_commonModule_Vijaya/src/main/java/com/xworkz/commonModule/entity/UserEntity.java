package com.xworkz.commonModule.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@Table(name="signup_info")
@NamedQuery(name="getNameByEmailAndPassword" ,query="select e.name from UserEntity e where e.email= :byemail and e.password = :bypassword ")
@NamedQuery(name="countName" , query ="select count(*) from UserEntity e where e.name =:SetName")
@NamedQuery(name = "countEmail", query = "select count(e) from UserEntity e where e.email = :SetEmail")
@NamedQuery(name = "countAltEmail", query = "select count(e) from UserEntity e where e.alternative_email = :SetAltEmail")
@NamedQuery(name = "countPhone", query = "select count(e) from UserEntity e where e.phone = :SetPhone")
@NamedQuery(name = "countAltPhone", query = "select count(e) from UserEntity e where e.alternative_phone = :SetAltPhone")
@NamedQuery(name = "countLocation", query = "select count(e) from UserEntity e where e.location = :SetLocation")
public class UserEntity extends AbstractAuditEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="user_name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="alternative_email")
    private String alternative_email;
    @Column(name="phone")
    private String phone;
    @Column(name="alternative_phone")
    private String alternative_phone;
    @Column(name="location")
    private String location;
    @Column(name="password")
    private String password;
}
