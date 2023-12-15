public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour{
    int numberOfArticles;

    public PhDStudent(int id,float mid,float fin,int conf,int numberOfArticles){
        super(id,mid,fin,conf);
        this.numberOfArticles=numberOfArticles;
    }

    public float articleScore(){
        return numberOfArticles*8;
    }

    public float computeTotalScore(){
        return computeBaseScore()+articleScore();
    }
}
