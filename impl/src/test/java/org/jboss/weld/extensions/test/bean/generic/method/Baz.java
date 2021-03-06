/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.weld.extensions.test.bean.generic.method;

import javax.inject.Inject;

import org.jboss.weld.extensions.bean.generic.Generic;
import org.jboss.weld.extensions.bean.generic.GenericConfiguration;

/**
 * A generic bean for the config annotation Message
 * 
 * @author pmuir
 *
 */

@GenericConfiguration(Message.class)
public class Baz
{

   @Inject @Generic
   private Bar bar;

   @Inject
   private Corge corge;
   
   @Inject 
   @Generic
   private Message message;

   public Bar getBar()
   {
      return bar;
   }
   
   public Corge getCorge()
   {
      return corge;
   }

   public Message getMessage()
   {
      return message;
   }
}
