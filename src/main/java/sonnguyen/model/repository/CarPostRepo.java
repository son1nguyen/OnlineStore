package sonnguyen.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sonnguyen.model.dbSchema.CarPost;

/**
 * Created by sonnguyen on 4/20/17.
 */
public interface CarPostRepo extends JpaRepository<CarPost, Long> {
}
