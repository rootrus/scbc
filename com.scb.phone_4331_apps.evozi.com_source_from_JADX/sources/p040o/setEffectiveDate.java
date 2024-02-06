package p040o;

import android.util.Base64;
import p104sg.nec.com.epid_sdk_master.crypto.DecryptException;
import p104sg.nec.com.epid_sdk_master.crypto.EncryptException;

/* renamed from: o.setEffectiveDate */
public final class setEffectiveDate implements CustomEffectiveDate_ViewBinding<byte[], String> {
    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return "BASE64";
    }

    public final /* synthetic */ Object IconCompatParcelizer(Object obj) throws DecryptException {
        return Base64.decode(((String) obj).getBytes(), 0);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) throws EncryptException {
        return new String(Base64.encode((byte[]) obj, 0));
    }
}
