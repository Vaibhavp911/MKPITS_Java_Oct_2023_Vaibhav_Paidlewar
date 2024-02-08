package com.mkpits.collection.set.tree;

public class DataSendingToTreeNodeClass {

	public static void main(String[] args) 
	{
		TreeNode school = new TreeNode("School");
		TreeNode classes = new TreeNode("Class");
		TreeNode student = new TreeNode("Student");
		TreeNode boy = new TreeNode("Boy");
		TreeNode girl = new TreeNode("Girl");
		
		school.addChildern(classes);
//		school.addChildern(student);
//		school.addChildern(boy);
//		school.addChildern(girl);
		
		TreeNode class1 = new TreeNode("Class1");
		TreeNode class2 = new TreeNode("Class2");
		TreeNode class3 = new TreeNode("Class3");
		TreeNode class4 = new TreeNode("Class4");
		TreeNode class5 = new TreeNode("Class5");
		TreeNode class6 = new TreeNode("Class6");
		TreeNode class7 = new TreeNode("Class7");
		TreeNode class8 = new TreeNode("Class8");
		TreeNode class9 = new TreeNode("Class9");
		TreeNode class10 = new TreeNode("Class10");
		
		classes.addChildern(class1);
		classes.addChildern(class2);
		classes.addChildern(class3);
		classes.addChildern(class4);
		classes.addChildern(class5);
		classes.addChildern(class6);
		classes.addChildern(class7);
		classes.addChildern(class8);
		classes.addChildern(class9);
		classes.addChildern(class10);
		
		TreeNode student1 = new TreeNode("Student1");
		TreeNode student2 = new TreeNode("Student2");
		TreeNode student3 = new TreeNode("Student3");
		TreeNode student4 = new TreeNode("Student4");
		TreeNode student5 = new TreeNode("Student5");
		TreeNode student6 = new TreeNode("Student6");
		TreeNode student7 = new TreeNode("Student7");
		TreeNode student8 = new TreeNode("Student8");
		TreeNode student9 = new TreeNode("Student9");
		TreeNode student10 = new TreeNode("Student10");
		
		class1.addChildern(student1);
		class2.addChildern(student2);
		class3.addChildern(student3);
		class4.addChildern(student4);
		class5.addChildern(student5);
		class6.addChildern(student6);
		class7.addChildern(student7);
		class8.addChildern(student8);
		class9.addChildern(student9);
		class10.addChildern(student10);
		
		TreeNode boy1 = new TreeNode("Boy_Class_1");
		TreeNode girl1 = new TreeNode("Girl_Class_1");
		
		TreeNode boy2 = new TreeNode("Boy_Class_2");
		TreeNode girl2 = new TreeNode("Girl_Class_2");
		
		TreeNode boy3 = new TreeNode("Boy_Class_3");
		TreeNode girl3 = new TreeNode("Girl_Class_3");
		
		TreeNode boy4 = new TreeNode("Boy_Class_4");
		TreeNode girl4 = new TreeNode("Girl_Class_4");
		
		TreeNode boy5 = new TreeNode("Boy_Class_5");
		TreeNode girl5 = new TreeNode("Girl_Class_5");
		
		TreeNode boy6 = new TreeNode("Boy_Class_6");
		TreeNode girl6 = new TreeNode("Girl_Class_6");
		
		TreeNode boy7 = new TreeNode("Boy_Class_7");
		TreeNode girl7 = new TreeNode("Girl_Class_7");
		
		TreeNode boy8 = new TreeNode("Boy_Class_8");
		TreeNode girl8 = new TreeNode("Girl_Class_8");
		
		TreeNode boy9 = new TreeNode("Boy_Class_9");
		TreeNode girl9 = new TreeNode("Girl_Class_9");
		
		TreeNode boy10 = new TreeNode("Boy_Class_10");
		TreeNode girl10 = new TreeNode("Girl_Class_10");
		
		student1.addChildern(boy1);
		student1.addChildern(girl1);
		student2.addChildern(boy2);
		student2.addChildern(girl2);
		student3.addChildern(boy3);
		student3.addChildern(girl3);
		student4.addChildern(boy4);
		student4.addChildern(girl4);
		student5.addChildern(boy5);
		student5.addChildern(girl5);
		student6.addChildern(boy6);
		student6.addChildern(girl6);
		student7.addChildern(boy7);
		student7.addChildern(girl7);
		student8.addChildern(boy8);
		student8.addChildern(girl8);
		student9.addChildern(boy9);
		student9.addChildern(girl9);
		student10.addChildern(boy10);
		student10.addChildern(girl10);
		
		
		System.out.println(school.print(0));

	}

}
