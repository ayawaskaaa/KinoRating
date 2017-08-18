package com.epam.kinorating.entity;

import java.sql.Date;

public class User {
    private int id;
    private String name;
    private double rating = 10.0;
    private String mail;
    private String password;
    private Date dateCreate;
    private String salt;
    private boolean banned;
    int roleId = 2;

    public User() {}

    public User(int id, String name, double rating, String mail, Date dateCreate) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.mail = mail;
        this.dateCreate = dateCreate;
    }

    public User(String name, String mail, String password, Date dateCreate) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.dateCreate = dateCreate;
    }

    public int getId() {
            return id;
        }

    public void setId(int id) {
            this.id = id;
        }

    public String getName() {
            return name;
        }

    public void setName(String name) {
            this.name = name;
        }

    public double getRating() {
            return rating;
        }

    public void setRating(double rating) {
            this.rating = rating;
        }

    public String getMail() {
            return mail;
        }

    public void setMail(String mail) {
            this.mail = mail;
        }

    public String getPassword() {
            return password;
        }

    public void setPassword(String password) {
            this.password = password;
        }

    public Date getDateCreate() {
            return dateCreate;
        }

    public void setDateCreate(Date dateCreate) {
            this.dateCreate = dateCreate;
        }

    public String getSalt() {
            return salt;
        }

    public void setSalt(String salt) {
            this.salt = salt;
        }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (Double.compare(user.rating, rating) != 0) return false;
        if (banned != user.banned) return false;
        if (roleId != user.roleId) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (mail != null ? !mail.equals(user.mail) : user.mail != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (dateCreate != null ? !dateCreate.equals(user.dateCreate) : user.dateCreate != null) return false;
        return salt != null ? salt.equals(user.salt) : user.salt == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(rating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (banned ? 1 : 0);
        result = 31 * result + roleId;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", dateCreate=" + dateCreate +
                ", salt='" + salt + '\'' +
                ", banned=" + banned +
                ", roleId=" + roleId +
                '}';
    }
}
