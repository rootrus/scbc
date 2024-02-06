package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.getMaxFrame */
public class getMaxFrame implements Parcelable {
    public static final Parcelable.Creator<getMaxFrame> CREATOR = new Parcelable.Creator<getMaxFrame>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getMaxFrame(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getMaxFrame[i];
        }
    };
    @SerializedName("fontColor")
    public String IconCompatParcelizer;
    @SerializedName("description")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("code")
    public String write;

    public int describeContents() {
        return 0;
    }

    protected getMaxFrame(Parcel parcel) {
        this.write = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }
}
