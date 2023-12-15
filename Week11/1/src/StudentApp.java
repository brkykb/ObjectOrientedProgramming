public class StudentApp {
    public static void main(String args[]){

        Student student1=new MasterStudent(2110206009,100,100,50);
        Student student2=new BachelourStudent(2110206010,80,90);
        Student student3=new PhDStudent(2110206011,50,60,40,10);
        Student[] b={student1,student2,student3};

        for(Student a: b){
            System.out.println(a.getClass().getSimpleName());
            System.out.println("Id:"+a.id);
            if(a instanceof ArticleScoreBehaviour)
                System.out.println("Article Score: "+((ArticleScoreBehaviour) a).articleScore());

            if(a instanceof ConferenceScoreBehaviour)
                System.out.println("Conference Score: "+((ConferenceScoreBehaviour) a).conferenceScore());

            if(a instanceof ProjectScoreBehaviour)
                System.out.println("Project Score: "+((ProjectScoreBehaviour) a).projectScore());

            System.out.println("Total Score: "+a.computeTotalScore()+"\n");
        }
    }
}
