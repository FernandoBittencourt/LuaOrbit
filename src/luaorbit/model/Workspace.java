package luaorbit.model;
import java.util.List;

public class Workspace {
	private List<Project> projects;
	private WorkspaceConfiguration configuration;
	
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public WorkspaceConfiguration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(WorkspaceConfiguration configuration) {
		this.configuration = configuration;
	}	
}
