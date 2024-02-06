package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.List;
import p040o.Iterables;
import p040o.filterValues;
import p040o.zzdy;

/* renamed from: o.newListMultimap */
public final class newListMultimap extends constrainedSetMultimap<write, FirebaseCrashlytics> {
    @HmlPinActivity
    newListMultimap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static FirebaseCrashlytics MediaBrowserCompat$ItemReceiver(getShortName getshortname, getLevels getlevels) {
        FirebaseCrashlytics firebaseCrashlytics;
        if (getshortname == getShortName.TYPE_SAVING) {
            firebaseCrashlytics = new getAppFile();
            ((getAppFile) firebaseCrashlytics).MediaBrowserCompat$MediaItem = write(Double.valueOf(getlevels.write));
        } else if (getshortname == getShortName.TYPE_CURRENT) {
            firebaseCrashlytics = new setCrashlyticsCollectionEnabled();
            String write2 = write(Double.valueOf(getlevels.MediaBrowserCompat$MediaItem));
            String write3 = write(Double.valueOf(getlevels.MediaDescriptionCompat));
            int intValue = MediaBrowserCompat$ItemReceiver(Double.valueOf(getlevels.MediaDescriptionCompat), Double.valueOf(getlevels.MediaBrowserCompat$MediaItem)).intValue();
            String write4 = write(Double.valueOf(getlevels.write));
            setCrashlyticsCollectionEnabled setcrashlyticscollectionenabled = (setCrashlyticsCollectionEnabled) firebaseCrashlytics;
            setcrashlyticscollectionenabled.MediaBrowserCompat$MediaItem = getlevels.MediaBrowserCompat$MediaItem > 0.0d;
            setcrashlyticscollectionenabled.MediaSessionCompat$Token = Iterables.C35273.read.red;
            setcrashlyticscollectionenabled.MediaBrowserCompat$SearchResultReceiver = write2;
            setcrashlyticscollectionenabled.MediaSessionCompat$ResultReceiverWrapper = write3;
            setcrashlyticscollectionenabled.RatingCompat = write4;
            setcrashlyticscollectionenabled.MediaSessionCompat$QueueItem = intValue;
        } else {
            firebaseCrashlytics = null;
        }
        if (firebaseCrashlytics == null) {
            return null;
        }
        String write5 = write(Double.valueOf(getlevels.read));
        String write6 = write(Double.valueOf(getlevels.MediaBrowserCompat$ItemReceiver));
        String write7 = write(Double.valueOf(getlevels.MediaBrowserCompat$SearchResultReceiver));
        String write8 = write(Double.valueOf(getlevels.RatingCompat));
        String write9 = write(Double.valueOf(getlevels.MediaBrowserCompat$CustomActionResultReceiver));
        String write10 = write(Double.valueOf(getlevels.MediaMetadataCompat));
        firebaseCrashlytics.IconCompatParcelizer = write5;
        firebaseCrashlytics.MediaBrowserCompat$ItemReceiver = write6;
        firebaseCrashlytics.MediaMetadataCompat = write7;
        firebaseCrashlytics.MediaDescriptionCompat = write8;
        firebaseCrashlytics.MediaBrowserCompat$CustomActionResultReceiver = write9;
        firebaseCrashlytics.read = write10;
        firebaseCrashlytics.PlaybackStateCompat$CustomAction = getlevels.MediaSessionCompat$QueueItem;
        firebaseCrashlytics.ParcelableVolumeInfo = getlevels.MediaSessionCompat$QueueItem;
        firebaseCrashlytics.f2852x50fd9e4a = getlevels.ParcelableVolumeInfo;
        firebaseCrashlytics.setHasDecor = getlevels.MediaSessionCompat$ResultReceiverWrapper;
        return firebaseCrashlytics;
    }

    /* renamed from: o.newListMultimap$write */
    public static class write {
        public final List<filterValues.write> MediaBrowserCompat$ItemReceiver;
        public final List<zzdy.zze> read;

        private write() {
        }

        public write(List<? extends zzdy.zze> list, List<filterValues.write> list2) {
            onGetStartedClick.write((Object) list, "listLimitSummary");
            onGetStartedClick.write((Object) list2, "listLimitDebitCard");
            this.read = list;
            this.MediaBrowserCompat$ItemReceiver = list2;
        }
    }

    public final /* bridge */ /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return MediaBrowserCompat$ItemReceiver((getShortName) null, (getLevels) null);
    }
}
