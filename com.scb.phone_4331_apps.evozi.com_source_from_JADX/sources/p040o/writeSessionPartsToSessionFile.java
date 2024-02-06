package p040o;

import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.CrashlyticsController;

/* renamed from: o.writeSessionPartsToSessionFile */
public final class writeSessionPartsToSessionFile {
    public final boolean IconCompatParcelizer;
    public final List<C5462x904c0edb> MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final double MediaBrowserCompat$MediaItem;
    public final double MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    private final String MediaSessionCompat$QueueItem;
    public final CrashlyticsController.ReportUploaderFilesProvider RatingCompat;
    public final double read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeSessionPartsToSessionFile)) {
            return false;
        }
        writeSessionPartsToSessionFile writesessionpartstosessionfile = (writeSessionPartsToSessionFile) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) writesessionpartstosessionfile.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) writesessionpartstosessionfile.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) writesessionpartstosessionfile.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) writesessionpartstosessionfile.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) writesessionpartstosessionfile.MediaMetadataCompat) && Double.compare(this.MediaBrowserCompat$MediaItem, writesessionpartstosessionfile.MediaBrowserCompat$MediaItem) == 0 && Double.compare(this.read, writesessionpartstosessionfile.read) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, writesessionpartstosessionfile.MediaBrowserCompat$SearchResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) writesessionpartstosessionfile.MediaBrowserCompat$CustomActionResultReceiver) && this.IconCompatParcelizer == writesessionpartstosessionfile.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) writesessionpartstosessionfile.RatingCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$QueueItem;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$MediaItem);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.read);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        List<C5462x904c0edb> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = list != null ? list.hashCode() : 0;
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        CrashlyticsController.ReportUploaderFilesProvider reportUploaderFilesProvider = this.RatingCompat;
        if (reportUploaderFilesProvider != null) {
            i = reportUploaderFilesProvider.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode6) * 31) + (z ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlLandingDisplay(loanStatus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", applicationUuid=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", imageUrl=");
        sb.append(this.write);
        sb.append(", title=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", subtitle=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", minimumAmount=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", maximumAmount=");
        sb.append(this.read);
        sb.append(", stepAmount=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", installmentFrequency=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", gracePeriodHideFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productCatalogue=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }

    public writeSessionPartsToSessionFile(String str, String str2, String str3, String str4, String str5, double d, double d2, double d3, List<C5462x904c0edb> list, boolean z, CrashlyticsController.ReportUploaderFilesProvider reportUploaderFilesProvider) {
        onGetStartedClick.write((Object) str3, "imageUrl");
        onGetStartedClick.write((Object) str4, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str5, "subtitle");
        onGetStartedClick.write((Object) list, "installmentFrequency");
        onGetStartedClick.write((Object) reportUploaderFilesProvider, "productCatalogue");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaSessionCompat$QueueItem = str2;
        this.write = str3;
        this.MediaDescriptionCompat = str4;
        this.MediaMetadataCompat = str5;
        this.MediaBrowserCompat$MediaItem = d;
        this.read = d2;
        this.MediaBrowserCompat$SearchResultReceiver = d3;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.IconCompatParcelizer = z;
        this.RatingCompat = reportUploaderFilesProvider;
    }
}
