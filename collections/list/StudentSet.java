package collections.list;

public class StudentSet implements Comparable<StudentSet> {

	String name;
	int rollNo;
	
	public StudentSet(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String toString() {
		return "Student {" +
					"name = '" + name + '\'' +
					", rollNo = '" + rollNo + 
					'}';
	}

	// To define that 2 students must have different rollNo
	// Else they would be equal
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentSet other = (StudentSet) obj;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

	public int compareTo(StudentSet that) {
		// TODO Auto-generated method stub
//		return this.rollNo - that.rollNo;
		// By name sorting
		 return this.name.compareTo(that.name);
	}
	

}
