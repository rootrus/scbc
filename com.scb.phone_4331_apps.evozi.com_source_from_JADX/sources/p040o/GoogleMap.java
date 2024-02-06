package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.threeten.p041bp.OffsetDateTime;
import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.GoogleMap */
public final class GoogleMap {
    public String IconCompatParcelizer;
    public OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;
    public String RatingCompat;
    public String read;
    public String write;

    /* renamed from: o.GoogleMap$OnInfoWindowClickListener */
    public abstract class OnInfoWindowClickListener {
        public String IconCompatParcelizer;
        public String read;
        public String write;
    }

    /* renamed from: o.GoogleMap$OnMarkerClickListener */
    public final class OnMarkerClickListener extends TypeToken<List<PlacePhotoMetadataResult>> {
    }

    /* renamed from: o.GoogleMap$OnMarkerDragListener */
    public class OnMarkerDragListener {
        private static final String setGroupDividerEnabled = "yyyy-MM-dd";
        @SerializedName("promptpayTcAcceptVersion")
        public String ActionMenuItemView;
        @SerializedName("middleNameEN")
        public String AlertController$RecycleListView;
        @SerializedName("predictiveFlag")
        public String AppCompatActivity;
        @SerializedName("promptpayTcAcceptDate")
        public String AppCompatDelegateImpl$ListMenuDecorView;
        @SerializedName("nameEN")
        public String AppCompatDialogFragment;
        @SerializedName("staticTileList")
        public List<PlacePhotoMetadataResult> AppCompatViewInflater;
        @SerializedName("userStatus")
        public String ExpandedMenuView;
        @SerializedName("buzzebeeHash")
        public String IconCompatParcelizer;
        @SerializedName("mobileNo")
        public String Keep;
        @SerializedName("userType")
        public String ListMenuItemView;
        @SerializedName("cardType")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("cardId")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("emailNotificationFlag")
        public String MediaBrowserCompat$MediaItem;
        @SerializedName("emailVerificationFlag")
        public String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("language")

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2719x50fd9e4a;
        @SerializedName("email")
        public String MediaDescriptionCompat;
        @SerializedName("crossSellConsentAcceptFlag")
        public String MediaMetadataCompat;
        @SerializedName("lastNameTH")
        public String MediaSessionCompat$QueueItem;
        @SerializedName("maskAccountFlag")
        public int MediaSessionCompat$ResultReceiverWrapper;
        @SerializedName("generalConsentAcceptFlag")
        public String MediaSessionCompat$Token;
        @SerializedName("lastNameEN")
        public String ParcelableVolumeInfo;
        @SerializedName("middleNameTH")
        public String PlaybackStateCompat;
        @SerializedName("migrationFlag")
        public String PlaybackStateCompat$CustomAction;
        @SerializedName("fastPayFlag")
        public String RatingCompat;
        @SerializedName("countryCode")
        public String read;
        @SerializedName("profilePhotoPath")
        public String setBackgroundResource;
        @SerializedName("registerDate")
        public String setCheckable;
        @SerializedName("registrationMethod")
        public String setChecked;
        @SerializedName("nameTH")
        public String setContentView;
        @SerializedName("segment")
        public String setExpandedFormat;
        @SerializedName("mutualFundTcAcceptVersion")
        public int setHasDecor;
        @SerializedName("themeFlag")
        public String setIcon;
        @SerializedName("titleTH")
        public String setItemInvoker;
        @SerializedName("tcAcceptVersion")
        public int setPadding;
        @SerializedName("tcAcceptDate")
        public String setPopupCallback;
        @SerializedName("titleEN")
        public String setShortcut;
        @SerializedName("userId")
        public String setTitle;
        @SerializedName("buzzebeeBaseURL")
        public String write;
    }

    /* renamed from: o.GoogleMap$OnMapClickListener */
    public final class OnMapClickListener {
        public boolean MediaBrowserCompat$ItemReceiver;
        public boolean read;

        public /* synthetic */ OnMapClickListener() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMapClickListener)) {
                return false;
            }
            OnMapClickListener onMapClickListener = (OnMapClickListener) obj;
            return this.MediaBrowserCompat$ItemReceiver == onMapClickListener.MediaBrowserCompat$ItemReceiver && this.read == onMapClickListener.read;
        }

        public final int hashCode() {
            boolean z = this.MediaBrowserCompat$ItemReceiver;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            boolean z3 = this.read;
            if (!z3) {
                z2 = z3;
            }
            return ((z ? 1 : 0) * true) + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SecuritiesList(registeredFlag=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", singleAppFlag=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public OnMapClickListener(boolean z, boolean z2) {
            this.MediaBrowserCompat$ItemReceiver = z;
            this.read = z2;
        }
    }

    /* renamed from: o.GoogleMap$OnMapLoadedCallback */
    public final class OnMapLoadedCallback {
        public final List<onMapLongClick> IconCompatParcelizer;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMapLoadedCallback)) {
                return false;
            }
            OnMapLoadedCallback onMapLoadedCallback = (OnMapLoadedCallback) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onMapLoadedCallback.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onMapLoadedCallback.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            List<onMapLongClick> list = this.IconCompatParcelizer;
            if (list != null) {
                i = list.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UnregisteredAccountsWithStatus(error=");
            sb.append(this.write);
            sb.append(", accounts=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public OnMapLoadedCallback(String str, List<? extends onMapLongClick> list) {
            onGetStartedClick.write((Object) list, "accounts");
            this.write = str;
            this.IconCompatParcelizer = list;
        }
    }

    /* renamed from: o.GoogleMap$OnMapLongClickListener */
    public final class OnMapLongClickListener {
        public onMapLoaded AlertController$RecycleListView;
        public boolean IconCompatParcelizer;
        public boolean Keep;
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public boolean MediaBrowserCompat$MediaItem;
        public boolean MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public OnMapLoadedCallback f2718x50fd9e4a;
        public boolean MediaDescriptionCompat;
        public OnMapLoadedCallback MediaMetadataCompat;
        public OnMapLoadedCallback MediaSessionCompat$QueueItem;
        public OnMapLoadedCallback MediaSessionCompat$ResultReceiverWrapper;
        public OnMapLoadedCallback MediaSessionCompat$Token;
        public OnMapLoadedCallback ParcelableVolumeInfo;
        public OnMapLoadedCallback PlaybackStateCompat;
        public OnMapLoadedCallback PlaybackStateCompat$CustomAction;
        public boolean RatingCompat;
        public boolean read;
        public OnMapLoadedCallback setHasDecor;
        public boolean write;

        public /* synthetic */ OnMapLongClickListener(C3423x31993af1 googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver, byte b) {
            this(googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver);
        }

        private OnMapLongClickListener(C3423x31993af1 googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver) {
            this.f2718x50fd9e4a = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token;
            this.MediaMetadataCompat = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
            this.ParcelableVolumeInfo = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
            this.MediaSessionCompat$ResultReceiverWrapper = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem;
            this.PlaybackStateCompat$CustomAction = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView;
            this.MediaSessionCompat$Token = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.f2720x50fd9e4a;
            this.setHasDecor = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.setHasDecor;
            this.Keep = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.Keep;
            this.PlaybackStateCompat = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction;
            this.MediaSessionCompat$QueueItem = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo;
            this.AlertController$RecycleListView = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat;
            this.MediaBrowserCompat$CustomActionResultReceiver = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            this.read = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.write;
            this.MediaDescriptionCompat = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
            this.write = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.read;
            this.IconCompatParcelizer = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            this.RatingCompat = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
            this.MediaBrowserCompat$SearchResultReceiver = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
            this.MediaBrowserCompat$MediaItem = googleMap$OnMapLongClickListener$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
        }
    }

    /* renamed from: o.GoogleMap$InfoWindowAdapter */
    public final class InfoWindowAdapter {
        public final List<setTrafficEnabled> IconCompatParcelizer;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof InfoWindowAdapter) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((InfoWindowAdapter) obj).IconCompatParcelizer);
            }
            return true;
        }

        public final int hashCode() {
            List<setTrafficEnabled> list = this.IconCompatParcelizer;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidActivationLanding(prepaidCardList=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public InfoWindowAdapter(List<setTrafficEnabled> list) {
            onGetStartedClick.write((Object) list, "prepaidCardList");
            this.IconCompatParcelizer = list;
        }
    }

    /* renamed from: o.GoogleMap$OnCameraMoveCanceledListener */
    public final class OnCameraMoveCanceledListener {
        @SerializedName("allowTag")
        public final List<String> IconCompatParcelizer;
        @SerializedName("currency")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("currencyName")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("sortSequence")
        public final int MediaBrowserCompat$MediaItem;
        @SerializedName("displayWalletFlag")
        public final int MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("thbEquivalentAmount")
        public final double MediaDescriptionCompat;
        @SerializedName("flagImage")
        public final String MediaMetadataCompat;
        @SerializedName("displayForBuyCurrencyFlag")
        public final int read;
        @SerializedName("amount")
        public final double write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCameraMoveCanceledListener)) {
                return false;
            }
            OnCameraMoveCanceledListener onCameraMoveCanceledListener = (OnCameraMoveCanceledListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onCameraMoveCanceledListener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onCameraMoveCanceledListener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) onCameraMoveCanceledListener.MediaMetadataCompat) && Double.compare(this.write, onCameraMoveCanceledListener.write) == 0 && Double.compare(this.MediaDescriptionCompat, onCameraMoveCanceledListener.MediaDescriptionCompat) == 0 && this.MediaBrowserCompat$MediaItem == onCameraMoveCanceledListener.MediaBrowserCompat$MediaItem && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onCameraMoveCanceledListener.IconCompatParcelizer) && this.MediaBrowserCompat$SearchResultReceiver == onCameraMoveCanceledListener.MediaBrowserCompat$SearchResultReceiver && this.read == onCameraMoveCanceledListener.read;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaMetadataCompat;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            long doubleToLongBits = Double.doubleToLongBits(this.write);
            int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            long doubleToLongBits2 = Double.doubleToLongBits(this.MediaDescriptionCompat);
            int i3 = (int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2);
            int i4 = this.MediaBrowserCompat$MediaItem;
            List<String> list = this.IconCompatParcelizer;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i) * 31) + this.MediaBrowserCompat$SearchResultReceiver) * 31) + this.read;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidTravelWallet(currency=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", currencyName=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", flagImage=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", amount=");
            sb.append(this.write);
            sb.append(", thbEquivalentAmount=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", sortSequence=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", allowTag=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", displayWalletFlag=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", displayForBuyCurrencyFlag=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public OnCameraMoveCanceledListener(String str, String str2, String str3, double d, double d2, int i, List<String> list, int i2, int i3) {
            onGetStartedClick.write((Object) str, "currency");
            onGetStartedClick.write((Object) str2, "currencyName");
            onGetStartedClick.write((Object) str3, "flagImage");
            onGetStartedClick.write((Object) list, "allowTag");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.MediaMetadataCompat = str3;
            this.write = d;
            this.MediaDescriptionCompat = d2;
            this.MediaBrowserCompat$MediaItem = i;
            this.IconCompatParcelizer = list;
            this.MediaBrowserCompat$SearchResultReceiver = i2;
            this.read = i3;
        }
    }

    /* renamed from: o.GoogleMap$OnCameraMoveListener */
    public final class OnCameraMoveListener {
        @SerializedName("thbEquivalentAmount")
        public final double IconCompatParcelizer;
        @SerializedName("allowTag")
        public final List<String> MediaBrowserCompat$ItemReceiver;
        @SerializedName("availableTopUpLimitAmount")
        public final Double read;
        @SerializedName("availableConversionLimit")
        public final int write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCameraMoveListener)) {
                return false;
            }
            OnCameraMoveListener onCameraMoveListener = (OnCameraMoveListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onCameraMoveListener.MediaBrowserCompat$ItemReceiver) && this.write == onCameraMoveListener.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onCameraMoveListener.read) && Double.compare(this.IconCompatParcelizer, onCameraMoveListener.IconCompatParcelizer) == 0;
        }

        public final int hashCode() {
            List<String> list = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            int i2 = this.write;
            Double d = this.read;
            if (d != null) {
                i = d.hashCode();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
            return (((((hashCode * 31) + i2) * 31) + i) * 31) + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidTravelCard(allowTag=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", availableConversionLimit=");
            sb.append(this.write);
            sb.append(", availableTopUpLimitAmount=");
            sb.append(this.read);
            sb.append(", thbEquivalentAmount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public OnCameraMoveListener(List<String> list, int i, Double d, double d2) {
            onGetStartedClick.write((Object) list, "allowTag");
            this.MediaBrowserCompat$ItemReceiver = list;
            this.write = i;
            this.read = d;
            this.IconCompatParcelizer = d2;
        }
    }

    /* renamed from: o.GoogleMap$OnIndoorStateChangeListener */
    public final class OnIndoorStateChangeListener {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final String f2717x50fd9e4a;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String MediaSessionCompat$ResultReceiverWrapper;
        public final String MediaSessionCompat$Token;
        public final String ParcelableVolumeInfo;
        public final String RatingCompat;
        public final List<String> read;
        public final String write;

        public OnIndoorStateChangeListener() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnIndoorStateChangeListener)) {
                return false;
            }
            OnIndoorStateChangeListener onIndoorStateChangeListener = (OnIndoorStateChangeListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) onIndoorStateChangeListener.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) onIndoorStateChangeListener.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onIndoorStateChangeListener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) onIndoorStateChangeListener.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) onIndoorStateChangeListener.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2717x50fd9e4a, (Object) onIndoorStateChangeListener.f2717x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onIndoorStateChangeListener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) onIndoorStateChangeListener.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onIndoorStateChangeListener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) onIndoorStateChangeListener.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) onIndoorStateChangeListener.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onIndoorStateChangeListener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) onIndoorStateChangeListener.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onIndoorStateChangeListener.read);
        }

        public final int hashCode() {
            String str = this.MediaMetadataCompat;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.ParcelableVolumeInfo;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaSessionCompat$Token;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.RatingCompat;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.f2717x50fd9e4a;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.write;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaBrowserCompat$MediaItem;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode9 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode10 = str10 != null ? str10.hashCode() : 0;
            String str11 = this.MediaDescriptionCompat;
            int hashCode11 = str11 != null ? str11.hashCode() : 0;
            String str12 = this.IconCompatParcelizer;
            int hashCode12 = str12 != null ? str12.hashCode() : 0;
            String str13 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode13 = str13 != null ? str13.hashCode() : 0;
            List<String> list = this.read;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CurrentAddress(houseNumber=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", unit=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", floor=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", village=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", moo=");
            sb.append(this.RatingCompat);
            sb.append(", trok=");
            sb.append(this.f2717x50fd9e4a);
            sb.append(", alley=");
            sb.append(this.write);
            sb.append(", road=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", district=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", subDistrict=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(", province=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", countryCode=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", postalCode=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", addressFormatted=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public OnIndoorStateChangeListener(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<String> list) {
            this.MediaMetadataCompat = str;
            this.ParcelableVolumeInfo = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.MediaSessionCompat$Token = str4;
            this.RatingCompat = str5;
            this.f2717x50fd9e4a = str6;
            this.write = str7;
            this.MediaBrowserCompat$MediaItem = str8;
            this.MediaBrowserCompat$CustomActionResultReceiver = str9;
            this.MediaSessionCompat$ResultReceiverWrapper = str10;
            this.MediaDescriptionCompat = str11;
            this.IconCompatParcelizer = str12;
            this.MediaBrowserCompat$SearchResultReceiver = str13;
            this.read = list;
        }

        public /* synthetic */ OnIndoorStateChangeListener(byte b) {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List<String>) null);
        }
    }

    /* renamed from: o.GoogleMap$OnMyLocationButtonClickListener */
    public final class OnMyLocationButtonClickListener {
        @SerializedName("dateOfBirth")
        private final String IconCompatParcelizer;
        @SerializedName("cardType")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("deviceId")
        private final String read;
        @SerializedName("cardId")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMyLocationButtonClickListener)) {
                return false;
            }
            OnMyLocationButtonClickListener onMyLocationButtonClickListener = (OnMyLocationButtonClickListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onMyLocationButtonClickListener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onMyLocationButtonClickListener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onMyLocationButtonClickListener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onMyLocationButtonClickListener.read);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.read;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("VerifyUserPinRequest(cardId=");
            sb.append(this.write);
            sb.append(", cardType=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", dateOfBirth=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", deviceId=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public OnMyLocationButtonClickListener(String str, String str2, String str3, String str4) {
            onGetStartedClick.write((Object) str, "cardId");
            onGetStartedClick.write((Object) str2, "cardType");
            onGetStartedClick.write((Object) str3, "dateOfBirth");
            onGetStartedClick.write((Object) str4, "deviceId");
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.IconCompatParcelizer = str3;
            this.read = str4;
        }
    }

    /* renamed from: o.GoogleMap$SnapshotReadyCallback */
    public final class SnapshotReadyCallback {
        @SerializedName("fee")
        public final String IconCompatParcelizer;
        @SerializedName("cardIconUrl")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("merchantMetaData")
        public final onSnapshotReady MediaBrowserCompat$ItemReceiver;
        @SerializedName("transactionToken")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("partnerSubType")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("remark")
        public final String MediaDescriptionCompat;
        @SerializedName("cardHolderName")
        public final String read;
        @SerializedName("email")
        public final String write;

        public SnapshotReadyCallback(String str, String str2, String str3, String str4, String str5, String str6, String str7, onSnapshotReady onsnapshotready) {
            onGetStartedClick.write((Object) str, "transactionToken");
            onGetStartedClick.write((Object) str2, "partnerSubType");
            onGetStartedClick.write((Object) str3, "cardIconUrl");
            onGetStartedClick.write((Object) str4, "fee");
            onGetStartedClick.write((Object) str5, "cardHolderName");
            this.MediaBrowserCompat$MediaItem = str;
            this.MediaBrowserCompat$SearchResultReceiver = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.IconCompatParcelizer = str4;
            this.read = str5;
            this.write = str6;
            this.MediaDescriptionCompat = str7;
            this.MediaBrowserCompat$ItemReceiver = onsnapshotready;
        }
    }

    /* renamed from: o.GoogleMap$zza */
    public final class zza {
        private final onSnapshotReady IconCompatParcelizer;
        public final List<ambientEnabled> MediaBrowserCompat$CustomActionResultReceiver;
        public final OffsetDateTime MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final Double write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zza.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zza.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            Double d = this.write;
            int hashCode3 = d != null ? d.hashCode() : 0;
            onSnapshotReady onsnapshotready = this.IconCompatParcelizer;
            int hashCode4 = onsnapshotready != null ? onsnapshotready.hashCode() : 0;
            List<ambientEnabled> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PurchasePaymentConfirmation(paymentId=");
            sb.append(this.read);
            sb.append(", dateTime=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", remainingBalance=");
            sb.append(this.write);
            sb.append(", merchantMetaData=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", buttons=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zza(String str, OffsetDateTime offsetDateTime, Double d, onSnapshotReady onsnapshotready, List<ambientEnabled> list) {
            this.read = str;
            this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
            this.write = d;
            this.IconCompatParcelizer = onsnapshotready;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }

    /* renamed from: o.GoogleMap$CancelableCallback */
    public final class CancelableCallback {
        @SerializedName("transactionDateTime")
        public final OffsetDateTime IconCompatParcelizer;
        @SerializedName("remark")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("transactionId")
        public final String read;
        @SerializedName("additionalInfo")
        public final C3422xa9494867 write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CancelableCallback)) {
                return false;
            }
            CancelableCallback cancelableCallback = (CancelableCallback) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) cancelableCallback.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) cancelableCallback.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) cancelableCallback.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) cancelableCallback.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            OffsetDateTime offsetDateTime = this.IconCompatParcelizer;
            int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            C3422xa9494867 googleMap$CancelableCallback$MediaBrowserCompat$CustomActionResultReceiver = this.write;
            int hashCode3 = googleMap$CancelableCallback$MediaBrowserCompat$CustomActionResultReceiver != null ? googleMap$CancelableCallback$MediaBrowserCompat$CustomActionResultReceiver.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidActivationOtpConfirm(transactionId=");
            sb.append(this.read);
            sb.append(", transactionDateTime=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", additionalInfo=");
            sb.append(this.write);
            sb.append(", remark=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public CancelableCallback(String str, OffsetDateTime offsetDateTime, C3422xa9494867 googleMap$CancelableCallback$MediaBrowserCompat$CustomActionResultReceiver, String str2) {
            onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
            onGetStartedClick.write((Object) googleMap$CancelableCallback$MediaBrowserCompat$CustomActionResultReceiver, "additionalInfo");
            onGetStartedClick.write((Object) str2, "remark");
            this.read = str;
            this.IconCompatParcelizer = offsetDateTime;
            this.write = googleMap$CancelableCallback$MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }

    /* renamed from: o.GoogleMap$OnMyLocationChangeListener */
    public final class OnMyLocationChangeListener extends zzuk {
        public int read;

        public OnMyLocationChangeListener(int i) {
            this.read = i;
        }
    }

    /* renamed from: o.GoogleMap$OnCircleClickListener */
    public final class OnCircleClickListener extends zzuk {
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final onCameraMoveStarted MediaBrowserCompat$ItemReceiver;
        private final int read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCircleClickListener)) {
                return false;
            }
            OnCircleClickListener onCircleClickListener = (OnCircleClickListener) obj;
            return this.read == onCircleClickListener.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onCircleClickListener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onCircleClickListener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onCircleClickListener.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            int i = this.read;
            String str = this.write;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            onCameraMoveStarted oncameramovestarted = this.MediaBrowserCompat$ItemReceiver;
            if (oncameramovestarted != null) {
                i2 = oncameramovestarted.hashCode();
            }
            return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Privacy(sortSequence=");
            sb.append(this.read);
            sb.append(", privacyType=");
            sb.append(this.write);
            sb.append(", label=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", additionalMetaData=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public OnCircleClickListener(int i, String str, String str2, onCameraMoveStarted oncameramovestarted) {
            onGetStartedClick.write((Object) str, "privacyType");
            onGetStartedClick.write((Object) str2, "label");
            this.read = i;
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.MediaBrowserCompat$ItemReceiver = oncameramovestarted;
        }
    }

    /* renamed from: o.GoogleMap$OnCameraIdleListener */
    public final class OnCameraIdleListener extends zzuk implements Parcelable {
        public static final GoogleMap$OnCameraIdleListener$MediaBrowserCompat$ItemReceiver CREATOR = new GoogleMap$OnCameraIdleListener$MediaBrowserCompat$ItemReceiver((byte) 0);
        public final double MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCameraIdleListener)) {
                return false;
            }
            OnCameraIdleListener onCameraIdleListener = (OnCameraIdleListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onCameraIdleListener.MediaBrowserCompat$ItemReceiver) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, onCameraIdleListener.MediaBrowserCompat$CustomActionResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onCameraIdleListener.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
            int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((hashCode * 31) + i2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidCashOutVerification(transactionToken=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", fee=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", accountName=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public OnCameraIdleListener(String str, double d, String str2) {
            onGetStartedClick.write((Object) str, "transactionToken");
            onGetStartedClick.write((Object) str2, "accountName");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = d;
            this.write = str2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public OnCameraIdleListener(android.os.Parcel r5) {
            /*
                r4 = this;
                java.lang.String r0 = "parcel"
                p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
                java.lang.String r0 = r5.readString()
                java.lang.String r1 = ""
                if (r0 != 0) goto L_0x000e
                r0 = r1
            L_0x000e:
                double r2 = r5.readDouble()
                java.lang.String r5 = r5.readString()
                if (r5 == 0) goto L_0x0019
                r1 = r5
            L_0x0019:
                r4.<init>(r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.GoogleMap.OnCameraIdleListener.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.write);
        }
    }

    /* renamed from: o.GoogleMap$OnCameraMoveStartedListener */
    public final class OnCameraMoveStartedListener extends zzuk {
        @SerializedName("buyRate")
        public final onCameraMoveCanceled MediaBrowserCompat$ItemReceiver;
        @SerializedName("sellRate")
        public final onCameraMoveCanceled write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCameraMoveStartedListener)) {
                return false;
            }
            OnCameraMoveStartedListener onCameraMoveStartedListener = (OnCameraMoveStartedListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onCameraMoveStartedListener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onCameraMoveStartedListener.write);
        }

        public final int hashCode() {
            onCameraMoveCanceled oncameramovecanceled = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = oncameramovecanceled != null ? oncameramovecanceled.hashCode() : 0;
            onCameraMoveCanceled oncameramovecanceled2 = this.write;
            if (oncameramovecanceled2 != null) {
                i = oncameramovecanceled2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidTravelWalletDisplayRateSummary(buyRate=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", sellRate=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public OnCameraMoveStartedListener(onCameraMoveCanceled oncameramovecanceled, onCameraMoveCanceled oncameramovecanceled2) {
            onGetStartedClick.write((Object) oncameramovecanceled, "buyRate");
            onGetStartedClick.write((Object) oncameramovecanceled2, "sellRate");
            this.MediaBrowserCompat$ItemReceiver = oncameramovecanceled;
            this.write = oncameramovecanceled2;
        }
    }

    /* renamed from: o.GoogleMap$OnGroundOverlayClickListener */
    public final class OnGroundOverlayClickListener extends zzuk {
        @SerializedName("wallet")
        public final List<OnCameraMoveCanceledListener> MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("card")
        public final OnCameraMoveListener MediaBrowserCompat$ItemReceiver;
        @SerializedName("cardRefNo")
        public final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGroundOverlayClickListener)) {
                return false;
            }
            OnGroundOverlayClickListener onGroundOverlayClickListener = (OnGroundOverlayClickListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onGroundOverlayClickListener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onGroundOverlayClickListener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onGroundOverlayClickListener.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            OnCameraMoveListener onCameraMoveListener = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = onCameraMoveListener != null ? onCameraMoveListener.hashCode() : 0;
            List<OnCameraMoveCanceledListener> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                i = list.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidTravelWalletSummary(cardRefNo=");
            sb.append(this.read);
            sb.append(", card=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", wallet=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public OnGroundOverlayClickListener(String str, OnCameraMoveListener onCameraMoveListener, List<OnCameraMoveCanceledListener> list) {
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) onCameraMoveListener, "card");
            onGetStartedClick.write((Object) list, "wallet");
            this.read = str;
            this.MediaBrowserCompat$ItemReceiver = onCameraMoveListener;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }

    /* renamed from: o.GoogleMap$OnMyLocationClickListener */
    public final class OnMyLocationClickListener extends zzuk {
        public onPoiClick MediaBrowserCompat$ItemReceiver;
        public List<onMyLocationButtonClick> read;
        public String write;

        public static OnMyLocationClickListener read() {
            return new OnMyLocationClickListener();
        }
    }

    /* renamed from: o.GoogleMap$OnCameraChangeListener */
    public final class OnCameraChangeListener extends zzuk {
        @SerializedName("fxRate")
        public final List<IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("fromWallet")
        public final List<OnCameraMoveCanceledListener> MediaBrowserCompat$ItemReceiver;
        @SerializedName("toWallet")
        public final List<OnCameraMoveCanceledListener> read;
        @SerializedName("cardRefNo")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCameraChangeListener)) {
                return false;
            }
            OnCameraChangeListener onCameraChangeListener = (OnCameraChangeListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onCameraChangeListener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onCameraChangeListener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onCameraChangeListener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onCameraChangeListener.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            List<OnCameraMoveCanceledListener> list = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = list != null ? list.hashCode() : 0;
            List<OnCameraMoveCanceledListener> list2 = this.read;
            int hashCode3 = list2 != null ? list2.hashCode() : 0;
            List<IconCompatParcelizer> list3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list3 != null) {
                i = list3.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidTravelConversionLanding(cardRefNo=");
            sb.append(this.write);
            sb.append(", fromWallet=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", toWallet=");
            sb.append(this.read);
            sb.append(", fxRate=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public OnCameraChangeListener(String str, List<OnCameraMoveCanceledListener> list, List<OnCameraMoveCanceledListener> list2, List<IconCompatParcelizer> list3) {
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) list, "fromWallet");
            onGetStartedClick.write((Object) list2, "toWallet");
            onGetStartedClick.write((Object) list3, "fxRate");
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = list;
            this.read = list2;
            this.MediaBrowserCompat$CustomActionResultReceiver = list3;
        }

        /* renamed from: o.GoogleMap$OnCameraChangeListener$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            @SerializedName("conversionType")
            public final String IconCompatParcelizer;
            @SerializedName("rate")
            public final double MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("toCurrency")
            public final String MediaBrowserCompat$ItemReceiver;
            @SerializedName("description")
            public final String read;
            @SerializedName("fromCurrency")
            public final String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IconCompatParcelizer)) {
                    return false;
                }
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read);
            }

            public final int hashCode() {
                String str = this.IconCompatParcelizer;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.write;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
                int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                String str4 = this.read;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("FxRate(conversionType=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", fromCurrency=");
                sb.append(this.write);
                sb.append(", toCurrency=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", rate=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", description=");
                sb.append(this.read);
                sb.append(")");
                return sb.toString();
            }

            public IconCompatParcelizer(String str, String str2, String str3, double d, String str4) {
                onGetStartedClick.write((Object) str, "conversionType");
                onGetStartedClick.write((Object) str2, "fromCurrency");
                onGetStartedClick.write((Object) str3, "toCurrency");
                onGetStartedClick.write((Object) str4, "description");
                this.IconCompatParcelizer = str;
                this.write = str2;
                this.MediaBrowserCompat$ItemReceiver = str3;
                this.MediaBrowserCompat$CustomActionResultReceiver = d;
                this.read = str4;
            }
        }
    }

    /* renamed from: o.GoogleMap$OnPoiClickListener */
    public final class OnPoiClickListener {
        public final String IconCompatParcelizer;
        public final List<onPolygonClick> MediaBrowserCompat$CustomActionResultReceiver;
        public final Double MediaBrowserCompat$ItemReceiver;
        public final List<onPolygonClick> MediaBrowserCompat$MediaItem;
        public final Integer MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String read;
        public final Integer write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPoiClickListener)) {
                return false;
            }
            OnPoiClickListener onPoiClickListener = (OnPoiClickListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onPoiClickListener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) onPoiClickListener.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onPoiClickListener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) onPoiClickListener.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onPoiClickListener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) onPoiClickListener.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onPoiClickListener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onPoiClickListener.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            List<onPolygonClick> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            List<onPolygonClick> list2 = this.MediaBrowserCompat$MediaItem;
            int hashCode2 = list2 != null ? list2.hashCode() : 0;
            Integer num = this.write;
            int hashCode3 = num != null ? num.hashCode() : 0;
            Integer num2 = this.MediaDescriptionCompat;
            int hashCode4 = num2 != null ? num2.hashCode() : 0;
            String str = this.IconCompatParcelizer;
            int hashCode5 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaMetadataCompat;
            int hashCode6 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode7 = str3 != null ? str3.hashCode() : 0;
            Double d = this.MediaBrowserCompat$ItemReceiver;
            if (d != null) {
                i = d.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CreditCardInstallment(creditCardInstallmentPlans=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", speedyCashInstallmentPlans=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", creditCardDefaultTenor=");
            sb.append(this.write);
            sb.append(", speedyCashDefaultTenor=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", merchantId=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", terminalId=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", orderReference=");
            sb.append(this.read);
            sb.append(", paymentAmount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public OnPoiClickListener(List<onPolygonClick> list, List<onPolygonClick> list2, Integer num, Integer num2, String str, String str2, String str3, Double d) {
            onGetStartedClick.write((Object) list, "creditCardInstallmentPlans");
            onGetStartedClick.write((Object) list2, "speedyCashInstallmentPlans");
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
            this.MediaBrowserCompat$MediaItem = list2;
            this.write = num;
            this.MediaDescriptionCompat = num2;
            this.IconCompatParcelizer = str;
            this.MediaMetadataCompat = str2;
            this.read = str3;
            this.MediaBrowserCompat$ItemReceiver = d;
        }
    }

    /* renamed from: o.GoogleMap$OnInfoWindowCloseListener */
    public final class OnInfoWindowCloseListener extends TypeAdapter implements addKernel {
        private validateCycle IconCompatParcelizer;
        private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
        private Gson read;

        public OnInfoWindowCloseListener(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
            this.read = gson;
            this.IconCompatParcelizer = validatecycle;
            this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            OnMarkerDragListener onMarkerDragListener = (OnMarkerDragListener) obj;
            Gson gson = this.read;
            validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
            jsonWriter.beginObject();
            if (onMarkerDragListener != onMarkerDragListener.write) {
                validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA);
                String str = onMarkerDragListener.write;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
            }
            if (onMarkerDragListener != onMarkerDragListener.IconCompatParcelizer) {
                validatedagrecurse.read(jsonWriter, 530);
                String str2 = onMarkerDragListener.IconCompatParcelizer;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
            }
            if (onMarkerDragListener != onMarkerDragListener.MediaBrowserCompat$ItemReceiver) {
                validatedagrecurse.read(jsonWriter, 210);
                String str3 = onMarkerDragListener.MediaBrowserCompat$ItemReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
            }
            if (onMarkerDragListener != onMarkerDragListener.MediaBrowserCompat$CustomActionResultReceiver) {
                validatedagrecurse.read(jsonWriter, 503);
                String str4 = onMarkerDragListener.MediaBrowserCompat$CustomActionResultReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
            }
            if (onMarkerDragListener != onMarkerDragListener.read) {
                validatedagrecurse.read(jsonWriter, 430);
                String str5 = onMarkerDragListener.read;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
            }
            if (onMarkerDragListener != onMarkerDragListener.MediaMetadataCompat) {
                validatedagrecurse.read(jsonWriter, 246);
                String str6 = onMarkerDragListener.MediaMetadataCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
            }
            if (onMarkerDragListener != onMarkerDragListener.MediaDescriptionCompat) {
                validatedagrecurse.read(jsonWriter, 227);
                String str7 = onMarkerDragListener.MediaDescriptionCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
            }
            if (onMarkerDragListener != onMarkerDragListener.MediaBrowserCompat$MediaItem) {
                validatedagrecurse.read(jsonWriter, 557);
                String str8 = onMarkerDragListener.MediaBrowserCompat$MediaItem;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
            }
            if (onMarkerDragListener != onMarkerDragListener.MediaBrowserCompat$SearchResultReceiver) {
                validatedagrecurse.read(jsonWriter, 88);
                String str9 = onMarkerDragListener.MediaBrowserCompat$SearchResultReceiver;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
            }
            if (onMarkerDragListener != onMarkerDragListener.RatingCompat) {
                validatedagrecurse.read(jsonWriter, 498);
                String str10 = onMarkerDragListener.RatingCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str10).write(jsonWriter, str10);
            }
            if (onMarkerDragListener != onMarkerDragListener.MediaSessionCompat$Token) {
                validatedagrecurse.read(jsonWriter, 602);
                String str11 = onMarkerDragListener.MediaSessionCompat$Token;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str11).write(jsonWriter, str11);
            }
            if (onMarkerDragListener != onMarkerDragListener.f2719x50fd9e4a) {
                validatedagrecurse.read(jsonWriter, 356);
                String str12 = onMarkerDragListener.f2719x50fd9e4a;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str12).write(jsonWriter, str12);
            }
            if (onMarkerDragListener != onMarkerDragListener.ParcelableVolumeInfo) {
                validatedagrecurse.read(jsonWriter, 9);
                String str13 = onMarkerDragListener.ParcelableVolumeInfo;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str13).write(jsonWriter, str13);
            }
            if (onMarkerDragListener != onMarkerDragListener.MediaSessionCompat$QueueItem) {
                validatedagrecurse.read(jsonWriter, 132);
                String str14 = onMarkerDragListener.MediaSessionCompat$QueueItem;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str14).write(jsonWriter, str14);
            }
            validatedagrecurse.read(jsonWriter, 260);
            Class cls = Integer.TYPE;
            Integer valueOf = Integer.valueOf(onMarkerDragListener.MediaSessionCompat$ResultReceiverWrapper);
            findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
            if (onMarkerDragListener != onMarkerDragListener.AlertController$RecycleListView) {
                validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384);
                String str15 = onMarkerDragListener.AlertController$RecycleListView;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str15).write(jsonWriter, str15);
            }
            if (onMarkerDragListener != onMarkerDragListener.PlaybackStateCompat) {
                validatedagrecurse.read(jsonWriter, 208);
                String str16 = onMarkerDragListener.PlaybackStateCompat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str16).write(jsonWriter, str16);
            }
            if (onMarkerDragListener != onMarkerDragListener.PlaybackStateCompat$CustomAction) {
                validatedagrecurse.read(jsonWriter, 547);
                String str17 = onMarkerDragListener.PlaybackStateCompat$CustomAction;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str17).write(jsonWriter, str17);
            }
            if (onMarkerDragListener != onMarkerDragListener.Keep) {
                validatedagrecurse.read(jsonWriter, 402);
                String str18 = onMarkerDragListener.Keep;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str18).write(jsonWriter, str18);
            }
            validatedagrecurse.read(jsonWriter, 273);
            Class cls2 = Integer.TYPE;
            Integer valueOf2 = Integer.valueOf(onMarkerDragListener.setHasDecor);
            findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
            if (onMarkerDragListener != onMarkerDragListener.AppCompatDialogFragment) {
                validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_NULL_SHA384);
                String str19 = onMarkerDragListener.AppCompatDialogFragment;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str19).write(jsonWriter, str19);
            }
            if (onMarkerDragListener != onMarkerDragListener.setContentView) {
                validatedagrecurse.read(jsonWriter, 623);
                String str20 = onMarkerDragListener.setContentView;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str20).write(jsonWriter, str20);
            }
            if (onMarkerDragListener != onMarkerDragListener.AppCompatActivity) {
                validatedagrecurse.read(jsonWriter, 278);
                String str21 = onMarkerDragListener.AppCompatActivity;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str21).write(jsonWriter, str21);
            }
            if (onMarkerDragListener != onMarkerDragListener.setBackgroundResource) {
                validatedagrecurse.read(jsonWriter, 613);
                String str22 = onMarkerDragListener.setBackgroundResource;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str22).write(jsonWriter, str22);
            }
            if (onMarkerDragListener != onMarkerDragListener.AppCompatDelegateImpl$ListMenuDecorView) {
                validatedagrecurse.read(jsonWriter, 80);
                String str23 = onMarkerDragListener.AppCompatDelegateImpl$ListMenuDecorView;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str23).write(jsonWriter, str23);
            }
            if (onMarkerDragListener != onMarkerDragListener.ActionMenuItemView) {
                validatedagrecurse.read(jsonWriter, 369);
                String str24 = onMarkerDragListener.ActionMenuItemView;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str24).write(jsonWriter, str24);
            }
            if (onMarkerDragListener != onMarkerDragListener.setCheckable) {
                validatedagrecurse.read(jsonWriter, 258);
                String str25 = onMarkerDragListener.setCheckable;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str25).write(jsonWriter, str25);
            }
            if (onMarkerDragListener != onMarkerDragListener.setChecked) {
                validatedagrecurse.read(jsonWriter, 317);
                String str26 = onMarkerDragListener.setChecked;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str26).write(jsonWriter, str26);
            }
            if (onMarkerDragListener != onMarkerDragListener.setExpandedFormat) {
                validatedagrecurse.read(jsonWriter, 13);
                String str27 = onMarkerDragListener.setExpandedFormat;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str27).write(jsonWriter, str27);
            }
            if (onMarkerDragListener != onMarkerDragListener.AppCompatViewInflater) {
                validatedagrecurse.read(jsonWriter, 388);
                OnMarkerClickListener onMarkerClickListener = new OnMarkerClickListener();
                List<PlacePhotoMetadataResult> list = onMarkerDragListener.AppCompatViewInflater;
                findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) onMarkerClickListener, (Object) list).write(jsonWriter, list);
            }
            if (onMarkerDragListener != onMarkerDragListener.setPopupCallback) {
                validatedagrecurse.read(jsonWriter, 245);
                String str28 = onMarkerDragListener.setPopupCallback;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str28).write(jsonWriter, str28);
            }
            validatedagrecurse.read(jsonWriter, 380);
            Class cls3 = Integer.TYPE;
            Integer valueOf3 = Integer.valueOf(onMarkerDragListener.setPadding);
            findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
            if (onMarkerDragListener != onMarkerDragListener.setIcon) {
                validatedagrecurse.read(jsonWriter, 192);
                String str29 = onMarkerDragListener.setIcon;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str29).write(jsonWriter, str29);
            }
            if (onMarkerDragListener != onMarkerDragListener.setShortcut) {
                validatedagrecurse.read(jsonWriter, 545);
                String str30 = onMarkerDragListener.setShortcut;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str30).write(jsonWriter, str30);
            }
            if (onMarkerDragListener != onMarkerDragListener.setItemInvoker) {
                validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384);
                String str31 = onMarkerDragListener.setItemInvoker;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str31).write(jsonWriter, str31);
            }
            if (onMarkerDragListener != onMarkerDragListener.setTitle) {
                validatedagrecurse.read(jsonWriter, 324);
                String str32 = onMarkerDragListener.setTitle;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str32).write(jsonWriter, str32);
            }
            if (onMarkerDragListener != onMarkerDragListener.ExpandedMenuView) {
                validatedagrecurse.read(jsonWriter, 93);
                String str33 = onMarkerDragListener.ExpandedMenuView;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str33).write(jsonWriter, str33);
            }
            if (onMarkerDragListener != onMarkerDragListener.ListMenuItemView) {
                validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA);
                String str34 = onMarkerDragListener.ListMenuItemView;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str34).write(jsonWriter, str34);
            }
            jsonWriter.endObject();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0372, code lost:
            r8.nextNull();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object read(com.google.gson.stream.JsonReader r8) throws java.io.IOException {
            /*
                r7 = this;
                com.google.gson.stream.JsonToken r0 = r8.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                r2 = 0
                if (r0 != r1) goto L_0x000d
                r8.skipValue()
                return r2
            L_0x000d:
                o.GoogleMap$OnMarkerDragListener r0 = new o.GoogleMap$OnMarkerDragListener
                r0.<init>()
                com.google.gson.Gson r1 = r7.read
                o.validateCycle r3 = r7.IconCompatParcelizer
                r8.beginObject()
            L_0x0019:
                boolean r4 = r8.hasNext()
                if (r4 == 0) goto L_0x0377
                int r4 = r3.write(r8)
                com.google.gson.stream.JsonToken r5 = r8.peek()
                com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL
                if (r5 == r6) goto L_0x002d
                r5 = 1
                goto L_0x002e
            L_0x002d:
                r5 = 0
            L_0x002e:
                switch(r4) {
                    case 7: goto L_0x035e;
                    case 11: goto L_0x0349;
                    case 69: goto L_0x0334;
                    case 81: goto L_0x031e;
                    case 82: goto L_0x0309;
                    case 102: goto L_0x02f4;
                    case 108: goto L_0x02de;
                    case 124: goto L_0x02c8;
                    case 162: goto L_0x02b2;
                    case 174: goto L_0x029c;
                    case 183: goto L_0x0286;
                    case 203: goto L_0x0270;
                    case 216: goto L_0x025a;
                    case 277: goto L_0x0244;
                    case 280: goto L_0x022e;
                    case 290: goto L_0x0218;
                    case 305: goto L_0x0202;
                    case 312: goto L_0x01ec;
                    case 335: goto L_0x01d6;
                    case 375: goto L_0x01c0;
                    case 386: goto L_0x01aa;
                    case 389: goto L_0x0194;
                    case 390: goto L_0x017e;
                    case 391: goto L_0x0168;
                    case 412: goto L_0x014f;
                    case 414: goto L_0x0139;
                    case 421: goto L_0x0123;
                    case 427: goto L_0x010d;
                    case 438: goto L_0x00f7;
                    case 454: goto L_0x00e1;
                    case 469: goto L_0x00cb;
                    case 505: goto L_0x00b5;
                    case 507: goto L_0x009f;
                    case 522: goto L_0x0089;
                    case 529: goto L_0x0074;
                    case 550: goto L_0x005f;
                    case 573: goto L_0x004a;
                    case 576: goto L_0x0035;
                    default: goto L_0x0031;
                }
            L_0x0031:
                r8.skipValue()
                goto L_0x0019
            L_0x0035:
                if (r5 == 0) goto L_0x0372
                java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r0.MediaSessionCompat$ResultReceiverWrapper = r4
                goto L_0x0019
            L_0x004a:
                if (r5 == 0) goto L_0x005b
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setBackgroundResource = r4
                goto L_0x0019
            L_0x005b:
                r0.setBackgroundResource = r2
                goto L_0x0372
            L_0x005f:
                if (r5 == 0) goto L_0x0070
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaSessionCompat$Token = r4
                goto L_0x0019
            L_0x0070:
                r0.MediaSessionCompat$Token = r2
                goto L_0x0372
            L_0x0074:
                if (r5 == 0) goto L_0x0085
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.IconCompatParcelizer = r4
                goto L_0x0019
            L_0x0085:
                r0.IconCompatParcelizer = r2
                goto L_0x0372
            L_0x0089:
                if (r5 == 0) goto L_0x0372
                java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r0.setHasDecor = r4
                goto L_0x0019
            L_0x009f:
                if (r5 == 0) goto L_0x00b1
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setContentView = r4
                goto L_0x0019
            L_0x00b1:
                r0.setContentView = r2
                goto L_0x0372
            L_0x00b5:
                if (r5 == 0) goto L_0x00c7
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.write = r4
                goto L_0x0019
            L_0x00c7:
                r0.write = r2
                goto L_0x0372
            L_0x00cb:
                if (r5 == 0) goto L_0x00dd
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setCheckable = r4
                goto L_0x0019
            L_0x00dd:
                r0.setCheckable = r2
                goto L_0x0372
            L_0x00e1:
                if (r5 == 0) goto L_0x00f3
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setChecked = r4
                goto L_0x0019
            L_0x00f3:
                r0.setChecked = r2
                goto L_0x0372
            L_0x00f7:
                if (r5 == 0) goto L_0x0109
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaDescriptionCompat = r4
                goto L_0x0019
            L_0x0109:
                r0.MediaDescriptionCompat = r2
                goto L_0x0372
            L_0x010d:
                if (r5 == 0) goto L_0x011f
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaMetadataCompat = r4
                goto L_0x0019
            L_0x011f:
                r0.MediaMetadataCompat = r2
                goto L_0x0372
            L_0x0123:
                if (r5 == 0) goto L_0x0135
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaBrowserCompat$CustomActionResultReceiver = r4
                goto L_0x0019
            L_0x0135:
                r0.MediaBrowserCompat$CustomActionResultReceiver = r2
                goto L_0x0372
            L_0x0139:
                if (r5 == 0) goto L_0x014b
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setExpandedFormat = r4
                goto L_0x0019
            L_0x014b:
                r0.setExpandedFormat = r2
                goto L_0x0372
            L_0x014f:
                if (r5 == 0) goto L_0x0164
                o.GoogleMap$OnMarkerClickListener r4 = new o.GoogleMap$OnMarkerClickListener
                r4.<init>()
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.util.List r4 = (java.util.List) r4
                r0.AppCompatViewInflater = r4
                goto L_0x0019
            L_0x0164:
                r0.AppCompatViewInflater = r2
                goto L_0x0372
            L_0x0168:
                if (r5 == 0) goto L_0x017a
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.ExpandedMenuView = r4
                goto L_0x0019
            L_0x017a:
                r0.ExpandedMenuView = r2
                goto L_0x0372
            L_0x017e:
                if (r5 == 0) goto L_0x0190
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setItemInvoker = r4
                goto L_0x0019
            L_0x0190:
                r0.setItemInvoker = r2
                goto L_0x0372
            L_0x0194:
                if (r5 == 0) goto L_0x01a6
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.PlaybackStateCompat$CustomAction = r4
                goto L_0x0019
            L_0x01a6:
                r0.PlaybackStateCompat$CustomAction = r2
                goto L_0x0372
            L_0x01aa:
                if (r5 == 0) goto L_0x01bc
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.Keep = r4
                goto L_0x0019
            L_0x01bc:
                r0.Keep = r2
                goto L_0x0372
            L_0x01c0:
                if (r5 == 0) goto L_0x01d2
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setTitle = r4
                goto L_0x0019
            L_0x01d2:
                r0.setTitle = r2
                goto L_0x0372
            L_0x01d6:
                if (r5 == 0) goto L_0x01e8
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.ParcelableVolumeInfo = r4
                goto L_0x0019
            L_0x01e8:
                r0.ParcelableVolumeInfo = r2
                goto L_0x0372
            L_0x01ec:
                if (r5 == 0) goto L_0x01fe
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.ListMenuItemView = r4
                goto L_0x0019
            L_0x01fe:
                r0.ListMenuItemView = r2
                goto L_0x0372
            L_0x0202:
                if (r5 == 0) goto L_0x0214
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setPopupCallback = r4
                goto L_0x0019
            L_0x0214:
                r0.setPopupCallback = r2
                goto L_0x0372
            L_0x0218:
                if (r5 == 0) goto L_0x022a
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.f2719x50fd9e4a = r4
                goto L_0x0019
            L_0x022a:
                r0.f2719x50fd9e4a = r2
                goto L_0x0372
            L_0x022e:
                if (r5 == 0) goto L_0x0240
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.AlertController$RecycleListView = r4
                goto L_0x0019
            L_0x0240:
                r0.AlertController$RecycleListView = r2
                goto L_0x0372
            L_0x0244:
                if (r5 == 0) goto L_0x0256
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaBrowserCompat$SearchResultReceiver = r4
                goto L_0x0019
            L_0x0256:
                r0.MediaBrowserCompat$SearchResultReceiver = r2
                goto L_0x0372
            L_0x025a:
                if (r5 == 0) goto L_0x026c
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.AppCompatDialogFragment = r4
                goto L_0x0019
            L_0x026c:
                r0.AppCompatDialogFragment = r2
                goto L_0x0372
            L_0x0270:
                if (r5 == 0) goto L_0x0282
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaSessionCompat$QueueItem = r4
                goto L_0x0019
            L_0x0282:
                r0.MediaSessionCompat$QueueItem = r2
                goto L_0x0372
            L_0x0286:
                if (r5 == 0) goto L_0x0298
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.read = r4
                goto L_0x0019
            L_0x0298:
                r0.read = r2
                goto L_0x0372
            L_0x029c:
                if (r5 == 0) goto L_0x02ae
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setIcon = r4
                goto L_0x0019
            L_0x02ae:
                r0.setIcon = r2
                goto L_0x0372
            L_0x02b2:
                if (r5 == 0) goto L_0x02c4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.AppCompatDelegateImpl$ListMenuDecorView = r4
                goto L_0x0019
            L_0x02c4:
                r0.AppCompatDelegateImpl$ListMenuDecorView = r2
                goto L_0x0372
            L_0x02c8:
                if (r5 == 0) goto L_0x02da
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaBrowserCompat$MediaItem = r4
                goto L_0x0019
            L_0x02da:
                r0.MediaBrowserCompat$MediaItem = r2
                goto L_0x0372
            L_0x02de:
                if (r5 == 0) goto L_0x02f0
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.AppCompatActivity = r4
                goto L_0x0019
            L_0x02f0:
                r0.AppCompatActivity = r2
                goto L_0x0372
            L_0x02f4:
                if (r5 == 0) goto L_0x0306
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.RatingCompat = r4
                goto L_0x0019
            L_0x0306:
                r0.RatingCompat = r2
                goto L_0x0372
            L_0x0309:
                if (r5 == 0) goto L_0x031b
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.ActionMenuItemView = r4
                goto L_0x0019
            L_0x031b:
                r0.ActionMenuItemView = r2
                goto L_0x0372
            L_0x031e:
                if (r5 == 0) goto L_0x0372
                java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r0.setPadding = r4
                goto L_0x0019
            L_0x0334:
                if (r5 == 0) goto L_0x0346
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.setShortcut = r4
                goto L_0x0019
            L_0x0346:
                r0.setShortcut = r2
                goto L_0x0372
            L_0x0349:
                if (r5 == 0) goto L_0x035b
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.MediaBrowserCompat$ItemReceiver = r4
                goto L_0x0019
            L_0x035b:
                r0.MediaBrowserCompat$ItemReceiver = r2
                goto L_0x0372
            L_0x035e:
                if (r5 == 0) goto L_0x0370
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.google.gson.TypeAdapter r4 = r1.getAdapter(r4)
                java.lang.Object r4 = r4.read(r8)
                java.lang.String r4 = (java.lang.String) r4
                r0.PlaybackStateCompat = r4
                goto L_0x0019
            L_0x0370:
                r0.PlaybackStateCompat = r2
            L_0x0372:
                r8.nextNull()
                goto L_0x0019
            L_0x0377:
                r8.endObject()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.GoogleMap.OnInfoWindowCloseListener.read(com.google.gson.stream.JsonReader):java.lang.Object");
        }
    }

    /* renamed from: o.GoogleMap$OnInfoWindowLongClickListener */
    public final class OnInfoWindowLongClickListener extends TypeAdapter implements addKernel {
        private validateDAGRecurse IconCompatParcelizer;
        private validateCycle MediaBrowserCompat$ItemReceiver;
        private Gson read;

        public OnInfoWindowLongClickListener(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
            this.read = gson;
            this.MediaBrowserCompat$ItemReceiver = validatecycle;
            this.IconCompatParcelizer = validatedagrecurse;
        }

        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            onIndoorLevelActivated onindoorlevelactivated = (onIndoorLevelActivated) obj;
            Gson gson = this.read;
            validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
            jsonWriter.beginObject();
            if (onindoorlevelactivated != onindoorlevelactivated.write) {
                validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA);
                String str = onindoorlevelactivated.write;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
            }
            if (onindoorlevelactivated != onindoorlevelactivated.read) {
                validatedagrecurse.read(jsonWriter, 413);
                String str2 = onindoorlevelactivated.read;
                findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
            }
            onindoorlevelactivated.write(gson, jsonWriter, validatedagrecurse);
            jsonWriter.endObject();
        }

        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                return null;
            }
            onIndoorLevelActivated onindoorlevelactivated = new onIndoorLevelActivated();
            Gson gson = this.read;
            validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                int write = validatecycle.write(jsonReader);
                boolean z = jsonReader.peek() != JsonToken.NULL;
                if (write != 128) {
                    if (write != 431) {
                        onindoorlevelactivated.IconCompatParcelizer(gson, jsonReader, write);
                    } else if (z) {
                        onindoorlevelactivated.read = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        onindoorlevelactivated.read = null;
                    }
                } else if (z) {
                    onindoorlevelactivated.write = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    onindoorlevelactivated.write = null;
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return onindoorlevelactivated;
        }
    }

    /* renamed from: o.GoogleMap$OnPolygonClickListener */
    public final class OnPolygonClickListener {
        public final String IconCompatParcelizer;
        public final Double MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPolygonClickListener)) {
                return false;
            }
            OnPolygonClickListener onPolygonClickListener = (OnPolygonClickListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onPolygonClickListener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onPolygonClickListener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onPolygonClickListener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onPolygonClickListener.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            Double d = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (d != null) {
                i = d.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CreditCardFullAmount(merchantId=");
            sb.append(this.read);
            sb.append(", terminalId=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", orderReference=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", paymentAmount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public OnPolygonClickListener(String str, String str2, String str3, Double d) {
            this.read = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = d;
        }
    }

    /* renamed from: o.GoogleMap$OnPolylineClickListener */
    public final class OnPolylineClickListener {
        @SerializedName("terminal")
        public final String IconCompatParcelizer;
        @SerializedName("code")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("id")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("urlLogo")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("name")
        public final String read;
        @SerializedName("referenceOrder")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPolylineClickListener)) {
                return false;
            }
            OnPolylineClickListener onPolylineClickListener = (OnPolylineClickListener) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onPolylineClickListener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onPolylineClickListener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onPolylineClickListener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onPolylineClickListener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) onPolylineClickListener.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onPolylineClickListener.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.IconCompatParcelizer;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.write;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MerchantInfo(id=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", name=");
            sb.append(this.read);
            sb.append(", code=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", terminal=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", urlLogo=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", referenceOrder=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public OnPolylineClickListener(String str, String str2, String str3, String str4, String str5, String str6) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.read = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.IconCompatParcelizer = str4;
            this.MediaBrowserCompat$SearchResultReceiver = str5;
            this.write = str6;
        }
    }
}
