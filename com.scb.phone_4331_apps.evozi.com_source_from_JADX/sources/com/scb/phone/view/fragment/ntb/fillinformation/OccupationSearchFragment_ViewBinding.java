package com.scb.phone.view.fragment.ntb.fillinformation;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OccupationSearchFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private OccupationSearchFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public OccupationSearchFragment_ViewBinding(final OccupationSearchFragment occupationSearchFragment, View view) {
        super(occupationSearchFragment, view);
        this.MediaBrowserCompat$ItemReceiver = occupationSearchFragment;
        occupationSearchFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.occupation_title_search_list_recycler_view, "field 'recyclerView'", RecyclerView.class);
        occupationSearchFragment.emptyContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.job_list_empty_container, "field 'emptyContainer'", LinearLayout.class);
        occupationSearchFragment.mSearchEdit = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_edit_text, "field 'mSearchEdit'", EditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.search_edit_clear, "field 'clearButton' and method 'onClickClear'");
        occupationSearchFragment.clearButton = (ImageButton) onStart.write(IconCompatParcelizer2, R.id.search_edit_clear, "field 'clearButton'", ImageButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OccupationSearchFragment.this.onClickClear();
            }
        });
        occupationSearchFragment.notFoundInstruction = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_not_found_instruction, "field 'notFoundInstruction'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_add_title, "field 'addButton' and method 'onAddButtonClick'");
        occupationSearchFragment.addButton = (Button) onStart.write(IconCompatParcelizer3, R.id.button_add_title, "field 'addButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OccupationSearchFragment.this.onAddButtonClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.cancel_button, "method 'onClickCancel'");
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OccupationSearchFragment.this.onClickCancel();
            }
        });
    }

    public final void read() {
        OccupationSearchFragment occupationSearchFragment = this.MediaBrowserCompat$ItemReceiver;
        if (occupationSearchFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            occupationSearchFragment.recyclerView = null;
            occupationSearchFragment.emptyContainer = null;
            occupationSearchFragment.mSearchEdit = null;
            occupationSearchFragment.clearButton = null;
            occupationSearchFragment.notFoundInstruction = null;
            occupationSearchFragment.addButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
