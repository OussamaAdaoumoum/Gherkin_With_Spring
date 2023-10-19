package com.example.springgherkin;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;


@CucumberContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
        classes = SpringGherkinApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class SpringIntegrationTest {

    protected RestTemplate restTemplate = new RestTemplate();

    protected final String DEFAULT_URL = "http://localhost:8082/";


}

