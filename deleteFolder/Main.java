package deleteFolder;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		String folderNameToDel = "H:/SoftToDel";
		File folderToDel = new File(folderNameToDel);
		if (!folderToDel.exists()) {
			System.out.println(folderNameToDel + " doesn't exist!");
			return;
		}

		if (!folderToDel.isDirectory()) {
			System.out.println(folderNameToDel + " is not folder!");
			return;
		}
		delete(folderToDel);
	}

	public static void deleteFile(File file) {
		try {
			file.delete();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println(
				(file.isDirectory() ? "Folder " : "File ") + file.getAbsolutePath() + " was deleted succesfully!");
	}

	public static void delete(File fileToDel) {
		if (fileToDel.isFile()) {
			deleteFile(fileToDel);
			return;
		}

		File[] innerFiles = fileToDel.listFiles();
		if (innerFiles.length == 0) {
			deleteFile(fileToDel);
		} else {
			for (File file : innerFiles) {
				delete(file);
			}
		}
		deleteFile(fileToDel);
	}
}
