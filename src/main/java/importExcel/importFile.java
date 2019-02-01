package importExcel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class importFile {
    public static void main(String[] args) {
        try {
            InputStream inputStream=new FileInputStream("C:\\Users\\DKP17002\\Documents\\Tencent Files\\1114376529\\FileRecv\\POS数据补录导入模板-卜蜂莲花11月111.xlsx");
            HSSFWorkbook hssfWorkbook =new HSSFWorkbook(inputStream);

            //1.检查文件是否存在
          /*  if(checkFile())*/
            //2.获取excel里的sheet
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Boolean checkFile(File oldfile){
       /* FileItem fileItem=new DiskFileItem(oldfile.getName(),Files.probeContentType(path)ntentType(oldfile.getPath()));


        MultipartFile file;
        if (file.isEmpty()){
            return false;
        }
        String fileName = file.getOriginalFilename();
        if (!fileName.endsWith("xls") && !fileName.endsWith("xlsx")){
            return  false;
        }*/
        return  true;
    }
}
