package p040o;

import p040o.access$2300;

/* renamed from: o.BarnsenShader$MediaBrowserCompat$ItemReceiver */
public class BarnsenShader$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<DenominatorAmountAdapter$BubbleViewHolder> {
    private /* synthetic */ BarnsenShader MediaBrowserCompat$CustomActionResultReceiver;

    private BarnsenShader$MediaBrowserCompat$ItemReceiver(BarnsenShader barnsenShader) {
        this.MediaBrowserCompat$CustomActionResultReceiver = barnsenShader;
    }

    public /* synthetic */ BarnsenShader$MediaBrowserCompat$ItemReceiver(BarnsenShader barnsenShader, byte b) {
        this(barnsenShader);
    }

    public final /* synthetic */ void onNext(Object obj) {
        DenominatorAmountAdapter$BubbleViewHolder denominatorAmountAdapter$BubbleViewHolder = (DenominatorAmountAdapter$BubbleViewHolder) obj;
        BarnsenShader.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        RegularImmutableList unused = this.MediaBrowserCompat$CustomActionResultReceiver.read;
        onGetStartedClick.write((Object) denominatorAmountAdapter$BubbleViewHolder, "etbMarketConduct");
        appendToProtoFile appendtoprotofile = new appendToProtoFile(denominatorAmountAdapter$BubbleViewHolder.IconCompatParcelizer);
        BarnsenShader barnsenShader = this.MediaBrowserCompat$CustomActionResultReceiver;
        BitmapGPUFrame bitmapGPUFrame = new BitmapGPUFrame(appendtoprotofile);
        if (barnsenShader.RatingCompat != null) {
            bitmapGPUFrame.IconCompatParcelizer(barnsenShader.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        BarnsenShader.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
