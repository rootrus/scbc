package p040o;

import com.google.gson.reflect.TypeToken;
import java.net.URI;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.FragmentBuilder_BindRemittanceFavouriteTargetFragment */
public final class FragmentBuilder_BindRemittanceFavouriteTargetFragment implements FragmentBuilder_BindOtpPinFragment<FragmentBuilder_BindPurchaseProfileManagementFragment, FragmentBuilder_BindQuantityPointsPlusMoneyFragment> {
    private final BasePartialSearchActivity_ViewBinding write;

    /* renamed from: o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends HmlDocumentSubmissionTutorialsActivity {
        private /* synthetic */ FragmentBuilder_BindRemittanceFavouriteTargetFragment IconCompatParcelizer;
        int MediaBrowserCompat$ItemReceiver;
        Object read;
        /* synthetic */ Object write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(FragmentBuilder_BindRemittanceFavouriteTargetFragment fragmentBuilder_BindRemittanceFavouriteTargetFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
            super(hmlNTBPromptPayNotFoundActivity);
            this.IconCompatParcelizer = fragmentBuilder_BindRemittanceFavouriteTargetFragment;
        }

        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.MediaBrowserCompat$ItemReceiver |= PKIFailureInfo.systemUnavail;
            return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver((FragmentBuilder_BindQuantityPointsPlusMoneyFragment) null, (HmlNTBPromptPayNotFoundActivity<? super FragmentBuilder_BindPurchaseProfileManagementFragment>) this);
        }
    }

    /* renamed from: o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$read */
    public static final class read extends TypeToken<FragmentBuilder_BindPurchaseProfileManagementFragment> {
    }

    public FragmentBuilder_BindRemittanceFavouriteTargetFragment(BasePartialSearchActivity_ViewBinding basePartialSearchActivity_ViewBinding) {
        onGetStartedClick.write((Object) basePartialSearchActivity_ViewBinding, "preferences");
        this.write = basePartialSearchActivity_ViewBinding;
    }

    private static String read(FragmentBuilder_BindQuantityPointsPlusMoneyFragment fragmentBuilder_BindQuantityPointsPlusMoneyFragment) {
        URI uri;
        onGetStartedClick.write((Object) fragmentBuilder_BindQuantityPointsPlusMoneyFragment, "key");
        StringBuilder sb = new StringBuilder();
        sb.append("AllowedInteractions|");
        FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.IconCompatParcelizer;
        String str = null;
        if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
            uri = fragmentBuilder_BindHmlOperatingBankFragment.write;
        } else {
            uri = null;
        }
        sb.append(uri);
        sb.append('|');
        FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null) {
            str = fragmentBuilder_BindHmlNtbOutcomeRejectFragment.read;
        }
        sb.append(str);
        sb.append('|');
        sb.append(fragmentBuilder_BindQuantityPointsPlusMoneyFragment.write);
        String obj = sb.toString();
        CharSequence charSequence = fragmentBuilder_BindQuantityPointsPlusMoneyFragment.read;
        if (charSequence == null || GoodToKnowActivity.read(charSequence)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append('|');
        sb2.append(fragmentBuilder_BindQuantityPointsPlusMoneyFragment.read);
        return sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object MediaBrowserCompat$CustomActionResultReceiver(p040o.FragmentBuilder_BindQuantityPointsPlusMoneyFragment r8, p040o.HmlNTBPromptPayNotFoundActivity<? super p040o.FragmentBuilder_BindPurchaseProfileManagementFragment> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p040o.FragmentBuilder_BindRemittanceFavouriteTargetFragment.IconCompatParcelizer
            if (r0 == 0) goto L_0x0014
            r0 = r9
            o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$IconCompatParcelizer r0 = (p040o.FragmentBuilder_BindRemittanceFavouriteTargetFragment.IconCompatParcelizer) r0
            int r1 = r0.MediaBrowserCompat$ItemReceiver
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r9 = r0.MediaBrowserCompat$ItemReceiver
            int r9 = r9 + r2
            r0.MediaBrowserCompat$ItemReceiver = r9
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$IconCompatParcelizer r0 = new o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$IconCompatParcelizer
            r0.<init>(r7, r9)
        L_0x0019:
            java.lang.Object r9 = r0.write
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.MediaBrowserCompat$ItemReceiver
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r4) goto L_0x0037
            java.lang.Object r8 = r0.read
            com.google.gson.Gson r8 = (com.google.gson.Gson) r8
            boolean r0 = r9 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x0034 }
            if (r0 != 0) goto L_0x002f
            goto L_0x009e
        L_0x002f:
            o.HmlVerifyIdentifyActivity$write r9 = (p040o.HmlVerifyIdentifyActivity.write) r9     // Catch:{ Exception -> 0x0034 }
            java.lang.Throwable r8 = r9.read     // Catch:{ Exception -> 0x0034 }
            throw r8     // Catch:{ Exception -> 0x0034 }
        L_0x0034:
            r8 = move-exception
            goto L_0x00ae
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            boolean r2 = r9 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x00da
            o.FragmentBuilder_BindHmlOperatingBankFragment r9 = r8.IconCompatParcelizer
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.net.URI r5 = r8.write
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = p040o.GoodToKnowActivity.read(r5)
            r6 = 0
            if (r5 != 0) goto L_0x00b2
            if (r2 == 0) goto L_0x005b
            java.lang.String r2 = r2.read
            goto L_0x005c
        L_0x005b:
            r2 = r3
        L_0x005c:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x0068
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            if (r2 != 0) goto L_0x0068
            r2 = r6
            goto L_0x0069
        L_0x0068:
            r2 = r4
        L_0x0069:
            if (r2 != 0) goto L_0x00b2
            if (r9 == 0) goto L_0x0076
            java.net.URI r9 = r9.write
            if (r9 == 0) goto L_0x0076
            java.lang.String r9 = r9.toString()
            goto L_0x0077
        L_0x0076:
            r9 = r3
        L_0x0077:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L_0x0083
            boolean r9 = p040o.GoodToKnowActivity.read(r9)
            if (r9 != 0) goto L_0x0083
            r9 = r6
            goto L_0x0084
        L_0x0083:
            r9 = r4
        L_0x0084:
            if (r9 != 0) goto L_0x00b2
            o.BasePartialSearchActivity_ViewBinding r9 = r7.write
            java.lang.String r8 = read(r8)
            com.google.gson.Gson r2 = p040o.onClearClick.IconCompatParcelizer     // Catch:{ Exception -> 0x0034 }
            r0.read = r2     // Catch:{ Exception -> 0x0034 }
            r0.MediaBrowserCompat$ItemReceiver = r4     // Catch:{ Exception -> 0x0034 }
            java.lang.String r0 = ""
            java.lang.Object r9 = r9.MediaBrowserCompat$ItemReceiver((java.lang.String) r8, (java.lang.String) r0)     // Catch:{ Exception -> 0x0034 }
            if (r9 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r8 = r2
        L_0x009e:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0034 }
            o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$read r0 = new o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$read     // Catch:{ Exception -> 0x0034 }
            r0.<init>()     // Catch:{ Exception -> 0x0034 }
            java.lang.reflect.Type r0 = r0.getType()     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r3 = r8.fromJson((java.lang.String) r9, (java.lang.reflect.Type) r0)     // Catch:{ Exception -> 0x0034 }
            goto L_0x00b1
        L_0x00ae:
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r8)
        L_0x00b1:
            return r3
        L_0x00b2:
            o.FragmentBuilder_BindLoanFragment r9 = p040o.FragmentBuilder_BindLoanFragment.INVALID_KEY_FOR_OPERATION
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r9 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r9
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r6] = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r8.append(r1)
            java.lang.String r1 = "#retrieve"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r0[r4] = r8
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r9, (java.lang.Object[]) r0)
            return r3
        L_0x00da:
            o.HmlVerifyIdentifyActivity$write r9 = (p040o.HmlVerifyIdentifyActivity.write) r9
            java.lang.Throwable r8 = r9.read
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindRemittanceFavouriteTargetFragment.MediaBrowserCompat$CustomActionResultReceiver(o.FragmentBuilder_BindQuantityPointsPlusMoneyFragment, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: write */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object MediaBrowserCompat$CustomActionResultReceiver(p040o.FragmentBuilder_BindQuantityPointsPlusMoneyFragment r7, p040o.FragmentBuilder_BindPurchaseProfileManagementFragment r8, p040o.HmlNTBPromptPayNotFoundActivity<? super p040o.HmlVerifyPhoneValidateOtpActivity> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p040o.C6726xf22344c8
            if (r0 == 0) goto L_0x0014
            r0 = r9
            o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$MediaBrowserCompat$CustomActionResultReceiver r0 = (p040o.C6726xf22344c8) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r9 = r0.write
            int r9 = r9 + r2
            r0.write = r9
            goto L_0x0019
        L_0x0014:
            o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.FragmentBuilder_BindRemittanceFavouriteTargetFragment$MediaBrowserCompat$CustomActionResultReceiver
            r0.<init>(r6, r9)
        L_0x0019:
            java.lang.Object r9 = r0.MediaBrowserCompat$ItemReceiver
            o.HmlPromptPayVerificationActivity_ViewBinding r1 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r2 = r0.write
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r7 = r9 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x002f }
            if (r7 != 0) goto L_0x002a
            goto L_0x0097
        L_0x002a:
            o.HmlVerifyIdentifyActivity$write r9 = (p040o.HmlVerifyIdentifyActivity.write) r9     // Catch:{ Exception -> 0x002f }
            java.lang.Throwable r7 = r9.read     // Catch:{ Exception -> 0x002f }
            throw r7     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r7 = move-exception
            goto L_0x009a
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            boolean r2 = r9 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r2 != 0) goto L_0x00cc
            o.FragmentBuilder_BindHmlOperatingBankFragment r9 = r7.IconCompatParcelizer
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r2 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.net.URI r4 = r7.write
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = p040o.GoodToKnowActivity.read(r4)
            r5 = 0
            if (r4 != 0) goto L_0x00a2
            r4 = 0
            if (r2 == 0) goto L_0x0057
            java.lang.String r2 = r2.read
            goto L_0x0058
        L_0x0057:
            r2 = r4
        L_0x0058:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x0064
            boolean r2 = p040o.GoodToKnowActivity.read(r2)
            if (r2 != 0) goto L_0x0064
            r2 = r5
            goto L_0x0065
        L_0x0064:
            r2 = r3
        L_0x0065:
            if (r2 != 0) goto L_0x00a2
            if (r9 == 0) goto L_0x0071
            java.net.URI r9 = r9.write
            if (r9 == 0) goto L_0x0071
            java.lang.String r4 = r9.toString()
        L_0x0071:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x007d
            boolean r9 = p040o.GoodToKnowActivity.read(r4)
            if (r9 != 0) goto L_0x007d
            r9 = r5
            goto L_0x007e
        L_0x007d:
            r9 = r3
        L_0x007e:
            if (r9 != 0) goto L_0x00a2
            o.BasePartialSearchActivity_ViewBinding r9 = r6.write
            java.lang.String r7 = read(r7)
            com.google.gson.Gson r2 = p040o.onClearClick.IconCompatParcelizer     // Catch:{ Exception -> 0x002f }
            java.lang.String r8 = r2.toJson((java.lang.Object) r8)     // Catch:{ Exception -> 0x002f }
            r0.write = r3     // Catch:{ Exception -> 0x002f }
            java.lang.Object r7 = r9.read(r7, r8)     // Catch:{ Exception -> 0x002f }
            if (r7 != r1) goto L_0x0097
            return r1
        L_0x0097:
            o.HmlVerifyPhoneValidateOtpActivity r7 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x002f }
            goto L_0x009f
        L_0x009a:
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r7)
            o.HmlVerifyPhoneValidateOtpActivity r7 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
        L_0x009f:
            o.HmlVerifyPhoneValidateOtpActivity r7 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            return r7
        L_0x00a2:
            o.FragmentBuilder_BindLoanFragment r8 = p040o.FragmentBuilder_BindLoanFragment.INVALID_KEY_FOR_OPERATION
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r8 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r8
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r5] = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r7.append(r0)
            java.lang.String r0 = "#updateOrCreate"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r9[r3] = r7
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r8, (java.lang.Object[]) r9)
            o.HmlVerifyPhoneValidateOtpActivity r7 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
            return r7
        L_0x00cc:
            o.HmlVerifyIdentifyActivity$write r9 = (p040o.HmlVerifyIdentifyActivity.write) r9
            java.lang.Throwable r7 = r9.read
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindRemittanceFavouriteTargetFragment.MediaBrowserCompat$CustomActionResultReceiver(o.FragmentBuilder_BindQuantityPointsPlusMoneyFragment, o.FragmentBuilder_BindPurchaseProfileManagementFragment, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }
}
