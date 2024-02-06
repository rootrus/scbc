package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.CheckExtractActivity_MembersInjector.IconCompatParcelizer;

/* renamed from: o.setImageDPI */
public abstract class setImageDPI<T extends CheckExtractActivity_MembersInjector.IconCompatParcelizer> extends writeUInt64NoTag<T> {
    protected isEmulator IconCompatParcelizer;

    public setImageDPI(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    /* access modifiers changed from: protected */
    public final void read(extractFieldFromSystemFile extractfieldfromsystemfile, int i, boolean z) {
        if (extractfieldfromsystemfile != null) {
            this.IconCompatParcelizer.PlaybackStateCompat = extractfieldfromsystemfile.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            this.IconCompatParcelizer.f2875x50fd9e4a = extractfieldfromsystemfile.IconCompatParcelizer;
            this.IconCompatParcelizer.AlertController$RecycleListView = extractfieldfromsystemfile.read;
            this.IconCompatParcelizer.setHasDecor = extractfieldfromsystemfile.MediaBrowserCompat$ItemReceiver;
            if (z) {
                setOutputBitDepth setoutputbitdepth = new setOutputBitDepth(i);
                if (this.RatingCompat != null) {
                    setoutputbitdepth.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
    }

    public final void IconCompatParcelizer(int i) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = Integer.valueOf(i);
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        imageWriteToFileBuffer imagewritetofilebuffer = imageWriteToFileBuffer.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            imagewritetofilebuffer.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final isEmulator write() {
        return this.IconCompatParcelizer;
    }
}
