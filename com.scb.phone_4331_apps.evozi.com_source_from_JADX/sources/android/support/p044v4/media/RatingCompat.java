package android.support.p044v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() {
        /* renamed from: read */
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: IconCompatParcelizer */
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    private final float MediaBrowserCompat$ItemReceiver;
    private final int write;

    RatingCompat(int i, float f) {
        this.write = i;
        this.MediaBrowserCompat$ItemReceiver = f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.write);
        sb.append(" rating=");
        float f = this.MediaBrowserCompat$ItemReceiver;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        sb.append(str);
        return sb.toString();
    }

    public final int describeContents() {
        return this.write;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.write);
        parcel.writeFloat(this.MediaBrowserCompat$ItemReceiver);
    }
}
