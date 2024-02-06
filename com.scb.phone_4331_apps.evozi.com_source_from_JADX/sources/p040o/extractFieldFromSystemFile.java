package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.getStringsFileValue;

/* renamed from: o.extractFieldFromSystemFile */
public class extractFieldFromSystemFile extends getStringsFileValue implements Parcelable {
    public static final Parcelable.Creator<extractFieldFromSystemFile> CREATOR = new Parcelable.Creator<extractFieldFromSystemFile>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new extractFieldFromSystemFile(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new extractFieldFromSystemFile[i];
        }
    };
    public String IconCompatParcelizer;
    public NativeSessionFileProvider MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public int describeContents() {
        return 0;
    }

    protected extractFieldFromSystemFile(write write2) {
        super((getStringsFileValue.write) write2);
        this.IconCompatParcelizer = write2.MediaBrowserCompat$ItemReceiver;
        this.read = write2.read;
        this.MediaBrowserCompat$ItemReceiver = write2.write;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }

    protected extractFieldFromSystemFile(Parcel parcel) {
        super(parcel);
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = (NativeSessionFileProvider) parcel.readParcelable(NativeSessionFileProvider.class.getClassLoader());
    }

    /* renamed from: o.extractFieldFromSystemFile$write */
    public static class write extends getStringsFileValue.write {
        public NativeSessionFileProvider MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;

        /* renamed from: read */
        public extractFieldFromSystemFile MediaBrowserCompat$ItemReceiver() {
            return new extractFieldFromSystemFile(this);
        }
    }
}
