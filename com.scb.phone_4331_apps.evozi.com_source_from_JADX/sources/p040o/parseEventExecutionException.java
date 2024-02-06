package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.ForwardingFuture;

/* renamed from: o.parseEventExecutionException */
public final class parseEventExecutionException implements Parcelable {
    public static final Parcelable.Creator<parseEventExecutionException> CREATOR = new Parcelable.Creator<parseEventExecutionException>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new parseEventExecutionException(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new parseEventExecutionException[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private ForwardingFuture.SimpleForwardingFuture f2914x50fd9e4a;
    public String MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public String RatingCompat;
    public double read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public parseEventExecutionException() {
    }

    protected parseEventExecutionException(Parcel parcel) {
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.read = parcel.readDouble();
        this.MediaMetadataCompat = parcel.readByte() != 0;
        this.f2914x50fd9e4a = (ForwardingFuture.SimpleForwardingFuture) parcel.readParcelable(ForwardingFuture.SimpleForwardingFuture.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeDouble(this.read);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeParcelable(this.f2914x50fd9e4a, i);
    }
}
