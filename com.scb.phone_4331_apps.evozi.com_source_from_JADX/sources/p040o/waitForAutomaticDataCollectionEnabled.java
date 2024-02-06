package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.waitForAutomaticDataCollectionEnabled */
public final class waitForAutomaticDataCollectionEnabled extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<waitForAutomaticDataCollectionEnabled> CREATOR = new Parcelable.Creator<waitForAutomaticDataCollectionEnabled>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new waitForAutomaticDataCollectionEnabled(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new waitForAutomaticDataCollectionEnabled[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public waitForAutomaticDataCollectionEnabled(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.MediaDescriptionCompat = i;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.RatingCompat = str2;
        this.read = str3;
        this.MediaMetadataCompat = str4;
        this.IconCompatParcelizer = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
    }

    protected waitForAutomaticDataCollectionEnabled(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readInt();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.read = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        waitForAutomaticDataCollectionEnabled waitforautomaticdatacollectionenabled = (waitForAutomaticDataCollectionEnabled) obj;
        if (this.MediaDescriptionCompat != waitforautomaticdatacollectionenabled.MediaDescriptionCompat) {
            return false;
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null ? waitforautomaticdatacollectionenabled.MediaBrowserCompat$ItemReceiver != null : !str.equals(waitforautomaticdatacollectionenabled.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? waitforautomaticdatacollectionenabled.read != null : !str2.equals(waitforautomaticdatacollectionenabled.read)) {
            return false;
        }
        String str3 = this.MediaMetadataCompat;
        if (str3 == null ? waitforautomaticdatacollectionenabled.MediaMetadataCompat != null : !str3.equals(waitforautomaticdatacollectionenabled.MediaMetadataCompat)) {
            return false;
        }
        String str4 = this.IconCompatParcelizer;
        if (str4 == null ? waitforautomaticdatacollectionenabled.IconCompatParcelizer != null : !str4.equals(waitforautomaticdatacollectionenabled.IconCompatParcelizer)) {
            return false;
        }
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str6 = waitforautomaticdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.MediaDescriptionCompat;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2;
    }
}
