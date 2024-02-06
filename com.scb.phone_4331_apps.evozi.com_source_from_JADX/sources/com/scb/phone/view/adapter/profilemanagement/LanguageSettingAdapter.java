package com.scb.phone.view.adapter.profilemanagement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.getBlackStreakMaxHeight;
import p040o.getLongtermDetails;
import p040o.onStart;
import p040o.setCustomAttributes;

public final class LanguageSettingAdapter extends RecyclerView.IconCompatParcelizer<LanguageSettingHolder> {
    public String MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$SearchResultReceiver = -1;
    public getBlackStreakMaxHeight.write read;
    public List<setCustomAttributes> write;

    public class LanguageSettingHolder_ViewBinding implements Unbinder {
        private LanguageSettingHolder IconCompatParcelizer;

        public LanguageSettingHolder_ViewBinding(LanguageSettingHolder languageSettingHolder, View view) {
            this.IconCompatParcelizer = languageSettingHolder;
            languageSettingHolder.itemContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_container, "field 'itemContainer'", LinearLayout.class);
            languageSettingHolder.radioButton = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_button, "field 'radioButton'", RadioButton.class);
            languageSettingHolder.languageTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.language_title, "field 'languageTitle'", TextView.class);
            languageSettingHolder.footerDividerView = onStart.IconCompatParcelizer(view, R.id.footer_divider_view, "field 'footerDividerView'");
            languageSettingHolder.dividerView = onStart.IconCompatParcelizer(view, R.id.divider_view, "field 'dividerView'");
        }

        public final void read() {
            LanguageSettingHolder languageSettingHolder = this.IconCompatParcelizer;
            if (languageSettingHolder != null) {
                this.IconCompatParcelizer = null;
                languageSettingHolder.itemContainer = null;
                languageSettingHolder.radioButton = null;
                languageSettingHolder.languageTitle = null;
                languageSettingHolder.footerDividerView = null;
                languageSettingHolder.dividerView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        LanguageSettingHolder languageSettingHolder = (LanguageSettingHolder) setcontentview;
        languageSettingHolder.radioButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (((str == null || str.length() == 0) || !this.MediaBrowserCompat$ItemReceiver.equals(this.write.get(i).read)) && this.MediaBrowserCompat$SearchResultReceiver != i) {
            languageSettingHolder.radioButton.setChecked(false);
        } else {
            languageSettingHolder.radioButton.setChecked(true);
        }
        languageSettingHolder.languageTitle.setText(this.write.get(i).MediaBrowserCompat$CustomActionResultReceiver);
        languageSettingHolder.itemContainer.setOnClickListener(new getLongtermDetails(this, i));
        if (this.write.size() - 1 == i) {
            languageSettingHolder.dividerView.setVisibility(8);
            languageSettingHolder.footerDividerView.setVisibility(0);
            return;
        }
        languageSettingHolder.dividerView.setVisibility(0);
        languageSettingHolder.footerDividerView.setVisibility(8);
    }

    public LanguageSettingAdapter(List<setCustomAttributes> list, String str, getBlackStreakMaxHeight.write write2) {
        this.write = list;
        this.read = write2;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    class LanguageSettingHolder extends RecyclerView.setContentView {
        @BindView
        View dividerView;
        @BindView
        View footerDividerView;
        @BindView
        LinearLayout itemContainer;
        @BindView
        TextView languageTitle;
        @BindView
        RadioButton radioButton;

        LanguageSettingHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new LanguageSettingHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84042131493630, viewGroup, false));
    }
}
