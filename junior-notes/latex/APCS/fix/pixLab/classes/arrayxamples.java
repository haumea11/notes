
public class arrayxamples {
public static void main(String[] args){
	char[][] good = new char[4][4];
	for (int a = 0; a < 4; a++){
		for(int b = 0; b < 4; b++){
			good[a][b] = 'a';
			System.out.print(good[a][b]);
		}
		System.out.println();
	}
}
}
