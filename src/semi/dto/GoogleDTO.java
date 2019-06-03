package semi.dto;

public class GoogleDTO {

		private String age;
		private int visit;
		private String time;
		private String day;
		private int male;
		private int female;
		private int age20;
		private int age30;
		private int age40;
		
		
		public String getDay() {
			return day;
		}
		public void setDat(String day) {
			this.day=day;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public int getVisit() {
			return visit;
		}
		public void setVisit(int visit) {
			this.visit = visit;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public int getMale() {
			return male;
		}
		public void setMale(int male) {
			this.male = male;
		}
		public int getFemale() {
			return female;
		}
		public void setFemale(int female) {
			this.female = female;
		}
		public int getAge20() {
			return age20;
		}
		public void setAge20(int age20) {
			this.age20 = age20;
		}
		public int getAge30() {
			return age30;
		}
		public void setAge30(int age30) {
			this.age30 = age30;
		}
		public int getAge40() {
			return age40;
		}
		public void setAge40(int age40) {
			this.age40 = age40;
		}
		public GoogleDTO(String day,int male, int female, int age20, int age30, int age40) {
			this.day = day;
			this.male=male;
			this.female=female;
			this.age20=age20;
			this.age30=age30;
			this.age40=age40;
		}
		public GoogleDTO(int male, int female) {
			this.male=male;
			this.female=female;
		}
		public GoogleDTO(String age, int visit) {
			super();
			this.age = age;
			this.visit = visit;
		}
		
		public GoogleDTO(int visit, String time) {			
			this.visit = visit;
			this.time = time;
		}
		public GoogleDTO() {
		}
	
		
		
}
