
public class Bnode {
	 Node first=null,last=null;   // ilk ve son d���mler ba�lang��ta null
	 
	    public void Ekle(String name,String surName,int EmpNo){
	        Node e=new Node(name,surName,EmpNo);   
	        if(first==null){              
	            first=e;
	            last=e;
	        }else {       
	            last.next=e;
	            last=e;
	        }
	    }
	    public void Listele(){      
	        Node temp=first;
	        while(temp!=null){          
	            System.out.println(temp.name+" "+temp.surName+" "+temp.EmpNo);
	            temp=temp.next;
	        }
	    }
	    public void sil(int no){        //silmek istedi�im numaray� �nce bulmam laz�m.Yine ba�tan ba�lataca��m bir ge�ici de�er laz�m(temp)
	        Node temp=first,before=first;//before �ncesini tutmak i�in kullan�yorum ��nk� silmek istedi�im de�erin �ncesini bilmem laz�m ki
	        while (temp!=null){              //�ncesinin sonras�na sonrakinin sonras�n� atamam laz�m.Arada ki elema� bulamak i�in.
	            if(temp.EmpNo==no){        //zaten tek y�nl� ba�l� listede b�yle bi dezavantaj oldu�unu s�ylemi�tim.
	                break;
	            }
	            before=temp;
	            temp=temp.next;
	        }
	        if(first==null){
	            System.out.println("Aranan no bulunamad�");  //ilk d���m bo�sa yoktur
	        }
	        if(first==last){      //tek d���mse sil.
	            first=null;
	            last=null;
	        }else{
	            if(temp==first){    //ilk d���mse sonrakini ilke ata.
	                first=temp.next;
	            }else if (temp==last){   //en sonsa �nceki de�eri sona g�nder.Ve �nceki de�erin sonras�n�n g�stericisini null yap.
	                last=before;
	                before.next=null;
	            }else {
	                before.next=temp.next;   //arada bir de�erse arad���n numaran�n bi sonras�n� �ncesinin sonras�na ata.Ve bu sayede aradaki
	            }                               //d���m� k�r�p birle�tiriyoruz.
	        }
	    }
	}
	