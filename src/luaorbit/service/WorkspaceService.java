package luaorbit.service;

import luaorbit.model.Workspace;

public class WorkspaceService {
	private static Workspace workspace = null;

	public Workspace getWorkspace(){
		if(workspace == null)
			workspace = new Workspace();
		return workspace;
	}
	
	public String getRootPath(){
		return workspace.getConfiguration().getRootPath();
	}
}
