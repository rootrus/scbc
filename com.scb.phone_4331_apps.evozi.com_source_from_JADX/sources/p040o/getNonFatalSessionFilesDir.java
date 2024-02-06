package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CrashlyticsController;

/* renamed from: o.getNonFatalSessionFilesDir */
public final class getNonFatalSessionFilesDir implements Parcelable {
    public static final read CREATOR = new read((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final CrashlyticsController.C322720 read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNonFatalSessionFilesDir)) {
            return false;
        }
        getNonFatalSessionFilesDir getnonfatalsessionfilesdir = (getNonFatalSessionFilesDir) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getnonfatalsessionfilesdir.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getnonfatalsessionfilesdir.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getnonfatalsessionfilesdir.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getnonfatalsessionfilesdir.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        CrashlyticsController.C322720 r3 = this.read;
        int hashCode3 = r3 != null ? r3.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOutcomeApproveDisplay(date=");
        sb.append(this.write);
        sb.append(", hourRemark=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", offerDetails=");
        sb.append(this.read);
        sb.append(", approvalBackground=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getNonFatalSessionFilesDir(String str, String str2, CrashlyticsController.C322720 r3, String str3) {
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = r3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getNonFatalSessionFilesDir(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), (CrashlyticsController.C322720) parcel.readParcelable(CrashlyticsController.C322720.class.getClassLoader()), parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeParcelable(this.read, i);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.getNonFatalSessionFilesDir$read */
    public static final class read implements Parcelable.Creator<getNonFatalSessionFilesDir> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new getNonFatalSessionFilesDir(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getNonFatalSessionFilesDir[i];
        }
    }
}
