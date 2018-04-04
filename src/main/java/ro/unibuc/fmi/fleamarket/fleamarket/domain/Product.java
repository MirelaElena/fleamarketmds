package ro.unibuc.fmi.fleamarket.fleamarket.domain;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    private Person person;

    public Person getPerson() {
        return person;
    }

    public Product person(Person person) {
        this.person = person;
        return this;
    }

    public void setPerson(Person person) {
        this.person = person;
    }



}
