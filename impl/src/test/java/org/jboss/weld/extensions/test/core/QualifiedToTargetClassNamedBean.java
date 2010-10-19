package org.jboss.weld.extensions.test.core;

import javax.inject.Named;

import org.jboss.weld.extensions.core.CoreExtension;
import org.jboss.weld.extensions.core.Qualified;

@Qualified(CoreExtension.class)
@Named
public class QualifiedToTargetClassNamedBean
{
}
