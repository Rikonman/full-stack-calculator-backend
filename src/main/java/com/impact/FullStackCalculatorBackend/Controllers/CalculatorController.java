package com.impact.FullStackCalculatorBackend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/add/{firstNumber}/{secondNumber}")
    public int AddNumbers(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return firstNumber + secondNumber;
    }
    @GetMapping("/subtract/{firstNumber}/{secondNumber}")
    public int SubtractNumbers(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return firstNumber - secondNumber;
    }
    @GetMapping("/multiply/{firstNumber}/{secondNumber}")
    public int MultiplyNumbers(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return firstNumber * secondNumber;
    }
}
