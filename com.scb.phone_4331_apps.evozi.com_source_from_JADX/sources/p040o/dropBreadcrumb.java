package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.dropBreadcrumb */
public final class dropBreadcrumb extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<dropBreadcrumb> CREATOR = new Parcelable.Creator<dropBreadcrumb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new dropBreadcrumb(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new dropBreadcrumb[i];
        }
    };
    public List<RestrictedComponentContainer> MediaBrowserCompat$ItemReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public dropBreadcrumb(String str, List<RestrictedComponentContainer> list) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dropBreadcrumb dropbreadcrumb = (dropBreadcrumb) obj;
        if (!this.read.equals(dropbreadcrumb.read)) {
            return false;
        }
        return this.MediaBrowserCompat$ItemReceiver.equals(dropbreadcrumb.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SummaryItemDisplay{header='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", infoItemDisplays=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeList(this.MediaBrowserCompat$ItemReceiver);
    }

    protected dropBreadcrumb(Parcel parcel) {
        this.read = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.MediaBrowserCompat$ItemReceiver = arrayList;
        parcel.readList(arrayList, RestrictedComponentContainer.class.getClassLoader());
    }
}
