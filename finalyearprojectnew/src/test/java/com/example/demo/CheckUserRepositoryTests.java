package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
 
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CheckUserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private CheckUserRepository checkrepo;
    
    @Test
    public void testCreateUser() {
        checkoutusers user = new checkoutusers();
        user.setMobile("7989935086");
        user.setEmail("veerubhotlaharika@gmail.com");
        user.setFirstName("harika");
        user.setLastName("veerubhotla");
        user.setCity("Vijayawada");
        user.setCountry("India");
        
         
        checkoutusers savedUser = checkrepo.save(user);
         
        checkoutusers existUser = entityManager.find(checkoutusers.class, savedUser.getId());
         
        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
         
    }
    
    @Test
    public void testFindUserByEmail()
    {
    	String email ="veerubhotlaharika@gmail.com";
    	checkoutusers user = checkrepo.findByEmail(email);
    	assertThat(user).isNotNull();
    }
    
}