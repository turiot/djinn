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


public abstract class AbstractJavaItem implements JavaItem {                     
    
    @Override
    public String toString() {
        return getLabel();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == getClass()) {
            return ((AbstractJavaItem)obj).getKey() == getKey(); 
        }
        return false;                
    }
    
    @Override
    public int hashCode() {
        return (getClass().getName() + String.valueOf(getKey())).hashCode();
    }

}