package vo;

import java.util.Objects;

public class ManagerVO {
	private String managerId;
	private String name;
	private String password;
	
	public ManagerVO(String managerId, String name, String password) {
		 setManagerId(managerId);
		 setName(name);
		 setPassword(password);
	}
	
	public ManagerVO(String managerId, String name) {
		 setManagerId(managerId);
		 setName(name);
	}
	
	public String getManagerId() {
		return managerId;
	}
	
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(managerId, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ManagerVO other = (ManagerVO) obj;
		return Objects.equals(managerId, other.managerId) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "ManagerVO [managerId=" + managerId + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}
