package com.scb.phone.view.adapter.etb;

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
import p040o.onStart;

public final class ETBDescriptionAdapter extends RecyclerView.IconCompatParcelizer<DescriptionHolder> {
    private List<String> read;

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ((DescriptionHolder) setcontentview).etbDescriptionText.setText(this.read.get(i));
    }

    public class DescriptionHolder_ViewBinding implements Unbinder {
        private DescriptionHolder MediaBrowserCompat$ItemReceiver;

        public DescriptionHolder_ViewBinding(DescriptionHolder descriptionHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = descriptionHolder;
            descriptionHolder.etbDescriptionText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etb_description_text, "field 'etbDescriptionText'", TextView.class);
        }

        public final void read() {
            DescriptionHolder descriptionHolder = this.MediaBrowserCompat$ItemReceiver;
            if (descriptionHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                descriptionHolder.etbDescriptionText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ETBDescriptionAdapter(List<String> list) {
        this.read = list;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    class DescriptionHolder extends RecyclerView.setContentView {
        @BindView
        TextView etbDescriptionText;

        public DescriptionHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DescriptionHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81892131493415, viewGroup, false));
    }
}
