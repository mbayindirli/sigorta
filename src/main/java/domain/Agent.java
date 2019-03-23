package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "agencies")
public class Agent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String adress;
    @ManyToMany
    private Set<Policy> policies = new HashSet<>();


}
