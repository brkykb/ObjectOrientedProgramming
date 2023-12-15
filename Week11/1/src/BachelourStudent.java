public class BachelourStudent extends Student implements ProjectScoreBehaviour{

    public BachelourStudent(int id,float mid,float fin){
        super(id,mid,fin);
    }

    public float projectScore(){
        return 20;
    }

    public float computeTotalScore(){
        return computeBaseScore()+projectScore();
    }
}
