package study.spring.security.service.function;

import study.spring.security.dao.popedomfunction.PopedomFunctionDao;
import study.spring.security.dao.popedomfunction.PopedomFunctionEO;
import study.spring.security.dao.popedomfunction.RoleFunctionConfVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("functionService")
public class FunctionServiceImpl implements FunctionService {

    @Autowired
     private PopedomFunctionDao popedomFunctionDao;

    @Override
    public List<PopedomFunctionEO> getFunctionLt() {
        return popedomFunctionDao.getFunctionLt(null);
    }

    @Override
    public List<RoleFunctionConfVO> getRoleFunctionConfLt(Long prId) {
        return popedomFunctionDao.getRoleFunctionConfLt(prId);
    }

    @Override
    public List<PopedomFunctionEO> getRoleFunctionLt(Long prId) {
        return popedomFunctionDao.getRoleFunctionLt(prId, null);
    }
}
