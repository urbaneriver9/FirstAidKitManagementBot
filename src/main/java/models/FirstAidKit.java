package models;

import java.util.Objects;

public class FirstAidKit {
    private long id;
    private String name;
    private String login;
    private String password;
    private String lastUpdateDate;

    public FirstAidKit(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FirstAidKit)) return false;
        FirstAidKit that = (FirstAidKit) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(login, that.login) && Objects.equals(password, that.password) && Objects.equals(lastUpdateDate, that.lastUpdateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, login, password, lastUpdateDate);
    }

    @Override
    public String toString() {
        return "FirstAidKit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", lastUpdateDate='" + lastUpdateDate + '\'' +
                '}';
    }
}
