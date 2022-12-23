
public class BNode1 {
	Node1 bas=null;
	Node1 son=null;
	public void basaEkle(String name,String surName,int EmpNo){
        Node1 e=new Node1(name,surName,EmpNo);
       
        if(bas == null){
            bas = e ;
            son = e ;
        }
        else {
            e.ileri = bas ;
            bas.geri = e ;
            bas = e ;
        }
    }
    
    public void sonaEkle(String name,String surName,int EmpNo){
    	Node1 e=new Node1(name,surName,EmpNo);
        if(bas == null){
            bas = e ;
            son = e ;
        }
        else {
      
            e.geri = son ;
            son.ileri = e ;
            son = e ;
        }
    }
    
    	 public void arayaEkle(int nereye,Node1 ekleneceksayi,String name,String surName,int EmpNo){
    	
    		 Node1 e=new Node1(name,surName,EmpNo);
    	        Node1 yedek = bas;
    	        while(yedek.EmpNo != nereye){
    	            yedek = yedek.ileri ;
    	            if(yedek == null){
    	                System.out.println("Hi� Eleman yok");
    	            }
    	        }
    	        if (yedek == son){
    	            ekleneceksayi.ileri = null ;
    	            son = ekleneceksayi;
    	        }
    	        else {
    	            ekleneceksayi.ileri = yedek.ileri ;
    	            yedek.ileri.geri = ekleneceksayi;
    	        }
    	        ekleneceksayi.geri = yedek ;
    	        yedek.ileri = ekleneceksayi ;}
    public void bastanSil(){
     
        if(bas.ileri == null){
            son = null;
        }
        else {
        
            bas.ileri.geri = null;
            bas = bas.ileri;
        }
    }
    
    public void sondanSil(){
        // E�er ba�taki eleman�n ilerisi bo�sa tek eleman varsa bas == son'dur bu y�zden ba�� null yaparak tek eleman� siliyoruz.
        if(bas.ileri == null){
            bas = null ;
        }
        else {
    
            son.geri.ileri = null;
            son = son.geri;
        }
    }
    
    public void girilenSil(int aranan) {
        Node1 yedek = bas;
        while(yedek.EmpNo != aranan){
            yedek = yedek.ileri;
            if(yedek == null){
                System.out.println("Bo�");
            }
        }
        if (yedek == bas) {
            bas = yedek.ileri ;
        }
        else {
            yedek.geri.ileri = yedek.ileri;
        }
    }
    
    
    	public void Listele(){      
	        Node1 yedek=bas;
	        while(yedek!=null){          
	            System.out.println(yedek.name+" "+yedek.surName+" "+yedek.EmpNo);
	            yedek=yedek.ileri;
    }

}}
