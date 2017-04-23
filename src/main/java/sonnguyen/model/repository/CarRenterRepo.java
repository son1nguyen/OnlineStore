package sonnguyen.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sonnguyen.model.dbSchema.CarRenter;

/**
 * Created by sonnguyen on 4/20/17.
 */
public interface CarRenterRepo extends JpaRepository<CarRenter, String> {

    CarRenter getCarRenterByEmail(String email);
}
