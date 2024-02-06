package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.C3088x7e3e3ebd;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
public final class C3092xce3d994b implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public final setCode AlertController$RecycleListView;
    public final setCode AppCompatActivity;
    public final setCode AppCompatDelegateImpl$ListMenuDecorView;
    public final setAddress AppCompatDialogFragment;
    public final setAddress AppCompatViewInflater;
    public final setCode IconCompatParcelizer;
    public final setAddress Keep;
    public final setCode MediaBrowserCompat$CustomActionResultReceiver;
    public final setAddress MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final double MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2679x50fd9e4a;
    public final setCode MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final setCode MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    public final setCode MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    public final setCode PlaybackStateCompat;
    public final setCode PlaybackStateCompat$CustomAction;
    public final String RatingCompat;
    public final String read;
    public final C3088x7e3e3ebd.Builder setBackgroundResource;
    public final setCode setContentView;
    public final setCode setExpandedFormat;
    public final setCode setHasDecor;
    public final String write;

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder */
    public enum Builder {
        NORMAL,
        RETRY,
        FAVOURITE,
        ADD_FAVOURITE
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            onGetStartedClick.write((Object) parcel2, "in");
            return new C3092xce3d994b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setAddress) setAddress.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setAddress) setAddress.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setAddress) setAddress.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (C3088x7e3e3ebd.Builder) C3088x7e3e3ebd.Builder.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setCode) setCode.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (setAddress) setAddress.CREATOR.createFromParcel(parcel2) : null, parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new C3092xce3d994b[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3092xce3d994b)) {
            return false;
        }
        C3092xce3d994b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame = (C3092xce3d994b) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2679x50fd9e4a, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.f2679x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.ParcelableVolumeInfo) && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaBrowserCompat$SearchResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setContentView, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.setContentView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setExpandedFormat, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.setExpandedFormat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatViewInflater, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.AppCompatViewInflater) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.PlaybackStateCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat$CustomAction, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.PlaybackStateCompat$CustomAction) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AlertController$RecycleListView, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.AlertController$RecycleListView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.Keep, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.Keep) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.setHasDecor) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatDelegateImpl$ListMenuDecorView, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.AppCompatDelegateImpl$ListMenuDecorView) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatActivity, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.AppCompatActivity) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setBackgroundResource, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.setBackgroundResource) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.AppCompatDialogFragment, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.AppCompatDialogFragment) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.MediaSessionCompat$ResultReceiverWrapper);
    }

    public final int hashCode() {
        String str = this.f2679x50fd9e4a;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.ParcelableVolumeInfo;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        setCode setcode = this.setContentView;
        int hashCode7 = setcode != null ? setcode.hashCode() : 0;
        setAddress setaddress = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = setaddress != null ? setaddress.hashCode() : 0;
        setCode setcode2 = this.MediaDescriptionCompat;
        int hashCode9 = setcode2 != null ? setcode2.hashCode() : 0;
        setCode setcode3 = this.IconCompatParcelizer;
        int hashCode10 = setcode3 != null ? setcode3.hashCode() : 0;
        setCode setcode4 = this.setExpandedFormat;
        int hashCode11 = setcode4 != null ? setcode4.hashCode() : 0;
        setAddress setaddress2 = this.AppCompatViewInflater;
        int hashCode12 = setaddress2 != null ? setaddress2.hashCode() : 0;
        setCode setcode5 = this.PlaybackStateCompat;
        int hashCode13 = setcode5 != null ? setcode5.hashCode() : 0;
        setCode setcode6 = this.PlaybackStateCompat$CustomAction;
        int hashCode14 = setcode6 != null ? setcode6.hashCode() : 0;
        setCode setcode7 = this.AlertController$RecycleListView;
        int hashCode15 = setcode7 != null ? setcode7.hashCode() : 0;
        setAddress setaddress3 = this.Keep;
        int hashCode16 = setaddress3 != null ? setaddress3.hashCode() : 0;
        setCode setcode8 = this.setHasDecor;
        int hashCode17 = setcode8 != null ? setcode8.hashCode() : 0;
        setCode setcode9 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode18 = setcode9 != null ? setcode9.hashCode() : 0;
        setCode setcode10 = this.MediaSessionCompat$QueueItem;
        int hashCode19 = setcode10 != null ? setcode10.hashCode() : 0;
        setCode setcode11 = this.AppCompatDelegateImpl$ListMenuDecorView;
        int hashCode20 = setcode11 != null ? setcode11.hashCode() : 0;
        setCode setcode12 = this.AppCompatActivity;
        int hashCode21 = setcode12 != null ? setcode12.hashCode() : 0;
        C3088x7e3e3ebd.Builder builder = this.setBackgroundResource;
        int hashCode22 = builder != null ? builder.hashCode() : 0;
        setCode setcode13 = this.MediaSessionCompat$Token;
        int hashCode23 = setcode13 != null ? setcode13.hashCode() : 0;
        setAddress setaddress4 = this.AppCompatDialogFragment;
        int hashCode24 = setaddress4 != null ? setaddress4.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode25 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceRecipientDetailDisplay(countryName=");
        sb.append(this.f2679x50fd9e4a);
        sb.append(", channelType=");
        sb.append(this.RatingCompat);
        sb.append(", agentType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", currencyCode=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", amountTo=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", accountFromNumber=");
        sb.append(this.write);
        sb.append(", accountFromName=");
        sb.append(this.read);
        sb.append(", receivingBank=");
        sb.append(this.setContentView);
        sb.append(", accountType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", bankCode=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", accountNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", swiftCode=");
        sb.append(this.setExpandedFormat);
        sb.append(", title=");
        sb.append(this.AppCompatViewInflater);
        sb.append(", firstName=");
        sb.append(this.PlaybackStateCompat);
        sb.append(", lastName=");
        sb.append(this.PlaybackStateCompat$CustomAction);
        sb.append(", nationality=");
        sb.append(this.AlertController$RecycleListView);
        sb.append(", identificationType=");
        sb.append(this.Keep);
        sb.append(", identificationNumber=");
        sb.append(this.setHasDecor);
        sb.append(", address=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", city=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", state=");
        sb.append(this.AppCompatDelegateImpl$ListMenuDecorView);
        sb.append(", postcode=");
        sb.append(this.AppCompatActivity);
        sb.append(", phoneContact=");
        sb.append(this.setBackgroundResource);
        sb.append(", email=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", purpose=");
        sb.append(this.AppCompatDialogFragment);
        sb.append(", annotation=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", favouriteNickName=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.f2679x50fd9e4a);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeDouble(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        setCode setcode = this.setContentView;
        if (setcode != null) {
            parcel.writeInt(1);
            setcode.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setAddress setaddress = this.MediaBrowserCompat$ItemReceiver;
        if (setaddress != null) {
            parcel.writeInt(1);
            setaddress.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode2 = this.MediaDescriptionCompat;
        if (setcode2 != null) {
            parcel.writeInt(1);
            setcode2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode3 = this.IconCompatParcelizer;
        if (setcode3 != null) {
            parcel.writeInt(1);
            setcode3.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode4 = this.setExpandedFormat;
        if (setcode4 != null) {
            parcel.writeInt(1);
            setcode4.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setAddress setaddress2 = this.AppCompatViewInflater;
        if (setaddress2 != null) {
            parcel.writeInt(1);
            setaddress2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode5 = this.PlaybackStateCompat;
        if (setcode5 != null) {
            parcel.writeInt(1);
            setcode5.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode6 = this.PlaybackStateCompat$CustomAction;
        if (setcode6 != null) {
            parcel.writeInt(1);
            setcode6.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode7 = this.AlertController$RecycleListView;
        if (setcode7 != null) {
            parcel.writeInt(1);
            setcode7.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setAddress setaddress3 = this.Keep;
        if (setaddress3 != null) {
            parcel.writeInt(1);
            setaddress3.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode8 = this.setHasDecor;
        if (setcode8 != null) {
            parcel.writeInt(1);
            setcode8.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode9 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setcode9 != null) {
            parcel.writeInt(1);
            setcode9.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode10 = this.MediaSessionCompat$QueueItem;
        if (setcode10 != null) {
            parcel.writeInt(1);
            setcode10.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode11 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (setcode11 != null) {
            parcel.writeInt(1);
            setcode11.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode12 = this.AppCompatActivity;
        if (setcode12 != null) {
            parcel.writeInt(1);
            setcode12.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        C3088x7e3e3ebd.Builder builder = this.setBackgroundResource;
        if (builder != null) {
            parcel.writeInt(1);
            builder.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setCode setcode13 = this.MediaSessionCompat$Token;
        if (setcode13 != null) {
            parcel.writeInt(1);
            setcode13.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        setAddress setaddress4 = this.AppCompatDialogFragment;
        if (setaddress4 != null) {
            parcel.writeInt(1);
            setaddress4.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
    }

    public C3092xce3d994b(String str, String str2, String str3, String str4, double d, String str5, String str6, setCode setcode, setAddress setaddress, setCode setcode2, setCode setcode3, setCode setcode4, setAddress setaddress2, setCode setcode5, setCode setcode6, setCode setcode7, setAddress setaddress3, setCode setcode8, setCode setcode9, setCode setcode10, setCode setcode11, setCode setcode12, C3088x7e3e3ebd.Builder builder, setCode setcode13, setAddress setaddress4, String str7, String str8) {
        String str9 = str6;
        onGetStartedClick.write((Object) str, "countryName");
        onGetStartedClick.write((Object) str2, "channelType");
        onGetStartedClick.write((Object) str3, "agentType");
        onGetStartedClick.write((Object) str4, "currencyCode");
        onGetStartedClick.write((Object) str5, "accountFromNumber");
        onGetStartedClick.write((Object) str9, "accountFromName");
        this.f2679x50fd9e4a = str;
        this.RatingCompat = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.ParcelableVolumeInfo = str4;
        this.MediaBrowserCompat$SearchResultReceiver = d;
        this.write = str5;
        this.read = str9;
        this.setContentView = setcode;
        this.MediaBrowserCompat$ItemReceiver = setaddress;
        this.MediaDescriptionCompat = setcode2;
        this.IconCompatParcelizer = setcode3;
        this.setExpandedFormat = setcode4;
        this.AppCompatViewInflater = setaddress2;
        this.PlaybackStateCompat = setcode5;
        this.PlaybackStateCompat$CustomAction = setcode6;
        this.AlertController$RecycleListView = setcode7;
        this.Keep = setaddress3;
        this.setHasDecor = setcode8;
        this.MediaBrowserCompat$CustomActionResultReceiver = setcode9;
        this.MediaSessionCompat$QueueItem = setcode10;
        this.AppCompatDelegateImpl$ListMenuDecorView = setcode11;
        this.AppCompatActivity = setcode12;
        this.setBackgroundResource = builder;
        this.MediaSessionCompat$Token = setcode13;
        this.AppCompatDialogFragment = setaddress4;
        this.MediaMetadataCompat = str7;
        this.MediaSessionCompat$ResultReceiverWrapper = str8;
    }

    public static /* synthetic */ C3092xce3d994b MediaBrowserCompat$CustomActionResultReceiver(C3092xce3d994b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame, setCode setcode, setAddress setaddress, setCode setcode2, setCode setcode3, setCode setcode4, setAddress setaddress2, setCode setcode5, setCode setcode6, setCode setcode7, setAddress setaddress3, setCode setcode8, setCode setcode9, setCode setcode10, setCode setcode11, setCode setcode12, C3088x7e3e3ebd.Builder builder, setCode setcode13, setAddress setaddress4, String str) {
        C3092xce3d994b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame2 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame;
        String str2 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame2.f2679x50fd9e4a;
        String str3 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame2.RatingCompat;
        String str4 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame2.MediaBrowserCompat$MediaItem;
        String str5 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame2.ParcelableVolumeInfo;
        String str6 = str5;
        String str7 = str5;
        double d = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame2.MediaBrowserCompat$SearchResultReceiver;
        String str8 = str3;
        String str9 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame2.write;
        String str10 = str4;
        String str11 = str9;
        String str12 = str6;
        String str13 = autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame2.read;
        double d2 = d;
        String str14 = str3;
        String str15 = str13;
        onGetStartedClick.write((Object) str2, "countryName");
        onGetStartedClick.write((Object) str14, "channelType");
        onGetStartedClick.write((Object) str4, "agentType");
        onGetStartedClick.write((Object) str7, "currencyCode");
        onGetStartedClick.write((Object) str9, "accountFromNumber");
        onGetStartedClick.write((Object) str13, "accountFromName");
        return new C3092xce3d994b(str2, str8, str4, str12, d2, str11, str15, setcode, setaddress, setcode2, setcode3, setcode4, setaddress2, setcode5, setcode6, setcode7, setaddress3, setcode8, setcode9, setcode10, setcode11, setcode12, builder, setcode13, setaddress4, str, autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame2.MediaSessionCompat$ResultReceiverWrapper);
    }
}
