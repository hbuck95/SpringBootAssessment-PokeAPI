package com.bae.rest;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.business.PokeServiceImpl;

@RunWith(SpringRunner.class)
public class PokeControllerTest {

	@Mock
	private PokeServiceImpl service;

	@Mock
	private RestTemplate restTemplate;

	@InjectMocks
	private PokeController controller;

}
