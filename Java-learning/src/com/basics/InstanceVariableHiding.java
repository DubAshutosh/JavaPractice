package com.basics;

public class InstanceVariableHiding {
	int var= 10;
	
	void method() {
		int var= 40;
		System.out.println(var);
		System.out.println(this.var);
	}

	public static void main(String[] args) {
		InstanceVariableHiding ref= new InstanceVariableHiding();
		ref.method();
													
	}

}
