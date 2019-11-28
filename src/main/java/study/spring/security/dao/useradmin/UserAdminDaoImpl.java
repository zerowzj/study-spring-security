package study.spring.security.dao.useradmin;

import com.company.db.dao.BaseDaoImpl;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("userAdminDao")
public class UserAdminDaoImpl extends BaseDaoImpl<UserAdminEO> implements UserAdminDao {

    @Override
    public UserAdminEO getAdminByLoginName(String uaLoginName) {
        return getSqlSession().selectOne(getSqlId("getAdminByLoginName"), uaLoginName);
    }

    @Override
    public PageList<UserAdminEO> getAdminPageLt(String uaLoginName, int pageNo, int pageSize) {
        Map<String, Object> params = new HashMap<>();
        params.put("uaLoginName", uaLoginName);
        PageBounds pageBounds = new PageBounds(pageNo, pageSize);
        return (PageList) getSqlSession().selectList(getSqlId("getAdminPageLt"), params, pageBounds);
    }
}
