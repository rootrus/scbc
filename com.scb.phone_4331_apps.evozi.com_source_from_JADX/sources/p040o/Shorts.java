package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import p040o.CrashlyticsReport;

/* renamed from: o.Shorts */
public final class Shorts extends constrainedListMultimap {

    /* renamed from: o.Shorts$ShortArrayAsList */
    public final /* synthetic */ class ShortArrayAsList implements findFragmentByWho {
        private final /* synthetic */ lessThanUnsigned write;

        public /* synthetic */ ShortArrayAsList(lessThanUnsigned lessthanunsigned) {
            this.write = lessthanunsigned;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return this.write.MediaBrowserCompat$ItemReceiver((CrashlyticsReport.Session.Event.Application.Execution) obj);
        }
    }

    @HmlPinActivity
    public Shorts(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: o.Shorts$LexicographicalComparator */
    public final /* synthetic */ class LexicographicalComparator implements findFragmentByWho {
        private final /* synthetic */ UnsignedBytes MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ LexicographicalComparator(UnsignedBytes unsignedBytes) {
            this.MediaBrowserCompat$CustomActionResultReceiver = unsignedBytes;
        }

        public final Object IconCompatParcelizer(Object obj) {
            SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = (SupportStreetViewPanoramaFragment) obj;
            return new CrashlyticsReport.Session.OperatingSystem.Builder(supportStreetViewPanoramaFragment.MediaDescriptionCompat, supportStreetViewPanoramaFragment.read, supportStreetViewPanoramaFragment.MediaBrowserCompat$ItemReceiver, supportStreetViewPanoramaFragment.write, supportStreetViewPanoramaFragment.MediaBrowserCompat$CustomActionResultReceiver, supportStreetViewPanoramaFragment.IconCompatParcelizer);
        }
    }

    public static parseOs read(getStreetViewPanoramaAsync getstreetviewpanoramaasync, boolean z) {
        String str = getstreetviewpanoramaasync.MediaBrowserCompat$SearchResultReceiver;
        String str2 = getstreetviewpanoramaasync.read;
        if (!TextUtils.isEmpty(str2)) {
            str = String.format("%s (%s)", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(getstreetviewpanoramaasync.MediaBrowserCompat$CustomActionResultReceiver)) {
            str = getstreetviewpanoramaasync.MediaBrowserCompat$CustomActionResultReceiver;
        }
        String obj = getICheckDeserializerRtti.write((Context) null, Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb).toString();
        parseOs parseos = new parseOs();
        parseos.write = getstreetviewpanoramaasync.write;
        parseos.read = str;
        parseos.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(getstreetviewpanoramaasync.write, z);
        parseos.MediaBrowserCompat$CustomActionResultReceiver = obj;
        return parseos;
    }
}
