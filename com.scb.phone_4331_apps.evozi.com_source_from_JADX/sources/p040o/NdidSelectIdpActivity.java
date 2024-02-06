package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.util.ArrayDeque;
import kotlin.TypeCastException;

/* renamed from: o.NdidSelectIdpActivity */
public final class NdidSelectIdpActivity {
    private static final String MediaBrowserCompat$CustomActionResultReceiver;
    private static final String write;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "exception"
            java.lang.String r1 = "o.HmlNTBCropDocumentActivity"
            java.lang.String r2 = "o.NdidSelectIdpActivity"
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r3 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x001a }
            java.lang.Class r3 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "Class.forName(baseContinuationImplClass)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r4)     // Catch:{ all -> 0x001a }
            java.lang.String r3 = r3.getCanonicalName()     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r3)     // Catch:{ all -> 0x001a }
            goto L_0x0029
        L_0x001a:
            r3 = move-exception
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r4 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            o.HmlVerifyIdentifyActivity$write r4 = new o.HmlVerifyIdentifyActivity$write
            r4.<init>(r3)
            java.lang.Object r3 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r4)
        L_0x0029:
            java.lang.Throwable r4 = p040o.HmlVerifyIdentifyActivity.IconCompatParcelizer(r3)
            if (r4 != 0) goto L_0x0030
            r1 = r3
        L_0x0030:
            java.lang.String r1 = (java.lang.String) r1
            write = r1
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r1 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0048 }
            java.lang.Class r1 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "Class.forName(stackTraceRecoveryClass)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r1.getCanonicalName()     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r1)     // Catch:{ all -> 0x0048 }
            goto L_0x0057
        L_0x0048:
            r1 = move-exception
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r3 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r0)
            o.HmlVerifyIdentifyActivity$write r0 = new o.HmlVerifyIdentifyActivity$write
            r0.<init>(r1)
            java.lang.Object r0 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r0)
        L_0x0057:
            java.lang.Throwable r1 = p040o.HmlVerifyIdentifyActivity.IconCompatParcelizer(r0)
            if (r1 != 0) goto L_0x005e
            r2 = r0
        L_0x005e:
            java.lang.String r2 = (java.lang.String) r2
            MediaBrowserCompat$CustomActionResultReceiver = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.NdidSelectIdpActivity.<clinit>():void");
    }

    public static final <E extends Throwable> E read(E e) {
        E IconCompatParcelizer;
        StackTraceElement stackTraceElement;
        onGetStartedClick.write((Object) e, "exception");
        if (!MwChangeCasaSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver() || (IconCompatParcelizer = onCheckedConsent.IconCompatParcelizer(e)) == null) {
            return e;
        }
        StackTraceElement[] stackTrace = IconCompatParcelizer.getStackTrace();
        int length = stackTrace.length;
        onGetStartedClick.IconCompatParcelizer((Object) stackTrace, C8183f.f4231JP);
        String str = MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) str, "stackTraceRecoveryClassName");
        int read = read(stackTrace, str);
        String str2 = write;
        onGetStartedClick.IconCompatParcelizer((Object) str2, "baseContinuationImplClassName");
        int read2 = read(stackTrace, str2);
        int i = (length - read) - (read2 == -1 ? 0 : length - read2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stackTraceElement = read("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[((read + 1) + i2) - 1];
            }
            stackTraceElementArr[i2] = stackTraceElement;
        }
        IconCompatParcelizer.setStackTrace(stackTraceElementArr);
        return IconCompatParcelizer;
    }

    public static final <E extends Throwable> E MediaBrowserCompat$CustomActionResultReceiver(E e, HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) e, "exception");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "continuation");
        return (!MwChangeCasaSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver() || !(hmlNTBPromptPayNotFoundActivity instanceof HmlNTBDocumentSubmissionActivity)) ? e : write(e, (HmlNTBDocumentSubmissionActivity) hmlNTBPromptPayNotFoundActivity);
    }

    /* access modifiers changed from: private */
    public static final <E extends Throwable> E write(E e, HmlNTBDocumentSubmissionActivity hmlNTBDocumentSubmissionActivity) {
        HmlVerifyEmailSuccessfulActivity write2 = write(e);
        E e2 = (Throwable) write2.MediaBrowserCompat$CustomActionResultReceiver;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) write2.write;
        Throwable IconCompatParcelizer = onCheckedConsent.IconCompatParcelizer(e2);
        if (IconCompatParcelizer == null || (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) IconCompatParcelizer.getMessage(), (Object) e2.getMessage()))) {
            return e;
        }
        ArrayDeque MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(hmlNTBDocumentSubmissionActivity);
        if (MediaBrowserCompat$CustomActionResultReceiver2.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            IconCompatParcelizer(stackTraceElementArr, MediaBrowserCompat$CustomActionResultReceiver2);
        }
        return write(e2, IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver2);
    }

    private static final <E extends Throwable> E write(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(read("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        onGetStartedClick.IconCompatParcelizer((Object) stackTrace, "causeTrace");
        String str = write;
        onGetStartedClick.IconCompatParcelizer((Object) str, "baseContinuationImplClassName");
        int read = read(stackTrace, str);
        int i = 0;
        if (read == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + read)];
        for (int i2 = 0; i2 < read; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[read + i] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final <E extends Throwable> HmlVerifyEmailSuccessfulActivity<E, StackTraceElement[]> write(E e) {
        HmlVerifyEmailSuccessfulActivity<E, StackTraceElement[]> hmlVerifyEmailSuccessfulActivity;
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) cause.getClass(), (Object) e.getClass())) {
            hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity<>(e, new StackTraceElement[0]);
        } else {
            StackTraceElement[] stackTrace = e.getStackTrace();
            onGetStartedClick.IconCompatParcelizer((Object) stackTrace, "currentTrace");
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                onGetStartedClick.IconCompatParcelizer((Object) stackTraceElement, "it");
                onGetStartedClick.write((Object) stackTraceElement, "$this$isArtificial");
                String className = stackTraceElement.getClassName();
                onGetStartedClick.IconCompatParcelizer((Object) className, "className");
                if (GoodToKnowActivity.read(className, "\b\b\b", false)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return new HmlVerifyEmailSuccessfulActivity<>(cause, stackTrace);
            }
            hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity<>(e, new StackTraceElement[0]);
        }
        return hmlVerifyEmailSuccessfulActivity;
    }

    public static final <E extends Throwable> E MediaBrowserCompat$ItemReceiver(E e) {
        E cause;
        onGetStartedClick.write((Object) e, "exception");
        if (MwChangeCasaSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver() && (cause = e.getCause()) != null) {
            boolean z = true;
            if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) cause.getClass(), (Object) e.getClass()))) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                onGetStartedClick.IconCompatParcelizer((Object) stackTrace, "exception.stackTrace");
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    onGetStartedClick.IconCompatParcelizer((Object) stackTraceElement, "it");
                    onGetStartedClick.write((Object) stackTraceElement, "$this$isArtificial");
                    String className = stackTraceElement.getClassName();
                    onGetStartedClick.IconCompatParcelizer((Object) className, "className");
                    if (GoodToKnowActivity.read(className, "\b\b\b", false)) {
                        break;
                    }
                    i++;
                }
                if (z) {
                    return cause;
                }
            }
        }
        return e;
    }

    private static final ArrayDeque<StackTraceElement> MediaBrowserCompat$CustomActionResultReceiver(HmlNTBDocumentSubmissionActivity hmlNTBDocumentSubmissionActivity) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = hmlNTBDocumentSubmissionActivity.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            if (!(hmlNTBDocumentSubmissionActivity instanceof HmlNTBDocumentSubmissionActivity)) {
                hmlNTBDocumentSubmissionActivity = null;
            }
            if (hmlNTBDocumentSubmissionActivity == null || (hmlNTBDocumentSubmissionActivity = hmlNTBDocumentSubmissionActivity.getCallerFrame()) == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = hmlNTBDocumentSubmissionActivity.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    private static StackTraceElement read(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        StringBuilder sb = new StringBuilder();
        sb.append("\b\b\b(");
        sb.append(str);
        return new StackTraceElement(sb.toString(), "\b", "\b", -1);
    }

    private static final void IconCompatParcelizer(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            onGetStartedClick.write((Object) stackTraceElement, "$this$isArtificial");
            String className = stackTraceElement.getClassName();
            onGetStartedClick.IconCompatParcelizer((Object) className, "className");
            if (GoodToKnowActivity.read(className, "\b\b\b", false)) {
                break;
            }
            i++;
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (length2 >= i2) {
            while (true) {
                StackTraceElement stackTraceElement2 = stackTraceElementArr[length2];
                StackTraceElement last = arrayDeque.getLast();
                onGetStartedClick.IconCompatParcelizer((Object) last, "result.last");
                StackTraceElement stackTraceElement3 = last;
                if (stackTraceElement2.getLineNumber() == stackTraceElement3.getLineNumber() && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) stackTraceElement2.getMethodName(), (Object) stackTraceElement3.getMethodName()) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) stackTraceElement2.getFileName(), (Object) stackTraceElement3.getFileName()) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) stackTraceElement2.getClassName(), (Object) stackTraceElement3.getClassName())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    private static final int read(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
