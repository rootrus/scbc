package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import p040o.onStart;

public final class HmlBusinessOwnerETBPersonalInfoFragment_ViewBinding extends HmlETBPersonalInfoFragment_ViewBinding {
    private HmlBusinessOwnerETBPersonalInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

    public HmlBusinessOwnerETBPersonalInfoFragment_ViewBinding(HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment, View view) {
        super(hmlBusinessOwnerETBPersonalInfoFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOwnerETBPersonalInfoFragment;
        hmlBusinessOwnerETBPersonalInfoFragment.incomeSection = onStart.IconCompatParcelizer(view, R.id.section_income, "field 'incomeSection'");
        hmlBusinessOwnerETBPersonalInfoFragment.spouseHeaderLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_spouse_header, "field 'spouseHeaderLabel'", TextView.class);
        hmlBusinessOwnerETBPersonalInfoFragment.spouseCitizenToggler = (CustomAcceptDeclineButtons) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bts_citizenship, "field 'spouseCitizenToggler'", CustomAcceptDeclineButtons.class);
        hmlBusinessOwnerETBPersonalInfoFragment.spouseCitizenFooter = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_marital_footer, "field 'spouseCitizenFooter'", TextView.class);
        hmlBusinessOwnerETBPersonalInfoFragment.spouseCitizenError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_marital_error, "field 'spouseCitizenError'", TextView.class);
        hmlBusinessOwnerETBPersonalInfoFragment.spouseFirstNameInput = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.civg_marital_first, "field 'spouseFirstNameInput'", CommonInputViewGroup.class);
        hmlBusinessOwnerETBPersonalInfoFragment.spouseLastNameInput = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.civg_marital_last, "field 'spouseLastNameInput'", CommonInputViewGroup.class);
        hmlBusinessOwnerETBPersonalInfoFragment.spouseNIDInput = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.civg_marital_nid, "field 'spouseNIDInput'", CommonInputViewGroup.class);
        hmlBusinessOwnerETBPersonalInfoFragment.spouseSeparator = onStart.IconCompatParcelizer(view, R.id.spouse_separator, "field 'spouseSeparator'");
    }

    public final void read() {
        HmlBusinessOwnerETBPersonalInfoFragment hmlBusinessOwnerETBPersonalInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlBusinessOwnerETBPersonalInfoFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlBusinessOwnerETBPersonalInfoFragment.incomeSection = null;
            hmlBusinessOwnerETBPersonalInfoFragment.spouseHeaderLabel = null;
            hmlBusinessOwnerETBPersonalInfoFragment.spouseCitizenToggler = null;
            hmlBusinessOwnerETBPersonalInfoFragment.spouseCitizenFooter = null;
            hmlBusinessOwnerETBPersonalInfoFragment.spouseCitizenError = null;
            hmlBusinessOwnerETBPersonalInfoFragment.spouseFirstNameInput = null;
            hmlBusinessOwnerETBPersonalInfoFragment.spouseLastNameInput = null;
            hmlBusinessOwnerETBPersonalInfoFragment.spouseNIDInput = null;
            hmlBusinessOwnerETBPersonalInfoFragment.spouseSeparator = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
