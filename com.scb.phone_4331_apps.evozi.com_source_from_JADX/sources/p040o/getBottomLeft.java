package p040o;

import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBottomLeft */
public final /* synthetic */ class getBottomLeft implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Image.C34591.read IconCompatParcelizer;
    private final /* synthetic */ getOverridenSpiEndpoint MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getBottomLeft(Image.C34591.read read, getOverridenSpiEndpoint getoverridenspiendpoint) {
        this.IconCompatParcelizer = read;
        this.MediaBrowserCompat$CustomActionResultReceiver = getoverridenspiendpoint;
    }

    public final void IconCompatParcelizer(Object obj) {
        Image.C34591.read read = this.IconCompatParcelizer;
        getOverridenSpiEndpoint getoverridenspiendpoint = this.MediaBrowserCompat$CustomActionResultReceiver;
        C6393xc7fe0382 checkExtractActivity_MembersInjector$MediaSessionCompat$QueueItem = (C6393xc7fe0382) obj;
        checkExtractActivity_MembersInjector$MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver(getoverridenspiendpoint);
        if (getoverridenspiendpoint.MediaMetadataCompat == 1) {
            checkExtractActivity_MembersInjector$MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(getoverridenspiendpoint.IconCompatParcelizer, getoverridenspiendpoint.MediaBrowserCompat$CustomActionResultReceiver);
        }
        Image.C34591.IconCompatParcelizer(Image.C34591.this, getoverridenspiendpoint.MediaBrowserCompat$SearchResultReceiver);
    }
}
