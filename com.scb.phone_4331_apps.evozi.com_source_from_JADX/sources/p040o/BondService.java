package p040o;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.adapter.easycash.viewholder.AccountRemarkViewHolder;

/* renamed from: o.BondService */
public final class BondService extends AccountRemarkViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BondService(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(populatePID populatepid, boolean z) {
        onGetStartedClick.write((Object) populatepid, "display");
        CommonUtils commonUtils = populatepid;
        onGetStartedClick.write((Object) commonUtils, "display");
        TextView textView = this.remark;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark");
        }
        textView.setText(commonUtils.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView2 = this.remark;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark");
        }
        textView2.setVisibility(z ? 8 : 0);
    }
}
