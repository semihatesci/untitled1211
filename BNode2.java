
public class BNode2 {
	Node2 bas=null;
	public void ekle(String name,String surName,int EmpNo){
    	Node2 e=new Node2(name,surName,EmpNo);
		
		if(bas==null) {
			bas=e;
			bas.ileri=bas;
			bas.geri=bas;
		}else {
			e.ileri=bas;
			e.geri=bas.geri;
			bas.geri.ileri= e;
			bas.geri=e;
			bas=e;
			
			
		}
		
	}
	public void sil() {
		if(bas.ileri==null) {
			bas=null;
		}else {
			
			bas.geri.ileri=bas.ileri;
			bas.ileri.geri=bas.geri;
			bas=bas.ileri;
		}
	
	}
	
	public void yazdir() {
		
		
		 Node2 temp=bas;
		
		do {
		            System.out.println(temp.name+" "+temp.surName+" "+temp.EmpNo);
		            temp=temp.ileri;
			
		}while(temp!=bas);
		
		
	}
	

}
