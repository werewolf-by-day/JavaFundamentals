public class Project {
	private String name;
	private String description;

	public Project() {
	}

	public Project(String name) {
		this.name = name;
	}

	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
		
	public String getName() {
		return name;
	}

	public void setName() {
		name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription() {
		description = description;
	}

	public String elevatorPitch() {
		return name + " : " + description;
	}

}