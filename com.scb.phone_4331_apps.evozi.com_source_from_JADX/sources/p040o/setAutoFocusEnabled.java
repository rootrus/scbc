package p040o;

import com.kofax.kmc.ken.engines.service.ImageService;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.CustomConcurrentHashMap;
import p040o.Iterables;
import p040o.LocalProjectProvider;
import p040o.zzct;

/* renamed from: o.setAutoFocusEnabled */
public final class setAutoFocusEnabled extends IndoorBuilding {
    private final refreshIfEmpty MediaBrowserCompat$CustomActionResultReceiver;
    private final LocalProjectProvider.C69375 MediaBrowserCompat$ItemReceiver;
    private final getAncestor read;
    public final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver write;

    /* renamed from: o.setAutoFocusEnabled$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        HML,
        DEFAULT
    }

    @HmlPinActivity
    public setAutoFocusEnabled(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r3, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$ItemReceiver = r3;
        this.write = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
        this.read = getancestor;
        this.MediaBrowserCompat$CustomActionResultReceiver = refreshifempty;
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver(CustomConcurrentHashMap.EntryFactory.C32966 r2) {
        return write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(r2));
    }

    public final DebitCardResetOtpActivity write(String str, String str2) {
        return write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(str, str2));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver(String str, String str2, IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer != IconCompatParcelizer.HML) {
            return write(this.MediaBrowserCompat$ItemReceiver.write(str, str2));
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver() == zzct.zza.BUSINESS_OWNER) {
            return write(this.MediaBrowserCompat$CustomActionResultReceiver.read(str2));
        }
        return write(this.read.read(str2));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(zzvb zzvb, String str) {
        String str2 = null;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver() != zzct.zza.BUSINESS_OWNER) {
            return write(this.read.MediaBrowserCompat$ItemReceiver(zzvb.read, str, (String) null));
        }
        refreshIfEmpty refreshifempty = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = zzvb.read;
        String str4 = zzvb.write;
        String str5 = zzvb.IconCompatParcelizer;
        if (zzvb.MediaBrowserCompat$CustomActionResultReceiver != null) {
            str2 = getOnlyElement.IconCompatParcelizer(zzvb.MediaBrowserCompat$CustomActionResultReceiver, "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", ImageService.EXIF_TIME_FORMAT);
        }
        return write(refreshifempty.read(str3, str, (String) null, str4, str5, str2));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4, String str5, String str6) {
        return MediaBrowserCompat$CustomActionResultReceiver(str, new zzvb(str2, (String) null, (String) null, (String) null), str3, str4, str5, str6, (String) null);
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(String str, IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer == IconCompatParcelizer.HML) {
            return write(this.read.AppCompatViewInflater());
        }
        return write(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(str));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(String str, zzvb zzvb, String str2, String str3, String str4, String str5, String str6) {
        MultipartBody.Part MediaBrowserCompat$ItemReceiver2 = Iterables.C351810.MediaBrowserCompat$ItemReceiver(str, zzvb.read);
        if (!IconCompatParcelizer.HML.name().equals(str5)) {
            copyExpirableEntry copyexpirableentry = new copyExpirableEntry();
            copyexpirableentry.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver2;
            copyexpirableentry.write = Iterables.C351810.MediaBrowserCompat$CustomActionResultReceiver(zzvb.read);
            onGetStartedClick.write((Object) str2, "text");
            copyexpirableentry.MediaBrowserCompat$MediaItem = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), str2);
            onGetStartedClick.write((Object) str3, "text");
            copyexpirableentry.IconCompatParcelizer = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), str3);
            onGetStartedClick.write((Object) str4, "text");
            copyexpirableentry.MediaSessionCompat$Token = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), str4);
            if (str6 != null) {
                onGetStartedClick.write((Object) str6, "text");
                copyexpirableentry.read = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), str6);
            }
            return write(this.MediaBrowserCompat$ItemReceiver.write(copyexpirableentry));
        } else if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver() != zzct.zza.BUSINESS_OWNER) {
            return write(this.read.MediaBrowserCompat$ItemReceiver(zzvb.read, str2, str6));
        } else {
            return write(this.MediaBrowserCompat$CustomActionResultReceiver.read(zzvb.read, str2, str6, zzvb.write, zzvb.IconCompatParcelizer, zzvb.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }
}
