package p040o;

import android.view.View;
import android.widget.RadioGroup;
import com.scb.phone.view.activity.ccrredemption.product.ProductListActivity;

/* renamed from: o.kY */
public final /* synthetic */ class C10032kY implements View.OnClickListener {
    private final /* synthetic */ RadioGroup MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ RadioGroup read;

    public /* synthetic */ C10032kY(RadioGroup radioGroup, RadioGroup radioGroup2) {
        this.MediaBrowserCompat$ItemReceiver = radioGroup;
        this.read = radioGroup2;
    }

    public final void onClick(View view) {
        ProductListActivity.read(this.MediaBrowserCompat$ItemReceiver, this.read);
    }
}
