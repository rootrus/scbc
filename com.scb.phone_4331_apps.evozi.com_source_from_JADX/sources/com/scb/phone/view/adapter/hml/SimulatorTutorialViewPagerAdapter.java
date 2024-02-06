package com.scb.phone.view.adapter.hml;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.zzct;

public final class SimulatorTutorialViewPagerAdapter extends onActivityCreated implements View.OnClickListener {
    private TypedArray IconCompatParcelizer;
    private LayoutInflater MediaBrowserCompat$CustomActionResultReceiver;
    public write read;

    public interface write {
        void onPageClick(View view);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class TutorialItemHolder_ViewBinding implements Unbinder {
        private TutorialItemHolder write;

        public TutorialItemHolder_ViewBinding(TutorialItemHolder tutorialItemHolder, View view) {
            this.write = tutorialItemHolder;
            tutorialItemHolder.mImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_simulator_tutorial_image_view, "field 'mImage'", ImageView.class);
        }

        public final void read() {
            TutorialItemHolder tutorialItemHolder = this.write;
            if (tutorialItemHolder != null) {
                this.write = null;
                tutorialItemHolder.mImage = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SimulatorTutorialViewPagerAdapter(Context context, zzct.zza zza) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        if (zza == zzct.zza.BUSINESS_OWNER) {
            this.IconCompatParcelizer = context.getResources().obtainTypedArray(R.array.f64712130903050);
        } else {
            this.IconCompatParcelizer = context.getResources().obtainTypedArray(R.array.f64742130903053);
        }
    }

    public final int getCount() {
        return this.IconCompatParcelizer.length();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        TutorialItemHolder tutorialItemHolder = new TutorialItemHolder(this.MediaBrowserCompat$CustomActionResultReceiver.inflate(R.layout.f82042131493430, (ViewGroup) null));
        tutorialItemHolder.mImage.setImageDrawable(this.IconCompatParcelizer.getDrawable(i));
        tutorialItemHolder.PlaybackStateCompat.setOnClickListener(this);
        viewGroup.addView(tutorialItemHolder.PlaybackStateCompat, 0);
        return tutorialItemHolder.PlaybackStateCompat;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    class TutorialItemHolder extends RecyclerView.setContentView {
        View PlaybackStateCompat;
        @BindView
        ImageView mImage;

        TutorialItemHolder(View view) {
            super(view);
            this.PlaybackStateCompat = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final void onClick(View view) {
        write write2 = this.read;
        if (write2 != null) {
            write2.onPageClick(view);
        }
    }
}
