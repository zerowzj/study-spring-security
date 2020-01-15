package study.spring.security.auth.details;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import study.spring.security.dao.popedomfunction.PopedomFunctionDao;
import study.spring.security.dao.popedomfunction.PopedomFunctionEO;
import study.spring.security.dao.useradmin.UserAdminDao;
import study.spring.security.dao.useradmin.UserAdminEO;

import java.util.ArrayList;
import java.util.List;

/**
 * 认证服务
 *
 * @author wangzhj
 */
public class CustomUserDetailsService implements UserDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomUserDetailsService.class);

    @Autowired
    private UserAdminDao userAdminDao = null;
    @Autowired
    private PopedomFunctionDao popedomFunctionDao = null;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //获取用户信息
        UserAdminEO uaEO = userAdminDao.getAdminByLoginName(username);
        if (uaEO == null) {
            throw new UsernameNotFoundException("用户名/密码错误");
        }

        //获取角色功能列表
        Long prId = uaEO.getUaPrId();
        List<PopedomFunctionEO> pfEOLt = popedomFunctionDao.getRoleFunctionLt(prId, null);

        //生成用户详情
        CustomUserDetails userDetails = new CustomUserDetails(username, uaEO.getUaLoginPwd(), getGrantedLt(pfEOLt));

        //返回
        return userDetails;
    }

    private List<SimpleGrantedAuthority> getGrantedLt(List<PopedomFunctionEO> pfEOLt) {
        List<SimpleGrantedAuthority> grantedLt = new ArrayList<>();
        SimpleGrantedAuthority granted = null;
        for (PopedomFunctionEO pfEO : pfEOLt) {
            String path = pfEO.getPfPath();
            granted = new SimpleGrantedAuthority(path);
            grantedLt.add(granted);
        }
        return grantedLt;
    }
}
