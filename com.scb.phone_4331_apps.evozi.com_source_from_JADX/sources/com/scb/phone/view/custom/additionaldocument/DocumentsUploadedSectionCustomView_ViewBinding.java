package com.scb.phone.view.custom.additionaldocument;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class DocumentsUploadedSectionCustomView_ViewBinding implements Unbinder {
    private DocumentsUploadedSectionCustomView write;

    public DocumentsUploadedSectionCustomView_ViewBinding(DocumentsUploadedSectionCustomView documentsUploadedSectionCustomView, View view) {
        this.write = documentsUploadedSectionCustomView;
        documentsUploadedSectionCustomView.label = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label, "field 'label'", TextView.class);
        documentsUploadedSectionCustomView.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'tvRemark'", TextView.class);
        documentsUploadedSectionCustomView.questionMark = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.question_icon, "field 'questionMark'", ImageView.class);
        documentsUploadedSectionCustomView.listLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.list, "field 'listLayout'", LinearLayout.class);
        documentsUploadedSectionCustomView.addButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.add_button, "field 'addButton'", Button.class);
        documentsUploadedSectionCustomView.separator = onStart.IconCompatParcelizer(view, R.id.bottom_separator, "field 'separator'");
    }

    public final void read() {
        DocumentsUploadedSectionCustomView documentsUploadedSectionCustomView = this.write;
        if (documentsUploadedSectionCustomView != null) {
            this.write = null;
            documentsUploadedSectionCustomView.label = null;
            documentsUploadedSectionCustomView.tvRemark = null;
            documentsUploadedSectionCustomView.questionMark = null;
            documentsUploadedSectionCustomView.listLayout = null;
            documentsUploadedSectionCustomView.addButton = null;
            documentsUploadedSectionCustomView.separator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
