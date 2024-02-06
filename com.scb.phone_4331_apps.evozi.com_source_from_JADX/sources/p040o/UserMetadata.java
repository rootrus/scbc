package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.race;

/* renamed from: o.UserMetadata */
public class UserMetadata extends race implements Parcelable {
    public static final Parcelable.Creator<UserMetadata> CREATOR = new Parcelable.Creator<UserMetadata>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new UserMetadata(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UserMetadata[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String read;

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ UserMetadata(UserMetadata$MediaBrowserCompat$CustomActionResultReceiver userMetadata$MediaBrowserCompat$CustomActionResultReceiver, byte b) {
        this(userMetadata$MediaBrowserCompat$CustomActionResultReceiver);
    }

    private UserMetadata(UserMetadata$MediaBrowserCompat$CustomActionResultReceiver userMetadata$MediaBrowserCompat$CustomActionResultReceiver) {
        super((race.write<?>) userMetadata$MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver = userMetadata$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        this.read = userMetadata$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    protected UserMetadata(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
    }

    public final void write(Parcel parcel, int i) {
        super.write(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
    }

    public static UserMetadata$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer() {
        return new UserMetadata$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemPhotoCustomDisplay{componentRightExtraDetails='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", itemPhoto='");
        sb.append(this.read);
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
        UserMetadata userMetadata = (UserMetadata) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? userMetadata.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(userMetadata.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.read;
        String str3 = userMetadata.read;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
