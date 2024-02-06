package p040o;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;
import p040o.getJsonBytes;
import p040o.writeUInt64NoTag;

/* renamed from: o.AutoValue_TokenResult */
public final /* synthetic */ class AutoValue_TokenResult implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getJsonBytes.write MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ AutoValue_TokenResult(getJsonBytes.write write2, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
        this.write = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.Object r10) {
        /*
            r9 = this;
            o.getJsonBytes$write r0 = r9.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r9.write
            o.CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory$MediaBrowserCompat$ItemReceiver r10 = (p040o.C6381x4d1a9e14) r10
            o.getJsonBytes r2 = p040o.getJsonBytes.this
            o.checkedCast r2 = r2.IconCompatParcelizer
            o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder r3 = r0.read
            o.getJsonBytes r0 = p040o.getJsonBytes.this
            o.AppMeasurementSdk$OnEventListener r0 = r0.MediaDescriptionCompat
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r0 = r0.IconCompatParcelizer
            boolean r0 = r0.setItemInvoker()
            o.setUuidFromUtf8Bytes r4 = p040o.setUuidFromUtf8Bytes.RatingCompat()
            java.lang.String r5 = "TRANSFER"
            o.setUuidFromUtf8Bytes r4 = r4.MediaMetadataCompat(r5)
            android.content.Context r5 = r2.IconCompatParcelizer
            int r6 = p040o.Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb
            android.net.Uri r5 = p040o.getICheckDeserializerRtti.write((android.content.Context) r5, (int) r6)
            r4.setGroupDividerEnabled = r5
            java.lang.String r1 = r2.mo26549c_(r1)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r4.AppCompatActivity = r1
            java.lang.String r1 = r3.MediaMetadataCompat
            r4.setMenu = r1
            int r1 = r3.MediaBrowserCompat$MediaItem
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.setMenuPrepared = r1
            o.setBatteryVelocity r1 = r3.f2681x50fd9e4a
            r2 = 0
            if (r1 == 0) goto L_0x0074
            o.setBatteryVelocity r1 = r3.f2681x50fd9e4a
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
            o.setUuidFromUtf8Bytes r1 = r4.write(r1)
            o.setBatteryVelocity r5 = r3.f2681x50fd9e4a
            java.lang.String r5 = r5.read
            o.setUuidFromUtf8Bytes r1 = r1.MediaBrowserCompat$CustomActionResultReceiver(r5)
            o.setBatteryVelocity r5 = r3.f2681x50fd9e4a
            java.math.BigDecimal r5 = r5.ActionMenuItemView
            if (r5 == 0) goto L_0x0070
            o.setBatteryVelocity r5 = r3.f2681x50fd9e4a
            java.math.BigDecimal r5 = r5.ActionMenuItemView
            double r5 = r5.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.String r5 = p040o.checkedCast.write((java.lang.Double) r5)
            goto L_0x0071
        L_0x0070:
            r5 = r2
        L_0x0071:
            r1.MediaBrowserCompat$MediaItem(r5)
        L_0x0074:
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r3.ParcelableVolumeInfo
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x00ec
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r3.ParcelableVolumeInfo
            java.lang.String r1 = r1.read
            r4.ListMenuItemView = r1
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r1 = r3.ParcelableVolumeInfo
            java.lang.String r1 = r1.read
            java.lang.String r1 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r1, (boolean) r0)
            o.setUuidFromUtf8Bytes r1 = r4.MediaBrowserCompat$ItemReceiver((java.lang.String) r1)
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r6 = r3.ParcelableVolumeInfo
            java.lang.String r6 = r6.MediaBrowserCompat$ItemReceiver
            r1.AlertController$RecycleListView = r6
            java.lang.String r6 = r3.MediaSessionCompat$ResultReceiverWrapper
            o.IGoogleMapDelegate r6 = p040o.getICheckDeserializerRtti.MediaSessionCompat$Token(r6)
            o.IGoogleMapDelegate r7 = p040o.IGoogleMapDelegate.OWN
            r8 = 0
            if (r7 != r6) goto L_0x00a6
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r6 = r3.ParcelableVolumeInfo
            java.lang.String r6 = r6.MediaBrowserCompat$ItemReceiver
            java.lang.String r0 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r6, (boolean) r0)
            goto L_0x00bb
        L_0x00a6:
            o.IGoogleMapDelegate r0 = p040o.IGoogleMapDelegate.SCB
            if (r0 == r6) goto L_0x00b3
            o.IGoogleMapDelegate r0 = p040o.IGoogleMapDelegate.PROMPTPAY
            if (r0 == r6) goto L_0x00b3
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r0 = r3.ParcelableVolumeInfo
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
            goto L_0x00bb
        L_0x00b3:
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r0 = r3.ParcelableVolumeInfo
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
            java.lang.String r0 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r0, (boolean) r8)
        L_0x00bb:
            r1.setHasDecor = r0
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r0 = r3.ParcelableVolumeInfo
            java.math.BigDecimal r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x00dc
            o.CrashlyticsReport$Session$Application$read r0 = new o.CrashlyticsReport$Session$Application$read
            r0.<init>()
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r6 = r3.ParcelableVolumeInfo
            java.math.BigDecimal r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            double r6 = r6.doubleValue()
            java.lang.String r6 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) r6)
            r0.IconCompatParcelizer = r6
            o.CrashlyticsReport$Session$Application r6 = new o.CrashlyticsReport$Session$Application
            r6.<init>(r0, r8)
            goto L_0x00dd
        L_0x00dc:
            r6 = r2
        L_0x00dd:
            r1.f2965x50fd9e4a = r6
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r0 = r3.ParcelableVolumeInfo
            o.setProximityOn r0 = r0.MediaSessionCompat$QueueItem
            if (r0 == 0) goto L_0x00ec
            o.AutoValue_CrashlyticsReport_Session_Event_Device$1 r0 = r3.ParcelableVolumeInfo
            o.setProximityOn r0 = r0.MediaSessionCompat$QueueItem
            java.lang.String r0 = r0.IconCompatParcelizer
            goto L_0x00ed
        L_0x00ec:
            r0 = r5
        L_0x00ed:
            java.lang.String r1 = r3.RatingCompat
            java.lang.String r6 = "O"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0107
            java.lang.String r0 = r3.RatingCompat
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = r3.MediaBrowserCompat$ItemReceiver
            o.getRamUsed r2 = new o.getRamUsed
            java.lang.String r1 = r3.MediaBrowserCompat$ItemReceiver
            r2.<init>(r6, r0, r1, r5)
        L_0x0104:
            r4.setShowingForActionMode = r2
            goto L_0x011b
        L_0x0107:
            java.lang.String r1 = r3.RatingCompat
            if (r1 == 0) goto L_0x0119
            java.lang.String r1 = r3.MediaSessionCompat$Token
            o.getRamUsed r2 = new o.getRamUsed
            java.lang.String r3 = r3.read
            java.lang.String r5 = "M"
            r2.<init>(r5, r1, r3, r0)
            r4.setShowingForActionMode = r2
            goto L_0x011b
        L_0x0119:
            r4.setShowingForActionMode = r2
        L_0x011b:
            r10.MediaBrowserCompat$CustomActionResultReceiver((p040o.setUuidFromUtf8Bytes) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AutoValue_TokenResult.IconCompatParcelizer(java.lang.Object):void");
    }

    /* renamed from: o.AutoValue_TokenResult$Builder */
    public final /* synthetic */ class Builder implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ getJsonBytes.IconCompatParcelizer IconCompatParcelizer;
        private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ Builder(getJsonBytes.IconCompatParcelizer iconCompatParcelizer, List list) {
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.MediaBrowserCompat$ItemReceiver = list;
        }

        public final void IconCompatParcelizer(Object obj) {
            getJsonBytes.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
            List list = this.MediaBrowserCompat$ItemReceiver;
            checkedCast MediaBrowserCompat$MediaItem = getJsonBytes.this.IconCompatParcelizer;
            AutoValue_CrashlyticsReport_Session_Event_Device.Builder builder = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            boolean itemInvoker = getJsonBytes.this.MediaDescriptionCompat.IconCompatParcelizer.setItemInvoker();
            SimpleTimeLimiter MediaBrowserCompat$CustomActionResultReceiver = SimpleTimeLimiter.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = builder.f2681x50fd9e4a.RatingCompat;
            MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = builder.ParcelableVolumeInfo.MediaDescriptionCompat;
            MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo = builder.MediaMetadataCompat;
            MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = MediaBrowserCompat$MediaItem.read.IconCompatParcelizer("dd MMM yyyy", OffsetDateTime.parse(builder.MediaSessionCompat$Token));
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.write((Context) null, Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb).toString();
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = builder.f2681x50fd9e4a.MediaBrowserCompat$ItemReceiver;
            MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(builder.ParcelableVolumeInfo.read, itemInvoker);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(MediaBrowserCompat$MediaItem.read(builder.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem, builder.f2681x50fd9e4a.MediaSessionCompat$Token, list, itemInvoker));
            arrayList.addAll(MediaBrowserCompat$MediaItem.read(builder.ParcelableVolumeInfo.f2680x50fd9e4a, builder.f2681x50fd9e4a.AppCompatDialogFragment, list, itemInvoker));
            arrayList.addAll(MediaBrowserCompat$MediaItem.read(builder.ParcelableVolumeInfo.MediaBrowserCompat$SearchResultReceiver, builder.f2681x50fd9e4a.MediaBrowserCompat$MediaItem, list, itemInvoker));
            MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = arrayList;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(Double.valueOf(builder.f2681x50fd9e4a.write).doubleValue());
            MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(builder.f2681x50fd9e4a.ActionMenuItemView.doubleValue());
            MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(Double.valueOf(builder.f2681x50fd9e4a.setChecked).doubleValue());
            MediaBrowserCompat$CustomActionResultReceiver.f2784x50fd9e4a = builder.f2681x50fd9e4a.setCheckable;
            MediaBrowserCompat$CustomActionResultReceiver.read = builder.ParcelableVolumeInfo.read;
            ((C6381x4d1a9e14) obj).read(MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
