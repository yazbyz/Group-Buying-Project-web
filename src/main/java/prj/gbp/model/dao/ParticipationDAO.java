package prj.gbp.model.dao;

import prj.gbp.model.dto.ParticipationDTO;

public interface ParticipationDAO {
	
	public void insertParticipation(ParticipationDTO user);
	
	public void readParticipation(String participation_id);
	
	public void updateParticipation(ParticipationDTO user);
	
	public void deleteParticipation(String participation_id);

}
