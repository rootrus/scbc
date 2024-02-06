package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.setTitleMarginBottom;

class SearchView$MediaBrowserCompat$ItemReceiver extends setTitleMarginBottom {
    public static final Parcelable.Creator<SearchView$MediaBrowserCompat$ItemReceiver> CREATOR = new Parcelable.ClassLoaderCreator<SearchView$MediaBrowserCompat$ItemReceiver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SearchView$MediaBrowserCompat$ItemReceiver(parcel, (ClassLoader) null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new SearchView$MediaBrowserCompat$ItemReceiver(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SearchView$MediaBrowserCompat$ItemReceiver[i];
        }
    };
    boolean read;

    SearchView$MediaBrowserCompat$ItemReceiver(Parcelable parcelable) {
        super(parcelable);
    }

    public SearchView$MediaBrowserCompat$ItemReceiver(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.read = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.read));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" isIconified=");
        sb.append(this.read);
        sb.append("}");
        return sb.toString();
    }
}
