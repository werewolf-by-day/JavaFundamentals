class ProjectTest {
	public static void main(String[] args) {
		Project proj1 = new Project();
		Project proj2 = new Project("Project Mayhem");
		Project proj3 = new Project("Project Runway", "Make it Happen");

		System.out.println(proj1.elevatorPitch());
        System.out.println(proj2.elevatorPitch());
        System.out.println(proj3.elevatorPitch());
    }
}
