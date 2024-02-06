package p040o;

import p040o.getIpAddress;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIpAddress$read$MediaBrowserCompat$CustomActionResultReceiver */
final class getIpAddress$read$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaJsonPassport_MembersInjector> {
    private /* synthetic */ getIpAddress.read read;

    getIpAddress$read$MediaBrowserCompat$CustomActionResultReceiver(getIpAddress.read read2) {
        this.read = read2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        KtaJsonPassport_MembersInjector ktaJsonPassport_MembersInjector = (KtaJsonPassport_MembersInjector) obj;
        if (getIpAddress.write(this.read.IconCompatParcelizer)) {
            ktaJsonPassport_MembersInjector.IconCompatParcelizer();
        } else {
            ktaJsonPassport_MembersInjector.write();
        }
    }
}
