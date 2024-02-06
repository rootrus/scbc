package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.WorkflowActivity */
public final /* synthetic */ class WorkflowActivity implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ parseSession MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ WorkflowActivity(parseSession parsesession) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parsesession;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setExpirationYear) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.WorkflowActivity$a */
    public final /* synthetic */ class C7089a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ parseEventSignal read;
        private final /* synthetic */ getIJsonExactionHelperRtti write;

        public /* synthetic */ C7089a(getIJsonExactionHelperRtti getijsonexactionhelperrtti, parseEventSignal parseeventsignal) {
            this.write = getijsonexactionhelperrtti;
            this.read = parseeventsignal;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.setPadding) obj).IconCompatParcelizer(this.read);
        }
    }
}
