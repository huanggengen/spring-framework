package org.springframework.testgen;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @author shugen.huang
 * @date 2020/4/16 10:26
 */
@Component
public class AopTestBeanPostProcessor implements BeanPostProcessor {

  /**
   * new 初始话之后
   * @param bean the new bean instance
   * @param beanName the name of the bean
   * @return
   * @throws BeansException
   */
  @Override
  public Object postProcessAfterInitialization(@NotNull Object bean, String beanName) throws BeansException {
  	// 添加一个代理对象
    if ("beanTest".equals(beanName)) {
      Class<?> anInterface = bean.getClass().getInterfaces()[0];

		return Proxy.newProxyInstance(
			AopTestBeanPostProcessor.class.getClassLoader(), new Class<?>[] {anInterface}, new AopHandler(bean));
    }
    return bean;
  }
}
