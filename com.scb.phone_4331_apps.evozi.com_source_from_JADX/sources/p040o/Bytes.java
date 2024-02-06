package p040o;

import p040o.MapView;

/* renamed from: o.Bytes */
public final /* synthetic */ class Bytes implements findFragmentByWho {
    private final /* synthetic */ checkedCast MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ Bytes(checkedCast checkedcast) {
        this.MediaBrowserCompat$ItemReceiver = checkedcast;
    }

    /* renamed from: o.Bytes$ByteArrayAsList */
    public final /* synthetic */ class ByteArrayAsList implements findFragmentByWho {
        private final /* synthetic */ checkedCast IconCompatParcelizer;

        public /* synthetic */ ByteArrayAsList(checkedCast checkedcast) {
            this.IconCompatParcelizer = checkedcast;
        }

        public final Object IconCompatParcelizer(Object obj) {
            MapView.zza zza = (MapView.zza) obj;
            return new setFile(zza.MediaBrowserCompat$ItemReceiver, zza.IconCompatParcelizer);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object IconCompatParcelizer(java.lang.Object r104) {
        /*
            r103 = this;
            r0 = r103
            o.checkedCast r1 = r0.MediaBrowserCompat$ItemReceiver
            r2 = r104
            o.setActivity r2 = (p040o.setActivity) r2
            int r4 = r2.ParcelableVolumeInfo
            java.lang.String r5 = r2.RatingCompat
            int r6 = r2.MediaDescriptionCompat
            java.lang.String r7 = r2.f2933x50fd9e4a
            o.zzrm r3 = r2.MediaBrowserCompat$SearchResultReceiver
            if (r3 == 0) goto L_0x0022
            o.zzrm r3 = r2.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r9 = r3.MediaBrowserCompat$CustomActionResultReceiver
            o.ForwardingFuture$SimpleForwardingFuture r10 = new o.ForwardingFuture$SimpleForwardingFuture
            java.lang.String r11 = r3.MediaBrowserCompat$ItemReceiver
            java.lang.String r3 = r3.IconCompatParcelizer
            r10.<init>(r9, r11, r3)
            goto L_0x0023
        L_0x0022:
            r10 = 0
        L_0x0023:
            java.lang.String r9 = r2.MediaSessionCompat$QueueItem
            java.lang.String r11 = r2.write
            java.lang.String r3 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r12 = java.lang.String.valueOf(r3)
            java.lang.String r13 = r2.MediaSessionCompat$Token
            java.lang.String r14 = r2.read
            java.lang.String r15 = r2.MediaBrowserCompat$ItemReceiver
            o.onMapReady r3 = r2.MediaSessionCompat$ResultReceiverWrapper
            if (r3 == 0) goto L_0x00df
            o.onMapReady r3 = r2.MediaSessionCompat$ResultReceiverWrapper
            java.lang.String r8 = r3.write
            java.lang.String r0 = r3.MediaBrowserCompat$ItemReceiver
            r38 = r15
            java.lang.String r15 = r3.read
            r39 = r14
            java.lang.String r14 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r40 = r13
            java.math.BigDecimal r13 = r3.MediaMetadataCompat
            r41 = r12
            java.lang.String r12 = r3.setContentView
            r42 = r11
            o.onStreetViewPanoramaReady r11 = r3.AppCompatActivity
            if (r11 == 0) goto L_0x0071
            o.onStreetViewPanoramaReady r11 = r3.AppCompatActivity
            r43 = r9
            java.lang.String r9 = r11.write
            r44 = r10
            int r10 = r11.MediaBrowserCompat$ItemReceiver
            r45 = r7
            java.lang.String r7 = r11.read
            r46 = r6
            o.setProximityOn r6 = new o.setProximityOn
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r11 = r11.MediaBrowserCompat$CustomActionResultReceiver
            r6.<init>(r9, r10, r7, r11)
            r23 = r6
            goto L_0x007b
        L_0x0071:
            r46 = r6
            r45 = r7
            r43 = r9
            r44 = r10
            r23 = 0
        L_0x007b:
            int r6 = r3.MediaBrowserCompat$MediaItem
            java.lang.String r7 = r3.RatingCompat
            r25 = r7
            java.lang.String r7 = r3.MediaSessionCompat$QueueItem
            r26 = r7
            java.math.BigDecimal r7 = r3.MediaSessionCompat$ResultReceiverWrapper
            r27 = r7
            java.lang.String r7 = r3.Keep
            r28 = r7
            java.lang.String r7 = r3.MediaBrowserCompat$SearchResultReceiver
            r29 = r7
            java.lang.String r7 = r3.MediaSessionCompat$Token
            r30 = r7
            java.lang.String r7 = r3.AlertController$RecycleListView
            r31 = r7
            java.lang.String r7 = r3.PlaybackStateCompat$CustomAction
            r32 = r7
            java.lang.String r7 = r3.PlaybackStateCompat
            r33 = r7
            java.lang.String r7 = r3.MediaDescriptionCompat
            r34 = r7
            java.util.List<o.MapView$zza> r7 = r3.ParcelableVolumeInfo
            o.Bytes$ByteArrayAsList r9 = new o.Bytes$ByteArrayAsList
            r9.<init>(r1)
            java.util.List r35 = p040o.checkedCast.MediaBrowserCompat$ItemReceiver(r7, r9)
            java.util.List<o.MapView$zza> r7 = r3.setHasDecor
            o.Bytes$ByteArrayAsList r9 = new o.Bytes$ByteArrayAsList
            r9.<init>(r1)
            java.util.List r36 = p040o.checkedCast.MediaBrowserCompat$ItemReceiver(r7, r9)
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r7 = new o.AutoValue_CrashlyticsReport_Session_Event_Device$1
            r16 = r7
            java.lang.String r24 = java.lang.String.valueOf(r6)
            java.util.List<o.MapView$zza> r3 = r3.f2909x50fd9e4a
            o.Bytes$ByteArrayAsList r6 = new o.Bytes$ByteArrayAsList
            r6.<init>(r1)
            java.util.List r37 = p040o.checkedCast.MediaBrowserCompat$ItemReceiver(r3, r6)
            r17 = r8
            r18 = r0
            r19 = r15
            r20 = r14
            r21 = r13
            r22 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r15 = r7
            goto L_0x00f2
        L_0x00df:
            r46 = r6
            r45 = r7
            r43 = r9
            r44 = r10
            r42 = r11
            r41 = r12
            r40 = r13
            r39 = r14
            r38 = r15
            r15 = 0
        L_0x00f2:
            o.OnMapReadyCallback r0 = r2.PlaybackStateCompat
            if (r0 == 0) goto L_0x01f3
            o.OnMapReadyCallback r0 = r2.PlaybackStateCompat
            java.math.BigDecimal r3 = r0.setSubtitle
            r48 = r3
            java.math.BigDecimal r3 = r0.ActionBarContainer
            r49 = r3
            java.math.BigDecimal r3 = r0.AppCompatDialogFragment
            r50 = r3
            java.math.BigDecimal r3 = r0.setBackgroundResource
            r51 = r3
            java.lang.String r3 = r0.MediaBrowserCompat$ItemReceiver
            r52 = r3
            java.lang.String r3 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r53 = r3
            java.lang.String r3 = r0.MediaMetadataCompat
            r54 = r3
            java.lang.String r3 = r0.MediaBrowserCompat$MediaItem
            r55 = r3
            java.lang.String r3 = r0.write
            r56 = r3
            java.lang.String r3 = r0.read
            r57 = r3
            java.lang.String r3 = r0.setPadding
            r58 = r3
            java.lang.String r3 = r0.ActionBarOverlayLayout
            r59 = r3
            java.lang.String r3 = r0.setExpandedFormat
            r60 = r3
            java.lang.String r3 = r0.ActionBarContextView
            r61 = r3
            java.lang.String r3 = r0.setCustomView
            r62 = r3
            java.lang.String r3 = r0.setTitleOptional
            r63 = r3
            java.math.BigDecimal r3 = r0.AppCompatActivity
            r64 = r3
            java.lang.String r3 = r0.setForceShowIcon
            r65 = r3
            java.lang.String r3 = r0.ListMenuItemView
            r66 = r3
            java.lang.String r3 = r0.setVisibility
            r67 = r3
            java.lang.String r3 = r0.MenuItemWrapperICS$CollapsibleActionViewWrapper
            r68 = r3
            java.lang.String r3 = r0.setContentHeight
            r69 = r3
            java.lang.String r3 = r0.AlertController$RecycleListView
            r70 = r3
            java.math.BigDecimal r3 = r0.setTabContainer
            r71 = r3
            java.lang.String r3 = r0.setIcon
            r72 = r3
            java.lang.String r3 = r0.setShortcut
            r73 = r3
            java.lang.String r3 = r0.setItemInvoker
            r74 = r3
            java.lang.String r3 = r0.setPopupCallback
            r75 = r3
            java.lang.String r3 = r0.setGroupDividerEnabled
            r76 = r3
            java.lang.String r3 = r0.RatingCompat
            r77 = r3
            java.lang.String r3 = r0.MediaDescriptionCompat
            r78 = r3
            java.lang.String r3 = r0.MediaBrowserCompat$SearchResultReceiver
            r79 = r3
            java.lang.String r3 = r0.ParcelableVolumeInfo
            r80 = r3
            java.lang.String r3 = r0.MediaSessionCompat$ResultReceiverWrapper
            r81 = r3
            java.lang.String r3 = r0.MediaSessionCompat$QueueItem
            r82 = r3
            java.lang.String r3 = r0.MediaSessionCompat$Token
            r83 = r3
            java.lang.String r3 = r0.f2767x50fd9e4a
            r84 = r3
            java.lang.String r3 = r0.setHasDecor
            r85 = r3
            java.lang.String r3 = r0.Keep
            r86 = r3
            java.lang.String r3 = r0.PlaybackStateCompat
            r87 = r3
            java.lang.String r3 = r0.setPrimaryBackground
            r88 = r3
            java.lang.String r3 = r0.AbsActionBarView
            r89 = r3
            java.lang.String r3 = r0.setStackedBackground
            r90 = r3
            java.lang.String r3 = r0.MenuItemImpl
            r91 = r3
            java.lang.String r3 = r0.ExpandedMenuView
            r92 = r3
            java.lang.String r3 = r0.setTitle
            r93 = r3
            o.position r3 = r0.setContentView
            r94 = r3
            java.lang.String r3 = r0.AppCompatDelegateImpl$ListMenuDecorView
            r95 = r3
            java.lang.String r3 = r0.ActionMenuItemView
            r96 = r3
            java.lang.String r3 = r0.setCheckable
            r97 = r3
            java.lang.String r3 = r0.PlaybackStateCompat$CustomAction
            r98 = r3
            java.lang.String r3 = r0.setTransitioning
            r99 = r3
            java.util.List<o.zzxp> r3 = r0.setChecked
            o.fromBytes r6 = new o.fromBytes
            r6.<init>(r1)
            java.util.List r100 = p040o.checkedCast.MediaBrowserCompat$ItemReceiver(r3, r6)
            java.util.List<o.zzxp> r3 = r0.AppCompatViewInflater
            o.fromBytes r6 = new o.fromBytes
            r6.<init>(r1)
            java.util.List r101 = p040o.checkedCast.MediaBrowserCompat$ItemReceiver(r3, r6)
            o.setBatteryVelocity r3 = new o.setBatteryVelocity
            r47 = r3
            java.util.List<o.zzxp> r0 = r0.setSplitBackground
            o.fromBytes r6 = new o.fromBytes
            r6.<init>(r1)
            java.util.List r102 = p040o.checkedCast.MediaBrowserCompat$ItemReceiver(r0, r6)
            r47.<init>(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102)
            r16 = r3
            goto L_0x01f5
        L_0x01f3:
            r16 = 0
        L_0x01f5:
            java.lang.String r0 = r2.MediaBrowserCompat$MediaItem
            java.lang.String r14 = r2.MediaMetadataCompat
            o.zzrm r3 = r2.MediaBrowserCompat$SearchResultReceiver
            if (r3 == 0) goto L_0x0202
            o.zzrm r2 = r2.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0204
        L_0x0202:
            java.lang.String r2 = ""
        L_0x0204:
            o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder r20 = new o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder
            int r3 = r2.hashCode()
            r6 = 2
            r7 = 3
            r8 = 0
            r9 = 1
            switch(r3) {
                case -562462675: goto L_0x0230;
                case -68698650: goto L_0x0226;
                case 80008848: goto L_0x021c;
                case 2063509483: goto L_0x0212;
                default: goto L_0x0211;
            }
        L_0x0211:
            goto L_0x023a
        L_0x0212:
            java.lang.String r3 = "TRANSFER"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x023a
            r2 = r6
            goto L_0x023b
        L_0x021c:
            java.lang.String r3 = "TOPUP"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x023a
            r2 = r8
            goto L_0x023b
        L_0x0226:
            java.lang.String r3 = "PAYMENT"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x023a
            r2 = r9
            goto L_0x023b
        L_0x0230:
            java.lang.String r3 = "BULKXFER"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x023a
            r2 = r7
            goto L_0x023b
        L_0x023a:
            r2 = -1
        L_0x023b:
            if (r2 == 0) goto L_0x0258
            if (r2 == r9) goto L_0x0251
            if (r2 == r6) goto L_0x024a
            if (r2 != r7) goto L_0x0261
            boolean r2 = r1.MediaDescriptionCompat
            if (r2 != 0) goto L_0x0261
            r1.MediaDescriptionCompat = r9
            goto L_0x025e
        L_0x024a:
            boolean r2 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r2 != 0) goto L_0x0261
            r1.MediaBrowserCompat$SearchResultReceiver = r9
            goto L_0x025e
        L_0x0251:
            boolean r2 = r1.MediaBrowserCompat$ItemReceiver
            if (r2 != 0) goto L_0x0261
            r1.MediaBrowserCompat$ItemReceiver = r9
            goto L_0x025e
        L_0x0258:
            boolean r2 = r1.MediaBrowserCompat$MediaItem
            if (r2 != 0) goto L_0x0261
            r1.MediaBrowserCompat$MediaItem = r9
        L_0x025e:
            r19 = r9
            goto L_0x0263
        L_0x0261:
            r19 = r8
        L_0x0263:
            r3 = r20
            r6 = r46
            r7 = r45
            r8 = r44
            r9 = r43
            r10 = r42
            r11 = r41
            r12 = r40
            r13 = r39
            r1 = r14
            r14 = r38
            r17 = r0
            r18 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.Bytes.IconCompatParcelizer(java.lang.Object):java.lang.Object");
    }
}
