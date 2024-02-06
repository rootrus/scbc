package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.padWithZerosToMaxIntWidth */
public final class padWithZerosToMaxIntWidth extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<padWithZerosToMaxIntWidth> CREATOR = new Parcelable.Creator<padWithZerosToMaxIntWidth>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new padWithZerosToMaxIntWidth(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new padWithZerosToMaxIntWidth[i];
        }
    };
    public List<Integer> IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.padWithZerosToMaxIntWidth$write */
    public static final class write {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public List<Integer> MediaBrowserCompat$ItemReceiver;
        public String read;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ padWithZerosToMaxIntWidth(write write2, byte b) {
        this(write2);
    }

    private padWithZerosToMaxIntWidth(write write2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.read;
        this.MediaBrowserCompat$ItemReceiver = write2.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = write2.MediaBrowserCompat$ItemReceiver;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeList(this.IconCompatParcelizer);
    }

    protected padWithZerosToMaxIntWidth(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.IconCompatParcelizer = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        padWithZerosToMaxIntWidth padwithzerostomaxintwidth = (padWithZerosToMaxIntWidth) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? padwithzerostomaxintwidth.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(padwithzerostomaxintwidth.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? padwithzerostomaxintwidth.MediaBrowserCompat$ItemReceiver != null : !str2.equals(padwithzerostomaxintwidth.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        List<Integer> list = this.IconCompatParcelizer;
        List<Integer> list2 = padwithzerostomaxintwidth.IconCompatParcelizer;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<Integer> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashRepaymentOptionsDisplay{minimumAmount='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", maximumAmount='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", availableDurations=");
        sb.append(this.IconCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
