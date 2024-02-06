package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.Registrar */
public final /* synthetic */ class Registrar implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ Registrar read = new Registrar();

    private /* synthetic */ Registrar() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj).read();
    }

    /* renamed from: o.Registrar$zza */
    public final /* synthetic */ class zza implements getAllowReturnTransitionOverlap {
        public static final /* synthetic */ zza MediaBrowserCompat$ItemReceiver = new zza();

        private /* synthetic */ zza() {
        }

        public final boolean write(Object obj) {
            return ((ThreadFactoryBuilder) obj).MediaDescriptionCompat;
        }
    }
}
