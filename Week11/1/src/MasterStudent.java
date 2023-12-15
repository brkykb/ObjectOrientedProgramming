public class MasterStudent extends Student implements ConferenceScoreBehaviour{

    protected int numberOfConf;

    public MasterStudent(int id,float mid,float fin,int numberOfConf){
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
    }

    public float ConferenceScoreBehaviour(){
        return numberOfConf*5;
    }

    public float conferenceScore(){
        return numberOfConf*5;
    }

    public float computeTotalScore(){
        return computeBaseScore()+conferenceScore();
    }
}
