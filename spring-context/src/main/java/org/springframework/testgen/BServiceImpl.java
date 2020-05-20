package org.springframework.testgen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * todo
 *
 * @author shugen.huang
 * @date 2020/5/12 17:23
 */
@Service
public class BServiceImpl {

	public BServiceImpl(){
    System.out.println("BServiceImpl 构造完成");
	}


	@PostConstruct
	public void test1() {
		System.out.println("BServiceImpl 构造完成回调");
	}

}
