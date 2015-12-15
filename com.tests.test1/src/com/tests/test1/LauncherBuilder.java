/**
 * 
 */
package com.tests.test1;

import org.eclipse.core.resources.IProject;
import org.eclipse.ice.item.Item;
import org.eclipse.ice.item.ItemBuilder;
import org.eclipse.ice.item.ItemType;

/**
 * @author benjha
 *
 */
public class LauncherBuilder implements ItemBuilder {
	
	// The name of the Item and this builder
    private final String name = "List Directory Contents";
    
    // The type of the Item
    private final ItemType type = ItemType.Simulation;

	/**
	 * 
	 */
	public LauncherBuilder() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ice.item.ItemBuilder#build(org.eclipse.core.resources.IProject)
	 */
	@Override
	public Item build(IProject projectSpace) {
		// The Item that will be returned
    	Launcher item = null;
    		
    	// Make sure the project space is not null before creating the Item
    	if (projectSpace != null) {
    		item = new Launcher(projectSpace);
    		}
    	return item;
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ice.item.ItemBuilder#getItemName()
	 */
	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ice.item.ItemBuilder#getItemType()
	 */
	@Override
	public ItemType getItemType() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ice.item.ItemBuilder#isPublishable()
	 */
	@Override
	public boolean isPublishable() {
		// TODO Auto-generated method stub
		return false;
	}

}
