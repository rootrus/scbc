package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;

/* renamed from: o.isPackageSide */
public final /* synthetic */ class isPackageSide implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ isPackageSide read = new isPackageSide();

    private /* synthetic */ isPackageSide() {
    }

    public final Object write(Object obj) {
        replaceInParent replaceinparent = (replaceInParent) ((SingleDataEntity) obj).getData();
        String str = replaceinparent.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            String str2 = replaceinparent.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                String str3 = replaceinparent.IconCompatParcelizer;
                if (str3 != null) {
                    return new scrollBy(str, str2, str3, replaceinparent.write);
                }
                throw new EntityMappingException("qrCode can not be null");
            }
            throw new EntityMappingException("qrCode can not be null");
        }
        throw new EntityMappingException("qrCode can not be null");
    }
}
