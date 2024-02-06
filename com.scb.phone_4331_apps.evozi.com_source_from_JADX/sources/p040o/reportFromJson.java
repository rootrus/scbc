package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.reportFromJson */
public final class reportFromJson extends removeDependent implements Parcelable {
    public static final Parcelable.Creator<reportFromJson> CREATOR = new Parcelable.Creator<reportFromJson>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new reportFromJson(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new reportFromJson[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ reportFromJson(Parcel parcel, byte b) {
        this(parcel);
    }

    public reportFromJson() {
    }

    private reportFromJson(Parcel parcel) {
        super((byte) 0);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        reportFromJson reportfromjson = (reportFromJson) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? reportfromjson.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(reportfromjson.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        String str3 = reportfromjson.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromptPayContactsDisplay{name='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", phoneNumber='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
