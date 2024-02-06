package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.enablePublishingAndFlushPending */
public final class enablePublishingAndFlushPending implements Parcelable, Comparable<enablePublishingAndFlushPending> {
    public static final Parcelable.Creator<enablePublishingAndFlushPending> CREATOR = new Parcelable.Creator<enablePublishingAndFlushPending>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new enablePublishingAndFlushPending(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new enablePublishingAndFlushPending[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        enablePublishingAndFlushPending enablepublishingandflushpending = (enablePublishingAndFlushPending) obj;
        if (this.write.equals(enablepublishingandflushpending.write)) {
            return 0;
        }
        if (this.write.equals("NCB_CONSENT")) {
            return -1;
        }
        if (!this.write.equals("MODEL_CONSENT") || !enablepublishingandflushpending.write.equals("CROSS_SELL_CONSENT")) {
            return 1;
        }
        return -1;
    }

    public enablePublishingAndFlushPending(String str, String str2, String str3, String str4, String str5) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
    }

    protected enablePublishingAndFlushPending(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }
}
