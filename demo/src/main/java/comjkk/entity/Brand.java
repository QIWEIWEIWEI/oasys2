package comjkk.entity;
import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="brand")
public class Brand  implements Serializable{
    @Id
    @GeneratedValue
    private int Id;

    private String name;

    private String firstchar;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstchar() {
        return firstchar;
    }

    public void setFirstchar(String firstchar) {
        this.firstchar = firstchar;
    }
}
