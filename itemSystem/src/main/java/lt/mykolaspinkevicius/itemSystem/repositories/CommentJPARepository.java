package lt.mykolaspinkevicius.itemSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lt.mykolaspinkevicius.itemSystem.entities.Comment;

@Repository
public interface CommentJPARepository extends JpaRepository<Comment, Integer> {

}
