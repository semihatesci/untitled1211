import 




public class Main {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Bnode f=new Bnode();
		BNode1 f1=new BNode1();
		BNode2 f2=new BNode2();
		Bkuyruk k1=new Bkuyruk();
		Bstack k2=new Bstack();
		int a=0;

		do{
			System.out.println("Men�ye Ho�geldiniz:");
			System.out.println("1-�ift Ba�l� Liste:");
			System.out.println("2-Tek Ba�l� Liste:");
			System.out.println("3-Dairesel Liste:");
			System.out.println("4-Kuyruk");
			System.out.println("5-Steak");
			System.out.println("6-��k��:");
			a=s.nextInt();
			if(a==2){
				
				System.out.println("1-Ekleme:");
				System.out.println("2-Sil:");
				System.out.println("3-Listeleme:");
				System.out.println("4-��k��:");
				int b=s.nextInt();
				switch(b){
				case 1:
					System.out.println("Eklemek istedi�iniz �grenci no:");
					int c=s.nextInt();
					System.out.println("isim");
					String a1=s.next();
					System.out.println("soyisim");
					String b1=s.next();
					f.Ekle(a1,b1,c);
					
					break;
          case 2:
        	  System.out.println("Silmek istedi�iniz �grenci");
				int c1=s.nextInt();
				f.sil(c1);
					break;
          case 3:
        	  System.out.println("Listelendi:");
        	  f.Listele();
	       break;
          case 4:
        	  a=4;
        	  break;
				}}
				else if(a==1){
					System.out.println("1-Ekleme:");
					System.out.println("2-Sil:");
					System.out.println("3-Listeleme:");
					System.out.println("4-��k��:");
					int b6=s.nextInt();
					switch(b6){
					case 1:
						System.out.println("Eklemek istedi�iniz �grenci no:");
						int c=s.nextInt();
						System.out.println("isim");
						String a1=s.next();
						System.out.println("soyisim");
						String b1=s.next();
						f1.sonaEkle(a1, b1, c);
						
						break;
	          case 2:
	        	  System.out.println("Silmek istedi�iniz �grenci");
					int c1=s.nextInt();
					f1.girilenSil(c1);
						break;
	          case 3:
	        	  System.out.println("Listelendi:");
	        	  f1.Listele();
		       break;
	          case 4:
	        	  a=4;
	        	  break;
				}}
				else if(a==3){
					System.out.println("1-Ekleme:");
					System.out.println("2-Sil:");
					System.out.println("3-Listeleme:");
					System.out.println("4-��k��:");
					int b4=s.nextInt();
					switch(b4){
					case 1:
						System.out.println("Eklemek istedi�iniz �grenci no:");
						int c=s.nextInt();
						System.out.println("isim");
						String a1=s.next();
						System.out.println("soyisim");
						String b1=s.next();
						f.Ekle(a1,b1,c);
						
						break;
	          case 2:
	        	  System.out.println("Silmek istedi�iniz �grenci");
					int c1=s.nextInt();
					f2.sil();
						break;
	          case 3:
	        	  System.out.println("Listelendi:");
	        	  f.Listele();
		       break;
	          case 4:
	        	  a=4;
	        	  break;
					}}
				else if(a==4){
					System.out.println("1-Ekleme:");
					System.out.println("2-Sil:");
					System.out.println("3-Listeleme:");
					System.out.println("4-��k��:");
					int b4=s.nextInt();
					switch(b4){
					case 1:
						System.out.println("Eklemek istedi�iniz �grenci no:");
						int c=s.nextInt();
						System.out.println("isim");
						String a1=s.next();
						System.out.println("soyisim");
						String b1=s.next();
						k1.Ekle(a1,b1,c);
						
						break;
	          case 2:
	        	  System.out.println("Silmek istedi�iniz �grenci");
					int c1=s.nextInt();
					k1.sil(c1);
						break;
	          case 3:
	        	  System.out.println("Listelendi:");
	        	  k1.Listele();
		       break;
	          case 4:
	        	  a=4;
	        	  break;
					}}
				else if(a==5){
					System.out.println("1-Ekleme:");
					System.out.println("2-Sil:");
					System.out.println("3-Listeleme:");
					System.out.println("4-��k��:");
					int b4=s.nextInt();
					switch(b4){
					case 1:
						System.out.println("Eklemek istedi�iniz �grenci no:");
						int c=s.nextInt();
						System.out.println("isim");
						String a1=s.next();
						System.out.println("soyisim");
						String b1=s.next();
						k2.ekle(a1,b1,c);
						
						break;
	          case 2:
	        	  System.out.println("Silmek istedi�iniz �grenci");
					int c8=s.nextInt();
					k2.sil();
						break;
	          case 3:
	        	  System.out.println("Listelendi:");
	        	  k2.yazdir();
		       break;
	          case 6:
	        	  a=6;
	        	  break;
					}}
			
			}
		
				while (a!=6);
	 

		}}


