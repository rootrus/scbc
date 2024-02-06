package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.ForwardingService */
public final class ForwardingService implements Parcelable {
    public static final Parcelable.Creator<ForwardingService> CREATOR = new Parcelable.Creator<ForwardingService>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ForwardingService(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ForwardingService[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public List<ForwardingFuture> MediaBrowserCompat$ItemReceiver;
    public String read;

    /* renamed from: o.ForwardingService$read */
    public static final class read {
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public List<ForwardingFuture> read;
        public String write;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ ForwardingService(read read2, byte b) {
        this(read2);
    }

    private ForwardingService(read read2) {
        this.MediaBrowserCompat$ItemReceiver = read2.read;
        this.read = read2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = read2.write;
    }

    public static read write() {
        return new read();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ForwardingService forwardingService = (ForwardingService) obj;
        List<ForwardingFuture> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null ? forwardingService.MediaBrowserCompat$ItemReceiver != null : !list.equals(forwardingService.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str = this.read;
        if (str == null ? forwardingService.read != null : !str.equals(forwardingService.read)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null ? forwardingService.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(forwardingService.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        String str4 = forwardingService.IconCompatParcelizer;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<ForwardingFuture> list = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.read;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseReviewDisplay{baseItemDisplayList=");
        sb.append(Arrays.toString(this.MediaBrowserCompat$ItemReceiver.toArray()));
        sb.append(", additionalTextInfo='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", additionalConfirmInfo='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", additionalTextInfoForSlip='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }

    protected ForwardingService(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.MediaBrowserCompat$ItemReceiver = arrayList;
        parcel.readList(arrayList, ForwardingFuture.class.getClassLoader());
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }
}
