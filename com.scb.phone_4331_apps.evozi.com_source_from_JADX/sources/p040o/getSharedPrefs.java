package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.getStringsFileValue;

/* renamed from: o.getSharedPrefs */
public final class getSharedPrefs extends getStringsFileValue implements Parcelable {
    public static final Parcelable.Creator<getSharedPrefs> CREATOR = new Parcelable.Creator<getSharedPrefs>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getSharedPrefs(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getSharedPrefs[i];
        }
    };
    private String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ getSharedPrefs(getSharedPrefs$MediaBrowserCompat$ItemReceiver getsharedprefs_mediabrowsercompat_itemreceiver, byte b) {
        this(getsharedprefs_mediabrowsercompat_itemreceiver);
    }

    private getSharedPrefs(getSharedPrefs$MediaBrowserCompat$ItemReceiver getsharedprefs_mediabrowsercompat_itemreceiver) {
        super((getStringsFileValue.write) getsharedprefs_mediabrowsercompat_itemreceiver);
        this.read = getsharedprefs_mediabrowsercompat_itemreceiver.read;
        this.MediaBrowserCompat$ItemReceiver = getsharedprefs_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = getsharedprefs_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
    }

    protected getSharedPrefs(Parcel parcel) {
        super(parcel);
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }

    public static getSharedPrefs$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver() {
        return new getSharedPrefs$MediaBrowserCompat$ItemReceiver((byte) 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        getSharedPrefs getsharedprefs = (getSharedPrefs) obj;
        String str = this.read;
        if (str == null ? getsharedprefs.read != null : !str.equals(getsharedprefs.read)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? getsharedprefs.MediaBrowserCompat$ItemReceiver != null : !str2.equals(getsharedprefs.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        String str4 = getsharedprefs.IconCompatParcelizer;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        String str = this.read;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }
}
