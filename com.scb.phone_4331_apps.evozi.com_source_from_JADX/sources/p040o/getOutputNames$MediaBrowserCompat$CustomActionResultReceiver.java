package p040o;

import p040o.access$2300;

/* renamed from: o.getOutputNames$MediaBrowserCompat$CustomActionResultReceiver */
public final class getOutputNames$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<DenominatorAmountAdapter$BubbleViewHolder> {
    private /* synthetic */ getOutputNames MediaBrowserCompat$ItemReceiver;

    public getOutputNames$MediaBrowserCompat$CustomActionResultReceiver(getOutputNames getoutputnames) {
        this.MediaBrowserCompat$ItemReceiver = getoutputnames;
    }

    public final /* synthetic */ void onNext(Object obj) {
        DenominatorAmountAdapter$BubbleViewHolder denominatorAmountAdapter$BubbleViewHolder = (DenominatorAmountAdapter$BubbleViewHolder) obj;
        onGetStartedClick.write((Object) denominatorAmountAdapter$BubbleViewHolder, "etbMarketConduct");
        getOutputNames.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
        RegularImmutableList unused = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        onGetStartedClick.write((Object) denominatorAmountAdapter$BubbleViewHolder, "etbMarketConduct");
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new appendToProtoFile(denominatorAmountAdapter$BubbleViewHolder.IconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        getOutputNames.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
