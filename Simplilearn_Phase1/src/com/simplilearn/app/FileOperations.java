package com.simplilearn.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
	System.out.println("***********************************************");	
    System.out.println("File Operation Application Devleoped by Heena ");	
    System.out.println("***********************************************");
	enterOptions();    
	}	
	
    private static void enterOptions() {
    	Scanner scobj=new Scanner(System.in);
    	int ch=0;
    	
    	do {
		System.out.println("\n----------MAIN MENU----------");
		System.out.println("\t 1.DISPLAY ALL FILES ");
		System.out.println("\t 2.PERFORM FILE OPERATIONS");
		System.out.println("\t 3.CLOSE THE APPLICATION");
		System.out.print("\nPLEASE ENTER YOUR OPTION:");
		ch = scobj.nextInt();
		
		switch (ch) 
		{
		  case 1:
			displayAllFiles();
			break;
		 case 2:
		     moreOptionsMenu();
		    break;
		case 3:
			System.out.println("\n****THANKS FOR USING THE APPLICATION****");
			System.exit(0);
			break;
		default:System.out.println("\nINAVLID OPTION!!!!");
		        break;
		        
		}		
	    }while(ch==3);
		
	}

	

	private static void moreOptionsMenu() {
		Scanner obj=new Scanner(System.in);
		int suboption=0;
		do {
		System.out.println("\n---------SUB MENU---------");
		System.out.println("\t1.ADD FILE");
		System.out.println("\t2.DELETE FILE");
		System.out.println("\t3.SEARCH FILE");
		System.out.println("\t4.GO BACK TO MAIN MENU\n");
		System.out.print("PLEASE ENTER YOUR OPTION:");
		suboption=obj.nextInt();
		switch(suboption)
		{
		case 1: addFile();
			    break;
		case 2:deleteFile();
		       break;
		case 3:searchFile();
		       break;
		case 4:enterOptions();
		       break;
		default:System.out.println("\nINVALID OPTION!!!");
		        break;			
		}
		
		}while(suboption==4);	
		
	}

	private static void searchFile() {
		System.out.println();
		System.out.print("PLEASE ENTER FILE NAME:");
		String Filename;
		Filename=sc.next();
		try {
			File Fobj=new File("/Volumes/MacDrive1/HeenaWork/workspace/Simplilearn_Phase1");
			String [] filenames=Fobj.list();
			List<String> listobj=new ArrayList<String>();
			for(String s1:filenames)
			{
				listobj.add(s1);
			
			}
			if(listobj.contains(Filename))
			{
				System.out.println("\nFile is Available!!!: "+Filename+"\n");
			}
			else
			{
				System.out.println("\nOHH!!!FILE IS NOT AVAILABLE\n");
			}
			
			
		}catch(Exception e) {
			System.out.println("FILE NOT FOUND!!!!\n");
			moreOptionsMenu();
		}	
		moreOptionsMenu();
		
	}

	private static void deleteFile() {
	 System.out.println();
	 System.out.print("PLEASE ENTER NAME OF FILE:");
	 String filename;
	 filename=sc.nextLine();
	 try {
		 File f=new File(filename);
		 if(f.exists()) {
			 f.delete();
			 System.out.println("\nFile is deleted sucessfully:"+filename);
		 }
		 else {
			 System.out.println("\nFILE NOT FOUND!!!");
		 }
		 
	 }catch(Exception ex){
		 System.out.println("\nFILE NOT FOUND!!!");
		 moreOptionsMenu();
		 
	 }	
	 moreOptionsMenu();
	 }
	 
	 


	private static void addFile() {
		System.out.println();
		System.out.print("PLEASE ENTER THE FILE NAME:");
		String fileName=sc.next();
		try {
			File fileobject=new File(fileName);
			fileobject.createNewFile();
		}catch(IOException e){
			System.out.println("IO/error Occured please try again!!!");
			sc.close();
			moreOptionsMenu();
			
		}
		System.out.println("\nFile Created Successfully!!!!\n");
		System.out.print("Please enter data to be written in file:");
		String data;
		data=sc.next();
		try {
			FileWriter FW=new FileWriter(fileName);
			FW.write(data);
			FW.close();
		} catch (IOException e) {
			System.out.println("File Not Found!!!");
			
		}
		System.out.println("\nFile Written Sucessfully:"+fileName);		
		moreOptionsMenu();
	}

	

	private static void displayAllFiles() {

		try {
			File fobj = new File("/Volumes/MacDrive1/HeenaWork/workspace/Simplilearn_Phase1");
			String[] allFiles;
			allFiles = fobj.list();
			System.out.println("\n------ALL FILES----\n");
			
			for (String s : allFiles) {
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println("\nINVALID PATH!!!PLEASE TRY AGAIN!!!!\n");
			enterOptions();
		}
		enterOptions();

	}
	
	

}
