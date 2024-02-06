package p040o;

import java.util.List;
import p040o.AbstractMultimap;
import p040o.Interners;

/* renamed from: o.getAppIdOrigin */
public class getAppIdOrigin extends IndoorBuilding {
    public AbstractMultimap.EntrySet IconCompatParcelizer;
    public findValueIteratorAndKey MediaBrowserCompat$ItemReceiver;
    private getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver read;

    @HmlPinActivity
    public getAppIdOrigin(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.EntrySet entrySet, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.IconCompatParcelizer = entrySet;
        this.read = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$ItemReceiver = findvalueiteratorandkey;
    }

    public final DebitCardResetOtpActivity<List<setZoomControlsEnabled>> read() {
        List<setZoomControlsEnabled> read2 = this.IconCompatParcelizer.read();
        if (read2 == null || read2.isEmpty()) {
            return write(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().cache().takeLast(1));
        }
        return write(DebitCardResetOtpActivity.just(read2));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return write(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(str));
    }

    public final DebitCardResetOtpActivity IconCompatParcelizer(String str) {
        return write(this.IconCompatParcelizer.IconCompatParcelizer(str));
    }

    public final DebitCardResetOtpActivity write(consumingIterable consumingiterable) {
        return write(this.IconCompatParcelizer.write(consumingiterable));
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read.setItemInvoker();
    }

    public TouchPointInstructionActivity IconCompatParcelizer() {
        return this.read.AppCompatActivity();
    }

    public final DebitCardResetOtpActivity read(Integer num) {
        return write(this.IconCompatParcelizer.write(num));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(Interners.WeakInterner.InternReference internReference) {
        return write(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(internReference));
    }
}
