package p040o;

import p040o.zzge;

/* renamed from: o.getPackageCertificateHashBytes */
public final /* synthetic */ class getPackageCertificateHashBytes implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzge.zzg write;

    public /* synthetic */ getPackageCertificateHashBytes(zzge.zzg zzg) {
        this.write = zzg;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: o.ExtendedAccountSelectorAdapter$ExtendedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.ExtendedAccountSelectorAdapter$ExtendedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: o.ExtendedAccountSelectorAdapter$ExtendedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: o.FatcaQuestionnaireAdapter$ViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: o.ExtendedAccountSelectorAdapter$ExtendedItemViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: o.ExtendedAccountSelectorAdapter$ExtendedItemViewHolder} */
    /* JADX WARNING: type inference failed for: r1v20, types: [o.FatcaQuestionnaireAdapter$ViewHolder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object write(java.lang.Object r45) {
        /*
            r44 = this;
            r0 = r44
            o.zzge$zzg r1 = r0.write
            r2 = r45
            o.string r2 = (p040o.string) r2
            if (r2 == 0) goto L_0x001b
            android.content.SharedPreferences r1 = r1.MediaSessionCompat$QueueItem
            android.content.SharedPreferences$Editor r1 = r1.edit()
            int r3 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = "com.scb.phone.pref.key.PRELOAD_CHECK_STATUS"
            android.content.SharedPreferences$Editor r1 = r1.putInt(r4, r3)
            r1.apply()
        L_0x001b:
            r1 = 0
            if (r2 == 0) goto L_0x0108
            o.getBounds r3 = r2.MediaMetadataCompat
            java.lang.String r4 = "1"
            r6 = 1
            if (r3 != 0) goto L_0x0026
            goto L_0x0059
        L_0x0026:
            java.lang.String r8 = r3.RatingCompat
            java.lang.String r9 = r3.MediaBrowserCompat$ItemReceiver
            java.lang.String r10 = r3.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r11 = r3.MediaBrowserCompat$MediaItem
            java.lang.String r12 = r3.IconCompatParcelizer
            java.lang.String r13 = r3.write
            o.getCharacters r7 = r3.read
            if (r7 != 0) goto L_0x0037
            goto L_0x003e
        L_0x0037:
            o.FatcaQuestionnaireAdapter$ViewHolder r1 = new o.FatcaQuestionnaireAdapter$ViewHolder
            java.lang.String r7 = r7.IconCompatParcelizer
            r1.<init>(r7)
        L_0x003e:
            r14 = r1
            java.lang.String r1 = r3.MediaMetadataCompat
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = r3.MediaMetadataCompat
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x004d
            r1 = r6
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            o.ExtendedAccountSelectorAdapter$ExtendedItemViewHolder r3 = new o.ExtendedAccountSelectorAdapter$ExtendedItemViewHolder
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r1)
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r3
        L_0x0059:
            java.lang.String r3 = r2.MediaBrowserCompat$SearchResultReceiver
            if (r1 == 0) goto L_0x005f
            java.lang.String r3 = r1.IconCompatParcelizer
        L_0x005f:
            r22 = r3
            java.lang.String r3 = r2.Keep
            java.lang.String r7 = r2.IconCompatParcelizer
            java.lang.String r8 = r2.PlaybackStateCompat
            int r9 = r2.AppCompatActivity
            int r10 = r2.setBackgroundResource
            if (r10 != r6) goto L_0x0070
            r20 = r6
            goto L_0x0072
        L_0x0070:
            r20 = 0
        L_0x0072:
            int r10 = r2.AlertController$RecycleListView
            if (r10 != r6) goto L_0x0079
            r21 = r6
            goto L_0x007b
        L_0x0079:
            r21 = 0
        L_0x007b:
            java.lang.String r10 = r2.setChecked
            java.lang.String r11 = r2.PlaybackStateCompat$CustomAction
            java.lang.String r12 = r2.ParcelableVolumeInfo
            java.lang.String r13 = r2.MediaSessionCompat$ResultReceiverWrapper
            java.lang.String r14 = r2.setContentView
            java.lang.String r15 = r2.setHasDecor
            java.lang.String r5 = r2.MediaSessionCompat$QueueItem
            java.lang.String r6 = r2.MediaBrowserCompat$MediaItem
            java.lang.String r0 = r2.write
            r38 = r1
            int r1 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = java.lang.String.valueOf(r1)
            o.PlaceAutocompleteFragment r32 = p040o.PlaceAutocompleteFragment.MediaBrowserCompat$ItemReceiver(r1)
            java.lang.String r1 = r2.RatingCompat
            r33 = r1
            java.lang.String r1 = r2.AppCompatDelegateImpl$ListMenuDecorView
            r34 = r1
            java.lang.String r1 = "NULL"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = ""
            r35 = r1
            goto L_0x00b0
        L_0x00ae:
            r35 = r3
        L_0x00b0:
            java.lang.String r1 = r2.MediaSessionCompat$Token
            java.lang.String r3 = r2.f2970x50fd9e4a
            r37 = r3
            java.lang.String r3 = r2.AppCompatDialogFragment
            boolean r39 = r4.equals(r3)
            java.lang.String r3 = r2.ActionMenuItemView
            r40 = r3
            java.lang.String r3 = r2.MediaDescriptionCompat
            if (r3 == 0) goto L_0x00cf
            java.lang.String r3 = r2.MediaDescriptionCompat
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00cf
            r41 = 1
            goto L_0x00d1
        L_0x00cf:
            r41 = 0
        L_0x00d1:
            java.lang.String r3 = r2.MediaBrowserCompat$ItemReceiver
            if (r3 == 0) goto L_0x00e0
            java.lang.String r3 = r2.MediaBrowserCompat$ItemReceiver
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00e0
            r42 = 1
            goto L_0x00e2
        L_0x00e0:
            r42 = 0
        L_0x00e2:
            o.tP r3 = new o.tP
            r16 = r3
            java.lang.String r2 = r2.read
            r43 = r2
            r17 = r7
            r18 = r8
            r19 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r13
            r27 = r14
            r28 = r15
            r29 = r5
            r30 = r6
            r31 = r0
            r36 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r1 = r3
        L_0x0108:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getPackageCertificateHashBytes.write(java.lang.Object):java.lang.Object");
    }
}
