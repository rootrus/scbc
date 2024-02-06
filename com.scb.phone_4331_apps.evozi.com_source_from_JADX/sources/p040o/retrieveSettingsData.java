package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.retrieveSettingsData */
public final class retrieveSettingsData extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<retrieveSettingsData> CREATOR = new Parcelable.Creator<retrieveSettingsData>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new retrieveSettingsData(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new retrieveSettingsData[i];
        }
    };
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public AutoValue_CrashlyticsReport_CustomAttribute MediaDescriptionCompat;
    private String RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ retrieveSettingsData(C5240x2a802996 retrievesettingsdata_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(retrievesettingsdata_mediabrowsercompat_customactionresultreceiver);
    }

    private retrieveSettingsData(C5240x2a802996 retrievesettingsdata_mediabrowsercompat_customactionresultreceiver) {
        this.read = retrievesettingsdata_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = retrievesettingsdata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        this.RatingCompat = retrievesettingsdata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = retrievesettingsdata_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaDescriptionCompat = retrievesettingsdata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
        this.IconCompatParcelizer = retrievesettingsdata_mediabrowsercompat_customactionresultreceiver.write;
    }

    protected retrieveSettingsData(Parcel parcel) {
        this.read = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaDescriptionCompat = (AutoValue_CrashlyticsReport_CustomAttribute) parcel.readParcelable(AutoValue_CrashlyticsReport_CustomAttribute.class.getClassLoader());
        this.IconCompatParcelizer = parcel.readString();
    }

    public static C5240x2a802996 MediaBrowserCompat$ItemReceiver() {
        return new C5240x2a802996((byte) 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeParcelable(this.MediaDescriptionCompat, i);
        parcel.writeString(this.IconCompatParcelizer);
    }
}
