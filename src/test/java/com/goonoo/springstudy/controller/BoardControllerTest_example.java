package com.goonoo.springstudy.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// WebMvcTest 예제 ///

//@ExtendWith(SpringExtension.class)
//@WebMvcTest // Controller 만 메모리에 올림
//public class BoardControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void testHello() throws Exception {
//        mockMvc.perform(get("/hello").param("name", "둘리"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello : 둘리"))
//                .andDo(print());
//    }
//}

///// @AutoConfigureMockMvc 사용 예제

//@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
//@AutoConfigureMockMvc // Service, Repository 모두 메모리에 올림
//public class BoardControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void testHello() throws Exception {
//        mockMvc.perform(get("/hello").param("name", "둘리"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello : 둘리"))
//                .andDo(print());
//    }
//}

///// MockMvc 객체를 목업하여 테스트하는 것이 아닌, 내장 톰캣으로 테스트하는 예제

@ExtendWith(SpringExtension.class) // junit5에선 RunWith 대신 이걸 쓴다
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BoardControllerTest_example {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHello() throws Exception {
        String result = restTemplate.getForObject("/hello?name=둘리", String.class);
        assertEquals("Hello : 둘리", result);
    }
}