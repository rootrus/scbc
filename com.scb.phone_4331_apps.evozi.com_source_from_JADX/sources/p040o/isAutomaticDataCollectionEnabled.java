package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.isAutomaticDataCollectionEnabled */
public final class isAutomaticDataCollectionEnabled implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4814x393e1125();
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final List<setCrashlyticsDataCollectionEnabled> MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isAutomaticDataCollectionEnabled)) {
            return false;
        }
        isAutomaticDataCollectionEnabled isautomaticdatacollectionenabled = (isAutomaticDataCollectionEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isautomaticdatacollectionenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isautomaticdatacollectionenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isautomaticdatacollectionenabled.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<setCrashlyticsDataCollectionEnabled> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TopDisplay(title=");
        sb.append(this.read);
        sb.append(", remark=");
        sb.append(this.write);
        sb.append(", items=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        List<setCrashlyticsDataCollectionEnabled> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (setCrashlyticsDataCollectionEnabled writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public isAutomaticDataCollectionEnabled(String str, String str2, List<setCrashlyticsDataCollectionEnabled> list) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "remark");
        this.read = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = list;
    }
}
