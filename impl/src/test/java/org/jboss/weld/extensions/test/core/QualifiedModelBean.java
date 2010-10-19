package org.jboss.weld.extensions.test.core;

import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

import org.jboss.weld.extensions.core.Qualified;

@Qualified
@Model
public class QualifiedModelBean
{
   @Produces @Qualified @Named
   private boolean model = true;
   
   @Produces @Qualified @Named
   public String getWordOfTheDay()
   {
      return "Dragon";
   }
   
   @Produces @Qualified @Named
   public Integer size()
   {
      return 0;
   }
}
