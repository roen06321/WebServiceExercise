package com.example.roenvincentramirezspringwebexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping("/sample")
public class Controller {

    @Autowired
    private Service autoService;

    @GetMapping(value = "/users")
    public ResponseEntity<String> getMapping(){
        return new ResponseEntity<String>("get all users", HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<String> postMapping(@RequestBody User user){
        String returnValue = autoService.getUser(user);
        return new ResponseEntity<String>(returnValue, HttpStatus.OK);
    }

    @PutMapping(value = "/users/{id}")
    public ResponseEntity<String> putMapping(@PathVariable("id") String test) {
        return new ResponseEntity<String>(test + " This is a put mapping", HttpStatus.OK);
    }

    @DeleteMapping(value = "/users")
    public ResponseEntity<String> deleteMapping(@RequestParam(value = "personId", defaultValue = "8985516") String personId) {
        return new ResponseEntity<String>(personId + " This is a delete mapping", HttpStatus.OK);
    }
}
