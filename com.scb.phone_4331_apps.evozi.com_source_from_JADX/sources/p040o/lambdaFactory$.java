package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.lambdaFactory$ */
public final class lambdaFactory$ implements Parcelable {
    public static final Parcelable.Creator<lambdaFactory$> CREATOR = new write();
    private final String IconCompatParcelizer;

    public lambdaFactory$() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof lambdaFactory$) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((lambdaFactory$) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PageResponseDisplay(nextPageUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private /* synthetic */ lambdaFactory$(byte b) {
        this((String) null);
    }

    public lambdaFactory$(String str) {
        this.IconCompatParcelizer = str;
    }

    /* renamed from: o.lambdaFactory$$write */
    public static final class write implements Parcelable.Creator<lambdaFactory$> {
        write() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new lambdaFactory$(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lambdaFactory$[i];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public lambdaFactory$(Parcel parcel) {
        this(parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
    }
}
