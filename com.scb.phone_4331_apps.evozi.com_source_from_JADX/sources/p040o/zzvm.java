package p040o;

import p040o.zzag;

/* renamed from: o.zzvm */
public final class zzvm {
    public zzag.zza IconCompatParcelizer;
    public zzag.zza MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public zzvm$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$MediaItem;
    public zzag.zza MediaDescriptionCompat;
    public zzag.zza MediaMetadataCompat;
    write RatingCompat;
    public zzag.zza read;
    public String write;

    /* renamed from: o.zzvm$write */
    public enum write {
        FakeWhite,
        FakeBlack
    }

    public /* synthetic */ zzvm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvm)) {
            return false;
        }
        zzvm zzvm = (zzvm) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzvm.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzvm.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) zzvm.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) zzvm.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzvm.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) zzvm.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzvm.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzvm.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zzvm.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        zzag.zza zza = this.MediaDescriptionCompat;
        int hashCode3 = zza != null ? zza.hashCode() : 0;
        write write2 = this.RatingCompat;
        int hashCode4 = write2 != null ? write2.hashCode() : 0;
        zzag.zza zza2 = this.IconCompatParcelizer;
        int hashCode5 = zza2 != null ? zza2.hashCode() : 0;
        zzag.zza zza3 = this.MediaMetadataCompat;
        int hashCode6 = zza3 != null ? zza3.hashCode() : 0;
        zzag.zza zza4 = this.read;
        int hashCode7 = zza4 != null ? zza4.hashCode() : 0;
        zzag.zza zza5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode8 = zza5 != null ? zza5.hashCode() : 0;
        zzvm$MediaBrowserCompat$CustomActionResultReceiver zzvm_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$MediaItem;
        if (zzvm_mediabrowsercompat_customactionresultreceiver != null) {
            i = zzvm_mediabrowsercompat_customactionresultreceiver.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdBannerInfo(adsId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", adsName=");
        sb.append(this.write);
        sb.append(", imageUrl=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", fontColor=");
        sb.append(this.RatingCompat);
        sb.append(", deeplinkUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", header=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(", buttonText=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", formatType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    public zzvm(String str, String str2, zzag.zza zza, write write2, zzag.zza zza2, zzag.zza zza3, zzag.zza zza4, zzag.zza zza5, zzvm$MediaBrowserCompat$CustomActionResultReceiver zzvm_mediabrowsercompat_customactionresultreceiver) {
        onGetStartedClick.write((Object) str, "adsId");
        onGetStartedClick.write((Object) str2, "adsName");
        onGetStartedClick.write((Object) zza, "imageUrl");
        onGetStartedClick.write((Object) zza2, "deeplinkUrl");
        onGetStartedClick.write((Object) zzvm_mediabrowsercompat_customactionresultreceiver, "formatType");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.MediaDescriptionCompat = zza;
        this.RatingCompat = write2;
        this.IconCompatParcelizer = zza2;
        this.MediaMetadataCompat = zza3;
        this.read = zza4;
        this.MediaBrowserCompat$CustomActionResultReceiver = zza5;
        this.MediaBrowserCompat$MediaItem = zzvm_mediabrowsercompat_customactionresultreceiver;
    }
}
