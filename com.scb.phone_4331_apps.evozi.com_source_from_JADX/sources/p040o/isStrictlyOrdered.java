package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.CrashlyticsReport;

/* renamed from: o.isStrictlyOrdered */
public final class isStrictlyOrdered extends constrainedSortedSetMultimap<isDebuggerAttached, CrashlyticsReport.FilesPayload.File.Builder> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj, boolean z) {
        return write((isDebuggerAttached) obj, z);
    }

    @HmlPinActivity
    public isStrictlyOrdered(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public static CrashlyticsReport.FilesPayload.File.Builder write(isDebuggerAttached isdebuggerattached, boolean z) {
        CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$CustomActionResultReceiver = CrashlyticsReport.FilesPayload.File.Builder.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.Keep = isdebuggerattached.read;
        MediaBrowserCompat$CustomActionResultReceiver.f2695x50fd9e4a = isdebuggerattached.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(isdebuggerattached.MediaBrowserCompat$ItemReceiver, z);
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static CrashlyticsReport.FilesPayload.File.Builder IconCompatParcelizer(QuickAccountSelectAdapter$FooterHolder quickAccountSelectAdapter$FooterHolder, boolean z) {
        String str;
        CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$CustomActionResultReceiver = CrashlyticsReport.FilesPayload.File.Builder.MediaBrowserCompat$CustomActionResultReceiver();
        String str2 = quickAccountSelectAdapter$FooterHolder.MediaBrowserCompat$SearchResultReceiver;
        if (str2 == null || str2.length() == 0) {
            str = quickAccountSelectAdapter$FooterHolder.MediaBrowserCompat$ItemReceiver;
        } else {
            str = quickAccountSelectAdapter$FooterHolder.MediaBrowserCompat$SearchResultReceiver;
        }
        MediaBrowserCompat$CustomActionResultReceiver.Keep = str;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = quickAccountSelectAdapter$FooterHolder.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = quickAccountSelectAdapter$FooterHolder.read;
        MediaBrowserCompat$CustomActionResultReceiver.f2695x50fd9e4a = quickAccountSelectAdapter$FooterHolder.MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = quickAccountSelectAdapter$FooterHolder.read;
        MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(quickAccountSelectAdapter$FooterHolder.MediaBrowserCompat$CustomActionResultReceiver, z);
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}
