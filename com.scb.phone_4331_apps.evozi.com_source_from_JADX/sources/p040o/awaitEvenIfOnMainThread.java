package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.race;

/* renamed from: o.awaitEvenIfOnMainThread */
public class awaitEvenIfOnMainThread extends race implements Parcelable {
    public static final Parcelable.Creator<awaitEvenIfOnMainThread> CREATOR = new Parcelable.Creator<awaitEvenIfOnMainThread>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new awaitEvenIfOnMainThread(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new awaitEvenIfOnMainThread[i];
        }
    };
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public int read;

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ awaitEvenIfOnMainThread(IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(iconCompatParcelizer);
    }

    private awaitEvenIfOnMainThread(IconCompatParcelizer iconCompatParcelizer) {
        super((race.write<?>) iconCompatParcelizer);
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.read = iconCompatParcelizer.read;
        this.IconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer;
    }

    protected awaitEvenIfOnMainThread(Parcel parcel) {
        super(parcel);
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readByte() != 0;
        this.read = parcel.readInt();
    }

    public final void write(Parcel parcel, int i) {
        super.write(parcel, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : 0);
        parcel.writeInt(this.read);
    }

    public static IconCompatParcelizer IconCompatParcelizer() {
        return new IconCompatParcelizer((byte) 0);
    }

    /* renamed from: o.awaitEvenIfOnMainThread$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends race.write<IconCompatParcelizer> {
        public boolean IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int read;

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private IconCompatParcelizer() {
            super(CrashlyticsReportJsonTransform$$Lambda$1.ICON);
            this.IconCompatParcelizer = false;
        }

        public final /* synthetic */ race read() {
            return new awaitEvenIfOnMainThread(this, (byte) 0);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItemIconCustomDisplay{componentRightExtraDetails='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", imagePath='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", usePSLfont='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", defaultIcon='");
        sb.append(this.read);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        awaitEvenIfOnMainThread awaitevenifonmainthread = (awaitEvenIfOnMainThread) obj;
        if (this.IconCompatParcelizer != awaitevenifonmainthread.IconCompatParcelizer || this.read != awaitevenifonmainthread.read) {
            return false;
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null ? awaitevenifonmainthread.MediaBrowserCompat$ItemReceiver != null : !str.equals(awaitevenifonmainthread.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = awaitevenifonmainthread.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = super.hashCode();
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (this.IconCompatParcelizer ? 1 : 0)) * 31) + this.read;
    }
}
