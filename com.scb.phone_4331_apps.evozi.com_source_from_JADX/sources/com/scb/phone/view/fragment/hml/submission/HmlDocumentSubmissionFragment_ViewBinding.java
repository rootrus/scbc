package com.scb.phone.view.fragment.hml.submission;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class HmlDocumentSubmissionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlDocumentSubmissionFragment MediaBrowserCompat$ItemReceiver;

    public HmlDocumentSubmissionFragment_ViewBinding(HmlDocumentSubmissionFragment hmlDocumentSubmissionFragment, View view) {
        super(hmlDocumentSubmissionFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentSubmissionFragment;
        hmlDocumentSubmissionFragment.documentRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rcv_document_list, "field 'documentRecyclerView'", RecyclerView.class);
        hmlDocumentSubmissionFragment.dateRemarkText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_doc_submission_date_remark, "field 'dateRemarkText'", TextView.class);
        hmlDocumentSubmissionFragment.uploadedFiles = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_submission_number_files_value, "field 'uploadedFiles'", TextView.class);
        hmlDocumentSubmissionFragment.submissionButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_doc_submission_next, "field 'submissionButton'", Button.class);
        hmlDocumentSubmissionFragment.resubmissionIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ic_resubmission, "field 'resubmissionIcon'", ImageView.class);
    }

    public void read() {
        HmlDocumentSubmissionFragment hmlDocumentSubmissionFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlDocumentSubmissionFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlDocumentSubmissionFragment.documentRecyclerView = null;
            hmlDocumentSubmissionFragment.dateRemarkText = null;
            hmlDocumentSubmissionFragment.uploadedFiles = null;
            hmlDocumentSubmissionFragment.submissionButton = null;
            hmlDocumentSubmissionFragment.resubmissionIcon = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
