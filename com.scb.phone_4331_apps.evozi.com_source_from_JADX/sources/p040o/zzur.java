package p040o;

import kotlin.TypeCastException;

/* renamed from: o.zzur */
public final class zzur extends zzuj {
    String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String RatingCompat;
    String read;
    public String write;

    public /* synthetic */ zzur() {
    }

    private zzur(int i, String str, zzrm zzrm) {
        super(i, str, zzrm);
    }

    public zzur(int i, String str, zzrm zzrm, String str2, String str3, String str4, String str5, String str6) {
        this(i, str, zzrm);
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.write = str3;
        this.RatingCompat = str4;
        this.read = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            zzur zzur = (zzur) obj;
            if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) zzur.MediaBrowserCompat$SearchResultReceiver)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzur.write)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zzur.RatingCompat)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzur.read)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzur.MediaBrowserCompat$CustomActionResultReceiver))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.MerchantWalletAccount");
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }
}
