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
        col.add(new Dog("Mr. Vuff3", "http://i.giphy.com/8belcgd05xKUM.gif", "2", "Vuf!"));
        col.add(new Dog("Mr. Vuff4", "http://i.giphy.com/b9pK1N3lrYkCc.gif", "2", "Vuf Vuf!"));
        col.add(new Dog("Mr. Vuff5", "http://i.giphy.com/XFl25q22vH2O4.gif", "2", "Vuf!"));
        col.add(new Dog("Mr. Vuff6", "http://i.giphy.com/fW9Wg5uTY5HUc.gif", "2", "Vuf!"));
        return new ResponseEntity<>(col, HttpStatus.OK);
    }

    @RequestMapping("/dogs/version")
    public ResponseEntity<String> version(){
        return new ResponseEntity<>("v2", HttpStatus.OK);
    }
}
