package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.Mask;

/* renamed from: o.getLogAsString */
public final class getLogAsString extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getLogAsString> CREATOR = new read();
    private String MediaBrowserCompat$ItemReceiver;

    public final int describeContents() {
        return 0;
    }

    public getLogAsString(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public getLogAsString(Parcel parcel) {
        this(parcel.readString());
        onGetStartedClick.write((Object) parcel, "source");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.getLogAsString$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements findFragmentByWho {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        }

        public final Object IconCompatParcelizer(Object obj) {
            String str;
            Mask.MaskMode maskMode = (Mask.MaskMode) obj;
            addGeofence addgeofence = new addGeofence();
            String str2 = null;
            if (maskMode.write != null) {
                str = maskMode.write.IconCompatParcelizer();
            } else {
                str = null;
            }
            addgeofence.MediaBrowserCompat$ItemReceiver = str;
            if (maskMode.write != null) {
                str2 = maskMode.write.write();
            }
            addgeofence.read = str2;
            addgeofence.write = maskMode.read;
            addgeofence.IconCompatParcelizer = maskMode.MediaBrowserCompat$ItemReceiver;
            return addgeofence;
        }
    }

    /* renamed from: o.getLogAsString$read */
    public static final class read implements Parcelable.Creator<getLogAsString> {
        read() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new getLogAsString(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getLogAsString[i];
        }
    }
}
