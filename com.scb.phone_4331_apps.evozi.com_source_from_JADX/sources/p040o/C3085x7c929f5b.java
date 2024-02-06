package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal */
public final class C3085x7c929f5b implements Parcelable {
    public static final read CREATOR = new read((byte) 0);
    public final List<setCausedBy> MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3085x7c929f5b)) {
            return false;
        }
        C3085x7c929f5b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal = (C3085x7c929f5b) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.MediaBrowserCompat$CustomActionResultReceiver) && this.write == autoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.write;
    }

    public final int hashCode() {
        List<setCausedBy> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode = list != null ? list.hashCode() : 0;
        boolean z = this.write;
        if (z) {
            z = true;
        }
        return (hashCode * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SearchCountryDisplay(countryDisplayList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isTh=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$Builder */
    public final class Builder implements Parcelable {
        public static final C3087xdb99d43f CREATOR = new C3087xdb99d43f((byte) 0);
        public final String AlertController$RecycleListView;
        public final String IconCompatParcelizer;
        public final String Keep;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final String f2676x50fd9e4a;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String MediaSessionCompat$QueueItem;
        public final String MediaSessionCompat$ResultReceiverWrapper;
        public final String MediaSessionCompat$Token;
        public final String ParcelableVolumeInfo;
        public final String PlaybackStateCompat$CustomAction;
        public final String RatingCompat;
        public final String read;
        public final String setHasDecor;
        public final String write;

        public Builder() {
            this((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor, (Object) builder.setHasDecor) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) builder.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) builder.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) builder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.Keep, (Object) builder.Keep) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AlertController$RecycleListView, (Object) builder.AlertController$RecycleListView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) builder.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) builder.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) builder.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) builder.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) builder.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) builder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) builder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat$CustomAction, (Object) builder.PlaybackStateCompat$CustomAction) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2676x50fd9e4a, (Object) builder.f2676x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) builder.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) builder.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) builder.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) builder.ParcelableVolumeInfo);
        }

        public final int hashCode() {
            String str = this.setHasDecor;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.Keep;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.AlertController$RecycleListView;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaSessionCompat$QueueItem;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode9 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.RatingCompat;
            int hashCode10 = str10 != null ? str10.hashCode() : 0;
            String str11 = this.MediaDescriptionCompat;
            int hashCode11 = str11 != null ? str11.hashCode() : 0;
            String str12 = this.write;
            int hashCode12 = str12 != null ? str12.hashCode() : 0;
            String str13 = this.IconCompatParcelizer;
            int hashCode13 = str13 != null ? str13.hashCode() : 0;
            String str14 = this.PlaybackStateCompat$CustomAction;
            int hashCode14 = str14 != null ? str14.hashCode() : 0;
            String str15 = this.f2676x50fd9e4a;
            int hashCode15 = str15 != null ? str15.hashCode() : 0;
            String str16 = this.MediaMetadataCompat;
            int hashCode16 = str16 != null ? str16.hashCode() : 0;
            String str17 = this.MediaSessionCompat$Token;
            int hashCode17 = str17 != null ? str17.hashCode() : 0;
            String str18 = this.MediaBrowserCompat$MediaItem;
            int hashCode18 = str18 != null ? str18.hashCode() : 0;
            String str19 = this.ParcelableVolumeInfo;
            return (((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + (str19 != null ? str19.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AdditionalInfoDisplay(receivingBank=");
            sb.append(this.setHasDecor);
            sb.append(", bankCode=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", accountToType=");
            sb.append(this.read);
            sb.append(", accountToNumber=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", swiftCode=");
            sb.append(this.Keep);
            sb.append(", title=");
            sb.append(this.AlertController$RecycleListView);
            sb.append(", firstName=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", lastName=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(", nationality=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(", identificationType=");
            sb.append(this.RatingCompat);
            sb.append(", identificationNumber=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", address=");
            sb.append(this.write);
            sb.append(", city=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", state=");
            sb.append(this.PlaybackStateCompat$CustomAction);
            sb.append(", postCode=");
            sb.append(this.f2676x50fd9e4a);
            sb.append(", contactCountryCode=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", phoneNumber=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", email=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", purpose=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(")");
            return sb.toString();
        }

        public Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
            this.setHasDecor = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.read = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.Keep = str5;
            this.AlertController$RecycleListView = str6;
            this.MediaBrowserCompat$SearchResultReceiver = str7;
            this.MediaSessionCompat$QueueItem = str8;
            this.MediaSessionCompat$ResultReceiverWrapper = str9;
            this.RatingCompat = str10;
            this.MediaDescriptionCompat = str11;
            this.write = str12;
            this.IconCompatParcelizer = str13;
            this.PlaybackStateCompat$CustomAction = str14;
            this.f2676x50fd9e4a = str15;
            this.MediaMetadataCompat = str16;
            this.MediaSessionCompat$Token = str17;
            this.MediaBrowserCompat$MediaItem = str18;
            this.ParcelableVolumeInfo = str19;
        }

        private /* synthetic */ Builder(byte b) {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.setHasDecor);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.Keep);
            parcel.writeString(this.AlertController$RecycleListView);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.MediaSessionCompat$QueueItem);
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.write);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.PlaybackStateCompat$CustomAction);
            parcel.writeString(this.f2676x50fd9e4a);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.ParcelableVolumeInfo);
        }
    }

    public C3085x7c929f5b(List<setCausedBy> list, boolean z) {
        onGetStartedClick.write((Object) list, "countryDisplayList");
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.write = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3085x7c929f5b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            o.setCausedBy$MediaBrowserCompat$CustomActionResultReceiver r0 = p040o.setCausedBy.CREATOR
            android.os.Parcelable$Creator r0 = (android.os.Parcelable.Creator) r0
            java.util.ArrayList r0 = r3.createTypedArrayList(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0015
            o.HmlNationalIdActivity r0 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r0 = (java.util.List) r0
        L_0x0015:
            byte r3 = r3.readByte()
            r1 = 0
            if (r3 == 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C3085x7c929f5b.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeTypedList(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeByte(this.write ? (byte) 1 : 0);
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$read */
    public static final class read implements Parcelable.Creator<C3085x7c929f5b> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new C3085x7c929f5b(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C3085x7c929f5b[i];
        }
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$1 */
    public final class C30861 {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$SearchResultReceiver;
        private final String MediaDescriptionCompat;
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30861)) {
                return false;
            }
            C30861 r3 = (C30861) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) r3.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) r3.MediaBrowserCompat$SearchResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.IconCompatParcelizer;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaDescriptionCompat;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.write;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str7 != null) {
                i = str7.hashCode();
            }
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChannelDisplay(countryName=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", channelType=");
            sb.append(this.read);
            sb.append(", agentType=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", currencyCode=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", decimalAmountFlag=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", logoImageURL=");
            sb.append(this.write);
            sb.append(", transferMethod=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public C30861(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            onGetStartedClick.write((Object) str, "countryName");
            onGetStartedClick.write((Object) str2, "channelType");
            onGetStartedClick.write((Object) str3, "agentType");
            onGetStartedClick.write((Object) str4, "currencyCode");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.read = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.IconCompatParcelizer = str4;
            this.MediaDescriptionCompat = str5;
            this.write = str6;
            this.MediaBrowserCompat$SearchResultReceiver = str7;
        }

        public /* synthetic */ C30861(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, "", "", "");
        }
    }
}
