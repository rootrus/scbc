package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.MergePathsContent;

/* renamed from: o.toContent */
public final class toContent {
    @SerializedName("businessInfo")
    public final IconCompatParcelizer IconCompatParcelizer;
    @SerializedName("customerContactInfo")
    public final toContent$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("spouseInfo")
    public final read MediaBrowserCompat$ItemReceiver;
    @SerializedName("uploadedDocumentAmount")
    public final String MediaMetadataCompat;
    @SerializedName("requestedProduct")
    public final write read;
    @SerializedName("consentDocuments")
    public final List<String> write;

    /* renamed from: o.toContent$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        @SerializedName("businessName")
        public final String IconCompatParcelizer;
        @SerializedName("businessIndustry")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("businessAddress")
        public final List<String> MediaBrowserCompat$ItemReceiver;
        @SerializedName("businessRegistrationNo")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("loanPurpose")
        public final List<String> MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("marketplaceUrl")

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final toContent$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver f2971x50fd9e4a;
        @SerializedName("businessUrl")
        public final String MediaDescriptionCompat;
        @SerializedName("companyPhone")
        public final String MediaMetadataCompat;
        @SerializedName("netIncome")
        public final String MediaSessionCompat$QueueItem;
        @SerializedName("operatingAccount")
        public final List<read> MediaSessionCompat$ResultReceiverWrapper;
        @SerializedName("sourceOfIncome")
        public final AnimatableTextFrame MediaSessionCompat$Token;
        @SerializedName("privilegedProfession")
        public final String ParcelableVolumeInfo;
        @SerializedName("storeType")
        public final List<String> PlaybackStateCompat;
        @SerializedName("businessType")
        public final String RatingCompat;
        @SerializedName("businessOnLease")
        public final String read;
        @SerializedName("businessExperience")
        public final MergePathsContent.C36531.write write;

        /* renamed from: o.toContent$IconCompatParcelizer$read */
        public static final class read {
            @SerializedName("bankLogo")
            public final String MediaBrowserCompat$ItemReceiver;
            @SerializedName("accountNo")
            public final String read;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof read)) {
                    return false;
                }
                read read2 = (read) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read2.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$ItemReceiver;
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
                sb.append("OperatingAccount(bankLogo=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", accountNo=");
                sb.append(this.read);
                sb.append(")");
                return sb.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) iconCompatParcelizer.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) iconCompatParcelizer.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) iconCompatParcelizer.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) iconCompatParcelizer.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.PlaybackStateCompat, (Object) iconCompatParcelizer.PlaybackStateCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) iconCompatParcelizer.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) iconCompatParcelizer.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2971x50fd9e4a, (Object) iconCompatParcelizer.f2971x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) iconCompatParcelizer.MediaSessionCompat$Token);
        }

        public final int hashCode() {
            String str = this.ParcelableVolumeInfo;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            List<String> list = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = list != null ? list.hashCode() : 0;
            String str3 = this.MediaMetadataCompat;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            MergePathsContent.C36531.write write2 = this.write;
            int hashCode5 = write2 != null ? write2.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode6 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.RatingCompat;
            int hashCode7 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$MediaItem;
            int hashCode8 = str6 != null ? str6.hashCode() : 0;
            List<String> list2 = this.PlaybackStateCompat;
            int hashCode9 = list2 != null ? list2.hashCode() : 0;
            String str7 = this.read;
            int hashCode10 = str7 != null ? str7.hashCode() : 0;
            List<String> list3 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode11 = list3 != null ? list3.hashCode() : 0;
            String str8 = this.MediaSessionCompat$QueueItem;
            int hashCode12 = str8 != null ? str8.hashCode() : 0;
            List<read> list4 = this.MediaSessionCompat$ResultReceiverWrapper;
            int hashCode13 = list4 != null ? list4.hashCode() : 0;
            String str9 = this.MediaDescriptionCompat;
            int hashCode14 = str9 != null ? str9.hashCode() : 0;
            toContent$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver = this.f2971x50fd9e4a;
            int hashCode15 = tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver != null ? tocontent_iconcompatparcelizer_mediabrowsercompat_itemreceiver.hashCode() : 0;
            AnimatableTextFrame animatableTextFrame = this.MediaSessionCompat$Token;
            return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + (animatableTextFrame != null ? animatableTextFrame.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BusinessInfo(privilegedProfession=");
            sb.append(this.ParcelableVolumeInfo);
            sb.append(", businessName=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", businessAddress=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", companyPhone=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", businessExperience=");
            sb.append(this.write);
            sb.append(", businessIndustry=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", businessType=");
            sb.append(this.RatingCompat);
            sb.append(", businessRegistrationNo=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", storeType=");
            sb.append(this.PlaybackStateCompat);
            sb.append(", businessOnLease=");
            sb.append(this.read);
            sb.append(", loanPurpose=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", netIncome=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append(", operatingAccount=");
            sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
            sb.append(", businessUrl=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", marketplaceUrl=");
            sb.append(this.f2971x50fd9e4a);
            sb.append(", sourceOfIncome=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.toContent$read */
    public static final class read {
        @SerializedName("citizenId")
        public final String IconCompatParcelizer;
        @SerializedName("thaiName")
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) read.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SpouseInfo(thaiName=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", citizenId=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.toContent$write */
    public static final class write {
        @SerializedName("annualInterest")
        public final String IconCompatParcelizer;
        @SerializedName("duration")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("installmentAmount")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("principal")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("repaymentDate")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("tierRateList")
        public final List<lerp> MediaDescriptionCompat;
        @SerializedName("repaymentStartDate")
        public final String MediaMetadataCompat;
        @SerializedName("installmentFrequency")
        public final toContent$write$MediaBrowserCompat$ItemReceiver read;
        @SerializedName("dutyStampFee")
        public final read write;

        /* renamed from: o.toContent$write$read */
        public static final class read {
            @SerializedName("rate")
            public final String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("maxAmount")
            public final String MediaBrowserCompat$ItemReceiver;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof read)) {
                    return false;
                }
                read read = (read) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) read.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read.MediaBrowserCompat$ItemReceiver);
            }

            public final int hashCode() {
                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
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
                sb.append("DutyStampFee(rate=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", maxAmount=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write2 = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) write2.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write2.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) write2.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) write2.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) write2.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) write2.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) write2.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$MediaItem;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            toContent$write$MediaBrowserCompat$ItemReceiver tocontent_write_mediabrowsercompat_itemreceiver = this.read;
            int hashCode4 = tocontent_write_mediabrowsercompat_itemreceiver != null ? tocontent_write_mediabrowsercompat_itemreceiver.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.IconCompatParcelizer;
            int hashCode6 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaMetadataCompat;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            List<lerp> list = this.MediaDescriptionCompat;
            int hashCode8 = list != null ? list.hashCode() : 0;
            read read2 = this.write;
            if (read2 != null) {
                i = read2.hashCode();
            }
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RequestedProduct(principal=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", duration=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", installmentAmount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", installmentFrequencyEntity=");
            sb.append(this.read);
            sb.append(", repaymentDate=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", annualInterest=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", repaymentStartDate=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", tierRateList=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", dutyStampFee=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toContent)) {
            return false;
        }
        toContent tocontent = (toContent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) tocontent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) tocontent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) tocontent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) tocontent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) tocontent.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) tocontent.write);
    }

    public final int hashCode() {
        write write2 = this.read;
        int i = 0;
        int hashCode = write2 != null ? write2.hashCode() : 0;
        toContent$MediaBrowserCompat$CustomActionResultReceiver tocontent_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = tocontent_mediabrowsercompat_customactionresultreceiver != null ? tocontent_mediabrowsercompat_customactionresultreceiver.hashCode() : 0;
        read read2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = read2 != null ? read2.hashCode() : 0;
        IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        int hashCode4 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
        String str = this.MediaMetadataCompat;
        int hashCode5 = str != null ? str.hashCode() : 0;
        List<String> list = this.write;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessOwnerReviewSubmissionEntity(requestedProduct=");
        sb.append(this.read);
        sb.append(", customerContactInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", spouseInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", businessInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", uploadedDocumentAmount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", consentDocuments=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
