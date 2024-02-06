package p040o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

/* renamed from: o.setOnInflateListener */
final class setOnInflateListener implements Parcelable {
    public static final Parcelable.Creator<setOnInflateListener> CREATOR = new Parcelable.Creator<setOnInflateListener>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setOnInflateListener(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setOnInflateListener[i];
        }
    };
    final int IconCompatParcelizer;
    final boolean MediaBrowserCompat$CustomActionResultReceiver;
    final Bundle MediaBrowserCompat$ItemReceiver;
    Fragment MediaBrowserCompat$MediaItem;
    final boolean MediaBrowserCompat$SearchResultReceiver;
    final boolean MediaDescriptionCompat;
    final int MediaMetadataCompat;
    final String MediaSessionCompat$ResultReceiverWrapper;
    Bundle ParcelableVolumeInfo;
    final boolean RatingCompat;
    final String read;
    final int write;

    public final int describeContents() {
        return 0;
    }

    setOnInflateListener(Fragment fragment) {
        this.read = fragment.getClass().getName();
        this.MediaMetadataCompat = fragment.mIndex;
        this.MediaDescriptionCompat = fragment.mFromLayout;
        this.IconCompatParcelizer = fragment.mFragmentId;
        this.write = fragment.mContainerId;
        this.MediaSessionCompat$ResultReceiverWrapper = fragment.mTag;
        this.MediaBrowserCompat$SearchResultReceiver = fragment.mRetainInstance;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragment.mDetached;
        this.MediaBrowserCompat$ItemReceiver = fragment.mArguments;
        this.RatingCompat = fragment.mHidden;
    }

    setOnInflateListener(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaMetadataCompat = parcel.readInt();
        boolean z = true;
        this.MediaDescriptionCompat = parcel.readInt() != 0;
        this.IconCompatParcelizer = parcel.readInt();
        this.write = parcel.readInt();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt() != 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readInt() != 0;
        this.MediaBrowserCompat$ItemReceiver = parcel.readBundle();
        this.RatingCompat = parcel.readInt() == 0 ? false : z;
        this.ParcelableVolumeInfo = parcel.readBundle();
    }

    public final Fragment MediaBrowserCompat$ItemReceiver(setTitleMarginTop settitlemargintop, ViewStubCompat viewStubCompat, Fragment fragment, setLayoutInflater setlayoutinflater, trimToSize trimtosize) {
        if (this.MediaBrowserCompat$MediaItem == null) {
            Context context = settitlemargintop.IconCompatParcelizer;
            Bundle bundle = this.MediaBrowserCompat$ItemReceiver;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            if (viewStubCompat != null) {
                this.MediaBrowserCompat$MediaItem = viewStubCompat.IconCompatParcelizer(context, this.read, this.MediaBrowserCompat$ItemReceiver);
            } else {
                this.MediaBrowserCompat$MediaItem = Fragment.instantiate(context, this.read, this.MediaBrowserCompat$ItemReceiver);
            }
            Bundle bundle2 = this.ParcelableVolumeInfo;
            if (bundle2 != null) {
                bundle2.setClassLoader(context.getClassLoader());
                this.MediaBrowserCompat$MediaItem.mSavedFragmentState = this.ParcelableVolumeInfo;
            }
            this.MediaBrowserCompat$MediaItem.setIndex(this.MediaMetadataCompat, fragment);
            this.MediaBrowserCompat$MediaItem.mFromLayout = this.MediaDescriptionCompat;
            this.MediaBrowserCompat$MediaItem.mRestored = true;
            this.MediaBrowserCompat$MediaItem.mFragmentId = this.IconCompatParcelizer;
            this.MediaBrowserCompat$MediaItem.mContainerId = this.write;
            this.MediaBrowserCompat$MediaItem.mTag = this.MediaSessionCompat$ResultReceiverWrapper;
            this.MediaBrowserCompat$MediaItem.mRetainInstance = this.MediaBrowserCompat$SearchResultReceiver;
            this.MediaBrowserCompat$MediaItem.mDetached = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$MediaItem.mHidden = this.RatingCompat;
            this.MediaBrowserCompat$MediaItem.mFragmentManager = settitlemargintop.write;
            boolean z = setLayoutResource.IconCompatParcelizer;
        }
        this.MediaBrowserCompat$MediaItem.mChildNonConfig = setlayoutinflater;
        this.MediaBrowserCompat$MediaItem.mViewModelStore = trimtosize;
        return this.MediaBrowserCompat$MediaItem;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeInt(this.MediaMetadataCompat);
        parcel.writeInt(this.MediaDescriptionCompat ? 1 : 0);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeInt(this.write);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver ? 1 : 0);
        parcel.writeInt(this.MediaBrowserCompat$CustomActionResultReceiver ? 1 : 0);
        parcel.writeBundle(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.RatingCompat ? 1 : 0);
        parcel.writeBundle(this.ParcelableVolumeInfo);
    }
}
