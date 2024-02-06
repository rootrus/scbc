package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution */
public class AutoValue_CrashlyticsReport_Session_Event_Application_Execution implements Parcelable {
    public static final Parcelable.Creator<AutoValue_CrashlyticsReport_Session_Event_Application_Execution> CREATOR = new Parcelable.Creator<AutoValue_CrashlyticsReport_Session_Event_Application_Execution>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    public int describeContents() {
        return 0;
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution(String str, String str2, String str3, String str4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.IconCompatParcelizer = str4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution$Builder */
    public abstract class Builder implements Parcelable {

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public int f2675x50fd9e4a;
        public boolean MediaSessionCompat$Token = false;

        public final int read() {
            return this.f2675x50fd9e4a;
        }

        public final boolean MediaDescriptionCompat() {
            return this.MediaSessionCompat$Token;
        }

        public final void read(boolean z) {
            this.MediaSessionCompat$Token = z;
        }
    }

    protected AutoValue_CrashlyticsReport_Session_Event_Application_Execution(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
    }
}
