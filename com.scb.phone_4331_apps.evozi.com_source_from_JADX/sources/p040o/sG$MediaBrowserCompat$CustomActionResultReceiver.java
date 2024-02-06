package p040o;

import p040o.C7432sG;

/* renamed from: o.sG$MediaBrowserCompat$CustomActionResultReceiver */
public class sG$MediaBrowserCompat$CustomActionResultReceiver {
    private /* synthetic */ C7432sG IconCompatParcelizer;

    private sG$MediaBrowserCompat$CustomActionResultReceiver(C7432sG sGVar) {
        this.IconCompatParcelizer = sGVar;
    }

    /* synthetic */ sG$MediaBrowserCompat$CustomActionResultReceiver(C7432sG sGVar, byte b) {
        this(sGVar);
    }

    public final C7432sG.write write(isRelevant isrelevant) {
        C7432sG.write write;
        if (isrelevant.equals(isRelevant.DIRECT_DEBIT)) {
            write = this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
        } else {
            write = this.IconCompatParcelizer.ParcelableVolumeInfo;
        }
        write.write(this.IconCompatParcelizer.RatingCompat);
        return write;
    }
}
