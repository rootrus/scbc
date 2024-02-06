package p040o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.custom.profilemanagement.ReviewAccountCustomView;
import com.scb.phone.view.custom.profilemanagement.ReviewAccountItemCustomView;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.verifyRegistration */
public final class verifyRegistration extends getRecommendedBiller<write> {
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ((write) setcontentview).Keep.setDisplay(this.read.get(i));
    }

    public verifyRegistration() {
        super((List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder>) null);
    }

    /* renamed from: o.verifyRegistration$write */
    static class write extends RecyclerView.setContentView {
        ReviewAccountCustomView Keep;

        public write(ReviewAccountCustomView reviewAccountCustomView) {
            super(reviewAccountCustomView);
            this.Keep = reviewAccountCustomView;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new write(new ReviewAccountItemCustomView(viewGroup.getContext()));
    }
}
