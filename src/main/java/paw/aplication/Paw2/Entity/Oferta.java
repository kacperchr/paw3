package paw.aplication.Paw2.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class  Oferta {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String picture;
    private String text;

    public String getPicture() {

        return picture;
    }

    public void setPicture(String picture) {

        this.picture = picture;
    }

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

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public Oferta(String name, String picture, String text) {
        this.name = name;
        this.picture = picture;
        this.text = text;
    }

    public Oferta() {
    }
}
