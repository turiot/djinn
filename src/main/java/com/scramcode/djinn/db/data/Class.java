/*
 * Created on Feb 8, 2006
 * By Fabien Benoit - http://www.scramcode.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package com.scramcode.djinn.db.data;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;

import com.scramcode.djinn.ui.i18n.Images;


public class Class extends AbstractJavaItem {
    
    public static final ImageIcon ICON = Images.getIcon("Class.graph.icon");
    
    private int classKey;
    private String name;
    private int access;
    private int packageKey;
    private int locationKey;
    private Integer projectKey;    
    private String canonicalName;
    
    public Class(String name, String canonicalName, int access, int packageKey, int locationKey, Integer projectKey) {
        this.name = name;        
        this.access = access;
        this.packageKey = packageKey;
        this.locationKey = locationKey;
        this.projectKey = projectKey;
        this.canonicalName = canonicalName;        
    }
    
    public Class(ResultSet rs) throws SQLException {
        this.classKey = rs.getInt("class_key");   
        this.name = rs.getString("name");
        this.canonicalName = rs.getString("cname"); 
        this.access = rs.getInt("access");
        this.packageKey = rs.getInt("package_key");
        this.locationKey = rs.getInt("location_key");
        this.projectKey =  rs.getInt("project_key");
    }    
    
    public int getKey() {
        return this.classKey;
    }

    public void setKey(int classKey) {
        this.classKey = classKey;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
    
    public String getCanonicalName() {
        return this.canonicalName;
    }
    
    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }
    
    public int getPackageKey() {
        return this.packageKey;
    }

    public void setPackageKey(int packageKey) {
        this.packageKey = packageKey;
    }

    public int getAccess() {
        return this.access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    public String getMappedTable() {
        return "CLASSES";
    }

    @Override
    public String getLabel() {
        return name;
    }

    @Override
    public ImageIcon getImage() {
        return ICON;
    }
    
    public Integer getProjectKey() {
		return projectKey;
	}

    @Override
    public Color getColor() {
        return Color.green;
    }

    /**
     * @return the locationKey
     */
    public int getLocationKey() {
        return locationKey;
    }

    /**
     * @param locationKey the locationKey to set
     */
    public void setLocationKey(int locationKey) {
        this.locationKey = locationKey;
    }

    @Override
    public boolean isContainedBy(JavaItem destinationObject) {
        if (destinationObject instanceof Package) {
            return packageKey == destinationObject.getKey();
        }
        else if (destinationObject instanceof Location) {           
            return locationKey == destinationObject.getKey();
        }
        else if (destinationObject instanceof Project) {
        	return projectKey == destinationObject.getKey();
        }        
        return false;
    }

}