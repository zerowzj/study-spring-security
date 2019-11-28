package study.spring.security.controller.admin;

import study.spring.security.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 管理员控制器
 *
 * @author wangzhj
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService = null;

    @RequestMapping("/toAdd")
    public ModelAndView toAdd(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/admin/adminAdd");
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpServletResponse response) {
        return "redirect:/admin/toList";
    }

    @RequestMapping("/toList")
    public ModelAndView toList(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/admin/adminList");
    }
}
