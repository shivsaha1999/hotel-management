package hotel.payload.request;


import java.util.Set;

import javax.validation.constraints.*;

 
public class SignupRequest {
	
    @NotBlank
    @Size(min = 5, max = 20)
    private String username;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
    
    @NotBlank
	private String city;
	
    @NotBlank
	@Size(min=13, max=13)
	private String uid;
	
    @NotBlank
    @Size(min=6, max=10)
	private String phone;
    
    private Set<String> role;
  
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid=uid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
    }
}
