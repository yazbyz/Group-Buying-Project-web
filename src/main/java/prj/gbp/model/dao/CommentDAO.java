package prj.gbp.model.dao;

import prj.gbp.model.dto.CommentDTO;

public interface CommentDAO {
	
	public void insertComment(CommentDTO comment);
	
	public void readComment(CommentDTO comment);
	
	public void updateComment(CommentDTO comment);
	
	public void deleteComment(CommentDTO comment);

}
