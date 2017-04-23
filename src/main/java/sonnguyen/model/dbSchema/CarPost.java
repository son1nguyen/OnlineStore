package sonnguyen.model.dbSchema;

import javax.naming.Name;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by sonnguyen on 4/20/17.
 */
@Entity
@Table(name = "car_post")
public class CarPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "email", nullable = false)
    private CarRenter carRenter;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "posted_date")
    private Date postedDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "carPost")
    @Column(name = "car_image")
    private List<CarPostImage> carPostImages;

    public CarPost() {
    }

    public CarPost(CarRenter carRenter, Date postedDate, List<CarPostImage> carPostImages) {
        this.carRenter = carRenter;
        this.postedDate = postedDate;
        this.carPostImages = carPostImages;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CarRenter getCarRenter() {
        return carRenter;
    }

    public void setCarRenter(CarRenter carRenter) {
        this.carRenter = carRenter;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }
}
