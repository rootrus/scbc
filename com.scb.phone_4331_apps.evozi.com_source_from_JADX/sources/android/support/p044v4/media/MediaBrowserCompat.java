package android.support.p044v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p044v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p040o.IconCompatParcelizer$MediaBrowserCompat$ItemReceiver;
import p040o.ParcelableVolumeInfo;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {
    static final boolean MediaBrowserCompat$CustomActionResultReceiver = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: android.support.v4.media.MediaBrowserCompat$IconCompatParcelizer */
    public static abstract class IconCompatParcelizer {
        public void IconCompatParcelizer(String str, Bundle bundle, List<MediaItem> list) {
        }

        public void write(String str, Bundle bundle) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$write */
    public static abstract class write {
        public void IconCompatParcelizer(String str, Bundle bundle, Bundle bundle2) {
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle, Bundle bundle2) {
        }

        public void write(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* renamed from: write */
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: read */
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        private final int MediaBrowserCompat$CustomActionResultReceiver;
        private final MediaDescriptionCompat MediaBrowserCompat$ItemReceiver;

        public int describeContents() {
            return 0;
        }

        MediaItem(Parcel parcel) {
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt();
            this.MediaBrowserCompat$ItemReceiver = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$ItemReceiver.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", mDescription=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$read */
    public static abstract class read {
        final Object MediaBrowserCompat$CustomActionResultReceiver;

        public void IconCompatParcelizer(String str) {
        }

        public void read(MediaItem mediaItem) {
        }

        public read() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.MediaBrowserCompat$CustomActionResultReceiver = p040o.IconCompatParcelizer.write(new write());
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$read$write */
        class write implements IconCompatParcelizer$MediaBrowserCompat$ItemReceiver {
            write() {
            }

            public void MediaBrowserCompat$CustomActionResultReceiver(Parcel parcel) {
                if (parcel == null) {
                    read.this.read((MediaItem) null);
                    return;
                }
                parcel.setDataPosition(0);
                parcel.recycle();
                read.this.read(MediaItem.CREATOR.createFromParcel(parcel));
            }

            public void IconCompatParcelizer(String str) {
                read.this.IconCompatParcelizer(str);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    static class ItemReceiver extends ParcelableVolumeInfo {
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        private final read write;

        public void IconCompatParcelizer(int i, Bundle bundle) {
            MediaSessionCompat.write(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.write.read((MediaItem) parcelable);
            } else {
                this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    static class SearchResultReceiver extends ParcelableVolumeInfo {
        private final Bundle MediaBrowserCompat$CustomActionResultReceiver;
        private final String RatingCompat;
        private final IconCompatParcelizer write;

        public void IconCompatParcelizer(int i, Bundle bundle) {
            MediaSessionCompat.write(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.write.write(this.RatingCompat, this.MediaBrowserCompat$CustomActionResultReceiver);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.write.IconCompatParcelizer(this.RatingCompat, this.MediaBrowserCompat$CustomActionResultReceiver, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    static class CustomActionResultReceiver extends ParcelableVolumeInfo {
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        private final Bundle MediaBrowserCompat$SearchResultReceiver;
        private final write write;

        public void IconCompatParcelizer(int i, Bundle bundle) {
            if (this.write != null) {
                MediaSessionCompat.write(bundle);
                if (i == -1) {
                    this.write.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver, bundle);
                } else if (i == 0) {
                    this.write.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver, bundle);
                } else if (i != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown result code: ");
                    sb.append(i);
                    sb.append(" (extras=");
                    sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                    sb.append(", resultData=");
                    sb.append(bundle);
                    sb.append(")");
                    Log.w("MediaBrowserCompat", sb.toString());
                } else {
                    this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver, bundle);
                }
            }
        }
    }
}
