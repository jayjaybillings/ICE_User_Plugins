/**
 * 
 */
package com.tests.test1;

import org.eclipse.core.resources.IProject;
import org.eclipse.ice.item.jobLauncher.JobLauncher;

/**
 * @author benjha
 *
 */
public class Launcher extends JobLauncher {

    /**
    * The alternative nullary constructor. In general this should not be used.
    */
	public Launcher() {
		// TODO Auto-generated constructor stub
		this (null);
	}

	/**
	 * @param projectSpace
	 */
	public Launcher(IProject projectSpace) {
		super(projectSpace);
		// TODO Auto-generated constructor stub
	}
	
	/**
    * This operation creates a Form for the FileSimulation with two Entries,
    * one for the file name and one for the computing platform,. It also creates
    * one DataComponent.
    */
	
    protected void setupForm() {
    	// Set the name and description of the Item
    	setName("List Directory Contents");
    	setDescription("A launcher for the \"ls\" system command on Linux. "
    			+ "This command is used to list the contents of a directory"
    			+ " on the file system.");
        //Note that if you're on a Windows machine, you should use dir instead of ls.
    
    	// Setup the Form
    	super.setupForm();
    
    	// Setup the executable information
    	setExecutable(getName(), getDescription(), "ls");
    
    	// Add a couple of hosts
    	addHost("127.0.0.1", "linux x86_64", "/usr/bin");
    	addHost("localhost.localdomain", "linux x86_64", "/usr/bin");
    
    	return;
    	}	

}
