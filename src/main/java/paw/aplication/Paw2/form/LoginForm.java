package paw.aplication.Paw2.form;

public class LoginForm {

    private String login;
    private String password;
    public Integer role;

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
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



    public LoginForm(String login, String password) {

        this.login = login;
        this.password = password;
    }
    public LoginForm() {
    }

    public LoginForm(Integer role) {
        this.role = role;
    }
}



