package study.spring.security.web.controller.function;

import study.spring.security.dao.popedomfunction.PopedomFunctionEO;
import study.spring.security.service.function.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能路由器
 *
 * @author wangzhj
 */
@Controller
@RequestMapping("/function")
public class FunctionController {

    @Autowired
    private FunctionService functionService = null;

    @RequestMapping("/list")
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> model = new HashMap();

        List<PopedomFunctionEO> functionLt = functionService.getFunctionLt();
        //
        model.put("dataLt", functionLt);
        //
        return new ModelAndView("function/functionList", model);
    }
}
