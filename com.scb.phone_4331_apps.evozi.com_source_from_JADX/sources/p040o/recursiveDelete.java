package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.recursiveDelete */
public class recursiveDelete extends ForwardingFuture implements Parcelable {
    public static final Parcelable.Creator<recursiveDelete> CREATOR = new Parcelable.Creator<recursiveDelete>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new recursiveDelete(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new recursiveDelete[i];
        }
    };
    public String read;

    public int describeContents() {
        return 0;
    }

    protected recursiveDelete(Parcel parcel) {
        super(parcel);
        this.read = parcel.readString();
    }

    public static read MediaBrowserCompat$CustomActionResultReceiver() {
        return new read(CrashlyticsReportJsonTransform$$Lambda$1.REMARK);
    }

    public final void write(Parcel parcel, int i) {
        parcel.writeString(this.read);
    }

    /* renamed from: o.recursiveDelete$read */
    public static class read<T extends read<T>> {
        public String MediaBrowserCompat$ItemReceiver;
        CrashlyticsReportJsonTransform$$Lambda$1 write;

        public read(CrashlyticsReportJsonTransform$$Lambda$1 crashlyticsReportJsonTransform$$Lambda$1) {
            this.write = crashlyticsReportJsonTransform$$Lambda$1;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemRemarkCustomDisplay{content='");
        sb.append(this.read);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.read;
        String str2 = ((recursiveDelete) obj).read;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public recursiveDelete(read<?> read2) {
        super(read2.write);
        this.read = read2.MediaBrowserCompat$ItemReceiver;
    }
}
