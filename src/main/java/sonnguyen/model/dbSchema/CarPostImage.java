package sonnguyen.model.dbSchema;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sonnguyen on 4/20/17.
 */
@Entity
@Table(name = "car_post_image")
public class CarPostImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "car_post_id", nullable = false)
    private CarPost carPost;

    @Column(name = "name")
    private String name;

    @Column(name = "uploaded_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uploadedDate;

    @Column(name = "path")
    private String path;

    public CarPostImage() {
    }

    public CarPostImage(CarPost carPost, String name, Date uploadedDate, String path) {
        this.carPost = carPost;
        this.name = name;
        this.uploadedDate = uploadedDate;
        this.path = path;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CarPost getCarPost() {
        return carPost;
    }

    public void setCarPost(CarPost carPost) {
        this.carPost = carPost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(Date uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
