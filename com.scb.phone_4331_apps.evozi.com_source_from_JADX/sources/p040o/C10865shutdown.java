package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.Service;

/* renamed from: o.shutdown  reason: case insensitive filesystem */
public final class C10865shutdown extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<C10865shutdown> CREATOR = new Parcelable.Creator<C10865shutdown>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C10865shutdown(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C10865shutdown[i];
        }
    };
    public String IconCompatParcelizer;
    public List<Service.State> MediaBrowserCompat$ItemReceiver;
    public boolean read;

    public final int describeContents() {
        return 0;
    }

    protected C10865shutdown(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(Service.State.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeByte(this.read ? (byte) 1 : 0);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
    }

    public C10865shutdown() {
    }

    public static C10865shutdown IconCompatParcelizer() {
        return new C10865shutdown();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10865shutdown shutdown = (C10865shutdown) obj;
        if (this.read != shutdown.read) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        if (str == null ? shutdown.IconCompatParcelizer != null : !str.equals(shutdown.IconCompatParcelizer)) {
            return false;
        }
        List<Service.State> list = this.MediaBrowserCompat$ItemReceiver;
        List<Service.State> list2 = shutdown.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.read;
        List<Service.State> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + (z ? 1 : 0)) * 31) + i;
    }
}
