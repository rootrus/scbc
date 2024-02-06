package p040o;

import android.text.TextUtils;
import com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity;
import p040o.IIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDocumentType */
public final /* synthetic */ class setDocumentType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPropTypeDescrip MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ MwPinShopLocationActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setDocumentType(getPropTypeDescrip getproptypedescrip, MwPinShopLocationActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getproptypedescrip;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPropTypeDescrip getproptypedescrip = this.MediaBrowserCompat$CustomActionResultReceiver;
        MwPinShopLocationActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        IIdExtractor.write write = (IIdExtractor.write) obj;
        write.IconCompatParcelizer(getproptypedescrip.IconCompatParcelizer.read(iconCompatParcelizer));
        if (!TextUtils.isEmpty(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem)) {
            write.IconCompatParcelizer(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem);
        } else {
            write.MediaBrowserCompat$ItemReceiver();
        }
    }
}
