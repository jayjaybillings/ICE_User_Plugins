/**
 * 
 */
package org.eclipse.ice.mdplca;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.core.resources.IProject;
import org.eclipse.ice.item.Item;

/**
 * @author bkj
 *
 */
@XmlRootElement(name="Hernandez")
public class MDPLCAtem extends Item {
	
	public MDPLCAtem(IProject project) {
		super(project);
	}

}
