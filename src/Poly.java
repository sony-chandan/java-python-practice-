import java.util.Arrays;

class Animal {
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {
	void sound () {
		System.out.println("Dog barks");
	}
}

class VariableArgumentExamples {
	public int sum (int... numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum  += number;
		}
		return sum;
	}
}

public class Poly {

	public static void main(String[] args) {
		Animal a = new Dog ();
		a.sound();
		
		int[] marks = {12, 25,13,56,76};
		System.out.println(Arrays.toString(marks));
		
		int set1[] = {1,2,3,4,5};
		int set2[] = {2,5,3,4,1};
		int set3[] = {1,2,3,4,5};
		System.out.println(Arrays.equals(set1, set2));
		System.out.println(Arrays.equals(set1, set3));
		
		VariableArgumentExamples example = new VariableArgumentExamples();
		System.out.println(example.sum(set3));
		System.out.println(example.sum(set2));
		System.out.println(example.sum(35,61,67,45,98,76,45,23,12));
	}
}
