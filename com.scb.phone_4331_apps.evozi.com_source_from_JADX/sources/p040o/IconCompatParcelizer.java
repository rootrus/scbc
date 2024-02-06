package p040o;

import android.media.browse.MediaBrowser;
import android.os.Parcel;

/* renamed from: o.IconCompatParcelizer */
public class IconCompatParcelizer {
    public static Object write(IconCompatParcelizer$MediaBrowserCompat$ItemReceiver iconCompatParcelizer$MediaBrowserCompat$ItemReceiver) {
        return new read(iconCompatParcelizer$MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.IconCompatParcelizer$read */
    static class read<T extends IconCompatParcelizer$MediaBrowserCompat$ItemReceiver> extends MediaBrowser.ItemCallback {
        protected final T write;

        public read(T t) {
            this.write = t;
        }

        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.write.MediaBrowserCompat$CustomActionResultReceiver((Parcel) null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.write.MediaBrowserCompat$CustomActionResultReceiver(obtain);
        }

        public void onError(String str) {
            this.write.IconCompatParcelizer(str);
        }
    }
}
