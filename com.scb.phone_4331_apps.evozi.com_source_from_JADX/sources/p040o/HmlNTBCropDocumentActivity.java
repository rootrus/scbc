package p040o;

import java.io.Serializable;
import p040o.HmlVerifyIdentifyActivity;

/* renamed from: o.HmlNTBCropDocumentActivity */
public abstract class HmlNTBCropDocumentActivity implements HmlNTBPromptPayNotFoundActivity<Object>, HmlNTBDocumentSubmissionActivity, Serializable {
    private final HmlNTBPromptPayNotFoundActivity<Object> completion;

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public HmlNTBCropDocumentActivity(HmlNTBPromptPayNotFoundActivity<Object> hmlNTBPromptPayNotFoundActivity) {
        this.completion = hmlNTBPromptPayNotFoundActivity;
    }

    public final HmlNTBPromptPayNotFoundActivity<Object> getCompletion() {
        return this.completion;
    }

    public final void resumeWith(Object obj) {
        HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = this;
        while (true) {
            HmlNTBCropDocumentActivity hmlNTBCropDocumentActivity = (HmlNTBCropDocumentActivity) hmlNTBPromptPayNotFoundActivity;
            onGetStartedClick.write((Object) hmlNTBCropDocumentActivity, "frame");
            HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity2 = hmlNTBCropDocumentActivity.completion;
            if (hmlNTBPromptPayNotFoundActivity2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            try {
                Object invokeSuspend = hmlNTBCropDocumentActivity.invokeSuspend(obj);
                if (invokeSuspend != HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
                    HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                    obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(invokeSuspend);
                    hmlNTBCropDocumentActivity.releaseIntercepted();
                    if (hmlNTBPromptPayNotFoundActivity2 instanceof HmlNTBCropDocumentActivity) {
                        hmlNTBPromptPayNotFoundActivity = hmlNTBPromptPayNotFoundActivity2;
                    } else {
                        hmlNTBPromptPayNotFoundActivity2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) th, "exception");
                obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th));
            }
        }
    }

    public HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> create(HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> create(Object obj, HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Serializable stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public HmlNTBDocumentSubmissionActivity getCallerFrame() {
        HmlNTBPromptPayNotFoundActivity<Object> hmlNTBPromptPayNotFoundActivity = this.completion;
        if (!(hmlNTBPromptPayNotFoundActivity instanceof HmlNTBDocumentSubmissionActivity)) {
            hmlNTBPromptPayNotFoundActivity = null;
        }
        return (HmlNTBDocumentSubmissionActivity) hmlNTBPromptPayNotFoundActivity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement getStackTraceElement() {
        /*
            r8 = this;
            java.lang.String r0 = "$this$getStackTraceElementImpl"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            java.lang.Class r0 = r8.getClass()
            java.lang.Class<o.onClickPay> r1 = p040o.onClickPay.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            o.onClickPay r0 = (p040o.onClickPay) r0
            r1 = 0
            if (r0 == 0) goto L_0x00c5
            int r2 = r0.write()
            r3 = 1
            if (r2 > r3) goto L_0x009b
            int r2 = p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((p040o.HmlNTBCropDocumentActivity) r8)
            if (r2 >= 0) goto L_0x0023
            r2 = -1
            goto L_0x0029
        L_0x0023:
            int[] r3 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            r2 = r3[r2]
        L_0x0029:
            o.InsurancePortfolioActivity r3 = p040o.InsurancePortfolioActivity.IconCompatParcelizer
            java.lang.String r3 = "continuation"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r3)
            o.InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver r3 = p040o.InsurancePortfolioActivity.read
            if (r3 != 0) goto L_0x0038
            o.InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver r3 = p040o.InsurancePortfolioActivity.write(r8)
        L_0x0038:
            o.InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver r4 = p040o.InsurancePortfolioActivity.MediaBrowserCompat$ItemReceiver
            if (r3 != r4) goto L_0x003d
            goto L_0x006e
        L_0x003d:
            java.lang.reflect.Method r4 = r3.read
            if (r4 == 0) goto L_0x006e
            java.lang.Class r5 = r8.getClass()
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Object r4 = r4.invoke(r5, r7)
            if (r4 == 0) goto L_0x006e
            java.lang.reflect.Method r5 = r3.MediaBrowserCompat$CustomActionResultReceiver
            if (r5 == 0) goto L_0x006e
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Object r4 = r5.invoke(r4, r7)
            if (r4 == 0) goto L_0x006e
            java.lang.reflect.Method r3 = r3.write
            if (r3 == 0) goto L_0x0065
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Object r3 = r3.invoke(r4, r5)
            goto L_0x0066
        L_0x0065:
            r3 = r1
        L_0x0066:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r1 = r3
        L_0x006c:
            java.lang.String r1 = (java.lang.String) r1
        L_0x006e:
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = r0.MediaBrowserCompat$ItemReceiver()
            goto L_0x008d
        L_0x0075:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = 47
            r3.append(r1)
            java.lang.String r1 = r0.MediaBrowserCompat$ItemReceiver()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x008d:
            java.lang.StackTraceElement r3 = new java.lang.StackTraceElement
            java.lang.String r4 = r0.read()
            java.lang.String r0 = r0.IconCompatParcelizer()
            r3.<init>(r1, r4, r0, r2)
            return r3
        L_0x009b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Debug metadata version mismatch. Expected: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please update the Kotlin standard library."
            r0.append(r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x00c5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlNTBCropDocumentActivity.getStackTraceElement():java.lang.StackTraceElement");
    }
}
