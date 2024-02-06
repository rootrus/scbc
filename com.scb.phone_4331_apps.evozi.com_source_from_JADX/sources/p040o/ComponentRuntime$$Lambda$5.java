package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.ComponentRuntime$$Lambda$5 */
public final class ComponentRuntime$$Lambda$5 extends setUuidFromUtf8Bytes implements Parcelable {
    public static final Parcelable.Creator<ComponentRuntime$$Lambda$5> CREATOR = new Parcelable.Creator<ComponentRuntime$$Lambda$5>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ComponentRuntime$$Lambda$5(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ComponentRuntime$$Lambda$5[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;
    public String read;
    public List<String> write;

    public final int describeContents() {
        return 0;
    }

    public ComponentRuntime$$Lambda$5() {
    }

    protected ComponentRuntime$$Lambda$5(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.read = parcel.readString();
        this.write = parcel.createStringArrayList();
        this.IconCompatParcelizer = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeStringList(this.write);
        parcel.writeString(this.IconCompatParcelizer);
    }

    public static ComponentRuntime$$Lambda$5 read() {
        return new ComponentRuntime$$Lambda$5();
    }

    public final String MediaDescriptionCompat() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final String MediaBrowserCompat$MediaItem() {
        return this.MediaDescriptionCompat;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes write(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes read(String str) {
        this.MediaDescriptionCompat = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ setUuidFromUtf8Bytes MediaMetadataCompat(String str) {
        this.MediaBrowserCompat$MediaItem = str;
        return this;
    }
}
