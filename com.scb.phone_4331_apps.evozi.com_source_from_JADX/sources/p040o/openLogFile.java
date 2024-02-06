package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.openLogFile */
public final class openLogFile implements Parcelable {
    public static final Parcelable.Creator<openLogFile> CREATOR = new read();
    public final int MediaBrowserCompat$ItemReceiver;
    public final List<AutoCrashlyticsReportEncoder> read;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof openLogFile)) {
            return false;
        }
        openLogFile openlogfile = (openLogFile) obj;
        return this.MediaBrowserCompat$ItemReceiver == openlogfile.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) openlogfile.read);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        List<AutoCrashlyticsReportEncoder> list = this.read;
        return (i * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantWalletTransactionDisplay(lastPage=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", list=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public openLogFile(int i, List<AutoCrashlyticsReportEncoder> list) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.read = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public openLogFile(Parcel parcel) {
        this(parcel.readInt(), parcel.createTypedArrayList(AutoCrashlyticsReportEncoder.CREATOR));
        onGetStartedClick.write((Object) parcel, "source");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeTypedList(this.read);
    }

    /* renamed from: o.openLogFile$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements getAllowReturnTransitionOverlap {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(getRemoteContext getremotecontext) {
        }

        public final boolean write(Object obj) {
            return isUserRecoverableError.write((getOpacityAtPosition) obj);
        }
    }

    /* renamed from: o.openLogFile$read */
    public static final class read implements Parcelable.Creator<openLogFile> {
        read() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new openLogFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new openLogFile[i];
        }
    }
}
