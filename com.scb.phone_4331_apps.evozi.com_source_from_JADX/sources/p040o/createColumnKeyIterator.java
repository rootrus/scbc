package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.Sets;

/* renamed from: o.createColumnKeyIterator */
public final class createColumnKeyIterator extends constrainedListMultimap {
    private final Sets.PowerSet.BitFilteredSetIterator IconCompatParcelizer;

    @HmlPinActivity
    createColumnKeyIterator(Resources resources, Sets.PowerSet.BitFilteredSetIterator bitFilteredSetIterator, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        this.IconCompatParcelizer = bitFilteredSetIterator;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.util.LinkedList<o.CrashlyticsCore$2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.getOsBuildVersionString IconCompatParcelizer(p040o.LocationAvailability r6, p040o.AddPlaceRequest r7, p040o.EmptyImmutableList r8, p040o.InstallIdProvider r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r5 = this;
            java.lang.String r0 = r8.MediaDescriptionCompat
            java.lang.String r1 = "T"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 == 0) goto L_0x001c
            o.SettingsClient r11 = r7.RatingCompat
            java.lang.String r11 = r11.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r11 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r11, (boolean) r12)
            o.SettingsClient r12 = r7.RatingCompat
            java.lang.String r12 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r12 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r12, (boolean) r1)
            goto L_0x0030
        L_0x001c:
            java.lang.String r12 = r8.MediaDescriptionCompat
            java.lang.String r0 = "C"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x0028
            r12 = r11
            goto L_0x0030
        L_0x0028:
            o.SettingsClient r11 = r7.RatingCompat
            java.lang.String r11 = r11.MediaBrowserCompat$CustomActionResultReceiver
            o.SettingsClient r12 = r7.RatingCompat
            java.lang.String r12 = r12.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0030:
            o.isBuildIdValid$IconCompatParcelizer r0 = p040o.isBuildIdValid.IconCompatParcelizer()
            java.lang.String r2 = "FUND_ACTION_PURCHASE"
            r0.f2873x50fd9e4a = r2
            int r2 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.amount
            android.content.res.Resources r3 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r3.getString(r2)
            r0.RatingCompat = r2
            java.lang.String r2 = r8.read
            double r2 = java.lang.Double.parseDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.String r2 = write((java.lang.Double) r2)
            r0.MediaBrowserCompat$CustomActionResultReceiver = r2
            int r2 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.fund_client_no
            android.content.res.Resources r3 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r3.getString(r2)
            r0.MediaBrowserCompat$SearchResultReceiver = r2
            java.lang.String r8 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = p040o.getICheckDeserializerRtti.MediaDescriptionCompat(r8)
            r0.MediaBrowserCompat$MediaItem = r8
            r0.MediaSessionCompat$Token = r10
            java.lang.String r8 = r9.read
            r0.MediaSessionCompat$QueueItem = r8
            int r8 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.front_end_fee
            android.content.res.Resources r10 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = r10.getString(r8)
            r0.MediaSessionCompat$ResultReceiverWrapper = r8
            int r8 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.funds
            android.content.res.Resources r10 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = r10.getString(r8)
            r0.setHasDecor = r8
            java.lang.String r8 = r9.IconCompatParcelizer
            r0.PlaybackStateCompat$CustomAction = r8
            java.lang.String r8 = r9.MediaBrowserCompat$ItemReceiver
            r0.ParcelableVolumeInfo = r8
            java.lang.String r8 = r9.MediaBrowserCompat$SearchResultReceiver
            r0.Keep = r8
            int r8 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.fund_pay_by
            android.content.res.Resources r10 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = r10.getString(r8)
            r0.write = r8
            o.SettingsClient r8 = r7.RatingCompat
            java.lang.String r8 = r8.write
            r0.read = r8
            r0.IconCompatParcelizer = r11
            r0.MediaBrowserCompat$ItemReceiver = r12
            r8 = 0
            r10 = 0
            if (r6 != 0) goto L_0x00a5
            r6 = r8
            goto L_0x0108
        L_0x00a5:
            o.CrashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver r11 = new o.CrashlyticsFileMarker$MediaBrowserCompat$CustomActionResultReceiver
            r11.<init>()
            java.lang.String r12 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = r12.hashCode()
            r3 = 77
            r4 = 2
            if (r2 == r3) goto L_0x00d1
            r3 = 79
            if (r2 == r3) goto L_0x00c7
            r3 = 87
            if (r2 != r3) goto L_0x00db
            java.lang.String r2 = "W"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x00db
            r12 = r10
            goto L_0x00dc
        L_0x00c7:
            java.lang.String r2 = "O"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x00db
            r12 = r4
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r2 = "M"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x00db
            r12 = r1
            goto L_0x00dc
        L_0x00db:
            r12 = -1
        L_0x00dc:
            if (r12 == 0) goto L_0x00e3
            if (r12 == r1) goto L_0x00e2
            r4 = r10
            goto L_0x00e3
        L_0x00e2:
            r4 = r1
        L_0x00e3:
            r11.read = r4
            r11.MediaBrowserCompat$CustomActionResultReceiver = r1
            int r12 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.effective_investment_label
            android.content.res.Resources r2 = r5.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r12 = r2.getString(r12)
            r11.IconCompatParcelizer = r12
            o.Sets$PowerSet$BitFilteredSetIterator r12 = r5.IconCompatParcelizer
            java.lang.String r2 = r6.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r12 = r12.MediaDescriptionCompat(r2)
            r11.MediaBrowserCompat$ItemReceiver = r12
            o.Sets$PowerSet$BitFilteredSetIterator r12 = r5.IconCompatParcelizer
            java.lang.String r6 = r12.read(r6)
            r11.write = r6
            o.CrashlyticsFileMarker r6 = new o.CrashlyticsFileMarker
            r6.<init>(r11, r10)
        L_0x0108:
            r0.AlertController$RecycleListView = r6
            o.isBuildIdValid r6 = new o.isBuildIdValid
            r6.<init>(r0, r10)
            o.getOsBuildVersionString$MediaBrowserCompat$ItemReceiver r11 = p040o.getOsBuildVersionString.MediaSessionCompat$QueueItem()
            java.lang.String r12 = r7.MediaSessionCompat$ResultReceiverWrapper
            r11.Keep = r12
            org.threeten.bp.OffsetDateTime r12 = r7.ParcelableVolumeInfo
            java.lang.String r0 = "dd MMM yyyy"
            java.lang.String r12 = r5.IconCompatParcelizer((java.lang.String) r0, (org.threeten.p041bp.OffsetDateTime) r12)
            r11.AlertController$RecycleListView = r12
            java.lang.String r12 = r7.MediaBrowserCompat$MediaItem
            r11.MediaSessionCompat$ResultReceiverWrapper = r12
            java.lang.String r9 = r9.MediaDescriptionCompat
            r11.IconCompatParcelizer = r9
            java.lang.String r9 = r7.write
            r11.RatingCompat = r9
            java.lang.String r9 = r7.MediaSessionCompat$QueueItem
            r11.ParcelableVolumeInfo = r9
            java.lang.String r9 = r7.MediaSessionCompat$Token
            r11.MediaSessionCompat$Token = r9
            r11.MediaDescriptionCompat = r6
            java.lang.String r6 = r7.f5480x50fd9e4a
            r11.MediaSessionCompat$QueueItem = r6
            java.util.List<java.lang.String> r6 = r7.read
            java.lang.String r6 = MediaBrowserCompat$CustomActionResultReceiver((java.util.List<java.lang.String>) r6, (boolean) r1)
            r11.read = r6
            java.lang.String r6 = r7.MediaBrowserCompat$ItemReceiver
            r11.MediaBrowserCompat$CustomActionResultReceiver = r6
            java.lang.String r6 = r7.MediaBrowserCompat$SearchResultReceiver
            r11.f5539x50fd9e4a = r6
            java.lang.String r6 = r7.AlertController$RecycleListView
            if (r6 == 0) goto L_0x015a
            java.lang.String r6 = r7.AlertController$RecycleListView
            java.lang.String r9 = "Y"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r1 = r10
        L_0x015b:
            r11.MediaMetadataCompat = r1
            java.lang.String r6 = r7.PlaybackStateCompat$CustomAction
            r11.PlaybackStateCompat = r6
            boolean r6 = r7.IconCompatParcelizer
            r11.MediaBrowserCompat$SearchResultReceiver = r6
            o.getWebsiteUri r6 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r6 == 0) goto L_0x016e
            o.getWebsiteUri r6 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r6 = r6.IconCompatParcelizer
            goto L_0x016f
        L_0x016e:
            r6 = r8
        L_0x016f:
            r11.MediaBrowserCompat$ItemReceiver = r6
            o.getWebsiteUri r6 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r6 == 0) goto L_0x017a
            o.getWebsiteUri r6 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r6 = r6.read
            goto L_0x017b
        L_0x017a:
            r6 = r8
        L_0x017b:
            r11.write = r6
            java.util.List<o.setInitialTrigger> r6 = r7.MediaDescriptionCompat
            if (r6 == 0) goto L_0x01ae
            java.util.List<o.setInitialTrigger> r6 = r7.MediaDescriptionCompat
            o.show r7 = new o.show
            r7.<init>(r6)
            o.StandardRowSortedTable$RowSortedMap r6 = new o.StandardRowSortedTable$RowSortedMap
            r6.<init>(r5)
            o.show r8 = new o.show
            o.AppCompatSeekBar r9 = r7.write
            o.getSharedElementEnterTransition r12 = new o.getSharedElementEnterTransition
            java.util.Iterator<? extends T> r7 = r7.IconCompatParcelizer
            r12.<init>(r7, r6)
            r8.<init>(r9, r12)
            o.StandardTable r6 = p040o.StandardTable.read
            o.setupDialog$IconCompatParcelizer r7 = new o.setupDialog$IconCompatParcelizer
            o.setupDialog$3 r9 = new o.setupDialog$3
            r9.<init>()
            r7.<init>(r6, r9)
            java.lang.Object r6 = r8.write(r7)
            r8 = r6
            java.util.LinkedList r8 = (java.util.LinkedList) r8
        L_0x01ae:
            r11.MediaBrowserCompat$MediaItem = r8
            o.getOsBuildVersionString r6 = new o.getOsBuildVersionString
            r6.<init>(r11, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.createColumnKeyIterator.IconCompatParcelizer(o.LocationAvailability, o.AddPlaceRequest, o.EmptyImmutableList, o.InstallIdProvider, java.lang.String, java.lang.String, boolean):o.getOsBuildVersionString");
    }
}
