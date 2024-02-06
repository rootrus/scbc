package p040o;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ChequeAnnouncementActivity_ViewBinding */
public final class ChequeAnnouncementActivity_ViewBinding implements Parcelable {
    public static final Parcelable.Creator<ChequeAnnouncementActivity_ViewBinding> CREATOR = new Parcelable.Creator<ChequeAnnouncementActivity_ViewBinding>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ChequeAnnouncementActivity_ViewBinding(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return new ChequeAnnouncementActivity_ViewBinding[i];
        }
    };
    public static int IconCompatParcelizer = 0;
    public static int write = 1;
    public int MediaBrowserCompat$CustomActionResultReceiver = 1;
    public int MediaBrowserCompat$ItemReceiver = 0;
    public Rect read;

    public ChequeAnnouncementActivity_ViewBinding() {
    }

    ChequeAnnouncementActivity_ViewBinding(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt();
        this.read = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeParcelable(this.read, 1);
    }
}
