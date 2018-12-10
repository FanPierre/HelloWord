package Utils;

import java.io.*;

/*
   网易词典单词本导入工具
   @date 2018-11-13
 */
public class importUtil {
    public static void main(String[] args) {
        try {
            //源文件
            String fileName = "C:\\SOFTWARE\\Sublime Text 3\\1700词汇";
            FileReader file = new FileReader(fileName);
            //导入的文件
            String writerFileName = "C:\\SOFTWARE\\Sublime Text 3\\1.xml";
            File f = new File(writerFileName);
            FileWriter fw;
            BufferedReader bufferedReader = new BufferedReader(file);
            BufferedWriter bw;
            int i = 0;
            String str2 = bufferedReader.readLine();
                str2 = bufferedReader.readLine();
                if (f.exists()) {
                    f.createNewFile();
                }
                fw = new FileWriter(writerFileName, true);
                bw = new BufferedWriter(fw);
                bw.write("<wordbook>");
            while (str2 != null) {
                str2=bufferedReader.readLine();
                if (str2==null){
                    continue;
                }
                String[] split = str2.split("[\\u4e00-\\u9fa5]");
                String substring = str2.substring(split[0].length(), str2.length());
                //格式
                bw.write("<item>\n" +
                        "        <word>"+split[0]+"</word>\n" +
                        "    <trans><![CDATA[n. "+substring+"\n" +
                        "vt. "+substring+"]]>   \n" +
                        "</trans>\n" +
                        "    <phonetic></phonetic>\n" +
                        "    <tags>未分组</tags>\n" +
                        "    <progress>1</progress>\n" +
                        "</item>");
                i++;
            }
            bw.write("</wordbook>");
            System.out.println(i);
            bufferedReader.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
