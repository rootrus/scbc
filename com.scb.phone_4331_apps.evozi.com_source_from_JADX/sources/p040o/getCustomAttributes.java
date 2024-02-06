package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getCustomAttributes */
public final class getCustomAttributes extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4544x2fa58b2b();
    public final AutoValue_CrashlyticsReport_Session_Event IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<AutoValue_CrashlyticsReport_Session_Event_Application> read;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCustomAttributes)) {
            return false;
        }
        getCustomAttributes getcustomattributes = (getCustomAttributes) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcustomattributes.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcustomattributes.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcustomattributes.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event = this.IconCompatParcelizer;
        int hashCode2 = autoValue_CrashlyticsReport_Session_Event != null ? autoValue_CrashlyticsReport_Session_Event.hashCode() : 0;
        List<AutoValue_CrashlyticsReport_Session_Event_Application> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelWalletSummaryDisplay(cardRefNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", card=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", wallet=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer.writeToParcel(parcel, 0);
        List<AutoValue_CrashlyticsReport_Session_Event_Application> list = this.read;
        parcel.writeInt(list.size());
        for (AutoValue_CrashlyticsReport_Session_Event_Application writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public getCustomAttributes(String str, AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event, List<AutoValue_CrashlyticsReport_Session_Event_Application> list) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event, "card");
        onGetStartedClick.write((Object) list, "wallet");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = autoValue_CrashlyticsReport_Session_Event;
        this.read = list;
    }
}
