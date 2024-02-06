package p040o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.util.Hashtable;
import org.apache.commons.logging.LogConfigurationException;

/* renamed from: o.PrepaidTravelGettingStartedActivity_ViewBinding */
public class PrepaidTravelGettingStartedActivity_ViewBinding extends PrepaidOtpActivity {
    private static /* synthetic */ Class IconCompatParcelizer;
    private static /* synthetic */ Class MediaBrowserCompat$CustomActionResultReceiver;
    private static final String[] MediaBrowserCompat$ItemReceiver = {"o.PrepaidCashOutLandingAndInputActivity", "o.PrepaidTravelTopupLandingActivity", "o.PrepaidTravelForeignCurrencyWalletDetailActivity_ViewBinding", "o.PrepaidCashOutReviewActivity"};
    private static /* synthetic */ Class read;
    private static /* synthetic */ Class write;
    private boolean Keep = true;
    private String MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private Constructor f5517x50fd9e4a = null;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private Method MediaSessionCompat$QueueItem;
    private Hashtable MediaSessionCompat$ResultReceiverWrapper = new Hashtable();
    private Class[] MediaSessionCompat$Token;
    private Class[] ParcelableVolumeInfo;
    private Hashtable RatingCompat = new Hashtable();

    public PrepaidTravelGettingStartedActivity_ViewBinding() {
        String str;
        Class[] clsArr = new Class[1];
        Class cls = MediaBrowserCompat$CustomActionResultReceiver;
        if (cls == null) {
            cls = write("java.lang.String");
            MediaBrowserCompat$CustomActionResultReceiver = cls;
        }
        clsArr[0] = cls;
        this.MediaSessionCompat$Token = clsArr;
        this.MediaSessionCompat$QueueItem = null;
        Class[] clsArr2 = new Class[1];
        Class cls2 = IconCompatParcelizer;
        if (cls2 == null) {
            cls2 = write("o.PrepaidOtpActivity");
            IconCompatParcelizer = cls2;
        }
        clsArr2[0] = cls2;
        this.ParcelableVolumeInfo = clsArr2;
        ClassLoader MediaBrowserCompat$CustomActionResultReceiver2 = PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver((Class) getClass());
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
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        this.MediaBrowserCompat$MediaItem = stringBuffer.toString();
        if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
            MediaDescriptionCompat("Instance created.");
        }
    }

    private static /* synthetic */ Class write(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public final PrepaidTravelCoachMarkActivity_ViewBinding read(Class cls) throws LogConfigurationException {
        return MediaBrowserCompat$ItemReceiver(cls.getName());
    }

    public final PrepaidTravelCoachMarkActivity_ViewBinding MediaBrowserCompat$ItemReceiver(String str) throws LogConfigurationException {
        PrepaidTravelCoachMarkActivity_ViewBinding prepaidTravelCoachMarkActivity_ViewBinding = (PrepaidTravelCoachMarkActivity_ViewBinding) this.MediaSessionCompat$ResultReceiverWrapper.get(str);
        if (prepaidTravelCoachMarkActivity_ViewBinding != null) {
            return prepaidTravelCoachMarkActivity_ViewBinding;
        }
        PrepaidTravelCoachMarkActivity_ViewBinding RatingCompat2 = RatingCompat(str);
        this.MediaSessionCompat$ResultReceiverWrapper.put(str, RatingCompat2);
        return RatingCompat2;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, Object obj) {
        if (this.f5517x50fd9e4a != null) {
            MediaDescriptionCompat("setAttribute: call too late; configuration already performed.");
        }
        if (obj == null) {
            this.RatingCompat.remove(str);
        } else {
            this.RatingCompat.put(str, obj);
        }
        if (str.equals("use_tccl")) {
            this.Keep = obj != null && Boolean.valueOf(obj.toString()).booleanValue();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5 A[Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7 A[Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.PrepaidTravelCoachMarkActivity_ViewBinding RatingCompat(java.lang.String r7) throws org.apache.commons.logging.LogConfigurationException {
        /*
            r6 = this;
            java.lang.reflect.Constructor r0 = r6.f5517x50fd9e4a     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x00cf
            boolean r0 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "Discovering a Log implementation..."
            r6.MediaDescriptionCompat(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x0011:
            java.lang.String r0 = "org.apache.commons.logging.Log.allowFlawedContext"
            java.lang.String r0 = r6.MediaBrowserCompat$SearchResultReceiver(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r0 != 0) goto L_0x001b
            r0 = r2
            goto L_0x0023
        L_0x001b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            boolean r0 = r0.booleanValue()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x0023:
            r6.MediaDescriptionCompat = r0     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = "org.apache.commons.logging.Log.allowFlawedDiscovery"
            java.lang.String r0 = r6.MediaBrowserCompat$SearchResultReceiver(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r0 != 0) goto L_0x002f
            r0 = r2
            goto L_0x0037
        L_0x002f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            boolean r0 = r0.booleanValue()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x0037:
            r6.MediaBrowserCompat$SearchResultReceiver = r0     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = "org.apache.commons.logging.Log.allowFlawedHierarchy"
            java.lang.String r0 = r6.MediaBrowserCompat$SearchResultReceiver(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r0 != 0) goto L_0x0043
            r0 = r2
            goto L_0x004b
        L_0x0043:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            boolean r0 = r0.booleanValue()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x004b:
            r6.MediaMetadataCompat = r0     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r0 = 0
            java.lang.String r3 = r6.IconCompatParcelizer()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r3 == 0) goto L_0x00a7
            boolean r0 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r0 == 0) goto L_0x0073
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r0.<init>()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r4 = "Attempting to load user-specified log class '"
            r0.append(r4)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r0.append(r3)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r4 = "'..."
            r0.append(r4)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = r0.toString()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r6.MediaDescriptionCompat(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x0073:
            o.PrepaidTravelCoachMarkActivity_ViewBinding r7 = r6.IconCompatParcelizer(r3, r7)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r7 == 0) goto L_0x007a
            goto L_0x00db
        L_0x007a:
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = "User-specified log class '"
            r7.<init>(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r7.append(r3)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = "' cannot be found or is not useable."
            r7.append(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = "o.PrepaidCashOutLandingAndInputActivity"
            MediaBrowserCompat$CustomActionResultReceiver(r7, r3, r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = "o.PrepaidTravelTopupLandingActivity"
            MediaBrowserCompat$CustomActionResultReceiver(r7, r3, r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = "o.PrepaidTravelForeignCurrencyWalletDetailActivity_ViewBinding"
            MediaBrowserCompat$CustomActionResultReceiver(r7, r3, r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = "o.PrepaidCashOutReviewActivity"
            MediaBrowserCompat$CustomActionResultReceiver(r7, r3, r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            org.apache.commons.logging.LogConfigurationException r0 = new org.apache.commons.logging.LogConfigurationException     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r7 = r7.toString()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r0.<init>((java.lang.String) r7)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            throw r0     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x00a7:
            boolean r3 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r3 == 0) goto L_0x00b2
            java.lang.String r3 = "No user-specified Log implementation; performing discovery using the standard supported logging implementations..."
            r6.MediaDescriptionCompat(r3)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x00b2:
            r3 = r1
        L_0x00b3:
            java.lang.String[] r4 = MediaBrowserCompat$ItemReceiver     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            int r5 = r4.length     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r3 >= r5) goto L_0x00c3
            if (r0 != 0) goto L_0x00c3
            r0 = r4[r3]     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            o.PrepaidTravelCoachMarkActivity_ViewBinding r0 = r6.IconCompatParcelizer(r0, r7)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            int r3 = r3 + 1
            goto L_0x00b3
        L_0x00c3:
            if (r0 == 0) goto L_0x00c7
            r7 = r0
            goto L_0x00db
        L_0x00c7:
            org.apache.commons.logging.LogConfigurationException r7 = new org.apache.commons.logging.LogConfigurationException     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.String r0 = "No suitable Log implementation"
            r7.<init>((java.lang.String) r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            throw r7     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x00cf:
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r0[r1] = r7     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.reflect.Constructor r7 = r6.f5517x50fd9e4a     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.Object r7 = r7.newInstance(r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            o.PrepaidTravelCoachMarkActivity_ViewBinding r7 = (p040o.PrepaidTravelCoachMarkActivity_ViewBinding) r7     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x00db:
            java.lang.reflect.Method r0 = r6.MediaSessionCompat$QueueItem     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            if (r0 == 0) goto L_0x00e8
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r0[r1] = r6     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            java.lang.reflect.Method r1 = r6.MediaSessionCompat$QueueItem     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
            r1.invoke(r7, r0)     // Catch:{ LogConfigurationException -> 0x010c, InvocationTargetException -> 0x00fe, all -> 0x00e9 }
        L_0x00e8:
            return r7
        L_0x00e9:
            r7 = move-exception
            boolean r0 = r7 instanceof java.lang.ThreadDeath
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r7 instanceof java.lang.VirtualMachineError
            if (r0 == 0) goto L_0x00f5
            java.lang.VirtualMachineError r7 = (java.lang.VirtualMachineError) r7
            throw r7
        L_0x00f5:
            org.apache.commons.logging.LogConfigurationException r0 = new org.apache.commons.logging.LogConfigurationException
            r0.<init>((java.lang.Throwable) r7)
            throw r0
        L_0x00fb:
            java.lang.ThreadDeath r7 = (java.lang.ThreadDeath) r7
            throw r7
        L_0x00fe:
            r7 = move-exception
            java.lang.Throwable r0 = r7.getTargetException()
            if (r0 == 0) goto L_0x0106
            r7 = r0
        L_0x0106:
            org.apache.commons.logging.LogConfigurationException r0 = new org.apache.commons.logging.LogConfigurationException
            r0.<init>((java.lang.Throwable) r7)
            throw r0
        L_0x010c:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidTravelGettingStartedActivity_ViewBinding.RatingCompat(java.lang.String):o.PrepaidTravelCoachMarkActivity_ViewBinding");
    }

    private ClassLoader IconCompatParcelizer(ClassLoader classLoader) {
        try {
            return (ClassLoader) AccessController.doPrivileged(new onClickButtonReview(classLoader));
        } catch (SecurityException unused) {
            MediaDescriptionCompat("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, 37)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    private ClassLoader read(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        ClassLoader classLoader3 = classLoader;
        while (classLoader3 != null) {
            if (classLoader3 == classLoader2) {
                return classLoader;
            }
            classLoader3 = IconCompatParcelizer(classLoader3);
        }
        ClassLoader classLoader4 = classLoader2;
        while (classLoader4 != null) {
            if (classLoader4 == classLoader) {
                return classLoader2;
            }
            classLoader4 = IconCompatParcelizer(classLoader4);
        }
        return null;
    }

    private void write(ClassLoader classLoader, Class cls) throws LogConfigurationException {
        Class cls2;
        Class cls3 = write;
        if (cls3 == null) {
            cls3 = write("o.PrepaidTravelCoachMarkActivity_ViewBinding");
            write = cls3;
        }
        String name = cls3.getName();
        Class[] interfaces = cls.getInterfaces();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= interfaces.length) {
                break;
            } else if (name.equals(interfaces[i].getName())) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                try {
                    if (write == null) {
                        cls2 = write("o.PrepaidTravelCoachMarkActivity_ViewBinding");
                        write = cls2;
                    } else {
                        cls2 = write;
                    }
                    ClassLoader MediaBrowserCompat$CustomActionResultReceiver2 = PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver(cls2);
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Class '");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append("' was found in classloader ");
                    stringBuffer.append(read((Object) classLoader));
                    stringBuffer.append(". It is bound to a Log interface which is not");
                    stringBuffer.append(" the one loaded from classloader ");
                    stringBuffer.append(read((Object) MediaBrowserCompat$CustomActionResultReceiver2));
                    MediaDescriptionCompat(stringBuffer.toString());
                } catch (Throwable th) {
                    if (th instanceof ThreadDeath) {
                        throw ((ThreadDeath) th);
                    } else if (!(th instanceof VirtualMachineError)) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Error while trying to output diagnostics about bad class '");
                        stringBuffer2.append(cls);
                        stringBuffer2.append("'");
                        MediaDescriptionCompat(stringBuffer2.toString());
                    } else {
                        throw th;
                    }
                }
            }
            if (!this.MediaMetadataCompat) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Terminating logging for this context ");
                stringBuffer3.append("due to bad log hierarchy. ");
                stringBuffer3.append("You have more than one version of '");
                Class cls4 = write;
                if (cls4 == null) {
                    cls4 = write("o.PrepaidTravelCoachMarkActivity_ViewBinding");
                    write = cls4;
                }
                stringBuffer3.append(cls4.getName());
                stringBuffer3.append("' visible.");
                if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                    MediaDescriptionCompat(stringBuffer3.toString());
                }
                throw new LogConfigurationException(stringBuffer3.toString());
            } else if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Warning: bad log hierarchy. ");
                stringBuffer4.append("You have more than one version of '");
                Class cls5 = write;
                if (cls5 == null) {
                    cls5 = write("o.PrepaidTravelCoachMarkActivity_ViewBinding");
                    write = cls5;
                }
                stringBuffer4.append(cls5.getName());
                stringBuffer4.append("' visible.");
                MediaDescriptionCompat(stringBuffer4.toString());
            }
        } else if (!this.MediaBrowserCompat$SearchResultReceiver) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("Terminating logging for this context. ");
            stringBuffer5.append("Log class '");
            stringBuffer5.append(cls.getName());
            stringBuffer5.append("' does not implement the Log interface.");
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                MediaDescriptionCompat(stringBuffer5.toString());
            }
            throw new LogConfigurationException(stringBuffer5.toString());
        } else if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[WARNING] Log class '");
            stringBuffer6.append(cls.getName());
            stringBuffer6.append("' does not implement the Log interface.");
            MediaDescriptionCompat(stringBuffer6.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        if ((r0 instanceof java.lang.VirtualMachineError) == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ae, code lost:
        if (p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver() != false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b0, code lost:
        r14 = new java.lang.StringBuffer();
        r14.append("Could not instantiate Log '");
        r14.append(r2);
        r14.append("' -- ");
        r14.append(r0.getClass().getName());
        r14.append(": ");
        r14.append(r0.getLocalizedMessage());
        MediaDescriptionCompat(r14.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01eb, code lost:
        r15 = new java.lang.StringBuffer();
        r15.append("... InvocationTargetException: ");
        r15.append(r14.getClass().getName());
        r15.append(": ");
        r15.append(r14.getLocalizedMessage());
        MediaDescriptionCompat(r15.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021d, code lost:
        r14 = new java.io.StringWriter();
        r10.printStackTrace(new java.io.PrintWriter(r14, true));
        r10 = new java.lang.StringBuffer();
        r10.append("... ExceptionInInitializerError: ");
        r10.append(r14.toString());
        MediaDescriptionCompat(r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0244, code lost:
        if (r1.MediaBrowserCompat$SearchResultReceiver == false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0253, code lost:
        throw new org.apache.commons.logging.LogConfigurationException((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0256, code lost:
        throw ((java.lang.VirtualMachineError) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0259, code lost:
        throw ((java.lang.ThreadDeath) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x025a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x025b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x025c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x028a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0257 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b7 A[EDGE_INSN: B:119:0x02b7->B:98:0x02b7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad A[Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0166 A[SYNTHETIC, Splitter:B:53:0x0166] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0176 A[SYNTHETIC, Splitter:B:62:0x0176] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0248 A[LOOP:0: B:27:0x0087->B:85:0x0248, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x025a A[ExcHandler: LogConfigurationException (r0v28 'e' org.apache.commons.logging.LogConfigurationException A[CUSTOM_DECLARE]), Splitter:B:28:0x00a7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.PrepaidTravelCoachMarkActivity_ViewBinding IconCompatParcelizer(java.lang.String r17, java.lang.String r18) throws org.apache.commons.logging.LogConfigurationException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = ".class"
            java.lang.String r4 = "The log adapter '"
            java.lang.String r5 = ": "
            boolean r0 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()
            java.lang.String r6 = "'"
            if (r0 == 0) goto L_0x0029
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r7 = "Attempting to instantiate '"
            r0.append(r7)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1.MediaDescriptionCompat(r0)
        L_0x0029:
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r0 = 0
            r8[r0] = r18
            java.lang.Class r0 = read
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "o.PrepaidTravelGettingStartedActivity_ViewBinding"
            java.lang.Class r0 = write(r0)
            read = r0
        L_0x003b:
            java.lang.ClassLoader r0 = p040o.PrepaidOtpActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Class) r0)
            boolean r9 = r1.Keep
            if (r9 == 0) goto L_0x0084
            o.PrepaidActivationLandingActivity r9 = new o.PrepaidActivationLandingActivity
            r9.<init>()
            java.lang.Object r9 = java.security.AccessController.doPrivileged(r9)
            java.lang.ClassLoader r9 = (java.lang.ClassLoader) r9
            java.lang.ClassLoader r0 = r1.read(r9, r0)
            java.lang.String r10 = "Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader."
            if (r0 != 0) goto L_0x006c
            boolean r0 = r1.MediaDescriptionCompat
            if (r0 == 0) goto L_0x0066
            boolean r0 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = "[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl."
            r1.MediaDescriptionCompat(r0)
            goto L_0x0085
        L_0x0066:
            org.apache.commons.logging.LogConfigurationException r0 = new org.apache.commons.logging.LogConfigurationException
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x006c:
            if (r0 == r9) goto L_0x0084
            boolean r9 = r1.MediaDescriptionCompat
            if (r9 == 0) goto L_0x007e
            boolean r9 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()
            if (r9 == 0) goto L_0x0084
            java.lang.String r9 = "Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly."
            r1.MediaDescriptionCompat(r9)
            goto L_0x0084
        L_0x007e:
            org.apache.commons.logging.LogConfigurationException r0 = new org.apache.commons.logging.LogConfigurationException
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x0084:
            r9 = r0
        L_0x0085:
            r11 = 0
            r12 = 0
        L_0x0087:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r13 = "Trying to load '"
            r0.append(r13)
            r0.append(r2)
            java.lang.String r13 = "' from classloader "
            r0.append(r13)
            java.lang.String r14 = read((java.lang.Object) r9)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r1.MediaDescriptionCompat(r0)
            boolean r0 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            if (r0 == 0) goto L_0x011f
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14 = 46
            r15 = 47
            java.lang.String r14 = r2.replace(r14, r15)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r0.append(r14)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r0.append(r3)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            if (r9 == 0) goto L_0x00cb
            java.net.URL r14 = r9.getResource(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            goto L_0x00de
        L_0x00cb:
            java.lang.StringBuffer r14 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.<init>()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r3)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r14 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.net.URL r14 = java.lang.ClassLoader.getSystemResource(r14)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
        L_0x00de:
            java.lang.String r15 = "Class '"
            if (r14 != 0) goto L_0x0102
            java.lang.StringBuffer r14 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.<init>()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r2)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r15 = "' ["
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r0 = "] cannot be found."
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r0 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r1.MediaDescriptionCompat(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            goto L_0x011f
        L_0x0102:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r0.<init>()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r0.append(r15)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r0.append(r2)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r15 = "' was found at '"
            r0.append(r15)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r0.append(r14)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r0.append(r6)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r0 = r0.toString()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r1.MediaDescriptionCompat(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
        L_0x011f:
            java.lang.Class r0 = java.lang.Class.forName(r2, r7, r9)     // Catch:{ ClassNotFoundException -> 0x0125 }
        L_0x0123:
            r14 = r0
            goto L_0x0158
        L_0x0125:
            r0 = move-exception
            r14 = r0
            java.lang.String r0 = r14.getMessage()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.StringBuffer r14 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.<init>()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r4)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r2)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r15 = "' is not available via classloader "
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r15 = read((java.lang.Object) r9)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r5)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r0 = r0.trim()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r0 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r1.MediaDescriptionCompat(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.Class r0 = java.lang.Class.forName(r17)     // Catch:{ ClassNotFoundException -> 0x017b }
            goto L_0x0123
        L_0x0158:
            java.lang.Class[] r0 = r1.MediaSessionCompat$Token     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.reflect.Constructor r11 = r14.getConstructor(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.Object r0 = r11.newInstance(r8)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            boolean r15 = r0 instanceof p040o.PrepaidTravelCoachMarkActivity_ViewBinding
            if (r15 == 0) goto L_0x0176
            o.PrepaidTravelCoachMarkActivity_ViewBinding r0 = (p040o.PrepaidTravelCoachMarkActivity_ViewBinding) r0     // Catch:{ NoClassDefFoundError -> 0x0172, ExceptionInInitializerError -> 0x016e, LogConfigurationException -> 0x025a, all -> 0x016b }
            r3 = r0
            goto L_0x02b9
        L_0x016b:
            r0 = move-exception
            r12 = r14
            goto L_0x01a2
        L_0x016e:
            r0 = move-exception
            r12 = r14
            goto L_0x025d
        L_0x0172:
            r0 = move-exception
            r12 = r14
            goto L_0x028b
        L_0x0176:
            r1.write(r9, r14)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            goto L_0x0246
        L_0x017b:
            r0 = move-exception
            r14 = r0
            java.lang.String r0 = r14.getMessage()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.StringBuffer r14 = new java.lang.StringBuffer     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.<init>()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r4)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r2)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r15 = "' is not available via the LogFactoryImpl class classloader: "
            r14.append(r15)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r0 = r0.trim()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r14.append(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            java.lang.String r0 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            r1.MediaDescriptionCompat(r0)     // Catch:{ NoClassDefFoundError -> 0x028a, ExceptionInInitializerError -> 0x025c, LogConfigurationException -> 0x025a, all -> 0x01a1 }
            goto L_0x02b7
        L_0x01a1:
            r0 = move-exception
        L_0x01a2:
            boolean r14 = r0 instanceof java.lang.ThreadDeath
            if (r14 != 0) goto L_0x0257
            boolean r14 = r0 instanceof java.lang.VirtualMachineError
            if (r14 != 0) goto L_0x0254
            boolean r14 = p040o.PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()
            if (r14 == 0) goto L_0x0242
            java.lang.StringBuffer r14 = new java.lang.StringBuffer
            r14.<init>()
            java.lang.String r15 = "Could not instantiate Log '"
            r14.append(r15)
            r14.append(r2)
            java.lang.String r15 = "' -- "
            r14.append(r15)
            java.lang.Class r15 = r0.getClass()
            java.lang.String r15 = r15.getName()
            r14.append(r15)
            r14.append(r5)
            java.lang.String r15 = r0.getLocalizedMessage()
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r1.MediaDescriptionCompat(r14)
            boolean r14 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r14 == 0) goto L_0x0242
            r14 = r0
            java.lang.reflect.InvocationTargetException r14 = (java.lang.reflect.InvocationTargetException) r14
            java.lang.Throwable r14 = r14.getTargetException()
            if (r14 == 0) goto L_0x0242
            java.lang.StringBuffer r15 = new java.lang.StringBuffer
            r15.<init>()
            java.lang.String r10 = "... InvocationTargetException: "
            r15.append(r10)
            java.lang.Class r10 = r14.getClass()
            java.lang.String r10 = r10.getName()
            r15.append(r10)
            r15.append(r5)
            java.lang.String r10 = r14.getLocalizedMessage()
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            r1.MediaDescriptionCompat(r10)
            boolean r10 = r14 instanceof java.lang.ExceptionInInitializerError
            if (r10 == 0) goto L_0x0242
            java.lang.ExceptionInInitializerError r14 = (java.lang.ExceptionInInitializerError) r14
            java.lang.Throwable r10 = r14.getException()
            if (r10 == 0) goto L_0x0242
            java.io.StringWriter r14 = new java.io.StringWriter
            r14.<init>()
            java.io.PrintWriter r15 = new java.io.PrintWriter
            r15.<init>(r14, r7)
            r10.printStackTrace(r15)
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            java.lang.String r15 = "... ExceptionInInitializerError: "
            r10.append(r15)
            java.lang.String r14 = r14.toString()
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r1.MediaDescriptionCompat(r10)
        L_0x0242:
            boolean r10 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r10 == 0) goto L_0x024e
        L_0x0246:
            if (r9 == 0) goto L_0x02b7
            java.lang.ClassLoader r9 = r1.IconCompatParcelizer(r9)
            goto L_0x0087
        L_0x024e:
            org.apache.commons.logging.LogConfigurationException r2 = new org.apache.commons.logging.LogConfigurationException
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        L_0x0254:
            java.lang.VirtualMachineError r0 = (java.lang.VirtualMachineError) r0
            throw r0
        L_0x0257:
            java.lang.ThreadDeath r0 = (java.lang.ThreadDeath) r0
            throw r0
        L_0x025a:
            r0 = move-exception
            throw r0
        L_0x025c:
            r0 = move-exception
        L_0x025d:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = "' is unable to initialize itself when loaded via classloader "
            r3.append(r4)
            java.lang.String r4 = read((java.lang.Object) r9)
            r3.append(r4)
            r3.append(r5)
            java.lang.String r0 = r0.trim()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.MediaDescriptionCompat(r0)
            goto L_0x02b7
        L_0x028a:
            r0 = move-exception
        L_0x028b:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = "' is missing dependencies when loaded via classloader "
            r3.append(r4)
            java.lang.String r4 = read((java.lang.Object) r9)
            r3.append(r4)
            r3.append(r5)
            java.lang.String r0 = r0.trim()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.MediaDescriptionCompat(r0)
        L_0x02b7:
            r14 = r12
            r3 = 0
        L_0x02b9:
            if (r14 == 0) goto L_0x0341
            r1.f5517x50fd9e4a = r11
            java.lang.String r0 = "setLogFactory"
            java.lang.Class[] r4 = r1.ParcelableVolumeInfo     // Catch:{ all -> 0x02df }
            java.lang.reflect.Method r0 = r14.getMethod(r0, r4)     // Catch:{ all -> 0x02df }
            r1.MediaSessionCompat$QueueItem = r0     // Catch:{ all -> 0x02df }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ all -> 0x02df }
            r0.<init>()     // Catch:{ all -> 0x02df }
            java.lang.String r4 = "Found method setLogFactory(LogFactory) in '"
            r0.append(r4)     // Catch:{ all -> 0x02df }
            r0.append(r2)     // Catch:{ all -> 0x02df }
            r0.append(r6)     // Catch:{ all -> 0x02df }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02df }
            r1.MediaDescriptionCompat(r0)     // Catch:{ all -> 0x02df }
            goto L_0x0313
        L_0x02df:
            r0 = move-exception
            boolean r4 = r0 instanceof java.lang.ThreadDeath
            if (r4 != 0) goto L_0x033e
            boolean r4 = r0 instanceof java.lang.VirtualMachineError
            if (r4 != 0) goto L_0x033b
            r4 = 0
            r1.MediaSessionCompat$QueueItem = r4
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r4 = "[INFO] '"
            r0.append(r4)
            r0.append(r2)
            r0.append(r13)
            java.lang.String r4 = read((java.lang.Object) r9)
            r0.append(r4)
            java.lang.String r4 = " does not declare optional method "
            r0.append(r4)
            java.lang.String r4 = "setLogFactory(LogFactory)"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1.MediaDescriptionCompat(r0)
        L_0x0313:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r4 = "Log adapter '"
            r0.append(r4)
            r0.append(r2)
            r0.append(r13)
            java.lang.ClassLoader r2 = r14.getClassLoader()
            java.lang.String r2 = read((java.lang.Object) r2)
            r0.append(r2)
            java.lang.String r2 = " has been selected for use."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.MediaDescriptionCompat(r0)
            goto L_0x0341
        L_0x033b:
            java.lang.VirtualMachineError r0 = (java.lang.VirtualMachineError) r0
            throw r0
        L_0x033e:
            java.lang.ThreadDeath r0 = (java.lang.ThreadDeath) r0
            throw r0
        L_0x0341:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidTravelGettingStartedActivity_ViewBinding.IconCompatParcelizer(java.lang.String, java.lang.String):o.PrepaidTravelCoachMarkActivity_ViewBinding");
    }

    private String IconCompatParcelizer() {
        if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
            MediaDescriptionCompat("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String str = (String) this.RatingCompat.get("o.PrepaidTravelCoachMarkActivity_ViewBinding");
        if (str == null) {
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                MediaDescriptionCompat("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            str = (String) this.RatingCompat.get("org.apache.commons.logging.log");
        }
        if (str == null) {
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                MediaDescriptionCompat("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                str = (String) AccessController.doPrivileged(new PrepaidActivationSuccessfulActivity("o.PrepaidTravelCoachMarkActivity_ViewBinding", (String) null));
            } catch (SecurityException e) {
                if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e.getMessage());
                    MediaDescriptionCompat(stringBuffer.toString());
                }
            }
        }
        if (str == null) {
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                MediaDescriptionCompat("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                str = (String) AccessController.doPrivileged(new PrepaidActivationSuccessfulActivity("org.apache.commons.logging.log", (String) null));
            } catch (SecurityException e2) {
                if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e2.getMessage());
                    MediaDescriptionCompat(stringBuffer2.toString());
                }
            }
        }
        return str != null ? str.trim() : str;
    }

    private String MediaBrowserCompat$SearchResultReceiver(String str) {
        if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            MediaDescriptionCompat(stringBuffer.toString());
        }
        Object obj = this.RatingCompat.get(str);
        if (obj != null) {
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(obj);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                MediaDescriptionCompat(stringBuffer2.toString());
            }
            return obj.toString();
        }
        if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            MediaDescriptionCompat(stringBuffer3.toString());
        }
        try {
            String str2 = (String) AccessController.doPrivileged(new PrepaidActivationSuccessfulActivity(str, (String) null));
            if (str2 != null) {
                if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("[ENV] Found system property [");
                    stringBuffer4.append(str2);
                    stringBuffer4.append("] for ");
                    stringBuffer4.append(str);
                    MediaDescriptionCompat(stringBuffer4.toString());
                }
                return str2;
            }
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] No system property found for property ");
                stringBuffer5.append(str);
                MediaDescriptionCompat(stringBuffer5.toString());
            }
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("[ENV] No configuration defined for item ");
                stringBuffer6.append(str);
                MediaDescriptionCompat(stringBuffer6.toString());
            }
            return null;
        } catch (SecurityException unused) {
            if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append("[ENV] Security prevented reading system property ");
                stringBuffer7.append(str);
                MediaDescriptionCompat(stringBuffer7.toString());
            }
        }
    }

    private void MediaDescriptionCompat(String str) {
        if (PrepaidOtpActivity.MediaBrowserCompat$ItemReceiver()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.MediaBrowserCompat$MediaItem);
            stringBuffer.append(str);
            IconCompatParcelizer(stringBuffer.toString());
        }
    }
}
