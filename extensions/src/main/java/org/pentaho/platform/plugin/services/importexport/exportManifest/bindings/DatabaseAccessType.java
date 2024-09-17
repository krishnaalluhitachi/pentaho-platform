/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2028-08-13
 ******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.25 at 11:25:28 AM EDT 
//

package org.pentaho.platform.plugin.services.importexport.exportManifest.bindings;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for databaseAccessType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="databaseAccessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NATIVE"/>
 *     &lt;enumeration value="ODBC"/>
 *     &lt;enumeration value="OCI"/>
 *     &lt;enumeration value="PLUGIN"/>
 *     &lt;enumeration value="JNDI"/>
 *     &lt;enumeration value="CUSTOM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType( name = "databaseAccessType" )
@XmlEnum
public enum DatabaseAccessType {

  NATIVE, ODBC, OCI, PLUGIN, JNDI, CUSTOM;

  public String value() {
    return name();
  }

  public static DatabaseAccessType fromValue( String v ) {
    return valueOf( v );
  }

}
