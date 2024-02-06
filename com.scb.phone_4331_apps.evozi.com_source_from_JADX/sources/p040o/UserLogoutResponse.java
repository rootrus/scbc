package p040o;

import java.util.LinkedHashMap;
import java.util.Map;
import p040o.LookAndFeelParameters;
import p040o.LookAndFeelParameters.TorchMode;
import p040o.onUncaughtException;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: o.UserLogoutResponse */
public final class UserLogoutResponse<T extends LookAndFeelParameters.TorchMode> extends writeUInt64NoTag<T> {
    public final setCollapsedTitleTextColor IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    public String MediaMetadataCompat = "";
    public Map<zzfe.zza, onUncaughtException.IconCompatParcelizer.C10756IconCompatParcelizer> read = new LinkedHashMap();
    public final setExpandedTitleTypeface write;

    /* renamed from: o.UserLogoutResponse$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ zzfe.zza IconCompatParcelizer;

        public IconCompatParcelizer(zzfe.zza zza) {
            this.IconCompatParcelizer = zza;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LookAndFeelParameters.TorchMode) obj).MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.UserLogoutResponse$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ UserLogoutResponse MediaBrowserCompat$ItemReceiver;

        public MediaDescriptionCompat(UserLogoutResponse userLogoutResponse) {
            this.MediaBrowserCompat$ItemReceiver = userLogoutResponse;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
            if (r0 != false) goto L_0x0046;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r6) {
            /*
                r5 = this;
                o.LookAndFeelParameters$TorchMode r6 = (p040o.LookAndFeelParameters.TorchMode) r6
                o.UserLogoutResponse r0 = r5.MediaBrowserCompat$ItemReceiver
                boolean r0 = r0.MediaBrowserCompat$ItemReceiver
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0045
                o.UserLogoutResponse r0 = r5.MediaBrowserCompat$ItemReceiver
                java.util.Map r0 = r0.read
                java.util.Collection r0 = r0.values()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                boolean r3 = r0 instanceof java.util.Collection
                if (r3 == 0) goto L_0x0026
                r3 = r0
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0026
                goto L_0x0041
            L_0x0026:
                java.util.Iterator r0 = r0.iterator()
            L_0x002a:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0041
                java.lang.Object r3 = r0.next()
                o.onUncaughtException$IconCompatParcelizer$IconCompatParcelizer r3 = (p040o.onUncaughtException.IconCompatParcelizer.C10756IconCompatParcelizer) r3
                o.onUncaughtException$IconCompatParcelizer$IconCompatParcelizer r4 = p040o.onUncaughtException.IconCompatParcelizer.C10756IconCompatParcelizer.EMPTY
                if (r3 != r4) goto L_0x003c
                r3 = r1
                goto L_0x003d
            L_0x003c:
                r3 = r2
            L_0x003d:
                if (r3 == 0) goto L_0x002a
                r0 = r2
                goto L_0x0042
            L_0x0041:
                r0 = r1
            L_0x0042:
                if (r0 == 0) goto L_0x0045
                goto L_0x0046
            L_0x0045:
                r1 = r2
            L_0x0046:
                r6.write(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.UserLogoutResponse.MediaDescriptionCompat.IconCompatParcelizer(java.lang.Object):void");
        }
    }

    /* renamed from: o.UserLogoutResponse$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ zzfe.zza IconCompatParcelizer;
        private /* synthetic */ boolean write;

        public read(zzfe.zza zza, boolean z) {
            this.IconCompatParcelizer = zza;
            this.write = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LookAndFeelParameters.TorchMode) obj).write(this.IconCompatParcelizer, this.write);
        }
    }

    /* renamed from: o.UserLogoutResponse$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ boolean read;

        public write(boolean z) {
            this.read = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LookAndFeelParameters.TorchMode) obj).MediaBrowserCompat$ItemReceiver(this.read);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public UserLogoutResponse(RegularImmutableBiMap regularImmutableBiMap, setCollapsedTitleTextColor setcollapsedtitletextcolor, setExpandedTitleTypeface setexpandedtitletypeface) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setcollapsedtitletextcolor, "hmlGetApplicationUuid");
        onGetStartedClick.write((Object) setexpandedtitletypeface, "hmlGetProductTypeCase");
        this.IconCompatParcelizer = setcollapsedtitletextcolor;
        this.write = setexpandedtitletypeface;
    }

    public final void onDestroy() {
        setExpandedTitleTypeface setexpandedtitletypeface = this.write;
        if (!setexpandedtitletypeface.MediaBrowserCompat$MediaItem.isDisposed()) {
            setexpandedtitletypeface.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void write(UserLogoutResponse userLogoutResponse) {
        if (userLogoutResponse.RatingCompat != null) {
            userLogoutResponse.RatingCompat.aj_();
        }
    }
}
