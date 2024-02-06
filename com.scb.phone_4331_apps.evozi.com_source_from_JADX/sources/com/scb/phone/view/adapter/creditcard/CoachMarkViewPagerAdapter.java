package com.scb.phone.view.adapter.creditcard;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.bumptech.glide.Glide;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindEasyCashFeaturesMCMCInformationFragment;
import p040o.Space;
import p040o.abandon;
import p040o.getViewModelStore;
import p040o.isReset;
import p040o.onActivityCreated;
import p040o.onCreateAnimation;
import p040o.onCreatePanelMenu;
import p040o.onPostResume;
import p040o.onStart;

public final class CoachMarkViewPagerAdapter extends onActivityCreated implements View.OnClickListener {
    private int[] IconCompatParcelizer;
    public read MediaBrowserCompat$CustomActionResultReceiver;
    private LayoutInflater write;

    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver(View view);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class TutorialItemHolder_ViewBinding implements Unbinder {
        private TutorialItemHolder MediaBrowserCompat$CustomActionResultReceiver;

        public TutorialItemHolder_ViewBinding(TutorialItemHolder tutorialItemHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = tutorialItemHolder;
            tutorialItemHolder.mImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.coach_mark_image_view, "field 'mImage'", ImageView.class);
        }

        public final void read() {
            TutorialItemHolder tutorialItemHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (tutorialItemHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                tutorialItemHolder.mImage = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CoachMarkViewPagerAdapter(Context context, int[] iArr) {
        this.write = (LayoutInflater) context.getSystemService("layout_inflater");
        this.IconCompatParcelizer = iArr;
    }

    public final int getCount() {
        return this.IconCompatParcelizer.length;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        TutorialItemHolder tutorialItemHolder = new TutorialItemHolder(this.write.inflate(R.layout.f81342131493360, (ViewGroup) null));
        Context context = tutorialItemHolder.mImage.getContext();
        ((getViewModelStore) ((getViewModelStore) Glide.MediaBrowserCompat$ItemReceiver(context).IconCompatParcelizer(context.getDrawable(this.IconCompatParcelizer[i])).IconCompatParcelizer((int) R.color.f66402131099796)).MediaBrowserCompat$ItemReceiver((abandon<?>) ((isReset) ((isReset) new isReset().MediaBrowserCompat$ItemReceiver(onCreatePanelMenu.IconCompatParcelizer, new onPostResume(), true)).MediaBrowserCompat$CustomActionResultReceiver()).read(Space.IconCompatParcelizer, Boolean.TRUE)).MediaBrowserCompat$CustomActionResultReceiver((onCreateAnimation<Bitmap>) new FragmentBuilder_BindEasyCashFeaturesMCMCInformationFragment(context.getResources().getDisplayMetrics().widthPixels), true)).MediaBrowserCompat$ItemReceiver(tutorialItemHolder.mImage);
        tutorialItemHolder.AlertController$RecycleListView.setOnClickListener(this);
        viewGroup.addView(tutorialItemHolder.AlertController$RecycleListView, 0);
        return tutorialItemHolder.AlertController$RecycleListView;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    class TutorialItemHolder extends RecyclerView.setContentView {
        View AlertController$RecycleListView;
        @BindView
        ImageView mImage;

        TutorialItemHolder(View view) {
            super(view);
            this.AlertController$RecycleListView = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final void onClick(View view) {
        read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (read2 != null) {
            read2.MediaBrowserCompat$CustomActionResultReceiver(view);
        }
    }
}
