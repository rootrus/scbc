package p040o;

import p040o.CrashlyticsController;
import p040o.zzfe;
import p040o.zzfy;

/* renamed from: o.createReportUploader */
public final class createReportUploader extends CrashlyticsController.C32378 {
    public final zzfe.zzc IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final zzfy.zzd MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    private final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final setShortcutName f2812x50fd9e4a;
    public final int MediaDescriptionCompat;
    public final Integer MediaMetadataCompat;
    public final Integer RatingCompat;
    public final String read;
    public final String write;

    public /* synthetic */ createReportUploader(String str, zzfy.zzd zzd, zzfe.zzc zzc, String str2, String str3, String str4, String str5, Integer num, Integer num2, int i) {
        this(str, zzd, zzc, str2, str3, str4, str5, num, num2, i, setShortcutName.ITEM);
    }

    public final setShortcutName MediaBrowserCompat$CustomActionResultReceiver() {
        return this.f2812x50fd9e4a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private createReportUploader(String str, zzfy.zzd zzd, zzfe.zzc zzc, String str2, String str3, String str4, String str5, Integer num, Integer num2, int i, setShortcutName setshortcutname) {
        super((byte) 0);
        onGetStartedClick.write((Object) str, "documentDesc");
        onGetStartedClick.write((Object) zzd, "documentStatus");
        onGetStartedClick.write((Object) zzc, "documentCode");
        onGetStartedClick.write((Object) str2, "documentType");
        onGetStartedClick.write((Object) str3, "groupLabel");
        onGetStartedClick.write((Object) str4, "documentName");
        onGetStartedClick.write((Object) setshortcutname, "type");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = zzd;
        this.IconCompatParcelizer = zzc;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.read = str5;
        this.RatingCompat = num;
        this.MediaMetadataCompat = num2;
        this.MediaDescriptionCompat = i;
        this.f2812x50fd9e4a = setshortcutname;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createReportUploader)) {
            return false;
        }
        createReportUploader createreportuploader = (createReportUploader) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) createreportuploader.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) createreportuploader.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) createreportuploader.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) createreportuploader.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) createreportuploader.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) createreportuploader.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) createreportuploader.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) createreportuploader.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) createreportuploader.MediaMetadataCompat) && this.MediaDescriptionCompat == createreportuploader.MediaDescriptionCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2812x50fd9e4a, (Object) createreportuploader.f2812x50fd9e4a);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        zzfy.zzd zzd = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = zzd != null ? zzd.hashCode() : 0;
        zzfe.zzc zzc = this.IconCompatParcelizer;
        int hashCode3 = zzc != null ? zzc.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode7 = str5 != null ? str5.hashCode() : 0;
        Integer num = this.RatingCompat;
        int hashCode8 = num != null ? num.hashCode() : 0;
        Integer num2 = this.MediaMetadataCompat;
        int hashCode9 = num2 != null ? num2.hashCode() : 0;
        int i2 = this.MediaDescriptionCompat;
        setShortcutName setshortcutname = this.f2812x50fd9e4a;
        if (setshortcutname != null) {
            i = setshortcutname.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDocumentItemDisplay(documentDesc=");
        sb.append(this.write);
        sb.append(", documentStatus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", documentCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", documentType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", groupLabel=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", documentName=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", documentDetails=");
        sb.append(this.read);
        sb.append(", numUploadedForEachDocType=");
        sb.append(this.RatingCompat);
        sb.append(", minQuantity=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", documentUploadedQuantity=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", type=");
        sb.append(this.f2812x50fd9e4a);
        sb.append(")");
        return sb.toString();
    }
}
