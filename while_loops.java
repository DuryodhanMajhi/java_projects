import java.util.Scanner;
class while_loops{
	public static void main(String args[]){
int num;
System.out.println("Enter number = ");
Scanner k=new Scanner(System.in);
   num=k.nextInt();
    while(num>0){
    	if(num%2==0){
    		System.out.println("Even number ..");
    		break;
    	}
    	else{

    		System.out.println("odd number ..");
    		break;
    	}

    }
	}
}