package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.TypeCastException;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.setLength */
public final class setLength extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
    public static final Parcelable.Creator<setLength> CREATOR = new IconCompatParcelizer();
    public static final read read = new read((byte) 0);
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ setLength(setLength$MediaBrowserCompat$ItemReceiver setlength_mediabrowsercompat_itemreceiver, byte b) {
        this(setlength_mediabrowsercompat_itemreceiver);
    }

    public setLength(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "parcel");
        this.IconCompatParcelizer = parcel.readString();
        this.write = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        boolean z = true;
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readByte() != 0;
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readByte() != 0;
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readByte() == 0 ? false : z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeValue(Boolean.valueOf(this.MediaSessionCompat$ResultReceiverWrapper));
        parcel.writeValue(Boolean.valueOf(this.MediaBrowserCompat$SearchResultReceiver));
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeValue(Boolean.valueOf(this.MediaBrowserCompat$MediaItem));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            setLength setlength = (setLength) obj;
            if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setlength.IconCompatParcelizer)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setlength.write)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setlength.MediaDescriptionCompat)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setlength.MediaBrowserCompat$CustomActionResultReceiver)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) setlength.MediaSessionCompat$QueueItem)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setlength.RatingCompat)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setlength.MediaBrowserCompat$ItemReceiver)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) setlength.ParcelableVolumeInfo)) && this.MediaSessionCompat$ResultReceiverWrapper == setlength.MediaSessionCompat$ResultReceiverWrapper && this.MediaBrowserCompat$SearchResultReceiver == setlength.MediaBrowserCompat$SearchResultReceiver && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setlength.MediaMetadataCompat)) && this.MediaBrowserCompat$MediaItem == setlength.MediaBrowserCompat$MediaItem) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.mailingaddress.MailingAddressAccountDetailsItem");
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$QueueItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.ParcelableVolumeInfo;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        int hashCode9 = Boolean.valueOf(this.MediaSessionCompat$ResultReceiverWrapper).hashCode();
        int hashCode10 = Boolean.valueOf(this.MediaBrowserCompat$SearchResultReceiver).hashCode();
        String str9 = this.MediaMetadataCompat;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i) * 31) + Boolean.valueOf(this.MediaBrowserCompat$MediaItem).hashCode();
    }

    private setLength(setLength$MediaBrowserCompat$ItemReceiver setlength_mediabrowsercompat_itemreceiver) {
        read(false);
        this.f2675x50fd9e4a = setlength_mediabrowsercompat_itemreceiver.MediaDescriptionCompat;
        this.IconCompatParcelizer = setlength_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        this.write = setlength_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaDescriptionCompat = setlength_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = setlength_mediabrowsercompat_itemreceiver.read;
        this.MediaSessionCompat$QueueItem = setlength_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem;
        this.RatingCompat = setlength_mediabrowsercompat_itemreceiver.RatingCompat;
        this.MediaBrowserCompat$ItemReceiver = setlength_mediabrowsercompat_itemreceiver.write;
        this.ParcelableVolumeInfo = setlength_mediabrowsercompat_itemreceiver.MediaMetadataCompat;
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        this.MediaBrowserCompat$SearchResultReceiver = false;
        this.MediaMetadataCompat = setlength_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
        this.MediaBrowserCompat$MediaItem = false;
    }

    /* renamed from: o.setLength$read */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* renamed from: o.setLength$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<setLength> {
        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new setLength(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setLength[i];
        }
    }
}
