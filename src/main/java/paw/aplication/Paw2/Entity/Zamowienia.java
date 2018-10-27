package paw.aplication.Paw2.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Zamowienia {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String lastname;
    private String mail;
    private Integer phonenumber;
    private String adres;
    private String text;
    private Integer idid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getIdid() {
        return idid;
    }

    public void setIdid(Integer idid) {
        this.idid = idid;
    }

    public Zamowienia(String name, String lastname, String mail, Integer phonenumber, String adres, String text) {
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;
        this.phonenumber = phonenumber;
        this.adres = adres;
        this.text = text;
    }

    public Zamowienia(Integer id) {
        this.idid = id;
    }

    public Zamowienia() {
    }


}
