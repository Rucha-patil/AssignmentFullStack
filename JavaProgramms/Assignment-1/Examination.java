import java.util.Scanner;

class Examination 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=0;
		int ans;
		int marks=10;
		
		boolean statusEnglish=false;
		boolean statusGK=false;
		boolean statusMath=false;

		int resultEnglish,resultMath,resultGK;
		
	
		do
		{
		System.out.println("Examination");
		System.out.println("Which exam do you want to give first? Enter the number");
		System.out.println("1. English");
		System.out.println("2. Math");
		System.out.println("3. GK");
		int value=sc.nextInt();
		
			switch (value)
			{
	
				case 1 :{
					if (statusEnglish==true){
					System.out.println("You've already given English exam");
					System.out.println();
					break;
				}
					else if (statusEnglish==false){
				System.out.println("giving english exam");
				System.out.println("Which of following is not a part of speech?  1.Noun  2.Verb  3.ProNoun  4.Article");
					
					ans = sc.nextInt();
					if(ans==4)
					{
						 marks = marks+10;
					}

					System.out.println("(Answer the synonym) Ritu asked Rashmi not to meddle in her affairs 1) intercede 2) impose 3) cross 4) interfere");
					
					ans = sc.nextInt();
					if(ans==4)
					{
						 marks = marks+10;
					}

					System.out.println("(Answer the synonym) The early monsoon  have brought respite to the people 1) despite 2) inspite of 3) interval of relief 4)res");
					ans = sc.nextInt();
					if(ans==3)
					{
						 marks = marks+10;
					}

				statusEnglish=true;
					
				System.out.println();
				
				
				count+=1;
					n++;
				break;}
						}
				case 2 :{
						if (statusMath==true){
					System.out.println("You've already given Maths exam");
					System.out.println();
					break;
				}
				else if (statusMath==false){
				System.out.println("giving Math exam");
				System.out.println("An angle whose value is ____, is called complete angle 1) 180�(2) 240�(3) 360� (4)None of the above");	
						ans = sc.nextInt();
						if(ans==3)
						{
							 marks = marks+10;
						}

						System.out.println("-A, B and C can complete a piece of work in 14, 6 and 12 days respectively. Working together, they will complete the work in (1) 19/9 days (2) 27 days (3) 28/9 days (4) 25/8 days");
						
						ans = sc.nextInt();
						if(ans==3)
						{
							 marks = marks+10;
						}
						System.out.println(" -An amount of Rs. 10,000 becomes Rs. 20,736 in 2 years. If the rate of interest is compounded half yearly, what is the annual rate of interest? (1) 25%(2) 20% (3) 40% (4) 30%");
						
						ans = sc.nextInt();
						if(ans==3)
						{
							 marks = marks+10;
						}	
				System.out.println();
				statusMath=true;
				count+=1;
					n++;
				break;}
						}
				case 3 :{
				if (statusGK==true){
					System.out.println("You've already given GK exam");
					System.out.println();
					break;

				}
				else if (statusGK==false)
				{
				System.out.println("giving GK exam");
				System.out.println("How many states in India?  1.27  2.28 3.29 4.30");
						
						ans = sc.nextInt();
						if(ans==2)
						{
							 marks = marks+10;
						}	

						System.out.println("The World Largest desert is? 1. Thar 2. Kalahari 3. Sahara 4. Sonoran ");
						
						ans = sc.nextInt();
						if(ans==3)
						{
							 marks = marks+10;
						}	

	System.out.println("The Central Rice Research Station is situated in 1. Chennai 2. Cuttack 3. Bangalore 4. Quilon");
						
						ans = sc.nextInt();
						if(ans==2)
						{
							 marks = marks+10;
						}	

				System.out.println();
				statusGK=true;
				count+=1;
					n++;
				break;}
						}

			}
				if(count==3 && statusMath==true && statusEnglish==true && statusGK==true)
				{
				System.out.println("you have completed all your exams");
				if(marks >= 90){
					System.out.println("Congratulation you Passed with A Grade");
				}else if(marks < 90 && marks >=80){
					System.out.println("Congratulation you Passed with B Grade");
				}else if(marks < 80 && marks >=70){
					System.out.println("Congratulation you Passed with C Grade");
				}else{
					System.out.println("You are really good but need more study Please try next time");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				break;

				}
				else{
				System.out.println("you need to complete all your exams");
				System.out.println("Remaining exams are");
				if (statusEnglish==true && statusGK==true)
				{
					System.out.println("you need to complete your Maths exam press 2");
				}
				else if(statusEnglish==true && statusMath==true)
				{
					System.out.println("you need to complete your GK exam press 3");
				}else if(statusGK==true && statusMath==true)
				{
					System.out.println("you need to complete your English exam press 1");
				}else if(statusGK==true)
				{
					System.out.println("you need to complete your Maths and English exam press 1 and 2");

				}else if(statusEnglish==true)
				{
					System.out.println("you need to complete your Maths and GK exam press 2 and 3");

				}else if(statusMath==true)
				{
					System.out.println("you need to complete your  English and GK  exam press 1 and 3");
				}

				
				}
		}
		while (n<=3);
	}
}
