package p040o;

import p040o.C7039x355e6121;
import p040o.RttiJsonCheck;

/* renamed from: o.lambda$component$0 */
public class lambda$component$0 extends writeUInt64NoTag<RttiJsonCheck.C12561> {
    public final getInetAddress IconCompatParcelizer;
    public Service MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final getValueStrength MediaBrowserCompat$MediaItem;
    public C7039x355e6121.read MediaBrowserCompat$SearchResultReceiver;
    public final getEulerY MediaDescriptionCompat;
    public final getEnabledProtocols read;
    /* access modifiers changed from: package-private */
    public final getKeyStrength write;

    @HmlPinActivity
    public lambda$component$0(getKeyStrength getkeystrength, getEnabledProtocols getenabledprotocols, getValueStrength getvaluestrength, getInetAddress getinetaddress, getEulerY geteulery, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = getkeystrength;
        this.read = getenabledprotocols;
        this.MediaBrowserCompat$MediaItem = getvaluestrength;
        this.IconCompatParcelizer = getinetaddress;
        this.MediaDescriptionCompat = geteulery;
    }

    /* renamed from: o.lambda$component$0$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzxi> {
        private read() {
        }

        public /* synthetic */ read(lambda$component$0 lambda_component_0, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            lambda$component$0.IconCompatParcelizer(lambda$component$0.this);
            boolean z = true;
            ForwardingService IconCompatParcelizer = lambda$component$0.this.write.IconCompatParcelizer(lambda$component$0.this.MediaBrowserCompat$ItemReceiver, lambda$component$0.this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write(), true, lambda$component$0.this.MediaBrowserCompat$SearchResultReceiver);
            lambda$component$0 lambda_component_0 = lambda$component$0.this;
            ignoreNullValues ignorenullvalues = new ignoreNullValues(this, (zzxi) obj, IconCompatParcelizer);
            if (lambda_component_0.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ignorenullvalues.IconCompatParcelizer(lambda_component_0.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            lambda$component$0 lambda_component_0 = lambda$component$0.this;
            lambda_component_0.MediaBrowserCompat$ItemReceiver(lambda_component_0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new maybeUnNest(lambda_component_0)));
        }
    }

    static /* synthetic */ void IconCompatParcelizer(lambda$component$0 lambda_component_0) {
        if (lambda_component_0.RatingCompat != null) {
            lambda_component_0.RatingCompat.aj_();
        }
    }
}
