package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlDocumentListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlDocumentListFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlDocumentListFragment_ViewBinding(final HmlDocumentListFragment hmlDocumentListFragment, View view) {
        super(hmlDocumentListFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentListFragment;
        hmlDocumentListFragment.documentListRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_documents_rv, "field 'documentListRecyclerView'", RecyclerView.class);
        hmlDocumentListFragment.documentsEmptyListLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_documents_empty_ll, "field 'documentsEmptyListLinearLayout'", LinearLayout.class);
        hmlDocumentListFragment.documentsResubmitReasonLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_documents_resubmit_reason_ll, "field 'documentsResubmitReasonLinearLayout'", LinearLayout.class);
        hmlDocumentListFragment.documentListResubmitReasonTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_documents_resubmit_reason_tv, "field 'documentListResubmitReasonTextView'", TextView.class);
        hmlDocumentListFragment.documentListMaxReachedTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_documents_max_files_reached, "field 'documentListMaxReachedTextView'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.hml_documents_list_add_btn, "field 'documentListAddButton' and method 'onAddNewButtonClicked'");
        hmlDocumentListFragment.documentListAddButton = (Button) onStart.write(IconCompatParcelizer, R.id.hml_documents_list_add_btn, "field 'documentListAddButton'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlDocumentListFragment.this.onAddNewButtonClicked();
            }
        });
    }

    public final void read() {
        HmlDocumentListFragment hmlDocumentListFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlDocumentListFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlDocumentListFragment.documentListRecyclerView = null;
            hmlDocumentListFragment.documentsEmptyListLinearLayout = null;
            hmlDocumentListFragment.documentsResubmitReasonLinearLayout = null;
            hmlDocumentListFragment.documentListResubmitReasonTextView = null;
            hmlDocumentListFragment.documentListMaxReachedTextView = null;
            hmlDocumentListFragment.documentListAddButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
