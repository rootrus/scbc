package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.setRamUsed */
public final class setRamUsed implements Parcelable {
    public static final Parcelable.Creator CREATOR = new setRamUsed$MediaBrowserCompat$ItemReceiver();
    public final String IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final int MediaMetadataCompat;
    public HashMap<String, String> read;
    public final int write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRamUsed)) {
            return false;
        }
        setRamUsed setramused = (setRamUsed) obj;
        return this.write == setramused.write && this.MediaMetadataCompat == setramused.MediaMetadataCompat && this.MediaBrowserCompat$CustomActionResultReceiver == setramused.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$ItemReceiver == setramused.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setramused.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setramused.read);
    }

    public final int hashCode() {
        int i = this.write;
        int i2 = this.MediaMetadataCompat;
        int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i4 = this.MediaBrowserCompat$ItemReceiver;
        String str = this.IconCompatParcelizer;
        int i5 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        HashMap<String, String> hashMap = this.read;
        if (hashMap != null) {
            i5 = hashMap.hashCode();
        }
        return (((((((((i * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode) * 31) + i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchPageItemDisplay(index=");
        sb.append(this.write);
        sb.append(", title=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", searchHeader=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", searchHint=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", keyResult=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currentMapData=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.write);
        parcel.writeInt(this.MediaMetadataCompat);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        HashMap<String, String> hashMap = this.read;
        if (hashMap != null) {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            for (Map.Entry<String, String> next : hashMap.entrySet()) {
                parcel.writeString(next.getKey());
                parcel.writeString(next.getValue());
            }
            return;
        }
        parcel.writeInt(0);
    }

    public setRamUsed(int i, int i2, int i3, int i4, String str, HashMap<String, String> hashMap) {
        onGetStartedClick.write((Object) str, "keyResult");
        this.write = i;
        this.MediaMetadataCompat = i2;
        this.MediaBrowserCompat$CustomActionResultReceiver = i3;
        this.MediaBrowserCompat$ItemReceiver = i4;
        this.IconCompatParcelizer = str;
        this.read = hashMap;
    }

    public /* synthetic */ setRamUsed(int i, int i2, int i3, int i4, String str) {
        this(i, i2, i3, i4, str, new HashMap());
    }
}
