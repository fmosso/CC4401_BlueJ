/*
 * Copyright (c) 2003, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 * 
 * --- end of original header ---
 * 
 * This file was modified for use in the BlueJ program on the 1st September 2011.
 * 
 */

package bluej.doclet.doclets.internal.toolkit;

import java.io.IOException;

import com.sun.javadoc.ClassDoc;

/**
 * The interface for writing package summary output.
 *
 * This code is not part of an API.
 * It is implementation that is subject to change.
 * Do not use it as an API
 *
 * @author Jamie Ho
 * @since 1.5
 */

public interface PackageSummaryWriter {

    /**
     * Return the name of the output file.
     *
     * @return the name of the output file.
     */
    public abstract String getOutputFileName();

    /**
     * Write the header for the package summary.
     */
    public abstract void writeSummaryHeader();

    /**
     * Write the footer for the package summary.
     */
    public abstract void writeSummaryFooter();

    /**
     * Write the table of classes in this package.
     *
     * @param classes the array of classes to document.
     * @param label the label for this table.
     */
    public abstract void writeClassesSummary(ClassDoc[] classes, String label);

    /**
     * Write the header for the summary.
     *
     * @param heading Package name.
     */
    public abstract void writePackageHeader(String heading);

    /**
     * Print the package description from the "packages.html" file.
     */
    public abstract void writePackageDescription();

    /**
     * Print the tag information from the "packages.html" file.
     */
    public abstract void writePackageTags();

    /**
     * Write the footer for the summary.
     *
     */
    public abstract void writePackageFooter();

    /**
     * Close the writer.
     */
    public abstract void close() throws IOException;

}
