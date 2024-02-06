package com.scb.phone.view.fragment.easycash.financialinformation;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class AdditionDocumentInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private AdditionDocumentInputFragment MediaBrowserCompat$ItemReceiver;

    public AdditionDocumentInputFragment_ViewBinding(final AdditionDocumentInputFragment additionDocumentInputFragment, View view) {
        super(additionDocumentInputFragment, view);
        this.MediaBrowserCompat$ItemReceiver = additionDocumentInputFragment;
        additionDocumentInputFragment.requiredDocText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_msg, "field 'requiredDocText'", TextView.class);
        additionDocumentInputFragment.rvDocument = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_document, "field 'rvDocument'", RecyclerView.class);
        additionDocumentInputFragment.layoutPhotoAttached = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_photo_attached, "field 'layoutPhotoAttached'", LinearLayout.class);
        additionDocumentInputFragment.tvPhotoAttached = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_photo_attached, "field 'tvPhotoAttached'", TextView.class);
        additionDocumentInputFragment.requiredDocTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.required_document_title, "field 'requiredDocTitle'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_done, "method 'doneAction'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AdditionDocumentInputFragment.this.doneAction();
            }
        });
    }

    public final void read() {
        AdditionDocumentInputFragment additionDocumentInputFragment = this.MediaBrowserCompat$ItemReceiver;
        if (additionDocumentInputFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            additionDocumentInputFragment.requiredDocText = null;
            additionDocumentInputFragment.rvDocument = null;
            additionDocumentInputFragment.layoutPhotoAttached = null;
            additionDocumentInputFragment.tvPhotoAttached = null;
            additionDocumentInputFragment.requiredDocTitle = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
