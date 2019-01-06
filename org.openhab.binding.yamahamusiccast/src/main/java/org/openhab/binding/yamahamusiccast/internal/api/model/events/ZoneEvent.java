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
 * Returns information related to Zone 
 *
 * @author Hector Rodriguez Medina - Initial contribution
 */
public class ZoneEvent extends Event {

    protected String power;
    protected String input;
    protected Integer volume;
    protected Boolean mute;
    protected Boolean status_updated;
    protected Boolean signal_info_updated;

    /*
     * Returns power status Values: "on" / "standby" 
     */
    public String getPower() {
//        if (power != null)
            return power;
//        else
//            return "9999";
    }

    /*
     * Returns current Input ID Values: Input IDs gotten via /system/getFeature 
     */
    public String getInput() {
//        if (input != null)
            return input;
//        else
//            return "9999";
    }

    /*
     * Returns volume value Values: Value range calculated by minimum/maximum/step
     * values gotten via /system/getFeatures 
     */
    public Integer getVolume() {
//        if (volume != null)
            return volume;
//        else
//            return 9999;
    }

    /*
     * Returns mute status 
     */
    public Boolean getMute() {
        return mute;
    }

    /*
     * Returns whether or not other info has changed than main zone power/input/volume/mute status.
     * If so, pull renewed info using /main/getStatus 
     */
    public Boolean getStatusUpdated() {
        return status_updated;
    }

    /*
     * Returns whether or not signal info has changed. If so, pull renewed info using
     * /main/getSignalInfo
     */
    public Boolean getSignalInfoUpdated() {
        return signal_info_updated;
    }
}
