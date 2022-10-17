package hw1;

public class student {
	String name, colour, animal;
	int grade;
	int age;
	int mark1, mark2, mark3, mark4;
	double average;
	
	//public student

	public student(String favColour, String favAnimal) {
		// constructor method(?) where i overload student class(?) with different parameters
			this.colour = favColour;
			this.animal = favAnimal;
	}
	
	
	
	public student(int mark1, int mark2, int mark3, int mark4) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
		
	}
	
	public double calcAvg(int mark1, int mark2, int mark3, int mark4) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
		double markAvg = (mark1 + mark2 + mark3 + mark4) / 4;
		return markAvg;
	}

}

// how do i use the data from student method in calcAvg method without repeating myself
