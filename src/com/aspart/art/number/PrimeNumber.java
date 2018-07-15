package com.aspart.art.number;

public class PrimeNumber {

	public static boolean judgePrime(int num){
		boolean flag = true;
		
		for(int i = 2; i <= Math.sqrt(num); i++){
			if(num % i == 0){
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		
		int totalCount = 0;
		for (int i = 0; i <= Math.pow(10, 2); i++) {
			if(judgePrime(i)){
				totalCount ++;
			}else{
				continue;
			}
		}
		System.out.format("一千万以内一共有%d个质数", totalCount);
		
		
	}
}
