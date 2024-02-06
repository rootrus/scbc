package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.startTask */
public final class startTask implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final int MediaBrowserCompat$MediaItem;
    public final String RatingCompat;
    public final String read;
    public final Boolean write;

    /* renamed from: o.startTask$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            onGetStartedClick.write((Object) parcel, "in");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new startTask(readInt, readString, readString2, readString3, bool, parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new startTask[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof startTask)) {
            return false;
        }
        startTask starttask = (startTask) obj;
        return this.MediaBrowserCompat$MediaItem == starttask.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) starttask.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) starttask.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) starttask.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) starttask.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) starttask.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) starttask.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$MediaItem;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        Boolean bool = this.write;
        int hashCode4 = bool != null ? bool.hashCode() : 0;
        String str4 = this.read;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return (((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankingServiceTilesDisplay(sortSequence=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", displayType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tileName=");
        sb.append(this.RatingCompat);
        sb.append(", imageURL=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", loginRequiredFlag=");
        sb.append(this.write);
        sb.append(", firebaseEventName=");
        sb.append(this.read);
        sb.append(", deeplinkUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        Boolean bool = this.write;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        parcel.writeInt(z ? 1 : 0);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public startTask(int i, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        this.MediaBrowserCompat$MediaItem = i;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.RatingCompat = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.write = bool;
        this.read = str4;
        this.IconCompatParcelizer = str5;
    }
}
