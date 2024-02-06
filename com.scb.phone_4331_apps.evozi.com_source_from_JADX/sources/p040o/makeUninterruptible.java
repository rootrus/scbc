package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.makeUninterruptible */
public class makeUninterruptible extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<makeUninterruptible> CREATOR = new Parcelable.Creator<makeUninterruptible>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new makeUninterruptible(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new makeUninterruptible[i];
        }
    };
    public immediateFuture IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    public List<immediateCheckedFuture> MediaBrowserCompat$ItemReceiver;
    public String read;

    public int describeContents() {
        return 0;
    }

    public static makeUninterruptible write() {
        return new makeUninterruptible();
    }

    public final makeUninterruptible read(String str) {
        this.read = str;
        return this;
    }

    public final makeUninterruptible read(List<immediateCheckedFuture> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
        return this;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final List<immediateCheckedFuture> MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeTypedList(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public makeUninterruptible() {
    }

    protected makeUninterruptible(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.createTypedArrayList(immediateCheckedFuture.CREATOR);
        this.IconCompatParcelizer = (immediateFuture) parcel.readParcelable(immediateFuture.class.getClassLoader());
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }
}
