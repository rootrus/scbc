package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver */
class C0069x3a4b86cb implements Parcelable {
    public static final Parcelable.Creator<C0069x3a4b86cb> CREATOR = new Parcelable.Creator<C0069x3a4b86cb>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C0069x3a4b86cb(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C0069x3a4b86cb[i];
        }
    };
    private int[] IconCompatParcelizer;
    int MediaBrowserCompat$ItemReceiver;
    boolean read;
    int write;

    public int describeContents() {
        return 0;
    }

    C0069x3a4b86cb(Parcel parcel) {
        this.write = parcel.readInt();
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
        this.read = parcel.readInt() != 1 ? false : true;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.IconCompatParcelizer = iArr;
            parcel.readIntArray(iArr);
        }
    }

    C0069x3a4b86cb() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.write);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.read ? 1 : 0);
        int[] iArr = this.IconCompatParcelizer;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.IconCompatParcelizer);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FullSpanItem{mPosition=");
        sb.append(this.write);
        sb.append(", mGapDir=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", mHasUnwantedGapAfter=");
        sb.append(this.read);
        sb.append(", mGapPerSpan=");
        sb.append(Arrays.toString(this.IconCompatParcelizer));
        sb.append('}');
        return sb.toString();
    }
}
