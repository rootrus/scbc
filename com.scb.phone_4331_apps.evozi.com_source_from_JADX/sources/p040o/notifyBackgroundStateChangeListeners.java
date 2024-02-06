package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.notifyBackgroundStateChangeListeners */
public final class notifyBackgroundStateChangeListeners implements Parcelable {
    public static final Parcelable.Creator<notifyBackgroundStateChangeListeners> CREATOR = new Parcelable.Creator<notifyBackgroundStateChangeListeners>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new notifyBackgroundStateChangeListeners(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new notifyBackgroundStateChangeListeners[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    public final int describeContents() {
        return 0;
    }

    protected notifyBackgroundStateChangeListeners(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.write = parcel.readString();
    }

    public notifyBackgroundStateChangeListeners() {
    }

    public notifyBackgroundStateChangeListeners(String str, String str2, String str3) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        notifyBackgroundStateChangeListeners notifybackgroundstatechangelisteners = (notifyBackgroundStateChangeListeners) obj;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null ? notifybackgroundstatechangelisteners.MediaBrowserCompat$ItemReceiver != null : !str.equals(notifybackgroundstatechangelisteners.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? notifybackgroundstatechangelisteners.IconCompatParcelizer != null : !str2.equals(notifybackgroundstatechangelisteners.IconCompatParcelizer)) {
            return false;
        }
        String str3 = this.write;
        String str4 = notifybackgroundstatechangelisteners.write;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
    }
}
