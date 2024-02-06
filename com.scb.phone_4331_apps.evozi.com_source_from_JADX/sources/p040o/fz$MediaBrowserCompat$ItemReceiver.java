package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.MapConstraints;
import p040o.access$2300;
import p040o.getCompressedFrontImageSize;

/* renamed from: o.fz$MediaBrowserCompat$ItemReceiver */
final class fz$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzsj> {
    private /* synthetic */ C4443fz write;

    private fz$MediaBrowserCompat$ItemReceiver(C4443fz fzVar) {
        this.write = fzVar;
    }

    /* synthetic */ fz$MediaBrowserCompat$ItemReceiver(C4443fz fzVar, byte b) {
        this(fzVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4443fz.read(this.write);
        C4443fz fzVar = this.write;
        C4440fv fvVar = new C4440fv(this, (zzsj) obj);
        if (fzVar.RatingCompat != null) {
            fvVar.IconCompatParcelizer(fzVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }

    public final /* synthetic */ void write(zzsj zzsj, getCompressedFrontImageSize.read read) {
        List list;
        MapConstraints.ConstrainedMultimap.C36372 MediaBrowserCompat$CustomActionResultReceiver = this.write.write;
        zzvf RatingCompat = this.write.read.write.RatingCompat();
        if (RatingCompat != null) {
            list = RatingCompat.MediaBrowserCompat$ItemReceiver;
        } else {
            list = new ArrayList();
        }
        read.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(zzsj, list, this.write.read.write.setItemInvoker()).MediaBrowserCompat$ItemReceiver());
    }
}
