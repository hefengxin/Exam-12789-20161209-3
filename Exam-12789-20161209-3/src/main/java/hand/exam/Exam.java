package hand.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("请输入日期：");
		String date = sr.next();

		String[] split = date.split("-");
		int year = Integer.parseInt(split[0]); // 年数
		int month = Integer.parseInt(split[1]); // 月数
		int day = Integer.parseInt(split[2]); // 天数

		List<Integer> dayList = new ArrayList<Integer>();
		dayList.add(4);
		dayList.add(6);
		dayList.add(9);
		dayList.add(11);
		
		int sum = 0;
		for (int i = 1; i < month; i++) {
			if (i == 2) {
				if (year % 4 == 0 && year % 400 == 0) {
					sum += 29;
				} else {
					sum += 28;
				}
			} else if (dayList.contains(i)) {
				sum += 30;
			} else {
				sum += 31;
			}
		}
		sum += day;
		System.out.print("你输入的日期为当年的第" + sum + "天");
	}
}
