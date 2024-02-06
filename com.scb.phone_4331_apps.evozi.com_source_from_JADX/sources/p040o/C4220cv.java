package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.cv */
public final /* synthetic */ class C4220cv implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_CrashlyticsReport_CustomAttribute MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C4223cy write;

    public /* synthetic */ C4220cv(C4223cy cyVar, AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
        this.write = cyVar;
        this.MediaBrowserCompat$ItemReceiver = autoValue_CrashlyticsReport_CustomAttribute;
    }

    public final void IconCompatParcelizer(Object obj) {
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute = this.MediaBrowserCompat$ItemReceiver;
        ((KtaJsonCheck.read) obj).IconCompatParcelizer(autoValue_CrashlyticsReport_CustomAttribute, C4223cy.MediaBrowserCompat$CustomActionResultReceiver(autoValue_CrashlyticsReport_CustomAttribute.IconCompatParcelizer));
    }
}
