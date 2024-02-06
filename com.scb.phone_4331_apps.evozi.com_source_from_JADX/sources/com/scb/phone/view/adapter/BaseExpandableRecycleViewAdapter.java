package com.scb.phone.view.adapter;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.onStart;
import p040o.validateL3;
import p040o.validateSPMV;

public abstract class BaseExpandableRecycleViewAdapter extends validateL3 {
    public Context write;

    public final long IconCompatParcelizer(int i) {
        return (long) i;
    }

    public int read(int i) {
        return 1;
    }

    public final long write(int i) {
        return (long) i;
    }

    public class BaseParentViewHolder_ViewBinding implements Unbinder {
        private BaseParentViewHolder MediaBrowserCompat$ItemReceiver;

        public BaseParentViewHolder_ViewBinding(BaseParentViewHolder baseParentViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = baseParentViewHolder;
            baseParentViewHolder.expandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIcon'", ImageView.class);
            baseParentViewHolder.expandedDiamond = (ImageView) onStart.IconCompatParcelizer(view, R.id.expanded_diamond_image_view, "field 'expandedDiamond'", ImageView.class);
            baseParentViewHolder.expandedLine = view.findViewById(R.id.expanded_line_view);
        }

        public void read() {
            BaseParentViewHolder baseParentViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (baseParentViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                baseParentViewHolder.expandIcon = null;
                baseParentViewHolder.expandedDiamond = null;
                baseParentViewHolder.expandedLine = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public BaseExpandableRecycleViewAdapter(Context context) {
        this.write = context;
        MediaBrowserCompat$ItemReceiver(true);
    }

    /* renamed from: a_ */
    public boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return setcontentview instanceof BaseParentViewHolder;
    }

    public static class BaseParentViewHolder extends validateSPMV {
        @BindView
        public ImageView expandIcon;
        @BindView
        public ImageView expandedDiamond;
        @BindView
        public View expandedLine;

        public BaseParentViewHolder(View view) {
            super(view);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(BaseParentViewHolder baseParentViewHolder) {
        int i = baseParentViewHolder.AlertController$RecycleListView.write;
        if ((Integer.MIN_VALUE & i) != 0) {
            boolean z = true;
            int i2 = 0;
            boolean z2 = (i & 8) != 0;
            if ((i & 4) == 0) {
                z = false;
            }
            if (z2) {
                FragmentBuilder_BindDeejungPlansFragment.read(baseParentViewHolder.expandIcon);
                if (z) {
                    if (baseParentViewHolder.expandedDiamond != null) {
                        baseParentViewHolder.expandedDiamond.setVisibility(0);
                    }
                    if (baseParentViewHolder.expandedLine != null) {
                        baseParentViewHolder.expandedLine.setVisibility(0);
                        return;
                    }
                    return;
                }
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
                alphaAnimation.setDuration(500);
                if (baseParentViewHolder.expandedDiamond != null) {
                    baseParentViewHolder.expandedDiamond.startAnimation(alphaAnimation);
                    baseParentViewHolder.expandedDiamond.setVisibility(8);
                }
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
                alphaAnimation2.setDuration(500);
                if (baseParentViewHolder.expandedLine != null) {
                    baseParentViewHolder.expandedLine.startAnimation(alphaAnimation2);
                    baseParentViewHolder.expandedLine.setVisibility(8);
                    return;
                }
                return;
            }
            baseParentViewHolder.expandIcon.setImageResource(z ? R.drawable.ic_expand_less_black_24dp : R.drawable.ic_expand_more_black_24dp);
            if (baseParentViewHolder.expandedDiamond != null) {
                baseParentViewHolder.expandedDiamond.setVisibility(z ? 0 : 8);
            }
            if (baseParentViewHolder.expandedLine != null) {
                View view = baseParentViewHolder.expandedLine;
                if (!z) {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }
}
