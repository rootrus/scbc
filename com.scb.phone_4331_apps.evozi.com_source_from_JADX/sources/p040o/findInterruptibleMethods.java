package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.findInterruptibleMethods */
public final class findInterruptibleMethods extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<findInterruptibleMethods> CREATOR = new Parcelable.Creator<findInterruptibleMethods>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new findInterruptibleMethods(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new findInterruptibleMethods[i];
        }
    };
    public String IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public List<UncaughtExceptionHandlers> MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public double ParcelableVolumeInfo;
    public String RatingCompat;
    public boolean read;

    public final int describeContents() {
        return 0;
    }

    public findInterruptibleMethods() {
    }

    public static findInterruptibleMethods read() {
        return new findInterruptibleMethods();
    }

    protected findInterruptibleMethods(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readString();
        boolean z = true;
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.MediaBrowserCompat$MediaItem = parcel.readInt();
        this.RatingCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readDouble();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.createTypedArrayList(UncaughtExceptionHandlers.CREATOR);
        this.read = parcel.readByte() == 0 ? false : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeDouble(this.ParcelableVolumeInfo);
        parcel.writeTypedList(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeByte(this.read ? (byte) 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        findInterruptibleMethods findinterruptiblemethods = (findInterruptibleMethods) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver != findinterruptiblemethods.MediaBrowserCompat$CustomActionResultReceiver || this.MediaMetadataCompat != findinterruptiblemethods.MediaMetadataCompat || this.MediaBrowserCompat$MediaItem != findinterruptiblemethods.MediaBrowserCompat$MediaItem || Double.compare(findinterruptiblemethods.ParcelableVolumeInfo, this.ParcelableVolumeInfo) != 0) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        if (str == null ? findinterruptiblemethods.IconCompatParcelizer != null : !str.equals(findinterruptiblemethods.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? findinterruptiblemethods.MediaBrowserCompat$ItemReceiver != null : !str2.equals(findinterruptiblemethods.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.MediaDescriptionCompat;
        if (str3 == null ? findinterruptiblemethods.MediaDescriptionCompat != null : !str3.equals(findinterruptiblemethods.MediaDescriptionCompat)) {
            return false;
        }
        String str4 = this.RatingCompat;
        if (str4 == null ? findinterruptiblemethods.RatingCompat != null : !str4.equals(findinterruptiblemethods.RatingCompat)) {
            return false;
        }
        if (this.read != findinterruptiblemethods.read) {
            return false;
        }
        List<UncaughtExceptionHandlers> list = this.MediaBrowserCompat$SearchResultReceiver;
        List<UncaughtExceptionHandlers> list2 = findinterruptiblemethods.MediaBrowserCompat$SearchResultReceiver;
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
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        boolean z = this.MediaMetadataCompat;
        int i3 = this.MediaBrowserCompat$MediaItem;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.ParcelableVolumeInfo);
        int i4 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        List<UncaughtExceptionHandlers> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + i2) * 31) + hashCode3) * 31) + (z ? 1 : 0)) * 31) + i3) * 31) + hashCode4) * 31) + i4) * 31) + i) * 31) + (this.read ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BulkTransferRecipientsGroupDisplay{groupId='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", groupName='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", maxRecipientAllowed=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", maxRecipientAllowedDisplay='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", maxRecipientReached=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", noOfRecipients=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", noOfRecipientsDisplay='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", totalAmount=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", recipientList=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", hasScheduleFlag=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }
}
