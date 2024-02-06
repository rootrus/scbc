package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.setGuidingLine;
import p040o.writeUInt64NoTag;

/* renamed from: o.ai */
public final /* synthetic */ class C4027ai implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setGuidingLine.write MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.ai$a */
    public final /* synthetic */ class C4030a implements getAllowReturnTransitionOverlap {
        public static final /* synthetic */ C4030a read = new C4030a();

        private /* synthetic */ C4030a() {
        }

        public final boolean write(Object obj) {
            return ((getSignal) ((AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) obj)).MediaMetadataCompat;
        }
    }

    public /* synthetic */ C4027ai(setGuidingLine.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_Factory) obj).IconCompatParcelizer(setGuidingLine.this.IconCompatParcelizer);
    }
}
