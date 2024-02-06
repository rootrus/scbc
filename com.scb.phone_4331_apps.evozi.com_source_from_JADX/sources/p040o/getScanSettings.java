package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzcz;

/* renamed from: o.getScanSettings */
public abstract class getScanSettings extends writeUInt64NoTag<proxyGetIPassportDeserializerRtti> {
    final complementOf IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final setContentScrimColor MediaBrowserCompat$ItemReceiver;
    public final TextRecognizer MediaBrowserCompat$SearchResultReceiver;
    zzcz.zzg read;
    private final BottomSheetBehavior write;

    public abstract void IconCompatParcelizer();

    /* access modifiers changed from: protected */
    public abstract zzct.zza read();

    /* renamed from: o.getScanSettings$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDeserializerRtti> {
        private /* synthetic */ getScanSettings IconCompatParcelizer;

        public read(getScanSettings getscansettings) {
            this.IconCompatParcelizer = getscansettings;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
            if (r0 != null) goto L_0x0017;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r2) {
            /*
                r1 = this;
                o.proxyGetIPassportDeserializerRtti r2 = (p040o.proxyGetIPassportDeserializerRtti) r2
                o.getScanSettings r0 = r1.IconCompatParcelizer
                o.zzcz$zzg r0 = r0.read
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = r0.RatingCompat
                if (r0 == 0) goto L_0x0015
                o.zzjx$zza$zzb r0 = p040o.zzjx.zza.zzb.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0011 }
                goto L_0x0013
            L_0x0011:
                o.zzjx$zza$zzb r0 = p040o.zzjx.zza.zzb.GENERAL
            L_0x0013:
                if (r0 != 0) goto L_0x0017
            L_0x0015:
                o.zzjx$zza$zzb r0 = p040o.zzjx.zza.zzb.GENERAL
            L_0x0017:
                r2.MediaBrowserCompat$CustomActionResultReceiver(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getScanSettings.read.IconCompatParcelizer(java.lang.Object):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getScanSettings(RegularImmutableBiMap regularImmutableBiMap, setContentScrimColor setcontentscrimcolor, BottomSheetBehavior bottomSheetBehavior, TextRecognizer textRecognizer, complementOf complementof) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setcontentscrimcolor, "getCalculatorData");
        onGetStartedClick.write((Object) bottomSheetBehavior, "resetCalculatorCase");
        onGetStartedClick.write((Object) textRecognizer, "hmlConsentCase");
        onGetStartedClick.write((Object) complementof, "displayMapper");
        this.MediaBrowserCompat$ItemReceiver = setcontentscrimcolor;
        this.write = bottomSheetBehavior;
        this.MediaBrowserCompat$SearchResultReceiver = textRecognizer;
        this.IconCompatParcelizer = complementof;
    }

    /* renamed from: o.getScanSettings$write */
    public static final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onCircleClick> {
        private /* synthetic */ getScanSettings$MediaBrowserCompat$ItemReceiver read;
        private /* synthetic */ getScanSettings write;

        public write(getScanSettings getscansettings, getScanSettings$MediaBrowserCompat$ItemReceiver getscansettings_mediabrowsercompat_itemreceiver) {
            this.write = getscansettings;
            this.read = getscansettings_mediabrowsercompat_itemreceiver;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onCircleClick oncircleclick = (onCircleClick) obj;
            onGetStartedClick.write((Object) oncircleclick, "privacyConsentContent");
            super.onNext(oncircleclick);
            this.read.MediaBrowserCompat$ItemReceiver(oncircleclick.IconCompatParcelizer);
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    public void onDestroy() {
        this.write.read.setItemInvoker();
        setContentScrimColor setcontentscrimcolor = this.MediaBrowserCompat$ItemReceiver;
        if (!setcontentscrimcolor.MediaBrowserCompat$MediaItem.isDisposed()) {
            setcontentscrimcolor.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getScanSettings getscansettings) {
        if (getscansettings.RatingCompat != null) {
            getscansettings.RatingCompat.aj_();
        }
    }
}
