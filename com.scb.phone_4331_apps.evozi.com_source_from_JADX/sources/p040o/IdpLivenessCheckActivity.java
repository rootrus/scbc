package p040o;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.TypeCastException;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* renamed from: o.IdpLivenessCheckActivity */
public final class IdpLivenessCheckActivity {
    public static final IdpLivenessCheckActivity write = new IdpLivenessCheckActivity();

    private IdpLivenessCheckActivity() {
    }

    public final List<MainDispatcherFactory> MediaBrowserCompat$CustomActionResultReceiver() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!NdidIdpShareSuccessActivity_ViewBinding.MediaBrowserCompat$ItemReceiver()) {
            ClassLoader classLoader = MainDispatcherFactory.class.getClassLoader();
            onGetStartedClick.IconCompatParcelizer((Object) classLoader, "clz.classLoader");
            return read(MainDispatcherFactory.class, classLoader);
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
            }
            return arrayList;
        } catch (Throwable unused3) {
            ClassLoader classLoader2 = MainDispatcherFactory.class.getClassLoader();
            onGetStartedClick.IconCompatParcelizer((Object) classLoader2, "clz.classLoader");
            return read(MainDispatcherFactory.class, classLoader2);
        }
    }

    private static <S> List<S> read(Class<S> cls, ClassLoader classLoader) {
        try {
            onGetStartedClick.write((Object) cls, "service");
            onGetStartedClick.write((Object) classLoader, "loader");
            StringBuilder sb = new StringBuilder();
            sb.append("META-INF/services/");
            sb.append(cls.getName());
            Enumeration<URL> resources = classLoader.getResources(sb.toString());
            onGetStartedClick.IconCompatParcelizer((Object) resources, "urls");
            ArrayList<T> list = Collections.list(resources);
            onGetStartedClick.IconCompatParcelizer((Object) list, "java.util.Collections.list(this)");
            Collection arrayList = new ArrayList();
            for (T t : list) {
                onGetStartedClick.IconCompatParcelizer((Object) t, "it");
                HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(arrayList, MediaBrowserCompat$ItemReceiver(t));
            }
            Set write2 = HmlNTBBusinessURLInformationActivity.write((List) arrayList);
            if (!write2.isEmpty()) {
                Iterable<String> iterable = write2;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList2 = new ArrayList(i);
                for (String cls2 : iterable) {
                    Class<?> cls3 = Class.forName(cls2, false, classLoader);
                    if (cls.isAssignableFrom(cls3)) {
                        arrayList2.add(cls.cast(cls3.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected service of class ");
                        sb2.append(cls);
                        sb2.append(", but found ");
                        sb2.append(cls3);
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                return (List) arrayList2;
            }
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        } catch (Throwable unused) {
            ServiceLoader<S> load = ServiceLoader.load(cls, classLoader);
            onGetStartedClick.IconCompatParcelizer((Object) load, "ServiceLoader.load(service, loader)");
            return HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(load);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        p040o.onGetStartedClick.write((java.lang.Object) r5, "$this$addSuppressed");
        p040o.onGetStartedClick.write((java.lang.Object) r0, "exception");
        p040o.InvestmentDetailsActivity_ViewBinding.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00aa, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ae, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.String> MediaBrowserCompat$ItemReceiver(java.net.URL r5) {
        /*
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "url.toString()"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
            r1 = 0
            java.lang.String r2 = "jar"
            boolean r2 = p040o.GoodToKnowActivity.read(r0, r2, r1)
            r3 = 0
            if (r2 == 0) goto L_0x008b
            java.lang.String r5 = "jar:file:"
            java.lang.String r5 = p040o.GoodToKnowActivity.read(r0, r5)
            java.lang.String r2 = "$this$substringBefore"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r2)
            java.lang.String r2 = "missingDelimiterValue"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r2)
            r2 = r5
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r4 = 33
            int r2 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.CharSequence) r2, (char) r4, (int) r1, (boolean) r1)
            r4 = -1
            if (r2 == r4) goto L_0x0038
            java.lang.String r5 = r5.substring(r1, r2)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r2)
        L_0x0038:
            java.lang.String r2 = "!/"
            java.lang.String r0 = p040o.GoodToKnowActivity.read(r0, r2)
            java.util.jar.JarFile r2 = new java.util.jar.JarFile
            r2.<init>(r5, r1)
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0073 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0073 }
            java.util.zip.ZipEntry r4 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0073 }
            r4.<init>(r0)     // Catch:{ all -> 0x0073 }
            java.io.InputStream r0 = r2.getInputStream(r4)     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = "UTF-8"
            r1.<init>(r0, r4)     // Catch:{ all -> 0x0073 }
            java.io.Reader r1 = (java.io.Reader) r1     // Catch:{ all -> 0x0073 }
            r5.<init>(r1)     // Catch:{ all -> 0x0073 }
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch:{ all -> 0x0073 }
            r0 = r5
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x006c }
            java.util.List r0 = IconCompatParcelizer(r0)     // Catch:{ all -> 0x006c }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0073 }
            r2.close()     // Catch:{ all -> 0x006a }
            return r0
        L_0x006a:
            r5 = move-exception
            throw r5
        L_0x006c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r5, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0073 }
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x007a }
            throw r0
        L_0x007a:
            r0 = move-exception
            java.lang.String r1 = "$this$addSuppressed"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r1)
            java.lang.String r1 = "exception"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            o.HmlNTBDocumentSubmissionTutorialsActivity r1 = p040o.InvestmentDetailsActivity_ViewBinding.MediaBrowserCompat$ItemReceiver
            r1.IconCompatParcelizer(r5, r0)
            throw r5
        L_0x008b:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r5 = r5.openStream()
            r1.<init>(r5)
            java.io.Reader r1 = (java.io.Reader) r1
            r0.<init>(r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r5 = r0
            java.io.BufferedReader r5 = (java.io.BufferedReader) r5     // Catch:{ all -> 0x00a8 }
            java.util.List r5 = IconCompatParcelizer(r5)     // Catch:{ all -> 0x00a8 }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r3)
            return r5
        L_0x00a8:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.IdpLivenessCheckActivity.MediaBrowserCompat$ItemReceiver(java.net.URL):java.util.List");
    }

    private static List<String> IconCompatParcelizer(BufferedReader bufferedReader) {
        boolean z;
        Set linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(linkedHashSet);
            }
            onGetStartedClick.write((Object) readLine, "$this$substringBefore");
            onGetStartedClick.write((Object) "#", "delimiter");
            onGetStartedClick.write((Object) readLine, "missingDelimiterValue");
            boolean z2 = false;
            int read = GoodToKnowActivity.read((CharSequence) readLine, "#", 0, false, 6);
            if (read != -1) {
                readLine = readLine.substring(0, read);
                onGetStartedClick.IconCompatParcelizer((Object) readLine, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (readLine != null) {
                String obj = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(readLine).toString();
                CharSequence charSequence = obj;
                int i = 0;
                while (true) {
                    if (i >= charSequence.length()) {
                        z = true;
                        break;
                    }
                    char charAt = charSequence.charAt(i);
                    if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (z) {
                    if (charSequence.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Illegal service provider class name: ");
                    sb.append(obj);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }
}
