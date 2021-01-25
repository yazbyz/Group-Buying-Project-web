package prj.gbp.model.dao;

import prj.gbp.model.dto.UserDTO;

public interface UserDAO {
	
	public void insertUser(UserDTO user);
	
	public void readUser(String user_id);
	
	public void updateUser(UserDTO user);
	
	public void deleteUser(String user_id);

}
