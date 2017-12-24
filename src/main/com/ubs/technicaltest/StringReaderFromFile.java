package com.ubs.technicaltest;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * StringReaderFromFile class will reader text from a file
 * @author YAN
 *
 */
public class StringReaderFromFile implements StringReader {

	private String fileName;
	
	public StringReaderFromFile(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public String readText() {
		// TODO Auto-generated method stub
		StringBuffer sbtext = new StringBuffer("");
		FileChannel fileChannel = null;
		Path filePath = Paths.get(fileName);
		try {
			fileChannel = FileChannel.open(filePath);
			ByteBuffer cbuffer = ByteBuffer.allocate(1024);
			
			int byteSize = -1;
			do {
				byteSize = fileChannel.read(cbuffer);
				cbuffer.flip();
				while(cbuffer.hasRemaining()){
					sbtext.append((char) cbuffer.get());
				 }
				cbuffer.clear();
				byteSize = fileChannel.read(cbuffer);
			} while(byteSize!=-1);
			cbuffer.flip();
			while(cbuffer.hasRemaining()){
				sbtext.append((char) cbuffer.get());
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				fileChannel.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sbtext.toString();
	}

}
