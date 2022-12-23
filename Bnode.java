
public class Bnode {
	 Node first=null,last=null;   // ilk ve son düðümler baþlangýçta null
	 
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
	    public void sil(int no){        //silmek istediðim numarayý önce bulmam lazým.Yine baþtan baþlatacaðým bir geçici deðer lazým(temp)
	        Node temp=first,before=first;//before öncesini tutmak için kullanýyorum çünkü silmek istediðim deðerin öncesini bilmem lazým ki
	        while (temp!=null){              //öncesinin sonrasýna sonrakinin sonrasýný atamam lazým.Arada ki elemaý bulamak için.
	            if(temp.EmpNo==no){        //zaten tek yönlü baðlý listede böyle bi dezavantaj olduðunu söylemiþtim.
	                break;
	            }
	            before=temp;
	            temp=temp.next;
	        }
	        if(first==null){
	            System.out.println("Aranan no bulunamadý");  //ilk düðüm boþsa yoktur
	        }
	        if(first==last){      //tek düðümse sil.
	            first=null;
	            last=null;
	        }else{
	            if(temp==first){    //ilk düðümse sonrakini ilke ata.
	                first=temp.next;
	            }else if (temp==last){   //en sonsa önceki deðeri sona gönder.Ve önceki deðerin sonrasýnýn göstericisini null yap.
	                last=before;
	                before.next=null;
	            }else {
	                before.next=temp.next;   //arada bir deðerse aradýðýn numaranýn bi sonrasýný öncesinin sonrasýna ata.Ve bu sayede aradaki
	            }                               //düðümü kýrýp birleþtiriyoruz.
	        }
	    }
	}
	