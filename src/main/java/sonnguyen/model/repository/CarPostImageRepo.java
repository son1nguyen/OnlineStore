package sonnguyen.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sonnguyen.model.dbSchema.CarPostImage;

/**
 * Created by sonnguyen on 4/20/17.
 */

public interface CarPostImageRepo extends JpaRepository<CarPostImage, Long> {
}
