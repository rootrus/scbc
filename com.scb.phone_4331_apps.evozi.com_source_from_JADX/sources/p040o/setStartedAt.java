package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.CrashlyticsReport;

/* renamed from: o.setStartedAt */
public final class setStartedAt extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new setStartedAt$MediaBrowserCompat$CustomActionResultReceiver();
    public String IconCompatParcelizer;
    private String Keep;
    public AutoValue_CrashlyticsReport_Session_Application MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public double MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2959x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public double ParcelableVolumeInfo;
    private double PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public CrashlyticsReport.Session.Event.Device.Builder RatingCompat;
    public String read;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.f2959x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeDouble(this.MediaBrowserCompat$MediaItem);
        this.RatingCompat.writeToParcel(parcel, 0);
        parcel.writeDouble(this.ParcelableVolumeInfo);
        parcel.writeDouble(this.PlaybackStateCompat);
        parcel.writeString(this.Keep);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        this.MediaBrowserCompat$CustomActionResultReceiver.writeToParcel(parcel, 0);
        parcel.writeString(this.MediaDescriptionCompat);
    }

    public setStartedAt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, double d, CrashlyticsReport.Session.Event.Device.Builder builder, double d2, double d3, String str10, String str11, AutoValue_CrashlyticsReport_Session_Application autoValue_CrashlyticsReport_Session_Application, String str12) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        CrashlyticsReport.Session.Event.Device.Builder builder2 = builder;
        String str22 = str10;
        String str23 = str11;
        AutoValue_CrashlyticsReport_Session_Application autoValue_CrashlyticsReport_Session_Application2 = autoValue_CrashlyticsReport_Session_Application;
        onGetStartedClick.write((Object) str13, "accountFromName");
        onGetStartedClick.write((Object) str14, "accountFromNo");
        onGetStartedClick.write((Object) str15, "accountTo");
        onGetStartedClick.write((Object) str16, "ref1_label");
        onGetStartedClick.write((Object) str17, "ref1");
        onGetStartedClick.write((Object) str18, "ref2_label");
        onGetStartedClick.write((Object) str19, "ref2");
        onGetStartedClick.write((Object) str20, "ref3_label");
        onGetStartedClick.write((Object) str21, "ref3");
        onGetStartedClick.write((Object) builder2, "extraDataDisplay");
        onGetStartedClick.write((Object) str22, "feeType");
        onGetStartedClick.write((Object) str23, "transactionToken");
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Application2, "additionalMetaDataDisplay");
        this.MediaBrowserCompat$ItemReceiver = str13;
        this.IconCompatParcelizer = str14;
        this.read = str15;
        this.MediaMetadataCompat = str16;
        this.MediaBrowserCompat$SearchResultReceiver = str17;
        this.MediaSessionCompat$Token = str18;
        this.MediaSessionCompat$QueueItem = str19;
        this.f2959x50fd9e4a = str20;
        this.MediaSessionCompat$ResultReceiverWrapper = str21;
        this.MediaBrowserCompat$MediaItem = d;
        this.RatingCompat = builder2;
        this.ParcelableVolumeInfo = d2;
        this.PlaybackStateCompat = d3;
        this.Keep = str22;
        this.PlaybackStateCompat$CustomAction = str23;
        this.MediaBrowserCompat$CustomActionResultReceiver = autoValue_CrashlyticsReport_Session_Application2;
        this.MediaDescriptionCompat = str12;
    }
}
