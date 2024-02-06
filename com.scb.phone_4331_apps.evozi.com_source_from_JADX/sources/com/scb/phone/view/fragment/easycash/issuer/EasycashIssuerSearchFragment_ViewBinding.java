package com.scb.phone.view.fragment.easycash.issuer;

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

public class EasycashIssuerSearchFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EasycashIssuerSearchFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public EasycashIssuerSearchFragment_ViewBinding(final EasycashIssuerSearchFragment easycashIssuerSearchFragment, View view) {
        super(easycashIssuerSearchFragment, view);
        this.IconCompatParcelizer = easycashIssuerSearchFragment;
        easycashIssuerSearchFragment.notFoundInstruction = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_not_found_instruction, "field 'notFoundInstruction'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_add_title, "field 'addButton' and method 'onAddButtonClick'");
        easycashIssuerSearchFragment.addButton = (Button) onStart.write(IconCompatParcelizer2, R.id.button_add_title, "field 'addButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashIssuerSearchFragment.this.onAddButtonClick();
            }
        });
        easycashIssuerSearchFragment.notFoundText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_not_found, "field 'notFoundText'", TextView.class);
        easycashIssuerSearchFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.occupation_title_search_list_recycler_view, "field 'recyclerView'", RecyclerView.class);
        easycashIssuerSearchFragment.emptyContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.job_list_empty_container, "field 'emptyContainer'", LinearLayout.class);
        easycashIssuerSearchFragment.mSearchEdit = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.search_edit_text, "field 'mSearchEdit'", EditText.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.search_edit_clear, "field 'clearButton' and method 'onClickClear'");
        easycashIssuerSearchFragment.clearButton = (ImageButton) onStart.write(IconCompatParcelizer3, R.id.search_edit_clear, "field 'clearButton'", ImageButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashIssuerSearchFragment.this.onClickClear();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.cancel_button, "method 'onClickCancel'");
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashIssuerSearchFragment.this.onClickCancel();
            }
        });
    }

    public final void read() {
        EasycashIssuerSearchFragment easycashIssuerSearchFragment = this.IconCompatParcelizer;
        if (easycashIssuerSearchFragment != null) {
            this.IconCompatParcelizer = null;
            easycashIssuerSearchFragment.notFoundInstruction = null;
            easycashIssuerSearchFragment.addButton = null;
            easycashIssuerSearchFragment.notFoundText = null;
            easycashIssuerSearchFragment.recyclerView = null;
            easycashIssuerSearchFragment.emptyContainer = null;
            easycashIssuerSearchFragment.mSearchEdit = null;
            easycashIssuerSearchFragment.clearButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
