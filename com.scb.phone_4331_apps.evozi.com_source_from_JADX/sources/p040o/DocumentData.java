package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.DocumentData */
public final class DocumentData {
    @SerializedName("options")
    public final List<setVertex> read;
    @SerializedName("defaultOption")
    public final String write;

    /* renamed from: o.DocumentData$Justification */
    public final class Justification {
        @SerializedName("installmentAmount")
        public final String IconCompatParcelizer;
        @SerializedName("frontEndFee")
        public final getOffset MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("dutyStampFee")
        public final getOffset MediaBrowserCompat$ItemReceiver;
        @SerializedName("installmentFrequency")
        public final Marker MediaBrowserCompat$MediaItem;
        @SerializedName(alternate = {"netAmountReceived"}, value = "netTransferAmount")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("productType")
        public final String MediaDescriptionCompat;
        @SerializedName("repaymentDate")
        public final IconCompatParcelizer MediaMetadataCompat;
        @SerializedName("repaymentStartDate")
        public final String MediaSessionCompat$QueueItem;
        @SerializedName("interestRate")
        public final List<getGradientColor> MediaSessionCompat$ResultReceiverWrapper;
        @SerializedName("transferFee")
        public final String ParcelableVolumeInfo;
        @SerializedName("principal")
        public final String RatingCompat;
        @SerializedName(alternate = {"contactInfo"}, value = "customerContactInfo")
        public final createStarPath read;
        @SerializedName("duration")
        public final String write;

        /* renamed from: o.DocumentData$Justification$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            @SerializedName("code")
            public final String IconCompatParcelizer;
            @SerializedName("description")
            public final String MediaBrowserCompat$ItemReceiver;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IconCompatParcelizer)) {
                    return false;
                }
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
            }

            public final int hashCode() {
                String str = this.IconCompatParcelizer;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return (hashCode * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("RepaymentDate(code=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", description=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Justification)) {
                return false;
            }
            Justification justification = (Justification) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) justification.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) justification.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) justification.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) justification.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) justification.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) justification.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) justification.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) justification.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) justification.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) justification.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) justification.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) justification.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) justification.MediaSessionCompat$ResultReceiverWrapper);
        }

        public final int hashCode() {
            String str = this.RatingCompat;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            Marker marker = this.MediaBrowserCompat$MediaItem;
            int hashCode4 = marker != null ? marker.hashCode() : 0;
            IconCompatParcelizer iconCompatParcelizer = this.MediaMetadataCompat;
            int hashCode5 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
            getOffset getoffset = this.MediaBrowserCompat$ItemReceiver;
            int hashCode6 = getoffset != null ? getoffset.hashCode() : 0;
            getOffset getoffset2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode7 = getoffset2 != null ? getoffset2.hashCode() : 0;
            String str4 = this.ParcelableVolumeInfo;
            int hashCode8 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode9 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaSessionCompat$QueueItem;
            int hashCode10 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.MediaDescriptionCompat;
            int hashCode11 = str7 != null ? str7.hashCode() : 0;
            createStarPath createstarpath = this.read;
            int hashCode12 = createstarpath != null ? createstarpath.hashCode() : 0;
            List<getGradientColor> list = this.MediaSessionCompat$ResultReceiverWrapper;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlSetupEntity(principal=");
            sb.append(this.RatingCompat);
            sb.append(", duration=");
            sb.append(this.write);
            sb.append(", installmentAmount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", installmentFrequency=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", repaymentDate=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", dutyStampFee=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", frontEndFee=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", transferFee=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", netTransferAmount=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", repaymentStartDate=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(", productType=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", customerContactInfo=");
            sb.append(this.read);
            sb.append(", tierRateList=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentData)) {
            return false;
        }
        DocumentData documentData = (DocumentData) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) documentData.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) documentData.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<setVertex> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlRepaymentEntity(defaultOption=");
        sb.append(this.write);
        sb.append(", options=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
