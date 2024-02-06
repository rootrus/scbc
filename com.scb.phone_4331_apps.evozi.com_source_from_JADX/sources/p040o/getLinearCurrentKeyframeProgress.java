package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getLinearCurrentKeyframeProgress */
public final class getLinearCurrentKeyframeProgress {
    @SerializedName("applicationUuid")
    public final String IconCompatParcelizer;
    @SerializedName("customerContactInfo")
    public final getMasks MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("consentDocuments")
    public final List<LottieTask> MediaBrowserCompat$ItemReceiver;
    @SerializedName("requestedProduct")
    public final getAscent MediaBrowserCompat$MediaItem;
    @SerializedName("productType")
    public final String MediaMetadataCompat;
    @SerializedName("uploadedDocumentAmount")
    public final String RatingCompat;
    @SerializedName("mainOperatingAccount")
    public final read read;
    @SerializedName("occupationInfo")
    public final getEndProgress write;

    /* renamed from: o.getLinearCurrentKeyframeProgress$read */
    public static final class read {
        @SerializedName("accountNo")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("accountName")
        public final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) read2.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
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
            sb.append("MainOperatingAccount(accountNo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", accountName=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLinearCurrentKeyframeProgress)) {
            return false;
        }
        getLinearCurrentKeyframeProgress getlinearcurrentkeyframeprogress = (getLinearCurrentKeyframeProgress) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getlinearcurrentkeyframeprogress.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getlinearcurrentkeyframeprogress.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getlinearcurrentkeyframeprogress.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getlinearcurrentkeyframeprogress.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getlinearcurrentkeyframeprogress.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getlinearcurrentkeyframeprogress.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlinearcurrentkeyframeprogress.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlinearcurrentkeyframeprogress.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        getMasks getmasks = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = getmasks != null ? getmasks.hashCode() : 0;
        getAscent getascent = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = getascent != null ? getascent.hashCode() : 0;
        getEndProgress getendprogress = this.write;
        int hashCode5 = getendprogress != null ? getendprogress.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        read read2 = this.read;
        int hashCode7 = read2 != null ? read2.hashCode() : 0;
        List<LottieTask> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlApplicationsEntity(applicationUuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", customerContactInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", requestedProduct=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", occupationInfo=");
        sb.append(this.write);
        sb.append(", uploadedDocumentAmount=");
        sb.append(this.RatingCompat);
        sb.append(", mainOperatingAccount=");
        sb.append(this.read);
        sb.append(", consentDocuments=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
