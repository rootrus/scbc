package p040o;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment;

/* renamed from: o.FragmentBuilder_BindOnboardingAdressInformationFragment */
public final class FragmentBuilder_BindOnboardingAdressInformationFragment implements FragmentBuilder_BindOPRStatusUnregisteredUserFragment {
    @Deprecated
    private static C6612xfc31d2b6 read = new C6612xfc31d2b6((byte) 0);
    private final BasePartialSearchActivity_ViewBinding IconCompatParcelizer;

    /* renamed from: o.FragmentBuilder_BindOnboardingAdressInformationFragment$write */
    static final class write extends HmlDocumentSubmissionTutorialsActivity {
        private /* synthetic */ FragmentBuilder_BindOnboardingAdressInformationFragment IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(FragmentBuilder_BindOnboardingAdressInformationFragment fragmentBuilder_BindOnboardingAdressInformationFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
            super(hmlNTBPromptPayNotFoundActivity);
            this.IconCompatParcelizer = fragmentBuilder_BindOnboardingAdressInformationFragment;
        }

        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompat$CustomActionResultReceiver = obj;
            this.MediaBrowserCompat$ItemReceiver |= PKIFailureInfo.systemUnavail;
            return this.IconCompatParcelizer.write((FragmentBuilder_BindOPRStatusUnregisteredUserFragment.write) null, this);
        }
    }

    public FragmentBuilder_BindOnboardingAdressInformationFragment(BasePartialSearchActivity_ViewBinding basePartialSearchActivity_ViewBinding) {
        this.IconCompatParcelizer = basePartialSearchActivity_ViewBinding;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object write(p040o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment.write r6, p040o.HmlNTBPromptPayNotFoundActivity<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p040o.FragmentBuilder_BindOnboardingAdressInformationFragment.write
            if (r0 == 0) goto L_0x0014
            r0 = r7
            o.FragmentBuilder_BindOnboardingAdressInformationFragment$write r0 = (p040o.FragmentBuilder_BindOnboardingAdressInformationFragment.write) r0
            int r1 = r0.MediaBrowserCompat$ItemReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.MediaBrowserCompat$ItemReceiver
            int r7 = r7 + r2
            r0.MediaBrowserCompat$ItemReceiver = r7
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindOnboardingAdressInformationFragment$write r0 = new o.FragmentBuilder_BindOnboardingAdressInformationFragment$write
            r0.<init>(r5, r7)
        L_0x0019:
            java.lang.Object r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.MediaBrowserCompat$ItemReceiver
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            boolean r6 = r7 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r6 != 0) goto L_0x002a
            goto L_0x0062
        L_0x002a:
            o.HmlVerifyIdentifyActivity$write r7 = (p040o.HmlVerifyIdentifyActivity.write) r7
            java.lang.Throwable r6 = r7.read
            throw r6
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            boolean r2 = r7 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x006d
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r7 = r6.IconCompatParcelizer
            o.FragmentBuilder_BindHmlOperatingBankFragment r6 = r6.read
            java.lang.String r6 = p040o.C6612xfc31d2b6.MediaBrowserCompat$CustomActionResultReceiver(r7, r6)
            o.BasePartialSearchActivity_ViewBinding r7 = r5.IconCompatParcelizer
            if (r7 != 0) goto L_0x004f
            o.FragmentBuilder_BindMerchantWalletMoreInfoFragment r6 = p040o.FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)
            goto L_0x0068
        L_0x004f:
            if (r6 != 0) goto L_0x0059
            o.FragmentBuilder_BindMerchantWalletMoreInfoFragment r6 = p040o.FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_KEY
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r6 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r6
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r6)
            goto L_0x0068
        L_0x0059:
            r0.MediaBrowserCompat$ItemReceiver = r3
            java.lang.Object r7 = r7.MediaBrowserCompat$ItemReceiver((java.lang.String) r6, (boolean) r4)
            if (r7 != r1) goto L_0x0062
            return r1
        L_0x0062:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r4 = r7.booleanValue()
        L_0x0068:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L_0x006d:
            o.HmlVerifyIdentifyActivity$write r7 = (p040o.HmlVerifyIdentifyActivity.write) r7
            java.lang.Throwable r6 = r7.read
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindOnboardingAdressInformationFragment.write(o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment$write, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindOPRStatusUnregisteredUserFragment.write write2, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity> hmlNTBPromptPayNotFoundActivity) {
        boolean z;
        Boolean bool = write2.MediaBrowserCompat$ItemReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = C6612xfc31d2b6.MediaBrowserCompat$CustomActionResultReceiver(write2.IconCompatParcelizer, write2.read);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_KEY);
        } else {
            BasePartialSearchActivity_ViewBinding basePartialSearchActivity_ViewBinding = this.IconCompatParcelizer;
            if (basePartialSearchActivity_ViewBinding == null) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES);
            } else {
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                Object write3 = basePartialSearchActivity_ViewBinding.write(MediaBrowserCompat$CustomActionResultReceiver, z);
                if (write3 == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
                    return write3;
                }
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
