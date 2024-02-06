package p040o;

import java.util.List;

/* renamed from: o.FragmentBuilder_BindOnBoardingInvestmentInformationFragment */
public class FragmentBuilder_BindOnBoardingInvestmentInformationFragment {
    public SupportMapFragment read;
    public List<onIndoorLevelActivated> write;

    public FragmentBuilder_BindOnBoardingInvestmentInformationFragment() {
    }

    public FragmentBuilder_BindOnBoardingInvestmentInformationFragment(SupportMapFragment supportMapFragment, List<onIndoorLevelActivated> list) {
        this.read = supportMapFragment;
        this.write = list;
    }

    /* renamed from: o.FragmentBuilder_BindOnBoardingInvestmentInformationFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer<S> implements FragmentBuilder_BindJuristicResetPinLandingFragment<OnBoardingTutorialActivity> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object read(java.lang.Object r27, java.lang.Object r28) {
            /*
                r26 = this;
                r0 = r28
                r1 = r27
                o.OnBoardingTutorialActivity r1 = (p040o.OnBoardingTutorialActivity) r1
                java.lang.String r2 = "currentState"
                p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
                java.lang.String r2 = "action"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
                boolean r2 = r0 instanceof p040o.FragmentBuilder_BindOccupationListFragment
                r3 = 0
                if (r2 != 0) goto L_0x0016
                r0 = r3
            L_0x0016:
                o.FragmentBuilder_BindOccupationListFragment r0 = (p040o.FragmentBuilder_BindOccupationListFragment) r0
                if (r0 == 0) goto L_0x02ef
                boolean r2 = r0 instanceof p040o.FragmentBuilder_BindOccupationListFragment.MediaMetadataCompat
                if (r2 == 0) goto L_0x00be
                o.FragmentBuilder_BindOccupationListFragment$MediaMetadataCompat r0 = (p040o.FragmentBuilder_BindOccupationListFragment.MediaMetadataCompat) r0
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r0.write
                o.FragmentBuilder_BindHmlOccupationInfoFragment r2 = r2.MediaMetadataCompat
                if (r2 == 0) goto L_0x0042
                java.lang.String r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
                if (r2 == 0) goto L_0x0042
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r2 = r2.length()
                if (r2 != 0) goto L_0x0034
                r2 = 1
                goto L_0x0035
            L_0x0034:
                r2 = 0
            L_0x0035:
                if (r2 != 0) goto L_0x0042
                o.FragmentBuilder_BindOnboardingSuccessFragment r2 = r1.MediaDescriptionCompat
                if (r2 == 0) goto L_0x0046
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
                if (r2 == 0) goto L_0x0046
                o.FragmentBuilder_BindHmlOccupationInfoFragment r3 = r2.MediaMetadataCompat
                goto L_0x0046
            L_0x0042:
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r0.write
                o.FragmentBuilder_BindHmlOccupationInfoFragment r3 = r2.MediaMetadataCompat
            L_0x0046:
                r9 = r3
                o.FragmentBuilder_BindOnboardingSuccessFragment r2 = r1.MediaDescriptionCompat
                if (r2 == 0) goto L_0x0077
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
                if (r2 == 0) goto L_0x0077
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r0.write
                o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r5 = r2.MediaBrowserCompat$CustomActionResultReceiver
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r0.write
                java.net.URI r6 = r2.MediaDescriptionCompat
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r0.write
                o.FragmentBuilder_BindHmlOperatingBankFragment r7 = r2.write
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r0.write
                o.FragmentBuilder_BindHmlNTBAccountConsentFragment r8 = r2.MediaBrowserCompat$ItemReceiver
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r0.write
                o.FragmentBuilder_BindHmlNtbCalculatorFragment r10 = r2.IconCompatParcelizer
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r0.write
                o.FragmentBuilder_BindHmlNdidSelectIdpSuccessFragment r11 = r2.read
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r0 = r0.write
                o.FragmentBuilder_BindHmlNtbOutcomePendingFragment r12 = r0.MediaBrowserCompat$SearchResultReceiver
                java.lang.String r0 = "mode"
                p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r0 = new o.FragmentBuilder_BindHmlNoDepositAccountFragment
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                goto L_0x0079
            L_0x0077:
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r0 = r0.write
            L_0x0079:
                r3 = r0
                o.FragmentBuilder_BindOnboardingSuccessFragment r2 = r1.MediaDescriptionCompat
                if (r2 == 0) goto L_0x008b
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 126(0x7e, float:1.77E-43)
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = p040o.FragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                goto L_0x0092
            L_0x008b:
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = new o.FragmentBuilder_BindOnboardingSuccessFragment
                r2 = 126(0x7e, float:1.77E-43)
                r0.<init>(r3, r2)
            L_0x0092:
                r25 = r0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 8388606(0x7ffffe, float:1.1754941E-38)
                r0 = r1
                r1 = r25
                o.OnBoardingTutorialActivity r1 = p040o.OnBoardingTutorialActivity.read(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                goto L_0x02ef
            L_0x00be:
                boolean r2 = r0 instanceof p040o.C6609x4a2fa733
                r4 = 239(0xef, float:3.35E-43)
                if (r2 == 0) goto L_0x0116
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = r1.MediaDescriptionCompat
                if (r0 == 0) goto L_0x00d1
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                if (r0 == 0) goto L_0x00d1
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r0 = p040o.FragmentBuilder_BindHmlNoDepositAccountFragment.IconCompatParcelizer(r0, r3)
                goto L_0x00d6
            L_0x00d1:
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r0 = new o.FragmentBuilder_BindHmlNoDepositAccountFragment
                r0.<init>(r3, r3, r4)
            L_0x00d6:
                r6 = r0
                o.FragmentBuilder_BindOnboardingSuccessFragment r5 = r1.MediaDescriptionCompat
                if (r5 == 0) goto L_0x00ea
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 126(0x7e, float:1.77E-43)
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = p040o.FragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r25 = r0
                goto L_0x00ec
            L_0x00ea:
                r25 = r3
            L_0x00ec:
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 8388606(0x7ffffe, float:1.1754941E-38)
                r0 = r1
                r1 = r25
                o.OnBoardingTutorialActivity r1 = p040o.OnBoardingTutorialActivity.read(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                goto L_0x02ef
            L_0x0116:
                o.FragmentBuilder_BindOccupationListFragment$read r2 = p040o.FragmentBuilder_BindOccupationListFragment.read.read
                boolean r2 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0, (java.lang.Object) r2)
                if (r2 == 0) goto L_0x015e
                o.FragmentBuilder_BindOnboardingSuccessFragment r5 = r1.MediaDescriptionCompat
                if (r5 == 0) goto L_0x0132
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 113(0x71, float:1.58E-43)
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = p040o.FragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r25 = r0
                goto L_0x0134
            L_0x0132:
                r25 = r3
            L_0x0134:
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 8388606(0x7ffffe, float:1.1754941E-38)
                r0 = r1
                r1 = r25
                o.OnBoardingTutorialActivity r1 = p040o.OnBoardingTutorialActivity.read(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                goto L_0x02ef
            L_0x015e:
                boolean r2 = r0 instanceof p040o.FragmentBuilder_BindOccupationListFragment.RatingCompat
                if (r2 == 0) goto L_0x01bd
                o.FragmentBuilder_BindOnboardingSuccessFragment r2 = r1.MediaDescriptionCompat
                if (r2 == 0) goto L_0x0174
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
                if (r2 == 0) goto L_0x0174
                o.FragmentBuilder_BindOccupationListFragment$RatingCompat r0 = (p040o.FragmentBuilder_BindOccupationListFragment.RatingCompat) r0
                o.FragmentBuilder_BindHmlOccupationInfoFragment r0 = r0.IconCompatParcelizer
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r0 = p040o.FragmentBuilder_BindHmlNoDepositAccountFragment.IconCompatParcelizer(r2, r0)
                r6 = r0
                goto L_0x017e
            L_0x0174:
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = new o.FragmentBuilder_BindHmlNoDepositAccountFragment
                o.FragmentBuilder_BindOccupationListFragment$RatingCompat r0 = (p040o.FragmentBuilder_BindOccupationListFragment.RatingCompat) r0
                o.FragmentBuilder_BindHmlOccupationInfoFragment r0 = r0.IconCompatParcelizer
                r2.<init>(r3, r0, r4)
                r6 = r2
            L_0x017e:
                o.FragmentBuilder_BindOnboardingSuccessFragment r5 = r1.MediaDescriptionCompat
                if (r5 == 0) goto L_0x0191
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 124(0x7c, float:1.74E-43)
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = p040o.FragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                r25 = r0
                goto L_0x0193
            L_0x0191:
                r25 = r3
            L_0x0193:
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 8388606(0x7ffffe, float:1.1754941E-38)
                r0 = r1
                r1 = r25
                o.OnBoardingTutorialActivity r1 = p040o.OnBoardingTutorialActivity.read(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                goto L_0x02ef
            L_0x01bd:
                boolean r2 = r0 instanceof p040o.C6608x9567a686
                if (r2 == 0) goto L_0x0213
                o.FragmentBuilder_BindOnboardingSuccessFragment r2 = r1.MediaDescriptionCompat
                if (r2 == 0) goto L_0x01cf
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
                if (r2 == 0) goto L_0x01cf
                o.FragmentBuilder_BindHmlNoDepositAccountFragment r2 = p040o.FragmentBuilder_BindHmlNoDepositAccountFragment.IconCompatParcelizer(r2, r3)
                r5 = r2
                goto L_0x01d0
            L_0x01cf:
                r5 = r3
            L_0x01d0:
                o.FragmentBuilder_BindOnboardingSuccessFragment r4 = r1.MediaDescriptionCompat
                if (r4 == 0) goto L_0x01e7
                o.FragmentBuilder_BindOccupationListFragment$MediaBrowserCompat$ItemReceiver r0 = (p040o.C6608x9567a686) r0
                java.lang.Throwable r7 = r0.IconCompatParcelizer
                o.FragmentBuilder_BindMerchantWalletSelectorFragment r8 = r0.MediaBrowserCompat$CustomActionResultReceiver
                r6 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 112(0x70, float:1.57E-43)
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = p040o.FragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r25 = r0
                goto L_0x01e9
            L_0x01e7:
                r25 = r3
            L_0x01e9:
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 8388606(0x7ffffe, float:1.1754941E-38)
                r0 = r1
                r1 = r25
                o.OnBoardingTutorialActivity r1 = p040o.OnBoardingTutorialActivity.read(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                goto L_0x02ef
            L_0x0213:
                o.FragmentBuilder_BindOccupationListFragment$write r2 = p040o.FragmentBuilder_BindOccupationListFragment.write.MediaBrowserCompat$ItemReceiver
                boolean r2 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0, (java.lang.Object) r2)
                if (r2 == 0) goto L_0x025b
                o.FragmentBuilder_BindOnboardingSuccessFragment r4 = r1.MediaDescriptionCompat
                if (r4 == 0) goto L_0x022f
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 15
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = p040o.FragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r25 = r0
                goto L_0x0231
            L_0x022f:
                r25 = r3
            L_0x0231:
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 8388606(0x7ffffe, float:1.1754941E-38)
                r0 = r1
                r1 = r25
                o.OnBoardingTutorialActivity r1 = p040o.OnBoardingTutorialActivity.read(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                goto L_0x02ef
            L_0x025b:
                o.FragmentBuilder_BindOccupationListFragment$MediaBrowserCompat$CustomActionResultReceiver r2 = p040o.C6607x38279b77.MediaBrowserCompat$CustomActionResultReceiver
                boolean r2 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0, (java.lang.Object) r2)
                if (r2 == 0) goto L_0x02a2
                o.FragmentBuilder_BindOnboardingSuccessFragment r4 = r1.MediaDescriptionCompat
                if (r4 == 0) goto L_0x0277
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 111(0x6f, float:1.56E-43)
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = p040o.FragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r25 = r0
                goto L_0x0279
            L_0x0277:
                r25 = r3
            L_0x0279:
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 8388606(0x7ffffe, float:1.1754941E-38)
                r0 = r1
                r1 = r25
                o.OnBoardingTutorialActivity r1 = p040o.OnBoardingTutorialActivity.read(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                goto L_0x02ef
            L_0x02a2:
                boolean r2 = r0 instanceof p040o.FragmentBuilder_BindOccupationListFragment.IconCompatParcelizer
                if (r2 == 0) goto L_0x02e9
                o.FragmentBuilder_BindOnboardingSuccessFragment r4 = r1.MediaDescriptionCompat
                if (r4 == 0) goto L_0x02be
                o.FragmentBuilder_BindOccupationListFragment$IconCompatParcelizer r0 = (p040o.FragmentBuilder_BindOccupationListFragment.IconCompatParcelizer) r0
                java.lang.Throwable r11 = r0.read
                o.FragmentBuilder_BindMerchantWalletSelectorFragment r10 = r0.write
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r12 = 15
                o.FragmentBuilder_BindOnboardingSuccessFragment r0 = p040o.FragmentBuilder_BindOnboardingSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r25 = r0
                goto L_0x02c0
            L_0x02be:
                r25 = r3
            L_0x02c0:
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 8388606(0x7ffffe, float:1.1754941E-38)
                r0 = r1
                r1 = r25
                o.OnBoardingTutorialActivity r1 = p040o.OnBoardingTutorialActivity.read(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                goto L_0x02ef
            L_0x02e9:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L_0x02ef:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindOnBoardingInvestmentInformationFragment.IconCompatParcelizer.read(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
