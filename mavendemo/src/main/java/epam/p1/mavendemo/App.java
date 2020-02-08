package epam.p1.mavendemo;
import java.io.*;
import java.util.*;
import java.util.Scanner;
abstract class Gift {
	int chocolates=0,sweets=0,candys=0;
	int weight_choco=0,weight_sweet=0,weight_candy=0;
}
class Chocolate extends Gift{
	int choco_w[],sweet_w[],candy_w[];
	
}	
public class App
{
    public static void main( String[] args)
    {
        Scanner sc=new Scanner(System.in);
    	Chocolate ch=new Chocolate();
    	int decision=1;
    	while(decision!=0) {
    		System.out.println("Enter the choice:\n 1.Chocolate \n 2.Sweets \n 3.Candys");
    		int opt=sc.nextInt();
    		switch(opt){
    			case 1: System.out.println("Enter the number of chocolates to add:");
    					ch.chocolates=sc.nextInt();
    					ch.choco_w=new int[ch.chocolates];
    					System.out.println("Enter the weights of "+ch.chocolates+" chocolates:");
    					for(int i=0;i<ch.chocolates;i++) {
    						ch.weight_choco=sc.nextInt();
    						ch.choco_w[i]=ch.weight_choco;
    					}
    					break;
    			case 2: System.out.println("Enter the number of sweets to add:");
						ch.sweets=sc.nextInt();
						ch.sweet_w=new int[ch.sweets];
						System.out.println("Enter the weights of "+ch.sweets+" sweets:");
						for(int i=0;i<ch.sweets;i++) {
							ch.weight_sweet=sc.nextInt();
							ch.sweet_w[i]=ch.weight_sweet;
						}
						break;
    			case 3: System.out.println("Enter the number of candys to add:");
						ch.candys=sc.nextInt();
						ch.candy_w=new int[ch.candys];
						System.out.println("Enter the weights of "+ch.candys+" candys:");
						for(int i=0;i<ch.candys;i++) {
							ch.weight_candy=sc.nextInt();
							ch.candy_w[i]=ch.weight_candy;
						}
						break;
    		}
    		System.out.println("Want to Continue(yes-1/no-0):");
    		decision=sc.nextInt();
    	}
    	if(ch.chocolates>0) {
    		Arrays.sort(ch.choco_w);
    		System.out.println("Sorted cocolates:");
    		for(int i=0;i<ch.chocolates;i++)
    			System.out.println(ch.choco_w[i]);
    	}	
    	if(ch.sweets>0) {
    		Arrays.sort(ch.sweet_w);
    		System.out.println("Sorted sweets:");
    		for(int i=0;i<ch.sweets;i++)
    			System.out.println(ch.sweet_w[i]);
    	}	
    	if(ch.candys>0) {
    		Arrays.sort(ch.candy_w);
    		System.out.println("Sorted candys:");
    		for(int i=0;i<ch.candys;i++)
    		System.out.println(ch.candy_w[i]);
    	}
    	//ch.total_weight(ch.chocolates,ch.sweets,ch.candys);
    	int sum=0;
		for(int i=0;i<ch.chocolates;i++)
			sum+=ch.choco_w[i];
		for(int i=0;i<ch.sweets;i++)
			sum+=ch.sweet_w[i];
		for(int i=0;i<ch.candys;i++)
			sum+=ch.candy_w[i];
		System.out.println("Total weight:"+sum);
    }
}
