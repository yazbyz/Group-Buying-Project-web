package prj.gbp.model.dao;

import prj.gbp.model.dto.UserDTO;

public interface UserDAO {
	
	public void insertUser(UserDTO user);
	
	public void readUser(UserDTO user);
	
	public void updateUser(UserDTO user);
	
	public void deleteUser(UserDTO user);

}
