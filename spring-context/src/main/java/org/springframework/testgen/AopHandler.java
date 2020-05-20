package org.springframework.testgen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * todo
 *
 * @author shugen.huang
 * @date 2020/5/12 15:41
 */
public class AopHandler implements InvocationHandler {
	Object o ;
	public AopHandler(Object obj){
		this.o=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("aop-----前置");
		Object result = method.invoke(o);
		System.out.println("aop-----后置");
		return result;
	}
}
