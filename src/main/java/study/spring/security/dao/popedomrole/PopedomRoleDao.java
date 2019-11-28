package study.spring.security.dao.popedomrole;

import com.company.db.dao.BaseDao;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

/**
 * 角色Dao
 *
 * @author wangzhj
 */
public interface PopedomRoleDao extends BaseDao<PopedomRoleEO> {

    /**
     * 获取角色列表
     *
     * @param prName 角色名称
     * @param pageNo 页码
     * @param pageSize 页大小
     * @return PageList<PopedomRoleEO>
     */
    public PageList<PopedomRoleEO> getRolePageLt(String prName, int pageNo, int pageSize);
}
