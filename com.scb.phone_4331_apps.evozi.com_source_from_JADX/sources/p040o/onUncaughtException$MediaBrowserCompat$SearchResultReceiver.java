package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.onUncaughtException$MediaBrowserCompat$SearchResultReceiver */
public final class onUncaughtException$MediaBrowserCompat$SearchResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final int MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.onUncaughtException$MediaBrowserCompat$SearchResultReceiver$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new onUncaughtException$MediaBrowserCompat$SearchResultReceiver(parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new onUncaughtException$MediaBrowserCompat$SearchResultReceiver[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof onUncaughtException$MediaBrowserCompat$SearchResultReceiver) && this.MediaBrowserCompat$ItemReceiver == ((onUncaughtException$MediaBrowserCompat$SearchResultReceiver) obj).MediaBrowserCompat$ItemReceiver;
        }
        return true;
    }

    public final int hashCode() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UploadedDocumentsInfo(uploadedCount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
    }

    public onUncaughtException$MediaBrowserCompat$SearchResultReceiver(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
    }
}
