package hotel.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Entity
@Table( name="user", uniqueConstraints = {@UniqueConstraint(columnNames = "username"), @UniqueConstraint(columnNames = "uid")} )
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "*Please provide a username")
	@Size(min=5)
	private String username;
	
	@NotEmpty(message = "*Please provide a password")
	@Size(min=6)
	private String password;
	
	@NotEmpty(message = "*Please provide a city")
	@Size(max = 50)
	private String city;
	
	@PositiveOrZero(message = "*Only positive number")
	@Size(min=13,max=13)
	private String uid;
	
	@PositiveOrZero(message = "*Only positive number")
	@Size(min=6,max=10)
	private String phone;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();
	
	
	public User() {
	}
	
	

	public User(String username, String password, String city, String uid, String phone) { 
		this.username = username;
		this.password = password;
		this.city = city;
		this.uid = uid;
		this.phone = phone;
	}



	public User(Integer id, String username, String password, String city, String uid, String phone) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.city = city;
		this.uid = uid;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
		this.uid = uid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	 
	public void addRole(Role role) {
		roles.add(role);
	}
	
	
	

}
