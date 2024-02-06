package android.support.p044v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p044v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;
import p040o.C6954x50fd9e4a;
import p040o.MediaBrowserCompat$MediaItem;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {
    public static void write(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {
            /* renamed from: MediaBrowserCompat$ItemReceiver */
            public final Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        };
        private final Object IconCompatParcelizer;
        private MediaBrowserCompat$MediaItem MediaBrowserCompat$CustomActionResultReceiver;
        private Bundle write;

        public final int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, (MediaBrowserCompat$MediaItem) null, (Bundle) null);
        }

        Token(Object obj, MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem, Bundle bundle) {
            this.IconCompatParcelizer = obj;
            this.MediaBrowserCompat$CustomActionResultReceiver = mediaBrowserCompat$MediaItem;
            this.write = bundle;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.IconCompatParcelizer, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.IconCompatParcelizer);
            }
        }

        public final int hashCode() {
            Object obj = this.IconCompatParcelizer;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.IconCompatParcelizer;
            if (obj2 != null) {
                Object obj3 = token.IconCompatParcelizer;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.IconCompatParcelizer != null) {
                return false;
            } else {
                return true;
            }
        }

        public final MediaBrowserCompat$MediaItem read() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final void MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
            this.MediaBrowserCompat$CustomActionResultReceiver = mediaBrowserCompat$MediaItem;
        }

        public final void MediaBrowserCompat$ItemReceiver(Bundle bundle) {
            this.write = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {
            /* renamed from: write */
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: read */
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };
        private final MediaDescriptionCompat IconCompatParcelizer;
        private Object MediaBrowserCompat$CustomActionResultReceiver;
        private final long write;

        public final int describeContents() {
            return 0;
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.IconCompatParcelizer = mediaDescriptionCompat;
                this.write = j;
                this.MediaBrowserCompat$CustomActionResultReceiver = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.IconCompatParcelizer = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.write = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.IconCompatParcelizer.writeToParcel(parcel, i);
            parcel.writeLong(this.write);
        }

        public static QueueItem read(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(C6954x50fd9e4a.read.IconCompatParcelizer(obj)), C6954x50fd9e4a.read.MediaBrowserCompat$CustomActionResultReceiver(obj));
        }

        public static List<QueueItem> MediaBrowserCompat$ItemReceiver(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object read : list) {
                arrayList.add(read(read));
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaSession.QueueItem {Description=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", Id=");
            sb.append(this.write);
            sb.append(" }");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {
            /* renamed from: MediaBrowserCompat$ItemReceiver */
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: IconCompatParcelizer */
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };
        ResultReceiver write;

        public final int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.write = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.write.writeToParcel(parcel, i);
        }
    }
}
