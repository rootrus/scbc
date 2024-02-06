// Kofax Custom UI Control Classes
// Copyright (c) 2017. All rights reserved.
// Kofax Confidential.
// Unauthorized use, duplication, or distribution, or disclosure is strictly prohibited.

package com.kofax.mobile.sdk.extract.id.bundle;

import android.content.Context;

import com.kofax.mobile.sdk.extract.id.ProjectProviderException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Scanner;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * The BundleCacheProvider handles extracting/copying entries from a bundle into a cache folder.
 * The provider is used to determine the cache location.<br>
 * By default, the SDK uses
 * the <a href="http://developer.android.com/reference/android/content/Context.html#getFilesDir()">Context.getFilesDir()</a>
 * to save extracted bundle entries as /[app dir]/files/{@link #ODE_CACHE}/[version]/{project,variant}/
 * <p>
 * Depending on where the cache is
 * (<a href="http://developer.android.com/reference/android/content/Context.html#getCacheDir()">Context.getCacheDir()</a>
 * or <a href="http://developer.android.com/reference/android/content/Context.html#getFilesDir()">Context.getFilesDir()</a>),
 * the saved files may be stored temporarily, or permanently.
 * <p>
 * This implementation uses the version string, and will completely empty downloaded files if the
 * given version string does not match what is already on disk.
 */
public class BundleCacheProvider
        implements IBundleCacheProvider {
    public static final String ODE_CACHE = "_COM_KOFAX_MOBILE_SDK_EXTRACT_ID_ODE_CACHE_";
    private static final String BUILDINFO_FILE = "BuildInfo.txt";

    private File _cache;

    /**
     * Create a cache provider which uses
     * <a href="http://developer.android.com/reference/android/content/Context.html#getFilesDir()">context.getFilesDir()</a>
     * as the cache location.
     *
     * @param context The context
     */
    public BundleCacheProvider(Context context) {
        _cache = new File(context.getFilesDir(), ODE_CACHE);
    }

    /**
     * Create a cache provider specifying the cache location.
     *
     * @param cache The directory where this should cache files
     */
    @Inject
    public BundleCacheProvider(
            // \cond
            @Named(ODE_CACHE)
                    // \endcond
                    File cache) {
        _cache = new File(cache, ODE_CACHE);
    }

    /**
     * Get the project latest build model from cache
     *
     * @param projectName The name of the project to retrieve
     * @return The latest model data build info if available, otherwise a null string
     */
    @Override
    public String getLatestModelDataBuildInfo(String projectName) {

        String latestVersion = getLatestVersionForProject(projectName);

        if (latestVersion != null) {
            File buildInfoFile = new File(getProject(projectName, latestVersion), BUILDINFO_FILE);

            if (buildInfoFile != null) {
                try {
                    Scanner scanner = new Scanner(buildInfoFile);

                    if (scanner.hasNextLine())
                        return scanner.nextLine();
                }
                catch (FileNotFoundException ex)
                {
                    return null;
                }
            }
        }
        return null;
    }

     /**
      * Get the project directory
      *
      * @param projectName The name of the project to retrieve
      * @param version     The version of the project to retrieve
      * @return The directory containing the project files
      */
    @Override
    public File getProject(String projectName, String version) {
        File projectCache = getCacheDirectory(projectName, version);

        if (!existsNotEmpty(projectCache)) {
            return null;
        }

        return projectCache;
    }

    /**
     * Extracts the project parts from the given bundle and caches them in the application's local
     * storage.
     *
     * @param projectName The project to extract
     * @param bundle      The bundle from which the project will be extracted
     * @param version     The version of this bundle
     * @return The directory containing the project parts
     */
    @Override
    public File cacheProject(String projectName, IBundle bundle, String version) {
        File projectCache = getCacheDirectory(projectName, version);

        try {
            Enumeration<? extends IBundleFile> entries = bundle.list();
            while (entries.hasMoreElements()) {
                IBundleFile entry = entries.nextElement();

                if (entry.isDirectory()) {
                    continue;
                }

                copyEntryToCache(entry, projectCache);
            }

            return projectCache;
        } catch (IOException e) {
            throw new ProjectProviderException(e);
        }
    }

    /**
     * Get the variant directory
     *
     * @param projectName The name of the project to which this variant belongs
     * @param variant     The variant to retrieve
     * @param version     The version of the variant to retrieve
     * @return The directory containing the variant parts
     */
    @Override
    public File getVariant(String projectName, String variant, String version) {
        File projectCache = getProject(projectName, version);
        File variantCache = new File(projectCache, variant);

        if (!existsNotEmpty(variantCache)) {
            return null;
        }

        return variantCache;
    }

    /**
     * Extracts the variant parts from the given bundle and caches them in the application's local
     * storage.
     *
     * @param projectName The name of the project to which this variant belongs
     * @param variantName The variant to extract
     * @param bundle      The bundle from which the variant will be extracted
     * @param version     The version of this bundle
     * @return The directory containing the variant parts
     */
    @Override
    public File cacheVariant(
            String projectName,
            String variantName,
            IBundle bundle,
            String version) {
        try {
            File variantCache = getCacheDirectory(projectName, version);
            variantCache = new File(variantCache, variantName);

            Enumeration<? extends IBundleFile> entries = bundle.list();
            while (entries.hasMoreElements()) {
                IBundleFile entry = entries.nextElement();

                if (entry.isDirectory()) {
                    continue;
                }

                copyEntryToCache(entry, variantCache);
            }

            return variantCache;
        } catch (Exception e) {
            throw new ProjectProviderException(e);
        }
    }

    /**
     * Gets the version of the cached project file
     *
     * @param projectName The name of the project to get the version string for
     * @return The version string, or null if one is not cached
     * @throws ProjectProviderException If more than one project cache exists
     */
    @Override
    public String getLatestVersionForProject(final String projectName) {
        if (_cache == null ||
                !_cache.exists()) {
            return null;
        }

        Collection<File> files =
                FileUtils.listFilesAndDirs(
                        _cache,
                        FalseFileFilter.FALSE,
                        DirectoryFileFilter.DIRECTORY);

        String highestVersion = null;

        for (File file : files) {
            String name = file.getName();
            if (name.equalsIgnoreCase(projectName)) {
                if (highestVersion != null) {
                    throw new ProjectProviderException("More than one cache directory exists!");
                } else {
                    highestVersion = file.getParentFile().getName();
                }
            }
        }

        return highestVersion;
    }

    /**
     * Recursively deletes the cache folder, and its contents.
     */
    @SuppressWarnings("unused")
    protected void clearCache() {
        if (_cache == null ||
                !_cache.exists()) {
            return;
        }
        deleteRecursive(_cache);
    }

    private synchronized void deleteRecursive(File file) {
        try {
            deleteFileRecursive(file);
        } catch (SecurityException e) {
            throw new ProjectProviderException("Could not clean cache of file/directory: " +
                    _cache.getAbsolutePath());
        }
    }

    private void deleteFileRecursive (File file) {
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                deleteFileRecursive(child);
            }
        }
        if (!file.delete()) {
            throw new ProjectProviderException("Could not clean cache of file/directory: " +
                    file.getAbsolutePath());
        }
    }

    private File getCacheDirectory(String directoryName, String version) {
        if (_cache.exists() &&
                _cache.list().length > 0) {
            for (File cacheVersionFolder : _cache.listFiles()) {
                String cachedVersion = cacheVersionFolder.getName();
                if (!cachedVersion.equals(version) &&
                        ArrayUtils.contains(cacheVersionFolder.list(), directoryName)) {
                    deleteRecursive(new File(cacheVersionFolder, directoryName));

                    if (cacheVersionFolder.list().length <= 0) {
                        cacheVersionFolder.delete();
                    }
                }
            }
        }

        File versionFolder = new File(_cache, version);
        return new File(versionFolder, directoryName);
    }

    private void copyEntryToCache(IBundleFile bundleFile, File cache)
            throws IOException {
        String subFileName = new File(bundleFile.getName()).getName();
        File fileOutput = new File(cache, subFileName);

        if (!fileOutput.exists()) {
            File fileOutputParent = fileOutput.getParentFile();
            if (!fileOutputParent.exists() &&
                    !fileOutputParent.mkdirs()) {
                throw new ProjectProviderException("Unable to save file to cache");
            }

            bundleFile.getFile(fileOutput);
        }
    }

    private boolean existsNotEmpty(File projectCache) {
        if (projectCache != null &&
                projectCache.exists() &&
                projectCache.list() != null &&
                projectCache.list().length > 0) {
            for (File file : projectCache.listFiles()) {
                if (!file.isDirectory()) {
                    return true;
                }
            }
        }

        return false;
    }
}
