package p040o;

import java.security.Key;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import p104sg.nec.com.epid_sdk_master.crypto.CipherCreateException;
import p104sg.nec.com.epid_sdk_master.crypto.DecryptException;
import p104sg.nec.com.epid_sdk_master.crypto.EncryptException;

/* renamed from: o.setSourceName */
public final class setSourceName implements setSeparator<byte[], byte[], Key> {
    private CustomBulkTransferScheduleItem_ViewBinding IconCompatParcelizer = new CustomBulkTransferScheduleItem();

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return "AES";
    }

    public final /* synthetic */ Object IconCompatParcelizer(Object obj) throws DecryptException {
        return MediaBrowserCompat$CustomActionResultReceiver((byte[]) obj, (Key) null);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) throws EncryptException {
        return IconCompatParcelizer((byte[]) obj, (Key) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public byte[] IconCompatParcelizer(byte[] bArr, Key key) throws EncryptException {
        try {
            return this.IconCompatParcelizer.read(key).doFinal(bArr);
        } catch (CipherCreateException e) {
            throw new EncryptException(e);
        } catch (IllegalBlockSizeException e2) {
            throw new EncryptException(e2);
        } catch (BadPaddingException e3) {
            throw new EncryptException(e3);
        }
    }

    /* access modifiers changed from: private */
    public byte[] MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, Key key) throws DecryptException {
        try {
            return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(key).doFinal(bArr);
        } catch (CipherCreateException e) {
            throw new DecryptException(e);
        } catch (IllegalBlockSizeException e2) {
            throw new DecryptException(e2);
        } catch (BadPaddingException e3) {
            throw new DecryptException(e3);
        }
    }
}
