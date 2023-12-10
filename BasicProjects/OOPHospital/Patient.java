


public class Patient {

    private String name;
    private int patientId=0;


    public Patient(String name,int patientId){
        this.name=name;
        this.patientId=patientId;
    }

    public String getName(){
        return name;
    }


    public int getPatientId() {

        return patientId;
    }


    public String toString() {
        return "Patient id: "+patientId+ "Name: "+name;

    //eksik
    }
}
