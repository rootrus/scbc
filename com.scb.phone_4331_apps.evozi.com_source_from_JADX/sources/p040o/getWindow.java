package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.C1251R;
import p040o.zzbc;

/* renamed from: o.getWindow */
public final /* synthetic */ class getWindow implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setPhoneNumberIdentifierSupported MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getWindow(setPhoneNumberIdentifierSupported setphonenumberidentifiersupported) {
        this.MediaBrowserCompat$ItemReceiver = setphonenumberidentifiersupported;
    }

    public final Object write(Object obj) {
        zzbc.zze zze = new zzbc.zze();
        zze.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindSummaryFragment.write(((C1251R.anim) ((SingleDataEntity) obj).getData()).MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
        return zze;
    }
}
