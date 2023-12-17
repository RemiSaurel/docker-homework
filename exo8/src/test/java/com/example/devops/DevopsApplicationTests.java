package com.example.devops;

import com.example.devops.domain.Person;
import com.example.devops.domain.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = DevopsApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(
        locations = "classpath:application-integrationtest.properties")
class DevopsApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private PersonRepository personRepo;

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("John", "Doe", 25, "john.doe@here.com");
        person = personRepo.save(person);
    }

    @Test
    void testGet() throws Exception {
        // on teste que le client est bien créé
        mvc.perform(get("/api/persons"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].firstname", is(person.getFirstname())))
                .andExpect(jsonPath("$[0].lastname", is(person.getLastname())))
                .andExpect(jsonPath("$[0].age", is(person.getAge())))
                .andExpect(jsonPath("$[0].email", is(person.getEmail())));
    }

}
