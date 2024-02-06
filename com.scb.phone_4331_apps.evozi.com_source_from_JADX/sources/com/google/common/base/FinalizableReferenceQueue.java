package com.google.common.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FinalizableReferenceQueue {
    private static final String FINALIZER_CLASS_NAME = "com.google.common.base.internal.Finalizer";
    /* access modifiers changed from: private */
    public static final Logger logger = Logger.getLogger(FinalizableReferenceQueue.class.getName());
    private static final Method startFinalizer = getStartFinalizer(loadFinalizer(new SystemLoader(), new DecoupledLoader(), new DirectLoader()));
    final ReferenceQueue<Object> queue;
    final boolean threadStarted;

    interface FinalizerLoader {
        Class<?> loadFinalizer();
    }

    public FinalizableReferenceQueue() {
        ReferenceQueue<Object> referenceQueue;
        boolean z = false;
        try {
            referenceQueue = (ReferenceQueue) startFinalizer.invoke((Object) null, new Object[]{FinalizableReference.class, this});
            z = true;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (Throwable th) {
            logger.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            referenceQueue = new ReferenceQueue<>();
        }
        this.queue = referenceQueue;
        this.threadStarted = z;
    }

    /* access modifiers changed from: package-private */
    public void cleanUp() {
        if (!this.threadStarted) {
            while (true) {
                Reference<? extends Object> poll = this.queue.poll();
                if (poll != null) {
                    poll.clear();
                    try {
                        ((FinalizableReference) poll).finalizeReferent();
                    } catch (Throwable th) {
                        logger.log(Level.SEVERE, "Error cleaning up after reference.", th);
                    }
                } else {
                    return;
                }
            }
        }
    }

    private static Class<?> loadFinalizer(FinalizerLoader... finalizerLoaderArr) {
        for (FinalizerLoader loadFinalizer : finalizerLoaderArr) {
            Class<?> loadFinalizer2 = loadFinalizer.loadFinalizer();
            if (loadFinalizer2 != null) {
                return loadFinalizer2;
            }
        }
        throw new AssertionError();
    }

    static class SystemLoader implements FinalizerLoader {
        SystemLoader() {
        }

        public Class<?> loadFinalizer() {
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader == null) {
                    return null;
                }
                try {
                    return systemClassLoader.loadClass(FinalizableReferenceQueue.FINALIZER_CLASS_NAME);
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.logger.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    static class DecoupledLoader implements FinalizerLoader {
        private static final String LOADING_ERROR = "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.";

        DecoupledLoader() {
        }

        public Class<?> loadFinalizer() {
            try {
                return newLoader(getBaseUrl()).loadClass(FinalizableReferenceQueue.FINALIZER_CLASS_NAME);
            } catch (Exception e) {
                FinalizableReferenceQueue.logger.log(Level.WARNING, LOADING_ERROR, e);
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public URL getBaseUrl() throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append(FinalizableReferenceQueue.FINALIZER_CLASS_NAME.replace('.', '/'));
            sb.append(".class");
            String obj = sb.toString();
            URL resource = getClass().getClassLoader().getResource(obj);
            if (resource != null) {
                String obj2 = resource.toString();
                if (obj2.endsWith(obj)) {
                    return new URL(resource, obj2.substring(0, obj2.length() - obj.length()));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported path style: ");
                sb2.append(obj2);
                throw new IOException(sb2.toString());
            }
            throw new FileNotFoundException(obj);
        }

        /* access modifiers changed from: package-private */
        public URLClassLoader newLoader(URL url) {
            return new URLClassLoader(new URL[]{url});
        }
    }

    static class DirectLoader implements FinalizerLoader {
        DirectLoader() {
        }

        public Class<?> loadFinalizer() {
            try {
                return Class.forName(FinalizableReferenceQueue.FINALIZER_CLASS_NAME);
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    static Method getStartFinalizer(Class<?> cls) {
        try {
            return cls.getMethod("startFinalizer", new Class[]{Class.class, Object.class});
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }
}
