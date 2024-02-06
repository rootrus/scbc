package com.scb.phone.view.adapter.investment.assessment;

import android.content.Context;
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
import p039io.github.inflationx.calligraphy3.CalligraphyUtils;
import p040o.FragmentBuilder_BindCategoriesListFragment;
import p040o.getCardDetails;
import p040o.getCardImageUrl;
import p040o.onStart;
import p040o.populateExceptionData;
import p040o.setLastBaselineToBottomHeight;

public final class RiskLevelsAdapter extends RecyclerView.IconCompatParcelizer<RiskLevelHolder> {
    public int MediaBrowserCompat$ItemReceiver = -1;
    private FragmentBuilder_BindCategoriesListFragment<Integer> MediaDescriptionCompat = new getCardImageUrl(this);
    private Context MediaMetadataCompat;
    public List<populateExceptionData> read;
    public FragmentBuilder_BindCategoriesListFragment<String> write;

    public class RiskLevelHolder_ViewBinding implements Unbinder {
        private RiskLevelHolder write;

        public RiskLevelHolder_ViewBinding(RiskLevelHolder riskLevelHolder, View view) {
            this.write = riskLevelHolder;
            riskLevelHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'title'", TextView.class);
            riskLevelHolder.button = onStart.IconCompatParcelizer(view, R.id.button_layout, "field 'button'");
        }

        public final void read() {
            RiskLevelHolder riskLevelHolder = this.write;
            if (riskLevelHolder != null) {
                this.write = null;
                riskLevelHolder.title = null;
                riskLevelHolder.button = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        RiskLevelHolder riskLevelHolder = (RiskLevelHolder) setcontentview;
        Context context = this.MediaMetadataCompat;
        populateExceptionData populateexceptiondata = this.read.get(i);
        boolean z = i == this.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindCategoriesListFragment<Integer> fragmentBuilder_BindCategoriesListFragment = this.MediaDescriptionCompat;
        riskLevelHolder.title.setText(populateexceptiondata.read);
        riskLevelHolder.button.setBackgroundResource(z ? R.drawable.shape_purple_border_rounded_rectangle : R.drawable.shape_gray_rounded_rectangle);
        riskLevelHolder.PlaybackStateCompat.setOnClickListener(new getCardDetails(fragmentBuilder_BindCategoriesListFragment, i));
        riskLevelHolder.title.setTextColor(setLastBaselineToBottomHeight.read(context, z ? R.color.f67252131099881 : R.color.f66092131099764));
        CalligraphyUtils.applyFontToTextView(context, riskLevelHolder.title, z ? "fonts/db_heavent_medium.ttf" : "fonts/db_heavent_regular.ttf");
    }

    public RiskLevelsAdapter(Context context, List<populateExceptionData> list, FragmentBuilder_BindCategoriesListFragment<String> fragmentBuilder_BindCategoriesListFragment) {
        this.MediaMetadataCompat = context;
        this.read = list;
        this.write = fragmentBuilder_BindCategoriesListFragment;
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        return (long) this.read.get(i).MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }

    public static class RiskLevelHolder extends RecyclerView.setContentView {
        View PlaybackStateCompat;
        @BindView
        View button;
        @BindView
        TextView title;

        RiskLevelHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.PlaybackStateCompat = view;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new RiskLevelHolder(LayoutInflater.from(this.MediaMetadataCompat).inflate(R.layout.f83702131493596, viewGroup, false));
    }
}
