package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.SessionReportingCoordinator$$Lambda$1 */
public class SessionReportingCoordinator$$Lambda$1 extends ForwardingFuture implements Parcelable {
    public static final Parcelable.Creator<SessionReportingCoordinator$$Lambda$1> CREATOR = new Parcelable.Creator<SessionReportingCoordinator$$Lambda$1>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SessionReportingCoordinator$$Lambda$1(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SessionReportingCoordinator$$Lambda$1[i];
        }
    };
    public List<CrashlyticsReport.Session.OperatingSystem.Builder> MediaBrowserCompat$CustomActionResultReceiver;

    public int describeContents() {
        return 0;
    }

    public static C3769x8df5a479 write() {
        return new C3769x8df5a479(CrashlyticsReportJsonTransform$$Lambda$1.ADDITIONAL_META_DATA);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final void write(Parcel parcel, int i) {
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    protected SessionReportingCoordinator$$Lambda$1(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.createTypedArrayList(CrashlyticsReport.Session.OperatingSystem.Builder.CREATOR);
    }

    public SessionReportingCoordinator$$Lambda$1(C3769x8df5a479<?> sessionReportingCoordinator$$Lambda$1$MediaBrowserCompat$CustomActionResultReceiver) {
        super(sessionReportingCoordinator$$Lambda$1$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver = sessionReportingCoordinator$$Lambda$1$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
    }
}
