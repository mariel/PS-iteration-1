package demo;

import java.io.*;

public class Counter {

	public static int getNumberOfLines(BufferedReader bReader) throws IOException 
	{
		int count = 0;
		boolean commentBegan = false;
		String line = null;

		while ( (line = bReader.readLine()) != null)
		{
			line = line.trim();
			
			if ( "".equals(line) || line.startsWith("//"))
			{
				continue;
			}
			
			if ( commentBegan) 
			{
				if ( commentEnded(line)) 
				{
					line = line.substring( line.indexOf("*/") + 2 ).trim();
					commentBegan = false;
					
					if ( "".equals(line) || line.startsWith("//")) 
					{
						continue;
					}
				} 
				else
					continue;
			}
			if ( isSourceCodeLine(line))
			{
				count++;
			}
			if (commentBegan(line))
			{
				commentBegan = true;
			}
		}
		return count;
	}

	private static boolean commentBegan(String line) {
		int index = line.indexOf("/*");
		
		if ( index < 0 )
		{
			return false;
		}
		
		int quoteStartIndex = line.indexOf("\"");
		if ( quoteStartIndex != -1 && quoteStartIndex < index )
		{
			while ( quoteStartIndex > -1) 
			{
				line = line.substring(quoteStartIndex + 1);
				int quoteEndIndex = line.indexOf("\"");
				line = line.substring(quoteEndIndex + 1);
				quoteStartIndex = line.indexOf("\"");
			}
			boolean theCommentBegan = commentBegan(line);
			return theCommentBegan;
		}
		boolean theCommentEnded = commentEnded(line.substring(index + 2));
		return !theCommentEnded;
	}

	private static boolean commentEnded(String line) {

		int index = line.indexOf("*/");
		if (index < 0)
		{
			return false;
		} 
		else
		{
			String subString = line.substring(index + 2).trim();
			
			if ( "".equals(subString) || subString.startsWith("//")) 
			{
				return true;
			}
			if( commentBegan(subString))
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	}

	private static boolean isSourceCodeLine(String line) {
		
		boolean isSourceCodeLine = false;
		line = line.trim();
		if ( "".equals(line) || line.startsWith("//")) 
		{
			return isSourceCodeLine;
		}
		if (line.length() == 1)
		{
			return true;
		}
		int index = line.indexOf("/*");
		if (index != 0)
		{
			return true;
		} 
		else
		{
			while ( line.length() > 0) 
			{
				line = line.substring(index + 2);
				int endCommentPosition = line.indexOf("*/");
				if ( endCommentPosition < 0) 
				{
					return false;
				}
				if ( endCommentPosition == line.length() - 2)
				{
					return false;
				} 
				else
				{
					String subString = line.substring(endCommentPosition + 2).trim();
					if ( "".equals(subString) || subString.indexOf("//") == 0) {
						return false;
					}
					else
					{
						if (subString.startsWith("/*"))
						{
							line = subString;
							continue;
						}
						return true;
					}
				}
			}
		}
		return isSourceCodeLine;
	}
}