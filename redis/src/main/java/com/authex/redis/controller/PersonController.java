package com.authex.redis.controller;

import com.authex.redis.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
//base uri
@RequestMapping("/api")
public class PersonController {

    @RequestMapping(value = {"/person", "/getPerson", "/data"},
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person getPerson(){
        return new Person(1L,"Tanveer",23);
    }

    @GetMapping(value = "/allPerson",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> getAll(){
        return Arrays.asList(
                new Person(1L,"Tanveer",23),
                new Person(2L,"Tanveer",23),
                new Person(3L,"Tanveer",23)
        );
    }

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        return new ResponseEntity<>(person,HttpStatus.CREATED);
    }
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Person> updatePerson(@RequestBody Person person,@PathVariable Long id){
        person.setId(id);
        return ResponseEntity.ok(person);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable Long id){
        return ResponseEntity.ok("Book deleted successfully...");
    }

//    @PathVariable
//    localhost:8080/api/person/1/Tanveer/24
    @GetMapping("/person/{id}/{name}/{age}")
    public ResponseEntity<Person> pathVariableDemo(@PathVariable("id") Long p_id,
                                                   @PathVariable String name,
                                                   @PathVariable Integer age){
        Person person = new Person();
        person.setId(p_id);
        person.setName(name);
        person.setAge(age);
        return ResponseEntity.ok(person);

    }

//    @RequestParam
//http://localhost:808/api/person/query?id=1&name=Tanveer&age=24
    @GetMapping("/person/query")
    public ResponseEntity<Person> requestParamDemo(@RequestParam(name = "id") Long id,
                                                   @RequestParam(name = "name") String name,
                                                   @RequestParam(name = "age") Integer p_age){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setAge(p_age);
        return ResponseEntity.ok(person);

    }

}

