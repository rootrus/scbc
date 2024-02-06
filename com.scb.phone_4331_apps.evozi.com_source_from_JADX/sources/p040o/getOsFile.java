package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getOsFile */
public final class getOsFile implements Parcelable {
    public static final read CREATOR = new read((byte) 0);
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOsFile)) {
            return false;
        }
        getOsFile getosfile = (getOsFile) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == getosfile.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer == getosfile.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getosfile.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getosfile.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getosfile.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.IconCompatParcelizer;
        if (!z3) {
            z2 = z3;
        }
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((((z ? 1 : 0) * true) + (z2 ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectDebitTextDisplay(isVisible=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isEditable=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", labelText=");
        sb.append(this.write);
        sb.append(", placeHolder=");
        sb.append(this.read);
        sb.append(", text=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getOsFile(boolean z, boolean z2, String str, String str2, String str3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.IconCompatParcelizer = z2;
        this.write = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getOsFile(Parcel parcel) {
        this(parcel.readByte() != 0, parcel.readByte() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.getOsFile$read */
    public static final class read implements Parcelable.Creator<getOsFile> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new getOsFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getOsFile[i];
        }
    }
}
