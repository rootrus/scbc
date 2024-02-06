package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.setTitleMarginBottom;

/* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver */
public class C0163xc9694653 extends setTitleMarginBottom {
    public static final Parcelable.Creator<C0163xc9694653> CREATOR = new Parcelable.ClassLoaderCreator<C0163xc9694653>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C0163xc9694653(parcel, (ClassLoader) null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0163xc9694653(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C0163xc9694653[i];
        }
    };
    final int MediaBrowserCompat$ItemReceiver;

    public C0163xc9694653(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt();
    }

    public C0163xc9694653(Parcelable parcelable, int i) {
        super(parcelable);
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver);
    }
}
