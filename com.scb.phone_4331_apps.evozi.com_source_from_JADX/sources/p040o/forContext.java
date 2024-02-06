package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forContext */
public final class forContext implements Parcelable {
    public static final read CREATOR = new read((byte) 0);
    public String IconCompatParcelizer;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof forContext)) {
            return false;
        }
        forContext forcontext = (forContext) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) forcontext.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) forcontext.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) forcontext.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CcSofReviewReceiverDisplay(merchantUrlLogo=");
        sb.append(this.write);
        sb.append(", partnerName=");
        sb.append(this.read);
        sb.append(", ref1=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public forContext(String str, String str2, String str3) {
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public forContext(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
    }

    /* renamed from: o.forContext$read */
    public static final class read implements Parcelable.Creator<forContext> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new forContext(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forContext[i];
        }
    }
}
