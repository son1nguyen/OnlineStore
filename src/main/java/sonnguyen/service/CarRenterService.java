package sonnguyen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sonnguyen.model.dbSchema.CarRenter;
import sonnguyen.model.form.CarRenterForm;
import sonnguyen.model.repository.CarRenterRepo;

/**
 * Created by sonnguyen on 4/20/17.
 */
@Service
public class CarRenterService {

    @Autowired
    private CarRenterRepo carRenterRepo;

    public CarRenter createCarRenter(CarRenterForm carRenterForm) {
        if (!userAlreadyExist(carRenterForm.getEmail())) {
            CarRenter carRenter = new CarRenter();
            carRenter.setEmail(carRenterForm.getEmail());
            carRenter.setFirstName(carRenterForm.getFirstName());
            carRenter.setLastName(carRenterForm.getLastName());
            carRenter.setPassword(carRenterForm.getPassword());

            carRenter = carRenterRepo.save(carRenter);
            return carRenter;
        } else {
            return null;
        }
    }

    public boolean userAlreadyExist(String email) {
        CarRenter carRenter = carRenterRepo.getCarRenterByEmail(email);
        return carRenter != null;
    }

}
