package p040o;

import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.Report */
public final /* synthetic */ class Report implements findFragmentByWho {
    private final /* synthetic */ defaultSettings$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.Report$Type */
    public final /* synthetic */ class Type implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ Type MediaBrowserCompat$CustomActionResultReceiver = new Type();

        private /* synthetic */ Type() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule.C6375a.MediaDescriptionCompat) obj).ax_();
        }
    }

    public /* synthetic */ Report(defaultSettings$MediaBrowserCompat$CustomActionResultReceiver defaultsettings_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = defaultsettings_mediabrowsercompat_customactionresultreceiver;
    }

    public final Object IconCompatParcelizer(Object obj) {
        defaultSettings$MediaBrowserCompat$CustomActionResultReceiver defaultsettings_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        return defaultsettings_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver((zzvn) obj, defaultsettings_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.setItemInvoker());
    }
}
