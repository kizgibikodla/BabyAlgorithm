
package NewBabyAlgorithm;

public class NewBaby {
public void GozdesBaby(){
System.out.println("Hello World! Hello Mum, I came finally!");
System.out.print("Mum, who is this men? Ahh-haa Daddyy! you are more handsome than I thought!");
}
public void BeMum(int weekCount){
    if(weekCount==1){
    System.out.print("Hi Mum! I am in you now!");
    } 
    else if(weekCount>=2 && weekCount<20){
    System.out.print("Mum,Guess I got some weight,I am 5 grams!");
    }
    else if(weekCount>=20 && weekCount<30){
    System.out.print("I kicked you unintentionally. Sorry Mum Love you! :( ");
    }
    else if(weekCount>=30 && weekCount<35){
    System.out.print("I am still groving muum!");
    }
    else if(weekCount>=35 && weekCount<40){
    System.out.print("I'm so bored here. I think it's time to come to your lap!");
    } 
    else if(weekCount==40){
    new NewBaby().GozdesBaby();
    }
}
public static void main(String[] args) {
int weekCount = 34;
new NewBaby().BeMum(weekCount);
     
}
    }
