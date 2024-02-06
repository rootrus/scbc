package com.scb.phone.view.adapter.hml;

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
import org.bouncycastle.i18n.MessageBundle;
import p040o.getCreateReportSpiCall;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class HmlAboutAdapter extends RecyclerView.IconCompatParcelizer<HmlAboutViewHolder> {
    private final List<getCreateReportSpiCall> read;

    public HmlAboutAdapter(List<getCreateReportSpiCall> list) {
        onGetStartedClick.write((Object) list, "items");
        this.read = list;
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83022131493528, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…hml_about, parent, false)");
        return new HmlAboutViewHolder(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        HmlAboutViewHolder hmlAboutViewHolder = (HmlAboutViewHolder) setcontentview;
        onGetStartedClick.write((Object) hmlAboutViewHolder, "holder");
        getCreateReportSpiCall getcreatereportspicall = this.read.get(i);
        onGetStartedClick.write((Object) getcreatereportspicall, "hmlAboutDisplay");
        String str = getcreatereportspicall.write;
        if (str != null) {
            TextView textView = hmlAboutViewHolder.title;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
            }
            textView.setVisibility(0);
            TextView textView2 = hmlAboutViewHolder.title;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
            }
            textView2.setText(str);
        }
        String str2 = getcreatereportspicall.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            TextView textView3 = hmlAboutViewHolder.info;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("info");
            }
            textView3.setVisibility(0);
            TextView textView4 = hmlAboutViewHolder.info;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("info");
            }
            textView4.setText(str2);
        }
    }

    public final class HmlAboutViewHolder_ViewBinding implements Unbinder {
        private HmlAboutViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public HmlAboutViewHolder_ViewBinding(HmlAboutViewHolder hmlAboutViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlAboutViewHolder;
            hmlAboutViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'title'", TextView.class);
            hmlAboutViewHolder.info = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_info, "field 'info'", TextView.class);
        }

        public final void read() {
            HmlAboutViewHolder hmlAboutViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (hmlAboutViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                hmlAboutViewHolder.title = null;
                hmlAboutViewHolder.info = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public static final class HmlAboutViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView info;
        @BindView
        public TextView title;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HmlAboutViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "item");
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
