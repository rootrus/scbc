package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlDocumentUploadGuidelineFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private HmlDocumentUploadGuidelineFragment MediaBrowserCompat$ItemReceiver;

    public HmlDocumentUploadGuidelineFragment_ViewBinding(final HmlDocumentUploadGuidelineFragment hmlDocumentUploadGuidelineFragment, View view) {
        super(hmlDocumentUploadGuidelineFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentUploadGuidelineFragment;
        hmlDocumentUploadGuidelineFragment.recycler = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_documents_container, "field 'recycler'", RecyclerView.class);
        hmlDocumentUploadGuidelineFragment.subtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_doc_guideline_subtitle, "field 'subtitle'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_next, "field 'nextButton' and method 'onNextClicked'");
        hmlDocumentUploadGuidelineFragment.nextButton = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_next, "field 'nextButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlDocumentUploadGuidelineFragment.this.onNextClicked();
            }
        });
    }

    public final void read() {
        HmlDocumentUploadGuidelineFragment hmlDocumentUploadGuidelineFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlDocumentUploadGuidelineFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlDocumentUploadGuidelineFragment.recycler = null;
            hmlDocumentUploadGuidelineFragment.subtitle = null;
            hmlDocumentUploadGuidelineFragment.nextButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
