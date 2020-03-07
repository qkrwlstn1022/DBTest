package jinsuper.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

    @Autowired
    private SqlSession session;
    private static String namespace = "boardMapper";

    @RequestMapping(value = "/home")
    public String showHome(Model model){
        System.out.println("step 1");
        model.addAttribute("test","테스트중 입니다.");

        System.out.println("step 2");
        System.out.println(session.selectOne(namespace+".test1").toString());

        System.out.println("step 3");
//        session.selectOne(namespace+".test1");

        System.out.println("success");

        return "home";
    }
}
