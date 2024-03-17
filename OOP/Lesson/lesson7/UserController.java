package OOP.Lesson.lesson7;

//@Controller
public class UserController {

//    @GetMapping("/user")
    public String getUsers() {
        // загрузит всех юзеров из бд
        return "user.html";
    }

}
