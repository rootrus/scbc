package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.onUncaughtException$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5103xa98770a8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C5104xad103b35();
    public final List<HmlVerifyEmailSuccessfulActivity<String, String>> write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5103xa98770a8) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((C5103xa98770a8) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        List<HmlVerifyEmailSuccessfulActivity<String, String>> list = this.write;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankInfo(accounts=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        List<HmlVerifyEmailSuccessfulActivity<String, String>> list = this.write;
        parcel.writeInt(list.size());
        for (HmlVerifyEmailSuccessfulActivity<String, String> writeSerializable : list) {
            parcel.writeSerializable(writeSerializable);
        }
    }

    public C5103xa98770a8(List<HmlVerifyEmailSuccessfulActivity<String, String>> list) {
        onGetStartedClick.write((Object) list, "accounts");
        this.write = list;
    }
}
