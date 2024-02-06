package com.scb.phone.view.adapter.easycash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.closeOrLog;
import p040o.getBillerByAccountNumber;
import p040o.onStart;

public final class AdditionDocumentAdapter extends RecyclerView.IconCompatParcelizer<DocumentViewHolder> {
    public C5743x44174185 MediaBrowserCompat$ItemReceiver;
    public List<closeOrLog> write;

    public class DocumentViewHolder_ViewBinding implements Unbinder {
        private DocumentViewHolder IconCompatParcelizer;

        public DocumentViewHolder_ViewBinding(DocumentViewHolder documentViewHolder, View view) {
            this.IconCompatParcelizer = documentViewHolder;
            documentViewHolder.documentDes = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.document_type, "field 'documentDes'", TextView.class);
            documentViewHolder.imageName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_name, "field 'imageName'", TextView.class);
            documentViewHolder.deleteButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.delete_image_view, "field 'deleteButton'", ImageView.class);
        }

        public final void read() {
            DocumentViewHolder documentViewHolder = this.IconCompatParcelizer;
            if (documentViewHolder != null) {
                this.IconCompatParcelizer = null;
                documentViewHolder.documentDes = null;
                documentViewHolder.imageName = null;
                documentViewHolder.deleteButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DocumentViewHolder documentViewHolder = (DocumentViewHolder) setcontentview;
        closeOrLog closeorlog = this.write.get(i);
        documentViewHolder.documentDes.setText(closeorlog.MediaBrowserCompat$ItemReceiver);
        documentViewHolder.imageName.setText(closeorlog.IconCompatParcelizer);
        documentViewHolder.deleteButton.setOnClickListener(new getBillerByAccountNumber(this, i, closeorlog));
    }

    public AdditionDocumentAdapter(List<closeOrLog> list, C5743x44174185 additionDocumentAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = additionDocumentAdapter$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int IconCompatParcelizer() {
        List<closeOrLog> list = this.write;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class DocumentViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView deleteButton;
        @BindView
        TextView documentDes;
        @BindView
        TextView imageName;

        DocumentViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DocumentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82192131493445, viewGroup, false));
    }
}
