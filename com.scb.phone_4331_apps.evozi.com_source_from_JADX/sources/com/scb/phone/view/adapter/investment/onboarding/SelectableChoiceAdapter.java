package com.scb.phone.view.adapter.investment.onboarding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.getStatementCurrentChannel;
import p040o.onStart;

public class SelectableChoiceAdapter extends RecyclerView.IconCompatParcelizer<ChoiceHolder> {
    public final List<String> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver;
    private SelectableChoiceAdapter$MediaBrowserCompat$ItemReceiver RatingCompat = new SelectableChoiceAdapter$MediaBrowserCompat$ItemReceiver() {
        public final void MediaBrowserCompat$CustomActionResultReceiver(ChoiceHolder choiceHolder, String str) {
            int i;
            if (SelectableChoiceAdapter.this.read != null) {
                SelectableChoiceAdapter.this.read.write.setSelected(false);
            }
            ChoiceHolder unused = SelectableChoiceAdapter.this.read = choiceHolder;
            SelectableChoiceAdapter.this.read.write.setSelected(true);
            IconCompatParcelizer write2 = SelectableChoiceAdapter.this.MediaBrowserCompat$SearchResultReceiver;
            RecyclerView recyclerView = choiceHolder.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) choiceHolder);
            }
            write2.IconCompatParcelizer(str, i);
        }
    };
    public ChoiceHolder read = null;
    public int write = -1;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(String str, int i);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2;
        ChoiceHolder choiceHolder = (ChoiceHolder) setcontentview;
        String str = this.MediaBrowserCompat$ItemReceiver.get(i);
        choiceHolder.PlaybackStateCompat = str;
        choiceHolder.text1.setText(str);
        if (i == this.write) {
            ChoiceHolder choiceHolder2 = this.read;
            if (choiceHolder2 != null) {
                choiceHolder2.write.setSelected(false);
            }
            choiceHolder.write.setSelected(false);
            this.read = choiceHolder;
            choiceHolder.write.setSelected(true);
            IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$SearchResultReceiver;
            String str2 = choiceHolder.PlaybackStateCompat;
            RecyclerView recyclerView = choiceHolder.MediaMetadataCompat;
            if (recyclerView == null) {
                i2 = -1;
            } else {
                i2 = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) choiceHolder);
            }
            iconCompatParcelizer.IconCompatParcelizer(str2, i2);
            this.write = -1;
        }
    }

    public class ChoiceHolder_ViewBinding implements Unbinder {
        private ChoiceHolder write;

        public ChoiceHolder_ViewBinding(ChoiceHolder choiceHolder, View view) {
            this.write = choiceHolder;
            choiceHolder.text1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text1, "field 'text1'", TextView.class);
        }

        public final void read() {
            ChoiceHolder choiceHolder = this.write;
            if (choiceHolder != null) {
                this.write = null;
                choiceHolder.text1 = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SelectableChoiceAdapter(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = new ArrayList();
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public static class ChoiceHolder extends RecyclerView.setContentView {
        public String PlaybackStateCompat;
        @BindView
        TextView text1;

        ChoiceHolder(ViewGroup viewGroup, SelectableChoiceAdapter$MediaBrowserCompat$ItemReceiver selectableChoiceAdapter$MediaBrowserCompat$ItemReceiver) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90462131494273, viewGroup, false));
            ButterKnife.IconCompatParcelizer(this, this.write);
            this.write.setOnClickListener(new getStatementCurrentChannel(this, selectableChoiceAdapter$MediaBrowserCompat$ItemReceiver));
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ChoiceHolder(viewGroup, this.RatingCompat);
    }
}
