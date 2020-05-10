import java.util.*;
class person
{
  String name,strname,city;
  int age,yoj,nin;
  Scanner sc.new Scanner(System.in);
  person()
  {
    System.out.println("Enter the person's name ,age,street name,National insurance number,year of joining and the city:");
	name=sc.next();
	age=sc.nextInt();
	strname=sc.next();
	nin=sc.nextInt();
	yoj=sc.nextInt();
	city=sc.next();
  }
  void disp()
  {
	  System.out.println("Person's name: "+name+"\nAge: "+age+"\nStreet name: "+strname+"\nNational Insurance Number: "+nin+"\nYear of joining: "+yoj+"\nCity: "+city);
  }  
}
class employee extends person
{
	double bp,gp,da,pf,gs,np,as;
	Scanner sc.new Scanner(System.in);
	employee()
	{
		super();
	}
	void pay()
	{
		System.out.println("Enter the basic pay and grade pay:");
		bp=nextDouble();
		gp=nextDouble();
	}
	void da(double d)
	{
		da=(bp+gp)*d;
	}
	    void pf(double p){
        pf=(bp+gp+da)*p;
        
    }
    void calc(int hra){
        gs=bp+gp+da+hra;
        np=gs-pf;
		        as=12*np;
       
         }
		 void print()
		 {
			 System.out.println("Basic pay: "+bp+"\nGrade pay: "+gp+"\nDA: "+da+"\nPF: "+pf+"\nGS: "+gs+"\nNP: "+np+"\nAS: "+as);
		 }
public static void main(String[] args) 
{
                int ch,c;
				Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.AP     2.AP(SG)    3.Assoprof       4.Assoprof(SG)   5.Professor");
            ch=sc.nextInt();
        switch(ch)
		{
            case 1:
			employee osa=new employee();
            osa.disp();
			System.out.println("----AP----\n");
            osa.pay();
   		    osa.da(0.35);
		    osa.pf(0.10);
			osa.calc(1000);
			osa.print();
            break;
			case 2:
			employee osa=new employee();
            osa.disp();
			System.out.println("----AP(SG)----\n");
            osa.pay();
   		    osa.da(0.34);
		    osa.pf(0.09);
			osa.calc(850);
			osa.print();
            break;
			case 3:
			employee osa=new employee();
            osa.disp();
			System.out.println("----ASSOPROF----\n");
            osa.pay();
   		    osa.da(0.30);
		    osa.pf(0.08);
			osa.calc(750);
			osa.print();
            break;
			case 4:
			employee osa=new employee();
            osa.disp();
			System.out.println("----ASSOPROF(SG)----\n");
            osa.pay();
   		    osa.da(0.27);
		    osa.pf(0.05);
			osa.calc(650);
			osa.print();
            break;
			case 5:
			employee osa=new employee();
            osa.disp();
			System.out.println("----PROF----\n");
            osa.pay();
   		    osa.da(0.24);
		    osa.pf(0.04);
			osa.calc(500);
			osa.print();
            break;
			default:
			System.out.println("Enter the right choice");
			break;
			
                
            
        } 
System.out.println("Press 0 to continue...");		
		}while(ch==0);
    }
    
}


		