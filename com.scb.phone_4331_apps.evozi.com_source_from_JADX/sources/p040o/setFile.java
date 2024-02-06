package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setFile */
public final class setFile implements Parcelable {
    public static final Parcelable.Creator<setFile> CREATOR = new Parcelable.Creator<setFile>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setFile[i];
        }
    };
    public String IconCompatParcelizer;
    public long MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public setFile(String str, long j) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setFile setfile = (setFile) obj;
        if (this.MediaBrowserCompat$ItemReceiver != setfile.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        String str2 = setfile.IconCompatParcelizer;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.MediaBrowserCompat$ItemReceiver;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    protected setFile(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeLong(this.MediaBrowserCompat$ItemReceiver);
    }
}
