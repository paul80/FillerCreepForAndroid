package es.softwareprocess.fillercreep;

public interface AI {
	public FundamentalStuff evaluate(int playernumber,fillercreep);
	
	public void MasterAi(String cores);
}
public class AIMaximum implements AI {

    public FundamentalStuff evaluate(int playernumber, FillerCreep fillerCreep) {
        FundamentalStuff[] stuff = FillerCreep.getStuffArray();
        int maxscore = -1;
        int maxstuff = -1;
        for (int i = 0; i < stuff.length; i++) {
            int score = fillerCreep.testPlayerPlay(playernumber, stuff[i]);
            if (score > maxscore) {
                maxscore = score;
                maxstuff = i;
            }
        }
        return stuff[maxstuff];
    }
    
    public void MasterAI(String cores) {
    	//TODO auto generated method stub
    }
    
    public void SecondBrain(int power) {
    	//TODO auto generated method stub
    }
    
    public int iWantZero(){
    	return 0;
    }
}