package com.scb.phone.view.adapter.hml;

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
import java.util.ArrayList;
import p040o.FundFactSheetActivity;
import p040o.Futures;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class HmlDocumentListAdapter extends RecyclerView.IconCompatParcelizer<DocumentViewHolder> {
    private final FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver;
    private final boolean read;
    public ArrayList<Futures.ListenableFutureAdapter.C34161.read> write = new ArrayList<>();

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82032131493429, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…list_item, parent, false)");
        return new DocumentViewHolder(inflate, this.read);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DocumentViewHolder documentViewHolder = (DocumentViewHolder) setcontentview;
        onGetStartedClick.write((Object) documentViewHolder, "holder");
        Futures.ListenableFutureAdapter.C34161.read read2 = this.write.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "items[position]");
        Futures.ListenableFutureAdapter.C34161.read read3 = read2;
        FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) read3, "item");
        onGetStartedClick.write((Object) fundFactSheetActivity, "notifyParent");
        TextView textView = documentViewHolder.documentName;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentName");
        }
        textView.setText(read3.MediaBrowserCompat$CustomActionResultReceiver);
        if (documentViewHolder.AlertController$RecycleListView) {
            ImageView imageView = documentViewHolder.deleteIcon;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("deleteIcon");
            }
            imageView.setOnClickListener(new DocumentViewHolder.write(fundFactSheetActivity, read3));
            return;
        }
        ImageView imageView2 = documentViewHolder.deleteIcon;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("deleteIcon");
        }
        imageView2.setVisibility(8);
    }

    public HmlDocumentListAdapter(FundFactSheetActivity<? super String, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, boolean z) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "notifyParent");
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
        this.read = z;
    }

    public final class DocumentViewHolder_ViewBinding implements Unbinder {
        private DocumentViewHolder IconCompatParcelizer;

        public DocumentViewHolder_ViewBinding(DocumentViewHolder documentViewHolder, View view) {
            this.IconCompatParcelizer = documentViewHolder;
            documentViewHolder.documentName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.document_name_tv, "field 'documentName'", TextView.class);
            documentViewHolder.deleteIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.delete_icon_iv, "field 'deleteIcon'", ImageView.class);
        }

        public final void read() {
            DocumentViewHolder documentViewHolder = this.IconCompatParcelizer;
            if (documentViewHolder != null) {
                this.IconCompatParcelizer = null;
                documentViewHolder.documentName = null;
                documentViewHolder.deleteIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public static final class DocumentViewHolder extends RecyclerView.setContentView {
        final boolean AlertController$RecycleListView;
        @BindView
        public ImageView deleteIcon;
        @BindView
        public TextView documentName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DocumentViewHolder(View view, boolean z) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.AlertController$RecycleListView = z;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class write implements View.OnClickListener {
            private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$ItemReceiver;
            private /* synthetic */ Futures.ListenableFutureAdapter.C34161.read read;

            write(FundFactSheetActivity fundFactSheetActivity, Futures.ListenableFutureAdapter.C34161.read read2) {
                this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
                this.read = read2;
            }

            public final void onClick(View view) {
                this.MediaBrowserCompat$ItemReceiver.invoke(this.read.write);
            }
        }
    }
}
