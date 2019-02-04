package lt.mykolaspinkevicius.itemSystem.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.mykolaspinkevicius.itemSystem.entities.Comment;
import lt.mykolaspinkevicius.itemSystem.repositories.CommentJPARepository;

@Service
@Transactional
public class CommentsService {
	
	@Autowired
	private CommentJPARepository repository;
	
	public int createComment(Comment comment) {
		return repository.save(comment).getId();
	}

}
