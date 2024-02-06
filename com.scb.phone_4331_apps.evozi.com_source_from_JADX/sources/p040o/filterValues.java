package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.List;
import p040o.Iterables;

/* renamed from: o.filterValues */
public final class filterValues extends constrainedSetMultimap<write, SettableFuture> {
    @HmlPinActivity
    public filterValues(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final SettableFuture MediaBrowserCompat$CustomActionResultReceiver(setDaemon setdaemon, ThreadFactoryBuilder threadFactoryBuilder, boolean z) {
        int i = Iterables.C35273.RatingCompat.layout_bulk_transfer_individual_screenshot;
        String str = threadFactoryBuilder.MediaSessionCompat$ResultReceiverWrapper;
        SettableFuture IconCompatParcelizer = SettableFuture.IconCompatParcelizer(i, this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bulk_transfer_individual_screenshot_filename, new Object[]{str}), z);
        IconCompatParcelizer.IconCompatParcelizer = threadFactoryBuilder.RatingCompat;
        IconCompatParcelizer.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bulk_transfer_ref_id_individual, new Object[]{threadFactoryBuilder.MediaSessionCompat$ResultReceiverWrapper});
        IconCompatParcelizer.MediaBrowserCompat$MediaItem = setdaemon.MediaBrowserCompat$MediaItem;
        IconCompatParcelizer.MediaDescriptionCompat = setdaemon.MediaBrowserCompat$CustomActionResultReceiver;
        IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = setdaemon.MediaBrowserCompat$SearchResultReceiver;
        IconCompatParcelizer.MediaSessionCompat$Token = threadFactoryBuilder.MediaBrowserCompat$CustomActionResultReceiver;
        IconCompatParcelizer.MediaSessionCompat$QueueItem = threadFactoryBuilder.IconCompatParcelizer;
        IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper = threadFactoryBuilder.MediaBrowserCompat$ItemReceiver;
        IconCompatParcelizer.ParcelableVolumeInfo = threadFactoryBuilder.MediaMetadataCompat;
        IconCompatParcelizer.read = threadFactoryBuilder.MediaSessionCompat$Token;
        IconCompatParcelizer.MediaMetadataCompat = threadFactoryBuilder.MediaBrowserCompat$SearchResultReceiver;
        return IconCompatParcelizer;
    }

    /* renamed from: o.filterValues$write */
    public class write {
        public final String IconCompatParcelizer;
        public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final Integer MediaBrowserCompat$MediaItem;
        public final Integer MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final Integer MediaMetadataCompat;
        public final Integer MediaSessionCompat$QueueItem;
        public final Iterables.C351810 MediaSessionCompat$ResultReceiverWrapper;
        public final String RatingCompat;
        public final String read;
        public final String write;

        private write() {
        }

        public write(Iterables.C351810 r1, String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, List<String> list, String str5, String str6) {
            this.MediaSessionCompat$ResultReceiverWrapper = r1;
            this.write = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.read = str4;
            this.MediaSessionCompat$QueueItem = num;
            this.MediaMetadataCompat = num2;
            this.MediaBrowserCompat$MediaItem = num3;
            this.MediaBrowserCompat$SearchResultReceiver = num4;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
            this.MediaDescriptionCompat = str5;
            this.RatingCompat = str6;
        }
    }

    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return MediaBrowserCompat$CustomActionResultReceiver((setDaemon) null, (ThreadFactoryBuilder) null, false);
    }
}
