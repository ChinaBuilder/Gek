package com.it;

import org.springframework.stereotype.Repository;

/**
 * Created by KAY on 2016/11/6.
 */
@Repository
public interface Animal {
	public String sayWord();

	public void doMySelf();

	public void eatSomething();
}
