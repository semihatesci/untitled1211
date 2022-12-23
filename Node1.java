
public class Node1 {
	int EmpNo;
    String name,surName;
    Node1 ileri;
    Node1 geri;
    Node1(String name,String surName,int EmpNo){
        this.name=name;
        this.surName=surName;
        this.EmpNo=EmpNo;
        this.ileri=null;
        this.geri=null;
    }

}
