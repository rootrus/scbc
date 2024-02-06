package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.CrashlyticsReport;
import p040o.SignedBytes;

/* renamed from: o.state */
public final class C5421state extends SignedBytes.LexicographicalComparator {
    @HmlPinActivity
    public C5421state(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
    }

    public final CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$ItemReceiver(panoramaId panoramaid) {
        String str;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = null;
        if (panoramaid == null) {
            return null;
        }
        String str2 = "";
        if (position.NORMALL_BILLER.equals(panoramaid.f2912x50fd9e4a)) {
            String str3 = panoramaid.RatingCompat;
            if (!(str3 == null || str3.length() == 0) || panoramaid.read == null || panoramaid.read.equals(str2)) {
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.comp_code, new Object[]{panoramaid.RatingCompat});
            } else {
                int i = Iterables$3$MediaBrowserCompat$MediaItem.biller_ac;
                Object[] objArr = new Object[1];
                String str4 = panoramaid.read;
                if (str4.length() == 10) {
                    str4 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(true, false, str4);
                }
                objArr[0] = str4;
                str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(i, objArr);
            }
        } else {
            str = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.biller_id, new Object[]{panoramaid.read});
        }
        CrashlyticsReport.Session.Event.Application.Execution write = CrashlyticsReport.Session.Event.Application.Execution.write();
        write.PlaybackStateCompat = Integer.valueOf(panoramaid.ParcelableVolumeInfo).intValue();
        if (panoramaid.MediaBrowserCompat$ItemReceiver != null) {
            str2 = mo26549c_(panoramaid.MediaBrowserCompat$ItemReceiver);
        }
        CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver = write.IconCompatParcelizer(str2).MediaBrowserCompat$CustomActionResultReceiver(panoramaid.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = panoramaid.read;
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = str;
        MediaBrowserCompat$CustomActionResultReceiver.setIcon = panoramaid.AlertController$RecycleListView;
        MediaBrowserCompat$CustomActionResultReceiver.setPopupCallback = panoramaid.setHasDecor;
        MediaBrowserCompat$CustomActionResultReceiver.setPadding = panoramaid.Keep;
        MediaBrowserCompat$CustomActionResultReceiver.setGroupDividerEnabled = panoramaid.PlaybackStateCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = write(Double.valueOf(panoramaid.write));
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = panoramaid.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = panoramaid.f2912x50fd9e4a;
        MediaBrowserCompat$CustomActionResultReceiver.ListMenuItemView = panoramaid.AppCompatActivity;
        MediaBrowserCompat$CustomActionResultReceiver.setCheckable = panoramaid.MediaSessionCompat$ResultReceiverWrapper;
        MediaBrowserCompat$CustomActionResultReceiver.setTitle = panoramaid.MediaBrowserCompat$SearchResultReceiver;
        CrashlyticsReport.Session.Event.Application.Execution MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat();
        MediaMetadataCompat.Keep = panoramaid.MediaBrowserCompat$MediaItem;
        FragmentBuilder_BindNewTransactionFragment fragmentBuilder_BindNewTransactionFragment = panoramaid.MediaDescriptionCompat;
        if (fragmentBuilder_BindNewTransactionFragment != null) {
            operatingSystem = CrashlyticsReport.Session.OperatingSystem.write();
            operatingSystem.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindNewTransactionFragment.read;
            operatingSystem.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindNewTransactionFragment.MediaBrowserCompat$ItemReceiver;
            operatingSystem.read = fragmentBuilder_BindNewTransactionFragment.write;
        }
        MediaMetadataCompat.setHasDecor = operatingSystem;
        return MediaMetadataCompat;
    }
}
