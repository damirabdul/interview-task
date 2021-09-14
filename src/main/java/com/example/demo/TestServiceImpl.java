package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public void test() {
		this.transactional();
	}

	@Transactional
	public void transactional() {
		System.out.println("Transactional");
	}

}
