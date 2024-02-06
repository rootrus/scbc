package p040o;

import java.util.NoSuchElementException;
import p040o.AppMeasurement;
import p040o.Synchronized;
import p040o.getDocumentSkew;
import p040o.orderKeysBy;

/* renamed from: o.gN */
public class C4456gN extends C4455gM {
    public setUuidFromUtf8Bytes IconCompatParcelizer;
    public getDocumentSkew.read MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public C4456gN(RegularImmutableBiMap regularImmutableBiMap, toShortArray toshortarray, notifyStarted notifystarted, AppMeasurement.UserProperty userProperty, SignedBytes signedBytes, AbstractService abstractService, Synchronized.SynchronizedSet synchronizedSet) {
        super(regularImmutableBiMap, toshortarray, notifystarted, userProperty, signedBytes, abstractService, synchronizedSet);
    }

    public final void write(getDocumentSkew.read read) {
        write(read);
        MediaBrowserCompat$ItemReceiver((getDocumentSkew.write) read);
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public void onDestroy() {
        this.MediaBrowserCompat$ItemReceiver = null;
        super.onDestroy();
    }

    public final void IconCompatParcelizer() {
        String str;
        String str2;
        String str3;
        if (this.IconCompatParcelizer != null) {
            AppMeasurement.UserProperty userProperty = this.MediaBrowserCompat$SearchResultReceiver;
            String str4 = "";
            if (this.IconCompatParcelizer.ExpandedMenuView != null) {
                str = this.IconCompatParcelizer.ExpandedMenuView;
            } else {
                str = str4;
            }
            if (this.IconCompatParcelizer.setBackgroundResource != null) {
                str2 = this.IconCompatParcelizer.setBackgroundResource;
            } else {
                str2 = str4;
            }
            if (this.IconCompatParcelizer.ListMenuItemView != null) {
                str3 = this.IconCompatParcelizer.ListMenuItemView;
            } else {
                str3 = str4;
            }
            userProperty.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer("TOPUP", str, str2, str3);
            getDocumentSkew.read read = this.MediaBrowserCompat$ItemReceiver;
            if (read != null) {
                if (this.IconCompatParcelizer.setBackgroundResource != null) {
                    str4 = this.IconCompatParcelizer.setBackgroundResource;
                }
                read.write(str4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int MediaBrowserCompat$ItemReceiver() {
        instantiate instantiate;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.IconCompatParcelizer;
        if (setuuidfromutf8bytes == null || setuuidfromutf8bytes.ExpandedMenuView == null) {
            return 0;
        }
        showNow MediaBrowserCompat$ItemReceiver2 = showNow.MediaBrowserCompat$ItemReceiver(0, this.read.size());
        showNow shownow = new showNow(MediaBrowserCompat$ItemReceiver2.read, new getFragmentManager(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer, new C4447gD(this)));
        if (shownow.IconCompatParcelizer.hasNext()) {
            instantiate = instantiate.write(shownow.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
        } else {
            instantiate = instantiate.write();
        }
        if (!instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
            return 0;
        }
        if (instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
            return instantiate.write;
        }
        throw new NoSuchElementException("No value present");
    }

    public final /* synthetic */ boolean read(int i) {
        return this.IconCompatParcelizer.ExpandedMenuView.equals(this.read.get(i).setBackgroundResource);
    }

    public final void read() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        AppMeasurement.UserProperty userProperty = this.MediaBrowserCompat$SearchResultReceiver;
        orderKeysBy.write read = orderKeysBy.read();
        read.IconCompatParcelizer = this.write.AppCompatDialogFragment;
        userProperty.write(new orderKeysBy(read, (byte) 0), this.write.Keep.toString());
        this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new gN$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
    }
}
