package p040o;

import android.app.Dialog;
import android.view.View;
import android.widget.RadioGroup;
import com.scb.phone.R;
import com.scb.phone.view.activity.ccrredemption.product.ProductListActivity;
import com.scb.phone.view.fragment.ccrredemption.product.ProductListFragment;

/* renamed from: o.kT */
public final /* synthetic */ class C10030kT implements View.OnClickListener {
    private final /* synthetic */ ProductListActivity MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Dialog MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ RadioGroup read;
    private final /* synthetic */ RadioGroup write;

    public /* synthetic */ C10030kT(ProductListActivity productListActivity, RadioGroup radioGroup, RadioGroup radioGroup2, Dialog dialog) {
        this.MediaBrowserCompat$CustomActionResultReceiver = productListActivity;
        this.write = radioGroup;
        this.read = radioGroup2;
        this.MediaBrowserCompat$ItemReceiver = dialog;
    }

    public final void onClick(View view) {
        ProductListActivity productListActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        RadioGroup radioGroup = this.write;
        RadioGroup radioGroup2 = this.read;
        Dialog dialog = this.MediaBrowserCompat$ItemReceiver;
        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        int checkedRadioButtonId2 = radioGroup2.getCheckedRadioButtonId();
        zzvg MediaBrowserCompat$CustomActionResultReceiver2 = ProductListActivity.MediaBrowserCompat$CustomActionResultReceiver(checkedRadioButtonId);
        zzvd read2 = ProductListActivity.read(checkedRadioButtonId2);
        arrayOf arrayof = productListActivity.presenter;
        arrayof.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write(MediaBrowserCompat$CustomActionResultReceiver2);
        arrayof.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write(read2);
        ((ProductListFragment) productListActivity.getSupportFragmentManager().findFragmentById(R.id.fragment_category_listing)).IconCompatParcelizer();
        productListActivity.filterAppliedIndicator.setVisibility(productListActivity.presenter.IconCompatParcelizer());
        dialog.dismiss();
    }
}
