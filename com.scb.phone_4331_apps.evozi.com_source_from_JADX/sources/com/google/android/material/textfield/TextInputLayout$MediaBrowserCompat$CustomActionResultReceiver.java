package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p040o.setTitleMarginBottom;

class TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver extends setTitleMarginBottom {
    public static final Parcelable.Creator<TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver> CREATOR = new Parcelable.ClassLoaderCreator<TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver(parcel, (ClassLoader) null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver(parcel, classLoader);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver[i];
        }
    };
    CharSequence IconCompatParcelizer;
    boolean MediaBrowserCompat$ItemReceiver;

    TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable) {
        super(parcelable);
    }

    TextInputLayout$MediaBrowserCompat$CustomActionResultReceiver(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.IconCompatParcelizer = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.MediaBrowserCompat$ItemReceiver = parcel.readInt() != 1 ? false : true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.IconCompatParcelizer, parcel, i);
        parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextInputLayout.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" error=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }
}
