
package com.example.exampleapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Map<String, Object>> getEmployees() {
        return List.of(
            Map.of("id", 1, "name", "Priya", "role", "Developer"),
            Map.of("id", 2, "name", "Rahul", "role", "Tester")
        );
    }
}
