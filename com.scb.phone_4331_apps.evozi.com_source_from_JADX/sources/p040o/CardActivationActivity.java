package p040o;

/* renamed from: o.CardActivationActivity */
public class CardActivationActivity extends AmortizationActivity_ViewBinding {
    private final FragmentBuilder_BindHmlETBBusinessInformationFragment IconCompatParcelizer;
    private final String MediaBrowserCompat$SearchResultReceiver;
    private final FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment RatingCompat;

    public CardActivationActivity(String str, ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding, ConfirmRedemptionActivity confirmRedemptionActivity, FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment, FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment, String str2) {
        super(str, eCouponCommonActivity_ViewBinding, confirmRedemptionActivity);
        this.RatingCompat = fragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment;
        this.IconCompatParcelizer = fragmentBuilder_BindHmlETBBusinessInformationFragment;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void MediaBrowserCompat$ItemReceiver(com.thunderhead.android.infrastructure.server.responses.BaseResponse r15) {
        /*
            r14 = this;
            java.lang.String r0 = r14.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = r14.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r2 = ".+://\\S+/\\S+"
            boolean r2 = r0.matches(r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0016
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x0016
            r0 = r3
            goto L_0x0017
        L_0x0016:
            r0 = r4
        L_0x0017:
            if (r0 == 0) goto L_0x02e2
            o.ECouponCommonActivity_ViewBinding r0 = r14.MediaBrowserCompat$CustomActionResultReceiver
            o.FragmentBuilder_BindHmlNTBDocumentListFragment r0 = r0.ParcelableVolumeInfo
            r0.MediaBrowserCompat$ItemReceiver = r15
            o.FragmentBuilder_BindHmlNTBAdditionalDocumentInputFragment r0 = r14.RatingCompat
            java.lang.String r1 = r14.MediaBrowserCompat$ItemReceiver
            o.FragmentBuilder_BindHmlETBOfflineSuccessFragment r2 = r0.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x02db
            if (r15 == 0) goto L_0x02db
            com.thunderhead.android.infrastructure.server.entitys.Optimizations[] r2 = r15.getOptimizations()
            if (r2 == 0) goto L_0x004e
            int r5 = r2.length
            r0.read = r5
            java.util.ArrayList<o.FragmentBuilder_BindHowToAddFavouriteTopUpFragment<java.lang.Integer>> r5 = r0.IconCompatParcelizer
            java.util.Iterator r5 = r5.iterator()
        L_0x0038:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x004e
            java.lang.Object r6 = r5.next()
            o.FragmentBuilder_BindHowToAddFavouriteTopUpFragment r6 = (p040o.FragmentBuilder_BindHowToAddFavouriteTopUpFragment) r6
            int r7 = r0.read
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.MediaBrowserCompat$CustomActionResultReceiver(r7)
            goto L_0x0038
        L_0x004e:
            if (r2 == 0) goto L_0x02db
            int r5 = r2.length
            if (r5 == 0) goto L_0x02db
            int r5 = r2.length
            r6 = r3
        L_0x0055:
            if (r6 >= r5) goto L_0x02db
            r7 = r2[r6]
            r8 = 0
            if (r1 == 0) goto L_0x00f7
            if (r7 == 0) goto L_0x00f7
            java.lang.String r9 = r7.getPath()
            if (r9 == 0) goto L_0x00f1
            java.lang.String r9 = r9.trim()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00f1
            java.lang.String r9 = r7.getDataMimeType()
            if (r9 == 0) goto L_0x00eb
            java.lang.String r9 = r9.trim()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00eb
            java.lang.String r7 = r7.getData()
            if (r7 == 0) goto L_0x00e5
            java.lang.String r9 = r7.trim()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00e5
            com.thunderhead.android.infrastructure.server.entitys.OptimizationActions r7 = p040o.AlertController$RecycleListView.MediaMetadataCompat((java.lang.String) r7)
            com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action[] r9 = r7.getActions()
            java.lang.String r10 = "Malformed optimization JSON."
            if (r9 == 0) goto L_0x00df
            com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action[] r9 = r7.getActions()
            int r9 = r9.length
            if (r9 == 0) goto L_0x00df
            com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action[] r7 = r7.getActions()
            r7 = r7[r3]
            if (r7 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d9
            com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action$Asset r7 = r7.getAsset()
            if (r7 != 0) goto L_0x00b7
            o.MyECouponActivity_ViewBinding$write r7 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r7, (java.lang.String) r10)
            goto L_0x00fc
        L_0x00b7:
            java.lang.String r9 = r7.getContent()
            if (r9 == 0) goto L_0x00d3
            java.lang.String r9 = r9.trim()
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x00d3
            com.thunderhead.android.infrastructure.server.entitys.Content r9 = r7.getContentObject()
            if (r9 != 0) goto L_0x00fd
            o.MyECouponActivity_ViewBinding$write r7 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r7, (java.lang.String) r10)
            goto L_0x00fc
        L_0x00d3:
            java.lang.String r7 = "Failed to create notification: content field should not be empty"
            p040o.MyECouponActivity_ViewBinding.write(r7)
            goto L_0x00fc
        L_0x00d9:
            java.lang.String r7 = "Failed to create notification: interaction and action should not be null"
            p040o.MyECouponActivity_ViewBinding.write(r7)
            goto L_0x00fc
        L_0x00df:
            o.MyECouponActivity_ViewBinding$write r7 = p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r7, (java.lang.String) r10)
            goto L_0x00fc
        L_0x00e5:
            java.lang.String r7 = "Failed to create notification: mandatory field data is empty"
            p040o.MyECouponActivity_ViewBinding.write(r7)
            goto L_0x00fc
        L_0x00eb:
            java.lang.String r7 = "Failed to create notification: mandatory field dataMimeType is empty"
            p040o.MyECouponActivity_ViewBinding.write(r7)
            goto L_0x00fc
        L_0x00f1:
            java.lang.String r7 = "Failed to create notification: mandatory field path is empty"
            p040o.MyECouponActivity_ViewBinding.write(r7)
            goto L_0x00fc
        L_0x00f7:
            java.lang.String r7 = "Failed to create notification: null input"
            p040o.MyECouponActivity_ViewBinding.write(r7)
        L_0x00fc:
            r7 = r8
        L_0x00fd:
            if (r7 == 0) goto L_0x02d7
            com.thunderhead.android.infrastructure.server.entitys.Content r9 = r7.getContentObject()
            if (r9 == 0) goto L_0x02d7
            int r9 = r7.type()
            r10 = 2
            if (r9 != r10) goto L_0x0139
            com.thunderhead.android.infrastructure.server.entitys.Content r7 = r7.getContentObject()
            java.lang.String r7 = r7.getWebOneTagUrl()
            o.BulkTransferOtpActivity r8 = new o.BulkTransferOtpActivity
            r8.<init>()
            android.content.Context r8 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat()
            boolean r9 = p040o.onReviewButtonClicked.read()
            if (r9 != 0) goto L_0x012c
            o.MyECouponActivity_ViewBinding$write r9 = p040o.MyECouponActivity_ViewBinding.write
            java.lang.String r10 = "Unable to transfer identity via custom tabs because the app has no custom tabs dependency"
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r9, (java.lang.String) r10)
            r9 = r3
            goto L_0x012d
        L_0x012c:
            r9 = r4
        L_0x012d:
            if (r9 == 0) goto L_0x02d7
            o.BulkTransferInputActivity_ViewBinding r9 = new o.BulkTransferInputActivity_ViewBinding
            r9.<init>(r8, r7)
            r9.write()
            goto L_0x02d7
        L_0x0139:
            int r9 = r7.type()
            if (r9 != r4) goto L_0x02d7
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment r9 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()
            java.lang.Object r9 = r9.MediaBrowserCompat$ItemReceiver()
            o.OnBoardingTutorialActivity r9 = (p040o.OnBoardingTutorialActivity) r9
            java.lang.String r9 = p040o.FragmentBuilder_BindOnboardingInputAddressFragment.MediaDescriptionCompat(r9)
            if (r1 == 0) goto L_0x02c9
            if (r7 == 0) goto L_0x02c9
            if (r9 == 0) goto L_0x018c
            java.lang.String r10 = r9.trim()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x018c
            java.lang.String r10 = " "
            java.lang.String r11 = ""
            java.lang.String r9 = r9.replaceAll(r10, r11)
            android.net.Uri r10 = android.net.Uri.parse(r9)
            java.lang.String r11 = r10.getScheme()
            if (r11 == 0) goto L_0x017a
            java.lang.String r10 = r10.getScheme()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x017a
            goto L_0x0192
        L_0x017a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "https://"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            goto L_0x0192
        L_0x018c:
            java.lang.String r9 = "Hostname equal null or empty"
            p040o.MyECouponActivity_ViewBinding.write(r9)
            r9 = r8
        L_0x0192:
            if (r9 == 0) goto L_0x02c9
            com.thunderhead.android.infrastructure.server.entitys.Content r9 = r7.getContentObject()
            if (r9 == 0) goto L_0x02c9
            java.lang.String r10 = r9.getType()
            o.FragmentBuilder_BindHmlETBSummaryFragment$IconCompatParcelizer r11 = p040o.FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.MINI_NOTIFICATION_BOTTOM
            java.lang.String r11 = r11.toString()
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x01dd
            o.FragmentBuilder_BindHmlETBSummaryFragment$IconCompatParcelizer r11 = p040o.FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.MINI_NOTIFICATION_TOP
            java.lang.String r11 = r11.toString()
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x01dd
            o.FragmentBuilder_BindHmlETBSummaryFragment$IconCompatParcelizer r11 = p040o.FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.FULL
            java.lang.String r11 = r11.toString()
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x01f1
            java.lang.String r11 = r9.getImageUrl()
            if (r11 == 0) goto L_0x01d6
            java.lang.String r11 = r9.getImageUrl()
            java.lang.String r11 = r11.trim()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x01f1
        L_0x01d6:
            o.FragmentBuilder_BindSmeLoanStatusFragment r7 = p040o.FragmentBuilder_BindSmeLoanStatusFragment.FULLSCREEN_EMPTY_IMAGE_URL
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r7)
            goto L_0x02c9
        L_0x01dd:
            java.lang.String r11 = r9.getMessage()
            if (r11 == 0) goto L_0x02c4
            java.lang.String r11 = r9.getMessage()
            java.lang.String r11 = r11.trim()
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x02c4
        L_0x01f1:
            o.FragmentBuilder_BindHmlETBSummaryFragment$IconCompatParcelizer r11 = p040o.FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.MINI_NOTIFICATION_BOTTOM
            java.lang.String r11 = r11.toString()
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x021d
            o.FragmentBuilder_BindHmlETBSummaryFragment$IconCompatParcelizer r11 = p040o.FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.MINI_NOTIFICATION_TOP
            java.lang.String r11 = r11.toString()
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x021d
            o.FragmentBuilder_BindHmlETBSummaryFragment$IconCompatParcelizer r11 = p040o.FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.FULL
            java.lang.String r11 = r11.toString()
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x021b
            o.FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment r11 = new o.FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment
            r11.<init>()
            goto L_0x0222
        L_0x021b:
            r11 = r8
            goto L_0x0222
        L_0x021d:
            o.FragmentBuilder_BindHmlETBLoanSetupFragment r11 = new o.FragmentBuilder_BindHmlETBLoanSetupFragment
            r11.<init>()
        L_0x0222:
            if (r11 != 0) goto L_0x022f
            o.FragmentBuilder_BindSmeLoanStatusFragment r7 = p040o.FragmentBuilder_BindSmeLoanStatusFragment.UNKNOWN_NOTIFICATION_TYPE
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r3] = r10
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r7, (java.lang.Object[]) r9)
            goto L_0x02c9
        L_0x022f:
            java.lang.String r10 = r7.getMimeType()
            if (r10 == 0) goto L_0x02be
            java.lang.String r10 = r7.getMimeType()
            java.lang.String r10 = r10.trim()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x02be
            r7.getMimeType()
            r11.RatingCompat = r1
            java.lang.String r8 = r9.getMessage()
            r11.MediaSessionCompat$QueueItem = r8
            java.lang.String r8 = r9.getImageUrl()
            r11.MediaDescriptionCompat = r8
            java.lang.String r8 = r9.getBackgroundColor()
            r11.MediaMetadataCompat = r8
            long r12 = r9.getPresentationTime()
            r11.MediaSessionCompat$ResultReceiverWrapper = r12
            int r8 = r9.getTextSize()
            r11.PlaybackStateCompat = r8
            java.lang.String r8 = r9.getTextColor()
            r11.setHasDecor = r8
            java.lang.Boolean r8 = r9.getShowOnTop()
            r11.AlertController$RecycleListView = r8
            com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action$Asset$Response[] r8 = r7.getResponses()
            if (r8 == 0) goto L_0x0293
            r8 = r3
        L_0x0279:
            com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action$Asset$Response[] r9 = r7.getResponses()
            int r9 = r9.length
            if (r8 >= r9) goto L_0x0293
            com.thunderhead.android.infrastructure.server.entitys.OptimizationActions$Action$Asset$Response[] r9 = r7.getResponses()
            r9 = r9[r8]
            o.FragmentBuilder_BindHmlNTBAccountSetupFragment r10 = new o.FragmentBuilder_BindHmlNTBAccountSetupFragment
            r10.<init>(r9, r11)
            java.util.List<o.FragmentBuilder_BindHmlLandingFragment> r9 = r11.f3144x50fd9e4a
            r9.add(r10)
            int r8 = r8 + 1
            goto L_0x0279
        L_0x0293:
            o.MyECouponActivity_ViewBinding$write r7 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Notification "
            r8.append(r9)
            int r9 = r11.hashCode()
            r8.append(r9)
            java.lang.String r9 = ", int. "
            r8.append(r9)
            java.lang.String r9 = r11.RatingCompat
            r8.append(r9)
            java.lang.String r9 = " created"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r7, (java.lang.String) r8)
            r8 = r11
            goto L_0x02c9
        L_0x02be:
            o.FragmentBuilder_BindSmeLoanStatusFragment r7 = p040o.FragmentBuilder_BindSmeLoanStatusFragment.NOTIFICATION_MISSING_MIMETYPE
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r7)
            goto L_0x02c9
        L_0x02c4:
            o.FragmentBuilder_BindSmeLoanStatusFragment r7 = p040o.FragmentBuilder_BindSmeLoanStatusFragment.MINI_NOTIFICATION_MESSAGE_EMPTY
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r7)
        L_0x02c9:
            if (r8 == 0) goto L_0x02d7
            o.FragmentBuilder_BindHmlEditOperatingAccountFragment r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r8.write(r7)
            r8.MediaSessionCompat$Token = r4
            o.FragmentBuilder_BindHmlETBOfflineSuccessFragment r7 = r0.MediaBrowserCompat$ItemReceiver
            r7.MediaBrowserCompat$ItemReceiver(r8)
        L_0x02d7:
            int r6 = r6 + 1
            goto L_0x0055
        L_0x02db:
            o.FragmentBuilder_BindHmlETBBusinessInformationFragment r0 = r14.IconCompatParcelizer
            java.lang.String r1 = r14.MediaBrowserCompat$ItemReceiver
            r0.write(r1, r15)
        L_0x02e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.CardActivationActivity.MediaBrowserCompat$ItemReceiver(com.thunderhead.android.infrastructure.server.responses.BaseResponse):void");
    }
}
