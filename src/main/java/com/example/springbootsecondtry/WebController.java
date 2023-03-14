package com.example.springbootsecondtry;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/helloworld")
public class WebController {

    String name = "";

    @GetMapping("/de")
    public String getGreetings() {
        return "Hallo" + name;
    }

    @GetMapping("/getNameLength")
    public int getLength() {
        return name.length();
    }

    @GetMapping("/getName")
    public String getName() {
        return "Der Name " + name + " besitzt " + name.length() + " Buchstaben .";
    }




//    @GetMapping("/{name}")
//    public String getGreetings(@PathVariable String name, @RequestParam String helloworld) {
//        return helloworld + " " +  name;
//    }
//
       @PostMapping
       public void addName(@RequestBody String newName) {
       name = newName;


  }

}
