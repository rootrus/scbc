package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.setTitleMarginBottom;

class BottomAppBar$MediaBrowserCompat$ItemReceiver extends setTitleMarginBottom {
    public static final Parcelable.Creator<BottomAppBar$MediaBrowserCompat$ItemReceiver> CREATOR = new Parcelable.ClassLoaderCreator<BottomAppBar$MediaBrowserCompat$ItemReceiver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BottomAppBar$MediaBrowserCompat$ItemReceiver(parcel, (ClassLoader) null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new BottomAppBar$MediaBrowserCompat$ItemReceiver(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BottomAppBar$MediaBrowserCompat$ItemReceiver[i];
        }
    };
    boolean IconCompatParcelizer;
    int read;

    public BottomAppBar$MediaBrowserCompat$ItemReceiver(Parcelable parcelable) {
        super(parcelable);
    }

    public BottomAppBar$MediaBrowserCompat$ItemReceiver(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.read = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.read);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
    }
}
