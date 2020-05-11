import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
public class HillCipher {
	int keymatrix[][];
	int linematrix[];
	int resultmatrix[];
	public void divide(String temp, int s) {
		while(temp.length()> s) {
		String sub = temp.substring(0,s);
		temp = temp.substring(s, temp.length());
		perform(sub);
		}
		if(temp.length() == s )
			perform (temp);
		else if (temp.length()< s ) {
			for(int i = temp.length();i<s++)
				temp = temp + 'x';
					perform(temp);
		}
	}
	public void perform (String line) {
		linematrix(line);
		linemultiplykey(line.length());
		result(line.length());
	}
	public void keytomatrix(String line) {
		keymatrix = new int[len]
	}
}
