package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.Layer */
public class Layer {
    @SerializedName("type")
    public String read;
    @SerializedName("amount")
    public String write;

    /* renamed from: o.Layer$LayerType */
    public final class LayerType {
        @SerializedName("sourceOfFund")
        public final String IconCompatParcelizer;
        @SerializedName("dividendWithholdingTaxFlag")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("creditLimit")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("sourceOfIncome")
        public final String MediaMetadataCompat;
        @SerializedName("showCreditLimitFlag")
        public final String read;
        @SerializedName("investPurpose")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayerType)) {
                return false;
            }
            LayerType layerType = (LayerType) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) layerType.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) layerType.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) layerType.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) layerType.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) layerType.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) layerType.read);
        }

        public final int hashCode() {
            String str = this.MediaMetadataCompat;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.read;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("InvestmentInfoReviewEntity(sourceOfIncome=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", sourceOfFund=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", investPurpose=");
            sb.append(this.write);
            sb.append(", creditLimit=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", dividendWithholdingTaxFlag=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", showCreditLimitFlag=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.Layer$MatteType */
    public final class MatteType {
        @SerializedName("accountSegmentDesc")
        public final String IconCompatParcelizer;
        @SerializedName("accountSegmentCode")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("aumValue")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("showCreditLimitFlag")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("minCreditLimit")
        public final String read;
        @SerializedName("maxCreditLimit")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MatteType)) {
                return false;
            }
            MatteType matteType = (MatteType) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) matteType.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) matteType.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) matteType.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) matteType.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) matteType.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) matteType.MediaBrowserCompat$MediaItem);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.read;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.write;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$MediaItem;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CreditLimitEntity(aumValue=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", accountSegmentCode=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", accountSegmentDesc=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", minCreditLimit=");
            sb.append(this.read);
            sb.append(", maxCreditLimit=");
            sb.append(this.write);
            sb.append(", showCreditLimitFlag=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(")");
            return sb.toString();
        }
    }
}
