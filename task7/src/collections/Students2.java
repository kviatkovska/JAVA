package collections;
public class Students2 {
		    private String name;
		    private String group;
		    private int course;
		    
		    public Students2(String name, String group, int course) {
				super();
				this.name = name;
				this.group = group;
				this.course = course;
			}
		    
		    
		    @Override
			public String toString() {
				return "Student2 [name=" + name + ", group=" + group + ", course=" + course + "]";
			}


			public String getName() {
				return name;
			}


			public void setName(String name) {
				this.name = name;
			}


			public String getGroup() {
				return group;
			}


			public void setGroup(String group) {
				this.group = group;
			}


			public int getCourse() {
				return course;
			}


			public void setCourse(int course) {
				this.course = course;
			}

}