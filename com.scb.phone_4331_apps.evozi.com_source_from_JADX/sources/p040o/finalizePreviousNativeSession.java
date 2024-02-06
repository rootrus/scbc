package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.finalizePreviousNativeSession */
public final class finalizePreviousNativeSession implements Parcelable {
    public static final Parcelable.Creator<finalizePreviousNativeSession> CREATOR = new Parcelable.Creator<finalizePreviousNativeSession>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new finalizePreviousNativeSession(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new finalizePreviousNativeSession[i];
        }
    };
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public double MediaBrowserCompat$ItemReceiver;
    public double MediaBrowserCompat$MediaItem;
    public double RatingCompat;
    public double read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public finalizePreviousNativeSession(boolean z, String str, String str2, double d, double d2, double d3, double d4) {
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = d;
        this.RatingCompat = d2;
        this.MediaBrowserCompat$MediaItem = d3;
        this.read = d4;
    }

    protected finalizePreviousNativeSession(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readByte() != 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readDouble();
        this.RatingCompat = parcel.readDouble();
        this.MediaBrowserCompat$MediaItem = parcel.readDouble();
        this.read = parcel.readDouble();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof finalizePreviousNativeSession)) {
            return false;
        }
        finalizePreviousNativeSession finalizepreviousnativesession = (finalizePreviousNativeSession) obj;
        if (this.IconCompatParcelizer != finalizepreviousnativesession.IconCompatParcelizer || Double.compare(finalizepreviousnativesession.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver) != 0 || Double.compare(finalizepreviousnativesession.RatingCompat, this.RatingCompat) != 0 || Double.compare(finalizepreviousnativesession.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$MediaItem) != 0 || Double.compare(finalizepreviousnativesession.read, this.read) != 0) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? finalizepreviousnativesession.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(finalizepreviousnativesession.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.write;
        if (str2 != null) {
            return str2.equals(finalizepreviousnativesession.write);
        }
        if (finalizepreviousnativesession.write != null) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeDouble(this.RatingCompat);
        parcel.writeDouble(this.MediaBrowserCompat$MediaItem);
        parcel.writeDouble(this.read);
    }

    public final int hashCode() {
        int i;
        boolean z = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.write;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        long doubleToLongBits2 = Double.doubleToLongBits(this.RatingCompat);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
        long doubleToLongBits4 = Double.doubleToLongBits(this.read);
        return ((((((((((((z ? 1 : 0) * true) + i) * 31) + i2) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + i3) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }
}
