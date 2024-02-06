package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.access$lambda$0 */
public final class access$lambda$0 extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<access$lambda$0> CREATOR = new Parcelable.Creator<access$lambda$0>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new access$lambda$0(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new access$lambda$0[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public access$lambda$0(String str, String str2, String str3) {
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
    }

    protected access$lambda$0(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        access$lambda$0 access_lambda_0 = (access$lambda$0) obj;
        String str = this.read;
        if (str == null ? access_lambda_0.read != null : !str.equals(access_lambda_0.read)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null ? access_lambda_0.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(access_lambda_0.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        String str4 = access_lambda_0.IconCompatParcelizer;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }
}
