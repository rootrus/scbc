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
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.TypeCastException;
import org.bouncycastle.i18n.MessageBundle;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.writeInitialPartsTo;
import p040o.writeSessionEvent;
import p040o.writeSessionOS;

public final class HmlDocumentsUploadedAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    private final List<writeSessionOS> write;

    public final class GroupTitleViewHolder_ViewBinding implements Unbinder {
        private GroupTitleViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public GroupTitleViewHolder_ViewBinding(GroupTitleViewHolder groupTitleViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = groupTitleViewHolder;
            groupTitleViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_group_title, "field 'title'", TextView.class);
        }

        public final void read() {
            GroupTitleViewHolder groupTitleViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (groupTitleViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                groupTitleViewHolder.title = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class DocumentViewHolder_ViewBinding implements Unbinder {
        private DocumentViewHolder MediaBrowserCompat$ItemReceiver;

        public DocumentViewHolder_ViewBinding(DocumentViewHolder documentViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = documentViewHolder;
            documentViewHolder.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_document_icon, "field 'icon'", ImageView.class);
            documentViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_document_title, "field 'title'", TextView.class);
        }

        public final void read() {
            DocumentViewHolder documentViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (documentViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                documentViewHolder.icon = null;
                documentViewHolder.title = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public HmlDocumentsUploadedAdapter(List<? extends writeSessionOS> list) {
        onGetStartedClick.write((Object) list, "documents");
        this.write = list;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 1) {
            View inflate = from.inflate(R.layout.f90542131494281, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "it.inflate(R.layout.item…with_icon, parent, false)");
            return new DocumentViewHolder(inflate);
        }
        View inflate2 = from.inflate(R.layout.f90932131494320, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate2, "it.inflate(R.layout.item…ple_title, parent, false)");
        return new GroupTitleViewHolder(inflate2);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.write.get(i) instanceof writeSessionEvent ? 1 : 2;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CharSequence charSequence;
        onGetStartedClick.write((Object) setcontentview, "holder");
        if (setcontentview instanceof GroupTitleViewHolder) {
            GroupTitleViewHolder groupTitleViewHolder = (GroupTitleViewHolder) setcontentview;
            writeSessionOS writesessionos = this.write.get(i);
            if (writesessionos != null) {
                writeSessionEvent writesessionevent = (writeSessionEvent) writesessionos;
                onGetStartedClick.write((Object) writesessionevent, "group");
                TextView textView = groupTitleViewHolder.title;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
                }
                textView.setText(writesessionevent.read);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.hml.HmlDocumentGroupDisplay");
        } else if (setcontentview instanceof DocumentViewHolder) {
            DocumentViewHolder documentViewHolder = (DocumentViewHolder) setcontentview;
            writeSessionOS writesessionos2 = this.write.get(i);
            if (writesessionos2 != null) {
                writeInitialPartsTo writeinitialpartsto = (writeInitialPartsTo) writesessionos2;
                onGetStartedClick.write((Object) writeinitialpartsto, "document");
                FragmentBuilder_BindFundDetailSummaryFragment write2 = Picasso.read().write(writeinitialpartsto.write);
                ImageView imageView = documentViewHolder.icon;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("icon");
                }
                write2.read(imageView, (FragmentBuilder_BindEkycFragment) null);
                TextView textView2 = documentViewHolder.title;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
                }
                if (writeinitialpartsto.IconCompatParcelizer.length() > 0) {
                    String str = writeinitialpartsto.read;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    TextView textView3 = documentViewHolder.title;
                    if (textView3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
                    }
                    sb.append(textView3.getContext().getString(R.string.hml_document_guidelines_extra, new Object[]{writeinitialpartsto.IconCompatParcelizer}));
                    charSequence = sb.toString();
                } else {
                    charSequence = writeinitialpartsto.read;
                }
                textView2.setText(charSequence);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.hml.HmlDocumentTypeDisplay");
        }
    }

    public static final class DocumentViewHolder extends RecyclerView.setContentView {
        @BindView
        public ImageView icon;
        @BindView
        public TextView title;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DocumentViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static final class GroupTitleViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView title;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GroupTitleViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
