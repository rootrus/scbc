package p040o;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment;

/* renamed from: o.FragmentBuilder_BindOnBoardingInvestmentInformationSourceOfFundFragment */
public final class C6610x1f6da9d4 implements FragmentBuilder_BindOPRStatusUnregisteredUserFragment {
    @Deprecated
    private static C6611x23f94761 IconCompatParcelizer = new C6611x23f94761((byte) 0);
    private final FragmentBuilder_BindOPRStatusUnregisteredUserFragment MediaBrowserCompat$ItemReceiver;
    private final WeakReference<Context> read;

    /* renamed from: o.FragmentBuilder_BindOnBoardingInvestmentInformationSourceOfFundFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends HmlDocumentSubmissionTutorialsActivity {
        Object IconCompatParcelizer;
        Object MediaBrowserCompat$CustomActionResultReceiver;
        Object MediaBrowserCompat$ItemReceiver;
        Object MediaBrowserCompat$MediaItem;
        Object MediaBrowserCompat$SearchResultReceiver;
        Object MediaDescriptionCompat;
        int MediaMetadataCompat;
        private /* synthetic */ C6610x1f6da9d4 MediaSessionCompat$QueueItem;
        /* synthetic */ Object ParcelableVolumeInfo;
        Object RatingCompat;
        Object read;
        Object write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(C6610x1f6da9d4 fragmentBuilder_BindOnBoardingInvestmentInformationSourceOfFundFragment, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity) {
            super(hmlNTBPromptPayNotFoundActivity);
            this.MediaSessionCompat$QueueItem = fragmentBuilder_BindOnBoardingInvestmentInformationSourceOfFundFragment;
        }

        public final Object invokeSuspend(Object obj) {
            this.ParcelableVolumeInfo = obj;
            this.MediaMetadataCompat |= PKIFailureInfo.systemUnavail;
            return this.MediaSessionCompat$QueueItem.write((FragmentBuilder_BindOPRStatusUnregisteredUserFragment.write) null, this);
        }
    }

    public C6610x1f6da9d4(Context context, FragmentBuilder_BindOPRStatusUnregisteredUserFragment fragmentBuilder_BindOPRStatusUnregisteredUserFragment) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) fragmentBuilder_BindOPRStatusUnregisteredUserFragment, "decoratee");
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindOPRStatusUnregisteredUserFragment;
        this.read = new WeakReference<>(context);
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindOPRStatusUnregisteredUserFragment.write write, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity> hmlNTBPromptPayNotFoundActivity) {
        Object MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(write, hmlNTBPromptPayNotFoundActivity);
        return MediaBrowserCompat$CustomActionResultReceiver == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED ? MediaBrowserCompat$CustomActionResultReceiver : HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x019c A[PHI: r2 
      PHI: (r2v10 java.lang.Object) = (r2v12 java.lang.Object), (r2v1 java.lang.Object) binds: [B:56:0x0199, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object write(p040o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment.write r20, p040o.HmlNTBPromptPayNotFoundActivity<? super java.lang.Boolean> r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            java.lang.String r3 = "remember-me-preference"
            boolean r4 = r2 instanceof p040o.C6610x1f6da9d4.IconCompatParcelizer
            if (r4 == 0) goto L_0x001c
            r4 = r2
            o.FragmentBuilder_BindOnBoardingInvestmentInformationSourceOfFundFragment$IconCompatParcelizer r4 = (p040o.C6610x1f6da9d4.IconCompatParcelizer) r4
            int r5 = r4.MediaMetadataCompat
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r6
            if (r5 == 0) goto L_0x001c
            int r2 = r4.MediaMetadataCompat
            int r2 = r2 + r6
            r4.MediaMetadataCompat = r2
            goto L_0x0021
        L_0x001c:
            o.FragmentBuilder_BindOnBoardingInvestmentInformationSourceOfFundFragment$IconCompatParcelizer r4 = new o.FragmentBuilder_BindOnBoardingInvestmentInformationSourceOfFundFragment$IconCompatParcelizer
            r4.<init>(r1, r2)
        L_0x0021:
            java.lang.Object r2 = r4.ParcelableVolumeInfo
            o.HmlPromptPayVerificationActivity_ViewBinding r5 = p040o.HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED
            int r6 = r4.MediaMetadataCompat
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0074
            if (r6 == r9) goto L_0x0043
            if (r6 != r8) goto L_0x003b
            boolean r0 = r2 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r0 != 0) goto L_0x0036
            goto L_0x019c
        L_0x0036:
            o.HmlVerifyIdentifyActivity$write r2 = (p040o.HmlVerifyIdentifyActivity.write) r2
            java.lang.Throwable r0 = r2.read
            throw r0
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0043:
            java.lang.Object r0 = r4.MediaBrowserCompat$SearchResultReceiver
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r6 = r4.MediaDescriptionCompat
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r4.MediaBrowserCompat$MediaItem
            java.lang.Object r10 = r4.RatingCompat
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r10 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r10
            java.lang.Object r11 = r4.MediaBrowserCompat$ItemReceiver
            java.lang.ref.WeakReference r11 = (java.lang.ref.WeakReference) r11
            java.lang.Object r12 = r4.write
            o.FragmentBuilder_BindHmlOperatingBankFragment r12 = (p040o.FragmentBuilder_BindHmlOperatingBankFragment) r12
            java.lang.Object r13 = r4.MediaBrowserCompat$CustomActionResultReceiver
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r13 = (p040o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment) r13
            java.lang.Object r14 = r4.read
            o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment$write r14 = (p040o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment.write) r14
            java.lang.Object r15 = r4.IconCompatParcelizer
            o.FragmentBuilder_BindOnBoardingInvestmentInformationSourceOfFundFragment r15 = (p040o.C6610x1f6da9d4) r15
            boolean r8 = r2 instanceof p040o.HmlVerifyIdentifyActivity.write     // Catch:{ Exception -> 0x0071 }
            if (r8 != 0) goto L_0x006c
            r8 = r7
            r7 = r10
            goto L_0x00a7
        L_0x006c:
            o.HmlVerifyIdentifyActivity$write r2 = (p040o.HmlVerifyIdentifyActivity.write) r2     // Catch:{ Exception -> 0x0071 }
            java.lang.Throwable r0 = r2.read     // Catch:{ Exception -> 0x0071 }
            throw r0     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            goto L_0x0174
        L_0x0074:
            boolean r6 = r2 instanceof p040o.HmlVerifyIdentifyActivity.write
            if (r6 != 0) goto L_0x019d
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r2 = r0.IconCompatParcelizer
            o.FragmentBuilder_BindHmlOperatingBankFragment r6 = r0.read
            if (r2 == 0) goto L_0x0185
            if (r6 == 0) goto L_0x0185
            java.lang.ref.WeakReference<android.content.Context> r11 = r1.read
            if (r11 == 0) goto L_0x0089
            java.lang.Object r8 = r11.get()
            goto L_0x008a
        L_0x0089:
            r8 = r7
        L_0x008a:
            if (r8 == 0) goto L_0x017e
            r10 = r8
            android.content.Context r10 = (android.content.Context) r10
            o.FragmentBuilder_BindOnboardingCareerInformationFragment r12 = new o.FragmentBuilder_BindOnboardingCareerInformationFragment
            r12.<init>(r2, r6)
            java.util.List r12 = java.util.Collections.singletonList(r12)
            java.lang.String r13 = "java.util.Collections.singletonList(element)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r12, (java.lang.String) r13)
            java.util.Iterator r12 = r12.iterator()
            r14 = r0
            r15 = r1
            r13 = r2
            r0 = r12
            r12 = r6
            r6 = r10
        L_0x00a7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x017b
            java.lang.Object r2 = r0.next()
            o.FragmentBuilder_BindOnboardingCareerInformationFragment r2 = (p040o.FragmentBuilder_BindOnboardingCareerInformationFragment) r2
            r4.IconCompatParcelizer = r15     // Catch:{ Exception -> 0x0071 }
            r4.read = r14     // Catch:{ Exception -> 0x0071 }
            r4.MediaBrowserCompat$CustomActionResultReceiver = r13     // Catch:{ Exception -> 0x0071 }
            r4.write = r12     // Catch:{ Exception -> 0x0071 }
            r4.MediaBrowserCompat$ItemReceiver = r11     // Catch:{ Exception -> 0x0071 }
            r4.RatingCompat = r7     // Catch:{ Exception -> 0x0071 }
            r4.MediaBrowserCompat$MediaItem = r8     // Catch:{ Exception -> 0x0071 }
            r4.MediaDescriptionCompat = r6     // Catch:{ Exception -> 0x0071 }
            r4.MediaBrowserCompat$SearchResultReceiver = r0     // Catch:{ Exception -> 0x0071 }
            r4.MediaMetadataCompat = r9     // Catch:{ Exception -> 0x0071 }
            java.lang.String r10 = "thunderhead"
            r9 = 0
            android.content.SharedPreferences r10 = r6.getSharedPreferences(r10, r9)     // Catch:{ Exception -> 0x0071 }
            boolean r16 = r10.contains(r3)     // Catch:{ Exception -> 0x0071 }
            r20 = r0
            if (r16 == 0) goto L_0x015b
            boolean r0 = r10.getBoolean(r3, r9)     // Catch:{ Exception -> 0x0071 }
            o.FragmentBuilder_BindMailingAddressReviewFragment r16 = p040o.FragmentBuilder_BindMailingAddressReviewFragment.VERSION_5_REMEMBER_ME_FOUND     // Catch:{ Exception -> 0x0071 }
            r9 = r16
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r9 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r9     // Catch:{ Exception -> 0x0071 }
            r16 = r7
            r1 = 1
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0071 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0071 }
            r17 = r8
            r8 = 0
            r7[r8] = r1     // Catch:{ Exception -> 0x0071 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r9, r7)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r1 = "thunderhead_sdk"
            android.content.SharedPreferences r1 = r6.getSharedPreferences(r1, r8)     // Catch:{ Exception -> 0x0071 }
            o.FragmentBuilder_BindOnboardingCareerInformationFragment$IconCompatParcelizer r7 = p040o.FragmentBuilder_BindOnboardingCareerInformationFragment.read     // Catch:{ Exception -> 0x0071 }
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r7 = r2.IconCompatParcelizer     // Catch:{ Exception -> 0x0071 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r8 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0071 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0071 }
            r9.<init>()     // Catch:{ Exception -> 0x0071 }
            r18 = r6
            java.lang.String r6 = "remember_me-"
            r9.append(r6)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r6 = r7.read     // Catch:{ Exception -> 0x0071 }
            r9.append(r6)     // Catch:{ Exception -> 0x0071 }
            r6 = 45
            r9.append(r6)     // Catch:{ Exception -> 0x0071 }
            java.net.URI r6 = r8.write     // Catch:{ Exception -> 0x0071 }
            r9.append(r6)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r6 = r9.toString()     // Catch:{ Exception -> 0x0071 }
            boolean r7 = r1.contains(r6)     // Catch:{ Exception -> 0x0071 }
            if (r7 == 0) goto L_0x0139
            o.FragmentBuilder_BindMailingAddressReviewFragment r0 = p040o.FragmentBuilder_BindMailingAddressReviewFragment.VERSION_6_REMEMBER_ME_FOUND     // Catch:{ Exception -> 0x0071 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0     // Catch:{ Exception -> 0x0071 }
            r1 = 2
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0071 }
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r1 = r2.IconCompatParcelizer     // Catch:{ Exception -> 0x0071 }
            r7 = 0
            r6[r7] = r1     // Catch:{ Exception -> 0x0071 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r1 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0071 }
            java.net.URI r1 = r1.write     // Catch:{ Exception -> 0x0071 }
            r2 = 1
            r6[r2] = r1     // Catch:{ Exception -> 0x0071 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0, r6)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0145
        L_0x0139:
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ Exception -> 0x0071 }
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r6, r0)     // Catch:{ Exception -> 0x0071 }
            r0.commit()     // Catch:{ Exception -> 0x0071 }
        L_0x0145:
            android.content.SharedPreferences$Editor r0 = r10.edit()     // Catch:{ Exception -> 0x0071 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)     // Catch:{ Exception -> 0x0071 }
            r0.commit()     // Catch:{ Exception -> 0x0071 }
            o.FragmentBuilder_BindMailingAddressReviewFragment r0 = p040o.FragmentBuilder_BindMailingAddressReviewFragment.VERSION_5_REMEMBER_ME_MIGRATED     // Catch:{ Exception -> 0x0071 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0     // Catch:{ Exception -> 0x0071 }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0071 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0, r1)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0162
        L_0x015b:
            r18 = r6
            r16 = r7
            r17 = r8
            r2 = 1
        L_0x0162:
            o.HmlVerifyPhoneValidateOtpActivity r0 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0071 }
            if (r0 != r5) goto L_0x0167
            return r5
        L_0x0167:
            r1 = r19
            r0 = r20
            r9 = r2
            r7 = r16
            r8 = r17
            r6 = r18
            goto L_0x00a7
        L_0x0174:
            o.FragmentBuilder_BindMailingAddressReviewFragment r1 = p040o.FragmentBuilder_BindMailingAddressReviewFragment.SHARED_PREFERENCES_REMEMBER_ME_MIGRATION_FAILED
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r1 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r1
            p040o.MyECouponActivity_ViewBinding.read(r0, r1)
        L_0x017b:
            r6 = r12
            r2 = r13
            goto L_0x0188
        L_0x017e:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = "Weakreference null."
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r3)
        L_0x0185:
            r15 = r19
            r14 = r0
        L_0x0188:
            o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment r0 = r15.MediaBrowserCompat$ItemReceiver
            r4.IconCompatParcelizer = r15
            r4.read = r14
            r4.MediaBrowserCompat$CustomActionResultReceiver = r2
            r4.write = r6
            r1 = 2
            r4.MediaMetadataCompat = r1
            java.lang.Object r2 = r0.write(r14, r4)
            if (r2 != r5) goto L_0x019c
            return r5
        L_0x019c:
            return r2
        L_0x019d:
            o.HmlVerifyIdentifyActivity$write r2 = (p040o.HmlVerifyIdentifyActivity.write) r2
            java.lang.Throwable r0 = r2.read
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6610x1f6da9d4.write(o.FragmentBuilder_BindOPRStatusUnregisteredUserFragment$write, o.HmlNTBPromptPayNotFoundActivity):java.lang.Object");
    }
}
