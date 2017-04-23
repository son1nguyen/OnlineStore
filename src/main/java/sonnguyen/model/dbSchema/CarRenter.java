package sonnguyen.model.dbSchema;

import javax.persistence.*;
import java.util.List;

/**
 * Created by sonnguyen on 4/20/17.
 */
@Entity
@Table(name = "car_renter")
public class CarRenter {

    @Id
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "carRenter")
    private List<CarPost> carPostingList;

    public CarRenter() {
    }

    public CarRenter(String email, String lastName, String firstName, String password, List<CarPost> carPostingList) {
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.carPostingList = carPostingList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CarPost> getCarPostingList() {
        return carPostingList;
    }

    public void setCarPostingList(List<CarPost> carPostingList) {
        this.carPostingList = carPostingList;
    }
}
