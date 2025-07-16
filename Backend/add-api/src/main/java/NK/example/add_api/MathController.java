package NK.example.add_api;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class MathController {

    @GetMapping("/add")
    public Map<String, Integer> add(@RequestParam int a, @RequestParam int b) {
        int sum = a + b;
        Map<String, Integer> result = new HashMap<>();
        result.put("sum", sum);
        return result;
    }
}