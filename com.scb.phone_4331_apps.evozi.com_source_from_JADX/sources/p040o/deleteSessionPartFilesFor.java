package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.deleteSessionPartFilesFor */
public final class deleteSessionPartFilesFor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final List<closeOpenSessions> IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    private final String MediaBrowserCompat$SearchResultReceiver;
    public final int MediaDescriptionCompat;
    public final int read;
    public final int write;

    /* renamed from: o.deleteSessionPartFilesFor$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt5);
            while (readInt5 != 0) {
                arrayList.add((closeOpenSessions) closeOpenSessions.CREATOR.createFromParcel(parcel));
                readInt5--;
            }
            return new deleteSessionPartFilesFor(readString, readString2, readInt, readString3, readInt2, readInt3, readInt4, arrayList);
        }

        public final Object[] newArray(int i) {
            return new deleteSessionPartFilesFor[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deleteSessionPartFilesFor)) {
            return false;
        }
        deleteSessionPartFilesFor deletesessionpartfilesfor = (deleteSessionPartFilesFor) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) deletesessionpartfilesfor.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) deletesessionpartfilesfor.MediaBrowserCompat$CustomActionResultReceiver) && this.MediaDescriptionCompat == deletesessionpartfilesfor.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) deletesessionpartfilesfor.MediaBrowserCompat$SearchResultReceiver) && this.write == deletesessionpartfilesfor.write && this.read == deletesessionpartfilesfor.read && this.MediaBrowserCompat$ItemReceiver == deletesessionpartfilesfor.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) deletesessionpartfilesfor.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = this.MediaDescriptionCompat;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        int i3 = this.write;
        int i4 = this.read;
        int i5 = this.MediaBrowserCompat$ItemReceiver;
        List<closeOpenSessions> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + hashCode3) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductDetailDisplay(subAttribute=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", productCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", sortSequence=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", defaultFlag=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", minAmount=");
        sb.append(this.write);
        sb.append(", maxAmount=");
        sb.append(this.read);
        sb.append(", incrementalAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", longDesc=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeInt(this.write);
        parcel.writeInt(this.read);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        List<closeOpenSessions> list = this.IconCompatParcelizer;
        parcel.writeInt(list.size());
        for (closeOpenSessions writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public deleteSessionPartFilesFor(String str, String str2, int i, String str3, int i2, int i3, int i4, List<closeOpenSessions> list) {
        onGetStartedClick.write((Object) str, "subAttribute");
        onGetStartedClick.write((Object) str2, "productCode");
        onGetStartedClick.write((Object) list, "longDesc");
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.write = i2;
        this.read = i3;
        this.MediaBrowserCompat$ItemReceiver = i4;
        this.IconCompatParcelizer = list;
    }
}
