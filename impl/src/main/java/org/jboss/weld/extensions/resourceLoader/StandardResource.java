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
package org.jboss.weld.extensions.resourceLoader;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * An injection point qualifier that may be used to specify a resource to
 * inject from it's standard location. The injection point can specify either a
 * {@link URL}, an {@link InputStream} or a {@link Descriptor}.
 *
 * <p>For example:</p>
 *
 * <pre>
 * &#064;Inject
 * &#064;StandardResource
 * BeansDescriptor beansXml;
 * </pre>
 *
 * <p>
 * If a input stream is loaded, it will be automatically closed when the
 * InputStream goes out of scope. If a URL is used to create an input stream,
 * the application is responsible for closing it. For this reason it is
 * recommended that managed input streams are used where possible.
 * </p>
 * 
 * <p>
 * If you don't know the name of the resource to load at development time, then
 * you may wish to use {@link ResourceProvider} which can dynamically load
 * resources.
 * </p>
 * 
 * @author Dan Allen
 * 
 * @see Resource
 * @see ResourceProvider
 */
@Retention(RUNTIME)
@Target({ METHOD, TYPE, FIELD, PARAMETER })
@Documented
@Qualifier
public @interface StandardResource // should it be DefaultResource?
{
}
