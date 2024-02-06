package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.UninterruptibleFuture */
public final class UninterruptibleFuture implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;

    /* renamed from: o.UninterruptibleFuture$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new UninterruptibleFuture(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new UninterruptibleFuture[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UninterruptibleFuture)) {
            return false;
        }
        UninterruptibleFuture uninterruptibleFuture = (UninterruptibleFuture) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) uninterruptibleFuture.MediaBrowserCompat$CustomActionResultReceiver) && this.IconCompatParcelizer == uninterruptibleFuture.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) uninterruptibleFuture.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + (z ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardApplyAllDisplay(cardRefNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", select=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardName=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        parcel.writeString(this.read);
    }

    public UninterruptibleFuture(String str, boolean z, String str2) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "cardName");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = z;
        this.read = str2;
    }
}
