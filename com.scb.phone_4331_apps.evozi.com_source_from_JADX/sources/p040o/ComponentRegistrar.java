package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ComponentRegistrar */
public final class ComponentRegistrar extends setUuidFromUtf8Bytes implements Parcelable {
    public static final Parcelable.Creator<ComponentRegistrar> CREATOR = new Parcelable.Creator<ComponentRegistrar>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ComponentRegistrar(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ComponentRegistrar[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public ComponentRegistrar() {
    }

    protected ComponentRegistrar(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaDescriptionCompat);
    }

    public static ComponentRegistrar read() {
        return new ComponentRegistrar();
    }

    public final String MediaDescriptionCompat() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final String MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public final String write() {
        return this.MediaDescriptionCompat;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.IconCompatParcelizer = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver(String str) {
        this.write = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes write(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes IconCompatParcelizer(String str) {
        this.MediaDescriptionCompat = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes read(String str) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes MediaMetadataCompat(String str) {
        this.MediaBrowserCompat$MediaItem = str;
        return this;
    }
}
