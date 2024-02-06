package com.scb.phone.view.adapter.easycash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomCheckBox;
import java.util.List;
import p040o.getBillScan;
import p040o.onStart;
import p040o.performUpdateApp;

public final class CustomCheckboxAdapter extends RecyclerView.IconCompatParcelizer<CheckBoxViewHolder> {
    public List<performUpdateApp> MediaBrowserCompat$ItemReceiver;
    private write write;

    @FunctionalInterface
    public interface write {
        void MediaSessionCompat$Token();
    }

    public class CheckBoxViewHolder_ViewBinding implements Unbinder {
        private CheckBoxViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public CheckBoxViewHolder_ViewBinding(CheckBoxViewHolder checkBoxViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = checkBoxViewHolder;
            checkBoxViewHolder.customCheckbox = (CustomCheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_check_box, "field 'customCheckbox'", CustomCheckBox.class);
        }

        public final void read() {
            CheckBoxViewHolder checkBoxViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (checkBoxViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                checkBoxViewHolder.customCheckbox = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CheckBoxViewHolder checkBoxViewHolder = (CheckBoxViewHolder) setcontentview;
        performUpdateApp performupdateapp = this.MediaBrowserCompat$ItemReceiver.get(i);
        write write2 = this.write;
        if (performupdateapp == null) {
            checkBoxViewHolder.customCheckbox.setVisibility(4);
            return;
        }
        checkBoxViewHolder.customCheckbox.setVisibility(0);
        checkBoxViewHolder.customCheckbox.setText(performupdateapp.MediaSessionCompat$QueueItem);
        checkBoxViewHolder.customCheckbox.setOnClickListener(new getBillScan(performupdateapp, write2));
        checkBoxViewHolder.customCheckbox.setSelectedState(performupdateapp.MediaDescriptionCompat.booleanValue());
        checkBoxViewHolder.customCheckbox.setEnableState(performupdateapp.MediaDescriptionCompat.booleanValue(), performupdateapp.f2919x50fd9e4a.booleanValue());
    }

    public CustomCheckboxAdapter(List<performUpdateApp> list, write write2) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = write2;
    }

    public final int IconCompatParcelizer() {
        List<performUpdateApp> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class CheckBoxViewHolder extends RecyclerView.setContentView {
        @BindView
        CustomCheckBox customCheckbox;

        CheckBoxViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(performUpdateApp performupdateapp, write write) {
            performupdateapp.MediaDescriptionCompat = Boolean.valueOf(!performupdateapp.MediaDescriptionCompat.booleanValue());
            write.MediaSessionCompat$Token();
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new CheckBoxViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82392131493465, viewGroup, false));
    }
}
