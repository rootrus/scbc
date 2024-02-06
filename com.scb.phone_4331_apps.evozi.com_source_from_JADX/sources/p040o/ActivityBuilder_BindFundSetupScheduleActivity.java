package p040o;

import com.scb.phone.view.fragment.hml.businessowner.p049di.HmlBusinessOwnerGuidelinesPresenterModule;
import p040o.LinkedListMultimap;

/* renamed from: o.ActivityBuilder_BindFundSetupScheduleActivity */
public final class ActivityBuilder_BindFundSetupScheduleActivity implements OPRStatusRewardsLandingActivity_ViewBinding<convertBytesToHex> {
    public static convertBytesToHex IconCompatParcelizer(HmlBusinessOwnerGuidelinesPresenterModule hmlBusinessOwnerGuidelinesPresenterModule, LinkedListMultimap.C35711 r1, RegularImmutableBiMap regularImmutableBiMap, LinkedHashMultiset linkedHashMultiset, readCount readcount) {
        convertBytesToHex read = hmlBusinessOwnerGuidelinesPresenterModule.read(r1, regularImmutableBiMap, linkedHashMultiset, readcount);
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.view.fragment.hml.businessowner.di.HmlBusinessOwnerGuidelinesPresenterModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        return IconCompatParcelizer(r0, (LinkedListMultimap.C35711) r0.get(), (RegularImmutableBiMap) r0.get(), (LinkedHashMultiset) r0.get(), (readCount) r0.get());
    }
}
