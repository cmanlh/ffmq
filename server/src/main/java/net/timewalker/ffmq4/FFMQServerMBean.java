/*
 * This file is part of FFMQ.
 * 
 * FFMQ is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * FFMQ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FFMQ; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 */

package net.timewalker.ffmq4;

import java.util.List;

import net.timewalker.ffmq4.management.destination.definition.AbstractDestinationDefinition;


/**
 * <p>
 * JMX interface for an FFMQServer instance
 * </p>
 */
public interface FFMQServerMBean {
    /**
     * Get the server version string
     */
    public String getVersion();

    /**
     * Get the server uptime in milliseconds
     */
    public long getUptime();

    /**
     * Test if the server is started
     * 
     * @return the started
     */
    public boolean isStarted();

    /**
     * Test if remote admin is enabled
     */
    public boolean isRemoteAdministrationEnabled();

    /**
     * Ask the server to start
     */
    public boolean start(List<AbstractDestinationDefinition> queueList);

    /**
     * Ask the server to shutdown
     */
    public boolean shutdown();
}
