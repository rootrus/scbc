package p040o;

import java.io.PrintStream;
import java.security.AccessController;
import java.util.Hashtable;
import org.apache.commons.logging.LogConfigurationException;

/* renamed from: o.PrepaidOtpActivity */
public abstract class PrepaidOtpActivity {
    private static final String IconCompatParcelizer;
    private static Hashtable MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
    private static PrintStream MediaBrowserCompat$ItemReceiver = IconCompatParcelizer();
    private static final ClassLoader MediaBrowserCompat$MediaItem;
    private static /* synthetic */ Class read;
    private static volatile PrepaidOtpActivity write;

    public abstract PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$ItemReceiver(String str) throws LogConfigurationException;

    public abstract void MediaBrowserCompat$ItemReceiver(String str, Object obj);

    public abstract PrepaidTravelCoachMarkActivity_ViewBinding read(Class cls) throws LogConfigurationException;

    public static PrepaidTravelCoachMarkActivity_ViewBinding write(Class cls) throws LogConfigurationException {
        return read().read(cls);
    }

    public static PrepaidTravelCoachMarkActivity_ViewBinding read(String str) throws LogConfigurationException {
        return read().MediaBrowserCompat$ItemReceiver(str);
    }

    public static ClassLoader MediaBrowserCompat$CustomActionResultReceiver(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (MediaBrowserCompat$ItemReceiver != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e.getMessage());
                String obj = stringBuffer.toString();
                PrintStream printStream = MediaBrowserCompat$ItemReceiver;
                if (printStream != null) {
                    printStream.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            }
            throw e;
        }
    }

    public static ClassLoader write() throws LogConfigurationException {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    private static PrepaidOtpActivity IconCompatParcelizer(String str, ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object doPrivileged = AccessController.doPrivileged(new PrepaidTravelConversionReviewActivity(str, classLoader));
        boolean z = true;
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (MediaBrowserCompat$ItemReceiver == null) {
                z = false;
            }
            if (z) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("An error occurred while loading the factory class:");
                stringBuffer.append(logConfigurationException.getMessage());
                String obj = stringBuffer.toString();
                PrintStream printStream = MediaBrowserCompat$ItemReceiver;
                if (printStream != null) {
                    printStream.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            }
            throw logConfigurationException;
        }
        if (MediaBrowserCompat$ItemReceiver == null) {
            z = false;
        }
        if (z) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(read(doPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(read((Object) classLoader2));
            String obj2 = stringBuffer2.toString();
            PrintStream printStream2 = MediaBrowserCompat$ItemReceiver;
            if (printStream2 != null) {
                printStream2.print(IconCompatParcelizer);
                MediaBrowserCompat$ItemReceiver.println(obj2);
                MediaBrowserCompat$ItemReceiver.flush();
            }
        }
        return (PrepaidOtpActivity) doPrivileged;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00ca */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.Object MediaBrowserCompat$CustomActionResultReceiver(java.lang.String r7, java.lang.ClassLoader r8) {
        /*
            java.lang.String r0 = "o.PrepaidOtpActivity"
            r1 = 0
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L_0x01e4
            java.lang.Class r1 = r8.loadClass(r7)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.Class r4 = read     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            if (r4 != 0) goto L_0x0016
            java.lang.Class r4 = write((java.lang.String) r0)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            read = r4     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            goto L_0x0018
        L_0x0016:
            java.lang.Class r4 = read     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
        L_0x0018:
            boolean r4 = r4.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            if (r4 == 0) goto L_0x005c
            java.io.PrintStream r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            if (r4 == 0) goto L_0x0024
            r4 = r2
            goto L_0x0025
        L_0x0024:
            r4 = r3
        L_0x0025:
            if (r4 == 0) goto L_0x00c0
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = "Loaded class "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = r1.getName()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = " from classloader "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = read((java.lang.Object) r8)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.io.PrintStream r5 = MediaBrowserCompat$ItemReceiver     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            if (r5 == 0) goto L_0x00c0
            java.lang.String r6 = IconCompatParcelizer     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r5.print(r6)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.io.PrintStream r5 = MediaBrowserCompat$ItemReceiver     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r5.println(r4)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.io.PrintStream r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r4.flush()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            goto L_0x00c0
        L_0x005c:
            java.io.PrintStream r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            if (r4 == 0) goto L_0x0062
            r4 = r2
            goto L_0x0063
        L_0x0062:
            r4 = r3
        L_0x0063:
            if (r4 == 0) goto L_0x00c0
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = "Factory class "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = r1.getName()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = " loaded from classloader "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.ClassLoader r5 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = read((java.lang.Object) r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = " does not extend '"
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.Class r5 = read     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            if (r5 != 0) goto L_0x0096
            java.lang.Class r5 = write((java.lang.String) r0)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            read = r5     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            goto L_0x0098
        L_0x0096:
            java.lang.Class r5 = read     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
        L_0x0098:
            java.lang.String r5 = r5.getName()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r5 = "' as loaded by this classloader."
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.io.PrintStream r5 = MediaBrowserCompat$ItemReceiver     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            if (r5 == 0) goto L_0x00bb
            java.lang.String r6 = IconCompatParcelizer     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r5.print(r6)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.io.PrintStream r5 = MediaBrowserCompat$ItemReceiver     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r5.println(r4)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            java.io.PrintStream r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            r4.flush()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
        L_0x00bb:
            java.lang.String r4 = "[BAD CL TREE] "
            read((java.lang.String) r4, (java.lang.ClassLoader) r8)     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
        L_0x00c0:
            java.lang.Object r4 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            o.PrepaidOtpActivity r4 = (p040o.PrepaidOtpActivity) r4     // Catch:{ ClassNotFoundException -> 0x01a5, NoClassDefFoundError -> 0x015c, ClassCastException -> 0x00ca }
            return r4
        L_0x00c7:
            r7 = move-exception
            goto L_0x0225
        L_0x00ca:
            java.lang.ClassLoader r4 = MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x00c7 }
            if (r8 != r4) goto L_0x01e4
            boolean r8 = MediaBrowserCompat$ItemReceiver((java.lang.Class) r1)     // Catch:{ Exception -> 0x00c7 }
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00c7 }
            r4.<init>()     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r5 = "The application has specified that a custom LogFactory implementation "
            r4.append(r5)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r5 = "should be used but Class '"
            r4.append(r5)     // Catch:{ Exception -> 0x00c7 }
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "' cannot be converted to '"
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Class r7 = read     // Catch:{ Exception -> 0x00c7 }
            if (r7 != 0) goto L_0x00f4
            java.lang.Class r7 = write((java.lang.String) r0)     // Catch:{ Exception -> 0x00c7 }
            read = r7     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00f6
        L_0x00f4:
            java.lang.Class r7 = read     // Catch:{ Exception -> 0x00c7 }
        L_0x00f6:
            java.lang.String r7 = r7.getName()     // Catch:{ Exception -> 0x00c7 }
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "'. "
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            if (r8 == 0) goto L_0x0128
            java.lang.String r7 = "The conflict is caused by the presence of multiple LogFactory classes "
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "in incompatible classloaders. "
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "Background can be found in http://commons.apache.org/logging/tech.html. "
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "If you have not explicitly specified a custom LogFactory then it is likely "
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "that the container has set one without your knowledge. "
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "In this case, consider using the commons-logging-adapters.jar file or "
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "specifying the standard LogFactory from the command line. "
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x012d
        L_0x0128:
            java.lang.String r7 = "Please check the custom implementation. "
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
        L_0x012d:
            java.lang.String r7 = "Help can be found @http://commons.apache.org/logging/troubleshooting.html."
            r4.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            if (r7 == 0) goto L_0x0138
            r7 = r2
            goto L_0x0139
        L_0x0138:
            r7 = r3
        L_0x0139:
            if (r7 == 0) goto L_0x0152
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            if (r8 == 0) goto L_0x0152
            java.lang.String r5 = IconCompatParcelizer     // Catch:{ Exception -> 0x00c7 }
            r8.print(r5)     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            r8.println(r7)     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            r7.flush()     // Catch:{ Exception -> 0x00c7 }
        L_0x0152:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r8 = r4.toString()     // Catch:{ Exception -> 0x00c7 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00c7 }
            throw r7     // Catch:{ Exception -> 0x00c7 }
        L_0x015c:
            r4 = move-exception
            java.lang.ClassLoader r5 = MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x00c7 }
            if (r8 != r5) goto L_0x01e4
            java.io.PrintStream r5 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            if (r5 == 0) goto L_0x0167
            r5 = r2
            goto L_0x0168
        L_0x0167:
            r5 = r3
        L_0x0168:
            if (r5 == 0) goto L_0x01a4
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00c7 }
            r5.<init>()     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r6 = "Class '"
            r5.append(r6)     // Catch:{ Exception -> 0x00c7 }
            r5.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "' cannot be loaded"
            r5.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = " via classloader "
            r5.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = read((java.lang.Object) r8)     // Catch:{ Exception -> 0x00c7 }
            r5.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = " - it depends on some other class that cannot be found."
            r5.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            if (r8 == 0) goto L_0x01a4
            java.lang.String r5 = IconCompatParcelizer     // Catch:{ Exception -> 0x00c7 }
            r8.print(r5)     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            r8.println(r7)     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            r7.flush()     // Catch:{ Exception -> 0x00c7 }
        L_0x01a4:
            throw r4     // Catch:{ Exception -> 0x00c7 }
        L_0x01a5:
            r4 = move-exception
            java.lang.ClassLoader r5 = MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x00c7 }
            if (r8 != r5) goto L_0x01e4
            java.io.PrintStream r5 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            if (r5 == 0) goto L_0x01b0
            r5 = r2
            goto L_0x01b1
        L_0x01b0:
            r5 = r3
        L_0x01b1:
            if (r5 == 0) goto L_0x01e3
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00c7 }
            r5.<init>()     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r6 = "Unable to locate any class called '"
            r5.append(r6)     // Catch:{ Exception -> 0x00c7 }
            r5.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = "' via classloader "
            r5.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = read((java.lang.Object) r8)     // Catch:{ Exception -> 0x00c7 }
            r5.append(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            if (r8 == 0) goto L_0x01e3
            java.lang.String r5 = IconCompatParcelizer     // Catch:{ Exception -> 0x00c7 }
            r8.print(r5)     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            r8.println(r7)     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            r7.flush()     // Catch:{ Exception -> 0x00c7 }
        L_0x01e3:
            throw r4     // Catch:{ Exception -> 0x00c7 }
        L_0x01e4:
            java.io.PrintStream r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            if (r4 == 0) goto L_0x01ea
            r4 = r2
            goto L_0x01eb
        L_0x01ea:
            r4 = r3
        L_0x01eb:
            if (r4 == 0) goto L_0x021a
            java.lang.StringBuffer r4 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00c7 }
            r4.<init>()     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r5 = "Unable to load factory class via classloader "
            r4.append(r5)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r8 = read((java.lang.Object) r8)     // Catch:{ Exception -> 0x00c7 }
            r4.append(r8)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r8 = " - trying the classloader associated with this LogFactory."
            r4.append(r8)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r8 = r4.toString()     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            if (r4 == 0) goto L_0x021a
            java.lang.String r5 = IconCompatParcelizer     // Catch:{ Exception -> 0x00c7 }
            r4.print(r5)     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            r4.println(r8)     // Catch:{ Exception -> 0x00c7 }
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x00c7 }
            r8.flush()     // Catch:{ Exception -> 0x00c7 }
        L_0x021a:
            java.lang.Class r1 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.Object r7 = r1.newInstance()     // Catch:{ Exception -> 0x00c7 }
            o.PrepaidOtpActivity r7 = (p040o.PrepaidOtpActivity) r7     // Catch:{ Exception -> 0x00c7 }
            return r7
        L_0x0225:
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver
            if (r8 == 0) goto L_0x022a
            goto L_0x022b
        L_0x022a:
            r2 = r3
        L_0x022b:
            if (r2 == 0) goto L_0x0242
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver
            if (r8 == 0) goto L_0x0242
            java.lang.String r2 = IconCompatParcelizer
            r8.print(r2)
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = "Unable to create LogFactory instance."
            r8.println(r2)
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver
            r8.flush()
        L_0x0242:
            if (r1 == 0) goto L_0x025c
            java.lang.Class r8 = read
            if (r8 != 0) goto L_0x024e
            java.lang.Class r8 = write((java.lang.String) r0)
            read = r8
        L_0x024e:
            boolean r8 = r8.isAssignableFrom(r1)
            if (r8 != 0) goto L_0x025c
            org.apache.commons.logging.LogConfigurationException r8 = new org.apache.commons.logging.LogConfigurationException
            java.lang.String r0 = "The chosen LogFactory implementation does not extend LogFactory. Please check your configuration."
            r8.<init>(r0, r7)
            return r8
        L_0x025c:
            org.apache.commons.logging.LogConfigurationException r8 = new org.apache.commons.logging.LogConfigurationException
            r8.<init>((java.lang.Throwable) r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver(java.lang.String, java.lang.ClassLoader):java.lang.Object");
    }

    private static /* synthetic */ Class write(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static boolean MediaBrowserCompat$ItemReceiver(Class cls) {
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    PrintStream printStream = MediaBrowserCompat$ItemReceiver;
                    if (printStream != null) {
                        printStream.print(IconCompatParcelizer);
                        MediaBrowserCompat$ItemReceiver.println("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                        MediaBrowserCompat$ItemReceiver.flush();
                    }
                } else {
                    read("[CUSTOM LOG FACTORY] ", classLoader);
                    z = Class.forName("o.PrepaidOtpActivity", false, classLoader).isAssignableFrom(cls);
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                        String obj = stringBuffer.toString();
                        PrintStream printStream2 = MediaBrowserCompat$ItemReceiver;
                        if (printStream2 != null) {
                            printStream2.print(IconCompatParcelizer);
                            MediaBrowserCompat$ItemReceiver.println(obj);
                            MediaBrowserCompat$ItemReceiver.flush();
                        }
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer2.append(cls.getName());
                        stringBuffer2.append(" does not implement LogFactory.");
                        String obj2 = stringBuffer2.toString();
                        PrintStream printStream3 = MediaBrowserCompat$ItemReceiver;
                        if (printStream3 != null) {
                            printStream3.print(IconCompatParcelizer);
                            MediaBrowserCompat$ItemReceiver.println(obj2);
                            MediaBrowserCompat$ItemReceiver.flush();
                        }
                    }
                }
            } catch (SecurityException e) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e.getMessage());
                String obj3 = stringBuffer3.toString();
                PrintStream printStream4 = MediaBrowserCompat$ItemReceiver;
                if (printStream4 != null) {
                    printStream4.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj3);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            } catch (LinkageError e2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e2.getMessage());
                String obj4 = stringBuffer4.toString();
                PrintStream printStream5 = MediaBrowserCompat$ItemReceiver;
                if (printStream5 != null) {
                    printStream5.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj4);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            } catch (ClassNotFoundException unused) {
                PrintStream printStream6 = MediaBrowserCompat$ItemReceiver;
                if (printStream6 != null) {
                    printStream6.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            }
        }
        return z;
    }

    public static boolean MediaBrowserCompat$ItemReceiver() {
        return MediaBrowserCompat$ItemReceiver != null;
    }

    protected static final void IconCompatParcelizer(String str) {
        PrintStream printStream = MediaBrowserCompat$ItemReceiver;
        if (printStream != null) {
            printStream.println(str);
            MediaBrowserCompat$ItemReceiver.flush();
        }
    }

    public static String read(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    static {
        String str;
        PrintStream printStream;
        Class cls = read;
        if (cls == null) {
            cls = write("o.PrepaidOtpActivity");
            read = cls;
        }
        ClassLoader MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(cls);
        MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver2;
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = read((Object) MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactory from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        IconCompatParcelizer = stringBuffer.toString();
        Class cls2 = read;
        if (cls2 == null) {
            cls2 = write("o.PrepaidOtpActivity");
            read = cls2;
        }
        boolean z = true;
        if (MediaBrowserCompat$ItemReceiver != null) {
            try {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer2.append(System.getProperty("java.ext.dir"));
                String obj = stringBuffer2.toString();
                PrintStream printStream2 = MediaBrowserCompat$ItemReceiver;
                if (printStream2 != null) {
                    printStream2.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[ENV] Application classpath (java.class.path): ");
                stringBuffer3.append(System.getProperty("java.class.path"));
                String obj2 = stringBuffer3.toString();
                PrintStream printStream3 = MediaBrowserCompat$ItemReceiver;
                if (printStream3 != null) {
                    printStream3.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj2);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            } catch (SecurityException unused2) {
                PrintStream printStream4 = MediaBrowserCompat$ItemReceiver;
                if (printStream4 != null) {
                    printStream4.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println("[ENV] Security setting prevent interrogation of system classpaths.");
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            }
            String name = cls2.getName();
            try {
                ClassLoader MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(cls2);
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Class ");
                stringBuffer4.append(name);
                stringBuffer4.append(" was loaded via classloader ");
                stringBuffer4.append(read((Object) MediaBrowserCompat$CustomActionResultReceiver3));
                String obj3 = stringBuffer4.toString();
                PrintStream printStream5 = MediaBrowserCompat$ItemReceiver;
                if (printStream5 != null) {
                    printStream5.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj3);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Ancestry of classloader which loaded ");
                stringBuffer5.append(name);
                stringBuffer5.append(" is ");
                read(stringBuffer5.toString(), MediaBrowserCompat$CustomActionResultReceiver3);
            } catch (SecurityException unused3) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("[ENV] Security forbids determining the classloader for ");
                stringBuffer6.append(name);
                String obj4 = stringBuffer6.toString();
                PrintStream printStream6 = MediaBrowserCompat$ItemReceiver;
                if (printStream6 != null) {
                    printStream6.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj4);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            }
        }
        if (MediaBrowserCompat$ItemReceiver == null) {
            z = false;
        }
        if (z && (printStream = MediaBrowserCompat$ItemReceiver) != null) {
            printStream.print(IconCompatParcelizer);
            MediaBrowserCompat$ItemReceiver.println("BOOTSTRAP COMPLETED");
            MediaBrowserCompat$ItemReceiver.flush();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        PrintStream printStream = MediaBrowserCompat$ItemReceiver;
        if (printStream != null) {
            printStream.print(IconCompatParcelizer);
            MediaBrowserCompat$ItemReceiver.println(str);
            MediaBrowserCompat$ItemReceiver.flush();
        }
    }

    private static final Hashtable MediaBrowserCompat$CustomActionResultReceiver() {
        String str;
        Hashtable hashtable = null;
        try {
            str = (String) AccessController.doPrivileged(new onSellButtonClick("org.apache.commons.logging.LogFactory.HashtableImpl", (String) null));
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "o.PrepaidCashOutSuccessActivity";
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable th) {
            if (th instanceof ThreadDeath) {
                throw ((ThreadDeath) th);
            } else if (th instanceof VirtualMachineError) {
                throw th;
            } else if (!"o.PrepaidCashOutSuccessActivity".equals(str)) {
                if (MediaBrowserCompat$ItemReceiver != null) {
                    PrintStream printStream = MediaBrowserCompat$ItemReceiver;
                    if (printStream != null) {
                        printStream.print(IconCompatParcelizer);
                        MediaBrowserCompat$ItemReceiver.println("[ERROR] LogFactory: Load of custom hashtable failed");
                        MediaBrowserCompat$ItemReceiver.flush();
                    }
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.Properties read(java.lang.ClassLoader r17, java.lang.String r18) {
        /*
            r0 = r18
            r3 = 0
            o.PrepaidTravelGettingStartedActivity r4 = new o.PrepaidTravelGettingStartedActivity     // Catch:{ SecurityException -> 0x0124 }
            r5 = r17
            r4.<init>(r5, r0)     // Catch:{ SecurityException -> 0x0124 }
            java.lang.Object r4 = java.security.AccessController.doPrivileged(r4)     // Catch:{ SecurityException -> 0x0124 }
            java.util.Enumeration r4 = (java.util.Enumeration) r4     // Catch:{ SecurityException -> 0x0124 }
            if (r4 != 0) goto L_0x0013
            return r3
        L_0x0013:
            r7 = r3
            r8 = 0
        L_0x0016:
            boolean r10 = r4.hasMoreElements()     // Catch:{ SecurityException -> 0x0125 }
            if (r10 == 0) goto L_0x0143
            java.lang.Object r10 = r4.nextElement()     // Catch:{ SecurityException -> 0x0125 }
            java.net.URL r10 = (java.net.URL) r10     // Catch:{ SecurityException -> 0x0125 }
            o.PrepaidTravelForeignCurrencyWalletDetailActivity r11 = new o.PrepaidTravelForeignCurrencyWalletDetailActivity     // Catch:{ SecurityException -> 0x0125 }
            r11.<init>(r10)     // Catch:{ SecurityException -> 0x0125 }
            java.lang.Object r11 = java.security.AccessController.doPrivileged(r11)     // Catch:{ SecurityException -> 0x0125 }
            java.util.Properties r11 = (java.util.Properties) r11     // Catch:{ SecurityException -> 0x0125 }
            if (r11 == 0) goto L_0x0016
            java.lang.String r12 = "priority"
            java.lang.String r13 = " with priority "
            java.lang.String r14 = "'"
            if (r3 != 0) goto L_0x0082
            java.lang.String r3 = r11.getProperty(r12)     // Catch:{ SecurityException -> 0x007e }
            if (r3 == 0) goto L_0x0043
            double r7 = java.lang.Double.parseDouble(r3)     // Catch:{ SecurityException -> 0x007e }
            r8 = r7
            goto L_0x0045
        L_0x0043:
            r8 = 0
        L_0x0045:
            java.io.PrintStream r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x007e }
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r3 == 0) goto L_0x007b
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x007e }
            r3.<init>()     // Catch:{ SecurityException -> 0x007e }
            java.lang.String r7 = "[LOOKUP] Properties file found at '"
            r3.append(r7)     // Catch:{ SecurityException -> 0x007e }
            r3.append(r10)     // Catch:{ SecurityException -> 0x007e }
            r3.append(r14)     // Catch:{ SecurityException -> 0x007e }
            r3.append(r13)     // Catch:{ SecurityException -> 0x007e }
            r3.append(r8)     // Catch:{ SecurityException -> 0x007e }
            java.lang.String r3 = r3.toString()     // Catch:{ SecurityException -> 0x007e }
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x007e }
            if (r7 == 0) goto L_0x007b
            java.lang.String r12 = IconCompatParcelizer     // Catch:{ SecurityException -> 0x007e }
            r7.print(r12)     // Catch:{ SecurityException -> 0x007e }
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x007e }
            r7.println(r3)     // Catch:{ SecurityException -> 0x007e }
            java.io.PrintStream r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x007e }
            r3.flush()     // Catch:{ SecurityException -> 0x007e }
        L_0x007b:
            r7 = r10
            r3 = r11
            goto L_0x0016
        L_0x007e:
            r7 = r10
            r3 = r11
            goto L_0x0125
        L_0x0082:
            java.lang.String r12 = r11.getProperty(r12)     // Catch:{ SecurityException -> 0x0125 }
            if (r12 == 0) goto L_0x008e
            double r15 = java.lang.Double.parseDouble(r12)     // Catch:{ SecurityException -> 0x0125 }
            r1 = r15
            goto L_0x0090
        L_0x008e:
            r1 = 0
        L_0x0090:
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            java.lang.String r5 = "[LOOKUP] Properties file at '"
            if (r16 <= 0) goto L_0x00dd
            java.io.PrintStream r6 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0125 }
            if (r6 == 0) goto L_0x009c
            r6 = 1
            goto L_0x009d
        L_0x009c:
            r6 = 0
        L_0x009d:
            if (r6 == 0) goto L_0x00db
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x0125 }
            r6.<init>()     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r5)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r10)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r14)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r13)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r1)     // Catch:{ SecurityException -> 0x0125 }
            java.lang.String r5 = " overrides file at '"
            r6.append(r5)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r7)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r14)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r13)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r8)     // Catch:{ SecurityException -> 0x0125 }
            java.lang.String r5 = r6.toString()     // Catch:{ SecurityException -> 0x0125 }
            java.io.PrintStream r6 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0125 }
            if (r6 == 0) goto L_0x00db
            java.lang.String r8 = IconCompatParcelizer     // Catch:{ SecurityException -> 0x0125 }
            r6.print(r8)     // Catch:{ SecurityException -> 0x0125 }
            java.io.PrintStream r6 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0125 }
            r6.println(r5)     // Catch:{ SecurityException -> 0x0125 }
            java.io.PrintStream r5 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0125 }
            r5.flush()     // Catch:{ SecurityException -> 0x0125 }
        L_0x00db:
            r8 = r1
            goto L_0x007b
        L_0x00dd:
            java.io.PrintStream r6 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0125 }
            if (r6 == 0) goto L_0x00e3
            r6 = 1
            goto L_0x00e4
        L_0x00e3:
            r6 = 0
        L_0x00e4:
            if (r6 == 0) goto L_0x0016
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x0125 }
            r6.<init>()     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r5)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r10)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r14)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r13)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r1)     // Catch:{ SecurityException -> 0x0125 }
            java.lang.String r1 = " does not override file at '"
            r6.append(r1)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r7)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r14)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r13)     // Catch:{ SecurityException -> 0x0125 }
            r6.append(r8)     // Catch:{ SecurityException -> 0x0125 }
            java.lang.String r1 = r6.toString()     // Catch:{ SecurityException -> 0x0125 }
            java.io.PrintStream r2 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0125 }
            if (r2 == 0) goto L_0x0016
            java.lang.String r5 = IconCompatParcelizer     // Catch:{ SecurityException -> 0x0125 }
            r2.print(r5)     // Catch:{ SecurityException -> 0x0125 }
            java.io.PrintStream r2 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0125 }
            r2.println(r1)     // Catch:{ SecurityException -> 0x0125 }
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0125 }
            r1.flush()     // Catch:{ SecurityException -> 0x0125 }
            goto L_0x0016
        L_0x0124:
            r7 = r3
        L_0x0125:
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x012b
            r1 = 1
            goto L_0x012c
        L_0x012b:
            r1 = 0
        L_0x012c:
            if (r1 == 0) goto L_0x0143
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x0143
            java.lang.String r2 = IconCompatParcelizer
            r1.print(r2)
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = "SecurityException thrown while trying to find/read config files."
            r1.println(r2)
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            r1.flush()
        L_0x0143:
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x0149
            r1 = 1
            goto L_0x014a
        L_0x0149:
            r1 = 0
        L_0x014a:
            if (r1 == 0) goto L_0x01a9
            if (r3 != 0) goto L_0x0178
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LOOKUP] No properties file of name '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "' found."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x01a9
            java.lang.String r2 = IconCompatParcelizer
            r1.print(r2)
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            r1.println(r0)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            r0.flush()
            goto L_0x01a9
        L_0x0178:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LOOKUP] Properties file of name '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "' found at '"
            r1.append(r0)
            r1.append(r7)
            r0 = 34
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x01a9
            java.lang.String r2 = IconCompatParcelizer
            r1.print(r2)
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            r1.println(r0)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            r0.flush()
        L_0x01a9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidOtpActivity.read(java.lang.ClassLoader, java.lang.String):java.util.Properties");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x01d5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p040o.PrepaidOtpActivity read() throws org.apache.commons.logging.LogConfigurationException {
        /*
            java.lang.String r0 = "META-INF/services/org.apache.commons.logging.LogFactory"
            java.lang.String r1 = "]. Trying alternative implementations..."
            java.lang.String r2 = "[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: ["
            java.lang.String r3 = "o.PrepaidOtpActivity"
            o.PrepaidTravelCoachMarkActivity r4 = new o.PrepaidTravelCoachMarkActivity
            r4.<init>()
            java.lang.Object r4 = java.security.AccessController.doPrivileged(r4)
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x0035
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver
            if (r7 == 0) goto L_0x001d
            r7 = r5
            goto L_0x001e
        L_0x001d:
            r7 = r6
        L_0x001e:
            if (r7 == 0) goto L_0x0035
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver
            if (r7 == 0) goto L_0x0035
            java.lang.String r8 = IconCompatParcelizer
            r7.print(r8)
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver
            java.lang.String r8 = "Context classloader is null."
            r7.println(r8)
            java.io.PrintStream r7 = MediaBrowserCompat$ItemReceiver
            r7.flush()
        L_0x0035:
            if (r4 != 0) goto L_0x003a
            o.PrepaidOtpActivity r7 = write
            goto L_0x0042
        L_0x003a:
            java.util.Hashtable r7 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r7 = r7.get(r4)
            o.PrepaidOtpActivity r7 = (p040o.PrepaidOtpActivity) r7
        L_0x0042:
            if (r7 == 0) goto L_0x0045
            return r7
        L_0x0045:
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver
            if (r8 == 0) goto L_0x004b
            r8 = r5
            goto L_0x004c
        L_0x004b:
            r8 = r6
        L_0x004c:
            if (r8 == 0) goto L_0x007b
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            java.lang.String r9 = "[LOOKUP] LogFactory implementation requested for the first time for context classloader "
            r8.append(r9)
            java.lang.String r9 = read((java.lang.Object) r4)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.io.PrintStream r9 = MediaBrowserCompat$ItemReceiver
            if (r9 == 0) goto L_0x0076
            java.lang.String r10 = IconCompatParcelizer
            r9.print(r10)
            java.io.PrintStream r9 = MediaBrowserCompat$ItemReceiver
            r9.println(r8)
            java.io.PrintStream r8 = MediaBrowserCompat$ItemReceiver
            r8.flush()
        L_0x0076:
            java.lang.String r8 = "[LOOKUP] "
            read((java.lang.String) r8, (java.lang.ClassLoader) r4)
        L_0x007b:
            java.lang.String r8 = "commons-logging.properties"
            java.util.Properties r8 = read((java.lang.ClassLoader) r4, (java.lang.String) r8)
            if (r8 == 0) goto L_0x0098
            java.lang.String r9 = "use_tccl"
            java.lang.String r9 = r8.getProperty(r9)
            if (r9 == 0) goto L_0x0098
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0098
            java.lang.ClassLoader r9 = MediaBrowserCompat$MediaItem
            goto L_0x0099
        L_0x0098:
            r9 = r4
        L_0x0099:
            java.io.PrintStream r10 = MediaBrowserCompat$ItemReceiver
            if (r10 == 0) goto L_0x009f
            r10 = r5
            goto L_0x00a0
        L_0x009f:
            r10 = r6
        L_0x00a0:
            if (r10 == 0) goto L_0x00b7
            java.io.PrintStream r10 = MediaBrowserCompat$ItemReceiver
            if (r10 == 0) goto L_0x00b7
            java.lang.String r11 = IconCompatParcelizer
            r10.print(r11)
            java.io.PrintStream r10 = MediaBrowserCompat$ItemReceiver
            java.lang.String r11 = "[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            r10.println(r11)
            java.io.PrintStream r10 = MediaBrowserCompat$ItemReceiver
            r10.flush()
        L_0x00b7:
            r10 = 0
            o.onSellButtonClick r11 = new o.onSellButtonClick     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r11.<init>(r3, r10)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.lang.Object r11 = java.security.AccessController.doPrivileged(r11)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            if (r11 == 0) goto L_0x0100
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            if (r12 == 0) goto L_0x00cb
            r12 = r5
            goto L_0x00cc
        L_0x00cb:
            r12 = r6
        L_0x00cc:
            if (r12 == 0) goto L_0x00fa
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r12.<init>()     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.lang.String r13 = "[LOOKUP] Creating an instance of LogFactory class '"
            r12.append(r13)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r12.append(r11)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.lang.String r13 = "' as specified by system property "
            r12.append(r13)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r12.append(r3)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.lang.String r12 = r12.toString()     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.io.PrintStream r13 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            if (r13 == 0) goto L_0x00fa
            java.lang.String r14 = IconCompatParcelizer     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r13.print(r14)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.io.PrintStream r13 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r13.println(r12)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r12.flush()     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
        L_0x00fa:
            o.PrepaidOtpActivity r7 = IconCompatParcelizer(r11, r9, r4)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            goto L_0x019b
        L_0x0100:
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            if (r11 == 0) goto L_0x0106
            r11 = r5
            goto L_0x0107
        L_0x0106:
            r11 = r6
        L_0x0107:
            if (r11 == 0) goto L_0x019b
            java.lang.String r11 = "[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined."
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            if (r12 == 0) goto L_0x019b
            java.lang.String r13 = IconCompatParcelizer     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r12.print(r13)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r12.println(r11)     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            r11.flush()     // Catch:{ SecurityException -> 0x0122, RuntimeException -> 0x0120 }
            goto L_0x019b
        L_0x0120:
            r0 = move-exception
            goto L_0x0124
        L_0x0122:
            r11 = move-exception
            goto L_0x0161
        L_0x0124:
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r5 = r6
        L_0x012a:
            if (r5 == 0) goto L_0x0160
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: ["
            r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            if (r2 != 0) goto L_0x013d
            goto L_0x0141
        L_0x013d:
            java.lang.String r10 = r2.trim()
        L_0x0141:
            r1.append(r10)
            java.lang.String r2 = "] as specified by a system property."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.PrintStream r2 = MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x0160
            java.lang.String r3 = IconCompatParcelizer
            r2.print(r3)
            java.io.PrintStream r2 = MediaBrowserCompat$ItemReceiver
            r2.println(r1)
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            r1.flush()
        L_0x0160:
            throw r0
        L_0x0161:
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver
            if (r12 == 0) goto L_0x0167
            r12 = r5
            goto L_0x0168
        L_0x0167:
            r12 = r6
        L_0x0168:
            if (r12 == 0) goto L_0x019b
            java.lang.StringBuffer r12 = new java.lang.StringBuffer
            r12.<init>()
            r12.append(r2)
            java.lang.String r11 = r11.getMessage()
            if (r11 != 0) goto L_0x017a
            r11 = r10
            goto L_0x017e
        L_0x017a:
            java.lang.String r11 = r11.trim()
        L_0x017e:
            r12.append(r11)
            r12.append(r1)
            java.lang.String r11 = r12.toString()
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver
            if (r12 == 0) goto L_0x019b
            java.lang.String r13 = IconCompatParcelizer
            r12.print(r13)
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver
            r12.println(r11)
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver
            r11.flush()
        L_0x019b:
            if (r7 != 0) goto L_0x0289
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver
            if (r11 == 0) goto L_0x01a3
            r11 = r5
            goto L_0x01a4
        L_0x01a3:
            r11 = r6
        L_0x01a4:
            if (r11 == 0) goto L_0x01bb
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver
            if (r11 == 0) goto L_0x01bb
            java.lang.String r12 = IconCompatParcelizer
            r11.print(r12)
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver
            java.lang.String r12 = "[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use..."
            r11.println(r12)
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver
            r11.flush()
        L_0x01bb:
            o.onBuyButtonClick r11 = new o.onBuyButtonClick     // Catch:{ Exception -> 0x024f }
            r11.<init>(r4, r0)     // Catch:{ Exception -> 0x024f }
            java.lang.Object r11 = java.security.AccessController.doPrivileged(r11)     // Catch:{ Exception -> 0x024f }
            java.io.InputStream r11 = (java.io.InputStream) r11     // Catch:{ Exception -> 0x024f }
            if (r11 == 0) goto L_0x0230
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x01d5 }
            java.io.InputStreamReader r13 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x01d5 }
            java.lang.String r14 = "UTF-8"
            r13.<init>(r11, r14)     // Catch:{ UnsupportedEncodingException -> 0x01d5 }
            r12.<init>(r13)     // Catch:{ UnsupportedEncodingException -> 0x01d5 }
            goto L_0x01e0
        L_0x01d5:
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x024f }
            r12.<init>(r11)     // Catch:{ Exception -> 0x024f }
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Exception -> 0x024f }
            r11.<init>(r12)     // Catch:{ Exception -> 0x024f }
            r12 = r11
        L_0x01e0:
            java.lang.String r11 = r12.readLine()     // Catch:{ Exception -> 0x024f }
            r12.close()     // Catch:{ Exception -> 0x024f }
            if (r11 == 0) goto L_0x0289
            java.lang.String r12 = ""
            boolean r12 = r12.equals(r11)     // Catch:{ Exception -> 0x024f }
            if (r12 != 0) goto L_0x0289
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x024f }
            if (r12 == 0) goto L_0x01f7
            r12 = r5
            goto L_0x01f8
        L_0x01f7:
            r12 = r6
        L_0x01f8:
            if (r12 == 0) goto L_0x022b
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x024f }
            r12.<init>()     // Catch:{ Exception -> 0x024f }
            java.lang.String r13 = "[LOOKUP]  Creating an instance of LogFactory class "
            r12.append(r13)     // Catch:{ Exception -> 0x024f }
            r12.append(r11)     // Catch:{ Exception -> 0x024f }
            java.lang.String r13 = " as specified by file '"
            r12.append(r13)     // Catch:{ Exception -> 0x024f }
            r12.append(r0)     // Catch:{ Exception -> 0x024f }
            java.lang.String r0 = "' which was present in the path of the context classloader."
            r12.append(r0)     // Catch:{ Exception -> 0x024f }
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x024f }
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x024f }
            if (r12 == 0) goto L_0x022b
            java.lang.String r13 = IconCompatParcelizer     // Catch:{ Exception -> 0x024f }
            r12.print(r13)     // Catch:{ Exception -> 0x024f }
            java.io.PrintStream r12 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x024f }
            r12.println(r0)     // Catch:{ Exception -> 0x024f }
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x024f }
            r0.flush()     // Catch:{ Exception -> 0x024f }
        L_0x022b:
            o.PrepaidOtpActivity r7 = IconCompatParcelizer(r11, r9, r4)     // Catch:{ Exception -> 0x024f }
            goto L_0x0289
        L_0x0230:
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x024f }
            if (r0 == 0) goto L_0x0236
            r0 = r5
            goto L_0x0237
        L_0x0236:
            r0 = r6
        L_0x0237:
            if (r0 == 0) goto L_0x0289
            java.lang.String r0 = "[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found."
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x024f }
            if (r11 == 0) goto L_0x0289
            java.lang.String r12 = IconCompatParcelizer     // Catch:{ Exception -> 0x024f }
            r11.print(r12)     // Catch:{ Exception -> 0x024f }
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x024f }
            r11.println(r0)     // Catch:{ Exception -> 0x024f }
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x024f }
            r0.flush()     // Catch:{ Exception -> 0x024f }
            goto L_0x0289
        L_0x024f:
            r0 = move-exception
            java.io.PrintStream r11 = MediaBrowserCompat$ItemReceiver
            if (r11 == 0) goto L_0x0256
            r11 = r5
            goto L_0x0257
        L_0x0256:
            r11 = r6
        L_0x0257:
            if (r11 == 0) goto L_0x0289
            java.lang.StringBuffer r11 = new java.lang.StringBuffer
            r11.<init>()
            r11.append(r2)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0268
            goto L_0x026c
        L_0x0268:
            java.lang.String r10 = r0.trim()
        L_0x026c:
            r11.append(r10)
            r11.append(r1)
            java.lang.String r0 = r11.toString()
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x0289
            java.lang.String r2 = IconCompatParcelizer
            r1.print(r2)
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            r1.println(r0)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            r0.flush()
        L_0x0289:
            if (r7 != 0) goto L_0x0325
            if (r8 == 0) goto L_0x0307
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0293
            r0 = r5
            goto L_0x0294
        L_0x0293:
            r0 = r6
        L_0x0294:
            if (r0 == 0) goto L_0x02ab
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x02ab
            java.lang.String r1 = IconCompatParcelizer
            r0.print(r1)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = "[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use..."
            r0.println(r1)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            r0.flush()
        L_0x02ab:
            java.lang.String r0 = r8.getProperty(r3)
            if (r0 == 0) goto L_0x02e8
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x02b7
            r1 = r5
            goto L_0x02b8
        L_0x02b7:
            r1 = r6
        L_0x02b8:
            if (r1 == 0) goto L_0x02e3
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "[LOOKUP] Properties file specifies LogFactory subclass '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.PrintStream r2 = MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x02e3
            java.lang.String r3 = IconCompatParcelizer
            r2.print(r3)
            java.io.PrintStream r2 = MediaBrowserCompat$ItemReceiver
            r2.println(r1)
            java.io.PrintStream r1 = MediaBrowserCompat$ItemReceiver
            r1.flush()
        L_0x02e3:
            o.PrepaidOtpActivity r7 = IconCompatParcelizer(r0, r9, r4)
            goto L_0x0325
        L_0x02e8:
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x02ee
            r0 = r5
            goto L_0x02ef
        L_0x02ee:
            r0 = r6
        L_0x02ef:
            if (r0 == 0) goto L_0x0325
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0325
            java.lang.String r1 = IconCompatParcelizer
            r0.print(r1)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = "[LOOKUP] Properties file has no entry specifying LogFactory subclass."
            r0.println(r1)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            r0.flush()
            goto L_0x0325
        L_0x0307:
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x030d
            r0 = r5
            goto L_0x030e
        L_0x030d:
            r0 = r6
        L_0x030e:
            if (r0 == 0) goto L_0x0325
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0325
            java.lang.String r1 = IconCompatParcelizer
            r0.print(r1)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = "[LOOKUP] No properties file available to determine LogFactory subclass from.."
            r0.println(r1)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            r0.flush()
        L_0x0325:
            if (r7 != 0) goto L_0x034c
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x032c
            goto L_0x032d
        L_0x032c:
            r5 = r6
        L_0x032d:
            if (r5 == 0) goto L_0x0344
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0344
            java.lang.String r1 = IconCompatParcelizer
            r0.print(r1)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = "[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader)."
            r0.println(r1)
            java.io.PrintStream r0 = MediaBrowserCompat$ItemReceiver
            r0.flush()
        L_0x0344:
            java.lang.ClassLoader r0 = MediaBrowserCompat$MediaItem
            java.lang.String r1 = "o.PrepaidTravelGettingStartedActivity_ViewBinding"
            o.PrepaidOtpActivity r7 = IconCompatParcelizer(r1, r0, r4)
        L_0x034c:
            if (r7 == 0) goto L_0x0374
            if (r7 == 0) goto L_0x035a
            if (r4 != 0) goto L_0x0355
            write = r7
            goto L_0x035a
        L_0x0355:
            java.util.Hashtable r0 = MediaBrowserCompat$CustomActionResultReceiver
            r0.put(r4, r7)
        L_0x035a:
            if (r8 == 0) goto L_0x0374
            java.util.Enumeration r0 = r8.propertyNames()
        L_0x0360:
            boolean r1 = r0.hasMoreElements()
            if (r1 == 0) goto L_0x0374
            java.lang.Object r1 = r0.nextElement()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r8.getProperty(r1)
            r7.MediaBrowserCompat$ItemReceiver(r1, r2)
            goto L_0x0360
        L_0x0374:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidOtpActivity.read():o.PrepaidOtpActivity");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.PrintStream IconCompatParcelizer() {
        /*
            r0 = 0
            java.lang.String r1 = "org.apache.commons.logging.diagnostics.dest"
            o.onSellButtonClick r2 = new o.onSellButtonClick     // Catch:{ SecurityException -> 0x0033 }
            r2.<init>(r1, r0)     // Catch:{ SecurityException -> 0x0033 }
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r2)     // Catch:{ SecurityException -> 0x0033 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ SecurityException -> 0x0033 }
            if (r1 != 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.String r2 = "STDOUT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x001c
            java.io.PrintStream r0 = java.lang.System.out
            return r0
        L_0x001c:
            java.lang.String r2 = "STDERR"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0027
            java.io.PrintStream r0 = java.lang.System.err
            return r0
        L_0x0027:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{  }
            r3 = 1
            r2.<init>(r1, r3)     // Catch:{  }
            java.io.PrintStream r1 = new java.io.PrintStream     // Catch:{  }
            r1.<init>(r2)     // Catch:{  }
            return r1
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidOtpActivity.IconCompatParcelizer():java.io.PrintStream");
    }

    private static void read(String str, ClassLoader classLoader) {
        if (MediaBrowserCompat$ItemReceiver != null) {
            if (classLoader != null) {
                String obj = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(read((Object) classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(obj);
                stringBuffer.append("'");
                String obj2 = stringBuffer.toString();
                PrintStream printStream = MediaBrowserCompat$ItemReceiver;
                if (printStream != null) {
                    printStream.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj2);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(read((Object) classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    String obj3 = stringBuffer3.toString();
                    PrintStream printStream2 = MediaBrowserCompat$ItemReceiver;
                    if (printStream2 != null) {
                        printStream2.print(IconCompatParcelizer);
                        MediaBrowserCompat$ItemReceiver.println(obj3);
                        MediaBrowserCompat$ItemReceiver.flush();
                    }
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                String obj4 = stringBuffer4.toString();
                PrintStream printStream3 = MediaBrowserCompat$ItemReceiver;
                if (printStream3 != null) {
                    printStream3.print(IconCompatParcelizer);
                    MediaBrowserCompat$ItemReceiver.println(obj4);
                    MediaBrowserCompat$ItemReceiver.flush();
                }
            }
        }
    }
}
