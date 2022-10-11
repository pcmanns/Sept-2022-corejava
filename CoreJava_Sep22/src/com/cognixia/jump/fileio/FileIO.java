package com.cognixia.jump.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;


public class FileIO {

	public static void main(String[] args) {
		File file = new File("resources/temp.txt");
		FileWriter fileWriter=null;
		BufferedWriter writer=null;
		FileReader fileReader=null;
		BufferedReader reader=null;
		
		
		
		try {	
			
			fileReader =new FileReader(file);
			reader= new BufferedReader(fileReader);
			fileWriter = new FileWriter(file,true);
			writer = new BufferedWriter(fileWriter);

			int charValue=0;
			while((charValue = reader.read())!=-1) {
				char letter= (char)charValue;
				System.out.print(letter);
			}
			writer.write("frist line\n");
			
			writer.close();
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			File data = new File("resources/file.data");
			FileOutputStream dataOut = new FileOutputStream(data);
			ObjectOutputStream writer2 = new ObjectOutputStream(dataOut);
					
			int[] arr= {1,2,4,5};
			writer2.writeObject(arr);
					
			FileInputStream dataIn = new FileInputStream(data);
			ObjectInputStream dataReader = new ObjectInputStream(dataIn);
			int[] arr2=(int[])dataReader.readObject();
			System.out.print(arr2[1]);
			dataReader.close();
			writer2.close();
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
