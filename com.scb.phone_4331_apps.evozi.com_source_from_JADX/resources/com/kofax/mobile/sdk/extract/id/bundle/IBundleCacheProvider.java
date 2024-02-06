// Kofax Custom UI Control Classes
// Copyright (c) 2017. All rights reserved.
// Kofax Confidential.
// Unauthorized use, duplication, or distribution, or disclosure is strictly prohibited.

package com.kofax.mobile.sdk.extract.id.bundle;

import java.io.File;

public interface IBundleCacheProvider {
    /**
     * Retrieves a cached project directory from cache
     * @param projectName The name of the project to retrieve
     * @param version The version of the project to retrieve
     * @return The folder containing the project, or null if it does not exist
     */
    File getProject(String projectName, String version);

    /**
     * Cache a project bundle
     * @param projectName The name of the project to cache
     * @param file The project bundle
     * @param version The version of the project being cached
     * @return The folder containing the newly cached project
     */
    File cacheProject(String projectName, IBundle file, String version);

    /**
     * Retrieves a cached project directory from cache
     * @param projectName The name of the project to which this variant belongs
     * @param variant The variant to retrieve
     * @param version The version of the variant to retrieve
     * @return The folder containing the variant, or null if it does not exist
     */
    File getVariant(String projectName, String variant, String version);

    /**
     * Cache a variant bundle
     * @param projectName The name of the project to which this variant belongs
     * @param variant The variant
     * @param file The variant bundle
     * @param version The version of the variant being cached
     * @return The folder containing the newly cached variant
     */
    File cacheVariant(String projectName, String variant, IBundle file, String version);

    /**
     * @param projectName The name of the project to get the version string for
     * @return The version string for the cached project, or null if it does not exist
     */
    String getLatestVersionForProject(String projectName);

    /**
     * Get the project latest model data build information from cached project
     *
     * @param projectName The name of the project to retrieve
     * @return The latest model data build info if available, otherwise a null string
     */
    public String getLatestModelDataBuildInfo(String projectName);

}
