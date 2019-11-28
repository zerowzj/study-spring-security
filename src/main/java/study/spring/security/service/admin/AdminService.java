package study.spring.security.service.admin;

import study.spring.security.dao.useradmin.UserAdminEO;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

/**
 * 用户信息服务
 *
 * @author wangzhj
 */
public interface AdminService {

    public void addAdmin(UserAdminEO uaEO);

    /**
     * 查询角色
     *
     * @param ubLoginName   角色名称
     * @param pageNo   页码
     * @param pageSize 页大小
     * @return PageList<PopedomRoleEO>
     */
    public PageList<UserAdminEO> getAdminPageLt(String ubLoginName, int pageNo, int pageSize);
}
