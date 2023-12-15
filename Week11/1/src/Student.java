public abstract class Student {
    int id;
    float mid;
    float fin;

    public Student(int id,float mid,float fin){
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }

    public abstract float computeTotalScore();

    public float computeBaseScore(){
        return mid* (float)0.4 + fin* (float)0.6;
    }
}
