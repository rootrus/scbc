package p040o;

import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.Image$FileRestriction$MediaBrowserCompat$ItemReceiver */
final class Image$FileRestriction$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckExtractActivity_MembersInjector.setForceShowIcon> {
    final /* synthetic */ Image.FileRestriction MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    Image$FileRestriction$MediaBrowserCompat$ItemReceiver(Image.FileRestriction fileRestriction, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fileRestriction;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CheckExtractActivity_MembersInjector.setForceShowIcon setforceshowicon = (CheckExtractActivity_MembersInjector.setForceShowIcon) obj;
        setforceshowicon.IconCompatParcelizer(isStrictlyOrdered.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, new findFragmentByWho<QuickAccountSelectAdapter$FooterHolder, CrashlyticsReport.FilesPayload.File.Builder>(this) {
            private /* synthetic */ Image$FileRestriction$MediaBrowserCompat$ItemReceiver write;

            {
                this.write = r1;
            }

            public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
                return isStrictlyOrdered.IconCompatParcelizer((QuickAccountSelectAdapter$FooterHolder) obj, this.write.MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker());
            }
        }));
        setforceshowicon.MediaBrowserCompat$ItemReceiver(true);
    }
}
