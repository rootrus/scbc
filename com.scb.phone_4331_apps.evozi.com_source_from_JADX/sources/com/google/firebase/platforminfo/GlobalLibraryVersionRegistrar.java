package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GlobalLibraryVersionRegistrar {
    private static volatile GlobalLibraryVersionRegistrar INSTANCE;
    private final Set<LibraryVersion> infos = new HashSet();

    GlobalLibraryVersionRegistrar() {
    }

    /* access modifiers changed from: package-private */
    public Set<LibraryVersion> getRegisteredVersions() {
        Set<LibraryVersion> unmodifiableSet;
        synchronized (this.infos) {
            unmodifiableSet = Collections.unmodifiableSet(this.infos);
        }
        return unmodifiableSet;
    }

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = INSTANCE;
        if (globalLibraryVersionRegistrar2 != null) {
            return globalLibraryVersionRegistrar2;
        }
        synchronized (GlobalLibraryVersionRegistrar.class) {
            globalLibraryVersionRegistrar = INSTANCE;
            if (globalLibraryVersionRegistrar == null) {
                globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                INSTANCE = globalLibraryVersionRegistrar;
            }
        }
        return globalLibraryVersionRegistrar;
    }
}
