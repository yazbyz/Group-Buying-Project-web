package com.gbp.webprj.repository.mapper;

import com.gbp.webprj.model.ProfileInfo;

public interface ParticipationMapper {

	void acceptParticipation(int requesterId);
	
	void rejectParticipation(int requesterId);
	
	void finishParticipation(int participationId);
	
	ProfileInfo selectProfileInfo(int id);
	
	void updateSuggesterRate(double suggesterRate);
	
	void updateRequesterRate(double requesterRate);
	
}
