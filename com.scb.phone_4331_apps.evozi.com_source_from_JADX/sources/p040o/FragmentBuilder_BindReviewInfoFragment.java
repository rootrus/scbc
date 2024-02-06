package p040o;

/* renamed from: o.FragmentBuilder_BindReviewInfoFragment */
public final /* synthetic */ class FragmentBuilder_BindReviewInfoFragment implements FundFactSheetActivity {
    private final /* synthetic */ FragmentBuilder_BindRiskReviewFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FragmentBuilder_BindReviewInfoFragment(FragmentBuilder_BindRiskReviewFragment fragmentBuilder_BindRiskReviewFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindRiskReviewFragment;
    }

    /* JADX WARNING: type inference failed for: r15v14, types: [com.thunderhead.connectivity.NetworkOperationCallback] */
    /* JADX WARNING: type inference failed for: r7v3, types: [o.DeejungInstallmentsConfirmationActivity_ViewBinding] */
    /* JADX WARNING: type inference failed for: r7v4, types: [o.CCAboutActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            o.FragmentBuilder_BindRiskReviewFragment r0 = r14.MediaBrowserCompat$CustomActionResultReceiver
            o.FragmentBuilder_BindReviewRedemptionFragment r15 = (p040o.FragmentBuilder_BindReviewRedemptionFragment) r15
            java.util.Set<java.lang.Long> r1 = r0.MediaBrowserCompat$SearchResultReceiver
            long r2 = r15.write
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r1 = r1.add(r2)
            r2 = 0
            if (r1 == 0) goto L_0x014d
            o.FragmentBuilder_BindHmlNTBApplyLoanEntryFragment r1 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer()
            if (r1 != 0) goto L_0x0020
            o.FragmentBuilder_BindManagePromptpayLandingFragment r15 = p040o.FragmentBuilder_BindManagePromptpayLandingFragment.NULL_NETWORK_CONTROLLER
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r15)
            goto L_0x014d
        L_0x0020:
            o.FragmentBuilder_BindRiskSelectionFragment r3 = r15.IconCompatParcelizer
            o.FragmentBuilder_BindRiskSelectionFragment r4 = p040o.FragmentBuilder_BindRiskSelectionFragment.INTERACTION
            java.lang.String r5 = ""
            r6 = 0
            r7 = 1
            if (r3 == r4) goto L_0x008d
            o.FragmentBuilder_BindRiskSelectionFragment r4 = p040o.FragmentBuilder_BindRiskSelectionFragment.PROGRAMATIC_INTERACTION
            if (r3 == r4) goto L_0x008d
            o.FragmentBuilder_BindRiskSelectionFragment r4 = p040o.FragmentBuilder_BindRiskSelectionFragment.PROPERTY
            if (r3 == r4) goto L_0x0036
            o.FragmentBuilder_BindRiskSelectionFragment r4 = p040o.FragmentBuilder_BindRiskSelectionFragment.PROGRAMATIC_PROPERTY
            if (r3 != r4) goto L_0x014d
        L_0x0036:
            com.google.gson.Gson r0 = r0.write
            java.lang.String r4 = r15.read
            java.lang.Class<o.ECouponCommonActivity> r8 = p040o.ECouponCommonActivity.class
            java.lang.Object r0 = r0.fromJson((java.lang.String) r4, r8)
            o.ECouponCommonActivity r0 = (p040o.ECouponCommonActivity) r0
            if (r0 != 0) goto L_0x004b
            o.FragmentBuilder_BindManageRecipientGroupFragment r15 = p040o.FragmentBuilder_BindManageRecipientGroupFragment.ERROR_CONVERTING_ENTITY
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r15)
            goto L_0x014d
        L_0x004b:
            java.lang.Long r4 = r15.RatingCompat
            if (r4 == 0) goto L_0x0058
            java.lang.Long r4 = r15.RatingCompat
            long r8 = r4.longValue()
            r0.write = r8
            goto L_0x005e
        L_0x0058:
            long r8 = java.lang.System.currentTimeMillis()
            r0.write = r8
        L_0x005e:
            o.FragmentBuilder_BindRiskSelectionFragment r4 = p040o.FragmentBuilder_BindRiskSelectionFragment.PROGRAMATIC_PROPERTY
            if (r3 != r4) goto L_0x0063
            r6 = r7
        L_0x0063:
            long r11 = r15.write
            java.lang.String r15 = r0.MediaBrowserCompat$ItemReceiver
            boolean r15 = r15.equals(r5)
            if (r15 == 0) goto L_0x007b
            o.CCAboutActivity r15 = new o.CCAboutActivity
            o.ECouponCommonActivity_ViewBinding r9 = r1.MediaDescriptionCompat
            o.ConfirmRedemptionActivity r10 = r1.RatingCompat
            r13 = 1
            java.lang.String r8 = ""
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r13)
            goto L_0x0088
        L_0x007b:
            o.DeejungInstallmentsConfirmationActivity_ViewBinding r15 = new o.DeejungInstallmentsConfirmationActivity_ViewBinding
            java.lang.String r8 = r0.MediaBrowserCompat$ItemReceiver
            o.ECouponCommonActivity_ViewBinding r9 = r1.MediaDescriptionCompat
            o.ConfirmRedemptionActivity r10 = r1.RatingCompat
            r13 = 1
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r13)
        L_0x0088:
            r1.read(r6, r0, r15)
            goto L_0x014d
        L_0x008d:
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r10 = r0.MediaBrowserCompat$CustomActionResultReceiver(r15)
            o.FragmentBuilder_BindRiskSelectionFragment r0 = p040o.FragmentBuilder_BindRiskSelectionFragment.PROGRAMATIC_INTERACTION
            if (r3 != r0) goto L_0x0097
            r0 = r7
            goto L_0x0098
        L_0x0097:
            r0 = r6
        L_0x0098:
            if (r10 == 0) goto L_0x014d
            long r3 = r15.write
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r8 = new o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment
            java.lang.String r9 = r15.MediaBrowserCompat$ItemReceiver
            r8.<init>(r9)
            o.FragmentBuilder_BindHmlOperatingBankFragment r13 = new o.FragmentBuilder_BindHmlOperatingBankFragment
            java.lang.String r15 = r15.MediaBrowserCompat$CustomActionResultReceiver
            java.net.URI r15 = java.net.URI.create(r15)
            r13.<init>((java.net.URI) r15)
            o.BaseAmortizationActivity_ViewBinding r11 = new o.BaseAmortizationActivity_ViewBinding
            o.ECouponCommonActivity_ViewBinding r15 = r1.MediaDescriptionCompat
            o.ConfirmRedemptionActivity r9 = r1.RatingCompat
            r11.<init>(r15, r9, r3)
            if (r0 == 0) goto L_0x00bc
            r15 = 17
            goto L_0x00be
        L_0x00bc:
            r15 = 15
        L_0x00be:
            r12 = r15
            o.ECouponCommonActivity_ViewBinding r15 = r1.MediaDescriptionCompat
            o.ECouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver r0 = new o.ECouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver
            java.lang.String r9 = r8.read
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = r15.MediaDescriptionCompat
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00e2
            o.MyECouponActivity_ViewBinding$write r15 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = "QueueManager"
            java.lang.String r1 = "addToOfflineQueue"
            java.lang.String r0 = p040o.C6557x2438d01c.MediaBrowserCompat$ItemReceiver(r0, r1)
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r15, (java.lang.String) r0)
            goto L_0x014d
        L_0x00e2:
            boolean r1 = r15.write
            if (r1 != 0) goto L_0x0129
            boolean r1 = r15.write((p040o.C6437x1b3a90a2) r0)
            if (r1 != 0) goto L_0x0129
            int r1 = r0.write
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 == 0) goto L_0x00f9
            com.thunderhead.android.infrastructure.server.requests.BaseRequest r3 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r3.getUri()
            goto L_0x00fb
        L_0x00f9:
            java.lang.String r3 = "missing uri"
        L_0x00fb:
            com.thunderhead.connectivity.NetworkOperationCallback r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0102
            r0.onFailure(r2)
        L_0x0102:
            o.FragmentBuilder_BindLoanFragment r0 = p040o.FragmentBuilder_BindLoanFragment.DENIED_OFFLINE_INTERACTION
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r6] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r7] = r1
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r1 = r15.MediaSessionCompat$ResultReceiverWrapper
            if (r1 == 0) goto L_0x0116
            java.lang.String r1 = r1.read
            goto L_0x0117
        L_0x0116:
            r1 = r5
        L_0x0117:
            r3 = 2
            r4[r3] = r1
            java.net.URI r15 = r15.AlertController$RecycleListView
            if (r15 == 0) goto L_0x0122
            java.lang.String r5 = r15.toString()
        L_0x0122:
            r15 = 3
            r4[r15] = r5
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0, r4)
            goto L_0x014d
        L_0x0129:
            java.util.List<o.ECouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver> r1 = r15.MediaMetadataCompat
            r1.add(r0)
            boolean r1 = r15.f3133x50fd9e4a
            if (r1 != 0) goto L_0x014d
            boolean r1 = r15.write
            if (r1 != 0) goto L_0x014d
            boolean r1 = r15.read
            if (r1 == 0) goto L_0x014d
            java.util.List<o.ECouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver> r1 = r15.MediaMetadataCompat
            int r1 = r1.size()
            if (r1 != r7) goto L_0x014d
            java.util.List<o.ECouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver> r1 = r15.MediaBrowserCompat$MediaItem
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x014d
            r15.MediaBrowserCompat$ItemReceiver(r0)
        L_0x014d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindReviewInfoFragment.invoke(java.lang.Object):java.lang.Object");
    }
}
