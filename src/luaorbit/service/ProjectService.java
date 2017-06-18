package luaorbit.service;

import luaorbit.model;

static Workspace workspace = null;

public class ProjectService {
	public Project createProject(String projectName){
		return new Project(projectName);
	}
	
	public void deleteProject(String projectName){
		List<Project> projects = GetWorkspace().getProjects();
		projects.removeIf(s -> s.getName().contains(projectName));
	}
	
	public void updateProject(){
		throw new RuntimeException();
	}
	
	public void importProject(String sourcePath){
		//TODO: Convert Files into Project
		throw new RuntimeException();
	}
	
	public void exportProject(String projectName, String destinationPath){
		List<Project> projects = GetWorkspace().getProjects();
		Project project = projects.filter(x -> x.getName() == projectName).findFirst();
		//TODO: Write folders and files
		throw new RuntimeException();
	}
	
	public Workspace GetWorkspace(){
		if(workspace == null)
			workspace = new Workspace();
		return workspace;
	}
}
