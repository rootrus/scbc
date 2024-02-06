package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.customizeyourpages.CustomizeYourPageFragment;
import okhttp3.internal.cache.DiskLruCache;
import p040o.buildUnexpectedTypeError;

/* renamed from: o.getCommercialDetail */
public final /* synthetic */ class getCommercialDetail implements DialogInterface.OnClickListener {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomizeYourPageFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getCommercialDetail(CustomizeYourPageFragment customizeYourPageFragment, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = customizeYourPageFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CustomizeYourPageFragment customizeYourPageFragment = this.MediaBrowserCompat$ItemReceiver;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        buildUnexpectedTypeError buildunexpectedtypeerror = customizeYourPageFragment.customizeYourPagePresenter;
        String str = z ? DiskLruCache.VERSION_1 : "0";
        if (buildunexpectedtypeerror.RatingCompat != null) {
            buildunexpectedtypeerror.RatingCompat.AlertController$RecycleListView();
        }
        getInfoWindowAnchorV getinfowindowanchorv = buildunexpectedtypeerror.IconCompatParcelizer;
        orderValuesBy read = orderValuesBy.read();
        read.read = str;
        getinfowindowanchorv.write(read);
        buildunexpectedtypeerror.IconCompatParcelizer.IconCompatParcelizer(new buildUnexpectedTypeError.read(buildunexpectedtypeerror, (byte) 0));
    }
}
