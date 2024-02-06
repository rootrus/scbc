package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ComponentDiscoveryService */
public final class ComponentDiscoveryService implements Parcelable {
    public static final write CREATOR = new write((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final int MediaBrowserCompat$SearchResultReceiver;
    private final int MediaMetadataCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentDiscoveryService)) {
            return false;
        }
        ComponentDiscoveryService componentDiscoveryService = (ComponentDiscoveryService) obj;
        return this.MediaBrowserCompat$SearchResultReceiver == componentDiscoveryService.MediaBrowserCompat$SearchResultReceiver && this.MediaMetadataCompat == componentDiscoveryService.MediaMetadataCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) componentDiscoveryService.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) componentDiscoveryService.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) componentDiscoveryService.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) componentDiscoveryService.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) componentDiscoveryService.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$SearchResultReceiver;
        int i2 = this.MediaMetadataCompat;
        String str = this.IconCompatParcelizer;
        int i3 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return (((((((((((i * 31) + i2) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallmentPlansExtDisplay(ippType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", tenure=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", cardInterestRate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardInterestAmount=");
        sb.append(this.read);
        sb.append(", monthlyInstallmentAmount=");
        sb.append(this.write);
        sb.append(", yearlyCardInterestRate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", totalAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ComponentDiscoveryService(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.MediaMetadataCompat = i2;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComponentDiscoveryService(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeInt(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.ComponentDiscoveryService$write */
    public static final class write implements Parcelable.Creator<ComponentDiscoveryService> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new ComponentDiscoveryService(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ComponentDiscoveryService[i];
        }
    }
}
