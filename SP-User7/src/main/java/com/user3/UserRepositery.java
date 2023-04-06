package com.user3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositery extends JpaRepository<User, Long> {
	
}
