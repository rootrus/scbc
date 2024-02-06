package com.scb.phone.view.adapter.sme.gifting;

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
import p040o.CrashlyticsReport;
import p040o.getPurpose;
import p040o.onActivityCreated;
import p040o.onStart;

public final class GiftTutorialViewPagerAdapter extends onActivityCreated {
    private LayoutInflater IconCompatParcelizer;
    private List<CrashlyticsReport.CustomAttribute> MediaBrowserCompat$CustomActionResultReceiver;
    public write read;

    public interface write {
        void MediaBrowserCompat$ItemReceiver(View view);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class TutorialItemHolder_ViewBinding implements Unbinder {
        private TutorialItemHolder MediaBrowserCompat$CustomActionResultReceiver;

        public TutorialItemHolder_ViewBinding(TutorialItemHolder tutorialItemHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = tutorialItemHolder;
            tutorialItemHolder.image = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_tutorial_image_view, "field 'image'", ImageView.class);
            tutorialItemHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_tutorial_text_view_1, "field 'title'", TextView.class);
            tutorialItemHolder.subTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_tutorial_text_view_2, "field 'subTitle'", TextView.class);
        }

        public final void read() {
            TutorialItemHolder tutorialItemHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (tutorialItemHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                tutorialItemHolder.image = null;
                tutorialItemHolder.title = null;
                tutorialItemHolder.subTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public GiftTutorialViewPagerAdapter(Context context, List<CrashlyticsReport.CustomAttribute> list, write write2) {
        this.IconCompatParcelizer = (LayoutInflater) context.getSystemService("layout_inflater");
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.read = write2;
    }

    public final int getCount() {
        List<CrashlyticsReport.CustomAttribute> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        TutorialItemHolder tutorialItemHolder = new TutorialItemHolder(this.IconCompatParcelizer.inflate(R.layout.f81982131493424, (ViewGroup) null));
        CrashlyticsReport.CustomAttribute customAttribute = this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
        tutorialItemHolder.image.setImageResource(customAttribute.read);
        tutorialItemHolder.title.setText(customAttribute.MediaBrowserCompat$ItemReceiver);
        tutorialItemHolder.subTitle.setText(customAttribute.MediaBrowserCompat$CustomActionResultReceiver);
        tutorialItemHolder.write.setOnClickListener(new getPurpose(this));
        viewGroup.addView(tutorialItemHolder.write, 0);
        return tutorialItemHolder.write;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    class TutorialItemHolder extends RecyclerView.setContentView {
        @BindView
        ImageView image;
        @BindView
        TextView subTitle;
        @BindView
        TextView title;

        public TutorialItemHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
