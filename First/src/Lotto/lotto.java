package Lotto;

import java.util.Random;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int lotto[] = new int[6];
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(lotto[i]);
		}
		
	}

}
