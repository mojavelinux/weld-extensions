package org.jboss.weld.extensions.test.util.collections;

import org.jboss.weld.extensions.util.collections.WrappedListIterator;
import org.junit.Test;

/**
 * tests for the presenece of a specific compiler bug
 * 
 * @author stuart
 * 
 */
public class CompilerBugTest
{
   @Test
   public void testcompilerBug()
   {
      WrappedListIterator.class.getTypeParameters();
   }
}
