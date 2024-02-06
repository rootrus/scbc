package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.fillHole */
public final class fillHole extends constrainedListMultimap {
    @HmlPinActivity
    public fillHole(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.getUuidUtf8Bytes read(p040o.setUuidFromUtf8Bytes r9, p040o.getLanguage r10) {
        /*
            r8 = this;
            java.lang.String r0 = r10.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = r9.write()
            r2 = 0
            r3 = 1
            java.lang.String r1 = p040o.getICheckDeserializerRtti.IconCompatParcelizer((boolean) r3, (boolean) r2, (java.lang.String) r1)
            r9.MediaBrowserCompat$ItemReceiver((java.lang.String) r1)
            o.getUuidUtf8Bytes r1 = new o.getUuidUtf8Bytes
            r1.<init>()
            java.lang.String r4 = r9.MediaDescriptionCompat()
            int r5 = r4.hashCode()
            r6 = 2
            r7 = -1347299094(0xffffffffafb1d8ea, float:-3.235024E-10)
            if (r5 == r7) goto L_0x0040
            r7 = -1174071815(0xffffffffba0515f9, float:-5.0768215E-4)
            if (r5 == r7) goto L_0x0036
            r7 = -829305563(0xffffffffce91cd25, float:-1.22307034E9)
            if (r5 != r7) goto L_0x004a
            java.lang.String r5 = "ORDER_CHEQUE_FUNCTION"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004a
            r4 = r6
            goto L_0x004b
        L_0x0036:
            java.lang.String r5 = "STOP_CHEQUE_FUNCTION"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004a
            r4 = r2
            goto L_0x004b
        L_0x0040:
            java.lang.String r5 = "ACTIVATE_CHEQUE_FUNCTION"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004a
            r4 = r3
            goto L_0x004b
        L_0x004a:
            r4 = -1
        L_0x004b:
            if (r4 == 0) goto L_0x0065
            if (r4 == r3) goto L_0x005c
            if (r4 == r6) goto L_0x0053
            r4 = 0
            goto L_0x006d
        L_0x0053:
            int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.order_cheque_successful_header
            android.content.res.Resources r5 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r5.getString(r4)
            goto L_0x006d
        L_0x005c:
            int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.activate_success_cheque
            android.content.res.Resources r5 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r5.getString(r4)
            goto L_0x006d
        L_0x0065:
            int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.successful_stop_cheque
            android.content.res.Resources r5 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r5.getString(r4)
        L_0x006d:
            r1.AlertController$RecycleListView = r4
            r1.ParcelableVolumeInfo = r0
            int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.reference_id
            android.content.res.Resources r5 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r5.getString(r4)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r0
            java.lang.String r0 = java.lang.String.format(r4, r5)
            r1.MediaSessionCompat$Token = r0
            org.threeten.bp.OffsetDateTime r0 = r10.write
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = ""
            goto L_0x0092
        L_0x008a:
            org.threeten.bp.OffsetDateTime r0 = r10.write
            java.lang.String r4 = "dd MMM yyyy - HH:mm"
            java.lang.String r0 = r8.IconCompatParcelizer((java.lang.String) r4, (org.threeten.p041bp.OffsetDateTime) r0)
        L_0x0092:
            r1.MediaDescriptionCompat = r0
            int r0 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.remaining_balance
            android.content.res.Resources r4 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r4.getString(r0)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.order_cheque_transaction
            android.content.res.Resources r6 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r5 = r6.getString(r5)
            r4[r2] = r5
            java.lang.Double r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r10 = write((java.lang.Double) r10)
            r4[r3] = r10
            java.lang.String r10 = java.lang.String.format(r0, r4)
            r1.MediaSessionCompat$QueueItem = r10
            r1.PlaybackStateCompat = r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.fillHole.read(o.setUuidFromUtf8Bytes, o.getLanguage):o.getUuidUtf8Bytes");
    }
}
