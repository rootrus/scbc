package com.kofax.mobile.sdk.extract.p018id.bundle;

import java.io.Closeable;
import java.util.Enumeration;

/* renamed from: com.kofax.mobile.sdk.extract.id.bundle.IBundle */
public interface IBundle extends Closeable {
    Enumeration<? extends IBundleFile> list();
}
