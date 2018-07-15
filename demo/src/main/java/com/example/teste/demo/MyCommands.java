package com.example.teste.demo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import com.example.teste.demo.enums.Time;

@ShellComponent
public class MyCommands {

	@ShellMethod("Add two or more integers")
	public int add(int a, @ShellOption(arity = 3) int[] b) {
		int c = 0;
		for (int cont : b) {
			c += cont;
		}
		return a + c;
	}

	@ShellMethod("Tip time and dishes")
	public String dishes(String day, @ShellOption(arity = 3) int[] dishes) {
		String response = "";
		if (day.toUpperCase().equals(Time.MORNING.toString())) {
			Time temp = Time.MORNING;
			for (int dish : dishes) {
				switch (dish) {
				case 1:
					if(!response.contains(temp.getRef1()))
						response += temp.getRef1() + " ";
					break;
				case 2:
					if(!response.contains(temp.getRef2()))
						response += temp.getRef2() + " ";
					break;

				case 3:
					response += temp.getRef3() + " ";
					break;

				case 4:
					response += "error ";
					break;
				}
			}
		} else if (day.toUpperCase().equals(Time.NIGHT.toString())) {
			Time temp = Time.NIGHT;
			for (int cont : dishes) {
				switch (cont) {
				case 1:
					if(!response.contains(temp.getRef1()))
					response += temp.getRef1() + " ";
					break;
				case 2:
					response += temp.getRef2() + " ";
					break;
				case 3:
					if(!response.contains(temp.getRef3()))
					response += temp.getRef3() + " ";
					break;
				case 4:
					if(!response.contains(temp.getRef4()))
					response += temp.getRef4() + " ";
					break;
				}
				
			}
		}
		return response;
	}
}
