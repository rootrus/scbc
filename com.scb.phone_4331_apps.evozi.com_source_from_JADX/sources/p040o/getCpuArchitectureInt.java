package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.getMappingFileId;

/* renamed from: o.getCpuArchitectureInt */
public final class getCpuArchitectureInt extends getMappingFileId implements Parcelable {
    public static final Parcelable.Creator<getCpuArchitectureInt> CREATOR = new Parcelable.Creator<getCpuArchitectureInt>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getCpuArchitectureInt(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getCpuArchitectureInt[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.getCpuArchitectureInt$read */
    public static final class read extends getMappingFileId.write<read> {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$ItemReceiver;
    }

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ getCpuArchitectureInt(read read2, byte b) {
        this(read2);
    }

    private getCpuArchitectureInt(read read2) {
        super((getMappingFileId.write<?>) read2);
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = read2.IconCompatParcelizer;
    }

    protected getCpuArchitectureInt(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        getCpuArchitectureInt getcpuarchitectureint = (getCpuArchitectureInt) obj;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.equals(getcpuarchitectureint.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        return this.MediaBrowserCompat$ItemReceiver.equals(getcpuarchitectureint.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        return (((super.hashCode() * 31) + this.MediaBrowserCompat$CustomActionResultReceiver.hashCode()) * 31) + this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashLandingFooterDisplay{functionId='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", type='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
