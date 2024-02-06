package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.submit */
public final class submit extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<submit> CREATOR = new Parcelable.Creator<submit>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new submit(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new submit[i];
        }
    };
    public String IconCompatParcelizer;
    public String read;

    /* renamed from: o.submit$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ submit(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private submit(IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer;
    }

    protected submit(Parcel parcel) {
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        submit submit = (submit) obj;
        String str = this.read;
        if (str == null ? submit.read != null : !str.equals(submit.read)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        String str3 = submit.IconCompatParcelizer;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashSalesheetDisplay{productType='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
