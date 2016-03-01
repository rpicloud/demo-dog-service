package com.rpicloud.controllers;

import com.rpicloud.models.Dog;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaspernissen on 01/03/2016.
 */
@RestController
public class DogRestController {

    @RequestMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllCats(){
        List<Dog> col = new ArrayList<>();
        col.add(new Dog("Mr. Vuff", "http://i.giphy.com/6lsW1YMkojWrC.gif", "2", "VuuuF!"));
        col.add(new Dog("Mr. Vuff1", "http://i.giphy.com/fpXxIjftmkk9y.gif", "2", "VuuuuuuuFFiii!"));
        col.add(new Dog("Mr. Vuff2", "http://i.giphy.com/l3nWl5bhBoim7glNu.gif", "2", "Aarh!"));
        return new ResponseEntity<>(col, HttpStatus.OK);
    }
}
