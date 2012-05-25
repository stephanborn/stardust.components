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
public interface IMigrationJob
{

   /**
    * @return Total count of resources to process.
    */
   long getTotalCount();

   /**
    * @return Resources done in the migration batch.
    */
   long getResourcesDone();

   /**
    * @return contains information about the migration job.
    */
   IMigrationJobInfo getMigrationInfo();

}