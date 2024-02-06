package p040o;

import java.util.List;
import p040o.CheckCaptureModule;
import p040o.TransformedImmutableList;
import p040o.writeUInt64NoTag;

/* renamed from: o.CreateReportSpiCall */
public final /* synthetic */ class CreateReportSpiCall implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ SettingsCacheBehavior IconCompatParcelizer;
    private final /* synthetic */ List read;

    public /* synthetic */ CreateReportSpiCall(SettingsCacheBehavior settingsCacheBehavior, List list) {
        this.IconCompatParcelizer = settingsCacheBehavior;
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        SettingsCacheBehavior settingsCacheBehavior = this.IconCompatParcelizer;
        List list = this.read;
        TransformedImmutableList.C38711 r2 = settingsCacheBehavior.write;
        boolean itemInvoker = settingsCacheBehavior.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker();
        onGetStartedClick.write((Object) list, "list");
        List MediaBrowserCompat$ItemReceiver = TransformedImmutableList.C38711.MediaBrowserCompat$ItemReceiver(list, new TransformedImmutableList$1$MediaBrowserCompat$ItemReceiver(r2, itemInvoker, true));
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "transformList(list) { tr…t, isMasked, isSummary) }");
        ((CheckCaptureModule.C6375a.MediaMetadataCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver);
    }
}
