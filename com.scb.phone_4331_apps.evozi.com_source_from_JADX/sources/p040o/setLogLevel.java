package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.setLogLevel */
public final class setLogLevel extends FragmentBuilder_BindSummaryFragment {
    public static zzxn write(SingleDataEntity<encodedPath> singleDataEntity) {
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        setOnPageChangeListener status = singleDataEntity.getStatus();
        encodedPath data = singleDataEntity.getData();
        String str = data.IconCompatParcelizer;
        if (str == null) {
            str = "";
        }
        zzxn zzxn = new zzxn(str, data.MediaBrowserCompat$ItemReceiver, data.write, data.MediaBrowserCompat$CustomActionResultReceiver, data.read);
        onGetStartedClick.IconCompatParcelizer((Object) status, "status");
        zzxn.read(new zzvj(status.write(), status.IconCompatParcelizer()));
        return zzxn;
    }
}
