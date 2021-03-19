@Controller
public class Hello {
    @RequestMapping("/gotoa")
    public String showWordA(){
        return "/a.html";
    }
    @RequestMapping("/gotob")
    public String showWordB(){
        return "/b.html";
    }
}
