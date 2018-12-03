package lixb.com.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {
    public static String getJSONContent(String url,String type,String param){
        return getJSONContent(url, type, param, false);
    }

    /**
     * 获取指定url的网页内容
     * @param url 请求地址
     * @param type get或者post
     * @param param 已编码的请求参数
     * @param ignoreSSLException 忽略SSL异常
     * @return
     */
    public static String getJSONContent(String url,String type,String param,boolean ignoreSSLException){
        int status=-1;
        String content="";
        if(url!=null && type!=null){
            HttpURLConnection httpconn=null;
            try{
                if(ignoreSSLException && url.toLowerCase().startsWith("https://")){
                    System.setProperty ("jsse.enableSNIExtension", "false");
                }
                type=type.equalsIgnoreCase("POST")?"POST":"GET";
                String turl=url;
                if(type.equalsIgnoreCase("GET") && param!=null){
                    turl=turl+(turl.contains("?")?"&":"?")+param;
                }
                httpconn = (HttpURLConnection) new URL(turl).openConnection();
                httpconn.setRequestMethod(type);
                httpconn.setConnectTimeout(3000);
                httpconn.setReadTimeout(20000);
                httpconn.setRequestProperty("","");
                httpconn.setRequestProperty("","");
                if(type.equalsIgnoreCase("POST") && param!=null){
                    httpconn.setDoOutput(true);
                    httpconn.setRequestProperty("Content-Type","application/json; charset=UTF-8");//意思是正文是urlencoded编码过的form参数
                    OutputStream out=httpconn.getOutputStream();
                    out.write(param.getBytes("UTF-8"));
                    out.flush();
                    out.close();
                }
                status=httpconn.getResponseCode();
                BufferedReader in = new BufferedReader(new InputStreamReader(status==200?httpconn.getInputStream():httpconn.getErrorStream(),"UTF-8"));
                String inputLine;
                StringBuilder sb=new StringBuilder();
                while (null != (inputLine = in.readLine())) {
                    sb.append(inputLine+"\n");
                }
                sb=sb.length()>0 && sb.charAt(sb.length()-1)=='\n'?sb.deleteCharAt(sb.length()-1):sb;
                in.close();
                content=sb.toString();
            } catch (Exception e) {
            } finally{
                if(httpconn!=null)
                    httpconn.disconnect();
            }
        }else{
        }
        return content;
    }
}
