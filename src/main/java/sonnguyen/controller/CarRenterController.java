package sonnguyen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sonnguyen.exceptionHandler.JsonError;
import sonnguyen.model.dbSchema.CarRenter;
import sonnguyen.model.form.CarPostForm;
import sonnguyen.model.form.CarRenterForm;
import sonnguyen.service.CarRenterService;

/**
 * Created by sonnguyen on 4/20/17.
 */
@RestController
public class CarRenterController {

    @Autowired
    private CarRenterService carRenterService;

    @RequestMapping(value = "/createRenter",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createCarRenter(@ModelAttribute CarRenterForm carRenterForm) {
        if (carRenterForm.getPassword() != carRenterForm.getRepeatedPassword()) {
            return new ResponseEntity<Object>(new JsonError("CB_001", "password has to be the same"),
                    HttpStatus.BAD_REQUEST);
        }
    }
}
