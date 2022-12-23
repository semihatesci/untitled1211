
public class Node2 {
	int EmpNo;
    String name,surName;
    Node2 ileri;
    Node2 geri;
    Node2(String name,String surName,int EmpNo){
        this.name=name;
        this.surName=surName;
        this.EmpNo=EmpNo;
        this.ileri=null;
        this.geri=null;}
}