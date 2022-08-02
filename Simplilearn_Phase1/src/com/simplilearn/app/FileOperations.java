package com.simplilearn.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
	

    static int ch,suboption;
	public static void main(String[] args) {
		
	System.out.println("***********************************************");	
    System.out.println("File Operation Application Devleoped by Heena ");	
    System.out.println("***********************************************");
	Scanner sc = new Scanner(System.in);
	enterOptions(sc);    
	}	
	
    private static void enterOptions(Scanner sc) {
    	do {
		System.out.println("\n----------MAIN MENU----------");
		System.out.println("\t 1.DISPLAY ALL FILES ");
		System.out.println("\t 2.PERFORM FILE OPERATIONS");
		System.out.println("\t 3.CLOSE THE APPLICATION");
		System.out.print("\nPLEASE ENTER YOUR OPTION:");
		ch = sc.nextInt();
		mainOptions(sc);
		
		}while(ch==3);				
	}	
		
		
	private static void mainOptions(Scanner sc) 
	{
	
		switch (ch) 
		{
		  case 1:
			displayAllFiles(sc);
			break;
		 case 2:
		    moreOptionsMenu(sc);
		    break;
		case 3:
			System.out.println("\n****THANKS FOR USING THE APPLICATION****");
			System.exit(0);
			break;
		default:System.out.println("\nINAVLID OPTION!!!!");
		        break;
		        
		}
	}

	

	private static void moreOptionsMenu(Scanner sc) {
		do {
		System.out.println("\n---------SUB MENU---------");
		System.out.println("\t1.ADD FILE");
		System.out.println("\t2.DELETE FILE");
		System.out.println("\t3.SEARCH FILE");
		System.out.println("\t4.GO BACK TO MAIN MENU\n");
		System.out.print("PLEASE ENTER YOUR OPTION:");
		suboption=sc.nextInt();
		subOptionOperations(sc);
		}while(suboption==4);		
		
	}
	private static void subOptionOperations(Scanner sc)
	{
		switch(suboption)
		{
		case 1: addFile(sc);
			    break;
		case 2:deleteFile(sc);
		       break;
		case 3:searchFile(sc);
		       break;
		case 4:enterOptions(sc);
		       break;
		default:System.out.println("\nINVALID OPTION!!!");
		        break;			
		}
	}

	private static void searchFile(Scanner sc) {
		System.out.println();
		System.out.print("PLEASE ENTER FILE NAME:");
		String Filename=" ";
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
			moreOptionsMenu(sc);
		}
		moreOptionsMenu(sc);
		
	}

	private static void deleteFile(Scanner sc) {
	 System.out.println();
	 System.out.print("PLEASE ENTER NAME OF FILE:");
	 String filename=" ";
	 filename=sc.next();
	 try {
		 File f=new File(filename);
		 if(f.exists()) {
			 f.delete();
			 System.out.println("\nFile is deleted sucessfully:"+filename);
		 }
		 else {
			 System.out.println("\nFILE NOT FOUND!!!");
			 moreOptionsMenu(sc);
		 }
		 
	 }catch(Exception ex){
		 System.out.println("\nFILE NOT FOUND!!!");
		 moreOptionsMenu(sc);
		 
	 }	
	 moreOptionsMenu(sc);
	 }
	 
	 


	private static void addFile(Scanner sc) {
		System.out.println();
		System.out.print("PLEASE ENTER THE FILE NAME:");
		String fileName=sc.next();
		try {
			File fileobject=new File(fileName);
			fileobject.createNewFile();
		}catch(IOException e){
			System.out.println("IO/error Occured please try again!!!");
			moreOptionsMenu(sc);
			
		}
		System.out.println("\nFile Created Successfully!!!!\n");
		System.out.print("Please enter data to be written in file:");
		String data=" ";
		data=sc.next();
		try {
			FileWriter FW=new FileWriter(fileName);
			FW.write(data);
			FW.close();
		} catch (IOException e) {
			System.out.println("File Not Found!!!");
			
		}
		System.out.println("\nFile Written Sucessfully:"+fileName);			
		moreOptionsMenu(sc);
	}

	

	private static void displayAllFiles(Scanner sc) {
		System.out.print("\nPlease Enter The Path For The Files:");
		String path = sc.next();

		try {
			File fobj = new File(path);
			String[] allFiles;
			allFiles = fobj.list();
			
			for (String s : allFiles) {
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println("\nINVALID PATH!!!PLEASE TRY AGAIN!!!!\n");
			enterOptions(sc);
		}

	}

}
