package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanorama;

/* renamed from: o.TreeBasedTable */
public final class TreeBasedTable extends constrainedListMultimap {

    /* renamed from: o.TreeBasedTable$Factory */
    final class Factory implements findFragmentByWho {
        private final /* synthetic */ FundFactSheetActivity read;

        Factory(FundFactSheetActivity fundFactSheetActivity) {
            this.read = fundFactSheetActivity;
        }

        public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
            return this.read.invoke(obj);
        }
    }

    /* renamed from: o.TreeBasedTable$MergingIterator */
    public final class MergingIterator extends constrainedListMultimap {
        @HmlPinActivity
        public MergingIterator(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }
    }

    @HmlPinActivity
    public TreeBasedTable(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final List<CrashlyticsReport.FilesPayload.File.Builder> read(List<? extends StreetViewPanorama.OnStreetViewPanoramaLongClickListener> list, boolean z) {
        String str;
        onGetStartedClick.write((Object) list, "listAccountSource");
        Iterable<StreetViewPanorama.OnStreetViewPanoramaLongClickListener> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener : iterable) {
            onGetStartedClick.write((Object) onStreetViewPanoramaLongClickListener, "accountSource");
            String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(onStreetViewPanoramaLongClickListener.write, z);
            CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$CustomActionResultReceiver2 = CrashlyticsReport.FilesPayload.File.Builder.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$Token = MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$CustomActionResultReceiver2.f2695x50fd9e4a = onStreetViewPanoramaLongClickListener.write;
            MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper = onStreetViewPanoramaLongClickListener.f2789x50fd9e4a;
            MediaBrowserCompat$CustomActionResultReceiver2.Keep = MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$CustomActionResultReceiver2.read = write(onStreetViewPanoramaLongClickListener.MediaBrowserCompat$ItemReceiver);
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = onStreetViewPanoramaLongClickListener.MediaBrowserCompat$ItemReceiver;
            zzuk zzuk = onStreetViewPanoramaLongClickListener;
            if (zzuk.IconCompatParcelizer() != null) {
                str = zzuk.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver;
            } else {
                str = "error";
            }
            MediaBrowserCompat$CustomActionResultReceiver2.write = "1000".equals(str);
            MediaBrowserCompat$CustomActionResultReceiver2.ParcelableVolumeInfo = onStreetViewPanoramaLongClickListener.ParcelableVolumeInfo;
            MediaBrowserCompat$CustomActionResultReceiver2.RatingCompat = onStreetViewPanoramaLongClickListener.MediaDescriptionCompat;
            MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = onStreetViewPanoramaLongClickListener.read;
            MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = onStreetViewPanoramaLongClickListener.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "AccountSourceDisplay.cre…ccountSource.accountName)");
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver2);
        }
        return (List) arrayList;
    }
}
