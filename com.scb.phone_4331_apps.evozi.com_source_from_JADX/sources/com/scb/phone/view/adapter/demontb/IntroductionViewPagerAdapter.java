package com.scb.phone.view.adapter.demontb;

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
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.AppConfigService;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.access$lambda$0;
import p040o.onActivityCreated;
import p040o.onStart;

public final class IntroductionViewPagerAdapter extends onActivityCreated {
    public C5740x4b7d12f8 IconCompatParcelizer;
    private LayoutInflater MediaBrowserCompat$CustomActionResultReceiver;
    private List<access$lambda$0> write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class IntroductionItemHolder_ViewBinding implements Unbinder {
        private IntroductionItemHolder IconCompatParcelizer;

        public IntroductionItemHolder_ViewBinding(IntroductionItemHolder introductionItemHolder, View view) {
            this.IconCompatParcelizer = introductionItemHolder;
            introductionItemHolder.image = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.introduction_image_view, "field 'image'", ImageView.class);
            introductionItemHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.introduction_title, "field 'title'", TextView.class);
            introductionItemHolder.subTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.introduction_sub_title, "field 'subTitle'", TextView.class);
        }

        public final void read() {
            IntroductionItemHolder introductionItemHolder = this.IconCompatParcelizer;
            if (introductionItemHolder != null) {
                this.IconCompatParcelizer = null;
                introductionItemHolder.image = null;
                introductionItemHolder.title = null;
                introductionItemHolder.subTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public IntroductionViewPagerAdapter(Context context, List<access$lambda$0> list, C5740x4b7d12f8 introductionViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.write = list;
        this.IconCompatParcelizer = introductionViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        IntroductionItemHolder introductionItemHolder = new IntroductionItemHolder(this.MediaBrowserCompat$CustomActionResultReceiver.inflate(R.layout.f82172131493443, (ViewGroup) null));
        access$lambda$0 access_lambda_0 = this.write.get(i);
        FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer2 = Picasso.read().write(access_lambda_0.IconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.introduction_placeholder).IconCompatParcelizer((int) R.drawable.introduction_placeholder);
        IconCompatParcelizer2.write = true;
        IconCompatParcelizer2.read(introductionItemHolder.image, (FragmentBuilder_BindEkycFragment) null);
        introductionItemHolder.title.setText(access_lambda_0.read);
        introductionItemHolder.subTitle.setText(access_lambda_0.MediaBrowserCompat$CustomActionResultReceiver);
        introductionItemHolder.write.setOnClickListener(new AppConfigService(this));
        viewGroup.addView(introductionItemHolder.write, 0);
        return introductionItemHolder.write;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final int getCount() {
        List<access$lambda$0> list = this.write;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    class IntroductionItemHolder extends RecyclerView.setContentView {
        @BindView
        ImageView image;
        @BindView
        TextView subTitle;
        @BindView
        TextView title;

        public IntroductionItemHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
