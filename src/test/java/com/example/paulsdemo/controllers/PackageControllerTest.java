package com.example.paulsdemo.controllers;

import com.example.paulsdemo.models.Package;
import com.example.paulsdemo.repositories.PackageRepository;
import com.example.paulsdemo.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = PackageController.class)
public class PackageControllerTest {

    @MockBean
    private static PackageRepository mockRepository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void whenValidInput_thenReturns200() throws Exception {
        Package p = new Package();

        ResultActions r = mockMvc.perform(post("/api/v1/package"))
                .andDo(print()).andExpect(status().isCreated());
    }

    @Test
    void test_get_packg_with() throws Exception {
        Package p = new Package();

        ResultActions r = mockMvc.perform(post("/api/v1/package"))
                .andDo(print()).andExpect(status().isCreated());
    }
}
