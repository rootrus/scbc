package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$lambda$6 */
public final class access$lambda$6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public access$lambda$5 MediaDescriptionCompat;
    public access$lambda$4 read;
    public String write;

    /* renamed from: o.access$lambda$6$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new access$lambda$6(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (access$lambda$4) Enum.valueOf(access$lambda$4.class, parcel.readString()) : null, parcel.readString(), parcel.readInt() != 0 ? (access$lambda$5) Enum.valueOf(access$lambda$5.class, parcel.readString()) : null, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new access$lambda$6[i];
        }
    }

    public access$lambda$6() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$lambda$6)) {
            return false;
        }
        access$lambda$6 access_lambda_6 = (access$lambda$6) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) access_lambda_6.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) access_lambda_6.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) access_lambda_6.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) access_lambda_6.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) access_lambda_6.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) access_lambda_6.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        access$lambda$4 access_lambda_4 = this.read;
        int hashCode3 = access_lambda_4 != null ? access_lambda_4.hashCode() : 0;
        String str3 = this.write;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        access$lambda$5 access_lambda_5 = this.MediaDescriptionCompat;
        int hashCode5 = access_lambda_5 != null ? access_lambda_5.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PullSlipReceiverDisplay(bankLogo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountType=");
        sb.append(this.read);
        sb.append(", accountNumber=");
        sb.append(this.write);
        sb.append(", proxyType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", proxyNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        access$lambda$4 access_lambda_4 = this.read;
        if (access_lambda_4 != null) {
            parcel.writeInt(1);
            parcel.writeString(access_lambda_4.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.write);
        access$lambda$5 access_lambda_5 = this.MediaDescriptionCompat;
        if (access_lambda_5 != null) {
            parcel.writeInt(1);
            parcel.writeString(access_lambda_5.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public access$lambda$6(String str, String str2, access$lambda$4 access_lambda_4, String str3, access$lambda$5 access_lambda_5, String str4) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = access_lambda_4;
        this.write = str3;
        this.MediaDescriptionCompat = access_lambda_5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }

    private /* synthetic */ access$lambda$6(byte b) {
        this((String) null, (String) null, (access$lambda$4) null, (String) null, (access$lambda$5) null, (String) null);
    }
}
