package org.springframework.testgen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * todo
 *
 * @author shugen.huang
 * @date 2020/4/16 10:21
 */
public class Test {

  public static void main(String[] args) {
  	// init
	  AnnotationConfigApplicationContext context =
			  new AnnotationConfigApplicationContext(AppConfig.class);

	  BeanTestService bean = context.getBean(BeanTestService.class);
	  bean.say();
  }
}
