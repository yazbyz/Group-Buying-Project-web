package prj.gbp.model.dto;

public class UserDTO {
	
	//field
	String user_id;
	String nickname;
	String email;
	String image; //이미지
	String suggest_rate;
	String request_rate;
	String access_token;
	String expires_in;
	String token_type;
	String id_token;
	
	//constructor
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter & setter
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSuggest_rate() {
		return suggest_rate;
	}
	public void setSuggest_rate(String suggest_rate) {
		this.suggest_rate = suggest_rate;
	}
	public String getRequest_rate() {
		return request_rate;
	}
	public void setRequest_rate(String request_rate) {
		this.request_rate = request_rate;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getId_token() {
		return id_token;
	}
	public void setId_token(String id_token) {
		this.id_token = id_token;
	}
	
	//toString
	@Override
	public String toString() {
		return "UserDTO [user_id=" + user_id + ", nickname=" + nickname + ", email=" + email + ", image=" + image
				+ ", suggest_rate=" + suggest_rate + ", request_rate=" + request_rate + ", access_token=" + access_token
				+ ", expires_in=" + expires_in + ", token_type=" + token_type + ", id_token=" + id_token + "]";
	}
	

}
