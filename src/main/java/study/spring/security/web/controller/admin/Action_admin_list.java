package study.spring.security.web.controller.admin;

import study.spring.security.dao.useradmin.UserAdminEO;
import study.spring.security.service.admin.AdminService;
import study.spring.security.web.pattern.action.BaseAction;
import study.spring.security.web.pattern.context.RequestContext;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户列表Action
 *
 * @author wangzhj
 */
@Component
public class Action_admin_list extends BaseAction<Map<String, Object>> {

    @Autowired
    private AdminService adminService = null;

    @Override
    public void checkData(RequestContext requestContext, Map<String, Object> param) {
       /* if (true) {
            throw new ParamEmptyValueException("ubLoginName");
        }*/
    }

    @Override
    public Map<String, Object> execute(RequestContext requestContext, Map<String, Object> param) {
        Map<String, Object> data = new HashMap<>();

        String ubLoginName = requestContext.getRequest().getParameter("ubLoginName");
        String pageNo = requestContext.getRequest().getParameter("pageNo");
        if (pageNo == null) {
            pageNo = "1";
        }
        String pageSize = requestContext.getRequest().getParameter("pageSize");
        if (pageSize == null) {
            pageSize = "10";
        }

        PageList<UserAdminEO> uaEOLt = adminService.getAdminPageLt(ubLoginName, Integer.valueOf(pageNo), Integer.valueOf(pageSize));
        data.put("ubEOLt", uaEOLt);
        data.put("pageNo", uaEOLt.getPaginator().getPage());
        data.put("pageSize", uaEOLt.getPaginator().getLimit());
        data.put("totalCount", uaEOLt.getPaginator().getTotalCount());
        return data;
    }
}
