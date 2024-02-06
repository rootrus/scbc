package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.CrashlyticsRegistrar */
public final class CrashlyticsRegistrar extends remainingCapacity implements Parcelable {
    public static final write CREATOR = new write((byte) 0);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$SearchResultReceiver;
    private final String read;

    public final int describeContents() {
        return 0;
    }

    public CrashlyticsRegistrar(String str, String str2, String str3, String str4, String str5) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CrashlyticsRegistrar(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "parcel");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.CrashlyticsRegistrar$write */
    public static final class write implements Parcelable.Creator<CrashlyticsRegistrar> {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new CrashlyticsRegistrar(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CrashlyticsRegistrar[i];
        }
    }
}
