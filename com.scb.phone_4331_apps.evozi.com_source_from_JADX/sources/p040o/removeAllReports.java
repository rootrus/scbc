package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.removeAllReports */
public class removeAllReports extends ForwardingFuture implements Parcelable {
    public static final Parcelable.Creator<removeAllReports> CREATOR = new Parcelable.Creator<removeAllReports>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new removeAllReports(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new removeAllReports[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ removeAllReports(removeAllReports$MediaBrowserCompat$CustomActionResultReceiver removeallreports_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(removeallreports_mediabrowsercompat_customactionresultreceiver);
    }

    private removeAllReports(removeAllReports$MediaBrowserCompat$CustomActionResultReceiver removeallreports_mediabrowsercompat_customactionresultreceiver) {
        super(CrashlyticsReportJsonTransform$$Lambda$1.CARD);
        this.IconCompatParcelizer = removeallreports_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = removeallreports_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = removeallreports_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
    }

    protected removeAllReports(Parcel parcel) {
        super(parcel);
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void write(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public static removeAllReports$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver() {
        return new removeAllReports$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }
}
