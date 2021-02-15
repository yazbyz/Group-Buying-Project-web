package com.gbp.webprj.model;

public class ParticipationDto {

	// field
	String participation_id;
	String posting_id;
	String request_id;
	String step;
	String rate_suggester;
	String rate_requester;

	// constructor
	public ParticipationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getter & setter
	public String getParticipation_id() {
		return participation_id;
	}

	public void setParticipation_id(String participation_id) {
		this.participation_id = participation_id;
	}

	public String getPosting_id() {
		return posting_id;
	}

	public void setPosting_id(String posting_id) {
		this.posting_id = posting_id;
	}

	public String getRequest_id() {
		return request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public String getRate_suggester() {
		return rate_suggester;
	}

	public void setRate_suggester(String rate_suggester) {
		this.rate_suggester = rate_suggester;
	}

	public String getRate_requester() {
		return rate_requester;
	}

	public void setRate_requester(String rate_requester) {
		this.rate_requester = rate_requester;
	}

	// toString
	@Override
	public String toString() {
		return "ParticipationDTO [participation_id=" + participation_id + ", posting_id=" + posting_id + ", request_id="
				+ request_id + ", step=" + step + ", rate_suggester=" + rate_suggester + ", rate_requester="
				+ rate_requester + "]";
	}
}
