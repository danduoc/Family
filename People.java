package GiaDinh;

public class People {
	private String name;
	private int age;
	private String job;
	private String id;

	public People() {
		super();
	}

	public People(String name, int age, String job, String id) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.id = id;
	}

	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Job: " + this.job);
		System.out.println("Id: " + this.id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
