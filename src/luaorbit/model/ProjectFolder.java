package luaorbit.model;

import java.util.List;

public class ProjectFolder {
	private String name;
	private String completePath;
	private List<ProjectFolder> folders;
	private List<ProjectFile> files;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompletePath() {
		return completePath;
	}
	public void setCompletePath(String completePath) {
		this.completePath = completePath;
	}
	public List<ProjectFolder> getFolders() {
		return folders;
	}
	public void setFolders(List<ProjectFolder> folders) {
		this.folders = folders;
	}
	public List<ProjectFile> getFiles() {
		return files;
	}
	public void setFiles(List<ProjectFile> files) {
		this.files = files;
	}
}
