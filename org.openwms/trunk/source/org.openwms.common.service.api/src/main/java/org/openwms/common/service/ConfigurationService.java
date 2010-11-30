/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.common.service;

import java.util.List;

import org.openwms.common.domain.system.usermanagement.Preference;
import org.openwms.common.domain.values.Unit;

/**
 * A ConfigurationService.
 * 
 * @author <a href="mailto:russelltina@users.sourceforge.net">Tina Russell</a>
 * @version $Revision$
 * 
 */
public interface ConfigurationService<T extends Preference> extends EntityService<T> {

    /**
     * FIXME [russelltina] Comment this
     * 
     * @return
     */
    List<Preference> findApplicationProperties();

    // methods for each module

    /**
     * Get all unit types supported by this module.
     * 
     * @return
     */
    List<? extends Unit> getAllUnits();

    /**
     * Find and return all properties belonging to this module.
     * 
     * @return
     */
    List<Preference> findModuleProperties();
}
