package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

class NestedScrollView$MediaBrowserCompat$ItemReceiver extends View.BaseSavedState {
    public static final Parcelable.Creator<NestedScrollView$MediaBrowserCompat$ItemReceiver> CREATOR = new Parcelable.Creator<NestedScrollView$MediaBrowserCompat$ItemReceiver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new NestedScrollView$MediaBrowserCompat$ItemReceiver(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new NestedScrollView$MediaBrowserCompat$ItemReceiver[i];
        }
    };
    public int write;

    NestedScrollView$MediaBrowserCompat$ItemReceiver(Parcelable parcelable) {
        super(parcelable);
    }

    NestedScrollView$MediaBrowserCompat$ItemReceiver(Parcel parcel) {
        super(parcel);
        this.write = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }
}
