public class ThursdayTest{
	public static void main(String[] args){
		Thursday t1 = new Thursday();
		t1.SetCourseTeacherName ("Mahamudul Hasan","Dr.Saif","MD.Al-amin");
		t1.setCourseName("Software Engineering","Data Mining","Java");
		t1.setCourseSection('A','B','C');
		System.out.println(t1.getCourseName());
		t1.ShowInformation();
	}
}