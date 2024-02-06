package p040o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.ZTBSV */
public abstract class ZTBSV implements Parcelable {
    protected Map<String, ZSYR2K> MediaBrowserCompat$CustomActionResultReceiver;

    public int describeContents() {
        return 0;
    }

    ZTBSV() {
        this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    }

    public final void MediaBrowserCompat$ItemReceiver(ZSYR2K zsyr2k) {
        this.MediaBrowserCompat$CustomActionResultReceiver.put(zsyr2k.read, zsyr2k);
    }

    public final void read(String str, String str2) {
        ZSYR2K zsyr2k = new ZSYR2K(str, str2);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(zsyr2k.read, zsyr2k);
    }

    public final void IconCompatParcelizer(String str) {
        ZSYR2K zsyr2k = new ZSYR2K("status", str);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(zsyr2k.read, zsyr2k);
    }

    public final void read(String str) {
        ZSYR2K zsyr2k = new ZSYR2K("source", str);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(zsyr2k.read, zsyr2k);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        ZSYR2K zsyr2k = new ZSYR2K("subtype", str);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(zsyr2k.read, zsyr2k);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    }

    public final void MediaBrowserCompat$ItemReceiver(getKernelIDDst getkerneliddst, String str) {
        Collection<ZSYR2K> values = this.MediaBrowserCompat$CustomActionResultReceiver.values();
        if (!(str == null || str.length() == 0)) {
            Bundle bundle = new Bundle();
            for (ZSYR2K next : values) {
                bundle.putString(next.read, next.write);
            }
            getkerneliddst.MediaBrowserCompat$ItemReceiver(str, bundle);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver.size());
        for (Map.Entry next : this.MediaBrowserCompat$CustomActionResultReceiver.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeParcelable((Parcelable) next.getValue(), i);
        }
    }

    ZTBSV(Parcel parcel) {
        IconCompatParcelizer(parcel);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Parcel parcel) {
        int readInt = parcel.readInt();
        this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.MediaBrowserCompat$CustomActionResultReceiver.put(parcel.readString(), (ZSYR2K) parcel.readParcelable(ZSYR2K.class.getClassLoader()));
        }
    }
}
