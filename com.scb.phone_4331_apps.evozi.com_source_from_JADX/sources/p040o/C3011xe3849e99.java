package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p040o.AnalyticsConnector;

/* renamed from: o.AnalyticsConnector$AnalyticsConnectorHandle$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3011xe3849e99 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        ArrayList arrayList = null;
        Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
        String readString = parcel.readString();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList2.add((AnalyticsConnector.AnalyticsConnectorListener) AnalyticsConnector.AnalyticsConnectorListener.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            arrayList = arrayList2;
        }
        return new AnalyticsConnector.AnalyticsConnectorHandle(valueOf, readString, arrayList);
    }

    public final Object[] newArray(int i) {
        return new AnalyticsConnector.AnalyticsConnectorHandle[i];
    }
}
