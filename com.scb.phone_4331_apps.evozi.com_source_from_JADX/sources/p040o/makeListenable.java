package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.makeListenable */
public final class makeListenable implements Parcelable {
    public static final Parcelable.Creator<makeListenable> CREATOR = new Parcelable.Creator<makeListenable>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new makeListenable(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new makeListenable[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public makeListenable(String str, String str2, String str3, String str4) {
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
    }

    protected makeListenable(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.write = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        makeListenable makelistenable = (makeListenable) obj;
        String str = this.read;
        if (str == null ? makelistenable.read != null : !str.equals(makelistenable.read)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null ? makelistenable.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(makelistenable.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 == null ? makelistenable.MediaBrowserCompat$ItemReceiver != null : !str3.equals(makelistenable.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str4 = this.write;
        String str5 = makelistenable.write;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }
}
