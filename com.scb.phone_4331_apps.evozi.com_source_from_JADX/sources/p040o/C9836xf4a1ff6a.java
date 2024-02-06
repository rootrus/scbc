package p040o;

import p040o.MissingNativeComponent;
import p040o.Multimaps;
import p040o.XVrsAutoOrientation;
import p040o.inject_base64Decoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsAutoOrientation$write$MediaBrowserCompat$CustomActionResultReceiver */
final class C9836xf4a1ff6a implements Runnable {
    private /* synthetic */ XVrsAutoOrientation.write MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding write;

    C9836xf4a1ff6a(XVrsAutoOrientation.write write2, SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding smeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding) {
        this.MediaBrowserCompat$ItemReceiver = write2;
        this.write = smeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding;
    }

    public final void run() {
        Multimaps.CustomMultimap unused = this.MediaBrowserCompat$ItemReceiver.read.IconCompatParcelizer;
        final MissingNativeComponent.MissingNativeSessionFileProvider IconCompatParcelizer = Multimaps.CustomMultimap.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.write, this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, this.write.MediaBrowserCompat$CustomActionResultReceiver);
        XVrsAutoOrientation xVrsAutoOrientation = this.MediaBrowserCompat$ItemReceiver.read;
        writeUInt64NoTag.IconCompatParcelizer r2 = new writeUInt64NoTag.IconCompatParcelizer<inject_base64Decoder.write>() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((inject_base64Decoder.write) obj).write(IconCompatParcelizer);
            }
        };
        if (xVrsAutoOrientation.RatingCompat != null) {
            r2.IconCompatParcelizer(xVrsAutoOrientation.RatingCompat);
        }
    }
}
