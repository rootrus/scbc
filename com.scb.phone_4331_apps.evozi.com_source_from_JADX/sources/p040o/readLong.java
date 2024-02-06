package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;

/* renamed from: o.readLong */
public final /* synthetic */ class readLong implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ DurationEmploymentForBusinessDialog.read IconCompatParcelizer;

    public /* synthetic */ readLong(DurationEmploymentForBusinessDialog.read read) {
        this.IconCompatParcelizer = read;
    }

    public final Object write(Object obj) {
        return FragmentBuilder_ContributeMututalFundOnboardingReviewFragment.write((getSortedRenderTimes) ((SingleDataEntity) obj).getData());
    }
}
