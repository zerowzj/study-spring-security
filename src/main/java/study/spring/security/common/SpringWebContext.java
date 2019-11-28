package study.spring.security.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spring Web上下文
 *
 * @author wangzhj
 */
public class SpringWebContext implements ApplicationContextAware {

    private static ApplicationContext context = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * 获取Bean
     *
     * @param name
     * @return T
     */
    public static <T> T getBean(String name) {
        T obj = (T) context.getBean(name);
        return obj;
    }

    /**
     * 获取Bean
     *
     * @param clazz
     * @return T
     */
    public static <T> T getBean(Class<T> clazz) {
        T obj = (T) context.getBean(clazz);
        return obj;
    }

    /**
     * 是否存在Bean
     *
     * @param name
     * @return boolean
     */
    public static boolean containsBean(String name) {
        return context.containsBean(name);
    }

    /**
     * 是否存在Bean
     *
     * @param clazz
     * @return boolean
     */
    public static boolean containsBean(Class<?> clazz) {
        boolean isExist = false;
        if(context.getBean(clazz) != null){
            isExist = true;
        }
        return isExist;
    }
}
