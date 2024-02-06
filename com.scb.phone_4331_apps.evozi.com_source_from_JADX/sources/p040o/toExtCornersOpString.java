package p040o;

import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.toExtCornersOpString */
public final /* synthetic */ class toExtCornersOpString implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_CrashlyticsReport_CustomAttribute IconCompatParcelizer;
    private final /* synthetic */ Image.C34591 read;

    public /* synthetic */ toExtCornersOpString(Image.C34591 r1, AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
        this.read = r1;
        this.IconCompatParcelizer = autoValue_CrashlyticsReport_CustomAttribute;
    }

    public final void IconCompatParcelizer(Object obj) {
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute = this.IconCompatParcelizer;
        C6393xc7fe0382 checkExtractActivity_MembersInjector$MediaSessionCompat$QueueItem = (C6393xc7fe0382) obj;
        if (Image.C34591.IconCompatParcelizer(autoValue_CrashlyticsReport_CustomAttribute)) {
            checkExtractActivity_MembersInjector$MediaSessionCompat$QueueItem.read();
            checkExtractActivity_MembersInjector$MediaSessionCompat$QueueItem.IconCompatParcelizer(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$SearchResultReceiver);
            return;
        }
        checkExtractActivity_MembersInjector$MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
