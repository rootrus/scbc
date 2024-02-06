package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;

/* renamed from: o.AutoValue_CrashlyticsReport */
public final class AutoValue_CrashlyticsReport {
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public List<String> write;

    /* renamed from: o.AutoValue_CrashlyticsReport$Builder */
    public final class Builder extends AutoValue_CrashlyticsReport_FilesPayload.Builder implements Parcelable {
        public static final C3057x95512694 CREATOR = new C3057x95512694((byte) 0);
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String RatingCompat;
        public String read;

        public Builder() {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Builder(Parcel parcel) {
            super(parcel);
            onGetStartedClick.write((Object) parcel, "parcel");
            this.MediaDescriptionCompat = parcel.readString();
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.RatingCompat = parcel.readString();
            this.read = parcel.readString();
            this.MediaMetadataCompat = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$MediaItem = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            super.writeToParcel(parcel, i);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
        }
    }
}
