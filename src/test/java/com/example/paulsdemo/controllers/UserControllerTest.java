package com.example.paulsdemo.controllers;

import com.example.paulsdemo.models.User;
import com.example.paulsdemo.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.*;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private static UserRepository mockRepository;


    @Test
    void whenValidInput_thenReturns200() throws Exception {
        User user = new User("Paul", "Developer");
        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        when(mockRepository.findAll()).thenReturn(users);

        String expectedJson = "[{\"id\":null,\"name\":\"Paul\",\"role\":\"Developer\"}]";
        ResultActions r = mockMvc.perform(get("/users"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content().json(expectedJson));
    }



}