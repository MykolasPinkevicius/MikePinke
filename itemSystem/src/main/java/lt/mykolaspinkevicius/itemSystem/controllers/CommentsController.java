package lt.mykolaspinkevicius.itemSystem.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lt.mykolaspinkevicius.itemSystem.entities.Comment;
import lt.mykolaspinkevicius.itemSystem.services.CommentsService;

@RestController
@RequestMapping("/comments")

public class CommentsController {

	@Autowired 
	CommentsService service;
	
	@PostMapping
	@ResponseStatus(value=HttpStatus.CREATED)
	public int createCommentById(@RequestBody Comment comment) {
		return service.createComment(comment);
	}
}
