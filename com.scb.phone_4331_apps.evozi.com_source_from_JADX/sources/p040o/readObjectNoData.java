package p040o;

import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpTargetTabFragment;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AbstractMapBasedMultiset;
import p040o.AbstractMultimap;

/* renamed from: o.readObjectNoData */
public final class readObjectNoData extends AbstractMapBasedMultiset.EntrySet {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public readObjectNoData(AbstractMultimap.AsMap asMap) {
        super(asMap);
        onGetStartedClick.write((Object) asMap, "stickyParamRepositoryContractor");
    }

    public final void read(String str, String str2) {
        onGetStartedClick.write((Object) str, "adsName");
        onGetStartedClick.write((Object) str2, "adsId");
        OffsetDateTime now = OffsetDateTime.now();
        onGetStartedClick.IconCompatParcelizer((Object) now, "now");
        write(new TopUpTargetTabFragment.read(str, "banner", str2, now));
    }
}
