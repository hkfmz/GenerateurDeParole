
public class Generator {

	public static void main(String[] args) {
		
		String wordListOne []= {"confiant", "motiv�e", "resilient"	, "adaptable"};
		
		String wordListTwo []= {"honn�te", "intelligeant", "respectieux", "fi�re"};
		
		String wordListThree []= {"ax� sur la famille", "calme", "passable", "fiable"};
		
		int oneLength = wordListOne.length;
		
		int twoLength = wordListTwo.length;
		
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random()*oneLength);
		
		int rand2 = (int) (Math.random()*twoLength);
		
		int rand3 = (int) (Math.random()*threeLength);
		
		String phrase = wordListOne [rand1] + ", " + wordListTwo[rand2]+" et "+ wordListThree[rand3];
		
		System.out.println("Nous voulions recrut� de " + "personnes " + phrase);


	}

}
