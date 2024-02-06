package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.access$900 */
public final class access$900 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final String IconCompatParcelizer;
    public final List<deleteSessionPartFilesFor> MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    /* renamed from: o.access$900$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((deleteSessionPartFilesFor) deleteSessionPartFilesFor.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new access$900(readString, readString2, readString3, readString4, arrayList);
        }

        public final Object[] newArray(int i) {
            return new access$900[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$900)) {
            return false;
        }
        access$900 access_900 = (access$900) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) access_900.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) access_900.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) access_900.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) access_900.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) access_900.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        List<deleteSessionPartFilesFor> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ETBProductDetailDisplay(productName=");
        sb.append(this.write);
        sb.append(", accountType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", shortDesc=");
        sb.append(this.read);
        sb.append(", detailImageURL=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productDetail=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        List<deleteSessionPartFilesFor> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        parcel.writeInt(list.size());
        for (deleteSessionPartFilesFor writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public access$900(String str, String str2, String str3, String str4, List<deleteSessionPartFilesFor> list) {
        onGetStartedClick.write((Object) str, "productName");
        onGetStartedClick.write((Object) str2, "accountType");
        onGetStartedClick.write((Object) str3, "shortDesc");
        onGetStartedClick.write((Object) str4, "detailImageURL");
        onGetStartedClick.write((Object) list, "productDetail");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }
}
