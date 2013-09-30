package ClassScheduler;

public class Section {
	public String classCode;
	public String instructor;
	public String time;
	public String day;
	public String room;
	
	public Section(){
		classCode="";
		instructor="";
		time="";
		day="";
		room="";
	}
	
	public Section(String[] s){
		classCode=s[0]+"-"+s[1];
		instructor=s[2];
		schedule();
	}
	
	public void schedule(){
		day = setDay();
		time = setTime(day);
		room = setRoom();
	}
	
	public String setDay(){
		String openDay = "";
		return openDay;
	}
	
	public String setTime(String day){
		String openTime = "";
		return openTime;
	}
	
	public String setRoom(){
		String openRoom = "";
		return openRoom;
	}
	
	/**
	 * @return the classCode
	 */
	public String getClassCode() {
		return classCode;
	}

	/**
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @return the day
	 */
	public String getDay() {
		return day;
	}

	/**
	 * @return the room
	 */
	public String getRoom() {
		return room;
	}	
}
