package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.populateEventDeviceData */
public final class populateEventDeviceData implements Parcelable {
    public static final Parcelable.Creator<populateEventDeviceData> CREATOR = new Parcelable.Creator<populateEventDeviceData>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new populateEventDeviceData(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new populateEventDeviceData[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaDescriptionCompat;
    public String read;
    public List<read> write;

    public final int describeContents() {
        return 0;
    }

    public populateEventDeviceData(String str, String str2, String str3, List<read> list, String str4) {
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaDescriptionCompat = str3;
        this.write = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }

    /* renamed from: o.populateEventDeviceData$read */
    public static class read implements Parcelable {
        public static final Parcelable.Creator<read> CREATOR = new Parcelable.Creator<read>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new read(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new read[i];
            }
        };
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;

        public final int describeContents() {
            return 0;
        }

        public read(String str, String str2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        }

        protected read(Parcel parcel) {
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeTypedList(this.write);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    protected populateEventDeviceData(Parcel parcel) {
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.write = parcel.createTypedArrayList(read.CREATOR);
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
    }
}
