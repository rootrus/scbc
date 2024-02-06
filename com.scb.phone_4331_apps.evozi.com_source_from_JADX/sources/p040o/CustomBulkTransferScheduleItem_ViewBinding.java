package p040o;

import java.security.Key;
import javax.crypto.Cipher;
import p104sg.nec.com.epid_sdk_master.crypto.CipherCreateException;

/* renamed from: o.CustomBulkTransferScheduleItem_ViewBinding */
public interface CustomBulkTransferScheduleItem_ViewBinding {
    Cipher MediaBrowserCompat$CustomActionResultReceiver(Key key) throws CipherCreateException;

    Cipher read(Key key) throws CipherCreateException;
}
