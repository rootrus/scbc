package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseApp */
public final class parseApp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    private access$lambda$4 write;

    /* renamed from: o.parseApp$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new parseApp(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (access$lambda$4) Enum.valueOf(access$lambda$4.class, parcel.readString()) : null, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new parseApp[i];
        }
    }

    public parseApp() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parseApp)) {
            return false;
        }
        parseApp parseapp = (parseApp) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) parseapp.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) parseapp.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) parseapp.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) parseapp.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        access$lambda$4 access_lambda_4 = this.write;
        int hashCode3 = access_lambda_4 != null ? access_lambda_4.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PullSlipSenderDisplay(bankLogo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountType=");
        sb.append(this.write);
        sb.append(", accountNumber=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        access$lambda$4 access_lambda_4 = this.write;
        if (access_lambda_4 != null) {
            parcel.writeInt(1);
            parcel.writeString(access_lambda_4.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.read);
    }

    public parseApp(String str, String str2, access$lambda$4 access_lambda_4, String str3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = access_lambda_4;
        this.read = str3;
    }

    private /* synthetic */ parseApp(byte b) {
        this((String) null, (String) null, (access$lambda$4) null, (String) null);
    }
}
