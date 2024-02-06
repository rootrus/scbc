package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOccupationInfoFragment$MediaBrowserCompat$ItemReceiver */
final class C6014x742371cc implements View.OnClickListener {
    private /* synthetic */ HmlBusinessOccupationInfoFragment read;

    C6014x742371cc(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment) {
        this.read = hmlBusinessOccupationInfoFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r5) {
        /*
            r4 = this;
            com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOccupationInfoFragment r5 = r4.read
            o.setUserLoggedIn<o.ExtractionCredentials> r5 = r5.presenter
            if (r5 != 0) goto L_0x000b
            java.lang.String r0 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x000b:
            o.zzca$zzg r0 = r5.read
            java.lang.String r0 = r0.IconCompatParcelizer
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r2
        L_0x0016:
            if (r0 == 0) goto L_0x0046
            o.zzca$zzg r0 = r5.read
            o.zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0046
            o.getAuthApiSignInModuleVersion r0 = r5.MediaSessionCompat$QueueItem
            o.zzca$zzg r3 = r5.read
            o.zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver r3 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r3.MediaBrowserCompat$ItemReceiver
            if (r3 != 0) goto L_0x002c
            r0 = r2
            goto L_0x0036
        L_0x002c:
            java.util.regex.Pattern r0 = r0.IconCompatParcelizer
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r0 = r0.matches()
        L_0x0036:
            if (r0 == 0) goto L_0x0046
            boolean r0 = r5.MediaBrowserCompat$ItemReceiver()
            if (r0 == 0) goto L_0x0046
            boolean r0 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            if (r0 == 0) goto L_0x0046
            r0 = r1
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 == 0) goto L_0x0076
            boolean r0 = r5.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x00f0
            r5.MediaBrowserCompat$SearchResultReceiver = r2
            T r0 = r5.RatingCompat
            if (r0 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r1 = r2
        L_0x0055:
            if (r1 == 0) goto L_0x005c
            T r0 = r5.RatingCompat
            r0.AlertController$RecycleListView()
        L_0x005c:
            o.setCompatHoveredFocusedTranslationZResource r0 = r5.MediaSessionCompat$Token
            o.setUserLoggedIn$RatingCompat r1 = new o.setUserLoggedIn$RatingCompat
            r1.<init>(r5)
            o.FundActionsSuccessActivity r1 = (p040o.FundActionsSuccessActivity) r1
            o.setUserLoggedIn$MediaDescriptionCompat r2 = new o.setUserLoggedIn$MediaDescriptionCompat
            r2.<init>(r5)
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2
            o.zzca$zzg r3 = r5.read
            o.getLastInNonemptyList$MediaBrowserCompat$CustomActionResultReceiver r3 = (p040o.C4602xca7af99c) r3
            o.ChequeInquiryDeepLinkActivity r5 = r5.IconCompatParcelizer
            r0.MediaBrowserCompat$ItemReceiver(r1, r2, r3, r5)
            return
        L_0x0076:
            o.setUserLoggedIn$MediaSessionCompat$Token r0 = p040o.setUserLoggedIn$MediaSessionCompat$Token.write
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r5.RatingCompat
            if (r3 == 0) goto L_0x0080
            r3 = r1
            goto L_0x0081
        L_0x0080:
            r3 = r2
        L_0x0081:
            if (r3 == 0) goto L_0x0088
            T r3 = r5.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x0088:
            o.setUserLoggedIn$AppCompatActivity r0 = new o.setUserLoggedIn$AppCompatActivity
            r0.<init>(r5, r2)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r5.RatingCompat
            if (r3 == 0) goto L_0x0095
            r3 = r1
            goto L_0x0096
        L_0x0095:
            r3 = r2
        L_0x0096:
            if (r3 == 0) goto L_0x009d
            T r3 = r5.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x009d:
            o.setUserLoggedIn$Keep r0 = new o.setUserLoggedIn$Keep
            r0.<init>(r5)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r5.RatingCompat
            if (r3 == 0) goto L_0x00aa
            r3 = r1
            goto L_0x00ab
        L_0x00aa:
            r3 = r2
        L_0x00ab:
            if (r3 == 0) goto L_0x00b2
            T r3 = r5.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x00b2:
            o.setUserLoggedIn$setHasDecor r0 = new o.setUserLoggedIn$setHasDecor
            r0.<init>(r5, r2)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r5.RatingCompat
            if (r3 == 0) goto L_0x00bf
            r3 = r1
            goto L_0x00c0
        L_0x00bf:
            r3 = r2
        L_0x00c0:
            if (r3 == 0) goto L_0x00c7
            T r3 = r5.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x00c7:
            o.setUserLoggedIn$AlertController$RecycleListView r0 = new o.setUserLoggedIn$AlertController$RecycleListView
            r0.<init>(r5)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r5.RatingCompat
            if (r3 == 0) goto L_0x00d4
            r3 = r1
            goto L_0x00d5
        L_0x00d4:
            r3 = r2
        L_0x00d5:
            if (r3 == 0) goto L_0x00dc
            T r3 = r5.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x00dc:
            o.setUserLoggedIn$PlaybackStateCompat r0 = new o.setUserLoggedIn$PlaybackStateCompat
            r0.<init>(r5)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r3 = r5.RatingCompat
            if (r3 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r1 = r2
        L_0x00e9:
            if (r1 == 0) goto L_0x00f0
            T r5 = r5.RatingCompat
            r0.IconCompatParcelizer(r5)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.businessowner.C6014x742371cc.onClick(android.view.View):void");
    }
}
