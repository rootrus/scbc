package p040o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.thunderhead.messaging.CloudMessagingManager;
import java.lang.ref.WeakReference;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.setDropDownHorizontalOffset;

/* renamed from: o.FragmentBuilder_BindScheduleBulkTransferFragment */
public final class FragmentBuilder_BindScheduleBulkTransferFragment implements FragmentBuilder_BindSetupQuickPromptPayFragment, FragmentBuilder_BindSetupQuickBalanceFragment, FragmentBuilder_BindSharingMomentsPreviewFragment {
    private final WeakReference<Context> IconCompatParcelizer;
    private final FragmentBuilder_BindSelectAccountFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final List<FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity>> MediaBrowserCompat$ItemReceiver;
    private final BasePartialSearchActivity_ViewBinding read;
    private final FragmentBuilder_BindSecondaryTabsFragment write;

    /* renamed from: o.FragmentBuilder_BindScheduleBulkTransferFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends HmlDocumentSubmissionTutorialsActivity {
        int IconCompatParcelizer;
        boolean MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ FragmentBuilder_BindScheduleBulkTransferFragment MediaBrowserCompat$ItemReceiver;
        /* synthetic */ Object write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(FragmentBuilder_BindScheduleBulkTransferFragment fragmentBuilder_BindScheduleBulkTransferFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
            super(hmlNTBPromptPayNotFoundActivity);
            this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindScheduleBulkTransferFragment;
        }

        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= PKIFailureInfo.systemUnavail;
            return this.MediaBrowserCompat$ItemReceiver.read(false, this);
        }
    }

    /* renamed from: o.FragmentBuilder_BindScheduleBulkTransferFragment$read */
    static final class read extends HmlDocumentSubmissionTutorialsActivity {
        Object IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ FragmentBuilder_BindScheduleBulkTransferFragment read;
        /* synthetic */ Object write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(FragmentBuilder_BindScheduleBulkTransferFragment fragmentBuilder_BindScheduleBulkTransferFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
            super(hmlNTBPromptPayNotFoundActivity);
            this.read = fragmentBuilder_BindScheduleBulkTransferFragment;
        }

        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.MediaBrowserCompat$CustomActionResultReceiver |= PKIFailureInfo.systemUnavail;
            return this.read.IconCompatParcelizer((String) null, this);
        }
    }

    /* renamed from: o.FragmentBuilder_BindScheduleBulkTransferFragment$write */
    static final class write extends HmlDocumentSubmissionTutorialsActivity {
        Object IconCompatParcelizer;
        private /* synthetic */ FragmentBuilder_BindScheduleBulkTransferFragment MediaBrowserCompat$CustomActionResultReceiver;
        Object MediaBrowserCompat$ItemReceiver;
        /* synthetic */ Object read;
        int write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(FragmentBuilder_BindScheduleBulkTransferFragment fragmentBuilder_BindScheduleBulkTransferFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
            super(hmlNTBPromptPayNotFoundActivity);
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindScheduleBulkTransferFragment;
        }

        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.write |= PKIFailureInfo.systemUnavail;
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((FragmentBuilder_BindHmlNtbOutcomeRejectFragment) null, (FragmentBuilder_BindHmlOperatingBankFragment) null, this);
        }
    }

    public FragmentBuilder_BindScheduleBulkTransferFragment(Context context, BasePartialSearchActivity_ViewBinding basePartialSearchActivity_ViewBinding, List<? extends FundFactSheetActivity<? super Context, HmlVerifyPhoneValidateOtpActivity>> list, FragmentBuilder_BindSelectAccountFragment fragmentBuilder_BindSelectAccountFragment, FragmentBuilder_BindSecondaryTabsFragment fragmentBuilder_BindSecondaryTabsFragment) {
        onGetStartedClick.write((Object) list, "apiInitStrategies");
        onGetStartedClick.write((Object) fragmentBuilder_BindSelectAccountFragment, "appIconStrategy");
        onGetStartedClick.write((Object) fragmentBuilder_BindSecondaryTabsFragment, "appIconColorStrategy");
        this.read = basePartialSearchActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSelectAccountFragment;
        this.write = fragmentBuilder_BindSecondaryTabsFragment;
        this.IconCompatParcelizer = new WeakReference<>(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r0 != null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object write() {
        /*
            r3 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r3.IconCompatParcelizer
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L_0x0033
            java.util.List<o.FundFactSheetActivity<android.content.Context, o.HmlVerifyPhoneValidateOtpActivity>> r1 = r3.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0025 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ Exception -> 0x0025 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0025 }
        L_0x0012:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0025 }
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0025 }
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2     // Catch:{ Exception -> 0x0025 }
            r2.invoke(r0)     // Catch:{ Exception -> 0x0025 }
            goto L_0x0012
        L_0x0022:
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0025 }
            goto L_0x0031
        L_0x0025:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r0 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.INIT_ERROR
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0
            boolean r0 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0031:
            if (r0 != 0) goto L_0x003f
        L_0x0033:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r0 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.CONTEXT_REQUIRED
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0
            boolean r0 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x003f:
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x0044
            return r0
        L_0x0044:
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindScheduleBulkTransferFragment.write():java.lang.Object");
    }

    public final void IconCompatParcelizer(ManageRecipientGroupActivity manageRecipientGroupActivity) {
        PendingIntent pendingIntent;
        onGetStartedClick.write((Object) manageRecipientGroupActivity, C8183f.f4230JO);
        try {
            Context context = this.IconCompatParcelizer.get();
            if (context != null) {
                Integer read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read(context);
                if (read2 == null) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationSuccessFragment.MISSING_APP_ICON);
                    return;
                }
                Integer IconCompatParcelizer2 = this.write.IconCompatParcelizer(context);
                if (IconCompatParcelizer2 == null) {
                    IconCompatParcelizer2 = 17170443;
                }
                onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "appIconColorStrategy.get… ?: android.R.color.white");
                int intValue = IconCompatParcelizer2.intValue();
                onGetStartedClick.IconCompatParcelizer((Object) context, "context");
                CharSequence applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
                setDropDownHorizontalOffset.IconCompatParcelizer iconCompatParcelizer = new setDropDownHorizontalOffset.IconCompatParcelizer(context, "THUNDERHEAD_MESSAGING_CHANNEL_ID");
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(read2.intValue());
                iconCompatParcelizer.read(setLastBaselineToBottomHeight.read(context, intValue));
                iconCompatParcelizer.IconCompatParcelizer(applicationLabel);
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver((CharSequence) manageRecipientGroupActivity.IconCompatParcelizer);
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(true);
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(0);
                Context context2 = this.IconCompatParcelizer.get();
                if (context2 != null) {
                    Intent intent = new Intent(context2, CloudMessagingManager.UserNotificationInteractionReceiver.class);
                    intent.putExtra("ONE_CLOUD_MESSAGE", manageRecipientGroupActivity);
                    intent.setAction("com.thunderhead.sdk.ONE_PUSH_NOTIFICATION_INTENT_ACTION");
                    pendingIntent = PendingIntent.getBroadcast(context2, 0, intent, 134217728);
                } else {
                    pendingIntent = null;
                }
                iconCompatParcelizer.IconCompatParcelizer(pendingIntent);
                setPopupBackgroundResource.MediaBrowserCompat$CustomActionResultReceiver(context).write(manageRecipientGroupActivity.write, iconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
                return;
            }
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationSuccessFragment.CONTEXT_REQUIRED);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindManageEmailVerificationSuccessFragment.SHOW_ERROR);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object IconCompatParcelizer(p040o.HmlNTBPromptPayNotFoundActivity<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p040o.C6764x377d6d91
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$ItemReceiver r0 = (p040o.C6764x377d6d91) r0
            int r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r6 + r2
            r0.MediaBrowserCompat$CustomActionResultReceiver = r6
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$ItemReceiver r0 = new o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$ItemReceiver
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.read
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            boolean r0 = r6 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x005b }
            if (r0 != 0) goto L_0x002a
            goto L_0x0054
        L_0x002a:
            o.HmlVerifyIdentifyActivity$write r6 = (p040o.HmlVerifyIdentifyActivity.write) r6     // Catch:{ Exception -> 0x005b }
            java.lang.Throwable r6 = r6.read     // Catch:{ Exception -> 0x005b }
            throw r6     // Catch:{ Exception -> 0x005b }
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            boolean r2 = r6 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x0068
            o.BasePartialSearchActivity_ViewBinding r6 = r5.read     // Catch:{ Exception -> 0x005b }
            if (r6 != 0) goto L_0x0047
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r6 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.PREFERENCES_NULL     // Catch:{ Exception -> 0x005b }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6     // Catch:{ Exception -> 0x005b }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)     // Catch:{ Exception -> 0x005b }
            goto L_0x0063
        L_0x0047:
            o.BasePartialSearchActivity_ViewBinding r6 = r5.read     // Catch:{ Exception -> 0x005b }
            r0.MediaBrowserCompat$CustomActionResultReceiver = r3     // Catch:{ Exception -> 0x005b }
            java.lang.String r0 = "messaging_enabled"
            java.lang.Object r6 = r6.MediaBrowserCompat$ItemReceiver((java.lang.String) r0, (boolean) r4)     // Catch:{ Exception -> 0x005b }
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ Exception -> 0x005b }
            boolean r4 = r6.booleanValue()     // Catch:{ Exception -> 0x005b }
            goto L_0x0063
        L_0x005b:
            r6 = move-exception
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r0 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.ENABLE_MESSAGING_ERROR
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0
            p040o.MyECouponActivity_ViewBinding.read(r6, r0)
        L_0x0063:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L_0x0068:
            o.HmlVerifyIdentifyActivity$write r6 = (p040o.HmlVerifyIdentifyActivity.write) r6
            java.lang.Throwable r6 = r6.read
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindScheduleBulkTransferFragment.IconCompatParcelizer(o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[Catch:{ Exception -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ Exception -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068 A[Catch:{ Exception -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object MediaBrowserCompat$ItemReceiver(p040o.HmlNTBPromptPayNotFoundActivity<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p040o.C6763x7d82b342
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$CustomActionResultReceiver r0 = (p040o.C6763x7d82b342) r0
            int r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r6 + r2
            r0.MediaBrowserCompat$CustomActionResultReceiver = r6
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$CustomActionResultReceiver
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.write
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            boolean r0 = r6 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x0077 }
            if (r0 != 0) goto L_0x002a
            goto L_0x0056
        L_0x002a:
            o.HmlVerifyIdentifyActivity$write r6 = (p040o.HmlVerifyIdentifyActivity.write) r6     // Catch:{ Exception -> 0x0077 }
            java.lang.Throwable r6 = r6.read     // Catch:{ Exception -> 0x0077 }
            throw r6     // Catch:{ Exception -> 0x0077 }
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            boolean r2 = r6 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x007f
            o.BasePartialSearchActivity_ViewBinding r6 = r5.read     // Catch:{ Exception -> 0x0077 }
            if (r6 != 0) goto L_0x0047
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r6 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.PREFERENCES_NULL     // Catch:{ Exception -> 0x0077 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6     // Catch:{ Exception -> 0x0077 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)     // Catch:{ Exception -> 0x0077 }
            goto L_0x007e
        L_0x0047:
            o.BasePartialSearchActivity_ViewBinding r6 = r5.read     // Catch:{ Exception -> 0x0077 }
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4     // Catch:{ Exception -> 0x0077 }
            java.lang.String r0 = "push_token"
            java.lang.String r2 = ""
            java.lang.Object r6 = r6.MediaBrowserCompat$ItemReceiver((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0077 }
            if (r6 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0077 }
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0077 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0077 }
            r2 = 0
            if (r1 <= 0) goto L_0x0065
            r1 = r4
            goto L_0x0066
        L_0x0065:
            r1 = r2
        L_0x0066:
            if (r1 == 0) goto L_0x0073
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r1 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.TOKEN_RETRIEVED_FROM_PREFERENCES     // Catch:{ Exception -> 0x0077 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r1 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r1     // Catch:{ Exception -> 0x0077 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0077 }
            r4[r2] = r0     // Catch:{ Exception -> 0x0077 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r1, r4)     // Catch:{ Exception -> 0x0077 }
        L_0x0073:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0077 }
            r3 = r6
            goto L_0x007e
        L_0x0077:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r6 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.GET_TOKEN_ERROR
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)
        L_0x007e:
            return r3
        L_0x007f:
            o.HmlVerifyIdentifyActivity$write r6 = (p040o.HmlVerifyIdentifyActivity.write) r6
            java.lang.Throwable r6 = r6.read
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindScheduleBulkTransferFragment.MediaBrowserCompat$ItemReceiver(o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object MediaBrowserCompat$CustomActionResultReceiver(p040o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r7, p040o.FragmentBuilder_BindHmlOperatingBankFragment r8, p040o.HmlNTBPromptPayNotFoundActivity<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p040o.FragmentBuilder_BindScheduleBulkTransferFragment.write
            if (r0 == 0) goto L_0x0014
            r0 = r9
            o.FragmentBuilder_BindScheduleBulkTransferFragment$write r0 = (p040o.FragmentBuilder_BindScheduleBulkTransferFragment.write) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r9 = r0.write
            int r9 = r9 + r2
            r0.write = r9
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindScheduleBulkTransferFragment$write r0 = new o.FragmentBuilder_BindScheduleBulkTransferFragment$write
            r0.<init>(r6, r9)
        L_0x0019:
            java.lang.Object r9 = r0.read
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.write
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r7 = r0.MediaBrowserCompat$ItemReceiver
            o.FragmentBuilder_BindHmlOperatingBankFragment r7 = (p040o.FragmentBuilder_BindHmlOperatingBankFragment) r7
            java.lang.Object r8 = r0.IconCompatParcelizer
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r8 = (p040o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment) r8
            boolean r0 = r9 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r0 != 0) goto L_0x0035
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0064
        L_0x0035:
            o.HmlVerifyIdentifyActivity$write r9 = (p040o.HmlVerifyIdentifyActivity.write) r9
            java.lang.Throwable r7 = r9.read
            throw r7
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0042:
            boolean r2 = r9 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x0099
            if (r8 == 0) goto L_0x0094
            if (r7 == 0) goto L_0x0094
            o.BasePartialSearchActivity_ViewBinding r9 = r6.read
            if (r9 != 0) goto L_0x004f
            goto L_0x0094
        L_0x004f:
            java.lang.String r9 = p040o.FragmentBuilder_BindSelectRecipientFromFavouriteFragment.MediaBrowserCompat$CustomActionResultReceiver(r7, r8)
            if (r9 == 0) goto L_0x0075
            o.BasePartialSearchActivity_ViewBinding r2 = r6.read
            r0.IconCompatParcelizer = r7
            r0.MediaBrowserCompat$ItemReceiver = r8
            r0.write = r3
            java.lang.Object r9 = r2.MediaBrowserCompat$ItemReceiver((java.lang.String) r9, (boolean) r4)
            if (r9 != r1) goto L_0x0064
            return r1
        L_0x0064:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            if (r9 == 0) goto L_0x0075
            boolean r9 = r9.booleanValue()
            goto L_0x0076
        L_0x0075:
            r9 = r4
        L_0x0076:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r0 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.GET_MESSAGING_TOKEN_SENT
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r1[r4] = r2
            java.lang.String r7 = r7.read
            r1[r3] = r7
            r7 = 2
            java.net.URI r8 = r8.write
            java.lang.String r8 = r8.getHost()
            r1[r7] = r8
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0, r1)
            r4 = r9
        L_0x0094:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        L_0x0099:
            o.HmlVerifyIdentifyActivity$write r9 = (p040o.HmlVerifyIdentifyActivity.write) r9
            java.lang.Throwable r7 = r9.read
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindScheduleBulkTransferFragment.MediaBrowserCompat$CustomActionResultReceiver(o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment, o.FragmentBuilder_BindHmlOperatingBankFragment, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object read(boolean r5, p040o.HmlNTBPromptPayNotFoundActivity<? super p040o.HmlVerifyPhoneValidateOtpActivity> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p040o.FragmentBuilder_BindScheduleBulkTransferFragment.IconCompatParcelizer
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.FragmentBuilder_BindScheduleBulkTransferFragment$IconCompatParcelizer r0 = (p040o.FragmentBuilder_BindScheduleBulkTransferFragment.IconCompatParcelizer) r0
            int r1 = r0.IconCompatParcelizer
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.IconCompatParcelizer
            int r6 = r6 + r2
            r0.IconCompatParcelizer = r6
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindScheduleBulkTransferFragment$IconCompatParcelizer r0 = new o.FragmentBuilder_BindScheduleBulkTransferFragment$IconCompatParcelizer
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.write
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.IconCompatParcelizer
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            boolean r5 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r6 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x0067 }
            if (r0 != 0) goto L_0x002b
            goto L_0x0054
        L_0x002b:
            o.HmlVerifyIdentifyActivity$write r6 = (p040o.HmlVerifyIdentifyActivity.write) r6     // Catch:{ Exception -> 0x0067 }
            java.lang.Throwable r5 = r6.read     // Catch:{ Exception -> 0x0067 }
            throw r5     // Catch:{ Exception -> 0x0067 }
        L_0x0030:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0038:
            boolean r2 = r6 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x0072
            o.BasePartialSearchActivity_ViewBinding r6 = r4.read     // Catch:{ Exception -> 0x0067 }
            if (r6 == 0) goto L_0x004d
            r0.MediaBrowserCompat$CustomActionResultReceiver = r5     // Catch:{ Exception -> 0x0067 }
            r0.IconCompatParcelizer = r3     // Catch:{ Exception -> 0x0067 }
            java.lang.String r0 = "messaging_enabled"
            java.lang.Object r6 = r6.write(r0, r5)     // Catch:{ Exception -> 0x0067 }
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x004d:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r6 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.PREFERENCES_NULL     // Catch:{ Exception -> 0x0067 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6     // Catch:{ Exception -> 0x0067 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)     // Catch:{ Exception -> 0x0067 }
        L_0x0054:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r6 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.STORE_MESSAGING_ENABLED     // Catch:{ Exception -> 0x0067 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0067 }
            r1 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x0067 }
            r0[r1] = r5     // Catch:{ Exception -> 0x0067 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6, r0)     // Catch:{ Exception -> 0x0067 }
            o.HmlVerifyPhoneValidateOtpActivity r5 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0067 }
            goto L_0x0071
        L_0x0067:
            r5 = move-exception
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r6 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.ENABLE_MESSAGING_ERROR
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6
            p040o.MyECouponActivity_ViewBinding.read(r5, r6)
            o.HmlVerifyPhoneValidateOtpActivity r5 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x0071:
            return r5
        L_0x0072:
            o.HmlVerifyIdentifyActivity$write r6 = (p040o.HmlVerifyIdentifyActivity.write) r6
            java.lang.Throwable r5 = r6.read
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindScheduleBulkTransferFragment.read(boolean, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r6, p040o.HmlNTBPromptPayNotFoundActivity<? super p040o.HmlVerifyPhoneValidateOtpActivity> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p040o.FragmentBuilder_BindScheduleBulkTransferFragment.read
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.FragmentBuilder_BindScheduleBulkTransferFragment$read r0 = (p040o.FragmentBuilder_BindScheduleBulkTransferFragment.read) r0
            int r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r7 = r7 + r2
            r0.MediaBrowserCompat$CustomActionResultReceiver = r7
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindScheduleBulkTransferFragment$read r0 = new o.FragmentBuilder_BindScheduleBulkTransferFragment$read
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.write
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r6 = r0.IconCompatParcelizer
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = r7 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x0074 }
            if (r0 != 0) goto L_0x002e
            goto L_0x0066
        L_0x002e:
            o.HmlVerifyIdentifyActivity$write r7 = (p040o.HmlVerifyIdentifyActivity.write) r7     // Catch:{ Exception -> 0x0074 }
            java.lang.Throwable r6 = r7.read     // Catch:{ Exception -> 0x0074 }
            throw r6     // Catch:{ Exception -> 0x0074 }
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            boolean r2 = r7 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x007e
            if (r6 != 0) goto L_0x004b
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r6 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.NULL_TOKEN     // Catch:{ Exception -> 0x0074 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6     // Catch:{ Exception -> 0x0074 }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0074 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6, r7)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0071
        L_0x004b:
            o.BasePartialSearchActivity_ViewBinding r7 = r5.read     // Catch:{ Exception -> 0x0074 }
            if (r7 != 0) goto L_0x0057
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r6 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.PREFERENCES_NULL     // Catch:{ Exception -> 0x0074 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6     // Catch:{ Exception -> 0x0074 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0071
        L_0x0057:
            o.BasePartialSearchActivity_ViewBinding r7 = r5.read     // Catch:{ Exception -> 0x0074 }
            r0.IconCompatParcelizer = r6     // Catch:{ Exception -> 0x0074 }
            r0.MediaBrowserCompat$CustomActionResultReceiver = r4     // Catch:{ Exception -> 0x0074 }
            java.lang.String r0 = "push_token"
            java.lang.Object r7 = r7.read(r0, r6)     // Catch:{ Exception -> 0x0074 }
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r7 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.TOKEN_SAVED_IN_PREFERENCES     // Catch:{ Exception -> 0x0074 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r7 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r7     // Catch:{ Exception -> 0x0074 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0074 }
            r0[r3] = r6     // Catch:{ Exception -> 0x0074 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r7, r0)     // Catch:{ Exception -> 0x0074 }
        L_0x0071:
            o.HmlVerifyPhoneValidateOtpActivity r6 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0074 }
            goto L_0x007d
        L_0x0074:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r6 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.SAVE_TOKEN_ERROR
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)
            o.HmlVerifyPhoneValidateOtpActivity r6 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x007d:
            return r6
        L_0x007e:
            o.HmlVerifyIdentifyActivity$write r7 = (p040o.HmlVerifyIdentifyActivity.write) r7
            java.lang.Throwable r6 = r7.read
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindScheduleBulkTransferFragment.IconCompatParcelizer(java.lang.String, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: o.FragmentBuilder_BindHmlOperatingBankFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object read(p040o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r5, p040o.FragmentBuilder_BindHmlOperatingBankFragment r6, p040o.HmlNTBPromptPayNotFoundActivity<? super p040o.HmlVerifyPhoneValidateOtpActivity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p040o.C6765x73a85d63
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$SearchResultReceiver r0 = (p040o.C6765x73a85d63) r0
            int r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r7 = r7 + r2
            r0.MediaBrowserCompat$CustomActionResultReceiver = r7
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$SearchResultReceiver r0 = new o.FragmentBuilder_BindScheduleBulkTransferFragment$MediaBrowserCompat$SearchResultReceiver
            r0.<init>(r4, r7)
        L_0x0019:
            java.lang.Object r7 = r0.read
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r5 = r0.IconCompatParcelizer
            r6 = r5
            o.FragmentBuilder_BindHmlOperatingBankFragment r6 = (p040o.FragmentBuilder_BindHmlOperatingBankFragment) r6
            java.lang.Object r5 = r0.MediaBrowserCompat$ItemReceiver
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r5 = (p040o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment) r5
            boolean r0 = r7 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x0086 }
            if (r0 != 0) goto L_0x0032
            goto L_0x0064
        L_0x0032:
            o.HmlVerifyIdentifyActivity$write r7 = (p040o.HmlVerifyIdentifyActivity.write) r7     // Catch:{ Exception -> 0x0086 }
            java.lang.Throwable r5 = r7.read     // Catch:{ Exception -> 0x0086 }
            throw r5     // Catch:{ Exception -> 0x0086 }
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003f:
            boolean r2 = r7 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x0090
            o.BasePartialSearchActivity_ViewBinding r7 = r4.read     // Catch:{ Exception -> 0x0086 }
            if (r7 != 0) goto L_0x004f
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r5 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.PREFERENCES_NULL     // Catch:{ Exception -> 0x0086 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r5 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r5     // Catch:{ Exception -> 0x0086 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r5)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0083
        L_0x004f:
            java.lang.String r7 = p040o.FragmentBuilder_BindSelectRecipientFromFavouriteFragment.MediaBrowserCompat$CustomActionResultReceiver(r5, r6)     // Catch:{ Exception -> 0x0086 }
            if (r7 == 0) goto L_0x007c
            o.BasePartialSearchActivity_ViewBinding r2 = r4.read     // Catch:{ Exception -> 0x0086 }
            r0.MediaBrowserCompat$ItemReceiver = r5     // Catch:{ Exception -> 0x0086 }
            r0.IconCompatParcelizer = r6     // Catch:{ Exception -> 0x0086 }
            r0.MediaBrowserCompat$CustomActionResultReceiver = r3     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r7 = r2.write(r7, r3)     // Catch:{ Exception -> 0x0086 }
            if (r7 != r1) goto L_0x0064
            return r1
        L_0x0064:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r7 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.SET_MESSAGING_TOKEN_SENT     // Catch:{ Exception -> 0x0086 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r7 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r7     // Catch:{ Exception -> 0x0086 }
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0086 }
            r1 = 0
            java.lang.String r5 = r5.read     // Catch:{ Exception -> 0x0086 }
            r0[r1] = r5     // Catch:{ Exception -> 0x0086 }
            java.net.URI r5 = r6.write     // Catch:{ Exception -> 0x0086 }
            java.lang.String r5 = r5.getHost()     // Catch:{ Exception -> 0x0086 }
            r0[r3] = r5     // Catch:{ Exception -> 0x0086 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r7, r0)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0083
        L_0x007c:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r5 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.ERROR_PERSISTING_TOKEN     // Catch:{ Exception -> 0x0086 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r5 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r5     // Catch:{ Exception -> 0x0086 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r5)     // Catch:{ Exception -> 0x0086 }
        L_0x0083:
            o.HmlVerifyPhoneValidateOtpActivity r5 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0086 }
            goto L_0x008f
        L_0x0086:
            o.FragmentBuilder_BindManageEmailVerificationSuccessFragment r5 = p040o.FragmentBuilder_BindManageEmailVerificationSuccessFragment.ERROR_PERSISTING_TOKEN
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r5 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r5
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r5)
            o.HmlVerifyPhoneValidateOtpActivity r5 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x008f:
            return r5
        L_0x0090:
            o.HmlVerifyIdentifyActivity$write r7 = (p040o.HmlVerifyIdentifyActivity.write) r7
            java.lang.Throwable r5 = r7.read
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindScheduleBulkTransferFragment.read(o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment, o.FragmentBuilder_BindHmlOperatingBankFragment, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }
}
