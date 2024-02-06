package p040o;

import p040o.CrashlyticsReport;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.l */
public final /* synthetic */ class C4923l implements getAllowReturnTransitionOverlap {
    public static final /* synthetic */ C4923l write = new C4923l();

    /* renamed from: o.l$a */
    public final /* synthetic */ class C4924a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ CrashlyticsReport.Session.Application.Organization write;

        public /* synthetic */ C4924a(CrashlyticsReport.Session.Application.Organization organization) {
            this.write = organization;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.read) obj).IconCompatParcelizer(this.write);
        }
    }

    private /* synthetic */ C4923l() {
    }

    public final boolean write(Object obj) {
        return ((performUpdateApp) obj).MediaBrowserCompat$SearchResultReceiver.booleanValue();
    }
}
