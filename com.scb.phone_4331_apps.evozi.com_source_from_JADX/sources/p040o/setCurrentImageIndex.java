package p040o;

import p040o.ExtractionParameters;
import p040o.writeUInt64NoTag;
import p040o.zzcz;

/* renamed from: o.setCurrentImageIndex */
public abstract class setCurrentImageIndex<T extends ExtractionParameters> extends writeUInt64NoTag<T> {
    zzcz.zzf.zza IconCompatParcelizer;
    IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    public final getComponents read;
    final setItemIconTintList write;

    /* renamed from: o.setCurrentImageIndex$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        OPEN_VERIFIED,
        ADD_VERIFIED,
        NO_VALUE_VERIFIED,
        NO_VERIFIED
    }

    /* renamed from: o.setCurrentImageIndex$write */
    public enum write {
        VERIFY_EMAIL,
        OPEN_ACCOUNT,
        ADD_ACCOUNT,
        SETUP_LOAN
    }

    public abstract void MediaBrowserCompat$CustomActionResultReceiver();

    public abstract boolean read();

    /* renamed from: o.setCurrentImageIndex$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ setCurrentImageIndex MediaBrowserCompat$CustomActionResultReceiver;

        read(setCurrentImageIndex setcurrentimageindex) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setcurrentimageindex;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ExtractionParameters extractionParameters = (ExtractionParameters) obj;
            IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            if (iconCompatParcelizer == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerState");
            }
            extractionParameters.read(iconCompatParcelizer);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setCurrentImageIndex(RegularImmutableBiMap regularImmutableBiMap, getComponents getcomponents, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getcomponents, "checkPrerequisitesCase");
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
        this.read = getcomponents;
        this.write = setitemicontintlist;
    }

    /* access modifiers changed from: protected */
    public final IconCompatParcelizer MediaBrowserCompat$ItemReceiver() {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        if (iconCompatParcelizer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerState");
        }
        return iconCompatParcelizer;
    }

    /* access modifiers changed from: protected */
    public final zzcz.zzf.zza IconCompatParcelizer() {
        zzcz.zzf.zza zza = this.IconCompatParcelizer;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prerequisites");
        }
        return zza;
    }
}
