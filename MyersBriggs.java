/************************
* File Name: MyersBriggs
* Coder Name: Raymond Luu
* Assignment: 7
************************/
import java.io.*;
import java.util.*;

public class MyersBriggs
{
	public static final int TAB_SPACES = 4;
	
	public static void main ( String[] args )
	throws FileNotFoundException
	{
		File f = new File("MB.txt");
		Scanner input = new Scanner( f );
		
		while( input.hasNextLine() )
		{
			String text = input.nextLine();
			
			//array for storing letters
			char[] introExtro = new char[10];
			char[][] sensingIntuition = new char[2][10];
			char[][] thinkFeel = new char[2][10];
			char[][] judgePercep = new char[2][10];
			
			//array for storing count
			int[] introExtroCount = new int[2];
			int[] sensingIntuitionCount = new int[2];
			int[] thinkFeelCount = new int[2];
			int[] judgePercepCount = new int[2];
			
			/*print names*/
			System.out.println( text + ":" );
			text = input.nextLine();
			
			/*process input*/
			for( int i = 0; i < introExtro.length; i++ )
			{
				//stores the characters into the arrays
				introExtro[i] = text.charAt(i * 7);
				sensingIntuition[0][i] = text.charAt( i * 7 + 1 );
				sensingIntuition[1][i] = text.charAt( i * 7 + 2 );
				thinkFeel[0][i] = text.charAt( i * 7 + 3 );
				thinkFeel[1][i] = text.charAt( i * 7 + 4 );
				judgePercep[0][i] = text.charAt( i * 7 + 5 );
				judgePercep[1][i] = text.charAt( i * 7 + 6 );
				
				//storing a tally for A and B to introExtroCount[]
				if( introExtro[i] == 'A' )
				{
					introExtroCount[0]++;
				}
				else //introExtro[i] == 'B'
				{
					introExtroCount[1]++;
				}
				
				//storing a tally for A and B to sensingIntuitionCount[]
				if( sensingIntuition[0][i] == 'A' )
				{
					sensingIntuitionCount[0]++;
				}
				else //sensingIntuition[0][i] == 'B'
				{
					sensingIntuitionCount[1]++;
				}
				if( sensingIntuition[1][i] == 'A' )
				{
					sensingIntuitionCount[0]++;
				}
				else //sensingIntuition[1][i] == 'B'
				{
					sensingIntuitionCount[1]++;
				}
				
				//storing a tally for A and B to thinkFeelCount[]
				if( thinkFeel[0][i] == 'A' )
				{
					thinkFeelCount[0]++;
				}
				else //thinkFeel[0][i] == 'B'
				{
					thinkFeelCount[1]++;
				}
				if( thinkFeel[1][i] == 'A' )
				{
					thinkFeelCount[0]++;
				}
				else //thinkFeel[1][i] == 'B'
				{
					thinkFeelCount[1]++;
				}
				
				//storing a tally for A and B to judgePercepCount[]
				if( judgePercep[0][i] == 'A' )
				{
					judgePercepCount[0]++;
				}
				else //judgePercep[0][i] == 'B'
				{
					judgePercepCount[1]++;
				}
				if( judgePercep[1][i] == 'A' )
				{
					judgePercepCount[0]++;
				}
				else //judgePercep[1][i] == 'B'
				{
					judgePercepCount[1]++;
				}
			}
			
			/*use input to create results*/
			double introExtroPercent = ( (double)( introExtroCount[1] )/( introExtroCount[0] + introExtroCount[1] ) ) * ( 100 );
			double sensingIntuitionPercent = ( (double)( sensingIntuitionCount[1] )/( sensingIntuitionCount[0] + sensingIntuitionCount[1] ) ) * ( 100 );
			double thinkFeelPercent = ( (double)( thinkFeelCount[1] )/( thinkFeelCount[0] + thinkFeelCount[1] ) ) * ( 100 );
			double judgePercepPercent = ( (double)( judgePercepCount[1] )/( judgePercepCount[0] + judgePercepCount[1] ) ) * ( 100 );
			
			/*report results*/
			for( int i = 0; i < TAB_SPACES; i++ )
			{
				System.out.print( " " );
			}
			
			//print amount of A's and B's
			System.out.println( introExtroCount[0] + "A-" + introExtroCount[1] + "B " +
									  sensingIntuitionCount[0] + "A-" + sensingIntuitionCount[1] + "B " +
									  thinkFeelCount[0] + "A-" + thinkFeelCount[1] + "B " +
									  judgePercepCount[0] + "A-" + judgePercepCount[1] + "B " );
			for( int i = 0; i < TAB_SPACES; i++ )
			{
				System.out.print( " " );
			}
			
			//print percent of B's
			System.out.printf( "[" + "%.0f", introExtroPercent);
			System.out.print( "%, " );
			System.out.printf( "%.0f", sensingIntuitionPercent);
			System.out.print( "%, " );
			System.out.printf( "%.0f", thinkFeelPercent);
			System.out.print( "%, " );
			System.out.printf( "%.0f", judgePercepPercent);
			System.out.print( "%" );
			System.out.print( "] = " );
			
			//print overall personality type
			if( introExtroPercent < 50 )
			{
				System.out.print( "I" );
			}
			else //introExtroPercent >= 50
			{
				System.out.print( "E" );
			}
			if( sensingIntuitionPercent < 50 )
			{
				System.out.print( "S" );
			}
			else //sensingIntuitionPercent >= 50
			{
				System.out.print( "N" );
			}
			if( thinkFeelPercent < 50 )
			{
				System.out.print( "T" );
			}
			else //thinkFeelPercent >= 50
			{
				System.out.print( "F" );
			}
			if( judgePercepPercent < 50 )
			{
				System.out.println( "J" );
			}
			else //judgePercepPercent >= 50
			{
				System.out.println( "P" );
			}
		}
	}
}