import java.util.Scanner;
import example1.*;
public class demo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("1.timeconversion\n2.currencyconversion\n3.distance conversion\nenter your choice");
int choice=sc.nextInt();
double in=0.0;
String ch="0";
time t=new time();
distance d=new distance();
currency c=new currency();
if(choice==1){
System.out.println("1.hour->minute\n2.hour->second\n3.minute->hour\n4.minute->second\n5.second->minute\n6.second->hour\nenter your choice:");
ch=sc.next();
System.out.println("enter time to convert");
in=sc.nextDouble();
}
else if(choice==2){
System.out.println("a.inr->dollar\nb.inr->yen\nc.inr->euro\nd.dollar->inr\ne.yen->inr\nf.euro->inr\nenter your choice");
ch=sc.next();
System.out.println("enter amount to convert");
in=sc.nextDouble();
}
else if(choice==3){
System.out.println("d1.km->m\nd2.km->cm\nd3.m->km\nd4.m->cm\nd5.cm->km\nd6.cm->m\nenter your choice");
ch=sc.next();
System.out.println("enter distance to convert");
in=sc.nextDouble();
}
else{
System.out.println("choice out of range");
}
switch(ch){
case "0":
	System.out.println("thank you");
case "1":
	System.out.println(t.hm(in)+"min(s)");
break;
case "2":
	System.out.println(t.hs(in)+"sec(s)");
break;
case "3":
	System.out.println(t.mh(in)+"hr(s)");
break;
case "4":
	System.out.println(t.ms(in)+"sec(s)");
break;
case "5":
	System.out.println(t.sm(in)+"min(s)");
break;
case "6":
	System.out.println(t.sh(in)+"hr(s)");
break;
case "a":
	System.out.println("$"+c.id(in));
break;
case "b":
	System.out.println("¥"+c.iy(in));
break;
case "c":
	System.out.println("€"+c.ie(in));
break;
case "d":
	System.out.println("Rs."+c.di(in));
break;
case "e":
	System.out.println("Rs."+c.yi(in));
break;
case "f":
	System.out.println("Rs."+c.ei(in));
break;
case "d1":
	System.out.println(d.km(in)+"m");
break;
case "d2":
	System.out.println(d.kc(in)+"cm");
break;
case "d3":
	System.out.println(d.mk(in)+"km");
break;
case "d4":
	System.out.println(d.mc(in)+"cm");
break;
case "d5":
	System.out.println(d.ck(in)+"km");
break;
case "d6":
	System.out.println(d.cm(in)+"m");
break;
default:
	System.out.println("choice out of range");
}
}
}
