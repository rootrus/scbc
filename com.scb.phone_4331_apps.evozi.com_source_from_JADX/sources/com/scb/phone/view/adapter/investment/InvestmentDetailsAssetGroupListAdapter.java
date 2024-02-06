package com.scb.phone.view.adapter.investment;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.markInitializationStarted;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class InvestmentDetailsAssetGroupListAdapter extends ArrayAdapter {
    private int IconCompatParcelizer = R.layout.f82242131493450;
    private LayoutInflater MediaBrowserCompat$ItemReceiver;
    private List<markInitializationStarted> write;

    public class AssetGroupView_ViewBinding implements Unbinder {
        private AssetGroupView IconCompatParcelizer;

        public AssetGroupView_ViewBinding(AssetGroupView assetGroupView, View view) {
            this.IconCompatParcelizer = assetGroupView;
            assetGroupView.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.asset_description_text_view, "field 'description'", TextView.class);
            assetGroupView.percent = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.asset_percent_text_view, "field 'percent'", TextView.class);
            assetGroupView.legendCircle = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.legend_circle, "field 'legendCircle'", ImageView.class);
        }

        public final void read() {
            AssetGroupView assetGroupView = this.IconCompatParcelizer;
            if (assetGroupView != null) {
                this.IconCompatParcelizer = null;
                assetGroupView.description = null;
                assetGroupView.percent = null;
                assetGroupView.legendCircle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public InvestmentDetailsAssetGroupListAdapter(Context context, List<markInitializationStarted> list) {
        super(context, R.layout.f82242131493450, list);
        this.MediaBrowserCompat$ItemReceiver = LayoutInflater.from(context);
        this.write = list;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        AssetGroupView assetGroupView;
        markInitializationStarted markinitializationstarted = this.write.get(i);
        if (view == null) {
            view = (LinearLayout) this.MediaBrowserCompat$ItemReceiver.inflate(this.IconCompatParcelizer, (ViewGroup) null);
            assetGroupView = new AssetGroupView(view, (byte) 0);
            view.setTag(assetGroupView);
        } else {
            assetGroupView = (AssetGroupView) view.getTag();
        }
        TextView textView = assetGroupView.description;
        if (markInitializationStarted.MediaBrowserCompat$ItemReceiver(markinitializationstarted.IconCompatParcelizer) != 0) {
            textView.setText(markInitializationStarted.MediaBrowserCompat$ItemReceiver(markinitializationstarted.IconCompatParcelizer));
        } else {
            textView.setText(markinitializationstarted.read);
        }
        assetGroupView.percent.setText(markinitializationstarted.MediaBrowserCompat$ItemReceiver);
        ((GradientDrawable) assetGroupView.legendCircle.getDrawable()).setColor(setLastBaselineToBottomHeight.read(getContext(), markInitializationStarted.write(markinitializationstarted.IconCompatParcelizer)));
        return view;
    }

    static class AssetGroupView {
        @BindView
        TextView description;
        /* access modifiers changed from: package-private */
        @BindView
        public ImageView legendCircle;
        /* access modifiers changed from: package-private */
        @BindView
        public TextView percent;

        /* synthetic */ AssetGroupView(View view, byte b) {
            this(view);
        }

        private AssetGroupView(View view) {
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
