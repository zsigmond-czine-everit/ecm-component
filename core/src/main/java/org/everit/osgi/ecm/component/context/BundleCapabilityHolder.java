/**
 * This file is part of Everit - ECM Component.
 *
 * Everit - ECM Component is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Everit - ECM Component is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Everit - ECM Component.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.everit.osgi.ecm.component.context;

import java.util.Map;

import org.osgi.framework.wiring.BundleCapability;

public class BundleCapabilityHolder extends AbstractReferenceHolder<BundleCapability> {

    public BundleCapabilityHolder(String referenceId, BundleCapability reference, Map<String, Object> attributes) {
        super(referenceId, reference, attributes);
    }

}
