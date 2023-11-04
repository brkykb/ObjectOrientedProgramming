public class Teacher {
    private int id;
    private Branch branch;

    public Teacher(int id,Branch branch){
        this.id=id;
        this.branch=branch;
    }


    public static void main(String args[]){

        Teacher[] teachers = new Teacher[4];
        teachers[0]= new Teacher(1, Branch.MATH);
        teachers[1]= new Teacher(2,Branch.CS);
        teachers[2] =new Teacher (3,Branch.PHYSICS);
        teachers[3]= new Teacher(4,Branch.ENG);

        for(int i=0;i<4;i++){
            System.out.println((i+1)+".Teacher Branch:"+teachers[i].branch);
        }
    }
}
