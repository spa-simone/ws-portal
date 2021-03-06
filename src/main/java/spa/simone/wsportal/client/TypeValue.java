/*
 * Copyright © 2010
 *
 * This file is part of "WS Portal" web application.
 *
 * WS Portal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WS Portal is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WS Portal.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.unical.inf.wsportal.client;

/**
 * Describe a couple of [type, value].
 * 
 * @author Simone Spaccarotella {spa.simone@gmail.com}, Carmine Dodaro {carminedodaro@gmail.com}
 */
public class TypeValue {

    private String type;
    private Object value;

    /**
     * Create an empty couple.
     */
    public TypeValue() {
        this("", "");
    }

    /**
     * Create a couple with the given [type, value].
     *
     * @param type a java type
     * @param value the value of the parameter
     */
    public TypeValue(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Sets the java type.
     *
     * @param type the java type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the java type.
     * 
     * @return the java type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the parameter value.
     * 
     * @param value the parameter value
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the parameter value.
     *
     * @return the parameter value.
     */
    public Object getValue() {
        return value;
    }
}
