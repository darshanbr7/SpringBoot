package com.user2.repositery;

import java.util.List;
import org.springframework.stereotype.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface BlogRespository extends JpaRepository {
 List findByTitleContainingOrContentContaining(String text, String textAgain); 

}
