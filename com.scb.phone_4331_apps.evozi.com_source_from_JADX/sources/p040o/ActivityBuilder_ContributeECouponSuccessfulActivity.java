package p040o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.fragment.landingpage.LandingFragment;
import java.lang.ref.WeakReference;
import kotlin.TypeCastException;

/* renamed from: o.ActivityBuilder_ContributeECouponSuccessfulActivity */
public final class ActivityBuilder_ContributeECouponSuccessfulActivity extends ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity {
    private WeakReference<LinearLayout> IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityBuilder_ContributeECouponSuccessfulActivity(LandingFragment landingFragment, RecyclerView recyclerView, LinearLayout linearLayout) {
        super(landingFragment, recyclerView);
        onGetStartedClick.write((Object) landingFragment, "landingFragment");
        onGetStartedClick.write((Object) recyclerView, "recyclerView");
        onGetStartedClick.write((Object) linearLayout, "staticTapToRetry");
        this.IconCompatParcelizer = new WeakReference<>(linearLayout);
    }

    public final boolean read() {
        return super.read() && this.IconCompatParcelizer.get() != null;
    }

    public final void run() {
        LinearLayout linearLayout;
        if ((super.read() && this.IconCompatParcelizer.get() != null) && (linearLayout = this.IconCompatParcelizer.get()) != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.height = super.IconCompatParcelizer();
                linearLayout.setLayoutParams(layoutParams2);
                linearLayout.setVisibility(0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }
}
