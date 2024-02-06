package p040o;

import com.scb.phone.p035di.FragmentBuilder_BindAddressSearchFragment;
import com.scb.phone.view.fragment.address.AddressSearchFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$ActionMenuPresenter$OverflowMenuButton */
final class zzmd$zzl$ActionMenuPresenter$OverflowMenuButton implements FragmentBuilder_BindAddressSearchFragment.write {
    private /* synthetic */ zzmd.zzl read;

    /* synthetic */ zzmd$zzl$ActionMenuPresenter$OverflowMenuButton(zzmd.zzl zzl) {
        this(zzl, (byte) 0);
    }

    private zzmd$zzl$ActionMenuPresenter$OverflowMenuButton(zzmd.zzl zzl, byte b) {
        this.read = zzl;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PDFService.write((AddressSearchFragment) obj, new CreateAppSpiCall(zzmd.zzl.write(this.read)));
    }
}
