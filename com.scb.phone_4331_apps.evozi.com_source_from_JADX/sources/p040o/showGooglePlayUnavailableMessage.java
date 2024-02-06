package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.FragmentBuilder_BindRegistrationLandingFragment;
import p040o.GoogleMap;

/* renamed from: o.showGooglePlayUnavailableMessage */
public final /* synthetic */ class showGooglePlayUnavailableMessage implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindRegistrationLandingFragment.read IconCompatParcelizer;

    public /* synthetic */ showGooglePlayUnavailableMessage(FragmentBuilder_BindRegistrationLandingFragment.read read) {
        this.IconCompatParcelizer = read;
    }

    public final Object write(Object obj) {
        List list;
        ambientEnabled ambientenabled;
        zar zar = this.IconCompatParcelizer.read;
        setOnTouchListener setontouchlistener = (setOnTouchListener) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) setontouchlistener, "entity");
        String str = setontouchlistener.write;
        OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(setontouchlistener.IconCompatParcelizer, (OffsetDateTime) null);
        String str2 = setontouchlistener.read;
        Double valueOf = str2 != null ? Double.valueOf(Double.parseDouble(str2)) : null;
        onSnapshotReady onsnapshotready = setontouchlistener.MediaBrowserCompat$ItemReceiver;
        List<setNoDataTextTypeface> list2 = setontouchlistener.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            Collection arrayList = new ArrayList();
            for (setNoDataTextTypeface setnodatatexttypeface : list2) {
                if (setnodatatexttypeface.IconCompatParcelizer == null || setnodatatexttypeface.read == null) {
                    ambientenabled = null;
                } else {
                    ambientenabled = new ambientEnabled(setnodatatexttypeface.IconCompatParcelizer, setnodatatexttypeface.read);
                }
                if (ambientenabled != null) {
                    arrayList.add(ambientenabled);
                }
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        return BScanCNotificationDeepLinkActivity.read(new GoogleMap.zza(str, write, valueOf, onsnapshotready, list));
    }
}
