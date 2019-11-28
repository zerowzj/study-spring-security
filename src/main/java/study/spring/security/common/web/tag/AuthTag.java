package study.spring.security.common.web.tag;

import study.spring.security.common.web.session.SessionUtil;

import javax.servlet.jsp.JspException;
import java.util.List;

/**
 * 授权标签
 *
 * @author wangzhj
 */
public class AuthTag extends BaseTag {

    /** 授权编号 */
    private Long authId = null;

    @Override
    public int doStartTag() throws JspException {
        List<Long> permissionIdLt = SessionUtil.getSessionAuthIdLt(getHttpServletRequest());
        if (permissionIdLt.contains(authId)) {
            return EVAL_BODY_INCLUDE;
        } else {
            write("禁止访问");
            return SKIP_BODY;
        }
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }
}
