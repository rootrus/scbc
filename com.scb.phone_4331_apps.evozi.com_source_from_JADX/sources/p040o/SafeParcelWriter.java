package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;

/* renamed from: o.SafeParcelWriter */
public final /* synthetic */ class SafeParcelWriter implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ DurationEmploymentForBusinessDialog.read read;

    public /* synthetic */ SafeParcelWriter(DurationEmploymentForBusinessDialog.read read2) {
        this.read = read2;
    }

    public final Object write(Object obj) {
        return FragmentBuilder_ContributeMututalFundOnboardingReviewFragment.write((getSortedRenderTimes) ((SingleDataEntity) obj).getData());
    }
}
