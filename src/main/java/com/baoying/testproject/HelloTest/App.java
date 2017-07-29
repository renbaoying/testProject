package com.baoying.testproject.HelloTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.zip.GZIPInputStream;
import sun.misc.BASE64Decoder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//String str = "%1F%C2%8B%08%00%00%00%00%00%00%00%C2%9D%C2%92M%C2%8B%13A%10%C2%86%C3%BFJ%C3%A8%C2%A3%C3%84P%C3%95%C3%93%C2%9F%C2%81%1C%14%14%04%C3%B7%26x%10%19%C2%86%C3%A9fw%C3%8Clw%C3%88%C3%97%0A%21%17%2F%22x%11%3CxS%04Q%3Cx%C3%B1%C2%B4%2C%C3%BBsb%C3%98%7FaUp%17w%C2%89%C3%84%2C%0Ct%C3%97%3B%C3%BD%3Eo%C3%95L%2FDaD%7F%21%C2%A4%16%7Da4Hk%0Ai%C2%91%C3%84%C2%AE%28%0A%C3%92%24J%03h%00%00I%C2%92%C2%8A%24g%C2%AC%2B%10%C2%A4%02%2F%C2%95%C2%B2%2C%23%C3%89%07%C2%8F%3A%C3%AA%C3%B1%C2%93%07%5CZ*gi%C2%98%C3%B2Ib%0EUl%C3%96%C3%88%C2%BB%C3%95%C3%A9%C3%8F%C3%95%C2%8F7%C2%AB%2F%C3%A7%C2%AB%C2%B7g%C3%AB%C3%B7%1FIg%26%C2%BBh%C3%91%3D%C3%99%03%C3%9ASO%C3%A2%5E%0A%C3%A3%C3%9C%C2%84%C2%8D%C2%91%C2%BB%C2%93%05m%C2%99lz%C3%90%C3%9B%C3%B0%C2%98K%7B6Hv%C2%A3%C2%97p%07%C3%81%C2%B1%C2%B0%C3%89z%C3%9A%C3%9C%7D%C3%98%C3%B0%5B%10%7D%C3%94%C3%8A%19%C3%94%C3%86%03%C3%95%C3%8C%07%C3%99%07%C3%B8%C3%BB%C3%A1Vi%10%5C%C3%92J9%C3%8F%C3%A8%C2%ABx%3A7%C2%AA%5E%0C%C3%8B%C3%A3%18%C3%8Aq%C2%9C%C3%A7v%1E%C3%8BQu%18%C3%8B%C3%89Q%3E%C3%A1%18%06%03h4%1E%7D%C3%A1%0CY%29K%2C%26y6%C2%AE%C3%A3%C2%80l%07U%C2%93%C2%96b%C3%99%C3%BDC%C2%BB_%C3%95%C3%83%C3%83q%C2%9E%C2%A5p%C3%9Dm%C2%8DU%C3%B2%C3%AA%C3%94%C3%BFf%3A%0B%C3%85m3-%C3%BDB%0B%C3%BBfZt%C3%86%1B%7F%C3%9BL%C2%A9%C2%8C%C3%97%C3%BBf%3A%C2%A4%C2%9B%C2%A9%C3%B4%C3%8E%C3%8C%2B%1A%5D%C2%9C%C2%B6%0Cq4-%C2%8Fb%15%C3%8A%C2%BAm%C3%AA%C3%A1u%C2%A0u%C3%92%5E%02%C3%97%C2%AFN%7F%7Dz%7D%C3%B1%C3%B9%C3%83%0DR%C2%9D%C3%93%C2%A4%C2%9C7%21%C3%A62%C2%A76W%C3%A1%26Bi%C3%9C%7B%12%C3%AB%C2%B5%C3%9A%C3%BD%C3%B5%C2%B6L%C2%92%C2%AA%C3%A3%C2%B8m%12%C2%87%1A%C3%B1%12%C3%88%27%C2%9B0%C2%80n%C2%A7I%21%C2%BE%1C%60%C2%B73m%C2%A6m%1C%5C%7C%C3%BF%C2%B6%C3%BE%C3%BAn%5B%C3%82%C2%8E%7E%1D%5Dj%C3%B8g%C2%BF%C3%8F%C2%97%C2%BF%01Z0%C2%94%C2%B5A%04%00%00";
String str = "%1F%C2%8B%08%00%00%00%00%00%00%03%C2%8D%C2%93%C2%BFn%13A%10%C3%86_%05m%C2%89%C2%9C%C3%93%C3%8E%C3%AE%C3%AD%C2%BF%C3%AB%C2%90S%C3%90%C2%84X%C2%B2D%C2%83%C3%90%C3%A9%C3%A2%5B%C3%AC%C3%85%C2%97%5D%C3%AB%C3%AC%24%10%C3%8B%1D%0D%12%25%C2%A2%C2%A5JKC%C2%85Hx%1B%2B%3C%063%C2%8B%C2%84%15%C3%99%02%C3%8A%C2%9B%C3%BD%C3%A6%C3%BB~%C2%B3%3B%C2%B7f%C3%92%C2%B0%C3%AA%C3%85%C2%9A%09%C3%87%2A%C3%B6%2A%C3%B5~%C3%9A%C2%A7%C2%8B%C3%98%C2%B2%01%03%2C%C2%80%C3%A2%5CI%C3%AB%C2%80s%C2%A1%C3%98f%C2%B0f%C2%B2%C3%84%C3%B2%C2%99%C2%9F%C2%86%C2%88%12%29%C3%B0%C3%A3xx%C3%92%C2%848j%C2%A6%C3%BEy%C3%B0W%C3%83%14W%7D%C3%AA%3A%C3%9F%3F%C2%B40%C3%8EY.%C2%B3E%C2%8EZ4%C2%AF%C3%A7%C3%B5%C2%B9o%C3%AB%C3%9E_%C2%A6%C3%AE%C3%92%C3%97%0B4%C2%A8%C2%97%C2%B3tE%C2%BE%C2%9CUk%C2%B6L%17%C3%BD%C3%84%C2%A3%16e%14%C2%81%C3%8D%7B%C2%8Ev%07%C3%A53uF%1A%1D%C2%9F%C2%84%C3%B8O%1C%C2%80%C2%BF%C3%A0%C2%B4%C3%98UO%C2%BA0%C2%99%C3%AF7%C3%8ACs%C2%A4%C3%98af%7D%3DKq%C3%BA6%C3%94%C2%AD_5a%C3%A7%C3%B0%7B%C2%A2%C3%98%C2%9C%C3%93%3C%3F%C3%9F%C3%BD%C2%B8%C3%BFt%C2%8B%C3%95%10%5B%C3%BF%C2%86U%C3%B0p0%C3%8B%C2%8D%C3%A4%C3%A5%C3%81%C3%81%C3%BE%C3%AF%C2%AE%C2%B3%C2%81%C3%9B1%C2%9E5%C2%93%C3%B9%C2%A1g%C2%B5%06%C2%9C%C3%A6l%C3%B3%12%C3%9D5%C3%B1Q%C2%84%2AD%C3%81Q%27H%18F8%C2%8E%C2%B7%03A%C2%8D%C2%8AU%12%0A%C2%B0%C2%A56%0E%C2%846Z%C2%81%C3%85N%C2%94%C3%911%C2%91%3EY%2C%C3%86%2B%C3%9C%21j%27%2F%21%C2%B8%7D%0C%C2%A2%C2%A4s%C2%99%C2%85%200Wq%C2%8D%0F7%60%C2%8APr%18%60%3C%08%28J%25%C2%A4%2BM%C2%A9%C2%AD%C3%93%02%C3%8B%C2%B8%C2%9B%C3%ACzV%0F%C2%9F%C2%A1F%13%C3%8F%C3%A9%C2%98%C2%BC-%C2%AB8%C2%9E%C2%92c%C2%A9q5%C2%B1f%C3%BE%C3%90%3E%3A%1D%03%2Fd%C2%91%C2%99m68z%C3%9A%C3%84%C3%A5QvQ%C2%B9k%C3%BB%C3%AD%C3%AB%C3%B6%C3%8B%C3%BB%C3%AD%C3%8D%C3%9D%C3%B6%C3%83%C3%B7%C3%BB%C2%8F%C2%9F%C3%89%C2%93%13%0C%2Fxat%01%C3%8A%C3%AD%C3%BF%00%12HF%C3%8C%C3%92jap%130%19oo%C3%B3%0B%C3%80%C3%A3F%C2%B6D%03%00%00";
    	App app = new App();
    	//String result = app.H5Decoder(str);
      String result =  app.NativeDecoder(str);
       System.out.print(result);
       
    }
    
    public String NativeDecoder(String str) {
        GZIPInputStream gunzip = null;
        try {
          if (str == null || str.length() == 0) {
             return str;
          }
          ByteArrayOutputStream out = new ByteArrayOutputStream();
          str = URLDecoder.decode(str, "utf-8");
          ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
          gunzip = new GZIPInputStream(in);
          byte[] buffer = new byte[256];
          int n;
          while ((n = gunzip.read(buffer)) >= 0) {
             out.write(buffer, 0, n);
          }
          return new String(out.toString().getBytes(), "utf-8");
        } catch (Exception e) {
          System.out.println(e.getMessage());
        } finally {
          try {
             if (gunzip != null) {
                gunzip.close();
             }
          } catch (IOException e) {
             System.out.println(e.getMessage());
          }
        }
        return null;
  }
   
    public  String H5Decoder(String str) {
        byte[] b = null;
        String result = null;
        if (str != null) {
         BASE64Decoder decoder = new BASE64Decoder();
          try {
             b = decoder.decodeBuffer(str);
             result = new String(b, "utf-8");
          } catch (Exception e) {
             e.printStackTrace();
          }
        }
        return result;
  }
    
}
