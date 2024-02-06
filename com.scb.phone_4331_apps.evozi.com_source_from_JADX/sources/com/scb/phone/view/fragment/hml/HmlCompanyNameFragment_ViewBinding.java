package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class HmlCompanyNameFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlCompanyNameFragment IconCompatParcelizer;

    public HmlCompanyNameFragment_ViewBinding(HmlCompanyNameFragment hmlCompanyNameFragment, View view) {
        super(hmlCompanyNameFragment, view);
        this.IconCompatParcelizer = hmlCompanyNameFragment;
        hmlCompanyNameFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_company_list, "field 'recyclerView'", RecyclerView.class);
        hmlCompanyNameFragment.emptyContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.job_list_empty_container, "field 'emptyContainer'", LinearLayout.class);
        hmlCompanyNameFragment.notFoundInstruction = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_not_found_instruction, "field 'notFoundInstruction'", TextView.class);
        hmlCompanyNameFragment.mSearchEdit = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_edit_text, "field 'mSearchEdit'", EditText.class);
        hmlCompanyNameFragment.clearButton = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_edit_clear, "field 'clearButton'", ImageButton.class);
        hmlCompanyNameFragment.addButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_add_title, "field 'addButton'", Button.class);
        hmlCompanyNameFragment.searchButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cancel_button, "field 'searchButton'", DefaultButton.class);
        hmlCompanyNameFragment.tvInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_info, "field 'tvInfo'", TextView.class);
    }

    public final void read() {
        HmlCompanyNameFragment hmlCompanyNameFragment = this.IconCompatParcelizer;
        if (hmlCompanyNameFragment != null) {
            this.IconCompatParcelizer = null;
            hmlCompanyNameFragment.recyclerView = null;
            hmlCompanyNameFragment.emptyContainer = null;
            hmlCompanyNameFragment.notFoundInstruction = null;
            hmlCompanyNameFragment.mSearchEdit = null;
            hmlCompanyNameFragment.clearButton = null;
            hmlCompanyNameFragment.addButton = null;
            hmlCompanyNameFragment.searchButton = null;
            hmlCompanyNameFragment.tvInfo = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
