package AbstractFoactory;

/**
 *
 * @author aashgar
 */
public class Course {
    private Title aTitle;
    private Content aContent;
    private Degree aDegree;
    private Teacher aTeacher;
    private static Course aCourse;
    private Course(){}
    public static Course getCourse(){
        if(aCourse ==  null)
            aCourse = new Course();
        return  aCourse;
    }
    public void setDegree(Degree aDegree){
        this.aDegree = aDegree;
    }
    public void viewInfo(String title,
            String content,String teacher){
        this.aTitle = this.aDegree.getTitle();
        this.aContent = this.aDegree.getContent();
        this.aTeacher = this.aDegree.getTeacher();
        System.out.println("=========");
        System.out.println("Processing course information ....");
        aTitle.view(title);
        aContent.view(content);
        aTeacher.view(teacher);
    }
    
}
