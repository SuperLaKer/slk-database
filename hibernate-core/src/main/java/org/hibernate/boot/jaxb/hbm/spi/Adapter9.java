//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.28 at 12:41:53 PM CST 
//


package org.hibernate.boot.jaxb.hbm.spi;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.hibernate.engine.OptimisticLockStyle;

public class Adapter9
    extends XmlAdapter<String, OptimisticLockStyle>
{


    public OptimisticLockStyle unmarshal(String value) {
        return (org.hibernate.boot.jaxb.hbm.internal.OptimisticLockStyleConverter.fromXml(value));
    }

    public String marshal(OptimisticLockStyle value) {
        return (org.hibernate.boot.jaxb.hbm.internal.OptimisticLockStyleConverter.toXml(value));
    }

}
