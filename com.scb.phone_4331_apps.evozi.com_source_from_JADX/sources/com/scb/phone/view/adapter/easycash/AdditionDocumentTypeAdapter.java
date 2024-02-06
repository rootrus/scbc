package com.scb.phone.view.adapter.easycash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.closeOrLog;
import p040o.getBillPaymentReview;
import p040o.onStart;

public final class AdditionDocumentTypeAdapter extends RecyclerView.IconCompatParcelizer<DocumentViewHolder> {
    private List<closeOrLog> MediaBrowserCompat$ItemReceiver;
    public final read read;

    @FunctionalInterface
    public interface read {
        void write(closeOrLog closeorlog);
    }

    public class DocumentViewHolder_ViewBinding implements Unbinder {
        private DocumentViewHolder MediaBrowserCompat$ItemReceiver;

        public DocumentViewHolder_ViewBinding(DocumentViewHolder documentViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = documentViewHolder;
            documentViewHolder.documentDes = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_text, "field 'documentDes'", TextView.class);
        }

        public final void read() {
            DocumentViewHolder documentViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (documentViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                documentViewHolder.documentDes = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DocumentViewHolder documentViewHolder = (DocumentViewHolder) setcontentview;
        closeOrLog closeorlog = this.MediaBrowserCompat$ItemReceiver.get(i);
        documentViewHolder.documentDes.setText(closeorlog.MediaBrowserCompat$ItemReceiver);
        documentViewHolder.documentDes.setOnClickListener(new getBillPaymentReview(this, closeorlog));
    }

    public AdditionDocumentTypeAdapter(List<closeOrLog> list, read read2) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = read2;
    }

    public final int IconCompatParcelizer() {
        List<closeOrLog> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class DocumentViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView documentDes;

        DocumentViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DocumentViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83922131493618, viewGroup, false));
    }
}
