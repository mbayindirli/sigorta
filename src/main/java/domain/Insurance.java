package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "insurance")
public class Insurance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;
    @ManyToMany
    private Set<Policy> policies=new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(Set<Policy> policies) {
        this.policies = policies;
    }
}
