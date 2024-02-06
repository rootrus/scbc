package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getCustomKeys */
public class getCustomKeys extends ForwardingFuture {
    public static final Parcelable.Creator<getCustomKeys> CREATOR = new Parcelable.Creator<getCustomKeys>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getCustomKeys(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getCustomKeys[i];
        }
    };
    public List<getIdentifierUtf8Bytes> MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public String read;

    public int describeContents() {
        return 0;
    }

    protected getCustomKeys(Parcel parcel) {
        super(parcel);
        this.read = parcel.readString();
        parcel.readList(this.MediaBrowserCompat$CustomActionResultReceiver, getIdentifierUtf8Bytes.class.getClassLoader());
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
    }

    public static read MediaBrowserCompat$CustomActionResultReceiver() {
        return new read(CrashlyticsReportJsonTransform$$Lambda$1.COMPLEX_INTEREST);
    }

    public final void write(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.getCustomKeys$read */
    public static class read<T extends read<T>> {
        public String IconCompatParcelizer;
        public int MediaBrowserCompat$CustomActionResultReceiver;
        public List<getIdentifierUtf8Bytes> read;
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
        sb.append("installments='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
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
        getCustomKeys getcustomkeys = (getCustomKeys) obj;
        String str = this.read;
        if (str == null ? getcustomkeys.read != null : !str.equals(getcustomkeys.read)) {
            return false;
        }
        List<getIdentifierUtf8Bytes> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list == null ? getcustomkeys.MediaBrowserCompat$CustomActionResultReceiver != null : !list.equals(getcustomkeys.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        if (this.MediaBrowserCompat$ItemReceiver != getcustomkeys.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<getIdentifierUtf8Bytes> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + i) * 31) + this.MediaBrowserCompat$ItemReceiver;
    }

    public getCustomKeys(read<?> read2) {
        super(read2.write);
        this.read = read2.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.read;
        this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
