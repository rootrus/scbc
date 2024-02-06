package p040o;

import java.util.HashMap;
import java.util.Map;
import p039io.realm.internal.OsSharedRealm;
import p039io.realm.internal.Table;
import p039io.realm.internal.Util;

/* renamed from: o.HmlNTBCompanyNameActivity */
public abstract class HmlNTBCompanyNameActivity {
    public final HmlEtbConfirmationOtpActivity IconCompatParcelizer;
    private final Map<Class<? extends HmlNTBCaptureDocumentActivity>, Table> MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    public final Map<String, HmlNTBBusinessAddressActivity> MediaBrowserCompat$ItemReceiver = new HashMap();
    final Map<Class<? extends HmlNTBCaptureDocumentActivity>, HmlNTBBusinessAddressActivity> read = new HashMap();
    public final HmlNTBExternalAuthenticationActivity write;

    HmlNTBCompanyNameActivity(HmlEtbConfirmationOtpActivity hmlEtbConfirmationOtpActivity, HmlNTBExternalAuthenticationActivity hmlNTBExternalAuthenticationActivity) {
        new HashMap();
        this.IconCompatParcelizer = hmlEtbConfirmationOtpActivity;
        this.write = hmlNTBExternalAuthenticationActivity;
    }

    public final Table read(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        Table table = this.MediaBrowserCompat$CustomActionResultReceiver.get(cls);
        if (table != null) {
            return table;
        }
        Class<? extends HmlNTBCaptureDocumentActivity> MediaBrowserCompat$ItemReceiver2 = Util.MediaBrowserCompat$ItemReceiver(cls);
        if (MediaBrowserCompat$ItemReceiver2.equals(cls)) {
            table = this.MediaBrowserCompat$CustomActionResultReceiver.get(MediaBrowserCompat$ItemReceiver2);
        }
        if (table == null) {
            String write2 = Table.write(this.IconCompatParcelizer.write().f2550x50fd9e4a.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2));
            OsSharedRealm osSharedRealm = this.IconCompatParcelizer.write;
            table = new Table(osSharedRealm, OsSharedRealm.nativeGetTable(osSharedRealm.read, write2));
            this.MediaBrowserCompat$CustomActionResultReceiver.put(MediaBrowserCompat$ItemReceiver2, table);
        }
        if (MediaBrowserCompat$ItemReceiver2.equals(cls)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.put(cls, table);
        }
        return table;
    }

    public final HmlNTBLoanReviewActivity IconCompatParcelizer(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        if (this.write != null) {
            return this.write.MediaBrowserCompat$ItemReceiver(cls);
        }
        throw new IllegalStateException("Attempt to use column index before set.");
    }
}
