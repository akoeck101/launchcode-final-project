package com.launchcode.adrienne.FinalProjectTest.models.data;

import com.launchcode.adrienne.FinalProjectTest.models.Post;
import com.launchcode.adrienne.FinalProjectTest.models.Snake;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PostDao extends CrudRepository<Post, Integer> {
//    Snake findByCategory(Snake category);
}
