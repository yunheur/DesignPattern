package dirsearch;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;

public class DirSearcher {

	private String rootPath = null; // startPath�� ���� ��α��� ��� ����
	private HashSet<File> pathList = null;
	
	public DirSearcher(String rootPath) {
		this.rootPath = rootPath;
	}

	public void printAll() {
		pathList = new HashSet<File>();
		SearchDir(rootPath);
	}

	private void SearchDir(String path) {
		File dir = new File(path); // ���丮 ����
		File[] fileList = dir.listFiles();
		try {
			for (int i = 0; i < fileList.length; i++) {
				File file = fileList[i];
				if (file.isFile()) {
					System.out.println(new Date(file.lastModified())
							+ " <NOT DIR> " + file.getName());
				} else if (file.isDirectory()) {
					// ������丮�� �����ϸ� ����� ������� �ٽ� Ž��
					System.out.println(new Date(file.lastModified())
					+ " <DIR> " + file.getName());
					SearchDir(file.getCanonicalPath().toString());
					//file.getName()
				}
			}
		} catch (IOException e) {

		}
	}
	public void setPath(String rootPath){
		this.rootPath = rootPath;
	}
}