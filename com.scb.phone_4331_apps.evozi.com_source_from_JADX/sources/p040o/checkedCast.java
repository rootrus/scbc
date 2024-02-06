package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.AlertController$RecycleListView;
import p040o.Booleans;
import p040o.ByteStreams;
import p040o.SignedBytes;

/* renamed from: o.checkedCast */
public final class checkedCast extends SignedBytes.LexicographicalComparator {
    public final Context IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver = false;
    public boolean MediaBrowserCompat$MediaItem = false;
    public boolean MediaBrowserCompat$SearchResultReceiver = false;
    public boolean MediaDescriptionCompat = false;
    public ByteStreams.C31375 read;

    @HmlPinActivity
    public checkedCast(Context context, Resources resources, SharedPreferences sharedPreferences, ByteStreams.C31375 r4, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        this.IconCompatParcelizer = context;
        this.read = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.setUuidFromUtf8Bytes IconCompatParcelizer(p040o.AutoValue_CrashlyticsReport_Session_Event_Device.Builder r6, boolean r7, p040o.TouchPointInstructionActivity r8) {
        /*
            r5 = this;
            o.setUuidFromUtf8Bytes r0 = p040o.setUuidFromUtf8Bytes.RatingCompat()
            java.lang.String r1 = "TOPUP"
            o.setUuidFromUtf8Bytes r0 = r0.MediaMetadataCompat(r1)
            java.lang.String r8 = MediaBrowserCompat$CustomActionResultReceiver((p040o.TouchPointInstructionActivity) r8)
            o.setUuidFromUtf8Bytes r8 = r0.write(r8)
            android.content.Context r0 = r5.IconCompatParcelizer
            int r1 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb
            android.net.Uri r0 = p040o.getICheckDeserializerRtti.write((android.content.Context) r0, (int) r1)
            r8.setGroupDividerEnabled = r0
            java.lang.String r0 = r6.MediaBrowserCompat$SearchResultReceiver
            o.setUuidFromUtf8Bytes r8 = r8.MediaBrowserCompat$CustomActionResultReceiver(r0)
            java.lang.String r0 = r6.MediaDescriptionCompat
            java.lang.String r0 = r5.mo26549c_(r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r8.AppCompatActivity = r0
            java.lang.String r0 = r6.MediaMetadataCompat
            r8.setMenu = r0
            int r0 = r6.MediaBrowserCompat$MediaItem
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.setMenuPrepared = r0
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r0 = r6.ParcelableVolumeInfo
            r1 = 0
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0083
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r0 = r6.ParcelableVolumeInfo
            java.lang.String r0 = r0.MediaMetadataCompat
            r8.ListMenuItemView = r0
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r0 = r6.ParcelableVolumeInfo
            java.lang.String r0 = r0.MediaMetadataCompat
            java.lang.String r7 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r0, (boolean) r7)
            o.setUuidFromUtf8Bytes r7 = r8.MediaBrowserCompat$ItemReceiver((java.lang.String) r7)
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r0 = r6.ParcelableVolumeInfo
            java.math.BigDecimal r0 = r0.RatingCompat
            if (r0 == 0) goto L_0x0073
            o.CrashlyticsReport$Session$Application$read r0 = new o.CrashlyticsReport$Session$Application$read
            r0.<init>()
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r3 = r6.ParcelableVolumeInfo
            java.math.BigDecimal r3 = r3.RatingCompat
            double r3 = r3.doubleValue()
            java.lang.String r3 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r3)
            r0.IconCompatParcelizer = r3
            o.CrashlyticsReport$Session$Application r3 = new o.CrashlyticsReport$Session$Application
            r4 = 0
            r3.<init>(r0, r4)
            goto L_0x0074
        L_0x0073:
            r3 = r1
        L_0x0074:
            r7.f2965x50fd9e4a = r3
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r7 = r6.ParcelableVolumeInfo
            o.setProximityOn r7 = r7.MediaSessionCompat$QueueItem
            if (r7 == 0) goto L_0x0083
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r7 = r6.ParcelableVolumeInfo
            o.setProximityOn r7 = r7.MediaSessionCompat$QueueItem
            java.lang.String r7 = r7.IconCompatParcelizer
            goto L_0x0084
        L_0x0083:
            r7 = r2
        L_0x0084:
            o.setBatteryVelocity r0 = r6.f2681x50fd9e4a
            if (r0 == 0) goto L_0x0116
            o.setBatteryVelocity r0 = r6.f2681x50fd9e4a
            java.math.BigDecimal r0 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x009f
            o.setBatteryVelocity r0 = r6.f2681x50fd9e4a
            java.math.BigDecimal r0 = r0.MediaBrowserCompat$SearchResultReceiver
            double r3 = r0.doubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            java.lang.String r0 = write((java.lang.Double) r0)
            goto L_0x00a0
        L_0x009f:
            r0 = r1
        L_0x00a0:
            o.setUuidFromUtf8Bytes r0 = r8.MediaBrowserCompat$MediaItem(r0)
            o.setBatteryVelocity r3 = r6.f2681x50fd9e4a
            java.lang.String r3 = r3.PlaybackStateCompat$CustomAction
            o.setBatteryVelocity r4 = r6.f2681x50fd9e4a
            java.lang.String r4 = r4.ParcelableVolumeInfo
            if (r3 == 0) goto L_0x00af
            goto L_0x00b4
        L_0x00af:
            if (r4 == 0) goto L_0x00b3
            r3 = r4
            goto L_0x00b4
        L_0x00b3:
            r3 = r2
        L_0x00b4:
            r0.setSubtitle = r3
            o.setBatteryVelocity r3 = r6.f2681x50fd9e4a
            java.lang.String r3 = r3.setHasDecor
            o.setBatteryVelocity r4 = r6.f2681x50fd9e4a
            java.lang.String r4 = r4.MediaSessionCompat$ResultReceiverWrapper
            if (r3 == 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            if (r4 == 0) goto L_0x00c5
            r3 = r4
            goto L_0x00c6
        L_0x00c5:
            r3 = r2
        L_0x00c6:
            r0.ActionBarContextView = r3
            o.setBatteryVelocity r3 = r6.f2681x50fd9e4a
            java.lang.String r3 = r3.AlertController$RecycleListView
            o.setBatteryVelocity r4 = r6.f2681x50fd9e4a
            java.lang.String r4 = r4.f2934x50fd9e4a
            if (r3 == 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            if (r4 == 0) goto L_0x00d7
            r3 = r4
            goto L_0x00d8
        L_0x00d7:
            r3 = r2
        L_0x00d8:
            r0.setHideOnContentScrollEnabled = r3
            o.setBatteryVelocity r3 = r6.f2681x50fd9e4a
            java.lang.String r3 = r3.Keep
            o.setBatteryVelocity r4 = r6.f2681x50fd9e4a
            java.lang.String r4 = r4.MediaSessionCompat$QueueItem
            if (r3 == 0) goto L_0x00e5
            goto L_0x00ea
        L_0x00e5:
            if (r4 == 0) goto L_0x00e9
            r3 = r4
            goto L_0x00ea
        L_0x00e9:
            r3 = r2
        L_0x00ea:
            r0.ActionBarOverlayLayout = r3
            o.setBatteryVelocity r3 = r6.f2681x50fd9e4a
            java.lang.String r3 = r3.AppCompatActivity
            o.setBatteryVelocity r4 = r6.f2681x50fd9e4a
            java.lang.String r4 = r4.PlaybackStateCompat
            if (r3 == 0) goto L_0x00f7
            goto L_0x00fc
        L_0x00f7:
            if (r4 == 0) goto L_0x00fb
            r3 = r4
            goto L_0x00fc
        L_0x00fb:
            r3 = r2
        L_0x00fc:
            r0.setActionBarVisibilityCallback = r3
            o.setBatteryVelocity r3 = r6.f2681x50fd9e4a
            java.lang.String r3 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r0.setForceShowIcon = r3
            o.setBatteryVelocity r3 = r6.f2681x50fd9e4a
            java.lang.String r3 = r3.PlaybackStateCompat$CustomAction
            o.setBatteryVelocity r4 = r6.f2681x50fd9e4a
            java.lang.String r4 = r4.ParcelableVolumeInfo
            if (r3 == 0) goto L_0x010f
            goto L_0x0114
        L_0x010f:
            if (r4 == 0) goto L_0x0113
            r3 = r4
            goto L_0x0114
        L_0x0113:
            r3 = r2
        L_0x0114:
            r0.AlertController$RecycleListView = r3
        L_0x0116:
            java.lang.String r0 = r6.RatingCompat
            java.lang.String r3 = "O"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0130
            java.lang.String r7 = r6.RatingCompat
            if (r7 == 0) goto L_0x012d
            java.lang.String r7 = r6.MediaBrowserCompat$ItemReceiver
            o.getRamUsed r1 = new o.getRamUsed
            java.lang.String r6 = r6.MediaBrowserCompat$ItemReceiver
            r1.<init>(r3, r7, r6, r2)
        L_0x012d:
            r8.setShowingForActionMode = r1
            goto L_0x0144
        L_0x0130:
            java.lang.String r0 = r6.RatingCompat
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = r6.MediaSessionCompat$Token
            o.getRamUsed r1 = new o.getRamUsed
            java.lang.String r6 = r6.read
            java.lang.String r2 = "M"
            r1.<init>(r2, r0, r6, r7)
            r8.setShowingForActionMode = r1
            goto L_0x0144
        L_0x0142:
            r8.setShowingForActionMode = r1
        L_0x0144:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.checkedCast.IconCompatParcelizer(o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder, boolean, o.TouchPointInstructionActivity):o.setUuidFromUtf8Bytes");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.setUuidFromUtf8Bytes write(p040o.AutoValue_CrashlyticsReport_Session_Event_Device.Builder r10, boolean r11, p040o.TouchPointInstructionActivity r12, java.lang.String r13, java.lang.String r14) {
        /*
            r9 = this;
            o.setUuidFromUtf8Bytes r0 = p040o.setUuidFromUtf8Bytes.RatingCompat()
            java.lang.String r1 = "PAYMENT"
            o.setUuidFromUtf8Bytes r0 = r0.MediaMetadataCompat(r1)
            java.lang.String r12 = MediaBrowserCompat$CustomActionResultReceiver((p040o.TouchPointInstructionActivity) r12)
            o.setUuidFromUtf8Bytes r12 = r0.write(r12)
            android.content.Context r0 = r9.IconCompatParcelizer
            int r1 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb
            android.net.Uri r0 = p040o.getICheckDeserializerRtti.write((android.content.Context) r0, (int) r1)
            r12.setGroupDividerEnabled = r0
            o.setUuidFromUtf8Bytes r12 = r12.MediaBrowserCompat$CustomActionResultReceiver(r13)
            java.lang.String r13 = r9.mo26549c_(r14)
            android.net.Uri r13 = android.net.Uri.parse(r13)
            r12.AppCompatActivity = r13
            java.lang.String r13 = r10.MediaMetadataCompat
            r12.setMenu = r13
            int r13 = r10.MediaBrowserCompat$MediaItem
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r12.setMenuPrepared = r13
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r13 = r10.ParcelableVolumeInfo
            r14 = 0
            r0 = 0
            java.lang.String r1 = ""
            if (r13 == 0) goto L_0x007f
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r13 = r10.ParcelableVolumeInfo
            java.lang.String r13 = r13.read
            r12.ListMenuItemView = r13
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r13 = r10.ParcelableVolumeInfo
            java.lang.String r13 = r13.read
            java.lang.String r11 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r13, (boolean) r11)
            o.setUuidFromUtf8Bytes r11 = r12.MediaBrowserCompat$ItemReceiver((java.lang.String) r11)
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r13 = r10.ParcelableVolumeInfo
            java.math.BigDecimal r13 = r13.MediaBrowserCompat$CustomActionResultReceiver
            if (r13 == 0) goto L_0x006f
            o.CrashlyticsReport$Session$Application$read r13 = new o.CrashlyticsReport$Session$Application$read
            r13.<init>()
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r2 = r10.ParcelableVolumeInfo
            java.math.BigDecimal r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            double r2 = r2.doubleValue()
            java.lang.String r2 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r2)
            r13.IconCompatParcelizer = r2
            o.CrashlyticsReport$Session$Application r2 = new o.CrashlyticsReport$Session$Application
            r2.<init>(r13, r0)
            goto L_0x0070
        L_0x006f:
            r2 = r14
        L_0x0070:
            r11.f2965x50fd9e4a = r2
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r11 = r10.ParcelableVolumeInfo
            o.setProximityOn r11 = r11.MediaSessionCompat$QueueItem
            if (r11 == 0) goto L_0x007f
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r11 = r10.ParcelableVolumeInfo
            o.setProximityOn r11 = r11.MediaSessionCompat$QueueItem
            java.lang.String r11 = r11.IconCompatParcelizer
            goto L_0x0080
        L_0x007f:
            r11 = r1
        L_0x0080:
            o.setBatteryVelocity r13 = r10.f2681x50fd9e4a
            if (r13 == 0) goto L_0x01bb
            o.setBatteryVelocity r13 = r10.f2681x50fd9e4a
            java.lang.String r13 = r13.PlaybackStateCompat$CustomAction
            o.setBatteryVelocity r2 = r10.f2681x50fd9e4a
            java.lang.String r2 = r2.ParcelableVolumeInfo
            if (r13 == 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            if (r2 == 0) goto L_0x0093
            r13 = r2
            goto L_0x0094
        L_0x0093:
            r13 = r1
        L_0x0094:
            r12.setSubtitle = r13
            o.setBatteryVelocity r13 = r10.f2681x50fd9e4a
            java.lang.String r13 = r13.setHasDecor
            o.setBatteryVelocity r2 = r10.f2681x50fd9e4a
            java.lang.String r2 = r2.MediaSessionCompat$ResultReceiverWrapper
            if (r13 == 0) goto L_0x00a1
            goto L_0x00a6
        L_0x00a1:
            if (r2 == 0) goto L_0x00a5
            r13 = r2
            goto L_0x00a6
        L_0x00a5:
            r13 = r1
        L_0x00a6:
            r12.ActionBarContextView = r13
            o.setBatteryVelocity r13 = r10.f2681x50fd9e4a
            java.lang.String r13 = r13.AlertController$RecycleListView
            o.setBatteryVelocity r2 = r10.f2681x50fd9e4a
            java.lang.String r2 = r2.f2934x50fd9e4a
            if (r13 == 0) goto L_0x00b3
            goto L_0x00b8
        L_0x00b3:
            if (r2 == 0) goto L_0x00b7
            r13 = r2
            goto L_0x00b8
        L_0x00b7:
            r13 = r1
        L_0x00b8:
            r12.setHideOnContentScrollEnabled = r13
            o.setBatteryVelocity r13 = r10.f2681x50fd9e4a
            java.lang.String r13 = r13.Keep
            o.setBatteryVelocity r2 = r10.f2681x50fd9e4a
            java.lang.String r2 = r2.MediaSessionCompat$QueueItem
            if (r13 == 0) goto L_0x00c5
            goto L_0x00ca
        L_0x00c5:
            if (r2 == 0) goto L_0x00c9
            r13 = r2
            goto L_0x00ca
        L_0x00c9:
            r13 = r1
        L_0x00ca:
            r12.ActionBarOverlayLayout = r13
            o.setBatteryVelocity r13 = r10.f2681x50fd9e4a
            java.lang.String r13 = r13.AppCompatActivity
            o.setBatteryVelocity r2 = r10.f2681x50fd9e4a
            java.lang.String r2 = r2.PlaybackStateCompat
            if (r13 == 0) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            if (r2 == 0) goto L_0x00db
            r13 = r2
            goto L_0x00dc
        L_0x00db:
            r13 = r1
        L_0x00dc:
            r12.setActionBarVisibilityCallback = r13
            o.setBatteryVelocity r13 = r10.f2681x50fd9e4a
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r2 = r10.ParcelableVolumeInfo
            if (r2 == 0) goto L_0x00e9
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r2 = r10.ParcelableVolumeInfo
            java.lang.String r2 = r2.MediaBrowserCompat$ItemReceiver
            goto L_0x00ea
        L_0x00e9:
            r2 = r14
        L_0x00ea:
            int[] r3 = p040o.checkedCast.C41894.MediaBrowserCompat$ItemReceiver
            o.position r4 = r13.MediaDescriptionCompat
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L_0x010e
            if (r2 == 0) goto L_0x010c
            boolean r13 = r2.equals(r1)
            if (r13 != 0) goto L_0x010c
            int r13 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.biller_id
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r0] = r2
            android.content.res.Resources r2 = r9.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r13 = r2.getString(r13, r3)
            goto L_0x0145
        L_0x010c:
            r13 = r1
            goto L_0x0145
        L_0x010e:
            java.lang.String r3 = r13.MediaMetadataCompat
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0137
            if (r2 == 0) goto L_0x0137
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L_0x0137
            int r13 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.biller_ac
            java.lang.Object[] r3 = new java.lang.Object[r4]
            int r5 = r2.length()
            r6 = 10
            if (r5 != r6) goto L_0x012e
            java.lang.String r2 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((boolean) r4, (boolean) r0, (java.lang.String) r2)
        L_0x012e:
            r3[r0] = r2
            android.content.res.Resources r2 = r9.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r13 = r2.getString(r13, r3)
            goto L_0x0145
        L_0x0137:
            int r2 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.comp_code
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r13 = r13.MediaMetadataCompat
            r3[r0] = r13
            android.content.res.Resources r13 = r9.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r13 = r13.getString(r2, r3)
        L_0x0145:
            o.setBatteryVelocity r2 = r10.f2681x50fd9e4a
            java.lang.String r2 = r2.PlaybackStateCompat$CustomAction
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r3 = r10.ParcelableVolumeInfo
            java.lang.String r3 = r3.ParcelableVolumeInfo
            if (r2 == 0) goto L_0x0150
            goto L_0x0155
        L_0x0150:
            if (r3 == 0) goto L_0x0154
            r2 = r3
            goto L_0x0155
        L_0x0154:
            r2 = r1
        L_0x0155:
            o.setBatteryVelocity r3 = r10.f2681x50fd9e4a
            java.lang.String r3 = r3.setHasDecor
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r5 = r10.ParcelableVolumeInfo
            java.lang.String r5 = r5.MediaSessionCompat$Token
            if (r3 == 0) goto L_0x0160
            goto L_0x0165
        L_0x0160:
            if (r5 == 0) goto L_0x0164
            r3 = r5
            goto L_0x0165
        L_0x0164:
            r3 = r1
        L_0x0165:
            o.setBatteryVelocity r5 = r10.f2681x50fd9e4a
            java.lang.String r5 = r5.AlertController$RecycleListView
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r6 = r10.ParcelableVolumeInfo
            java.lang.String r6 = r6.MediaSessionCompat$ResultReceiverWrapper
            if (r5 == 0) goto L_0x0170
            goto L_0x0175
        L_0x0170:
            if (r6 == 0) goto L_0x0174
            r5 = r6
            goto L_0x0175
        L_0x0174:
            r5 = r1
        L_0x0175:
            o.setBatteryVelocity r6 = r10.f2681x50fd9e4a
            java.lang.String r6 = r6.AppCompatDelegateImpl$ListMenuDecorView
            o.setBatteryVelocity r7 = r10.f2681x50fd9e4a
            java.lang.String r7 = r7.setBackgroundResource
            o.setBatteryVelocity r8 = r10.f2681x50fd9e4a
            java.lang.String r8 = r8.setContentView
            java.lang.String r2 = r9.MediaBrowserCompat$ItemReceiver(r2, r6)
            java.lang.String r3 = r9.MediaBrowserCompat$ItemReceiver(r3, r7)
            java.lang.String r5 = r9.MediaBrowserCompat$ItemReceiver(r5, r8)
            r6 = 4
            java.lang.String[] r6 = new java.lang.String[r6]
            r6[r0] = r13
            r6[r4] = r2
            r13 = 2
            r6[r13] = r3
            r13 = 3
            r6[r13] = r5
            java.lang.String r13 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String[]) r6)
            r12.AlertController$RecycleListView = r13
            o.setBatteryVelocity r13 = r10.f2681x50fd9e4a
            java.math.BigDecimal r13 = r13.MediaBrowserCompat$SearchResultReceiver
            if (r13 == 0) goto L_0x01b7
            o.setBatteryVelocity r13 = r10.f2681x50fd9e4a
            java.math.BigDecimal r13 = r13.MediaBrowserCompat$SearchResultReceiver
            double r2 = r13.doubleValue()
            java.lang.Double r13 = java.lang.Double.valueOf(r2)
            java.lang.String r13 = write((java.lang.Double) r13)
            goto L_0x01b8
        L_0x01b7:
            r13 = r14
        L_0x01b8:
            r12.MediaBrowserCompat$MediaItem(r13)
        L_0x01bb:
            java.lang.String r13 = r10.RatingCompat
            java.lang.String r0 = "O"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x01d5
            java.lang.String r11 = r10.RatingCompat
            if (r11 == 0) goto L_0x01d2
            java.lang.String r11 = r10.MediaBrowserCompat$ItemReceiver
            o.getRamUsed r14 = new o.getRamUsed
            java.lang.String r10 = r10.MediaBrowserCompat$ItemReceiver
            r14.<init>(r0, r11, r10, r1)
        L_0x01d2:
            r12.setShowingForActionMode = r14
            goto L_0x01e6
        L_0x01d5:
            java.lang.String r13 = r10.RatingCompat
            if (r13 == 0) goto L_0x01e4
            java.lang.String r13 = r10.MediaSessionCompat$Token
            o.getRamUsed r14 = new o.getRamUsed
            java.lang.String r10 = r10.read
            java.lang.String r0 = "M"
            r14.<init>(r0, r13, r10, r11)
        L_0x01e4:
            r12.setShowingForActionMode = r14
        L_0x01e6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.checkedCast.write(o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder, boolean, o.TouchPointInstructionActivity, java.lang.String, java.lang.String):o.setUuidFromUtf8Bytes");
    }

    public List<setThreadFactory> read(List<setFile> list, List<setPc> list2, List<StreetViewPanoramaFragment> list3, boolean z) {
        String str;
        isSupportFragmentClass issupportfragmentclass;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list2.get(i).MediaBrowserCompat$ItemReceiver.equals("OWN")) {
                str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(list2.get(i).read, z);
            } else if (list2.get(i).MediaBrowserCompat$ItemReceiver.equals("SCB")) {
                str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(list2.get(i).read, false);
            } else {
                str = list2.get(i).read;
            }
            setThreadFactory setthreadfactory = new setThreadFactory();
            setthreadfactory.MediaBrowserCompat$MediaItem = list.get(i).MediaBrowserCompat$ItemReceiver;
            setPc setpc = list2.get(i);
            show show = new show(list3);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new Booleans.LexicographicalComparator(setpc)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (issupportfragmentclass.IconCompatParcelizer != null) {
                T t = issupportfragmentclass.IconCompatParcelizer;
                if (t != null) {
                    str2 = ((StreetViewPanoramaFragment) t).read;
                } else {
                    throw new NoSuchElementException("No value present");
                }
            } else {
                str2 = setpc.MediaBrowserCompat$CustomActionResultReceiver;
            }
            setthreadfactory.MediaBrowserCompat$CustomActionResultReceiver = mo26549c_(str2);
            setthreadfactory.RatingCompat = list2.get(i).IconCompatParcelizer;
            setthreadfactory.IconCompatParcelizer = str;
            setthreadfactory.MediaMetadataCompat = list2.get(i).write;
            setthreadfactory.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(Double.valueOf(list.get(i).IconCompatParcelizer).doubleValue());
            setthreadfactory.MediaDescriptionCompat = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(Double.valueOf(list2.get(i).MediaBrowserCompat$SearchResultReceiver).doubleValue());
            setthreadfactory.MediaSessionCompat$Token = list2.get(i).MediaBrowserCompat$ItemReceiver;
            setthreadfactory.read = list2.get(i).read;
            setthreadfactory.MediaBrowserCompat$SearchResultReceiver = true;
            arrayList.add(setthreadfactory);
        }
        return arrayList;
    }

    /* renamed from: o.checkedCast$4 */
    static /* synthetic */ class C41894 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.position[] r0 = p040o.position.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.position r1 = p040o.position.NORMALL_BILLER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.position r1 = p040o.position.ONUS_BILLER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.position r1 = p040o.position.OFFUS_BILLER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.checkedCast.C41894.<clinit>():void");
        }
    }

    private String MediaBrowserCompat$ItemReceiver(String str, String str2) {
        if (AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(str2) || AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(str)) {
            return "";
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ebill_selected_reference, new Object[]{str2, str});
    }
}
