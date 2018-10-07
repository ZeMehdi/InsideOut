package InsideOut;

import java.util.Scanner;

public class Simulateur {
	Scanner clavier = new Scanner(System.in);
	Emotions x=new Emotions();
	Emotions y=new Emotions();
	int réponse;
	public void Jeu() {
		// x.Emotion
		System.out.println("Bienvenue dans ce simulateur d'émotions" 
				+ "\nPremière question : "
				+ "\nVous travaillez sur un projet artistique mais vous ne trouvez pas le résultat satisfaisant"
				+ "\n Vous :"
				+ "\n		1- vous en fichez, c'est de l'art après tout ! "
				+ "\n		2- le jetez et recommencez"
				+ "\n		3- le montrez anonymement"
				+ "\n		4- riez de combien le résultat est stupide");
		réponse=clavier.nextInt();
		switch(réponse) {
		case 1 :
			x.ScoreJoie=+2;
		case 2 : {
			x.ScoreJoie++;
			x.ScoreDégoût++;
			}
		case 3 :
			x.ScorePeur++;
			x.ScoreTristesse++;
		case 4 :
			x.ScoreTristesse=+2;}
		System.out.println("\nDeuxième question :"
				+ "\nÀ un dîner, on vous sert un plat que vous n'avez jamais goûté, comment vous sentez-vous ?"
				+ "\n		1-Excité(e) ; vous aimez expérimenter de nouvelles choses"
				+ "\n		2-Dégouté(e) ; vous ne l'aimerez probablement pas"
				+ "\n		3-Déçu(e) ; vous n'auriez jamais dû venir"
				+ "\n		4-Inquiet(e) ; comment cacheriez-vous le repas si vous ne l'aimerez pas ?"
				+ "\n		5-Faché(e) ; pourquoi me feraient-ils manger ça ?");
		réponse=clavier.nextInt();
		switch(réponse) {
		case 1 :
			x.ScoreJoie=+2;
		case 2 :
			x.ScoreDégoût++;
			x.ScorePeur++;
		case 3 :
			x.ScoreDégoût++;
			x.ScoreColère++;
		case 4 :
			x.ScorePeur++;
			x.ScoreTristesse++;
		case 5 :
			x.ScoreColère=+2;
		}
		System.out.println("\nTroisième question :"
				+ "\nComment réagissez-vous après un cauchemar ?"
				+ "\n		1-Je ne dors pas tranquillement pendant quelque jours"
				+ "\n		2-J'essaye de penser à des choses heureuses"
				+ "\n		3-J'en parle à quelqu'un"
				+ "\n		4-J'analyse mon rêve");
		réponse=clavier.nextInt();
		switch(réponse) {
		case 1 :
			x.ScorePeur=+2;
		case 2 :
			x.ScoreJoie++;
		case 3 :
			x.ScorePeur++;
			x.ScoreTristesse=+2;
		case 4 :
			x.ScorePeur--;
		}
		// y.Emotion
		System.out.println("\nQuatrième question :"
				+ "\nVous demandez à votre ami une faveur mais elle vous est refusée, comment réagissez-vous ?"
				+ "\n		1-Un peu déçu(e)..."
				+ "\n		2-En colère, mes amis devraient toujours répondre \"oui\" ! "
				+ "\n		3-Inquiet de devoir la faire moi-même"
				+ "\n		4-Pas très content, mais je peux comprendre"
				+ "\n		5-Détérminé(e) à vouloir la faire par moi-même !");
		réponse=clavier.nextInt();
		switch(réponse) {
		case 1 :
			y.ScoreTristesse++;
		case 2 :
			y.ScoreTristesse++;
			y.ScoreColère=+2;
		case 3 :
			y.ScorePeur++;
			y.ScoreTristesse++;
		case 4 :
			y.ScoreColère--;
			y.ScoreTristesse--;
		case 5:
			y.ScoreJoie=+2;
		}
		System.out.println("\nCinquième question :"
				+ "\nVous êtes en forêt avec vos amis, et ils proposent de prendre en raccourci une voie que vous ne connaissez pas, que faites-vous ?"
				+ "\n		1-Vous allez avec eux"
				+ "\n		2-Vous prenez la voie que vous connaissez"
				+ "\n		3-Vous tentez de les convaincre de pas prendre le raccourci");
		réponse=clavier.nextInt();
		switch(réponse) {
		case 1 :
			y.ScoreJoie++;
		case 2 :
			y.ScoreTristesse++;
			y.ScorePeur=+2;
		case 3 :
			y.ScoreColère++;
			y.ScoreDégoût++;
		}
		System.out.println("\nDernière question :"
				+ "\nVous êtes dans un parc d'attraction, mais les queues semblent très longues, que faites-vous ?"
				+ "\n		1-Vous ne perdez pas de temps ! vous prenez la première place qui s'offre à vous"
				+ "\n		2-Vous rentrez chez-vous, ça ne vaut pas d'attendre..."
				+ "\n		3-Vous parlez aux résponsables de la gestion, le parc a besoin d'un meilleur système de queue !"
				+ "\n		4-Attendez toute la journée près des lignes de queue, en espérant qu'elle se vident");
		réponse=clavier.nextInt();
		switch(réponse) {
		case 1 :
			y.ScoreJoie=+2;
		case 2 :
			y.ScoreTristesse=+2;
			y.ScoreDégoût++;
		case 3 :
			y.ScoreJoie++;
			y.ScoreDégoût=+2;
		case 4 :
			y.ScoreDégoût++;
			y.ScoreColère=+2;
		}
	}
	public void Scorer() {
		x.VerifyEmotions();
		y.VerifyEmotions();
		if(x.Joie == true) {
			if(y.Joie==true)
				System.out.println("Vous débloquez l'extase !!!\n");
			else if(y.Tristesse==true)
				System.out.println("Vous débloquez la mélancolie !\n");
			else if(y.Dégoût == true)
				System.out.println("Vous débloquez l'obsession !\n");
			else if(y.Peur==true)
				System.out.println("Vous débloquez la surprise !\n");
			else if(y.Colère==true)
				System.out.println("Vous débloquez la férocité !\n");
		}
		else if(x.Tristesse==true) {
			if(y.Joie==true)
				System.out.println("Vous débloquez la mélancolie ! !\n");
			else if(y.Tristesse==true)
				System.out.println("Vous débloquez le désespoir !!!\n");
			else if(y.Dégoût == true)
				System.out.println("Vous débloquez la dépression !\n");
			else if(y.Peur==true)
				System.out.println("Vous débloquez l'anxiété !\n");
			else if(y.Colère==true)
				System.out.println("Vous débloquez la trahison !\n");
		}
		else if(x.Dégoût==true) {
			if(y.Joie==true)
				System.out.println("Vous débloquez l'obsession !\n");
			else if(y.Tristesse==true)
				System.out.println("Vous débloquez la dépression !\n");
			else if(y.Dégoût == true)
				System.out.println("Vous débloquez le mépris  !!!\n");
			else if(y.Peur==true)
				System.out.println("Vous débloquez la révulsion !\n");
			else if(y.Colère==true)
				System.out.println("Vous débloquez l'aversion !\n");
		}
		else if(x.Peur==true) {
			if(y.Joie==true)
				System.out.println("Vous débloquez la surprise !\n");
			else if(y.Tristesse==true)
				System.out.println("Vous débloquez l'anxiété !\n");
			else if(y.Dégoût == true)
				System.out.println("Vous débloquez la révulsion !\n");
			else if(y.Peur==true)
				System.out.println("Vous débloquez la terreur !!!\n");
			else if(y.Colère==true)
				System.out.println("Vous débloquez la haine !\n");
		}
		else if(x.Colère==true) {
			if(y.Joie==true)
				System.out.println("Vous débloquez la férocité !\n");
			else if(y.Tristesse==true)
				System.out.println("Vous débloquez la trahison !\n");
			else if(y.Dégoût == true)
				System.out.println("Vous débloquez l'aversion !\n");
			else if(y.Peur==true)
				System.out.println("Vous débloquez la haine !\n");
			else if(y.Colère==true)
				System.out.println("Vous débloquez la rage !!!\n");
		}
	}

}
