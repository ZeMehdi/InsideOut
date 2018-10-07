package InsideOut;
import java.util.Arrays;

public class Emotions {
	boolean Joie=false,Tristesse=false,Dégoût=false,Peur=false,Colère=false;
	int ScoreJoie,ScoreTristesse,ScoreDégoût,ScorePeur,ScoreColère;
	int[] Sorter;
	public void getEmotion(int SortedInt) {
		if(SortedInt==ScoreJoie)
			Joie=true;
		if(SortedInt==ScoreTristesse)
			Tristesse=true;
		if(SortedInt==ScoreDégoût)
			Dégoût=true;
		if(SortedInt==ScorePeur)
			Peur=true;
		if(SortedInt==ScoreColère)
			Colère=true;
	}
	public void VerifyEmotions() {
		Sorter= new int[] {ScoreJoie,ScoreTristesse,ScoreDégoût,ScorePeur,ScoreColère};
		Arrays.sort(Sorter);
		getEmotion(Sorter[4]);
	}
}
