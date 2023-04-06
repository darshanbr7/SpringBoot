package com.user3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class UserRepositeryTests {
	
	@Autowired
	private UserRepositery repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		User user=new User();
		user.setEmail("darshanbr@gmail.com");
		user.setPassword("darshan2001");
		user.setFirstname("Darshan");
		user.setLastname("BR");
		
		 User saveUser=repo.save(user);
		 
		User existUser= entityManager.find(User.class, saveUser.getId());
		
		assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
	}

}
