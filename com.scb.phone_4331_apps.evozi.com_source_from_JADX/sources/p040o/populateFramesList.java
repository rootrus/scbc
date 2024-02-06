package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.populateFramesList */
public final class populateFramesList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new populateFramesList$MediaBrowserCompat$ItemReceiver();
    public populateSignalData IconCompatParcelizer;
    public populateSignalData MediaBrowserCompat$CustomActionResultReceiver;
    public populateSignalData MediaBrowserCompat$ItemReceiver;
    public populateSessionApplicationData read;
    public populateSignalData write;

    public populateFramesList() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        populateSignalData populatesignaldata = this.write;
        if (populatesignaldata != null) {
            parcel.writeInt(1);
            populatesignaldata.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        populateSignalData populatesignaldata2 = this.MediaBrowserCompat$ItemReceiver;
        if (populatesignaldata2 != null) {
            parcel.writeInt(1);
            populatesignaldata2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        populateSessionApplicationData populatesessionapplicationdata = this.read;
        if (populatesessionapplicationdata != null) {
            parcel.writeInt(1);
            populatesessionapplicationdata.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        populateSignalData populatesignaldata3 = this.IconCompatParcelizer;
        if (populatesignaldata3 != null) {
            parcel.writeInt(1);
            populatesignaldata3.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        populateSignalData populatesignaldata4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (populatesignaldata4 != null) {
            parcel.writeInt(1);
            populatesignaldata4.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public populateFramesList(populateSignalData populatesignaldata, populateSignalData populatesignaldata2, populateSessionApplicationData populatesessionapplicationdata, populateSignalData populatesignaldata3, populateSignalData populatesignaldata4) {
        this.write = populatesignaldata;
        this.MediaBrowserCompat$ItemReceiver = populatesignaldata2;
        this.read = populatesessionapplicationdata;
        this.IconCompatParcelizer = populatesignaldata3;
        this.MediaBrowserCompat$CustomActionResultReceiver = populatesignaldata4;
    }

    private /* synthetic */ populateFramesList(byte b) {
        this((populateSignalData) null, (populateSignalData) null, (populateSessionApplicationData) null, (populateSignalData) null, (populateSignalData) null);
    }
}
