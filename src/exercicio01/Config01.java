package exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Config01 {
	  private int[] resultArray = new int[200];
	  
	  public int createRandomNumber(){
	      
	    int result;
	      Random r = new Random();
	    result = r.nextInt();
	    
	      return result;
	  }
	  
	  
	  public int[] fillTheArray(){
	   for (int i = 0; i < resultArray.length; i++) {
	     int currentNumber;
	     
	     currentNumber = this.createRandomNumber();
	     resultArray[i] = currentNumber;
	   }
	      return resultArray;
	      
	  }
	  
	  public void printAllArray(){
	      int[] r = this.fillTheArray();
	      
	      for (int i = 0; i < r.length; i++) {
	         System.out.println(r[i]);
	     }
	  }  
	  
	  public void printMaxNumber(int[] r){
	      List<Integer> list = new ArrayList<Integer>();
	      for (int i = 0; i < r.length; i++) {
	     list.add(r[i]);
	   }
	      System.out.println( Collections.max(list));
	  }
	  
	  public void printAverageValue(int[] r){
	      int result = 0;
	      for (int i = 0; i < r.length; i++) {
	          result = result+r[i];
	      }
	      System.out.println(result/r.length);
	  }
	  
	   
	  public void printLowNumber(int[] r){
	      List<Integer> list = new ArrayList<Integer>();
	      for (int i = 0; i < r.length; i++) {
	     list.add(r[i]);
	   }
	      System.out.println( Collections.min(list));
	  }

	     public int[] getResultArray() {
	         return resultArray;
	     }

	     public void setResultArray(int[] resultArray) {
	         this.resultArray = resultArray;
	     }
	  
}
