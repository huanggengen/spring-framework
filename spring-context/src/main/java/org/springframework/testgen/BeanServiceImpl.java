package org.springframework.testgen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * create ->B -new -》aop -》 lifeclycallback -》 自动注入-》xxxx
 * init  -》 postconstruct
 *
 * @author shugen.huang
 * @date 2020/4/16 10:26
 */
@Service
public class BeanServiceImpl implements BeanTestService {

  /**
   * new  bean
   *
   * BeanPostProcessor
   *
   * PostConstruct
   *
   * */

  @Autowired
	BServiceImpl bService;

  @PostConstruct
  public void test1() {
    System.out.println("BeanServiceImpl 构造完成回调");
  }

  public BeanServiceImpl() {
    System.out.println("BeanServiceImpl 初始化");
  }

	@Override
	public void say() {
    System.out.println("BeanServiceImpl 测试代理：目标对象逻辑");
	}
}
