package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.getServer */
public final class getServer extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getServer(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    private static access$lambda$4 IconCompatParcelizer(UiSettings uiSettings) {
        if (uiSettings == null) {
            return null;
        }
        try {
            return access$lambda$4.valueOf(uiSettings.toString());
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static access$lambda$6 MediaBrowserCompat$ItemReceiver(isRotateGesturesEnabled isrotategesturesenabled) {
        String obj;
        access$lambda$5 access_lambda_5 = null;
        if (isrotategesturesenabled == null) {
            return null;
        }
        try {
            isMyLocationButtonEnabled ismylocationbuttonenabled = isrotategesturesenabled.MediaBrowserCompat$SearchResultReceiver;
            if (!(ismylocationbuttonenabled == null || (obj = ismylocationbuttonenabled.toString()) == null)) {
                access_lambda_5 = access$lambda$5.valueOf(obj);
            }
        } catch (IllegalArgumentException unused) {
        }
        return new access$lambda$6(isrotategesturesenabled.MediaBrowserCompat$CustomActionResultReceiver, isrotategesturesenabled.MediaBrowserCompat$ItemReceiver, IconCompatParcelizer(isrotategesturesenabled.write), isrotategesturesenabled.read, access_lambda_5, isrotategesturesenabled.IconCompatParcelizer);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r1 = r1.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.access$lambda$3 MediaBrowserCompat$ItemReceiver(p040o.panoramaId r13) {
        /*
            r12 = this;
            java.lang.String r0 = "billScan"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r0)
            o.SupportStreetViewPanoramaFragment$zzb r13 = r13.PlaybackStateCompat$CustomAction
            r0 = 0
            if (r13 == 0) goto L_0x005c
            java.lang.String r1 = "billScan.pullSlip ?: return null"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r13, (java.lang.String) r1)
            o.isCompassEnabled r1 = r13.write     // Catch:{ IllegalArgumentException -> 0x0021 }
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0021 }
            if (r1 == 0) goto L_0x001e
            o.access$lambda$1 r1 = p040o.access$lambda$1.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0021 }
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            r9 = r1
            goto L_0x0022
        L_0x0021:
            r9 = r0
        L_0x0022:
            org.threeten.bp.OffsetDateTime r1 = r13.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = "dd MMM yyyy - HH:mm"
            java.lang.String r3 = r12.IconCompatParcelizer((java.lang.String) r2, (org.threeten.p041bp.OffsetDateTime) r1)
            java.lang.String r4 = r13.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r5 = r13.IconCompatParcelizer
            java.lang.String r6 = r13.MediaDescriptionCompat
            java.lang.String r7 = r13.MediaMetadataCompat
            java.lang.Double r8 = r13.read
            o.isIndoorLevelPickerEnabled r1 = r13.RatingCompat
            if (r1 != 0) goto L_0x003a
            r10 = r0
            goto L_0x0050
        L_0x003a:
            java.lang.String r0 = r1.MediaBrowserCompat$ItemReceiver
            java.lang.String r2 = r1.IconCompatParcelizer
            if (r2 != 0) goto L_0x0042
            java.lang.String r2 = ""
        L_0x0042:
            o.UiSettings r10 = r1.MediaBrowserCompat$CustomActionResultReceiver
            o.access$lambda$4 r10 = IconCompatParcelizer(r10)
            java.lang.String r1 = r1.read
            o.parseApp r11 = new o.parseApp
            r11.<init>(r0, r2, r10, r1)
            r10 = r11
        L_0x0050:
            o.isRotateGesturesEnabled r13 = r13.MediaBrowserCompat$ItemReceiver
            o.access$lambda$6 r11 = MediaBrowserCompat$ItemReceiver((p040o.isRotateGesturesEnabled) r13)
            o.access$lambda$3 r0 = new o.access$lambda$3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getServer.MediaBrowserCompat$ItemReceiver(o.panoramaId):o.access$lambda$3");
    }
}
