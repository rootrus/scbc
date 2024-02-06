package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.List;
import p040o.ForwardingFuture;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Device */
public final class AutoValue_CrashlyticsReport_Session_Event_Device {
    public String IconCompatParcelizer;
    public String read;

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Device$Builder */
    public final class Builder extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Builder[0];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Builder(parcel);
            }
        };
        private int AlertController$RecycleListView;
        public boolean IconCompatParcelizer;
        public ForwardingFuture.SimpleForwardingFuture MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public setBatteryVelocity f2681x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        private String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public C30941 ParcelableVolumeInfo;
        private String PlaybackStateCompat;
        public String RatingCompat;
        public String read;

        public final int describeContents() {
            return 0;
        }

        public Builder(Parcel parcel) {
            this.AlertController$RecycleListView = parcel.readInt();
            this.MediaMetadataCompat = parcel.readString();
            this.MediaBrowserCompat$MediaItem = parcel.readInt();
            this.RatingCompat = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = (ForwardingFuture.SimpleForwardingFuture) parcel.readParcelable(ForwardingFuture.SimpleForwardingFuture.class.getClassLoader());
            this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
            this.MediaSessionCompat$QueueItem = parcel.readString();
            this.PlaybackStateCompat = parcel.readString();
            this.MediaSessionCompat$Token = parcel.readString();
            this.read = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.ParcelableVolumeInfo = (C30941) parcel.readParcelable(C30941.class.getClassLoader());
            this.f2681x50fd9e4a = (setBatteryVelocity) parcel.readParcelable(setBatteryVelocity.class.getClassLoader());
            this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
        }

        public Builder(int i, String str, int i2, String str2, ForwardingFuture.SimpleForwardingFuture simpleForwardingFuture, String str3, String str4, String str5, String str6, String str7, String str8, C30941 r14, setBatteryVelocity setbatteryvelocity, String str9, String str10, boolean z) {
            this.AlertController$RecycleListView = i;
            this.MediaMetadataCompat = str;
            this.MediaBrowserCompat$MediaItem = i2;
            this.RatingCompat = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = simpleForwardingFuture;
            this.MediaSessionCompat$ResultReceiverWrapper = str3;
            this.MediaSessionCompat$QueueItem = str4;
            this.PlaybackStateCompat = str5;
            this.MediaSessionCompat$Token = str6;
            this.read = str7;
            this.MediaBrowserCompat$ItemReceiver = str8;
            this.ParcelableVolumeInfo = r14;
            this.f2681x50fd9e4a = setbatteryvelocity;
            this.MediaBrowserCompat$SearchResultReceiver = str9;
            this.MediaDescriptionCompat = str10;
            this.IconCompatParcelizer = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (this.AlertController$RecycleListView != builder.AlertController$RecycleListView || this.MediaBrowserCompat$MediaItem != builder.MediaBrowserCompat$MediaItem) {
                return false;
            }
            String str = this.MediaMetadataCompat;
            if (str == null ? builder.MediaMetadataCompat != null : !str.equals(builder.MediaMetadataCompat)) {
                return false;
            }
            String str2 = this.RatingCompat;
            if (str2 == null ? builder.RatingCompat != null : !str2.equals(builder.RatingCompat)) {
                return false;
            }
            ForwardingFuture.SimpleForwardingFuture simpleForwardingFuture = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (simpleForwardingFuture == null ? builder.MediaBrowserCompat$CustomActionResultReceiver != null : !simpleForwardingFuture.equals(builder.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (str3 == null ? builder.MediaSessionCompat$ResultReceiverWrapper != null : !str3.equals(builder.MediaSessionCompat$ResultReceiverWrapper)) {
                return false;
            }
            String str4 = this.MediaSessionCompat$QueueItem;
            if (str4 == null ? builder.MediaSessionCompat$QueueItem != null : !str4.equals(builder.MediaSessionCompat$QueueItem)) {
                return false;
            }
            String str5 = this.PlaybackStateCompat;
            if (str5 == null ? builder.PlaybackStateCompat != null : !str5.equals(builder.PlaybackStateCompat)) {
                return false;
            }
            String str6 = this.MediaSessionCompat$Token;
            if (str6 == null ? builder.MediaSessionCompat$Token != null : !str6.equals(builder.MediaSessionCompat$Token)) {
                return false;
            }
            String str7 = this.read;
            if (str7 == null ? builder.read != null : !str7.equals(builder.read)) {
                return false;
            }
            String str8 = this.MediaBrowserCompat$ItemReceiver;
            if (str8 == null ? builder.MediaBrowserCompat$ItemReceiver != null : !str8.equals(builder.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            C30941 r2 = this.ParcelableVolumeInfo;
            if (r2 == null ? builder.ParcelableVolumeInfo != null : !r2.equals(builder.ParcelableVolumeInfo)) {
                return false;
            }
            setBatteryVelocity setbatteryvelocity = this.f2681x50fd9e4a;
            if (setbatteryvelocity == null ? builder.f2681x50fd9e4a != null : !setbatteryvelocity.equals(builder.f2681x50fd9e4a)) {
                return false;
            }
            String str9 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str9 == null ? builder.MediaBrowserCompat$SearchResultReceiver != null : !str9.equals(builder.MediaBrowserCompat$SearchResultReceiver)) {
                return false;
            }
            String str10 = this.MediaDescriptionCompat;
            String str11 = builder.MediaDescriptionCompat;
            if (str10 != null) {
                return str10.equals(str11);
            }
            if (str11 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = this.AlertController$RecycleListView;
            String str = this.MediaMetadataCompat;
            int hashCode = str != null ? str.hashCode() : 0;
            int i2 = this.MediaBrowserCompat$MediaItem;
            String str2 = this.RatingCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            ForwardingFuture.SimpleForwardingFuture simpleForwardingFuture = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = simpleForwardingFuture != null ? simpleForwardingFuture.hashCode() : 0;
            String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaSessionCompat$QueueItem;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.PlaybackStateCompat;
            int hashCode6 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaSessionCompat$Token;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.read;
            int hashCode8 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode9 = str8 != null ? str8.hashCode() : 0;
            C30941 r13 = this.ParcelableVolumeInfo;
            int hashCode10 = r13 != null ? r13.hashCode() : 0;
            setBatteryVelocity setbatteryvelocity = this.f2681x50fd9e4a;
            int hashCode11 = setbatteryvelocity != null ? setbatteryvelocity.hashCode() : 0;
            String str9 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode12 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.MediaDescriptionCompat;
            return (((((((((((((((((((((((((((i * 31) + hashCode) * 31) + i2) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str10 != null ? str10.hashCode() : 0);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.AlertController$RecycleListView);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeInt(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.RatingCompat);
            parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeString(this.MediaSessionCompat$QueueItem);
            parcel.writeString(this.PlaybackStateCompat);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeParcelable(this.ParcelableVolumeInfo, i);
            parcel.writeParcelable(this.f2681x50fd9e4a, i);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.MediaDescriptionCompat);
        }
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Event_Device$1 */
    public class C30941 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator<C30941> CREATOR = new Parcelable.Creator<C30941>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C30941[0];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C30941(parcel);
            }
        };
        private String AlertController$RecycleListView;
        private String AppCompatDelegateImpl$ListMenuDecorView;
        public String IconCompatParcelizer;
        private String Keep;
        public BigDecimal MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public List<setFile> MediaBrowserCompat$MediaItem;
        public List<setFile> MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public List<setFile> f2680x50fd9e4a;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public setProximityOn MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        private String PlaybackStateCompat;
        private String PlaybackStateCompat$CustomAction;
        public BigDecimal RatingCompat;
        public String read;
        private String setContentView;
        private String setHasDecor;

        public int describeContents() {
            return 0;
        }

        public C30941(Parcel parcel) {
            this.read = parcel.readString();
            this.Keep = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = (BigDecimal) parcel.readSerializable();
            this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
            this.MediaSessionCompat$QueueItem = (setProximityOn) parcel.readParcelable(setProximityOn.class.getClassLoader());
            this.AlertController$RecycleListView = parcel.readString();
            this.MediaMetadataCompat = parcel.readString();
            this.PlaybackStateCompat$CustomAction = parcel.readString();
            this.RatingCompat = (BigDecimal) parcel.readSerializable();
            this.setContentView = parcel.readString();
            this.PlaybackStateCompat = parcel.readString();
            this.setHasDecor = parcel.readString();
            this.ParcelableVolumeInfo = parcel.readString();
            this.MediaSessionCompat$Token = parcel.readString();
            this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
            this.MediaBrowserCompat$MediaItem = parcel.createTypedArrayList(setFile.CREATOR);
            this.f2680x50fd9e4a = parcel.createTypedArrayList(setFile.CREATOR);
            this.MediaBrowserCompat$SearchResultReceiver = parcel.createTypedArrayList(setFile.CREATOR);
        }

        public C30941(String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, setProximityOn setproximityon, String str6, String str7, String str8, BigDecimal bigDecimal2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List<setFile> list, List<setFile> list2, List<setFile> list3) {
            this.read = str;
            this.Keep = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.IconCompatParcelizer = str4;
            this.MediaBrowserCompat$CustomActionResultReceiver = bigDecimal;
            this.AppCompatDelegateImpl$ListMenuDecorView = str5;
            this.MediaSessionCompat$QueueItem = setproximityon;
            this.AlertController$RecycleListView = str6;
            this.MediaMetadataCompat = str7;
            this.PlaybackStateCompat$CustomAction = str8;
            this.RatingCompat = bigDecimal2;
            this.setContentView = str9;
            this.PlaybackStateCompat = str10;
            this.setHasDecor = str11;
            this.ParcelableVolumeInfo = str12;
            this.MediaSessionCompat$Token = str13;
            this.MediaSessionCompat$ResultReceiverWrapper = str14;
            this.MediaDescriptionCompat = str15;
            this.MediaBrowserCompat$MediaItem = list;
            this.f2680x50fd9e4a = list2;
            this.MediaBrowserCompat$SearchResultReceiver = list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C30941 r5 = (C30941) obj;
            String str = this.read;
            if (str == null ? r5.read != null : !str.equals(r5.read)) {
                return false;
            }
            String str2 = this.Keep;
            if (str2 == null ? r5.Keep != null : !str2.equals(r5.Keep)) {
                return false;
            }
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 == null ? r5.MediaBrowserCompat$ItemReceiver != null : !str3.equals(r5.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str4 = this.IconCompatParcelizer;
            if (str4 == null ? r5.IconCompatParcelizer != null : !str4.equals(r5.IconCompatParcelizer)) {
                return false;
            }
            BigDecimal bigDecimal = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (bigDecimal == null ? r5.MediaBrowserCompat$CustomActionResultReceiver != null : !bigDecimal.equals(r5.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str5 = this.AppCompatDelegateImpl$ListMenuDecorView;
            if (str5 == null ? r5.AppCompatDelegateImpl$ListMenuDecorView != null : !str5.equals(r5.AppCompatDelegateImpl$ListMenuDecorView)) {
                return false;
            }
            setProximityOn setproximityon = this.MediaSessionCompat$QueueItem;
            if (setproximityon == null ? r5.MediaSessionCompat$QueueItem != null : !setproximityon.equals(r5.MediaSessionCompat$QueueItem)) {
                return false;
            }
            String str6 = this.AlertController$RecycleListView;
            if (str6 == null ? r5.AlertController$RecycleListView != null : !str6.equals(r5.AlertController$RecycleListView)) {
                return false;
            }
            String str7 = this.MediaMetadataCompat;
            if (str7 == null ? r5.MediaMetadataCompat != null : !str7.equals(r5.MediaMetadataCompat)) {
                return false;
            }
            String str8 = this.PlaybackStateCompat$CustomAction;
            if (str8 == null ? r5.PlaybackStateCompat$CustomAction != null : !str8.equals(r5.PlaybackStateCompat$CustomAction)) {
                return false;
            }
            BigDecimal bigDecimal2 = this.RatingCompat;
            if (bigDecimal2 == null ? r5.RatingCompat != null : !bigDecimal2.equals(r5.RatingCompat)) {
                return false;
            }
            String str9 = this.setContentView;
            if (str9 == null ? r5.setContentView != null : !str9.equals(r5.setContentView)) {
                return false;
            }
            String str10 = this.PlaybackStateCompat;
            if (str10 == null ? r5.PlaybackStateCompat != null : !str10.equals(r5.PlaybackStateCompat)) {
                return false;
            }
            String str11 = this.setHasDecor;
            if (str11 == null ? r5.setHasDecor != null : !str11.equals(r5.setHasDecor)) {
                return false;
            }
            String str12 = this.ParcelableVolumeInfo;
            if (str12 == null ? r5.ParcelableVolumeInfo != null : !str12.equals(r5.ParcelableVolumeInfo)) {
                return false;
            }
            String str13 = this.MediaSessionCompat$Token;
            if (str13 == null ? r5.MediaSessionCompat$Token != null : !str13.equals(r5.MediaSessionCompat$Token)) {
                return false;
            }
            String str14 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (str14 == null ? r5.MediaSessionCompat$ResultReceiverWrapper != null : !str14.equals(r5.MediaSessionCompat$ResultReceiverWrapper)) {
                return false;
            }
            String str15 = this.MediaDescriptionCompat;
            if (str15 == null ? r5.MediaDescriptionCompat != null : !str15.equals(r5.MediaDescriptionCompat)) {
                return false;
            }
            List<setFile> list = this.MediaBrowserCompat$MediaItem;
            if (list == null ? r5.MediaBrowserCompat$MediaItem != null : !list.equals(r5.MediaBrowserCompat$MediaItem)) {
                return false;
            }
            List<setFile> list2 = this.f2680x50fd9e4a;
            if (list2 == null ? r5.f2680x50fd9e4a != null : !list2.equals(r5.f2680x50fd9e4a)) {
                return false;
            }
            List<setFile> list3 = this.MediaBrowserCompat$SearchResultReceiver;
            List<setFile> list4 = r5.MediaBrowserCompat$SearchResultReceiver;
            if (list3 != null) {
                return list3.equals(list4);
            }
            if (list4 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.read;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.Keep;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.IconCompatParcelizer;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            BigDecimal bigDecimal = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode5 = bigDecimal != null ? bigDecimal.hashCode() : 0;
            String str5 = this.AppCompatDelegateImpl$ListMenuDecorView;
            int hashCode6 = str5 != null ? str5.hashCode() : 0;
            setProximityOn setproximityon = this.MediaSessionCompat$QueueItem;
            int hashCode7 = setproximityon != null ? setproximityon.hashCode() : 0;
            String str6 = this.AlertController$RecycleListView;
            int hashCode8 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaMetadataCompat;
            int hashCode9 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.PlaybackStateCompat$CustomAction;
            int hashCode10 = str8 != null ? str8.hashCode() : 0;
            BigDecimal bigDecimal2 = this.RatingCompat;
            int hashCode11 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
            String str9 = this.setContentView;
            int hashCode12 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.PlaybackStateCompat;
            int hashCode13 = str10 != null ? str10.hashCode() : 0;
            String str11 = this.setHasDecor;
            int hashCode14 = str11 != null ? str11.hashCode() : 0;
            String str12 = this.ParcelableVolumeInfo;
            int hashCode15 = str12 != null ? str12.hashCode() : 0;
            String str13 = this.MediaSessionCompat$Token;
            int hashCode16 = str13 != null ? str13.hashCode() : 0;
            String str14 = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode17 = str14 != null ? str14.hashCode() : 0;
            String str15 = this.MediaDescriptionCompat;
            int hashCode18 = str15 != null ? str15.hashCode() : 0;
            List<setFile> list = this.MediaBrowserCompat$MediaItem;
            int hashCode19 = list != null ? list.hashCode() : 0;
            List<setFile> list2 = this.f2680x50fd9e4a;
            int hashCode20 = list2 != null ? list2.hashCode() : 0;
            List<setFile> list3 = this.MediaBrowserCompat$SearchResultReceiver;
            return (((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + (list3 != null ? list3.hashCode() : 0);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.read);
            parcel.writeString(this.Keep);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeSerializable(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
            parcel.writeParcelable(this.MediaSessionCompat$QueueItem, i);
            parcel.writeString(this.AlertController$RecycleListView);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.PlaybackStateCompat$CustomAction);
            parcel.writeSerializable(this.RatingCompat);
            parcel.writeString(this.setContentView);
            parcel.writeString(this.PlaybackStateCompat);
            parcel.writeString(this.setHasDecor);
            parcel.writeString(this.ParcelableVolumeInfo);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
            parcel.writeString(this.MediaDescriptionCompat);
            parcel.writeTypedList(this.MediaBrowserCompat$MediaItem);
            parcel.writeTypedList(this.f2680x50fd9e4a);
            parcel.writeTypedList(this.MediaBrowserCompat$SearchResultReceiver);
        }
    }
}
