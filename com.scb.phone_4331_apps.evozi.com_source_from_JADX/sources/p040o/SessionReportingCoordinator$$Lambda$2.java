package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.SessionReportingCoordinator$$Lambda$2 */
public final class SessionReportingCoordinator$$Lambda$2 extends remainingCapacity implements Parcelable {
    public static final write CREATOR = new write((byte) 0);
    public final sendReports IconCompatParcelizer;
    public final sendReports MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public SessionReportingCoordinator$$Lambda$2(sendReports sendreports, sendReports sendreports2) {
        this.MediaBrowserCompat$ItemReceiver = sendreports;
        this.IconCompatParcelizer = sendreports2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SessionReportingCoordinator$$Lambda$2(Parcel parcel) {
        this((sendReports) parcel.readParcelable(sendReports.class.getClassLoader()), (sendReports) parcel.readParcelable(sendReports.class.getClassLoader()));
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
    }

    /* renamed from: o.SessionReportingCoordinator$$Lambda$2$write */
    public static final class write implements Parcelable.Creator<SessionReportingCoordinator$$Lambda$2> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new SessionReportingCoordinator$$Lambda$2(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SessionReportingCoordinator$$Lambda$2[i];
        }
    }
}
