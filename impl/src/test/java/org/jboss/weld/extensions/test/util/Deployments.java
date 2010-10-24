package org.jboss.weld.extensions.test.util;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.StringAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;

public class Deployments
{

   public static WebArchive baseDeployment()
   {
      return ShrinkWrap.create(WebArchive.class, "test.war")
         .addLibrary(MavenArtifactResolver.resolve("org.jboss.weld", "weld-extensions"))
         // need formal beans.xml root element for BeansDescriptor to work
         .addWebResource(new StringAsset("<beans xmlns=\"http://java.sun.com/xml/ns/javaee\" " +
         		"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
         		"xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/beans_1_0.xsd\"/>"), "beans.xml");
   }
   
}
