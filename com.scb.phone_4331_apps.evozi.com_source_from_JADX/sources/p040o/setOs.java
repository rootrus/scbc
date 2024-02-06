package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.setOs */
public final class setOs extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    private String AlertController$RecycleListView;
    public String IconCompatParcelizer;
    private List<CrashlyticsReport.Session.OperatingSystem.Builder> Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public CrashlyticsReport.Session.Event.Device.Builder MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2955x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    private String ParcelableVolumeInfo;
    private String PlaybackStateCompat;
    private String PlaybackStateCompat$CustomAction;
    public double RatingCompat;
    public String read;
    private String setHasDecor;

    /* renamed from: o.setOs$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            onGetStartedClick.write((Object) parcel2, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            double readDouble = parcel.readDouble();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((CrashlyticsReport.Session.OperatingSystem.Builder) parcel2.readParcelable(setOs.class.getClassLoader()));
                readInt--;
                readString11 = readString11;
            }
            return new setOs(readString, readString2, readString3, readDouble, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, arrayList, (CrashlyticsReport.Session.Event.Device.Builder) CrashlyticsReport.Session.Event.Device.Builder.CREATOR.createFromParcel(parcel2));
        }

        public final Object[] newArray(int i) {
            return new setOs[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeDouble(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.f2955x50fd9e4a);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.AlertController$RecycleListView);
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list = this.Keep;
        parcel.writeInt(list.size());
        for (CrashlyticsReport.Session.OperatingSystem.Builder writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        this.MediaBrowserCompat$SearchResultReceiver.writeToParcel(parcel, 0);
    }

    public setOs(String str, String str2, String str3, double d, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, List<CrashlyticsReport.Session.OperatingSystem.Builder> list, CrashlyticsReport.Session.Event.Device.Builder builder) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        String str20 = str4;
        String str21 = str5;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        String str25 = str9;
        String str26 = str12;
        String str27 = str15;
        String str28 = str16;
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list2 = list;
        CrashlyticsReport.Session.Event.Device.Builder builder2 = builder;
        onGetStartedClick.write((Object) str17, "partnerId");
        onGetStartedClick.write((Object) str18, "partnerName");
        onGetStartedClick.write((Object) str19, "partnerTransactionId");
        onGetStartedClick.write((Object) str20, "amountDisplay");
        onGetStartedClick.write((Object) str21, "accountFromName");
        onGetStartedClick.write((Object) str22, "accountFrom");
        onGetStartedClick.write((Object) str23, "accountTo");
        onGetStartedClick.write((Object) str24, "accountToDisplay");
        onGetStartedClick.write((Object) str25, "ref1_label");
        onGetStartedClick.write((Object) str26, "ref1");
        onGetStartedClick.write((Object) str27, "partnerType");
        onGetStartedClick.write((Object) str28, "partnerSubType");
        onGetStartedClick.write((Object) list2, "paymentInfoList");
        onGetStartedClick.write((Object) builder2, "extraDataDisplay");
        this.ParcelableVolumeInfo = str17;
        this.PlaybackStateCompat$CustomAction = str18;
        this.PlaybackStateCompat = str19;
        this.RatingCompat = d;
        this.MediaBrowserCompat$MediaItem = str20;
        this.MediaBrowserCompat$ItemReceiver = str21;
        this.read = str22;
        this.IconCompatParcelizer = str23;
        this.MediaBrowserCompat$CustomActionResultReceiver = str24;
        this.MediaDescriptionCompat = str25;
        this.MediaSessionCompat$ResultReceiverWrapper = str10;
        this.MediaSessionCompat$Token = str11;
        this.MediaMetadataCompat = str26;
        this.MediaSessionCompat$QueueItem = str13;
        this.f2955x50fd9e4a = str14;
        this.setHasDecor = str27;
        this.AlertController$RecycleListView = str28;
        this.Keep = list2;
        this.MediaBrowserCompat$SearchResultReceiver = builder2;
    }
}
