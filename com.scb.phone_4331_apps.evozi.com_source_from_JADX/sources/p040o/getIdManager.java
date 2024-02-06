package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getIdManager */
public final class getIdManager implements Parcelable {
    public static final Parcelable.Creator<getIdManager> CREATOR = new Parcelable.Creator<getIdManager>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getIdManager(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getIdManager[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public String MediaDescriptionCompat;
    private String RatingCompat;
    public String read;
    public boolean write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getIdManager(getIdManager$MediaBrowserCompat$CustomActionResultReceiver getidmanager_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(getidmanager_mediabrowsercompat_customactionresultreceiver);
    }

    private getIdManager(getIdManager$MediaBrowserCompat$CustomActionResultReceiver getidmanager_mediabrowsercompat_customactionresultreceiver) {
        this.MediaDescriptionCompat = getidmanager_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = getidmanager_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.RatingCompat = getidmanager_mediabrowsercompat_customactionresultreceiver.write;
        this.write = getidmanager_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = false;
        this.read = null;
        this.IconCompatParcelizer = null;
    }

    protected getIdManager(Parcel parcel) {
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        boolean z = true;
        this.write = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = parcel.readByte() == 0 ? false : z;
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeByte(this.write ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getIdManager getidmanager = (getIdManager) obj;
        if (this.write != getidmanager.write || this.MediaBrowserCompat$ItemReceiver != getidmanager.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        String str = this.read;
        if (str == null ? getidmanager.read != null : !str.equals(getidmanager.read)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? getidmanager.IconCompatParcelizer != null : !str2.equals(getidmanager.IconCompatParcelizer)) {
            return false;
        }
        String str3 = this.MediaDescriptionCompat;
        if (str3 == null ? getidmanager.MediaDescriptionCompat != null : !str3.equals(getidmanager.MediaDescriptionCompat)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 == null ? getidmanager.MediaBrowserCompat$CustomActionResultReceiver != null : !str4.equals(getidmanager.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str5 = this.RatingCompat;
        String str6 = getidmanager.RatingCompat;
        if (str5 != null) {
            return str5.equals(str6);
        }
        if (str6 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + (this.write ? 1 : 0)) * 31) + (this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConsentInfoDisplay{tag='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", info='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", title='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", hasButtons=");
        sb.append(this.write);
        sb.append(", hasCustomButtons=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", positiveButtonText=");
        sb.append(this.read);
        sb.append(", negativeButtonText=");
        sb.append(this.IconCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
