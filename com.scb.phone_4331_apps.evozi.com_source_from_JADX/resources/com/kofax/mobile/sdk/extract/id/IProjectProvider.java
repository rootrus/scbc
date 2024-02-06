// Kofax Custom UI Control Classes
// Copyright (c) 2017. All rights reserved.
// Kofax Confidential.
// Unauthorized use, duplication, or distribution, or disclosure is strictly prohibited.
//

package com.kofax.mobile.sdk.extract.id;

import java.io.File;

/**
 * Specifies the interface required to satisfy extraction dependencies
 */
public interface IProjectProvider {
    /**
     * Get the highest version string for the given project that is compatible with the given
     * SDK version
     * <p>
     * <b>Note:</b> The listener's object parameter will be null, or a string representing the
     * highest compatible version
     *
     * @param projectName The name of the project
     * @param sdkVersion  The version of the SDK that must be compatible
     * @param listener    A completion listener.  If this is null, no work will be done.
     */
    void getHighestVersion(final String projectName, final String sdkVersion, final ICompletionListener<String> listener);

    /**
     * Get the project bundle for the given version
     * <p>
     * <b>Note:</b> The listener's object parameter will be a ZIP containing the top-level project
     * files, including the fields.xml, classifier configurations, and cities.zip, and a
     * file listing the available variants
     *
     * @param projectName The name of the project
     * @param version     The version of the project
     * @param listener    A completion listener.  If this is null, no work will be done.
     */
    void getProject(final String projectName, final String version, final ICompletionListener<File> listener);

    /**
     * Get a variant for the given version for the given project
     * <p>
     * <b>Note:</b> The listener's object parameter will be a ZIP containing the variant-specific
     * files
     *
     * @param projectName The name of the project
     * @param variantName The name of the variant
     * @param version     The version of the variant (this should match the same version string
     *                    retrieved from {@link #getHighestVersion(String, String, ICompletionListener<String>) getHighestVersion(String, String, ICompletionListener)}
     * @param listener    A completion listener.  If this is null, no work will be done.
     */
    @SuppressWarnings("JavadocReference")
    void getVariant(final String projectName, final String variantName, final String version, final ICompletionListener<File> listener);

    /**
     * Get the project latest model data build information from cached project
     *
     * @param projectName The name of the project to retrieve
     * @return The latest model data build info if available, otherwise a null string
     */
    public String getLatestCachedModelDataBuildInfo(String projectName);

}
