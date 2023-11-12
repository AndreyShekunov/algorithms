package Homework.RobotService;

@RestController
@RequestMapping("/api/robot")
public class RobotController {
    @GetMapping("/{id}")
    public Robot getRobotById() {
        return getRobotById(0);
    }

    @GetMapping("/{id}")
    public Robot getRobotById(@PathVariable int id) {
        // Реализация получения информации о роботе
    }

    @PostMapping
    public void addRobot(@RequestBody Robot robot) {
        // Реализация добавления нового робота
    }

    @PutMapping("/{id}")
    public void updateRobot(@PathVariable int id, @RequestBody Robot robot) {
        // Реализация обновления информации о роботе
    }

    @DeleteMapping("/{id}")
    public void deleteRobot(@PathVariable int id) {
        // Реализация удаления робота
    }
}
