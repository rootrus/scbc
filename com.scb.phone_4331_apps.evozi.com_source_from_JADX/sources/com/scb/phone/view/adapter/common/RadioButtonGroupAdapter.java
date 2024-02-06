package com.scb.phone.view.adapter.common;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.RestrictedComponentContainer;
import p040o.onStart;

public final class RadioButtonGroupAdapter extends RecyclerView.IconCompatParcelizer<RadioButtonViewGroup> {
    /* access modifiers changed from: private */
    public List<RestrictedComponentContainer.RestrictedPublisher> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public Integer read;
    /* access modifiers changed from: private */
    public IconCompatParcelizer write;

    public interface IconCompatParcelizer {
        void write(int i);
    }

    public class RadioButtonViewGroup_ViewBinding implements Unbinder {
        private RadioButtonViewGroup MediaBrowserCompat$ItemReceiver;

        public RadioButtonViewGroup_ViewBinding(RadioButtonViewGroup radioButtonViewGroup, View view) {
            this.MediaBrowserCompat$ItemReceiver = radioButtonViewGroup;
            radioButtonViewGroup.holder = onStart.IconCompatParcelizer(view, R.id.container, "field 'holder'");
            radioButtonViewGroup.rbOption = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rb_option, "field 'rbOption'", RadioButton.class);
            radioButtonViewGroup.textLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label, "field 'textLabel'", TextView.class);
            radioButtonViewGroup.textHighlightLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_highlight_label, "field 'textHighlightLabel'", TextView.class);
            radioButtonViewGroup.textDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_description, "field 'textDescription'", TextView.class);
            radioButtonViewGroup.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
        }

        public final void read() {
            RadioButtonViewGroup radioButtonViewGroup = this.MediaBrowserCompat$ItemReceiver;
            if (radioButtonViewGroup != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                radioButtonViewGroup.holder = null;
                radioButtonViewGroup.rbOption = null;
                radioButtonViewGroup.textLabel = null;
                radioButtonViewGroup.textHighlightLabel = null;
                radioButtonViewGroup.textDescription = null;
                radioButtonViewGroup.divider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2;
        RadioButtonViewGroup radioButtonViewGroup = (RadioButtonViewGroup) setcontentview;
        int i3 = 0;
        radioButtonViewGroup.rbOption.setOnClickListener(new read(this, i, (byte) 0));
        boolean z = true;
        if (this.read != null) {
            this.MediaBrowserCompat$ItemReceiver.get(i).MediaBrowserCompat$ItemReceiver = this.read.intValue() == i;
        }
        RestrictedComponentContainer.RestrictedPublisher restrictedPublisher = this.MediaBrowserCompat$ItemReceiver.get(i);
        radioButtonViewGroup.rbOption.setChecked(restrictedPublisher.MediaBrowserCompat$ItemReceiver);
        radioButtonViewGroup.textLabel.setText(restrictedPublisher.read);
        radioButtonViewGroup.textHighlightLabel.setText(restrictedPublisher.IconCompatParcelizer);
        TextView textView = radioButtonViewGroup.textHighlightLabel;
        String str = restrictedPublisher.IconCompatParcelizer;
        textView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        radioButtonViewGroup.textDescription.setText(restrictedPublisher.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView2 = radioButtonViewGroup.textDescription;
        String str2 = restrictedPublisher.MediaBrowserCompat$CustomActionResultReceiver;
        textView2.setVisibility(str2 == null || str2.length() == 0 ? 8 : 0);
        radioButtonViewGroup.holder.setOnClickListener(new read(this, i, (byte) 0));
        View view = radioButtonViewGroup.divider;
        List<RestrictedComponentContainer.RestrictedPublisher> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        if (i != i2 - 1) {
            z = false;
        }
        if (z) {
            i3 = 8;
        }
        view.setVisibility(i3);
    }

    public RadioButtonGroupAdapter(List<RestrictedComponentContainer.RestrictedPublisher> list, IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = iconCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        List<RestrictedComponentContainer.RestrictedPublisher> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void write(int i) {
        this.read = Integer.valueOf(i);
        this.IconCompatParcelizer.write();
        IconCompatParcelizer iconCompatParcelizer = this.write;
        if (iconCompatParcelizer != null) {
            this.MediaBrowserCompat$ItemReceiver.get(this.read.intValue());
            iconCompatParcelizer.write(this.read.intValue());
        }
    }

    static class RadioButtonViewGroup extends RecyclerView.setContentView {
        @BindView
        View divider;
        @BindView
        View holder;
        @BindView
        RadioButton rbOption;
        @BindView
        TextView textDescription;
        @BindView
        TextView textHighlightLabel;
        @BindView
        TextView textLabel;

        /* synthetic */ RadioButtonViewGroup(View view, byte b) {
            this(view);
        }

        private RadioButtonViewGroup(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    class read implements View.OnClickListener {
        private int read;

        /* synthetic */ read(RadioButtonGroupAdapter radioButtonGroupAdapter, int i, byte b) {
            this(i);
        }

        private read(int i) {
            this.read = i;
        }

        public final void onClick(View view) {
            if (RadioButtonGroupAdapter.this.write != null) {
                Integer unused = RadioButtonGroupAdapter.this.read = Integer.valueOf(this.read);
                IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = RadioButtonGroupAdapter.this.write;
                RadioButtonGroupAdapter.this.MediaBrowserCompat$ItemReceiver.get(this.read);
                MediaBrowserCompat$CustomActionResultReceiver.write(this.read);
                RadioButtonGroupAdapter.this.IconCompatParcelizer.write();
            }
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new RadioButtonViewGroup(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84582131493684, viewGroup, false), (byte) 0);
    }
}
