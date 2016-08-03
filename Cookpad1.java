package test;

public class Cookpad1 {

	public static void main(String[] args) {
		String input = args[0];
		int startIndex = input.indexOf("{");
		int endIndex = input.indexOf("}");

		//{}の中の文字列
		String part1 = input.substring(startIndex+1,endIndex);
		//}の後ろの文字列
		String part2 = input.substring(endIndex+1);

		//{}の中の文字列をカンマで配列に分ける
		String[] array = part1.split(",");

		//繰り返し
		for(String temp:array){
			System.out.println(temp+part2);
		}
	}

}
