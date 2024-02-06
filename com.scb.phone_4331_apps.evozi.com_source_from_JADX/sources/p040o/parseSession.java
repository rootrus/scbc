package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.parseSession */
public abstract class parseSession implements Parcelable {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaDescriptionCompat;
    public IGoogleMapDelegate RatingCompat;
    public String read;
    public String write;

    public parseSession() {
    }

    public parseSession(Parcel parcel) {
        IGoogleMapDelegate iGoogleMapDelegate;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            iGoogleMapDelegate = null;
        } else {
            iGoogleMapDelegate = IGoogleMapDelegate.values()[readInt];
        }
        this.RatingCompat = iGoogleMapDelegate;
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        IGoogleMapDelegate iGoogleMapDelegate = this.RatingCompat;
        parcel.writeInt(iGoogleMapDelegate == null ? -1 : iGoogleMapDelegate.ordinal());
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
    }

    public parseSession read(parseSession parsesession) {
        this.MediaDescriptionCompat = parsesession.MediaDescriptionCompat;
        this.write = parsesession.write;
        this.MediaBrowserCompat$CustomActionResultReceiver = parsesession.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = parsesession.read;
        this.IconCompatParcelizer = parsesession.IconCompatParcelizer;
        this.RatingCompat = parsesession.RatingCompat;
        return this;
    }
}
