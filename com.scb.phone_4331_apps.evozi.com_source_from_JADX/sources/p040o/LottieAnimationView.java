package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LottieAnimationView */
public class LottieAnimationView extends addLottieOnCompositionLoadedListener {
    @SerializedName("currentCycleInfo")
    public setCompositionTask MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.LottieAnimationView$1 */
    public final class C12301 {
        @SerializedName("data")
        public final setSpeed IconCompatParcelizer;
    }

    /* renamed from: o.LottieAnimationView$2 */
    public final class C12312 {
        @SerializedName("registeredDepositAccountList")
        public final List<setRepeatMode> IconCompatParcelizer;
        @SerializedName("basicAccountRemark")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("debitCardTypeList")
        public final List<SavedState> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12312)) {
                return false;
            }
            C12312 r3 = (C12312) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            List<setRepeatMode> list = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            List<SavedState> list2 = this.write;
            int hashCode2 = list2 != null ? list2.hashCode() : 0;
            String str = this.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                i = str.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DebitCardRequestEntity(registeredDepositAccountList=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", debitCardTypeList=");
            sb.append(this.write);
            sb.append(", basicAccountRemark=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieAnimationView$SavedState */
    public final class SavedState {
        @SerializedName("additionalConsentEN")
        public final String IconCompatParcelizer;
        @SerializedName("cardCategory")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("binNo")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("imageURL")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("productCode")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("upgradeFee")

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final onResult f2551x50fd9e4a;
        @SerializedName("cardType")
        public final String MediaDescriptionCompat;
        @SerializedName("newFee")
        public final onResult MediaMetadataCompat;
        @SerializedName("replaceFee")
        public final onResult MediaSessionCompat$QueueItem;
        @SerializedName("saleSheetTH")
        public final String MediaSessionCompat$ResultReceiverWrapper;
        @SerializedName("saleSheetEN")
        public final String MediaSessionCompat$Token;
        @SerializedName("waiveReplaceFee")
        public final onResult ParcelableVolumeInfo;
        @SerializedName("cardSubType")
        public final String RatingCompat;
        @SerializedName("cardRank")
        public final int read;
        @SerializedName("additionalConsentTH")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) savedState.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) savedState.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) savedState.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) savedState.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) savedState.MediaBrowserCompat$MediaItem) && this.read == savedState.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) savedState.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) savedState.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) savedState.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2551x50fd9e4a, (Object) savedState.f2551x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) savedState.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) savedState.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) savedState.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) savedState.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) savedState.ParcelableVolumeInfo);
        }

        public final int hashCode() {
            String str = this.MediaDescriptionCompat;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.RatingCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$MediaItem;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            int i = this.read;
            String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            onResult onresult = this.MediaMetadataCompat;
            int hashCode7 = onresult != null ? onresult.hashCode() : 0;
            onResult onresult2 = this.MediaSessionCompat$QueueItem;
            int hashCode8 = onresult2 != null ? onresult2.hashCode() : 0;
            onResult onresult3 = this.f2551x50fd9e4a;
            int hashCode9 = onresult3 != null ? onresult3.hashCode() : 0;
            String str7 = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode10 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaSessionCompat$Token;
            int hashCode11 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.write;
            int hashCode12 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.IconCompatParcelizer;
            int hashCode13 = str10 != null ? str10.hashCode() : 0;
            onResult onresult4 = this.ParcelableVolumeInfo;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (onresult4 != null ? onresult4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DebitCardTypeEntity(cardType=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", cardSubType=");
            sb.append(this.RatingCompat);
            sb.append(", productCode=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", binNo=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", imageURL=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", cardRank=");
            sb.append(this.read);
            sb.append(", cardCategory=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", newFee=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", replaceFee=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(", upgradeFee=");
            sb.append(this.f2551x50fd9e4a);
            sb.append(", saleSheetTH=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(", saleSheetEN=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", additionalConsentTH=");
            sb.append(this.write);
            sb.append(", additionalConsentEN=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", waiveReplaceFee=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieAnimationView$4 */
    public final class C12344 {
        @SerializedName("accountNo")
        public final String IconCompatParcelizer;
        @SerializedName("debitPlusRemark")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("accountName")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("mailingAddress")
        public final List<String> MediaBrowserCompat$MediaItem;
        @SerializedName("deliveryFee")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("fee")
        public final String MediaDescriptionCompat;
        @SerializedName("issuingFee")
        public final String MediaMetadataCompat;
        @SerializedName("transactionToken")
        public final String MediaSessionCompat$QueueItem;
        @SerializedName("requestType")
        public final String ParcelableVolumeInfo;
        @SerializedName("remark")
        public final String RatingCompat;
        @SerializedName("debitCardName")
        public final String read;
        @SerializedName("annualFee")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12344)) {
                return false;
            }
            C12344 r3 = (C12344) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) r3.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) r3.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) r3.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) r3.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) r3.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) r3.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.ParcelableVolumeInfo;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.read;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaDescriptionCompat;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.write;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaMetadataCompat;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            List<String> list = this.MediaBrowserCompat$MediaItem;
            int hashCode9 = list != null ? list.hashCode() : 0;
            String str9 = this.MediaSessionCompat$QueueItem;
            int hashCode10 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.RatingCompat;
            int hashCode11 = str10 != null ? str10.hashCode() : 0;
            String str11 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str11 != null) {
                i = str11.hashCode();
            }
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DebitCardVerificationEntity(requestType=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", accountNo=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", accountName=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", debitCardName=");
            sb.append(this.read);
            sb.append(", fee=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", annualFee=");
            sb.append(this.write);
            sb.append(", issuingFee=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", deliveryFee=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", mailingAddress=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", transactionToken=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(", remark=");
            sb.append(this.RatingCompat);
            sb.append(", debitPlusRemark=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieAnimationView$5 */
    public final class C12355 {
        @SerializedName("en")
        private final String IconCompatParcelizer;
        @SerializedName("th")
        private final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12355)) {
                return false;
            }
            C12355 r3 = (C12355) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DebitCardTermsAndConditionsDataEntity(en=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", th=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }
    }
}
