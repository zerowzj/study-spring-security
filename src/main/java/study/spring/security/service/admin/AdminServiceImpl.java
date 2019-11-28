package study.spring.security.service.admin;

import study.spring.security.dao.useradmin.UserAdminDao;
import study.spring.security.dao.useradmin.UserAdminEO;
import com.company.project.dao.userbase.UserBaseDao;
import com.company.project.dao.userbase.UserBaseEO;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserAdminDao userAdminDao = null;


    @Override
    public void addAdmin(UserAdminEO uaEO) {

    }

    @Override
    public PageList<UserAdminEO> getAdminPageLt(String prName, int pageNo, int pageSize) {
        return userAdminDao.getAdminPageLt(prName, pageNo, pageSize);
    }
}
