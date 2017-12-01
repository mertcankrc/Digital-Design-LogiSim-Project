import java.util.*;
import java.lang.*;
import java.io.*;
public class Digital {

	public static void main(String[] args) {
		
		String line;
		
		
		String delimiter1 = " ";
		String delimiter2 = ",";
		
		
		File file = new File("input.txt");
		
		//Clear output file
		File outputFile = new File("output.txt");
		PrintWriter writer;
		try {
			writer = new PrintWriter(outputFile);
			writer.print("");
			writer.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				line = sc.nextLine();
				
				line = line.replaceAll(delimiter1, delimiter2);
				String[] stringSplitted = line.split(delimiter2);
				
				converter(stringSplitted);
				System.out.print("\n");
				
			}
		}
		catch(FileNotFoundException e){
			
		}
		
	}


public static void converter(String[] stringSplitted) {
    String opCode;
    String register;
    String output="";
  
	switch(stringSplitted[0]) {
	case "JUMP":
		opCode = "0000";
		System.out.print(opCode + registers(stringSplitted[1], 16));
		output = opCode + registers(stringSplitted[1], 16);
		break;
	case "ADD": 
		opCode = "0001";
		System.out.print(opCode + registers(stringSplitted[1],0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 0) + "0000");
		output = opCode + registers(stringSplitted[1],0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 0) + "0000";
		break;
	case "AND":
		opCode = "0010";
		System.out.print(opCode + registers(stringSplitted[1],0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 0) + "0000");
		output = opCode + registers(stringSplitted[1],0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 0) + "0000";
		break;
	case "OR":
		opCode = "0011";
		System.out.print(opCode + registers(stringSplitted[1],0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 0) + "0000");
		output = opCode + registers(stringSplitted[1],0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 0) + "0000";
		break;
	case "XOR":
		opCode = "0100";
		System.out.print(opCode + registers(stringSplitted[1],0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 0) + "0000");
		output = opCode + registers(stringSplitted[1],0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 0) + "0000";
		break;
	case "ADDI":
		opCode = "0101";
		System.out.print(opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 8) );
		output = opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 8);
		break;
	case "ANDI":
		opCode = "0110";
		System.out.print(opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 8) );
		output = opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 8);
		break;
	case "ORI":
		opCode = "0111";
		System.out.print(opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 8) );
		output = opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 8);
		break;
	case "XORI":
		opCode = "1000";
		System.out.print(opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 8) );
		output = opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + registers(stringSplitted[3], 8);
		break;
	case "LD" :
		opCode = "1001";
		System.out.print(opCode + registers(stringSplitted[1],0 ) + registers(stringSplitted[1], 12 ) );
		output = opCode + registers(stringSplitted[1],0 ) + registers(stringSplitted[1], 12 );
		break;
	case "ST" :
		opCode = "1010";
		System.out.print(opCode + registers(stringSplitted[1],0 ) + registers(stringSplitted[1], 12 ));
		output = opCode + registers(stringSplitted[1],0 ) + registers(stringSplitted[1], 12 );
		break;
	case "BEQ" :
		opCode = "1011";
		System.out.print(opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "010" + registers(stringSplitted[3], 5 ));
		output = opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "010" + registers(stringSplitted[3], 5 );
		break;
	case "BLT" :
		opCode = "1100";
		System.out.print(opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "100" + registers(stringSplitted[3], 5 ));
		output = opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "100" + registers(stringSplitted[3], 5 );
		break;
	case "BGT" :
		opCode = "1101";
		System.out.print(opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "001" + registers(stringSplitted[3], 5 ));
		output = opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "001" + registers(stringSplitted[3], 5 );
		break;
	case "BLE" :
		opCode = "1110";
		System.out.print(opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "110" + registers(stringSplitted[3], 5 ));
		output = opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "110" + registers(stringSplitted[3], 5 );
		break;
	case "BGE" :
		opCode = "1111"; 
		System.out.print(opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "011" + registers(stringSplitted[3], 5 ));
		output = opCode + registers(stringSplitted[1], 0) + registers(stringSplitted[2], 0) + "011" + registers(stringSplitted[3], 5 );
		break;
	default:
		System.out.print("ERROR!");
		break;
	}
	System.out.print(" ");
	try(FileWriter fw = new FileWriter("output.txt", true);
		    BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter out = new PrintWriter(bw))
		{
		    out.println(output);
		    
		} catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
	
	
}
public static String registers(String register, int a) {
	char neg = '-';
	switch(register) {
	case "R0":
		register = "0000";
		break;
	case "R1": 
		register = "0001";
		break;
	case "R2":
		register = "0010";
		break;
	case "R3":
		register = "0011";
		break;
	case "R4":
		register = "0100";
		break;
	case "R5":
		register = "0101";
		break;
	case "R6":
		register = "0110";
		break;
	case "R7":
		register = "0111";
		break;
	case "R8":
		register = "1000";
		break;
	case "R9" :
		register = "1001";
		break;
	case "R10" :
		register = "1010";
		break;
	case "R11" :
		register = "1011";
		break;
	case "R12" :
		register = "1100";
		break;
	case "R13" :
		register = "1101";
		break;
	case "R14" :
		register = "1110";
		break;
	case "R15" :
		register = "1111"; 
		break;
	default:
		
			
			int binary = Integer.parseInt(register);			
			register = Integer.toBinaryString(binary);
			
			if( binary >= 0) {
				if(a == 16) {
					register = Integer.toBinaryString(0x10000 |binary).substring(1);
				}
				else if ( a == 12) {
					register = Integer.toBinaryString(0x1000 |binary).substring(1);
				}
				
				else if ( a == 8) {
					register = Integer.toBinaryString(0x100 |binary).substring(1);
				}
				else if ( a == 5 ) {
					register = Integer.toBinaryString(0x20 |binary).substring(1);
				}
				else if ( a == 4 ) {
					register = Integer.toBinaryString(0x10 |binary).substring(1);
				}
			}
			else {
				if(a == 16) {
					register = Integer.toBinaryString(binary).substring(16);
				}
				else if ( a == 12) {
					register = Integer.toBinaryString(binary).substring(20);
				}
				
				else if ( a == 8) {
					register = Integer.toBinaryString(binary).substring(24);
				}
				else if ( a == 5 ) {
					register = Integer.toBinaryString(binary).substring(27);
				}
				else if ( a == 4 ) {
					register = Integer.toBinaryString(binary).substring(28);
				}
			}
			
			
		
	}
	
	return register;
}


}