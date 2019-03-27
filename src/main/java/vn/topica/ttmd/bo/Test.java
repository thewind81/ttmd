package vn.topica.ttmd.bo;

import javax.persistence.*;

@Entity
@Table(name = "Test")
public class Test {
    @Id
    @Column(name = "Id")
    @GeneratedValue
    private Integer id;
    @Column(name = "Name")
    private String name;

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
}
