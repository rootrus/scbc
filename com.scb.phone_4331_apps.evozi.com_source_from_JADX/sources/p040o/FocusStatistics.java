package p040o;

import p040o.getCarbonStripHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.FocusStatistics */
public final /* synthetic */ class FocusStatistics implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.FocusStatistics$a */
    public final /* synthetic */ class C3393a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ boolean write;

        public /* synthetic */ C3393a(boolean z) {
            this.write = z;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getCarbonStripHeight.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(this.write);
        }
    }

    public /* synthetic */ FocusStatistics(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getCarbonStripHeight.IconCompatParcelizer) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }
}
