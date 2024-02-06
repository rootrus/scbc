package p040o;

import android.app.ActionBar;
import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import p040o.HmlVerifyIdentifyActivity;
import p040o.zzfy;

/* renamed from: o.PrepaidCashOutCaseModule */
public final class PrepaidCashOutCaseModule {

    /* renamed from: o.PrepaidCashOutCaseModule$write */
    static final class write implements Runnable {
        private /* synthetic */ Activity MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ NsipPaymentCaseModule read;
        private /* synthetic */ MailingAddressReviewOTPActivity write;

        write(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity, Activity activity, NsipPaymentCaseModule nsipPaymentCaseModule) {
            this.write = mailingAddressReviewOTPActivity;
            this.MediaBrowserCompat$ItemReceiver = activity;
            this.read = nsipPaymentCaseModule;
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1 A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00ba A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9 A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0102 A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0107 A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x010a A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0127 A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x015f A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0168 A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0183 A[Catch:{ all -> 0x0191 }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r16 = this;
                r1 = r16
                android.app.Activity r0 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                android.graphics.Point r2 = new android.graphics.Point     // Catch:{ all -> 0x0191 }
                r2.<init>()     // Catch:{ all -> 0x0191 }
                android.view.WindowManager r0 = r0.getWindowManager()     // Catch:{ all -> 0x0191 }
                java.lang.String r3 = "windowManager"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r3)     // Catch:{ all -> 0x0191 }
                android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ all -> 0x0191 }
                r0.getRealSize(r2)     // Catch:{ all -> 0x0191 }
                int r0 = r2.y     // Catch:{ all -> 0x0191 }
                int r2 = r2.x     // Catch:{ all -> 0x0191 }
                o.E2EEEncryptionException r3 = new o.E2EEEncryptionException     // Catch:{ all -> 0x0191 }
                r3.<init>(r0, r2)     // Catch:{ all -> 0x0191 }
                o.PrepaidActivationCaseModule r0 = new o.PrepaidActivationCaseModule     // Catch:{ all -> 0x0191 }
                o.EntityMappingException r5 = new o.EntityMappingException     // Catch:{ all -> 0x0191 }
                android.app.Activity r2 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                java.lang.Integer r2 = p040o.PrepaidCashOutCaseModule.read(r2)     // Catch:{ all -> 0x0191 }
                r4 = -9999999(0xffffffffff676981, float:-3.0759947E38)
                if (r2 == 0) goto L_0x0036
                int r2 = r2.intValue()     // Catch:{ all -> 0x0191 }
                goto L_0x0037
            L_0x0036:
                r2 = r4
            L_0x0037:
                r6 = 0
                r7 = 0
                if (r2 < 0) goto L_0x0041
                o.PrepaidResetCaseModule r8 = new o.PrepaidResetCaseModule     // Catch:{ all -> 0x0191 }
                r8.<init>(r6, r2, r4, r4)     // Catch:{ all -> 0x0191 }
                goto L_0x0042
            L_0x0041:
                r8 = r7
            L_0x0042:
                o.E2EEEncryptionException r2 = new o.E2EEEncryptionException     // Catch:{ all -> 0x0191 }
                android.app.Activity r9 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                java.lang.Integer r9 = p040o.PrepaidCashOutCaseModule.read(r9)     // Catch:{ all -> 0x0191 }
                if (r9 == 0) goto L_0x0051
                int r9 = r9.intValue()     // Catch:{ all -> 0x0191 }
                goto L_0x0052
            L_0x0051:
                r9 = r4
            L_0x0052:
                r10 = 2
                r2.<init>(r9, r6, r10)     // Catch:{ all -> 0x0191 }
                r5.<init>(r8, r2)     // Catch:{ all -> 0x0191 }
                o.NsipPaymentCaseModule r2 = r1.read     // Catch:{ all -> 0x0191 }
                o.EasycashLoanFeatureInfoCaseModule r8 = new o.EasycashLoanFeatureInfoCaseModule     // Catch:{ all -> 0x0191 }
                android.app.Activity r9 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                boolean r9 = r9 instanceof androidx.appcompat.app.AppCompatActivity     // Catch:{ all -> 0x0191 }
                if (r9 == 0) goto L_0x008b
                android.app.Activity r9 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                androidx.appcompat.app.AppCompatActivity r9 = (androidx.appcompat.app.AppCompatActivity) r9     // Catch:{ all -> 0x0191 }
                r11 = r9
                android.app.Activity r11 = (android.app.Activity) r11     // Catch:{ all -> 0x0191 }
                java.lang.Integer r11 = p040o.PrepaidCashOutCaseModule.read(r11)     // Catch:{ all -> 0x0191 }
                if (r11 == 0) goto L_0x0075
                int r11 = r11.intValue()     // Catch:{ all -> 0x0191 }
                goto L_0x0076
            L_0x0075:
                r11 = r6
            L_0x0076:
                o.E2EEEncryptionException r9 = p040o.PrepaidCashOutCaseModule.MediaBrowserCompat$ItemReceiver(r9)     // Catch:{ all -> 0x0191 }
                if (r9 == 0) goto L_0x0080
                int r9 = r9.read     // Catch:{ all -> 0x0191 }
                int r9 = r9 + r11
                goto L_0x0081
            L_0x0080:
                r9 = r6
            L_0x0081:
                if (r11 > r9) goto L_0x0089
                o.PrepaidResetCaseModule r12 = new o.PrepaidResetCaseModule     // Catch:{ all -> 0x0191 }
                r12.<init>(r11, r9, r4, r4)     // Catch:{ all -> 0x0191 }
                goto L_0x00ab
            L_0x0089:
                r12 = r7
                goto L_0x00ab
            L_0x008b:
                android.app.Activity r9 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                java.lang.Integer r11 = p040o.PrepaidCashOutCaseModule.read(r9)     // Catch:{ all -> 0x0191 }
                if (r11 == 0) goto L_0x0098
                int r11 = r11.intValue()     // Catch:{ all -> 0x0191 }
                goto L_0x0099
            L_0x0098:
                r11 = r6
            L_0x0099:
                o.E2EEEncryptionException r9 = p040o.PrepaidCashOutCaseModule.MediaBrowserCompat$CustomActionResultReceiver(r9)     // Catch:{ all -> 0x0191 }
                if (r9 == 0) goto L_0x00a3
                int r9 = r9.read     // Catch:{ all -> 0x0191 }
                int r9 = r9 + r11
                goto L_0x00a4
            L_0x00a3:
                r9 = r6
            L_0x00a4:
                if (r11 > r9) goto L_0x0089
                o.PrepaidResetCaseModule r12 = new o.PrepaidResetCaseModule     // Catch:{ all -> 0x0191 }
                r12.<init>(r11, r9, r4, r4)     // Catch:{ all -> 0x0191 }
            L_0x00ab:
                android.app.Activity r4 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                boolean r4 = r4 instanceof androidx.appcompat.app.AppCompatActivity     // Catch:{ all -> 0x0191 }
                if (r4 == 0) goto L_0x00ba
                android.app.Activity r4 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4     // Catch:{ all -> 0x0191 }
                o.E2EEEncryptionException r4 = p040o.PrepaidCashOutCaseModule.MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ all -> 0x0191 }
                goto L_0x00c0
            L_0x00ba:
                android.app.Activity r4 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                o.E2EEEncryptionException r4 = p040o.PrepaidCashOutCaseModule.MediaBrowserCompat$CustomActionResultReceiver(r4)     // Catch:{ all -> 0x0191 }
            L_0x00c0:
                r8.<init>(r12, r4)     // Catch:{ all -> 0x0191 }
                int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0191 }
                r9 = 23
                if (r4 < r9) goto L_0x00f7
                android.app.Activity r4 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                if (r4 == 0) goto L_0x00d8
                android.view.Window r4 = r4.getWindow()     // Catch:{ all -> 0x0191 }
                if (r4 == 0) goto L_0x00d8
                android.view.View r4 = r4.getDecorView()     // Catch:{ all -> 0x0191 }
                goto L_0x00d9
            L_0x00d8:
                r4 = r7
            L_0x00d9:
                if (r4 == 0) goto L_0x00f7
                android.view.WindowInsets r4 = r4.getRootWindowInsets()     // Catch:{ all -> 0x0191 }
                if (r4 == 0) goto L_0x00f7
                int r9 = r4.getStableInsetTop()     // Catch:{ all -> 0x0191 }
                int r11 = r4.getStableInsetBottom()     // Catch:{ all -> 0x0191 }
                int r12 = r4.getStableInsetLeft()     // Catch:{ all -> 0x0191 }
                int r4 = r4.getStableInsetRight()     // Catch:{ all -> 0x0191 }
                o.PrepaidTravelWalletCaseModule r13 = new o.PrepaidTravelWalletCaseModule     // Catch:{ all -> 0x0191 }
                r13.<init>(r9, r11, r12, r4)     // Catch:{ all -> 0x0191 }
                goto L_0x00f8
            L_0x00f7:
                r13 = r7
            L_0x00f8:
                android.app.Activity r4 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                if (r4 == 0) goto L_0x0107
                android.view.Window r4 = r4.getWindow()     // Catch:{ all -> 0x0191 }
                if (r4 == 0) goto L_0x0107
                android.view.View r4 = r4.getDecorView()     // Catch:{ all -> 0x0191 }
                goto L_0x0108
            L_0x0107:
                r4 = r7
            L_0x0108:
                if (r4 == 0) goto L_0x0127
                android.graphics.Rect r9 = new android.graphics.Rect     // Catch:{ all -> 0x0191 }
                r9.<init>()     // Catch:{ all -> 0x0191 }
                r4.getWindowVisibleDisplayFrame(r9)     // Catch:{ all -> 0x0191 }
                int r4 = r9.top     // Catch:{ all -> 0x0191 }
                int r11 = r9.bottom     // Catch:{ all -> 0x0191 }
                int r12 = r9.left     // Catch:{ all -> 0x0191 }
                int r9 = r9.right     // Catch:{ all -> 0x0191 }
                if (r12 > r9) goto L_0x0124
                if (r4 > r11) goto L_0x0124
                o.PrepaidResetCaseModule r14 = new o.PrepaidResetCaseModule     // Catch:{ all -> 0x0191 }
                r14.<init>(r4, r11, r12, r9)     // Catch:{ all -> 0x0191 }
                goto L_0x0125
            L_0x0124:
                r14 = r7
            L_0x0125:
                r9 = r14
                goto L_0x0128
            L_0x0127:
                r9 = r7
            L_0x0128:
                o.RetrofitException r11 = new o.RetrofitException     // Catch:{ all -> 0x0191 }
                int r4 = r3.read     // Catch:{ all -> 0x0191 }
                int r12 = r3.IconCompatParcelizer     // Catch:{ all -> 0x0191 }
                if (r12 < 0) goto L_0x0137
                if (r4 < 0) goto L_0x0137
                o.PrepaidResetCaseModule r7 = new o.PrepaidResetCaseModule     // Catch:{ all -> 0x0191 }
                r7.<init>(r6, r4, r6, r12)     // Catch:{ all -> 0x0191 }
            L_0x0137:
                r11.<init>(r7, r3)     // Catch:{ all -> 0x0191 }
                android.app.Activity r3 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                android.view.Window r3 = r3.getWindow()     // Catch:{ all -> 0x0191 }
                java.lang.String r4 = "window"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0191 }
                android.view.WindowManager$LayoutParams r3 = r3.getAttributes()     // Catch:{ all -> 0x0191 }
                int r3 = r3.flags     // Catch:{ all -> 0x0191 }
                o.EasycashMHMCDetailCaseModule r12 = new o.EasycashMHMCDetailCaseModule     // Catch:{ all -> 0x0191 }
                android.app.Activity r4 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                android.content.res.Resources r7 = r4.getResources()     // Catch:{ all -> 0x0191 }
                java.lang.String r14 = "navigation_bar_height"
                java.lang.String r15 = "dimen"
                java.lang.String r6 = "android"
                int r6 = r7.getIdentifier(r14, r15, r6)     // Catch:{ all -> 0x0191 }
                if (r6 <= 0) goto L_0x0168
                android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0191 }
                int r4 = r4.getDimensionPixelSize(r6)     // Catch:{ all -> 0x0191 }
                goto L_0x0169
            L_0x0168:
                r4 = 0
            L_0x0169:
                o.E2EEEncryptionException r6 = new o.E2EEEncryptionException     // Catch:{ all -> 0x0191 }
                r7 = 0
                r6.<init>(r4, r7, r10)     // Catch:{ all -> 0x0191 }
                r12.<init>(r6)     // Catch:{ all -> 0x0191 }
                r4 = r0
                r6 = r2
                r7 = r8
                r8 = r13
                r10 = r11
                r11 = r3
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0191 }
                o.MailingAddressReviewOTPActivity r2 = r1.write     // Catch:{ all -> 0x0191 }
                boolean r2 = r2.IconCompatParcelizer()     // Catch:{ all -> 0x0191 }
                if (r2 == 0) goto L_0x01b1
                o.MailingAddressReviewOTPActivity r2 = r1.write     // Catch:{ all -> 0x0191 }
                o.HmlNTBPromptPayNotFoundActivity r2 = (p040o.HmlNTBPromptPayNotFoundActivity) r2     // Catch:{ all -> 0x0191 }
                o.HmlVerifyIdentifyActivity$IconCompatParcelizer r3 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0191 }
                java.lang.Object r0 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r0)     // Catch:{ all -> 0x0191 }
                r2.resumeWith(r0)     // Catch:{ all -> 0x0191 }
                return
            L_0x0191:
                r0 = move-exception
                o.MailingAddressReviewOTPActivity r2 = r1.write
                boolean r2 = r2.IconCompatParcelizer()
                if (r2 == 0) goto L_0x01b1
                o.MailingAddressReviewOTPActivity r2 = r1.write
                o.HmlNTBPromptPayNotFoundActivity r2 = (p040o.HmlNTBPromptPayNotFoundActivity) r2
                o.HmlVerifyIdentifyActivity$IconCompatParcelizer r3 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver
                java.lang.String r3 = "exception"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r3)
                o.HmlVerifyIdentifyActivity$write r3 = new o.HmlVerifyIdentifyActivity$write
                r3.<init>(r0)
                java.lang.Object r0 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r3)
                r2.resumeWith(r0)
            L_0x01b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidCashOutCaseModule.write.run():void");
        }
    }

    /* renamed from: o.PrepaidCashOutCaseModule$read */
    static final class read implements Runnable {
        private /* synthetic */ View MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ MailingAddressReviewOTPActivity MediaBrowserCompat$ItemReceiver;

        read(MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity, View view) {
            this.MediaBrowserCompat$ItemReceiver = mailingAddressReviewOTPActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = view;
        }

        public final void run() {
            try {
                PrepaidResetCaseModule prepaidResetCaseModule = new PrepaidResetCaseModule(this.MediaBrowserCompat$CustomActionResultReceiver.getTop(), this.MediaBrowserCompat$CustomActionResultReceiver.getBottom(), this.MediaBrowserCompat$CustomActionResultReceiver.getLeft(), this.MediaBrowserCompat$CustomActionResultReceiver.getRight());
                if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
                    HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                    this.MediaBrowserCompat$ItemReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(prepaidResetCaseModule));
                }
            } catch (Throwable th) {
                if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
                    HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                    onGetStartedClick.write((Object) th, "exception");
                    this.MediaBrowserCompat$ItemReceiver.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
                }
            }
        }
    }

    static final Integer read(Activity activity) {
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return Integer.valueOf(activity.getResources().getDimensionPixelSize(identifier));
        }
        return null;
    }

    static final E2EEEncryptionException MediaBrowserCompat$ItemReceiver(AppCompatActivity appCompatActivity) {
        Keep B_ = appCompatActivity.mo11B_();
        if (B_ == null) {
            return null;
        }
        onGetStartedClick.IconCompatParcelizer((Object) B_, "bar");
        return new E2EEEncryptionException(B_.read(), 0, 2);
    }

    static final E2EEEncryptionException MediaBrowserCompat$CustomActionResultReceiver(Activity activity) {
        ActionBar actionBar = activity.getActionBar();
        if (actionBar == null) {
            return null;
        }
        onGetStartedClick.IconCompatParcelizer((Object) actionBar, "bar");
        return new E2EEEncryptionException(actionBar.getHeight(), 0, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = r1.getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final android.view.View IconCompatParcelizer(android.app.Activity r1) {
        /*
            r0 = 0
            if (r1 == 0) goto L_0x001a
            if (r1 == 0) goto L_0x0010
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L_0x0010
            android.view.View r1 = r1.getDecorView()
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            if (r1 == 0) goto L_0x001a
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidCashOutCaseModule.IconCompatParcelizer(android.app.Activity):android.view.View");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0134 A[SYNTHETIC, Splitter:B:66:0x0134] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0171 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0172 A[PHI: r12 
      PHI: (r12v2 java.lang.Object) = (r12v4 java.lang.Object), (r12v1 java.lang.Object) binds: [B:75:0x016f, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object read(android.app.Activity r11, p040o.HmlNTBPromptPayNotFoundActivity<? super p040o.PrepaidActivationCaseModule> r12) {
        /*
            boolean r0 = r12 instanceof p040o.PrepaidCashOutCaseModule$MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0014
            r0 = r12
            o.PrepaidCashOutCaseModule$MediaBrowserCompat$ItemReceiver r0 = (p040o.PrepaidCashOutCaseModule$MediaBrowserCompat$ItemReceiver) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.read
            int r12 = r12 + r2
            r0.read = r12
            goto L_0x0019
        L_0x0014:
            o.PrepaidCashOutCaseModule$MediaBrowserCompat$ItemReceiver r0 = new o.PrepaidCashOutCaseModule$MediaBrowserCompat$ItemReceiver
            r0.<init>(r12)
        L_0x0019:
            java.lang.Object r12 = r0.MediaBrowserCompat$ItemReceiver
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.read
            r3 = 3
            r4 = 2
            java.lang.String r5 = "frame"
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r7) goto L_0x0053
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            boolean r11 = r12 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r11 != 0) goto L_0x0033
            goto L_0x0172
        L_0x0033:
            o.HmlVerifyIdentifyActivity$write r12 = (p040o.HmlVerifyIdentifyActivity.write) r12
            java.lang.Throwable r11 = r12.read
            throw r11
        L_0x0038:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0040:
            java.lang.Object r11 = r0.IconCompatParcelizer
            o.PrepaidResetCaseModule r11 = (p040o.PrepaidResetCaseModule) r11
            java.lang.Object r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r4 = r12 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r4 != 0) goto L_0x004e
            goto L_0x00fe
        L_0x004e:
            o.HmlVerifyIdentifyActivity$write r12 = (p040o.HmlVerifyIdentifyActivity.write) r12
            java.lang.Throwable r11 = r12.read
            throw r11
        L_0x0053:
            java.lang.Object r11 = r0.write
            android.app.Activity r11 = (android.app.Activity) r11
            java.lang.Object r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r8 = r12 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r8 != 0) goto L_0x0060
            goto L_0x00b0
        L_0x0060:
            o.HmlVerifyIdentifyActivity$write r12 = (p040o.HmlVerifyIdentifyActivity.write) r12
            java.lang.Throwable r11 = r12.read
            throw r11
        L_0x0065:
            boolean r2 = r12 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x0173
            if (r11 == 0) goto L_0x010d
            android.view.View r12 = IconCompatParcelizer((android.app.Activity) r11)
            if (r12 == 0) goto L_0x00b3
            r0.MediaBrowserCompat$CustomActionResultReceiver = r11
            r0.write = r11
            r0.read = r7
            o.MailingAddressReviewActivity r2 = new o.MailingAddressReviewActivity
            o.HmlNTBPromptPayNotFoundActivity r8 = p040o.HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(r0)
            r2.<init>(r8, r7)
            r8 = r2
            o.MailingAddressReviewOTPActivity r8 = (p040o.MailingAddressReviewOTPActivity) r8
            boolean r9 = r8.IconCompatParcelizer()
            if (r9 == 0) goto L_0x00a1
            if (r12 != 0) goto L_0x0097
            o.HmlNTBPromptPayNotFoundActivity r8 = (p040o.HmlNTBPromptPayNotFoundActivity) r8
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r12 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver
            java.lang.Object r12 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r6)
            r8.resumeWith(r12)
            goto L_0x00a1
        L_0x0097:
            o.PrepaidCashOutCaseModule$read r9 = new o.PrepaidCashOutCaseModule$read
            r9.<init>(r8, r12)
            java.lang.Runnable r9 = (java.lang.Runnable) r9
            r12.post(r9)
        L_0x00a1:
            java.lang.Object r12 = r2.MediaBrowserCompat$CustomActionResultReceiver()
            o.HmlPromptPayVerificationActivity_ViewBinding r2 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            if (r12 != r2) goto L_0x00ac
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r5)
        L_0x00ac:
            if (r12 != r1) goto L_0x00af
            return r1
        L_0x00af:
            r2 = r11
        L_0x00b0:
            o.PrepaidResetCaseModule r12 = (p040o.PrepaidResetCaseModule) r12
            goto L_0x00b5
        L_0x00b3:
            r2 = r11
            r12 = r6
        L_0x00b5:
            android.view.View r8 = IconCompatParcelizer((android.app.Activity) r11)
            if (r8 == 0) goto L_0x0105
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            r0.write = r11
            r0.IconCompatParcelizer = r12
            r0.read = r4
            o.MailingAddressReviewActivity r11 = new o.MailingAddressReviewActivity
            o.HmlNTBPromptPayNotFoundActivity r4 = p040o.HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(r0)
            r11.<init>(r4, r7)
            r4 = r11
            o.MailingAddressReviewOTPActivity r4 = (p040o.MailingAddressReviewOTPActivity) r4
            if (r8 != 0) goto L_0x00e3
            boolean r8 = r4.IconCompatParcelizer()
            if (r8 == 0) goto L_0x00ed
            o.HmlNTBPromptPayNotFoundActivity r4 = (p040o.HmlNTBPromptPayNotFoundActivity) r4
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r8 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver
            java.lang.Object r8 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r6)
            r4.resumeWith(r8)
            goto L_0x00ed
        L_0x00e3:
            o.PrepaidCashOutCaseModule$MediaBrowserCompat$CustomActionResultReceiver r9 = new o.PrepaidCashOutCaseModule$MediaBrowserCompat$CustomActionResultReceiver
            r9.<init>(r4, r8, r7)
            java.lang.Runnable r9 = (java.lang.Runnable) r9
            r8.post(r9)
        L_0x00ed:
            java.lang.Object r11 = r11.MediaBrowserCompat$CustomActionResultReceiver()
            o.HmlPromptPayVerificationActivity_ViewBinding r4 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            if (r11 != r4) goto L_0x00f8
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r5)
        L_0x00f8:
            if (r11 != r1) goto L_0x00fb
            return r1
        L_0x00fb:
            r10 = r12
            r12 = r11
            r11 = r10
        L_0x00fe:
            o.E2EEEncryptionException r12 = (p040o.E2EEEncryptionException) r12
            r10 = r12
            r12 = r11
            r11 = r2
            r2 = r10
            goto L_0x0107
        L_0x0105:
            r11 = r2
            r2 = r6
        L_0x0107:
            o.NsipPaymentCaseModule r4 = new o.NsipPaymentCaseModule
            r4.<init>(r12, r2)
            goto L_0x010e
        L_0x010d:
            r4 = r6
        L_0x010e:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r11
            r0.write = r4
            r0.read = r3
            o.MailingAddressReviewActivity r12 = new o.MailingAddressReviewActivity
            o.HmlNTBPromptPayNotFoundActivity r2 = p040o.HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(r0)
            r12.<init>(r2, r7)
            r2 = r12
            o.MailingAddressReviewOTPActivity r2 = (p040o.MailingAddressReviewOTPActivity) r2
            if (r11 != 0) goto L_0x0134
            boolean r11 = r2.IconCompatParcelizer()
            if (r11 == 0) goto L_0x0164
            o.HmlNTBPromptPayNotFoundActivity r2 = (p040o.HmlNTBPromptPayNotFoundActivity) r2
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r11 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver
            java.lang.Object r11 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r6)
            r2.resumeWith(r11)
            goto L_0x0164
        L_0x0134:
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0148 }
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0148 }
            r3.<init>(r6)     // Catch:{ all -> 0x0148 }
            o.PrepaidCashOutCaseModule$write r6 = new o.PrepaidCashOutCaseModule$write     // Catch:{ all -> 0x0148 }
            r6.<init>(r2, r11, r4)     // Catch:{ all -> 0x0148 }
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch:{ all -> 0x0148 }
            r3.post(r6)     // Catch:{ all -> 0x0148 }
            goto L_0x0164
        L_0x0148:
            r11 = move-exception
            boolean r3 = r2.IconCompatParcelizer()
            if (r3 == 0) goto L_0x0164
            o.HmlNTBPromptPayNotFoundActivity r2 = (p040o.HmlNTBPromptPayNotFoundActivity) r2
            o.HmlVerifyIdentifyActivity$IconCompatParcelizer r3 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver
            java.lang.String r3 = "exception"
            p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r3)
            o.HmlVerifyIdentifyActivity$write r3 = new o.HmlVerifyIdentifyActivity$write
            r3.<init>(r11)
            java.lang.Object r11 = p040o.HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(r3)
            r2.resumeWith(r11)
        L_0x0164:
            java.lang.Object r12 = r12.MediaBrowserCompat$CustomActionResultReceiver()
            o.HmlPromptPayVerificationActivity_ViewBinding r11 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            if (r12 != r11) goto L_0x016f
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r5)
        L_0x016f:
            if (r12 != r1) goto L_0x0172
            return r1
        L_0x0172:
            return r12
        L_0x0173:
            o.HmlVerifyIdentifyActivity$write r12 = (p040o.HmlVerifyIdentifyActivity.write) r12
            java.lang.Throwable r11 = r12.read
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PrepaidCashOutCaseModule.read(android.app.Activity, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }

    public static zzfy.zze IconCompatParcelizer(getEndOpacity getendopacity) {
        onGetStartedClick.write((Object) getendopacity, "entity");
        TransformKeyframeAnimation transformKeyframeAnimation = getendopacity.IconCompatParcelizer;
        String str = null;
        String str2 = transformKeyframeAnimation != null ? transformKeyframeAnimation.write : null;
        TransformKeyframeAnimation transformKeyframeAnimation2 = getendopacity.IconCompatParcelizer;
        if (transformKeyframeAnimation2 != null) {
            str = transformKeyframeAnimation2.MediaBrowserCompat$ItemReceiver;
        }
        return new zzfy.zze(str2, str, getendopacity.read);
    }
}
