// Kofax Custom UI Control Classes
// Copyright (c) 2017. All rights reserved.
// Kofax Confidential.
// Unauthorized use, duplication, or distribution, or disclosure is strictly prohibited.
//

package com.kofax.mobile.sdk.extract.id.bundle;

import java.io.File;

/**
 * An "abstract" representation of file system entity.
 */
public interface IBundleFile {
    /**
     * Indicates if this bundle file instance represents a <i>directory</i> on the underlying
     * file system.  The file may be, despite the name <code>IBundleFile</code>, a directory or a
     * file.
     *
     * @return <code>true</code> if this is a directory, <code>false</code> otherwise
     */
    boolean isDirectory();

    /**
     * Creates a temporary file, and streams the bundle file to the temp file.
     *
     * @return The file on disk
     */
    File getFile();

    /**
     * Streams the bundle file to the given file.  Similar to {@link #getFile()}, this override
     * allows the caller to specify the location of the streamed file.  When this method returns, it
     * is safe to read from the file
     *
     * @param output The file to write to
     */
    void getFile(File output);

    /**
     * The absolute path within whatever storage container this IBundleFile resides.  Implementation
     * dependent.
     *
     * @return The absolute path of this file
     */
    String getAbsolutePath();

    /**
     * The name of this IBundleFile with no path information.
     *
     * @return The file name
     */
    String getName();
}
