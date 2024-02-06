package p040o;

import android.view.View;
import com.scb.phone.view.fragment.closeaccount.CloseAccountReviewFragment;
import p040o.ObjectTypeAdapter;

/* renamed from: o.getDynamicTilesList */
public final /* synthetic */ class getDynamicTilesList implements View.OnClickListener {
    private final /* synthetic */ CloseAccountReviewFragment write;

    public /* synthetic */ getDynamicTilesList(CloseAccountReviewFragment closeAccountReviewFragment) {
        this.write = closeAccountReviewFragment;
    }

    public final void onClick(View view) {
        getBoundFields getboundfields = this.write.presenter;
        ObjectTypeAdapter.C36971 r0 = ObjectTypeAdapter.C36971.write;
        if (getboundfields.RatingCompat != null) {
            r0.IconCompatParcelizer(getboundfields.RatingCompat);
        }
    }
}
