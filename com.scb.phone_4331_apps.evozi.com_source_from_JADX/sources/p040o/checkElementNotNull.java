package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.checkElementNotNull */
public final class checkElementNotNull implements Parcelable {
    public static final Parcelable.Creator<checkElementNotNull> CREATOR = new read();
    @SerializedName("transactionToken")
    private final String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof checkElementNotNull) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ((checkElementNotNull) obj).MediaBrowserCompat$ItemReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelConversionConfirmRequest(transactionToken=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public checkElementNotNull(String str) {
        onGetStartedClick.write((Object) str, "transactionToken");
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public checkElementNotNull(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)
            java.lang.String r2 = r2.readString()
            if (r2 != 0) goto L_0x000d
            java.lang.String r2 = ""
        L_0x000d:
            r1.<init>((java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.checkElementNotNull.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.checkElementNotNull$read */
    public static final class read implements Parcelable.Creator<checkElementNotNull> {
        read() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new checkElementNotNull(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new checkElementNotNull[i];
        }
    }
}
