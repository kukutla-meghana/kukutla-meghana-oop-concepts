package com.epam.task1;
import java.util.*;
import java.io.*;
import java.lang.*;
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Sweets>gift=new ArrayList<Sweets>();
        Sweets c1=new Chocolates("100%","kitkat",5,10);
        gift.add(c1);
        Sweets c2=new Chocolates("50%","5star",2,20);
        gift.add(c2);
        Sweets c3=new Chocolates("75%","dairymilk",10,30);
        gift.add(c3);
        Sweets c4=new Candy("25%","kachamango",1,12);
        gift.add(c4);
        Sweets c5=new Candy("30%","milkybar",2,15);
        gift.add(c5);
        Sweets c6=new Candy("64%","coffebit",4,8);
        gift.add(c6);
        ArrayList<Sweets>cho=new ArrayList<Sweets>();
        for(int i=0;i<gift.size();i++) {
        	if(gift.get(i) instanceof Chocolates) {
        		cho.add(gift.get(i));
        	}
        }
        System.out.println("Chocolates sorted by their weights");
        Collections.sort(cho,new Sortbyweight());
        for(int i=0;i<cho.size();i++) {
        	System.out.println(cho.get(i).name+" choco%  is "+cho.get(i).type+" cost is "+cho.get(i).cost+" weight is "+cho.get(i).weight);
        }
        System.out.println();
        System.out.println("Chocolates sorted by their cost");
        Collections.sort(cho,new Sortbycost());
        for(int i=0;i<cho.size();i++) {
        	System.out.println(cho.get(i).name+" choco%  is "+cho.get(i).type+"cost is"+cho.get(i).cost+" weight is "+cho.get(i).weight);
        }
        System.out.println();
        Collections.sort(cho,new Sortbytype());
        for(int i=0;i<cho.size();i++) {
        	System.out.println(cho.get(i).name+" choco%  is "+cho.get(i).type+" cost is "+cho.get(i).cost+" weight is "+cho.get(i).weight);
        }
        System.out.println();
        int netw=0;
        for(int i=0;i<gift.size();i++) {
        	netw+=gift.get(i).weight;
        }
        System.out.println();
        System.out.println(" Total weight of gift "+netw+"gms");
        int ccandy=0;
        for(int i=0;i<gift.size();i++) {
        	if(gift.get(i) instanceof Candy) {
        		ccandy++;
        	}
        }
        System.out.println();
        System.out.println("No of Candies is "+ccandy);
        System.out.print("");
        System.out.println("candies between range of the cost in between 2 to 20\n");
        for(int i=0;i<gift.size();i++) {
        	if(gift.get(i) instanceof Candy) {
        		if(gift.get(i).cost>=2&&gift.get(i).cost<=20) {
        			System.out.println(gift.get(i).name+" choco%  is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weight is "+gift.get(i).weight+"gms");
                }
        		}
        	}
        }
   // System.out.print("");
   // System.out.println("candies between range of the cost in between 1 to 10");
//      for(int i=0;i<gift.size();i++) {
//      	if(gift.get(i) instanceof Candy) {
//      		if(gift.get(i).weight>=1&&gift.get(i).weight<=20) {
//      			System.out.println(gift.get(i).name+"choco%  is"+gift.get(i).type+"cost is"+gift.get(i).cost+"weight is"+gift.get(i).weight+"gms");
//              }
//      		}
//      	}
//      }   
    }

