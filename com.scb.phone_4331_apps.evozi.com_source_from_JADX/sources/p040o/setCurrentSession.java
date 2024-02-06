package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setCurrentSession */
public final class setCurrentSession implements Parcelable {
    public static final Parcelable.Creator<setCurrentSession> CREATOR = new Parcelable.Creator<setCurrentSession>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setCurrentSession(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setCurrentSession[i];
        }
    };
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver;
    public int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String RatingCompat;
    public boolean read;
    public int write;

    public final int describeContents() {
        return 0;
    }

    public static setCurrentSession write() {
        return new setCurrentSession();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
        parcel.writeInt(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeByte(this.read ? (byte) 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public setCurrentSession() {
    }

    protected setCurrentSession(Parcel parcel) {
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        boolean z = true;
        this.IconCompatParcelizer = parcel.readByte() != 0;
        this.write = parcel.readInt();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readInt();
        this.RatingCompat = parcel.readString();
        this.read = parcel.readByte() == 0 ? false : z;
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setCurrentSession setcurrentsession = (setCurrentSession) obj;
        if (this.IconCompatParcelizer != setcurrentsession.IconCompatParcelizer || this.write != setcurrentsession.write || this.MediaBrowserCompat$SearchResultReceiver != setcurrentsession.MediaBrowserCompat$SearchResultReceiver || this.MediaDescriptionCompat != setcurrentsession.MediaDescriptionCompat || this.read != setcurrentsession.read) {
            return false;
        }
        String str = this.MediaMetadataCompat;
        if (str == null ? setcurrentsession.MediaMetadataCompat != null : !str.equals(setcurrentsession.MediaMetadataCompat)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$MediaItem;
        if (str2 == null ? setcurrentsession.MediaBrowserCompat$MediaItem != null : !str2.equals(setcurrentsession.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 == null ? setcurrentsession.MediaBrowserCompat$ItemReceiver != null : !str3.equals(setcurrentsession.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 == null ? setcurrentsession.MediaBrowserCompat$CustomActionResultReceiver != null : !str4.equalsIgnoreCase(str4)) {
            return false;
        }
        String str5 = this.RatingCompat;
        String str6 = setcurrentsession.RatingCompat;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        boolean z = this.IconCompatParcelizer;
        int i2 = this.write;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        int i3 = this.MediaBrowserCompat$SearchResultReceiver;
        int i4 = this.MediaDescriptionCompat;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        boolean z2 = this.read;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + i2) * 31) + hashCode3) * 31) + i3) * 31) + i4) * 31) + hashCode4) * 31) + (z2 ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StaticTileDisplay{webViewUrl='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", pageTitle='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", autoSaveRequired=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", customUserAgentFlag=");
        sb.append(this.write);
        sb.append(", applicationURL='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", tileDisclaimerFlag=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", tileRequireLoginFlag=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", tileDisclaimerTitle='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", eKycButtonEnable=");
        sb.append(this.read);
        sb.append(", firebaseEventName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('}');
        return sb.toString();
    }
}
