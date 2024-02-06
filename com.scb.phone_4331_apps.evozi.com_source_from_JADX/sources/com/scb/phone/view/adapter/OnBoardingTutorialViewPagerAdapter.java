package com.scb.phone.view.adapter;

import android.content.Context;
import android.content.res.TypedArray;
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
import p040o.onActivityCreated;
import p040o.onStart;

public final class OnBoardingTutorialViewPagerAdapter extends onActivityCreated implements View.OnClickListener {
    private TypedArray IconCompatParcelizer;
    private TypedArray MediaBrowserCompat$CustomActionResultReceiver;
    private LayoutInflater MediaBrowserCompat$ItemReceiver;
    private TypedArray read;
    public C5723xe0078557 write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class TutorialItemHolder_ViewBinding implements Unbinder {
        private TutorialItemHolder MediaBrowserCompat$ItemReceiver;

        public TutorialItemHolder_ViewBinding(TutorialItemHolder tutorialItemHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = tutorialItemHolder;
            tutorialItemHolder.mImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.on_boarding_tutorial_image_view, "field 'mImage'", ImageView.class);
            tutorialItemHolder.mTitle1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.on_boarding_tutorial_text_view_1, "field 'mTitle1'", TextView.class);
            tutorialItemHolder.mTitle2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.on_boarding_tutorial_text_view_2, "field 'mTitle2'", TextView.class);
        }

        public final void read() {
            TutorialItemHolder tutorialItemHolder = this.MediaBrowserCompat$ItemReceiver;
            if (tutorialItemHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                tutorialItemHolder.mImage = null;
                tutorialItemHolder.mTitle1 = null;
                tutorialItemHolder.mTitle2 = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public OnBoardingTutorialViewPagerAdapter(Context context) {
        this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.read = context.getResources().obtainTypedArray(R.array.f64872130903067);
        this.IconCompatParcelizer = context.getResources().obtainTypedArray(R.array.f64882130903068);
        this.MediaBrowserCompat$CustomActionResultReceiver = context.getResources().obtainTypedArray(R.array.f64862130903066);
    }

    public final int getCount() {
        return this.read.length();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        TutorialItemHolder tutorialItemHolder = new TutorialItemHolder(this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f84282131493654, (ViewGroup) null));
        tutorialItemHolder.mImage.setImageDrawable(this.MediaBrowserCompat$CustomActionResultReceiver.getDrawable(i));
        tutorialItemHolder.mTitle1.setText(this.read.getString(i));
        tutorialItemHolder.mTitle2.setText(this.IconCompatParcelizer.getString(i));
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
        @BindView
        TextView mTitle1;
        @BindView
        TextView mTitle2;

        TutorialItemHolder(View view) {
            super(view);
            this.AlertController$RecycleListView = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final void onClick(View view) {
        C5723xe0078557 onBoardingTutorialViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        if (onBoardingTutorialViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver != null) {
            onBoardingTutorialViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.onPageClick(view);
        }
    }
}
