package study.spring.security.auth.details;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * 用户详情
 *
 * @author wangzhj
 */
public class CustomUserDetails implements UserDetails {

    /* 登录名 */
    private String loginName;
    /* 登录密码 */
    private String loginPwd;
    /* 授权 */
    private List<SimpleGrantedAuthority> grantedAuthLt = null;

    public CustomUserDetails(String loginName, String loginPwd, List<SimpleGrantedAuthority> grantedAuthLt) {
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.grantedAuthLt = grantedAuthLt;
    }

    @Override
    public List<SimpleGrantedAuthority> getAuthorities() {
        return this.grantedAuthLt;
    }

    @Override
    public String getPassword() {
        return this.loginPwd;
    }

    @Override
    public String getUsername() {
        return this.loginName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
