package p040o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.TypeCastException;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.onCheckedConsent */
public final class onCheckedConsent {
    private static final ReentrantReadWriteLock MediaBrowserCompat$ItemReceiver = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, FundFactSheetActivity<Throwable, Throwable>> read = new WeakHashMap<>();
    private static final int write = MediaBrowserCompat$ItemReceiver(Throwable.class, -1);

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final <E extends java.lang.Throwable> E IconCompatParcelizer(E r9) {
        /*
            java.lang.String r0 = "exception"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            boolean r1 = r9 instanceof p040o.onClickReview
            r2 = 0
            if (r1 == 0) goto L_0x0031
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r1 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0017 }
            o.onClickReview r9 = (p040o.onClickReview) r9     // Catch:{ all -> 0x0017 }
            java.lang.Throwable r9 = r9.read()     // Catch:{ all -> 0x0017 }
            java.lang.Object r9 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r9)     // Catch:{ all -> 0x0017 }
            goto L_0x0026
        L_0x0017:
            r9 = move-exception
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r1 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            o.HmlVerifyIdentifyActivity$write r0 = new o.HmlVerifyIdentifyActivity$write
            r0.<init>(r9)
            java.lang.Object r9 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r0)
        L_0x0026:
            boolean r0 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver(r9)
            if (r0 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r2 = r9
        L_0x002e:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            return r2
        L_0x0031:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = MediaBrowserCompat$ItemReceiver
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, o.FundFactSheetActivity<java.lang.Throwable, java.lang.Throwable>> r1 = read     // Catch:{ all -> 0x01c4 }
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x01c4 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x01c4 }
            o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1     // Catch:{ all -> 0x01c4 }
            r0.unlock()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r9 = r1.invoke(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x0052:
            int r0 = write
            java.lang.Class r1 = r9.getClass()
            r3 = 0
            int r1 = MediaBrowserCompat$ItemReceiver(r1, r3)
            if (r0 == r1) goto L_0x00a9
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = MediaBrowserCompat$ItemReceiver
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r4 = r0.getWriteHoldCount()
            if (r4 != 0) goto L_0x0070
            int r4 = r0.getReadHoldCount()
            goto L_0x0071
        L_0x0070:
            r4 = r3
        L_0x0071:
            r5 = r3
        L_0x0072:
            if (r5 >= r4) goto L_0x007a
            r1.unlock()
            int r5 = r5 + 1
            goto L_0x0072
        L_0x007a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, o.FundFactSheetActivity<java.lang.Throwable, java.lang.Throwable>> r5 = read     // Catch:{ all -> 0x009c }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x009c }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x009c }
            o.onCheckedConsent$MediaMetadataCompat r6 = p040o.onCheckedConsent.MediaMetadataCompat.write     // Catch:{ all -> 0x009c }
            r5.put(r9, r6)     // Catch:{ all -> 0x009c }
            o.HmlVerifyPhoneValidateOtpActivity r9 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x009c }
        L_0x0090:
            if (r3 >= r4) goto L_0x0098
            r1.lock()
            int r3 = r3 + 1
            goto L_0x0090
        L_0x0098:
            r0.unlock()
            return r2
        L_0x009c:
            r9 = move-exception
        L_0x009d:
            if (r3 >= r4) goto L_0x00a5
            r1.lock()
            int r3 = r3 + 1
            goto L_0x009d
        L_0x00a5:
            r0.unlock()
            throw r9
        L_0x00a9:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            java.lang.String r1 = "exception.javaClass.constructors"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
            o.onCheckedConsent$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.onCheckedConsent$MediaBrowserCompat$CustomActionResultReceiver
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.lang.String r4 = "$this$sortedWith"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            java.lang.String r4 = "comparator"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r4)
            java.lang.String r5 = "$this$sortedArrayWith"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r5)
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r4)
            int r5 = r0.length
            r6 = 1
            if (r5 != 0) goto L_0x00d5
            r5 = r6
            goto L_0x00d6
        L_0x00d5:
            r5 = r3
        L_0x00d6:
            if (r5 != 0) goto L_0x00f0
            int r5 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            java.lang.String r5 = "java.util.Arrays.copyOf(this, size)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r5)
            java.lang.String r5 = "$this$sortWith"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r5)
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r4)
            int r4 = r0.length
            if (r4 <= r6) goto L_0x00f0
            java.util.Arrays.sort(r0, r1)
        L_0x00f0:
            java.lang.String r1 = "$this$asList"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = "ArraysUtilJVM.asList(this)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
            java.util.Iterator r0 = r0.iterator()
            r1 = r2
        L_0x0103:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x016b
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r4 = "constructor"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r4)
            java.lang.Class[] r4 = r1.getParameterTypes()
            int r5 = r4.length
            if (r5 == 0) goto L_0x0161
            if (r5 == r6) goto L_0x013d
            r7 = 2
            if (r5 == r7) goto L_0x0121
            goto L_0x015f
        L_0x0121:
            r5 = r4[r3]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r5 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r5, (java.lang.Object) r7)
            if (r5 == 0) goto L_0x015f
            r4 = r4[r6]
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            boolean r4 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x015f
            o.onCheckedConsent$IconCompatParcelizer r4 = new o.onCheckedConsent$IconCompatParcelizer
            r4.<init>(r1)
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4
            goto L_0x0168
        L_0x013d:
            r4 = r4[r3]
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            boolean r5 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x014f
            o.onCheckedConsent$MediaBrowserCompat$ItemReceiver r4 = new o.onCheckedConsent$MediaBrowserCompat$ItemReceiver
            r4.<init>(r1)
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4
            goto L_0x0168
        L_0x014f:
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x015f
            o.onCheckedConsent$read r4 = new o.onCheckedConsent$read
            r4.<init>(r1)
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4
            goto L_0x0168
        L_0x015f:
            r1 = r2
            goto L_0x0169
        L_0x0161:
            o.onCheckedConsent$write r4 = new o.onCheckedConsent$write
            r4.<init>(r1)
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4
        L_0x0168:
            r1 = r4
        L_0x0169:
            if (r1 == 0) goto L_0x0103
        L_0x016b:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = MediaBrowserCompat$ItemReceiver
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x017c
            int r5 = r0.getReadHoldCount()
            goto L_0x017d
        L_0x017c:
            r5 = r3
        L_0x017d:
            r6 = r3
        L_0x017e:
            if (r6 >= r5) goto L_0x0186
            r4.unlock()
            int r6 = r6 + 1
            goto L_0x017e
        L_0x0186:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, o.FundFactSheetActivity<java.lang.Throwable, java.lang.Throwable>> r6 = read     // Catch:{ all -> 0x01b7 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x01b7 }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x0199
            r8 = r1
            goto L_0x019d
        L_0x0199:
            o.onCheckedConsent$MediaBrowserCompat$SearchResultReceiver r8 = p040o.onCheckedConsent$MediaBrowserCompat$SearchResultReceiver.write     // Catch:{ all -> 0x01b7 }
            o.FundFactSheetActivity r8 = (p040o.FundFactSheetActivity) r8     // Catch:{ all -> 0x01b7 }
        L_0x019d:
            r6.put(r7, r8)     // Catch:{ all -> 0x01b7 }
            o.HmlVerifyPhoneValidateOtpActivity r6 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01b7 }
        L_0x01a2:
            if (r3 >= r5) goto L_0x01aa
            r4.lock()
            int r3 = r3 + 1
            goto L_0x01a2
        L_0x01aa:
            r0.unlock()
            if (r1 == 0) goto L_0x01b6
            java.lang.Object r9 = r1.invoke(r9)
            r2 = r9
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L_0x01b6:
            return r2
        L_0x01b7:
            r9 = move-exception
        L_0x01b8:
            if (r3 >= r5) goto L_0x01c0
            r4.lock()
            int r3 = r3 + 1
            goto L_0x01b8
        L_0x01c0:
            r0.unlock()
            throw r9
        L_0x01c4:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onCheckedConsent.IconCompatParcelizer(java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: o.onCheckedConsent$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, Throwable> {
        private /* synthetic */ Constructor MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(Constructor constructor) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = constructor;
        }

        /* access modifiers changed from: private */
        /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
        public Throwable invoke(Throwable th) {
            Object obj;
            onGetStartedClick.write((Object) th, "e");
            try {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                Object newInstance = this.MediaBrowserCompat$CustomActionResultReceiver.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver((Throwable) newInstance);
                    if (HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) th2, "exception");
                obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th2));
            }
        }
    }

    /* renamed from: o.onCheckedConsent$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, Throwable> {
        private /* synthetic */ Constructor MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(Constructor constructor) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = constructor;
        }

        /* access modifiers changed from: private */
        /* renamed from: write */
        public Throwable invoke(Throwable th) {
            Object obj;
            onGetStartedClick.write((Object) th, "e");
            try {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                Object newInstance = this.MediaBrowserCompat$CustomActionResultReceiver.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(th2);
                    if (HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) th3, "exception");
                obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th3));
            }
        }
    }

    /* renamed from: o.onCheckedConsent$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, Throwable> {
        private /* synthetic */ Constructor read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(Constructor constructor) {
            super(1);
            this.read = constructor;
        }

        /* access modifiers changed from: private */
        /* renamed from: read */
        public Throwable invoke(Throwable th) {
            Object obj;
            onGetStartedClick.write((Object) th, "e");
            try {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                Object newInstance = this.read.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(th2);
                    if (HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) th3, "exception");
                obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th3));
            }
        }
    }

    private static final int MediaBrowserCompat$ItemReceiver(Class<?> cls, int i) {
        Object obj;
        Class<? super Object> superclass;
        onGetStartedClick.write((Object) cls, "$this$kotlin");
        FundOnboardingLandingActivity_ViewBinding.write((Class) cls);
        try {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            do {
                Field[] declaredFields = cls2.getDeclaredFields();
                onGetStartedClick.IconCompatParcelizer((Object) declaredFields, "declaredFields");
                int i3 = 0;
                for (Field field : declaredFields) {
                    onGetStartedClick.IconCompatParcelizer((Object) field, "it");
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                superclass = cls2.getSuperclass();
                cls2 = superclass;
            } while (superclass != null);
            obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(Integer.valueOf(i2));
        } catch (Throwable th) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th, "exception");
            obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th));
        }
        if (HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver(obj)) {
            obj = Integer.valueOf(i);
        }
        return ((Number) obj).intValue();
    }

    /* renamed from: o.onCheckedConsent$MediaMetadataCompat */
    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity {
        public static final MediaMetadataCompat write = new MediaMetadataCompat();

        MediaMetadataCompat() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            return null;
        }
    }
}
