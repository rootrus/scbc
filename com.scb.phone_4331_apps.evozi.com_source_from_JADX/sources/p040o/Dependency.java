package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Dependency */
public final class Dependency implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    private List<isLeaf> IconCompatParcelizer;
    private C10854optional MediaBrowserCompat$ItemReceiver;
    private isRoot read;

    /* renamed from: o.Dependency$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            isRoot isroot = null;
            C10854optional optional = parcel.readInt() != 0 ? (C10854optional) C10854optional.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                isroot = (isRoot) isRoot.CREATOR.createFromParcel(parcel);
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((isLeaf) isLeaf.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new Dependency(optional, isroot, arrayList);
        }

        public final Object[] newArray(int i) {
            return new Dependency[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) dependency.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) dependency.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) dependency.IconCompatParcelizer);
    }

    public final int hashCode() {
        C10854optional optional = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = optional != null ? optional.hashCode() : 0;
        isRoot isroot = this.read;
        int hashCode2 = isroot != null ? isroot.hashCode() : 0;
        List<isLeaf> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartySlipDisplay(header=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", footer=");
        sb.append(this.read);
        sb.append(", body=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        C10854optional optional = this.MediaBrowserCompat$ItemReceiver;
        if (optional != null) {
            parcel.writeInt(1);
            optional.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        isRoot isroot = this.read;
        if (isroot != null) {
            parcel.writeInt(1);
            isroot.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<isLeaf> list = this.IconCompatParcelizer;
        parcel.writeInt(list.size());
        for (isLeaf writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public Dependency(C10854optional optional, isRoot isroot, List<isLeaf> list) {
        onGetStartedClick.write((Object) list, "body");
        this.MediaBrowserCompat$ItemReceiver = optional;
        this.read = isroot;
        this.IconCompatParcelizer = list;
    }

    public Dependency() {
        this((byte) 0);
    }

    private /* synthetic */ Dependency(byte b) {
        this((C10854optional) null, (isRoot) null, HmlNationalIdActivity.IconCompatParcelizer);
    }
}
