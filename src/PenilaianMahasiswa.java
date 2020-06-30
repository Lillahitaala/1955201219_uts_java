/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class PenilaianMahasiswa {
    public static void main(String[] args) {
        String nim;
        boolean running = true;
	String nama; 
        String jawab;
	String matkul;
	int nilai=0;
	String grade = ""
                + ""
                + " ";
	
	Scanner n=new Scanner(System.in);
        
        //Perulangan
        for(String i="y"; i.equals("y") || i.equals("y");){
        System.out.print("nim : ");
	nim=n.nextLine();
	System.out.print("Nama Mahasiswa : ");
	nama=n.nextLine();
	System.out.print("Nama Matakuliah : ");
	matkul=n.nextLine();
	System.out.print("Nilai : ");
	nilai=n.nextInt();

		if(nilai >=80 && nilai <=100)
		{
		grade="A";
		}
		else if(nilai>=69 && nilai<=79)
		{
		grade="B";
		}
		else if (nilai>=56 && nilai<=68)
		{
		grade="C";
		}
		else if(nilai <=40 && nilai >=55)
		{
		grade="D";
		}
		
	System.out.println("____________________________");
	System.out.println("Nim : "+nim+"\n"+"Nama Mahasiswa : "+nama+"\n"+"Nama Matakuliah : "+matkul+"\n"+"Nilai : "+nilai+"\n"+"Grade : "+ grade);
        
        
        
        System.out.print("Aapakah anda ingin input ulang?");
        i = n.next();
        }
    }   
    }
	

    
   

