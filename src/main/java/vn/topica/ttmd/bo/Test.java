package vn.topica.ttmd.bo;

import javax.persistence.*;

@Entity
@Table(name = "Test")
public class Test {
    @Id
    @Column(name = "Id")
    @GeneratedValue
    private String id;
    @Column(name = "Name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
