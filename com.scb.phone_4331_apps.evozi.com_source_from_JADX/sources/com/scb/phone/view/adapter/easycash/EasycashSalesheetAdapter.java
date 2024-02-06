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
import p040o.getDealReview;
import p040o.onStart;
import p040o.submit;

public final class EasycashSalesheetAdapter extends RecyclerView.IconCompatParcelizer<EasycashSalesheetViewHolder> {
    public final List<submit> read;
    public final IconCompatParcelizer write;

    public interface IconCompatParcelizer {
        void read(submit submit);
    }

    public class EasycashSalesheetViewHolder_ViewBinding implements Unbinder {
        private EasycashSalesheetViewHolder IconCompatParcelizer;

        public EasycashSalesheetViewHolder_ViewBinding(EasycashSalesheetViewHolder easycashSalesheetViewHolder, View view) {
            this.IconCompatParcelizer = easycashSalesheetViewHolder;
            easycashSalesheetViewHolder.salesheetName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.salesheet_item_text, "field 'salesheetName'", TextView.class);
            easycashSalesheetViewHolder.salesheetLine = onStart.IconCompatParcelizer(view, R.id.salesheet_item_line, "field 'salesheetLine'");
        }

        public final void read() {
            EasycashSalesheetViewHolder easycashSalesheetViewHolder = this.IconCompatParcelizer;
            if (easycashSalesheetViewHolder != null) {
                this.IconCompatParcelizer = null;
                easycashSalesheetViewHolder.salesheetName = null;
                easycashSalesheetViewHolder.salesheetLine = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        EasycashSalesheetViewHolder easycashSalesheetViewHolder = (EasycashSalesheetViewHolder) setcontentview;
        submit submit = this.read.get(i);
        boolean z = true;
        if (i != this.read.size() - 1) {
            z = false;
        }
        easycashSalesheetViewHolder.salesheetName.setText(submit.IconCompatParcelizer);
        if (z) {
            easycashSalesheetViewHolder.salesheetLine.setVisibility(8);
        }
        easycashSalesheetViewHolder.write.setOnClickListener(new getDealReview(this, i));
    }

    public EasycashSalesheetAdapter(List<submit> list, IconCompatParcelizer iconCompatParcelizer) {
        this.read = list;
        this.write = iconCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        List<submit> list = this.read;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class EasycashSalesheetViewHolder extends RecyclerView.setContentView {
        @BindView
        View salesheetLine;
        @BindView
        TextView salesheetName;

        EasycashSalesheetViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new EasycashSalesheetViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82672131493493, viewGroup, false));
    }
}
