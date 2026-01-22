package ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class Mul{
	public int[] inputArr() {
		Scanner input = new Scanner(System.in);
		int[] intArr = new int[2];
		
		System.out.println("수 입력");
		intArr[0] = input.nextInt();
		intArr[1] = input.nextInt();
		
		return intArr;
	}
	public int sumArr(int[] arr) {
		int sum = arr[0] + arr[1];
		return sum;
	}
	public void printArr(int s) {
		System.out.println("arr 합 : "+s);
	}
	public ArrayList<Integer> inputList(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력");
		int n1 = input.nextInt();
		list.add(n1);
		list.add( input.nextInt() );
		return list;
	}
	public int sumList(ArrayList<Integer> list) {
		//int sum = list.get(0) + list.get(1);
		//return sum;
		return list.get(0) + list.get(1);
	}
	public void printList(int s) {
		System.out.println("list 합 : "+s);
	}
	
	public HashMap<String, Integer> inputMap(){
		HashMap<String, Integer> map
								= new HashMap<String, Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력");
		int n1 = input.nextInt();
		map.put("n1", n1 );
		map.put("n2", input.nextInt() );
		return map;
	}
	public int sumMap(HashMap<String, Integer> map) {
		//int sum = map.get("n1") + map.get("n2");
		//return sum;
		return map.get("n1") + map.get("n2");
	}
	public void printMap(int s) {
		System.out.println("map 합 : "+s);
	}
}
public class Quiz02 {
	public static void main(String[] args) {
		int sum = 0;
		Mul mul = new Mul();
		int[] arr = mul.inputArr();
		sum = mul.sumArr( arr );
		mul.printArr(sum);
		
		System.out.println("--- list ---");
		ArrayList<Integer> l = mul.inputList();
		int s = mul.sumList( l );
		mul.printList( s );
		
		System.out.println("--- map ---");
		HashMap<String, Integer> map = mul.inputMap();
		sum = mul.sumMap(map);
		mul.printMap( sum );
	}
}









