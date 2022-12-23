
public class Bkuyruk {
	 kuyruk first=null,last=null;   
	 
	    public void Ekle(String name,String surName,int EmpNo){
	        kuyruk e=new kuyruk(name,surName,EmpNo);   
	        if(first==null){              
	            first=e;
	            last=e;
	        }else {       
	            last.next=e;
	            last=e;
	        }
	    }
	    public void Listele(){      
	        kuyruk temp=first;
	        while(temp!=null){          
	            System.out.println(temp.name+" "+temp.surName+" "+temp.EmpNo);
	            temp=temp.next;
	        }
	    }
	    public void sil(int no){        
	        kuyruk temp=first;
			kuyruk before=first;
	        while (temp!=null){          
	            if(temp.EmpNo==no){       
	                break;
	            }
	            before=temp;
	            temp=temp.next;
	        }
	        if(first==null){
	            System.out.println("Aranan no bulunamadý");  //ilk düðüm boþsa yoktur
	        }
	        if(first==last){     
	            first=null;
	            last=null;
	        }else{
	            if(temp==first){    
	                first=temp.next;
	            }else if (temp==last){   
	                last=before;
	                before.next=null;
	            }else {
	                before.next=temp.next;   
	        }
	    }
	    }}


