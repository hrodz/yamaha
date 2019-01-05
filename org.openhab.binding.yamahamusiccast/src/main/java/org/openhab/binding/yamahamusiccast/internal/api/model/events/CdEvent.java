/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.binding.yamahamusiccast.internal.api.model.events;

/**
 * Returns CD related information 
 *
 * @author Hector Rodriguez Medina - Initial contribution
 */
public class CdEvent extends Event {

    protected String device_status;
    protected Integer play_time;
    protected boolean play_info_updated;

    /*
     * Returns CD device status Values: "open" / "close" / "ready" / "not_ready" 
     */
    public String getDeviceStatus() {
        return device_status;
    }

    /*
     * Returns current playback time (unit in second).  Value Range: -59999 ~ 59999 
     */
    public Integer getPlayTime() {
        return play_time;
    }

    /*
     * Returns whether or not playback info has changed. If so, pull renewed info using /cd/getPlayInfo 
     */
    public boolean getPlayInfoUpdated() {
        return play_info_updated;
    }
}