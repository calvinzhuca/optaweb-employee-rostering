/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaweb.employeerostering.gwtui.client.viewport.shiftroster;

import java.util.Map;

import org.optaweb.employeerostering.shared.employee.Employee;
import org.optaweb.employeerostering.shared.roster.RosterState;
import org.optaweb.employeerostering.shared.spot.Spot;

public class ShiftRosterMetadata {

    private final RosterState rosterState;
    private final Map<Long, Spot> spotIdToSpotMap;
    private final Map<Long, Employee> employeeIdToEmployeeMap;

    public ShiftRosterMetadata(RosterState rosterState, Map<Long, Spot> spotIdToSpotMap, Map<Long, Employee> employeeIdToEmployeeMap) {
        this.rosterState = rosterState;
        this.spotIdToSpotMap = spotIdToSpotMap;
        this.employeeIdToEmployeeMap = employeeIdToEmployeeMap;
    }

    public RosterState getRosterState() {
        return rosterState;
    }

    public Map<Long, Spot> getSpotIdToSpotMap() {
        return spotIdToSpotMap;
    }

    public Map<Long, Employee> getEmployeeIdToEmployeeMap() {
        return employeeIdToEmployeeMap;
    }
}
