package simple.codes.br;

import java.io.*;
import java.util.ArrayList;

/**
 * 
 * @author edson
 *
 */
public class CreateHtml {

    public static void main(String[] args)
    {
        try {
            //define a HTML String Builder
            StringBuilder htmlStringBuilder=new StringBuilder();
            //append html header and title
            htmlStringBuilder.append("<html><head><title>Selenium Test </title></head>");
            //append body
            htmlStringBuilder.append("<body>");
            //append table
            htmlStringBuilder.append("<table border='1' bordercolor='#000000'>");
            
            
            int sorteio = 0;
            
            ArrayWithoutRepetition sort = new ArrayWithoutRepetition();
            sort.getRandArrayElement();
            ArrayList<Integer> items = sort.getItems();
            
            for (int i = 0; i < 6; i++) {
            	
            	htmlStringBuilder.append("<tr>");
            	
            	for (int j = 0; j < 10; j++) {
            		sorteio++;
            		
            		if(items.contains(sorteio)) {
            			
            			htmlStringBuilder.append("<td bgcolor='#00FF00'>" +sorteio + "</td>");
            			
            		}else {
            		
            		htmlStringBuilder.append("<td>" +sorteio + "</td>");
            		
            		}
				}
            	
            	htmlStringBuilder.append("</tr>");
			}
            
            
            htmlStringBuilder.append("</table></body></html>");
            //write html string content to a file
            WriteToFile(htmlStringBuilder.toString(),"sorteio.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void WriteToFile(String fileContent, String fileName) throws IOException {
        String projectPath = System.getProperty("user.dir");
        String tempFile = projectPath + File.separator+fileName;
        File file = new File(tempFile);

        //write to file with OutputStreamWriter
        OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
        Writer writer=new OutputStreamWriter(outputStream);
        writer.write(fileContent);
        writer.close();

    }
}