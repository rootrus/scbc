package com.scb.phone.view.fragment.prepaid.traveltab;

import android.view.View;
import android.widget.CompoundButton;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidTravelServicesTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private PrepaidTravelServicesTabFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public PrepaidTravelServicesTabFragment_ViewBinding(final PrepaidTravelServicesTabFragment prepaidTravelServicesTabFragment, View view) {
        super(prepaidTravelServicesTabFragment, view);
        this.MediaBrowserCompat$ItemReceiver = prepaidTravelServicesTabFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.toggleCardLock, "method 'onCardLockToggleChanged'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        ((CompoundButton) IconCompatParcelizer2).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PrepaidTravelServicesTabFragment.this.onCardLockToggleChanged(compoundButton, z);
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.layout_reset_card_pin, "method 'navigateToResetPin'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidTravelServicesTabFragment.this.navigateToResetPin();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            ((CompoundButton) this.IconCompatParcelizer).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
