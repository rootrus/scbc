package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.CrashlyticsBackgroundWorker;
import p040o.Multisets;

/* renamed from: o.swap */
public final class swap extends constrainedListMultimap {
    public Multisets.SetMultiset.EntrySet.C36891 IconCompatParcelizer;

    @HmlPinActivity
    public swap(Resources resources, SharedPreferences sharedPreferences, Multisets.SetMultiset.EntrySet.C36891 r3) {
        super(resources, sharedPreferences);
        this.IconCompatParcelizer = r3;
    }

    public final CrashlyticsBackgroundWorker.C32131 read(resetAnalyticsData resetanalyticsdata, getMappingFileId getmappingfileid) {
        double parseDouble = getmappingfileid.IconCompatParcelizer != null ? Double.parseDouble(getmappingfileid.IconCompatParcelizer) : 0.0d;
        CrashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver = new CrashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver();
        crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = resetanalyticsdata.read.MediaBrowserCompat$CustomActionResultReceiver;
        crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = resetanalyticsdata.read.IconCompatParcelizer;
        crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.write = resetanalyticsdata.read.read;
        crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = Double.valueOf(parseDouble);
        crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = getmappingfileid.MediaDescriptionCompat;
        crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.RatingCompat = resetanalyticsdata.IconCompatParcelizer;
        crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.read = Multisets.SetMultiset.EntrySet.C36891.MediaBrowserCompat$CustomActionResultReceiver(resetanalyticsdata.write);
        crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = resetanalyticsdata.MediaBrowserCompat$CustomActionResultReceiver;
        return new CrashlyticsBackgroundWorker.C32131(crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver);
    }
}
