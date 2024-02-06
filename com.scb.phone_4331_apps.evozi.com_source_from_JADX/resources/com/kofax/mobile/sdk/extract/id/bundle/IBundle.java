// Kofax Custom UI Control Classes
// Copyright (c) 2017. All rights reserved.
// Kofax Confidential.
// Unauthorized use, duplication, or distribution, or disclosure is strictly prohibited.
//

package com.kofax.mobile.sdk.extract.id.bundle;

import java.io.Closeable;
import java.util.Enumeration;

/**
 * A collection of {@link IBundleFile bundle files}.  Used to unify the interaction with varying types of
 * storage, such as ZipFile, ZipInputStream, and regular filesystem.
 */
public interface IBundle extends Closeable {
    Enumeration<? extends IBundleFile> list();
}
