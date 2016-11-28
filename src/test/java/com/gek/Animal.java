package com.gek;

import org.springframework.stereotype.Repository;

/**
 * Created by KAY on 2016/11/6.
 */
@Repository
public interface Animal {
	public String sayWord();

	public void doMySelf();

	public void eatSomething();
	public void test();
}
