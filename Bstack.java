
public class Bstack {
	stack son;
	public void ekle(String name,String surName,int EmpNo){
    	stack e=new stack(name,surName,EmpNo);
		
		if(son==null) {
			son=e;
		
		}else {
			e.ileri=son;
			son=e;
			
			
			
		}
		
	}
	public void sil() {
		
			stack temp;
			temp=son;
			son=son.ileri;
			
	
	}
	
	public void yazdir() {
		
		
		 stack temp=son;
		
		
			
			do {
			            System.out.println(temp.name+" "+temp.surName+" "+temp.EmpNo);
			            temp=temp.ileri;
				
			}while(temp!=null);
			
		            
			
		
		
		
	}
	
	
	

}
