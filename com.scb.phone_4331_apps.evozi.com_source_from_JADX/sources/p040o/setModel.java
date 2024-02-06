package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.setModel */
public final class setModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;
    private final List<String> write;

    /* renamed from: o.setModel$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new setModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        public final Object[] newArray(int i) {
            return new setModel[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setModel)) {
            return false;
        }
        setModel setmodel = (setModel) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setmodel.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setmodel.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setmodel.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmodel.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<String> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidActivationVerificationDisplay(cardNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardMask=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionToken=");
        sb.append(this.read);
        sb.append(", allowTag=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeStringList(this.write);
    }

    public setModel(String str, String str2, String str3, List<String> list) {
        onGetStartedClick.write((Object) str, "cardNumber");
        onGetStartedClick.write((Object) str2, "cardMask");
        onGetStartedClick.write((Object) str3, "transactionToken");
        onGetStartedClick.write((Object) list, "allowTag");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
        this.write = list;
    }
}
