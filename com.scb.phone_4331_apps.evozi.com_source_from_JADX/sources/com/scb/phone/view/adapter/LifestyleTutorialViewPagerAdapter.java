package com.scb.phone.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.onActivityCreated;
import p040o.onStart;

public final class LifestyleTutorialViewPagerAdapter extends onActivityCreated implements View.OnClickListener {
    private List<Integer> IconCompatParcelizer;
    private LayoutInflater MediaBrowserCompat$CustomActionResultReceiver;
    private List<String> MediaBrowserCompat$ItemReceiver;
    private List<String> read;
    public C1111xc07df820 write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class TutorialItemHolder_ViewBinding implements Unbinder {
        private TutorialItemHolder IconCompatParcelizer;

        public TutorialItemHolder_ViewBinding(TutorialItemHolder tutorialItemHolder, View view) {
            this.IconCompatParcelizer = tutorialItemHolder;
            tutorialItemHolder.mImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lifestyle_tutorial_image_view, "field 'mImage'", ImageView.class);
            tutorialItemHolder.mTitle1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lifestyle_tutorial_text_view_1, "field 'mTitle1'", TextView.class);
            tutorialItemHolder.mTitle2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lifestyle_tutorial_text_view_2, "field 'mTitle2'", TextView.class);
        }

        public final void read() {
            TutorialItemHolder tutorialItemHolder = this.IconCompatParcelizer;
            if (tutorialItemHolder != null) {
                this.IconCompatParcelizer = null;
                tutorialItemHolder.mImage = null;
                tutorialItemHolder.mTitle1 = null;
                tutorialItemHolder.mTitle2 = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public LifestyleTutorialViewPagerAdapter(Context context, List<Integer> list, List<String> list2, List<String> list3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.read = list3;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        TutorialItemHolder tutorialItemHolder = new TutorialItemHolder(this.MediaBrowserCompat$CustomActionResultReceiver.inflate(R.layout.f84062131493632, (ViewGroup) null));
        tutorialItemHolder.mImage.setImageResource(this.IconCompatParcelizer.get(i).intValue());
        tutorialItemHolder.mTitle1.setText(this.MediaBrowserCompat$ItemReceiver.get(i));
        tutorialItemHolder.mTitle2.setText(this.read.get(i));
        tutorialItemHolder.Keep.setOnClickListener(this);
        viewGroup.addView(tutorialItemHolder.Keep, 0);
        return tutorialItemHolder.Keep;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    class TutorialItemHolder extends RecyclerView.setContentView {
        View Keep;
        @BindView
        ImageView mImage;
        @BindView
        TextView mTitle1;
        @BindView
        TextView mTitle2;

        TutorialItemHolder(View view) {
            super(view);
            this.Keep = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final void onClick(View view) {
        C1111xc07df820 lifestyleTutorialViewPagerAdapter$MediaBrowserCompat$ItemReceiver = this.write;
        if (lifestyleTutorialViewPagerAdapter$MediaBrowserCompat$ItemReceiver != null) {
            lifestyleTutorialViewPagerAdapter$MediaBrowserCompat$ItemReceiver.onPageClick(view);
        }
    }
}
