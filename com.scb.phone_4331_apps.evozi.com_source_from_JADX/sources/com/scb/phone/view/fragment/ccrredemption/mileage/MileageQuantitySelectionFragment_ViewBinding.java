package com.scb.phone.view.fragment.ccrredemption.mileage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MileageQuantitySelectionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MileageQuantitySelectionFragment IconCompatParcelizer;
    private View write;

    public MileageQuantitySelectionFragment_ViewBinding(final MileageQuantitySelectionFragment mileageQuantitySelectionFragment, View view) {
        super(mileageQuantitySelectionFragment, view);
        this.IconCompatParcelizer = mileageQuantitySelectionFragment;
        mileageQuantitySelectionFragment.vgMiles = (ViewGroup) onStart.IconCompatParcelizer(view, R.id.layout_spinner_miles, "field 'vgMiles'", ViewGroup.class);
        mileageQuantitySelectionFragment.vgPoints = (ViewGroup) onStart.IconCompatParcelizer(view, R.id.layout_spinner_points, "field 'vgPoints'", ViewGroup.class);
        mileageQuantitySelectionFragment.txvPointsToMiles = (TextView) onStart.IconCompatParcelizer(view, R.id.txv_label_points_to_miles, "field 'txvPointsToMiles'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_next, "method 'onNextClick'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MileageQuantitySelectionFragment.this.onNextClick();
            }
        });
    }

    public final void read() {
        MileageQuantitySelectionFragment mileageQuantitySelectionFragment = this.IconCompatParcelizer;
        if (mileageQuantitySelectionFragment != null) {
            this.IconCompatParcelizer = null;
            mileageQuantitySelectionFragment.vgMiles = null;
            mileageQuantitySelectionFragment.vgPoints = null;
            mileageQuantitySelectionFragment.txvPointsToMiles = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
