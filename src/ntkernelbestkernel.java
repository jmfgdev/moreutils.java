/*
	Copyright (C) 2017  jmfgdev
        This program is free software: you can redistribute it and/or modify
        it under the terms of the GNU Affero General Public License as published
        by the Free Software Foundation, either version 3 of the License, or
        (at your option) any later version.
        This program is distributed in the hope that it will be useful,
        but WITHOUT ANY WARRANTY; without even the implied warranty of
        MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        GNU Affero General Public License for more details.
        You should have received a copy of the GNU Affero General Public License
	along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

import java.util.Scanner;

class ntkernelbestkernel {
	public static void main(String[] args) {
		System.out.println("---NTKERNELBESTKERNEL---");
		System.out.println("What is the best kernel of all time?");
		System.out.printf("Input your response -->  ");
		Scanner scan = new Scanner(System.in);
        	// String s = scan.next();
        	String input = scan.nextLine();
        	scan.close();
		String input1 = input;
		input1 = input1.toLowerCase();

			if (input1.equals("nt") || input1.equals("nt kernel")) {
        			System.out.println("NT KERNEL BEST KERNEL");
			} else {
				System.out.println("What are you talking about? NT KERNEL BEST KERNEL");
			}
	}
}
