package study.spring.security.service.role;

import study.spring.security.dao.popedomrole.PopedomRoleEO;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

/**
 * 角色服务
 *
 * @author wangzhj
 */
public interface RoleService {

    /**
     * 查询角色
     *
     * @param prName   角色名称
     * @param pageNo   页码
     * @param pageSize 页大小
     * @return PageList<PopedomRoleEO>
     */
    public PageList<PopedomRoleEO> getRolePageLt(String prName, int pageNo, int pageSize);

    /**
     * 新增角色
     *
     * @param prEO 角色信息
     */
    public void addRole(PopedomRoleEO prEO);
}
