package p040o;

import p040o.AnalyticsConnectorReceiver;
import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.getOriginalImage */
public final /* synthetic */ class getOriginalImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Image.FriendI IconCompatParcelizer;
    private final /* synthetic */ doOnboarding MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getOriginalImage(Image.FriendI friendI, doOnboarding doonboarding) {
        this.IconCompatParcelizer = friendI;
        this.MediaBrowserCompat$ItemReceiver = doonboarding;
    }

    public final void IconCompatParcelizer(Object obj) {
        doOnboarding doonboarding = this.MediaBrowserCompat$ItemReceiver;
        C6395xeeeefe7 checkExtractActivity_MembersInjector$setShortcut$MediaBrowserCompat$CustomActionResultReceiver = (C6395xeeeefe7) obj;
        checkExtractActivity_MembersInjector$setShortcut$MediaBrowserCompat$CustomActionResultReceiver.write(doonboarding.MediaBrowserCompat$SearchResultReceiver);
        AnalyticsConnectorReceiver.read read = new AnalyticsConnectorReceiver.read();
        read.MediaBrowserCompat$CustomActionResultReceiver = doonboarding.MediaSessionCompat$ResultReceiverWrapper;
        read.MediaBrowserCompat$ItemReceiver = doonboarding.MediaMetadataCompat;
        read.read = doonboarding.MediaBrowserCompat$MediaItem;
        read.IconCompatParcelizer = doonboarding.RatingCompat;
        checkExtractActivity_MembersInjector$setShortcut$MediaBrowserCompat$CustomActionResultReceiver.read(new AnalyticsConnectorReceiver(read, (byte) 0));
        if (doonboarding.MediaSessionCompat$Token) {
            checkExtractActivity_MembersInjector$setShortcut$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        } else {
            checkExtractActivity_MembersInjector$setShortcut$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
