package p040o;

import android.text.TextUtils;
import java.util.List;

/* renamed from: o.isGooglePlayServicesUid */
public final class isGooglePlayServicesUid implements getLogger<PlaceLikelihoodBuffer, PlacePhotoMetadataResult> {
    public final /* synthetic */ List<DOMAIN> MediaBrowserCompat$ItemReceiver(List<DATA> list) {
        return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((getLogger) this, (List) list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object write(java.lang.Object r9) {
        /*
            r8 = this;
            o.PlacePhotoMetadataResult r9 = (p040o.PlacePhotoMetadataResult) r9
            o.PlaceLikelihoodBuffer r0 = new o.PlaceLikelihoodBuffer
            r0.<init>()
            o.setLocale r1 = p040o.setLocale.STATIC_SHORTCUT
            o.PlaceLikelihoodBuffer r0 = r0.write((p040o.setLocale) r1)
            java.lang.String r1 = r9.setShortcut
            java.lang.String r2 = "FUNCTION"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x001a
            o.getGeoDataClient r1 = p040o.getGeoDataClient.FUNCTION
            goto L_0x003d
        L_0x001a:
            java.lang.String r2 = "APPLICATION"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0025
            o.getGeoDataClient r1 = p040o.getGeoDataClient.APPLICATION
            goto L_0x003d
        L_0x0025:
            java.lang.String r2 = "TILE"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0030
            o.getGeoDataClient r1 = p040o.getGeoDataClient.TILES
            goto L_0x003d
        L_0x0030:
            java.lang.String r2 = "TILE_CATEGORY"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x003b
            o.getGeoDataClient r1 = p040o.getGeoDataClient.TILE_CATEGORY
            goto L_0x003d
        L_0x003b:
            o.getGeoDataClient r1 = p040o.getGeoDataClient.WEBVIEWTILE
        L_0x003d:
            o.PlaceLikelihoodBuffer r0 = r0.write((p040o.getGeoDataClient) r1)
            long r1 = r9.AppCompatViewInflater
            o.PlaceLikelihoodBuffer r0 = r0.write((long) r1)
            int r1 = r9.AlertController$RecycleListView
            o.PlaceLikelihoodBuffer r0 = r0.MediaDescriptionCompat((int) r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.ActionMenuItemView
            java.lang.String r3 = r9.setExpandedFormat
            java.lang.String r2 = MediaBrowserCompat$CustomActionResultReceiver(r2, r3)
            r1.append(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            java.lang.String r2 = r9.setIcon
            java.lang.String r3 = r9.setCheckable
            java.lang.String r2 = MediaBrowserCompat$CustomActionResultReceiver(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            o.PlaceLikelihoodBuffer r0 = r0.PlaybackStateCompat(r1)
            java.lang.String r1 = r9.setPadding
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x007e
        L_0x007c:
            r2 = r3
            goto L_0x00b6
        L_0x007e:
            r5 = -1
            int r6 = r1.hashCode()
            r7 = 76
            if (r6 == r7) goto L_0x00a3
            r7 = 77
            if (r6 == r7) goto L_0x0099
            r7 = 83
            if (r6 != r7) goto L_0x00ac
            java.lang.String r6 = "S"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00ac
            r5 = r3
            goto L_0x00ac
        L_0x0099:
            java.lang.String r6 = "M"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00ac
            r5 = r4
            goto L_0x00ac
        L_0x00a3:
            java.lang.String r6 = "L"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00ac
            r5 = r2
        L_0x00ac:
            if (r5 == 0) goto L_0x00b5
            if (r5 == r4) goto L_0x00b6
            if (r5 == r2) goto L_0x00b3
            goto L_0x007c
        L_0x00b3:
            r2 = 3
            goto L_0x00b6
        L_0x00b5:
            r2 = r4
        L_0x00b6:
            o.PlaceLikelihoodBuffer r0 = r0.mo26268x50fd9e4a((int) r2)
            java.lang.String r1 = r9.setChecked
            o.PlaceLikelihoodBuffer r0 = r0.MediaBrowserCompat$SearchResultReceiver((java.lang.String) r1)
            java.lang.String r1 = r9.f2771x50fd9e4a
            o.PlaceLikelihoodBuffer r0 = r0.RatingCompat((java.lang.String) r1)
            int r1 = r9.MediaSessionCompat$QueueItem
            if (r1 != r4) goto L_0x00cc
            r1 = r4
            goto L_0x00cd
        L_0x00cc:
            r1 = r3
        L_0x00cd:
            o.PlaceLikelihoodBuffer r0 = r0.IconCompatParcelizer((boolean) r1)
            boolean r1 = r9.MediaBrowserCompat$SearchResultReceiver
            o.PlaceLikelihoodBuffer r0 = r0.MediaBrowserCompat$CustomActionResultReceiver((boolean) r1)
            int r1 = r9.ParcelableVolumeInfo
            o.PlaceLikelihoodBuffer r0 = r0.write((int) r1)
            int r1 = r9.AppCompatDialogFragment
            if (r1 != r4) goto L_0x00e3
            r1 = r4
            goto L_0x00e4
        L_0x00e3:
            r1 = r3
        L_0x00e4:
            o.PlaceLikelihoodBuffer r0 = r0.MediaMetadataCompat((boolean) r1)
            int r1 = r9.PlaybackStateCompat$CustomAction
            if (r1 != r4) goto L_0x00ed
            r3 = r4
        L_0x00ed:
            o.PlaceLikelihoodBuffer r0 = r0.RatingCompat((boolean) r3)
            o.PlacesStatusCodes r1 = p040o.PlacesStatusCodes.MediaBrowserCompat$ItemReceiver()
            java.lang.String r2 = r9.MediaSessionCompat$ResultReceiverWrapper
            o.getGeoDataClient r2 = p040o.getGeoDataClient.IconCompatParcelizer(r2)
            r1.MediaSessionCompat$Token = r2
            o.PlaceLikelihoodBuffer r0 = r0.MediaBrowserCompat$ItemReceiver((p040o.PlacesStatusCodes) r1)
            java.util.List<o.PlacePhotoMetadataResult> r1 = r9.setGroupDividerEnabled
            if (r1 == 0) goto L_0x010e
            java.util.List<o.PlacePhotoMetadataResult> r9 = r9.setGroupDividerEnabled
            java.util.List r9 = r8.MediaBrowserCompat$ItemReceiver(r9)
            r0.IconCompatParcelizer((java.util.List<p040o.PlaceLikelihoodBuffer>) r9)
        L_0x010e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.isGooglePlayServicesUid.write(java.lang.Object):java.lang.Object");
    }

    @HmlPinActivity
    public isGooglePlayServicesUid(HmlApiBasedDocumentInstructionsActivity hmlApiBasedDocumentInstructionsActivity) {
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(str2);
            str3 = sb2.toString();
        }
        sb.append(str3);
        return sb.toString();
    }
}
