package pl.mswar.microblog_course.model;

import java.io.File;
import java.util.Date;
import java.util.Objects;

public class User {
    private String login;
    private String password;
    private String uniqueAccountname;
    private String userAccountDescription;
    private Date accountCreationDate;//TODO: change this class for java 8specific
    AccountStatus accountStatus;
    AccountType accountType;
    File userAvatar;


    public User(String login, String password, String uniqueAccountname, String userAccountDescription, Date accountCreationDate, AccountStatus accountStatus, AccountType accountType, File userAvatar) {
        this.login = login;
        this.password = password;
        this.uniqueAccountname = uniqueAccountname;
        this.userAccountDescription = userAccountDescription;
        this.accountCreationDate = accountCreationDate;
        this.accountStatus = accountStatus;
        this.accountType = accountType;
        this.userAvatar = userAvatar;
    }

    public User() {
    }



    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(login, password);
    }
}
