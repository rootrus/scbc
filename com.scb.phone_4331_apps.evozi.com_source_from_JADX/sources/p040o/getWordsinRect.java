package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.ActivityTransition;
import p040o.getCurrentImageIndex;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.getWordsinRect */
public final /* synthetic */ class getWordsinRect implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCurrentImageIndex.C45414 MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ zziu.zza read;

    public /* synthetic */ getWordsinRect(getCurrentImageIndex.C45414 r1, zziu.zza zza) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.read = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        String str3;
        OffsetDateTime offsetDateTime;
        getCurrentImageIndex.C45414 r0 = this.MediaBrowserCompat$ItemReceiver;
        zziu.zza zza = this.read;
        getMRZ2 getmrz2 = (getMRZ2) obj;
        RegularImmutableSortedSet IconCompatParcelizer = getCurrentImageIndex.this.write;
        onGetStartedClick.write((Object) zza, "loanOffers");
        String str4 = zza.write;
        String str5 = null;
        if (str4 != null) {
            str = IconCompatParcelizer.mo26549c_(str4);
        } else {
            str = null;
        }
        ActivityTransition.Builder builder = zza.RatingCompat;
        boolean z = builder != null && builder.MediaBrowserCompat$CustomActionResultReceiver;
        ActivityTransition.Builder builder2 = zza.RatingCompat;
        if (builder2 != null) {
            str2 = IconCompatParcelizer.mo26549c_(builder2.MediaBrowserCompat$ItemReceiver);
        } else {
            str2 = null;
        }
        ActivityTransition.Builder builder3 = zza.RatingCompat;
        if (builder3 != null) {
            str3 = builder3.write;
        } else {
            str3 = null;
        }
        ActivityTransition.Builder builder4 = zza.RatingCompat;
        if (!(builder4 == null || (offsetDateTime = builder4.read) == null)) {
            str5 = IconCompatParcelizer.IconCompatParcelizer("dd MMM yyyy - HH:mm", offsetDateTime);
        }
        getmrz2.MediaBrowserCompat$CustomActionResultReceiver(new submitAllReports(str, z, str2, str3, str5), getCurrentImageIndex.this.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver(), getCurrentImageIndex.read(getCurrentImageIndex.this));
    }
}
