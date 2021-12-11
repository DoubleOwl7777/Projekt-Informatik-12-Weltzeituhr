/* Projekt von Reimund Schmidt und Simon Bauer*/
package informatik;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class projekt_Informatik {

	public static void main(String[] args) {
	while (true)
		{int eingabeFertig=0;		//flag um herauszufinden, ob alle eingaben richtig sind
		int ziffer1=0,ziffer2=0,ziffer3=0,ziffer4=0; //deklariere die variablen für die einzelnen ziffern
		String HH ="0";
		String MM ="0";
		String locationInput="0";
		while (eingabeFertig==0)
		{Scanner location = new Scanner(System.in);
		 System.out.println("Von welchem Ort wollen sie die Uhrzeit wissen? (Europäische Hauptstädte)");
		 locationInput = location.nextLine();
		 System.out.println();
		 
		 if(locationInput.equals("Berlin")||locationInput.equals("Wien"))		//wenn der ort in der zeitzohne x liegt dann nimm die korrekte zeit dafür
		{DateTimeFormatter minutes = DateTimeFormatter.ofPattern("mm");
		DateTimeFormatter hours = DateTimeFormatter.ofPattern("HH");
        
		HH = hours.format(ZonedDateTime.now(ZoneId.of("Europe/Berlin")));
        MM = minutes.format(ZonedDateTime.now(ZoneId.of("Europe/Berlin")));
		
        eingabeFertig=1;}
		
		else
		{System.out.println("Ihre Eingabe ''"+ locationInput + "'' war leider nicht korrekt. Bitte überprüfen sie diese.");}
		}
		
		ziffer1=Integer.parseInt(HH)/10;
		if(ziffer1==0)
		{ziffer2=Integer.parseInt(HH);}
		if(ziffer1==1)
		{ziffer2=Integer.parseInt(HH)-10;}
		if(ziffer1==2)
		{ziffer2=Integer.parseInt(HH)-20;}
		
		ziffer3=Integer.parseInt(MM)/10;
		switch (ziffer3)
		{case 0:
		ziffer4=Integer.parseInt(MM);
		break;
		
		case 1:
		ziffer4=Integer.parseInt(MM)-10;
		break;
		
		case 2:
		ziffer4=Integer.parseInt(MM)-20;
		break;
		
		case 3:
		ziffer4=Integer.parseInt(MM)-30;
		break;
		
		case 4:
		ziffer4=Integer.parseInt(MM)-40;
		break;
		
		case 5:
		ziffer4=Integer.parseInt(MM)-50;
		break;
		
		case 6:
		ziffer4=Integer.parseInt(MM)-60;
		break;
		
		case 7:
		ziffer4=Integer.parseInt(MM)-70;
		break;
		
		case 8:
		ziffer4=Integer.parseInt(MM)-80;
		break;
		
		case 9:
		ziffer4=Integer.parseInt(MM)-90;
		break;
		}
		
		 System.out.println("In "+locationInput+" ist es gerade:");
		 System.out.println();
		
//ausgabe: jede zeile wird mittels print-befehlen einzeln für jede ziffer in das terminal übertragen		
//erste zeile
		switch (ziffer1)
		{case 0:
		System.out.print("  00   ");	
		break;
		
		case 1:
	    System.out.print("     0 ");
	    break;
	    
		case 2:
		System.out.print(" 000   ");
		break;
		
		case 3:
	    System.out.print(" 000   ");
	    break;
	    
		case 4:
	    System.out.print("     0 ");
	    break;
	    
		case 5:
	    System.out.print("   000 ");
	    break;
	    
		case 6:
		System.out.print("   000 ");
		break;
		
		case 7:
		System.out.print(" 0000  ");
		break;
		
		case 8:
		System.out.print("  000   ");
		break;
		
		case 9:
		System.out.print(" 0000   ");
		break;}
		
		switch (ziffer2)
		{case 0:
		System.out.print("  00   ");	
		break;
		
		case 1:
	    System.out.print("     0 ");
	    break;
	    
		case 2:
		System.out.print(" 000   ");
		break;
		
		case 3:
	    System.out.print(" 000   ");
	    break;
	    
		case 4:
	    System.out.print("     0 ");
	    break;
	    
		case 5:
	    System.out.print("   000 ");
	    break;
	    
		case 6:
		System.out.print("   000 ");
		break;
		
		case 7:
		System.out.print(" 0000  ");
		break;
		
		case 8:
		System.out.print("  000   ");
		break;
		
		case 9:
		System.out.print(" 0000   ");
		break;}
		
		System.out.print(" 0000  ");
		
		switch (ziffer3)
		{case 0:
		System.out.print("  00   ");	
		break;
		
		case 1:
	    System.out.print("     0 ");
	    break;
	    
		case 2:
		System.out.print(" 000   ");
		break;
		
		case 3:
	    System.out.print(" 000   ");
	    break;
	    
		case 4:
	    System.out.print("     0 ");
	    break;
	    
		case 5:
	    System.out.print("   000 ");
	    break;
	    
		case 6:
		System.out.print("   000 ");
		break;
		
		case 7:
		System.out.print(" 0000  ");
		break;
		
		case 8:
		System.out.print("  000   ");
		break;
		
		case 9:
		System.out.print(" 0000   ");
		break;}
		
		switch (ziffer4)
		{case 0:
		System.out.println("  00   ");	
		break;
		
		case 1:
	    System.out.println("     0 ");
	    break;
	    
		case 2:
		System.out.println(" 000   ");
		break;
		
		case 3:
	    System.out.println(" 000   ");
	    break;
	    
		case 4:
	    System.out.println("     0 ");
	    break;
	    
		case 5:
	    System.out.println("   000 ");
	    break;
	    
		case 6:
		System.out.println("   000 ");
		break;
		
		case 7:
		System.out.println(" 0000  ");
		break;
		
		case 8:
		System.out.println("  000   ");
		break;
		
		case 9:
		System.out.println(" 0000   ");			//bei der letzten ziffer muss zur nächsten zeile gesprungen werden daher hier println
		break;}
//zeile 2		
		
		{switch (ziffer1)
			{case 0:
				System.out.print(" 0  0  ");	
				break;
				
				case 1:
			    System.out.print("   000 ");
			    break;
			    
				case 2:
				System.out.print("0   0  ");
				break;
				
				case 3:
			    System.out.print("0   0  ");
			    break;
			    
				case 4:
			    System.out.print("   000 ");
			    break;
			    
				case 5:
			    System.out.print("  0    ");
			    break;
			    
				case 6:
				System.out.print("  0    ");
				break;
				
				case 7:
				System.out.print("     0 ");
				break;
				
				case 8:
				System.out.print(" 0   0  ");
				break;
				
				case 9:
				System.out.print("0    0  ");
				break;}
		
		switch (ziffer2)
		{case 0:
			System.out.print(" 0  0  ");	
			break;
			
			case 1:
		    System.out.print("   000 ");
		    break;
		    
			case 2:
			System.out.print("0   0  ");
			break;
			
			case 3:
		    System.out.print("0   0  ");
		    break;
		    
			case 4:
		    System.out.print("   000 ");
		    break;
		    
			case 5:
		    System.out.print("  0    ");
		    break;
		    
			case 6:
			System.out.print("  0    ");
			break;
			
			case 7:
			System.out.print("     0 ");
			break;
			
			case 8:
			System.out.print(" 0   0  ");
			break;
			
			case 9:
			System.out.print("0    0  ");
			break;}
		
			System.out.print("000000 ");
			
			switch (ziffer3)
			{case 0:
				System.out.print(" 0  0  ");	
				break;
				
				case 1:
			    System.out.print("   000 ");
			    break;
			    
				case 2:
				System.out.print("0   0  ");
				break;
				
				case 3:
			    System.out.print("0   0  ");
			    break;
			    
				case 4:
			    System.out.print("   000 ");
			    break;
			    
				case 5:
			    System.out.print("  0    ");
			    break;
			    
				case 6:
				System.out.print("  0    ");
				break;
				
				case 7:
				System.out.print("     0 ");
				break;
				
				case 8:
				System.out.print(" 0   0  ");
				break;
				
				case 9:
				System.out.print("0    0  ");
				break;}
		
			switch (ziffer4)
			{case 0:
				System.out.println(" 0  0  ");	
				break;
				
				case 1:
			    System.out.println("   000 ");
			    break;
			    
				case 2:
				System.out.println("0   0  ");
				break;
				
				case 3:
			    System.out.println("0   0  ");
			    break;
			    
				case 4:
			    System.out.println("   000 ");
			    break;
			    
				case 5:
			    System.out.println("  0    ");
			    break;
			    
				case 6:
				System.out.println("  0    ");
				break;
				
				case 7:
				System.out.println("     0 ");
				break;
				
				case 8:
				System.out.println(" 0   0  ");
				break;
				
				case 9:
				System.out.println("0    0  ");
				break;}}

//zeile 3
		
		{switch (ziffer1)
			{case 0:
				System.out.print(" 0  0  ");	
				break;
				
				case 1:
			    System.out.print(" 00  0 ");
			    break;
			    
				case 2:
				System.out.print("   0   ");
				break;
				
				case 3:
			    System.out.print("    0  ");
			    break;
			    
				case 4:
			    System.out.print(" 00  0 ");
			    break;
			    
				case 5:
			    System.out.print(" 0     ");
			    break;
			    
				case 6:
				System.out.print(" 0     ");
				break;
				
				case 7:
				System.out.print("    0  ");
				break;
				
				case 8:
				System.out.print("0     0 ");
				break;
				
				case 9:
				System.out.print(" 0    0 ");
				break;}
	
		switch (ziffer2)
		{case 0:
			System.out.print(" 0  0  ");	
			break;
			
			case 1:
		    System.out.print(" 00  0 ");
		    break;
		    
			case 2:
			System.out.print("   0   ");
			break;
			
			case 3:
		    System.out.print("    0  ");
		    break;
		    
			case 4:
		    System.out.print(" 00  0 ");
		    break;
		    
			case 5:
		    System.out.print(" 0     ");
		    break;
		    
			case 6:
			System.out.print(" 0     ");
			break;
			
			case 7:
			System.out.print("    0  ");
			break;
			
			case 8:
			System.out.print("0     0 ");
			break;
			
			case 9:
			System.out.print(" 0    0 ");
			break;}
		
		System.out.print(" 0000  ");
		
		switch (ziffer3)
		{case 0:
			System.out.print(" 0  0  ");	
			break;
			
			case 1:
		    System.out.print(" 00  0 ");
		    break;
		    
			case 2:
			System.out.print("   0   ");
			break;
			
			case 3:
		    System.out.print("    0  ");
		    break;
		    
			case 4:
		    System.out.print(" 00  0 ");
		    break;
		    
			case 5:
		    System.out.print(" 0     ");
		    break;
		    
			case 6:
			System.out.print(" 0     ");
			break;
			
			case 7:
			System.out.print("    0  ");
			break;
			
			case 8:
			System.out.print("0     0 ");
			break;
			
			case 9:
			System.out.print(" 0    0 ");
			break;}

		switch (ziffer4)
		{case 0:
			System.out.println(" 0  0  ");	
			break;
			
			case 1:
		    System.out.println(" 00  0 ");
		    break;
		    
			case 2:
			System.out.println("   0   ");
			break;
			
			case 3:
		    System.out.println("    0  ");
		    break;
		    
			case 4:
		    System.out.println(" 00  0 ");
		    break;
		    
			case 5:
		    System.out.println(" 0     ");
		    break;
		    
			case 6:
			System.out.println(" 0     ");
			break;
			
			case 7:
			System.out.println("    0  ");
			break;
			
			case 8:
			System.out.println("0     0 ");
			break;
			
			case 9:
			System.out.println(" 0    0 ");
			break;}}
		
//zeile 4
		
			switch (ziffer1)
			{case 0:
				System.out.print("0    0 ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print("  0    ");
				break;
				
				case 3:
			    System.out.print("  00   ");
			    break;
			    
				case 4:
			    System.out.print(" 0   0 ");
			    break;
			    
				case 5:
			    System.out.print("00000  ");
			    break;
			    
				case 6:
				System.out.print("00000  ");
				break;
				
				case 7:
				System.out.print("   0   ");
				break;
				
				case 8:
				System.out.print(" 00000  ");
				break;
				
				case 9:
				System.out.print("  0000  ");
				break;}

			switch (ziffer2)
			{case 0:
				System.out.print("0    0 ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print("  0    ");
				break;
				
				case 3:
			    System.out.print("  00   ");
			    break;
			    
				case 4:
			    System.out.print(" 0   0 ");
			    break;
			    
				case 5:
			    System.out.print("00000  ");
			    break;
			    
				case 6:
				System.out.print("00000  ");
				break;
				
				case 7:
				System.out.print("   0   ");
				break;
				
				case 8:
				System.out.print(" 00000  ");
				break;
				
				case 9:
				System.out.print("  0000  ");
				break;}

			System.out.print("       ");
			
			switch (ziffer3)
			{case 0:
				System.out.print("0    0 ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print("  0    ");
				break;
				
				case 3:
			    System.out.print("  00   ");
			    break;
			    
				case 4:
			    System.out.print(" 0   0 ");
			    break;
			    
				case 5:
			    System.out.print("00000  ");
			    break;
			    
				case 6:
				System.out.print("00000  ");
				break;
				
				case 7:
				System.out.print("   0   ");
				break;
				
				case 8:
				System.out.print(" 00000  ");
				break;
				
				case 9:
				System.out.print("  0000  ");
				break;}			
			
			switch (ziffer4)
			{case 0:
				System.out.println("0    0 ");	
				break;
				
				case 1:
			    System.out.println("     0 ");
			    break;
			    
				case 2:
				System.out.println("  0    ");
				break;
				
				case 3:
			    System.out.println("  00   ");
			    break;
			    
				case 4:
			    System.out.println(" 0   0 ");
			    break;
			    
				case 5:
			    System.out.println("00000  ");
			    break;
			    
				case 6:
				System.out.println("00000  ");
				break;
				
				case 7:
				System.out.println("   0   ");
				break;
				
				case 8:
				System.out.println(" 00000  ");
				break;
				
				case 9:
				System.out.println("  0000  ");
				break;}

//ziffer 5			
			
			switch (ziffer1)
			{case 0:
				System.out.print("0    0 ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print(" 0     ");
				break;
				
				case 3:
			    System.out.print("    0  ");
			    break;
			    
				case 4:
			    System.out.print(" 00000 ");
			    break;
			    
				case 5:
			    System.out.print("     0 ");
			    break;
			    
				case 6:
				System.out.print("0    0 ");
				break;
				
				case 7:
				System.out.print("  0    ");
				break;
				
				case 8:
				System.out.print("0     0 ");
				break;
				
				case 9:
				System.out.print("      0 ");
				break;}
			
			switch (ziffer2)
			{case 0:
				System.out.print("0    0 ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print(" 0     ");
				break;
				
				case 3:
			    System.out.print("    0  ");
			    break;
			    
				case 4:
			    System.out.print(" 00000 ");
			    break;
			    
				case 5:
			    System.out.print("     0 ");
			    break;
			    
				case 6:
				System.out.print("0    0 ");
				break;
				
				case 7:
				System.out.print("  0    ");
				break;
				
				case 8:
				System.out.print("0     0 ");
				break;
				
				case 9:
				System.out.print("      0 ");
				break;}
			
			System.out.print(" 0000  ");
			
			switch (ziffer3)
			{case 0:
				System.out.print("0    0 ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print(" 0     ");
				break;
				
				case 3:
			    System.out.print("    0  ");
			    break;
			    
				case 4:
			    System.out.print(" 00000 ");
			    break;
			    
				case 5:
			    System.out.print("     0 ");
			    break;
			    
				case 6:
				System.out.print("0    0 ");
				break;
				
				case 7:
				System.out.print("  0    ");
				break;
				
				case 8:
				System.out.print("0     0 ");
				break;
				
				case 9:
				System.out.print("      0 ");
				break;}
			
			switch (ziffer4)
			{case 0:
				System.out.println("0    0 ");	
				break;
				
				case 1:
			    System.out.println("     0 ");
			    break;
			    
				case 2:
				System.out.println(" 0     ");
				break;
				
				case 3:
			    System.out.println("    0  ");
			    break;
			    
				case 4:
			    System.out.println(" 00000 ");
			    break;
			    
				case 5:
			    System.out.println("     0 ");
			    break;
			    
				case 6:
				System.out.println("0    0 ");
				break;
				
				case 7:
				System.out.println("  0    ");
				break;
				
				case 8:
				System.out.println("0     0 ");
				break;
				
				case 9:
				System.out.println("      0 ");
				break;}
			
//zeile 6
			
			switch (ziffer1)
			{case 0:
				System.out.print(" 0  0  ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print("0      ");
				break;
				
				case 3:
			    System.out.print("0   0  ");
			    break;
			    
				case 4:
			    System.out.print("     0 ");
			    break;
			    
				case 5:
			    System.out.print("0    0 ");
			    break;
			    
				case 6:
				System.out.print("0    0 ");
				break;
				
				case 7:
				System.out.print(" 0     ");
				break;
				
				case 8:
				System.out.print(" 0   0  ");
				break;
				
				case 9:
				System.out.print(" 0   0  ");
				break;}
	
			switch (ziffer2)
			{case 0:
				System.out.print(" 0  0  ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print("0      ");
				break;
				
				case 3:
			    System.out.print("0   0  ");
			    break;
			    
				case 4:
			    System.out.print("     0 ");
			    break;
			    
				case 5:
			    System.out.print("0    0 ");
			    break;
			    
				case 6:
				System.out.print("0    0 ");
				break;
				
				case 7:
				System.out.print(" 0     ");
				break;
				
				case 8:
				System.out.print(" 0   0  ");
				break;
				
				case 9:
				System.out.print(" 0   0  ");
				break;}
			
			System.out.print("000000 ");
			
			switch (ziffer3)
			{case 0:
				System.out.print(" 0  0  ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print("0      ");
				break;
				
				case 3:
			    System.out.print("0   0  ");
			    break;
			    
				case 4:
			    System.out.print("     0 ");
			    break;
			    
				case 5:
			    System.out.print("0    0 ");
			    break;
			    
				case 6:
				System.out.print("0    0 ");
				break;
				
				case 7:
				System.out.print(" 0     ");
				break;
				
				case 8:
				System.out.print(" 0   0  ");
				break;
				
				case 9:
				System.out.print(" 0   0  ");
				break;}
		
			switch (ziffer4)
			{case 0:
				System.out.println(" 0  0  ");	
				break;
				
				case 1:
			    System.out.println("     0 ");
			    break;
			    
				case 2:
				System.out.println("0      ");
				break;
				
				case 3:
			    System.out.println("0   0  ");
			    break;
			    
				case 4:
			    System.out.println("     0 ");
			    break;
			    
				case 5:
			    System.out.println("0    0 ");
			    break;
			    
				case 6:
				System.out.println("0    0 ");
				break;
				
				case 7:
				System.out.println(" 0     ");
				break;
				
				case 8:
				System.out.println(" 0   0  ");
				break;
				
				case 9:
				System.out.println(" 0   0  ");
				break;}
//zeile 7			

			switch (ziffer1)
			{case 0:
				System.out.print("  00   ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print("00000  ");
				break;
				
				case 3:
			    System.out.print(" 000   ");
			    break;
			    
				case 4:
			    System.out.print("     0 ");
			    break;
			    
				case 5:
			    System.out.print(" 0000  ");
			    break;
			    
				case 6:
				System.out.print(" 0000  ");
				break;
				
				case 7:
				System.out.print("0      ");
				break;
				
				case 8:
				System.out.print("  000   ");
				break;
				
				case 9:
				System.out.print("  000   ");
				break;}
			
			switch (ziffer2)
			{case 0:
				System.out.print("  00   ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print("00000  ");
				break;
				
				case 3:
			    System.out.print(" 000   ");
			    break;
			    
				case 4:
			    System.out.print("     0 ");
			    break;
			    
				case 5:
			    System.out.print(" 0000  ");
			    break;
			    
				case 6:
				System.out.print(" 0000  ");
				break;
				
				case 7:
				System.out.print("0      ");
				break;
				
				case 8:
				System.out.print("  000   ");
				break;
				
				case 9:
				System.out.print("  000   ");
				break;}
			
			System.out.print(" 0000  ");
			
			switch (ziffer3)
			{case 0:
				System.out.print("  00   ");	
				break;
				
				case 1:
			    System.out.print("     0 ");
			    break;
			    
				case 2:
				System.out.print("00000  ");
				break;
				
				case 3:
			    System.out.print(" 000   ");
			    break;
			    
				case 4:
			    System.out.print("     0 ");
			    break;
			    
				case 5:
			    System.out.print(" 0000  ");
			    break;
			    
				case 6:
				System.out.print(" 0000  ");
				break;
				
				case 7:
				System.out.print("0      ");
				break;
				
				case 8:
				System.out.print("  000   ");
				break;
				
				case 9:
				System.out.print("  000   ");
				break;}
			
			switch (ziffer4)
			{case 0:
				System.out.println("  00   ");	
				break;
				
				case 1:
			    System.out.println("     0 ");
			    break;
			    
				case 2:
				System.out.println("00000  ");
				break;
				
				case 3:
			    System.out.println(" 000   ");
			    break;
			    
				case 4:
			    System.out.println("     0 ");
			    break;
			    
				case 5:
			    System.out.println(" 0000  ");
			    break;
			    
				case 6:
				System.out.println(" 0000  ");
				break;
				
				case 7:
				System.out.println("0      ");
				break;
				
				case 8:
				System.out.println("  000   ");
				break;
				
				case 9:
				System.out.println("  000   ");
				break;}
			
	        System.out.println("");
		
}

}

}