package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import p040o.CrashlyticsReport;
import p040o.SignedBytes;

/* renamed from: o.startUp */
public final class startUp extends SignedBytes.LexicographicalComparator {
    @HmlPinActivity
    public startUp(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder IconCompatParcelizer(p040o.StreetViewPanoramaView.zza r7, java.util.List<p040o.onIndoorLevelActivated> r8) {
        /*
            r6 = this;
            o.show r0 = new o.show
            r0.<init>(r8)
            o.lexicographicalComparatorJavaImpl r8 = new o.lexicographicalComparatorJavaImpl
            r8.<init>(r7)
            o.show r1 = new o.show
            o.AppCompatSeekBar r2 = r0.write
            o.getNextTransition r3 = new o.getNextTransition
            java.util.Iterator<? extends T> r0 = r0.IconCompatParcelizer
            r3.<init>(r0, r8)
            r1.<init>(r2, r3)
            java.util.Iterator<? extends T> r8 = r1.IconCompatParcelizer
            boolean r8 = r8.hasNext()
            if (r8 == 0) goto L_0x002b
            java.util.Iterator<? extends T> r8 = r1.IconCompatParcelizer
            java.lang.Object r8 = r8.next()
            o.isSupportFragmentClass r8 = p040o.isSupportFragmentClass.read(r8)
            goto L_0x002f
        L_0x002b:
            o.isSupportFragmentClass r8 = p040o.isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x002f:
            o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r0 = p040o.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder.MediaBrowserCompat$CustomActionResultReceiver()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.MediaSessionCompat$Token
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            org.threeten.bp.OffsetDateTime r2 = r7.RatingCompat
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x004a
            r2 = r3
            goto L_0x0052
        L_0x004a:
            org.threeten.bp.OffsetDateTime r2 = r7.RatingCompat
            java.lang.String r4 = "dd MMM yyyy"
            java.lang.String r2 = r6.IconCompatParcelizer((java.lang.String) r4, (org.threeten.p041bp.OffsetDateTime) r2)
        L_0x0052:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.MediaBrowserCompat$MediaItem = r1
            java.lang.String r1 = r7.MediaMetadataCompat
            r0.MediaSessionCompat$Token = r1
            java.lang.String r1 = r7.MediaBrowserCompat$MediaItem
            r0.MediaSessionCompat$ResultReceiverWrapper = r1
            java.lang.String r1 = r7.MediaBrowserCompat$SearchResultReceiver
            r0.f2702x50fd9e4a = r1
            java.lang.Double r1 = r7.AppCompatDialogFragment
            java.lang.String r1 = write((java.lang.Double) r1)
            r0.PlaybackStateCompat = r1
            java.lang.Double r1 = r7.PlaybackStateCompat
            java.lang.String r1 = write((java.lang.Double) r1)
            r0.AlertController$RecycleListView = r1
            java.lang.String r1 = r7.write
            r0.IconCompatParcelizer = r1
            java.lang.String r1 = r7.MediaDescriptionCompat
            r0.ParcelableVolumeInfo = r1
            java.lang.String r1 = r7.Keep
            r0.AppCompatViewInflater = r1
            java.lang.String r1 = r7.setHasDecor
            r0.setChecked = r1
            java.lang.String r1 = r7.AlertController$RecycleListView
            r0.setPadding = r1
            java.lang.String r1 = r7.read
            r0.MediaDescriptionCompat = r1
            java.lang.String r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r6.mo26549c_(r1)
            r0.MediaBrowserCompat$SearchResultReceiver = r1
            java.lang.String r1 = r7.MediaSessionCompat$Token
            r0.setBackgroundResource = r1
            java.lang.String r1 = r7.MediaDescriptionCompat
            java.lang.String r2 = "EBILL"
            boolean r1 = r2.equals(r1)
            r2 = 1
            r4 = 0
            if (r1 != 0) goto L_0x00b3
            java.lang.String r1 = r7.MediaDescriptionCompat
            java.lang.String r5 = "RTP"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x00b3
            r1 = r4
            goto L_0x00b4
        L_0x00b3:
            r1 = r2
        L_0x00b4:
            r0.MediaMetadataCompat = r1
            java.lang.String r1 = r7.MediaSessionCompat$QueueItem
            java.lang.String r5 = "1"
            boolean r1 = r5.equals(r1)
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.bill_paid
            android.content.res.Resources r5 = r6.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            java.lang.String r5 = r7.MediaSessionCompat$Token
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 != 0) goto L_0x00e2
            int r1 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.bill_partially_paid
            android.content.res.Resources r5 = r6.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r5.getString(r1)
            java.lang.String r5 = r7.MediaSessionCompat$Token
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 != 0) goto L_0x00e2
            r1 = r2
            goto L_0x00e3
        L_0x00e2:
            r1 = r4
        L_0x00e3:
            r0.MediaBrowserCompat$ItemReceiver = r1
            java.lang.String r1 = r7.MediaSessionCompat$QueueItem
            r0.PlaybackStateCompat$CustomAction = r1
            java.lang.String r1 = r7.MediaBrowserCompat$ItemReceiver
            r0.read = r1
            java.lang.String r1 = r7.ParcelableVolumeInfo
            r0.Keep = r1
            java.lang.String r1 = r7.MediaSessionCompat$ResultReceiverWrapper
            r0.setContentView = r1
            java.lang.String r1 = r7.f2792x50fd9e4a
            r0.AppCompatDelegateImpl$ListMenuDecorView = r1
            java.lang.String r1 = r7.PlaybackStateCompat$CustomAction
            r0.setIcon = r1
            java.lang.String r1 = r7.AppCompatDelegateImpl$ListMenuDecorView
            r0.setItemInvoker = r1
            org.threeten.bp.OffsetDateTime r1 = r7.RatingCompat
            if (r1 != 0) goto L_0x0106
            goto L_0x010e
        L_0x0106:
            org.threeten.bp.OffsetDateTime r7 = r7.RatingCompat
            java.lang.String r1 = "dd MMM yyyy - HH:mm"
            java.lang.String r3 = r6.IconCompatParcelizer((java.lang.String) r1, (org.threeten.p041bp.OffsetDateTime) r7)
        L_0x010e:
            r0.RatingCompat = r3
            T r7 = r8.IconCompatParcelizer
            if (r7 == 0) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r2 = r4
        L_0x0116:
            if (r2 == 0) goto L_0x012b
            T r7 = r8.IconCompatParcelizer
            if (r7 == 0) goto L_0x0123
            o.onIndoorLevelActivated r7 = (p040o.onIndoorLevelActivated) r7
            java.lang.String r7 = r7.write
            r0.setHasDecor = r7
            goto L_0x012b
        L_0x0123:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r8 = "No value present"
            r7.<init>(r8)
            throw r7
        L_0x012b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.startUp.IconCompatParcelizer(o.StreetViewPanoramaView$zza, java.util.List):o.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder");
    }

    public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder, CrashlyticsReport.Session.Event.Application.Execution execution, boolean z) {
        Double MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(builder.AlertController$RecycleListView);
        String str = builder.AlertController$RecycleListView;
        if (MediaBrowserCompat$ItemReceiver.doubleValue() < 0.0d) {
            str = write(Double.valueOf(0.0d));
        }
        String str2 = builder.AppCompatViewInflater;
        if (!TextUtils.isEmpty(builder.setHasDecor)) {
            str2 = builder.setHasDecor;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder MediaBrowserCompat$CustomActionResultReceiver = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = builder.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = builder.MediaSessionCompat$Token;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = builder.MediaSessionCompat$ResultReceiverWrapper;
        MediaBrowserCompat$CustomActionResultReceiver.f2702x50fd9e4a = builder.f2702x50fd9e4a;
        MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat = builder.PlaybackStateCompat;
        MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView = str;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = builder.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo = builder.ParcelableVolumeInfo;
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatViewInflater = builder.AppCompatViewInflater;
        MediaBrowserCompat$CustomActionResultReceiver.setChecked = builder.setChecked;
        MediaBrowserCompat$CustomActionResultReceiver.setPadding = builder.setPadding;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = mo26549c_(builder.MediaBrowserCompat$SearchResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource = builder.setBackgroundResource;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = builder.MediaMetadataCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = builder.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = builder.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction = builder.PlaybackStateCompat$CustomAction;
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = execution.read();
        MediaBrowserCompat$CustomActionResultReceiver.setExpandedFormat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ebill_selected_reference, new Object[]{execution.setIcon, str2});
        MediaBrowserCompat$CustomActionResultReceiver.ActionMenuItemView = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ebill_selected_reference, new Object[]{execution.setPadding, builder.setChecked});
        MediaBrowserCompat$CustomActionResultReceiver.setPopupCallback = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ebill_selected_reference, new Object[]{execution.setItemInvoker, builder.setPadding});
        MediaBrowserCompat$CustomActionResultReceiver.Keep = builder.Keep;
        MediaBrowserCompat$CustomActionResultReceiver.setContentView = IconCompatParcelizer(builder.AppCompatDelegateImpl$ListMenuDecorView, builder.setContentView, z);
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = builder.AppCompatDelegateImpl$ListMenuDecorView;
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatDialogFragment = execution.setIcon;
        MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity = execution.setPadding;
        MediaBrowserCompat$CustomActionResultReceiver.setCheckable = execution.setItemInvoker;
        MediaBrowserCompat$CustomActionResultReceiver.setIcon = builder.setIcon;
        MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker = builder.setItemInvoker;
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
