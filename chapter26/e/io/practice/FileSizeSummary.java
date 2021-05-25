package e.io.practice;

import java.io.*;
import java.text.DecimalFormat;;

public class FileSizeSummary{

	DecimalFormat formatter = null;

	public static void main(String[] args){
		FileSizeSummary sample = new FileSizeSummary();
		String path = "C:\\javaStudy\\workspace\\godofjava";
		//long sum = sample.printFileSize(path);
		String strSum = sample.convertFileLength(sample.printFileSize(path));
		System.out.println(path+ "'s total size =" +strSum);		
	}

	public FileSizeSummary(){
		String pattern = "#,##0.0#";
		formatter = new DecimalFormat(pattern);
	}

	public long printFileSize(String dirName){
		File dir = new File(dirName);
		long sum = 0;
		if(dir.isDirectory()){
			File[] fileList = dir.listFiles();
			for(File file : fileList){
				if(file.isFile()){
					String tempFileName = file.getAbsolutePath();
					long fileLength = file.length();
					String strFileLength = convertFileLength(fileLength);
					//System.out.println(tempFileName+ "= " +strFileLength);
					sum += fileLength;
				}else{
					String tempDirName = file.getAbsolutePath();
					long fileLength = printFileSize(tempDirName);
					String strFileLength = convertFileLength(fileLength);
					//System.out.println("[" +tempDirName+ "]= " +strFileLength);
					System.out.println("[" +tempDirName+ "] TOTAL= " +strFileLength);
					sum += fileLength;
				}
			}
		}
		return sum;
	}

	private final long KB = 1024;
	private final long MB = 1024*1024;
	private final long GB = 1024*1024*1024;

	private String convertFileLength(long fileLength){
		String result ="";
		if(fileLength < KB){
			result = fileLength+ " b";
		}else if(fileLength < MB){
			result = formatter.format(1.0*fileLength/KB)+ " kb";
		}else if(fileLength < GB){
			result = formatter.format(1.0*fileLength/MB)+ " mb";
		}else{
			result = formatter.format(1.0*fileLength/GB)+ " gb";
		}

		return result;
	}
}