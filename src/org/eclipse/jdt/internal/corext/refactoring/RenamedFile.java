package org.eclipse.jdt.internal.corext.refactoring;

import org.eclipse.core.resources.IFile;

/**
 * This class remembers the names of a file before and after it is renamed with Rename Refactoring.
 * @author dhou
 *
 */
public class RenamedFile {
	
	private static IFile file =null;
	private static String newFilepath =null;
	private static String newName = "";
	public static IFile getFile() {
		return file;
	}
	public static void setFile(IFile file) {
		RenamedFile.file = file;
	}
	public static String getNewFilepath() {
		return newFilepath;
	}
	public static void setNewFilepath(String newFilepath) {
		RenamedFile.newFilepath = newFilepath;
	}
	public static String getNewName() {
		return newName;
	}
	public static void setNewName(String newName) {
		RenamedFile.newName = newName;
	}


}
