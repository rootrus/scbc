package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread */
public final class C3088x7e3e3ebd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public final String IconCompatParcelizer;
    public final CharSequence MediaBrowserCompat$CustomActionResultReceiver;
    public final CharSequence MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2677x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final double MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final int MediaSessionCompat$ResultReceiverWrapper;
    public final setAddress MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    public final boolean RatingCompat;
    public final String read;
    public final boolean write;

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            onGetStartedClick.write((Object) parcel2, "in");
            return new C3088x7e3e3ebd(parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? (setAddress) setAddress.CREATOR.createFromParcel(parcel2) : null, parcel.readInt(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new C3088x7e3e3ebd[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3088x7e3e3ebd)) {
            return false;
        }
        C3088x7e3e3ebd autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread = (C3088x7e3e3ebd) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.MediaMetadataCompat, autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaMetadataCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2677x50fd9e4a, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.f2677x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.ParcelableVolumeInfo) && this.write == autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaSessionCompat$Token) && this.MediaSessionCompat$ResultReceiverWrapper == autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.MediaSessionCompat$ResultReceiverWrapper && this.RatingCompat == autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.RatingCompat;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        CharSequence charSequence = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = charSequence != null ? charSequence.hashCode() : 0;
        CharSequence charSequence2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = charSequence2 != null ? charSequence2.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaMetadataCompat);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode7 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.f2677x50fd9e4a;
        int hashCode8 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaSessionCompat$QueueItem;
        int hashCode9 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.ParcelableVolumeInfo;
        int hashCode10 = str8 != null ? str8.hashCode() : 0;
        boolean z = this.write;
        if (z) {
            z = true;
        }
        setAddress setaddress = this.MediaSessionCompat$Token;
        if (setaddress != null) {
            i = setaddress.hashCode();
        }
        int i3 = this.MediaSessionCompat$ResultReceiverWrapper;
        boolean z2 = this.RatingCompat;
        if (z2) {
            z2 = true;
        }
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (z ? 1 : 0)) * 31) + i) * 31) + i3) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceAmountFormDisplay(countryName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", flagImage=");
        sb.append(this.read);
        sb.append(", amountFromTitle=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", amountToTitle=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fxRateValue=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", fxRateMessage=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", fxRateDetailDescription=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", limitPerTransaction=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", remainingAmountDailyMessage=");
        sb.append(this.f2677x50fd9e4a);
        sb.append(", remainingAmountMonthlyMessage=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", remainingTimesMonthlyMessage=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", canEditCountry=");
        sb.append(this.write);
        sb.append(", purpose=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", transactionLimit=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", isPayNow=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
        TextUtils.writeToParcel(this.MediaBrowserCompat$ItemReceiver, parcel, 0);
        TextUtils.writeToParcel(this.MediaBrowserCompat$CustomActionResultReceiver, parcel, 0);
        parcel.writeDouble(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.f2677x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeInt(this.write ? 1 : 0);
        setAddress setaddress = this.MediaSessionCompat$Token;
        if (setaddress != null) {
            parcel.writeInt(1);
            setaddress.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.RatingCompat ? 1 : 0);
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$1 */
    public final class C30891 implements Parcelable {
        public static final C3090x71e4b717 CREATOR = new C3090x71e4b717((byte) 0);
        public final String AlertController$RecycleListView;
        public final String AppCompatActivity;
        public final String AppCompatDelegateImpl$ListMenuDecorView;
        public final String AppCompatDialogFragment;
        public final String IconCompatParcelizer;
        public final String Keep;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final String f2678x50fd9e4a;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String MediaSessionCompat$QueueItem;
        public final String MediaSessionCompat$ResultReceiverWrapper;
        public final String MediaSessionCompat$Token;
        public final String ParcelableVolumeInfo;
        public final String PlaybackStateCompat;
        public final String PlaybackStateCompat$CustomAction;
        public final String RatingCompat;
        public final String read;
        public final String setBackgroundResource;
        public final String setContentView;
        public final String setHasDecor;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30891)) {
                return false;
            }
            C30891 r3 = (C30891) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) r3.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) r3.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2678x50fd9e4a, (Object) r3.f2678x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatActivity, (Object) r3.AppCompatActivity) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) r3.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatDelegateImpl$ListMenuDecorView, (Object) r3.AppCompatDelegateImpl$ListMenuDecorView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setBackgroundResource, (Object) r3.setBackgroundResource) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) r3.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor, (Object) r3.setHasDecor) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat$CustomAction, (Object) r3.PlaybackStateCompat$CustomAction) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat, (Object) r3.PlaybackStateCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) r3.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatDialogFragment, (Object) r3.AppCompatDialogFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AlertController$RecycleListView, (Object) r3.AlertController$RecycleListView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) r3.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.Keep, (Object) r3.Keep) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) r3.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setContentView, (Object) r3.setContentView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) r3.MediaSessionCompat$QueueItem);
        }

        public final int hashCode() {
            String str = this.write;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaMetadataCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaDescriptionCompat;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.f2678x50fd9e4a;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.AppCompatActivity;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.IconCompatParcelizer;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.read;
            int hashCode9 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.AppCompatDelegateImpl$ListMenuDecorView;
            int hashCode10 = str10 != null ? str10.hashCode() : 0;
            String str11 = this.setBackgroundResource;
            int hashCode11 = str11 != null ? str11.hashCode() : 0;
            String str12 = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode12 = str12 != null ? str12.hashCode() : 0;
            String str13 = this.setHasDecor;
            int hashCode13 = str13 != null ? str13.hashCode() : 0;
            String str14 = this.PlaybackStateCompat$CustomAction;
            int hashCode14 = str14 != null ? str14.hashCode() : 0;
            String str15 = this.PlaybackStateCompat;
            int hashCode15 = str15 != null ? str15.hashCode() : 0;
            String str16 = this.ParcelableVolumeInfo;
            int hashCode16 = str16 != null ? str16.hashCode() : 0;
            String str17 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode17 = str17 != null ? str17.hashCode() : 0;
            String str18 = this.MediaBrowserCompat$MediaItem;
            int hashCode18 = str18 != null ? str18.hashCode() : 0;
            String str19 = this.AppCompatDialogFragment;
            int hashCode19 = str19 != null ? str19.hashCode() : 0;
            String str20 = this.AlertController$RecycleListView;
            int hashCode20 = str20 != null ? str20.hashCode() : 0;
            String str21 = this.RatingCompat;
            int hashCode21 = str21 != null ? str21.hashCode() : 0;
            String str22 = this.Keep;
            int hashCode22 = str22 != null ? str22.hashCode() : 0;
            String str23 = this.MediaSessionCompat$Token;
            int hashCode23 = str23 != null ? str23.hashCode() : 0;
            String str24 = this.setContentView;
            int hashCode24 = str24 != null ? str24.hashCode() : 0;
            String str25 = this.MediaSessionCompat$QueueItem;
            return (((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + (str25 != null ? str25.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RemittanceInputDisplay(accountFromNumber=");
            sb.append(this.write);
            sb.append(", countryName=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", channelType=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", agentType=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", currencyCode=");
            sb.append(this.f2678x50fd9e4a);
            sb.append(", receivingBank=");
            sb.append(this.AppCompatActivity);
            sb.append(", bankCode=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", accountToType=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", accountToNumber=");
            sb.append(this.read);
            sb.append(", swiftCode=");
            sb.append(this.AppCompatDelegateImpl$ListMenuDecorView);
            sb.append(", title=");
            sb.append(this.setBackgroundResource);
            sb.append(", firstName=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(", lastName=");
            sb.append(this.setHasDecor);
            sb.append(", nationality=");
            sb.append(this.PlaybackStateCompat$CustomAction);
            sb.append(", identificationType=");
            sb.append(this.PlaybackStateCompat);
            sb.append(", identificationNumber=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", address=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", city=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", state=");
            sb.append(this.AppCompatDialogFragment);
            sb.append(", postCode=");
            sb.append(this.AlertController$RecycleListView);
            sb.append(", countryCode=");
            sb.append(this.RatingCompat);
            sb.append(", phoneNumber=");
            sb.append(this.Keep);
            sb.append(", email=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", purpose=");
            sb.append(this.setContentView);
            sb.append(", favouriteNickName=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(")");
            return sb.toString();
        }

        public C30891(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
            onGetStartedClick.write((Object) str2, "countryName");
            onGetStartedClick.write((Object) str3, "channelType");
            onGetStartedClick.write((Object) str4, "agentType");
            onGetStartedClick.write((Object) str5, "currencyCode");
            this.write = str;
            this.MediaMetadataCompat = str2;
            this.MediaDescriptionCompat = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.f2678x50fd9e4a = str5;
            this.AppCompatActivity = str6;
            this.MediaBrowserCompat$SearchResultReceiver = str7;
            this.IconCompatParcelizer = str8;
            this.read = str9;
            this.AppCompatDelegateImpl$ListMenuDecorView = str10;
            this.setBackgroundResource = str11;
            this.MediaSessionCompat$ResultReceiverWrapper = str12;
            this.setHasDecor = str13;
            this.PlaybackStateCompat$CustomAction = str14;
            this.PlaybackStateCompat = str15;
            this.ParcelableVolumeInfo = str16;
            this.MediaBrowserCompat$CustomActionResultReceiver = str17;
            this.MediaBrowserCompat$MediaItem = str18;
            this.AppCompatDialogFragment = str19;
            this.AlertController$RecycleListView = str20;
            this.RatingCompat = str21;
            this.Keep = str22;
            this.MediaSessionCompat$Token = str23;
            this.setContentView = str24;
            this.MediaSessionCompat$QueueItem = str25;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C30891(android.os.Parcel r29) {
            /*
                r28 = this;
                r0 = r29
                java.lang.String r1 = "parcel"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r3 = r29.readString()
                java.lang.String r1 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r29.readString()
                java.lang.String r4 = ""
                if (r2 != 0) goto L_0x001a
                r5 = r4
                goto L_0x001b
            L_0x001a:
                r5 = r2
            L_0x001b:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r29.readString()
                if (r2 != 0) goto L_0x0026
                r6 = r4
                goto L_0x0027
            L_0x0026:
                r6 = r2
            L_0x0027:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r29.readString()
                if (r2 != 0) goto L_0x0032
                r7 = r4
                goto L_0x0033
            L_0x0032:
                r7 = r2
            L_0x0033:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r1 = r29.readString()
                if (r1 != 0) goto L_0x003d
                r1 = r4
            L_0x003d:
                java.lang.String r8 = r29.readString()
                java.lang.String r9 = r29.readString()
                java.lang.String r10 = r29.readString()
                java.lang.String r11 = r29.readString()
                java.lang.String r12 = r29.readString()
                java.lang.String r13 = r29.readString()
                java.lang.String r14 = r29.readString()
                java.lang.String r15 = r29.readString()
                java.lang.String r16 = r29.readString()
                java.lang.String r17 = r29.readString()
                java.lang.String r18 = r29.readString()
                java.lang.String r19 = r29.readString()
                java.lang.String r20 = r29.readString()
                java.lang.String r21 = r29.readString()
                java.lang.String r22 = r29.readString()
                java.lang.String r23 = r29.readString()
                java.lang.String r24 = r29.readString()
                java.lang.String r25 = r29.readString()
                java.lang.String r26 = r29.readString()
                java.lang.String r27 = r29.readString()
                r2 = r28
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C3088x7e3e3ebd.C30891.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.write);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.f2678x50fd9e4a);
            parcel.writeString(this.AppCompatActivity);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.read);
            parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
            parcel.writeString(this.setBackgroundResource);
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeString(this.setHasDecor);
            parcel.writeString(this.PlaybackStateCompat$CustomAction);
            parcel.writeString(this.PlaybackStateCompat);
            parcel.writeString(this.ParcelableVolumeInfo);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.AppCompatDialogFragment);
            parcel.writeString(this.AlertController$RecycleListView);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.Keep);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeString(this.setContentView);
            parcel.writeString(this.MediaSessionCompat$QueueItem);
        }
    }

    public C3088x7e3e3ebd(String str, String str2, CharSequence charSequence, CharSequence charSequence2, double d, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, setAddress setaddress, int i, boolean z2) {
        CharSequence charSequence3 = charSequence2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        onGetStartedClick.write((Object) str, "countryName");
        onGetStartedClick.write((Object) str2, "flagImage");
        onGetStartedClick.write((Object) charSequence, "amountFromTitle");
        onGetStartedClick.write((Object) charSequence3, "amountToTitle");
        onGetStartedClick.write((Object) str9, "fxRateMessage");
        onGetStartedClick.write((Object) str10, "fxRateDetailDescription");
        onGetStartedClick.write((Object) str11, "limitPerTransaction");
        onGetStartedClick.write((Object) str12, "remainingAmountDailyMessage");
        onGetStartedClick.write((Object) str13, "remainingAmountMonthlyMessage");
        onGetStartedClick.write((Object) str14, "remainingTimesMonthlyMessage");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = charSequence;
        this.MediaBrowserCompat$CustomActionResultReceiver = charSequence3;
        this.MediaMetadataCompat = d;
        this.MediaBrowserCompat$MediaItem = str9;
        this.MediaBrowserCompat$SearchResultReceiver = str10;
        this.MediaDescriptionCompat = str11;
        this.f2677x50fd9e4a = str12;
        this.MediaSessionCompat$QueueItem = str13;
        this.ParcelableVolumeInfo = str14;
        this.write = z;
        this.MediaSessionCompat$Token = setaddress;
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        this.RatingCompat = z2;
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder */
    public final class Builder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C3091x4240d621();
        public final String IconCompatParcelizer;
        public final boolean MediaBrowserCompat$ItemReceiver;
        public final String write;

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
            return this.MediaBrowserCompat$ItemReceiver == builder.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) builder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) builder.IconCompatParcelizer);
        }

        public final int hashCode() {
            boolean z = this.MediaBrowserCompat$ItemReceiver;
            if (z) {
                z = true;
            }
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PhoneFieldDisplay(fieldFlag=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", defaultCountryCodeValue=");
            sb.append(this.write);
            sb.append(", defaultPhoneNumberValue=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
            parcel.writeString(this.write);
            parcel.writeString(this.IconCompatParcelizer);
        }

        public Builder(boolean z, String str, String str2) {
            this.MediaBrowserCompat$ItemReceiver = z;
            this.write = str;
            this.IconCompatParcelizer = str2;
        }

        public static /* synthetic */ Builder MediaBrowserCompat$ItemReceiver(Builder builder, String str, String str2) {
            return new Builder(builder.MediaBrowserCompat$ItemReceiver, str, str2);
        }
    }
}
