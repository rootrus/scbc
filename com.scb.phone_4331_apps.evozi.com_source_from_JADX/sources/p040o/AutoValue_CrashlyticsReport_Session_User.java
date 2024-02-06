package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.scb.phone.R;
import p040o.CrashlyticsReport;
import p040o.ForwardingListenableFuture;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_User */
public final class AutoValue_CrashlyticsReport_Session_User extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<AutoValue_CrashlyticsReport_Session_User> CREATOR = new Parcelable.Creator<AutoValue_CrashlyticsReport_Session_User>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_CrashlyticsReport_Session_User(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_CrashlyticsReport_Session_User[i];
        }
    };
    public String AlertController$RecycleListView;
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2682x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public CrashlyticsReport.FilesPayload PlaybackStateCompat = CrashlyticsReport.FilesPayload.RECEIVED;
    public withNdkPayload PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;
    public String setHasDecor;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_User$Builder */
    public final class Builder extends ForwardingListenableFuture.SimpleForwardingListenableFuture implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Builder(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Builder[i];
            }
        };
        public int IconCompatParcelizer;
        public String RatingCompat;
        public String read;

        public final int describeContents() {
            return 0;
        }

        public static Builder read(int i, String str) {
            return new Builder(R.layout.f91502131494377, str);
        }

        private Builder(int i, String str) {
            super(i, str);
        }

        protected Builder(Parcel parcel) {
            super(parcel.readInt(), parcel.readString());
            this.read = parcel.readString();
            this.RatingCompat = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.read);
            parcel.writeString(this.RatingCompat);
        }
    }

    public AutoValue_CrashlyticsReport_Session_User() {
    }

    protected AutoValue_CrashlyticsReport_Session_User(Parcel parcel) {
        this.RatingCompat = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.PlaybackStateCompat$CustomAction = (withNdkPayload) parcel.readParcelable(withNdkPayload.class.getClassLoader());
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
        this.PlaybackStateCompat = (CrashlyticsReport.FilesPayload) parcel.readParcelable(CrashlyticsReport.FilesPayload.class.getClassLoader());
        this.f2682x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeParcelable(this.PlaybackStateCompat$CustomAction, i);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeParcelable(this.PlaybackStateCompat, i);
        parcel.writeString(this.f2682x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
    }

    public static AutoValue_CrashlyticsReport_Session_User MediaBrowserCompat$CustomActionResultReceiver() {
        return new AutoValue_CrashlyticsReport_Session_User();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User = (AutoValue_CrashlyticsReport_Session_User) obj;
        String str = this.RatingCompat;
        if (str == null ? autoValue_CrashlyticsReport_Session_User.RatingCompat != null : !str.equals(autoValue_CrashlyticsReport_Session_User.RatingCompat)) {
            return false;
        }
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null ? autoValue_CrashlyticsReport_Session_User.MediaDescriptionCompat != null : !str2.equals(autoValue_CrashlyticsReport_Session_User.MediaDescriptionCompat)) {
            return false;
        }
        String str3 = this.ParcelableVolumeInfo;
        if (str3 == null ? autoValue_CrashlyticsReport_Session_User.ParcelableVolumeInfo != null : !str3.equals(autoValue_CrashlyticsReport_Session_User.ParcelableVolumeInfo)) {
            return false;
        }
        String str4 = this.MediaSessionCompat$Token;
        if (str4 == null ? autoValue_CrashlyticsReport_Session_User.MediaSessionCompat$Token != null : !str4.equals(autoValue_CrashlyticsReport_Session_User.MediaSessionCompat$Token)) {
            return false;
        }
        String str5 = this.IconCompatParcelizer;
        if (str5 == null ? autoValue_CrashlyticsReport_Session_User.IconCompatParcelizer != null : !str5.equals(autoValue_CrashlyticsReport_Session_User.IconCompatParcelizer)) {
            return false;
        }
        String str6 = this.AlertController$RecycleListView;
        if (str6 == null ? autoValue_CrashlyticsReport_Session_User.AlertController$RecycleListView != null : !str6.equals(autoValue_CrashlyticsReport_Session_User.AlertController$RecycleListView)) {
            return false;
        }
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 == null ? autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$CustomActionResultReceiver != null : !str7.equals(autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        withNdkPayload withndkpayload = this.PlaybackStateCompat$CustomAction;
        if (withndkpayload == null ? autoValue_CrashlyticsReport_Session_User.PlaybackStateCompat$CustomAction != null : !withndkpayload.equals(autoValue_CrashlyticsReport_Session_User.PlaybackStateCompat$CustomAction)) {
            return false;
        }
        String str8 = this.MediaMetadataCompat;
        if (str8 == null ? autoValue_CrashlyticsReport_Session_User.MediaMetadataCompat != null : !str8.equals(autoValue_CrashlyticsReport_Session_User.MediaMetadataCompat)) {
            return false;
        }
        String str9 = this.MediaBrowserCompat$ItemReceiver;
        if (str9 == null ? autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$ItemReceiver != null : !str9.equals(autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str10 = this.read;
        if (str10 == null ? autoValue_CrashlyticsReport_Session_User.read != null : !str10.equals(autoValue_CrashlyticsReport_Session_User.read)) {
            return false;
        }
        if (this.PlaybackStateCompat != autoValue_CrashlyticsReport_Session_User.PlaybackStateCompat) {
            return false;
        }
        String str11 = this.f2682x50fd9e4a;
        if (str11 == null ? autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a != null : !str11.equals(autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a)) {
            return false;
        }
        String str12 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str12 == null ? autoValue_CrashlyticsReport_Session_User.MediaSessionCompat$ResultReceiverWrapper != null : !str12.equals(autoValue_CrashlyticsReport_Session_User.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str13 = this.setHasDecor;
        if (str13 == null ? autoValue_CrashlyticsReport_Session_User.setHasDecor != null : !str13.equals(autoValue_CrashlyticsReport_Session_User.setHasDecor)) {
            return false;
        }
        String str14 = this.MediaSessionCompat$QueueItem;
        if (str14 == null ? autoValue_CrashlyticsReport_Session_User.MediaSessionCompat$QueueItem != null : !str14.equals(autoValue_CrashlyticsReport_Session_User.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str15 = this.MediaBrowserCompat$MediaItem;
        String str16 = autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$MediaItem;
        if (str15 != null) {
            return str15.equals(str16);
        }
        if (str16 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.ParcelableVolumeInfo;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$Token;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.AlertController$RecycleListView;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        withNdkPayload withndkpayload = this.PlaybackStateCompat$CustomAction;
        int hashCode8 = withndkpayload != null ? withndkpayload.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.read;
        int hashCode11 = str10 != null ? str10.hashCode() : 0;
        CrashlyticsReport.FilesPayload filesPayload = this.PlaybackStateCompat;
        int hashCode12 = filesPayload != null ? filesPayload.hashCode() : 0;
        String str11 = this.f2682x50fd9e4a;
        int hashCode13 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode14 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.setHasDecor;
        int hashCode15 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.MediaSessionCompat$QueueItem;
        int hashCode16 = str14 != null ? str14.hashCode() : 0;
        String str15 = this.MediaBrowserCompat$MediaItem;
        return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + (str15 != null ? str15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GiftDisplay{giftIconUrl='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", giftName='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", giftSenderReceiver='");
        sb.append(this.ParcelableVolumeInfo);
        sb.append('\'');
        sb.append(", giftRecipientPreview='");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('\'');
        sb.append(", giftDestination='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", transactionDateTime='");
        sb.append(this.AlertController$RecycleListView);
        sb.append('\'');
        sb.append(", giftAmount='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", giftStatus=");
        sb.append(this.PlaybackStateCompat$CustomAction);
        sb.append(", giftPreAnimation='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", giftAnimation='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", giftAnimationAfterAction='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", giftTransType=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", giftSelectionType='");
        sb.append(this.f2682x50fd9e4a);
        sb.append('\'');
        sb.append(", giftSenderMsg='");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append('\'');
        sb.append(", giftTransId='");
        sb.append(this.setHasDecor);
        sb.append('\'');
        sb.append(", giftPresentRedeemUrl='");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append('\'');
        sb.append(", giftId='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
