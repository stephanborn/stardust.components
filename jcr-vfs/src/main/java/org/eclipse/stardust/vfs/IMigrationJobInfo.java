/*******************************************************************************
 * Copyright (c) 2012 SunGard CSA LLC and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SunGard CSA LLC - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.stardust.vfs;

/**
 * Holds information about a repository migration job.
 *
 * @author Roland.Stamm
 *
 */
public interface IMigrationJobInfo
{

   /**
    * @return the name of the migration job.
    */
   String getName();

   /**
    * @return a description for the migration job.
    */
   String getDescription();

   /**
    * @return source repository version.
    */
   int getFromVersion();

   /**
    * @return target repository version.
    */
   int getToVersion();



}

