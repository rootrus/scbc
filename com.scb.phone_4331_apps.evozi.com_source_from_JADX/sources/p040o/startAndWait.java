package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.CrashlyticsReport;

/* renamed from: o.startAndWait */
public final class startAndWait extends constrainedSetMultimap<setPattern, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return IconCompatParcelizer((setPattern) obj);
    }

    @HmlPinActivity
    public startAndWait(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame IconCompatParcelizer(setPattern setpattern) {
        if (setpattern == null) {
            return null;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.read MediaBrowserCompat$CustomActionResultReceiver = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = setpattern.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = setpattern.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.write = setpattern.write;
        MediaBrowserCompat$CustomActionResultReceiver.read = setpattern.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = setpattern.read;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = setpattern.MediaDescriptionCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = setpattern.MediaBrowserCompat$SearchResultReceiver;
        int i = setpattern.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = i != 0 ? i != 1 ? "" : "DEAL_OF_THE_DAY" : "SME_DEAL";
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = setpattern.MediaMetadataCompat;
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = setpattern.RatingCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = setpattern.f2956x50fd9e4a;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = IconCompatParcelizer(setpattern.ParcelableVolumeInfo);
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem = setpattern.MediaSessionCompat$Token;
        return new CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
    }

    private static parseArray IconCompatParcelizer(setPattern$MediaBrowserCompat$CustomActionResultReceiver setpattern_mediabrowsercompat_customactionresultreceiver) {
        if (setpattern_mediabrowsercompat_customactionresultreceiver == null) {
            return null;
        }
        parseArray$MediaBrowserCompat$CustomActionResultReceiver write = parseArray.write();
        write.RatingCompat = setpattern_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
        write.MediaBrowserCompat$ItemReceiver = setpattern_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        write.read = setpattern_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        write.IconCompatParcelizer = setpattern_mediabrowsercompat_customactionresultreceiver.read;
        write.MediaBrowserCompat$CustomActionResultReceiver = setpattern_mediabrowsercompat_customactionresultreceiver.write;
        write.write = setpattern_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        write.MediaDescriptionCompat = setpattern_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat;
        write.MediaMetadataCompat = setpattern_mediabrowsercompat_customactionresultreceiver.RatingCompat;
        write.MediaBrowserCompat$MediaItem = setpattern_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver;
        return new parseArray(write, (byte) 0);
    }
}
