package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.security.AccessController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/* renamed from: o.PrepaidCashOutReviewActivity */
public class PrepaidCashOutReviewActivity implements PrepaidTravelCoachMarkActivity_ViewBinding, Serializable {
    private static DateFormat IconCompatParcelizer = null;
    private static volatile String MediaBrowserCompat$CustomActionResultReceiver = null;
    private static /* synthetic */ Class MediaBrowserCompat$ItemReceiver = null;
    private static Properties MediaDescriptionCompat = new Properties();
    private static volatile boolean MediaMetadataCompat = false;
    private static volatile boolean RatingCompat = false;
    private static /* synthetic */ Class read = null;
    private static volatile boolean write = false;
    private volatile String MediaBrowserCompat$MediaItem;
    private volatile int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private volatile String f5516x50fd9e4a;

    public final boolean IconCompatParcelizer() {
        return true;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return true;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return true;
    }

    public final boolean read() {
        return true;
    }

    static {
        RatingCompat = false;
        MediaMetadataCompat = true;
        write = false;
        MediaBrowserCompat$CustomActionResultReceiver = "yyyy/MM/dd HH:mm:ss:SSS zzz";
        IconCompatParcelizer = null;
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrepaidCashOutLandingAndInputActivity_ViewBinding("simplelog.properties"));
        if (inputStream != null) {
            try {
                MediaDescriptionCompat.load(inputStream);
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        boolean z = RatingCompat;
        String MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver("org.apache.commons.logging.simplelog.showlogname");
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            z = "true".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver2);
        }
        RatingCompat = z;
        boolean z2 = MediaMetadataCompat;
        String MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver("org.apache.commons.logging.simplelog.showShortLogname");
        if (MediaBrowserCompat$CustomActionResultReceiver3 != null) {
            z2 = "true".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver3);
        }
        MediaMetadataCompat = z2;
        boolean z3 = write;
        String MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver("org.apache.commons.logging.simplelog.showdatetime");
        if (MediaBrowserCompat$CustomActionResultReceiver4 != null) {
            z3 = "true".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver4);
        }
        write = z3;
        if (z3) {
            String str = MediaBrowserCompat$CustomActionResultReceiver;
            String MediaBrowserCompat$CustomActionResultReceiver5 = MediaBrowserCompat$CustomActionResultReceiver("org.apache.commons.logging.simplelog.dateTimeFormat");
            if (MediaBrowserCompat$CustomActionResultReceiver5 != null) {
                str = MediaBrowserCompat$CustomActionResultReceiver5;
            }
            MediaBrowserCompat$CustomActionResultReceiver = str;
            try {
                IconCompatParcelizer = new SimpleDateFormat(MediaBrowserCompat$CustomActionResultReceiver);
            } catch (IllegalArgumentException unused2) {
                MediaBrowserCompat$CustomActionResultReceiver = "yyyy/MM/dd HH:mm:ss:SSS zzz";
                IconCompatParcelizer = new SimpleDateFormat(MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        return str2 == null ? MediaDescriptionCompat.getProperty(str) : str2;
    }

    private void write(int i, Object obj, Throwable th) {
        String format;
        StringBuffer stringBuffer = new StringBuffer();
        if (write) {
            Date date = new Date();
            synchronized (IconCompatParcelizer) {
                format = IconCompatParcelizer.format(date);
            }
            stringBuffer.append(format);
            stringBuffer.append(" ");
        }
        switch (i) {
            case 1:
                stringBuffer.append("[TRACE] ");
                break;
            case 2:
                stringBuffer.append("[DEBUG] ");
                break;
            case 3:
                stringBuffer.append("[INFO] ");
                break;
            case 4:
                stringBuffer.append("[WARN] ");
                break;
            case 5:
                stringBuffer.append("[ERROR] ");
                break;
            case 6:
                stringBuffer.append("[FATAL] ");
                break;
        }
        if (MediaMetadataCompat) {
            if (this.f5516x50fd9e4a == null) {
                String substring = this.MediaBrowserCompat$MediaItem.substring(this.MediaBrowserCompat$MediaItem.lastIndexOf(".") + 1);
                this.f5516x50fd9e4a = substring.substring(substring.lastIndexOf("/") + 1);
            }
            stringBuffer.append(String.valueOf(this.f5516x50fd9e4a));
            stringBuffer.append(" - ");
        } else if (RatingCompat) {
            stringBuffer.append(String.valueOf(this.MediaBrowserCompat$MediaItem));
            stringBuffer.append(" - ");
        }
        stringBuffer.append(String.valueOf(obj));
        if (th != null) {
            stringBuffer.append(" <");
            stringBuffer.append(th.toString());
            stringBuffer.append(">");
            StringWriter stringWriter = new StringWriter(1024);
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
        }
        System.err.println(stringBuffer.toString());
    }

    public final void write(Object obj) {
        write(2, obj, (Throwable) null);
    }

    public final void IconCompatParcelizer(Object obj, Throwable th) {
        write(2, obj, th);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        write(3, obj, (Throwable) null);
    }

    public final void IconCompatParcelizer(Object obj) {
        write(4, obj, (Throwable) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj, Throwable th) {
        write(4, obj, th);
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        write(5, obj, (Throwable) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.ClassLoader MediaBrowserCompat$SearchResultReceiver() {
        /*
            r0 = 0
            java.lang.Class r1 = read     // Catch:{ NoSuchMethodException -> 0x0038 }
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "java.lang.Thread"
            java.lang.Class r1 = read(r1)     // Catch:{ NoSuchMethodException -> 0x0038 }
            read = r1     // Catch:{ NoSuchMethodException -> 0x0038 }
            goto L_0x0010
        L_0x000e:
            java.lang.Class r1 = read     // Catch:{ NoSuchMethodException -> 0x0038 }
        L_0x0010:
            java.lang.String r2 = "getContextClassLoader"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch:{ NoSuchMethodException -> 0x0038 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch:{ InvocationTargetException -> 0x0022, NoSuchMethodException -> 0x0038 }
            r0 = r1
            goto L_0x0038
        L_0x0022:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getTargetException()     // Catch:{ NoSuchMethodException -> 0x0038 }
            boolean r2 = r2 instanceof java.lang.SecurityException     // Catch:{ NoSuchMethodException -> 0x0038 }
            if (r2 == 0) goto L_0x002c
            goto L_0x0038
        L_0x002c:
            org.apache.commons.logging.LogConfigurationException r2 = new org.apache.commons.logging.LogConfigurationException     // Catch:{ NoSuchMethodException -> 0x0038 }
            java.lang.String r3 = "Unexpected InvocationTargetException"
            java.lang.Throwable r1 = r1.getTargetException()     // Catch:{ NoSuchMethodException -> 0x0038 }
            r2.<init>(r3, r1)     // Catch:{ NoSuchMethodException -> 0x0038 }
            throw r2     // Catch:{ NoSuchMethodException -> 0x0038 }
        L_0x0038:
            if (r0 != 0) goto L_0x004a
            java.lang.Class r0 = MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "o.PrepaidCashOutReviewActivity"
            java.lang.Class r0 = read(r0)
            MediaBrowserCompat$ItemReceiver = r0
        L_0x0046:
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidCashOutReviewActivity.MediaBrowserCompat$SearchResultReceiver():java.lang.ClassLoader");
    }

    private static /* synthetic */ Class read(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }
}
