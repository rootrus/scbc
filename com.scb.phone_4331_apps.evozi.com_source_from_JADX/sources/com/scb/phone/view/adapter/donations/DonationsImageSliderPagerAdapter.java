package com.scb.phone.view.adapter.donations;

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
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindCardActivationFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getBillPaymentEDonationConfirmation;
import p040o.getBinaryImagesFile;
import p040o.onActivityCreated;
import p040o.onGetLayoutInflater;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class DonationsImageSliderPagerAdapter extends onActivityCreated {
    private String IconCompatParcelizer = onGetLayoutInflater.IconCompatParcelizer();
    public List<getBinaryImagesFile> MediaBrowserCompat$CustomActionResultReceiver;
    private Context MediaBrowserCompat$ItemReceiver;
    public FragmentBuilder_BindCardActivationFragment read;
    private LayoutInflater write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder write;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.write = itemViewHolder;
            itemViewHolder.imageDonation = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_donation, "field 'imageDonation'", ImageView.class);
            itemViewHolder.foundationNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.foundation_name, "field 'foundationNameTextView'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.write;
            if (itemViewHolder != null) {
                this.write = null;
                itemViewHolder.imageDonation = null;
                itemViewHolder.foundationNameTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DonationsImageSliderPagerAdapter(Context context, List<getBinaryImagesFile> list, FragmentBuilder_BindCardActivationFragment fragmentBuilder_BindCardActivationFragment) {
        this.write = (LayoutInflater) context.getSystemService("layout_inflater");
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = fragmentBuilder_BindCardActivationFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = list == null ? new ArrayList<>() : list;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        ItemViewHolder itemViewHolder = new ItemViewHolder(this.write.inflate(R.layout.f81712131493397, (ViewGroup) null));
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$ItemReceiver, R.drawable.donations_place_holder), itemViewHolder.imageDonation, this.MediaBrowserCompat$CustomActionResultReceiver.get(i).write);
        if (this.IconCompatParcelizer.equals("th")) {
            itemViewHolder.foundationNameTextView.setText(this.MediaBrowserCompat$CustomActionResultReceiver.get(i).MediaMetadataCompat.write);
        } else {
            itemViewHolder.foundationNameTextView.setText(this.MediaBrowserCompat$CustomActionResultReceiver.get(i).MediaMetadataCompat.read);
        }
        View view = itemViewHolder.PlaybackStateCompat;
        view.setOnClickListener(new getBillPaymentEDonationConfirmation(this, i));
        viewGroup.addView(view, 0);
        return view;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        View PlaybackStateCompat;
        @BindView
        TextView foundationNameTextView;
        @BindView
        ImageView imageDonation;

        ItemViewHolder(View view) {
            super(view);
            this.PlaybackStateCompat = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
