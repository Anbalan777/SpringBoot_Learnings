package com.example.Springannotation;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @GetMapping("/emp")
    public String getEmployee()
    {
        return "Employee";
    }

    //Path variable
    @GetMapping("/{id}")
    public String getsalary(@PathVariable int id)
    {
        return "This is your id "+id;
    }

    //Request Param
    @GetMapping("/requestparam")
   public String getempbyid(@RequestParam ("empid") int id)
    {
         return "the Salary token number is "+id;
    }
    @GetMapping("/create")
    public String getemp_by_id(@RequestParam String name,@RequestParam String password)
    {
        return "username = "+name+" "+"Password" +password;

    }

    @GetMapping("/create1")
    public String getemp_byid(@RequestParam ("username")String name,@RequestParam ("pass") String password)
    {

        return "username = "+name+" "+"Password" +password;
    }

    // Postmapping and requestbody
    @PostMapping("/createpost")
public String creatpost(@RequestBody String text)
    {
        return text;
    }

    // PutMappint
    @PutMapping("/{id}")
    public String update(@PathVariable int id)
    {
        return "This user "+id+" Successfully updated";
    }

    // DeleteMapping
    @DeleteMapping ("/{id}")
    public String delete(@PathVariable int id)
    {
        return "This user "+id+" Successfully deleted";
    }
    //sd
}
