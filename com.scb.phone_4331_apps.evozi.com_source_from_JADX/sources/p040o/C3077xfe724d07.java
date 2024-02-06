package p040o;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage */
public final class C3077xfe724d07 extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
    public static final Parcelable.Creator<C3077xfe724d07> CREATOR = new Parcelable.Creator<C3077xfe724d07>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C3077xfe724d07(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3077xfe724d07[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ C3077xfe724d07(write write2, byte b) {
        this(write2);
    }

    private C3077xfe724d07(write write2) {
        read(false);
        this.f2675x50fd9e4a = write2.MediaBrowserCompat$ItemReceiver;
        this.write = write2.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = write2.write;
        this.IconCompatParcelizer = write2.read;
        this.MediaBrowserCompat$ItemReceiver = write2.IconCompatParcelizer;
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$Builder */
    public final class Builder extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Builder(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Builder[i];
            }
        };
        public Bitmap IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public getOverflowCount MediaBrowserCompat$ItemReceiver;
        public List<getOverflowCount> read;

        public final int describeContents() {
            return 0;
        }

        public Builder() {
        }

        public static Builder MediaBrowserCompat$ItemReceiver() {
            return new Builder();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeTypedList(this.read);
            parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
            parcel.writeParcelable(this.IconCompatParcelizer, i);
        }

        protected Builder(Parcel parcel) {
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.read = parcel.createTypedArrayList(getOverflowCount.CREATOR);
            this.MediaBrowserCompat$ItemReceiver = (getOverflowCount) parcel.readParcelable(getClass().getClassLoader());
            this.IconCompatParcelizer = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        }
    }

    public static write MediaBrowserCompat$CustomActionResultReceiver() {
        return new write((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3077xfe724d07 autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage = (C3077xfe724d07) obj;
        String str = this.write;
        if (str == null ? autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.write != null : !str.equals(autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.write)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.read != null : !str2.equals(autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.read)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        if (str3 == null ? autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.IconCompatParcelizer != null : !str3.equals(autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.IconCompatParcelizer)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        String str5 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
        parcel.writeInt(this.f2675x50fd9e4a);
    }

    public C3077xfe724d07() {
    }

    protected C3077xfe724d07(Parcel parcel) {
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readByte() != 0;
        this.f2675x50fd9e4a = parcel.readInt();
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$write */
    public static final class write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public int MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;

        /* synthetic */ write(byte b) {
            this();
        }

        private write() {
        }
    }
}
