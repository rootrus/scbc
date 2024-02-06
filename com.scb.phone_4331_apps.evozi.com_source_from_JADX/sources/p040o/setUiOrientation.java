package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.setUiOrientation */
public final class setUiOrientation extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
    public static final Parcelable.Creator<setUiOrientation> CREATOR = new Parcelable.Creator<setUiOrientation>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setUiOrientation(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setUiOrientation[i];
        }
    };
    public String read;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ setUiOrientation(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private setUiOrientation(IconCompatParcelizer iconCompatParcelizer) {
        read(false);
        this.f2675x50fd9e4a = iconCompatParcelizer.read;
        this.read = iconCompatParcelizer.write;
    }

    public static IconCompatParcelizer IconCompatParcelizer() {
        return new IconCompatParcelizer((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.read;
        String str2 = ((setUiOrientation) obj).read;
        if (str != null) {
            if (!str.equals(str2)) {
                return true;
            }
        } else if (str2 != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeInt(this.f2675x50fd9e4a);
    }

    protected setUiOrientation(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.f2675x50fd9e4a = parcel.readInt();
    }

    /* renamed from: o.setUiOrientation$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public int read;
        public String write;

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
        }
    }
}
