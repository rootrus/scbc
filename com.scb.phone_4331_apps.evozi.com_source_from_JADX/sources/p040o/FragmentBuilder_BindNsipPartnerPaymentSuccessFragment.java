package p040o;

import android.content.Context;
import com.thunderhead.android.domain.authentication.ClientCredentials;
import java.lang.ref.WeakReference;

/* renamed from: o.FragmentBuilder_BindNsipPartnerPaymentSuccessFragment */
public final class FragmentBuilder_BindNsipPartnerPaymentSuccessFragment implements FragmentBuilder_BindNTBBankingServiceFragment {
    @Deprecated
    private static IconCompatParcelizer write = new IconCompatParcelizer((byte) 0);
    private final FragmentBuilder_BindNTBBankingServiceFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final WeakReference<Context> read;

    public FragmentBuilder_BindNsipPartnerPaymentSuccessFragment(Context context, FragmentBuilder_BindNTBBankingServiceFragment fragmentBuilder_BindNTBBankingServiceFragment) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) fragmentBuilder_BindNTBBankingServiceFragment, "decoratee");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindNTBBankingServiceFragment;
        this.read = new WeakReference<>(context);
    }

    public final Object write(ClientCredentials clientCredentials, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity> hmlNTBPromptPayNotFoundActivity) {
        Object write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write(clientCredentials, hmlNTBPromptPayNotFoundActivity);
        return write2 == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED ? write2 : HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(C6578x4a06f497 fragmentBuilder_BindNTBBankingServiceFragment$MediaBrowserCompat$CustomActionResultReceiver, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity> hmlNTBPromptPayNotFoundActivity) {
        Object MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindNTBBankingServiceFragment$MediaBrowserCompat$CustomActionResultReceiver, hmlNTBPromptPayNotFoundActivity);
        return MediaBrowserCompat$CustomActionResultReceiver2 == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED ? MediaBrowserCompat$CustomActionResultReceiver2 : HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.FragmentBuilder_BindNsipPartnerPaymentSuccessFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112 A[PHI: r2 
      PHI: (r2v6 java.lang.Object) = (r2v8 java.lang.Object), (r2v1 java.lang.Object) binds: [B:47:0x010f, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object MediaBrowserCompat$ItemReceiver(p040o.C6578x4a06f497 r18, p040o.HmlNTBPromptPayNotFoundActivity<? super com.thunderhead.android.domain.authentication.ClientCredentials> r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r2 instanceof p040o.C6593x9788d434
            if (r3 == 0) goto L_0x001a
            r3 = r2
            o.FragmentBuilder_BindNsipPartnerPaymentSuccessFragment$MediaBrowserCompat$ItemReceiver r3 = (p040o.C6593x9788d434) r3
            int r4 = r3.MediaDescriptionCompat
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x001a
            int r2 = r3.MediaDescriptionCompat
            int r2 = r2 + r5
            r3.MediaDescriptionCompat = r2
            goto L_0x001f
        L_0x001a:
            o.FragmentBuilder_BindNsipPartnerPaymentSuccessFragment$MediaBrowserCompat$ItemReceiver r3 = new o.FragmentBuilder_BindNsipPartnerPaymentSuccessFragment$MediaBrowserCompat$ItemReceiver
            r3.<init>(r1, r2)
        L_0x001f:
            java.lang.Object r2 = r3.f3147x50fd9e4a
            o.HmlPromptPayVerificationActivity_ViewBinding r4 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r5 = r3.MediaDescriptionCompat
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0075
            if (r5 == r8) goto L_0x0041
            if (r5 != r7) goto L_0x0039
            boolean r0 = r2 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r0 != 0) goto L_0x0034
            goto L_0x0112
        L_0x0034:
            o.HmlVerifyIdentifyActivity$write r2 = (p040o.HmlVerifyIdentifyActivity.write) r2
            java.lang.Throwable r0 = r2.read
            throw r0
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0041:
            java.lang.Object r0 = r3.RatingCompat
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r5 = r3.MediaBrowserCompat$MediaItem
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r3.MediaMetadataCompat
            java.lang.Object r9 = r3.MediaBrowserCompat$SearchResultReceiver
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r9 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r9
            java.lang.Object r10 = r3.read
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            java.lang.Object r11 = r3.MediaBrowserCompat$ItemReceiver
            o.FragmentBuilder_BindHmlOperatingBankFragment r11 = (p040o.FragmentBuilder_BindHmlOperatingBankFragment) r11
            java.lang.Object r12 = r3.MediaBrowserCompat$CustomActionResultReceiver
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r12 = (p040o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment) r12
            java.lang.Object r13 = r3.IconCompatParcelizer
            o.FragmentBuilder_BindNTBBankingServiceFragment$MediaBrowserCompat$CustomActionResultReceiver r13 = (p040o.C6578x4a06f497) r13
            java.lang.Object r14 = r3.write
            o.FragmentBuilder_BindNsipPartnerPaymentSuccessFragment r14 = (p040o.FragmentBuilder_BindNsipPartnerPaymentSuccessFragment) r14
            boolean r15 = r2 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x0072 }
            if (r15 != 0) goto L_0x006d
            r16 = r9
            r9 = r6
            r6 = r16
            goto L_0x00c5
        L_0x006d:
            o.HmlVerifyIdentifyActivity$write r2 = (p040o.HmlVerifyIdentifyActivity.write) r2     // Catch:{ Exception -> 0x0072 }
            java.lang.Throwable r0 = r2.read     // Catch:{ Exception -> 0x0072 }
            throw r0     // Catch:{ Exception -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            goto L_0x00ec
        L_0x0075:
            boolean r5 = r2 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r5 != 0) goto L_0x0113
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.FragmentBuilder_BindHmlOperatingBankFragment r5 = r0.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x00fd
            if (r5 == 0) goto L_0x00fd
            java.lang.ref.WeakReference<android.content.Context> r10 = r1.read
            if (r10 == 0) goto L_0x008a
            java.lang.Object r9 = r10.get()
            goto L_0x008b
        L_0x008a:
            r9 = r6
        L_0x008b:
            if (r9 == 0) goto L_0x00f6
            r11 = r9
            android.content.Context r11 = (android.content.Context) r11
            o.FragmentBuilder_BindNdidSelectIdpFragment[] r12 = new p040o.FragmentBuilder_BindNdidSelectIdpFragment[r7]
            r13 = 0
            o.FragmentBuilder_BindNdidIdpVerifyIdentityFragment r14 = new o.FragmentBuilder_BindNdidIdpVerifyIdentityFragment
            r14.<init>(r2, r5)
            o.FragmentBuilder_BindNdidSelectIdpFragment r14 = (p040o.FragmentBuilder_BindNdidSelectIdpFragment) r14
            r12[r13] = r14
            o.FragmentBuilder_BindNdidInstructionFragment r13 = new o.FragmentBuilder_BindNdidInstructionFragment
            r13.<init>()
            o.FragmentBuilder_BindNdidSelectIdpFragment r13 = (p040o.FragmentBuilder_BindNdidSelectIdpFragment) r13
            r12[r8] = r13
            java.lang.String r13 = "elements"
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r13)
            java.lang.String r13 = "$this$asList"
            p040o.onGetStartedClick.write((java.lang.Object) r12, (java.lang.String) r13)
            java.util.List r12 = java.util.Arrays.asList(r12)
            java.lang.String r13 = "ArraysUtilJVM.asList(this)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r12, (java.lang.String) r13)
            java.util.Iterator r12 = r12.iterator()
            r13 = r0
            r14 = r1
            r0 = r12
            r12 = r2
            r16 = r11
            r11 = r5
            r5 = r16
        L_0x00c5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00f3
            java.lang.Object r2 = r0.next()
            o.FragmentBuilder_BindNdidSelectIdpFragment r2 = (p040o.FragmentBuilder_BindNdidSelectIdpFragment) r2
            r3.write = r14     // Catch:{ Exception -> 0x0072 }
            r3.IconCompatParcelizer = r13     // Catch:{ Exception -> 0x0072 }
            r3.MediaBrowserCompat$CustomActionResultReceiver = r12     // Catch:{ Exception -> 0x0072 }
            r3.MediaBrowserCompat$ItemReceiver = r11     // Catch:{ Exception -> 0x0072 }
            r3.read = r10     // Catch:{ Exception -> 0x0072 }
            r3.MediaBrowserCompat$SearchResultReceiver = r6     // Catch:{ Exception -> 0x0072 }
            r3.MediaMetadataCompat = r9     // Catch:{ Exception -> 0x0072 }
            r3.MediaBrowserCompat$MediaItem = r5     // Catch:{ Exception -> 0x0072 }
            r3.RatingCompat = r0     // Catch:{ Exception -> 0x0072 }
            r3.MediaDescriptionCompat = r8     // Catch:{ Exception -> 0x0072 }
            java.lang.Object r2 = r2.IconCompatParcelizer(r5)     // Catch:{ Exception -> 0x0072 }
            if (r2 != r4) goto L_0x00c5
            return r4
        L_0x00ec:
            o.FragmentBuilder_BindMailingAddressReviewFragment r2 = p040o.FragmentBuilder_BindMailingAddressReviewFragment.SHARED_PREFERENCES_CREDENTIALS_MIGRATION_FAILED
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r2 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r2
            p040o.MyECouponActivity_ViewBinding.read(r0, r2)
        L_0x00f3:
            r5 = r11
            r2 = r12
            goto L_0x00ff
        L_0x00f6:
            o.MyECouponActivity_ViewBinding$write r6 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = "Weakreference null."
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r6, (java.lang.String) r8)
        L_0x00fd:
            r13 = r0
            r14 = r1
        L_0x00ff:
            o.FragmentBuilder_BindNTBBankingServiceFragment r0 = r14.MediaBrowserCompat$CustomActionResultReceiver
            r3.write = r14
            r3.IconCompatParcelizer = r13
            r3.MediaBrowserCompat$CustomActionResultReceiver = r2
            r3.MediaBrowserCompat$ItemReceiver = r5
            r3.MediaDescriptionCompat = r7
            java.lang.Object r2 = r0.MediaBrowserCompat$ItemReceiver(r13, r3)
            if (r2 != r4) goto L_0x0112
            return r4
        L_0x0112:
            return r2
        L_0x0113:
            o.HmlVerifyIdentifyActivity$write r2 = (p040o.HmlVerifyIdentifyActivity.write) r2
            java.lang.Throwable r0 = r2.read
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindNsipPartnerPaymentSuccessFragment.MediaBrowserCompat$ItemReceiver(o.FragmentBuilder_BindNTBBankingServiceFragment$MediaBrowserCompat$CustomActionResultReceiver, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }
}
