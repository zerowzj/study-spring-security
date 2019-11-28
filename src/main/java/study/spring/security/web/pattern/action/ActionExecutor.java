package study.spring.security.web.pattern.action;

import study.spring.security.common.SpringWebContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Action执行器
 *
 * @author wangzhj
 */
public abstract class ActionExecutor {

    /**
     * 执行Action
     *
     * @param request
     * @param response
     * @param clazz 执行类
     * @param param 参数
     * @return Map<String, Object>
     */
    public static Map<String, Object> execute(HttpServletRequest request, HttpServletResponse response,
                                              Class<? extends Action> clazz, Object param) {
        checkExist(clazz);
        Action action = SpringWebContext.getBean(clazz);
        return action.doExecute(request, response, param);
    }

    /*
     * 执行Action
     *
     * @param request
     * @param response
     * @param clazz 执行类
     * @return Map<String, Object>
     */
    public static Map<String, Object> execute(HttpServletRequest request, HttpServletResponse response,
                                              Class<? extends Action> clazz) {
        checkExist(clazz);
        Action action = SpringWebContext.getBean(clazz);
        Map<String, Object> paramMap = null;
        return action.doExecute(request, response, paramMap);
    }

    private static void checkExist(Class<? extends Action> clazz){
        if (clazz == null) {
            throw new IllegalStateException("Bean Class不能为空！");
        }
        if (!SpringWebContext.containsBean(clazz)) {
            throw new IllegalStateException("未包含类型[" + clazz.getName() + "]Bean！");
        }
    }
}
