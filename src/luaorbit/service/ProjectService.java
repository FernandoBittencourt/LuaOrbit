package luaorbit.service;

import java.io.File;
import java.util.List;
import java.util.Optional;

import luaorbit.exception.ProjectNotFoundException;
import luaorbit.model.Project;



public class ProjectService {
	public Project createProject(String projectName){
		String rootPath = new WorkspaceService().getRootPath();
		boolean success = (new File(rootPath + File.pathSeparator + projectName)).mkdirs();
		if (!success) {
			return new Project(projectName);
		}
		throw new RuntimeException("The project cannot be created!");
	}
	
	public void deleteProject(String projectName){
		List<Project> projects = new WorkspaceService().getWorkspace().getProjects();
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
		List<Project> projects = new WorkspaceService().getWorkspace().getProjects();
		Optional<Project> project = projects.stream().filter(x -> x.getName() == projectName).findFirst();
		if(project.isPresent()){
			//TODO: Generate the file compressed
			throw new RuntimeException("The method was not implemented!");
		}		
		else
		{
			throw new ProjectNotFoundException();
		}
	}
	
}
