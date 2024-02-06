package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

public class LinearLayoutManager$MediaBrowserCompat$ItemReceiver implements Parcelable {
    public static final Parcelable.Creator<LinearLayoutManager$MediaBrowserCompat$ItemReceiver> CREATOR = new Parcelable.Creator<LinearLayoutManager$MediaBrowserCompat$ItemReceiver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LinearLayoutManager$MediaBrowserCompat$ItemReceiver(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LinearLayoutManager$MediaBrowserCompat$ItemReceiver[i];
        }
    };
    int IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public LinearLayoutManager$MediaBrowserCompat$ItemReceiver() {
    }

    LinearLayoutManager$MediaBrowserCompat$ItemReceiver(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readInt();
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt() != 1 ? false : true;
    }

    public LinearLayoutManager$MediaBrowserCompat$ItemReceiver(LinearLayoutManager$MediaBrowserCompat$ItemReceiver linearLayoutManager$MediaBrowserCompat$ItemReceiver) {
        this.IconCompatParcelizer = linearLayoutManager$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = linearLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = linearLayoutManager$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver ? 1 : 0);
    }
}
