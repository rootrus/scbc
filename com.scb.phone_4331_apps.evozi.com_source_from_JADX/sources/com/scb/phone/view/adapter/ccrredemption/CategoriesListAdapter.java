package com.scb.phone.view.adapter.ccrredemption;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$ItemReceiver;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.PersonalizeActivity;
import p040o.confirmResetPin;
import p040o.getOprDetails;
import p040o.onStart;
import p040o.readStringList;
import p040o.zaz;

public class CategoriesListAdapter extends RecyclerView.IconCompatParcelizer<CategoryViewHolder> {
    private int MediaBrowserCompat$ItemReceiver = 0;
    private zaz MediaBrowserCompat$SearchResultReceiver;
    public getOprDetails read;
    public List<PersonalizeActivity.IconCompatParcelizer> write;

    public class CategoryViewHolder_ViewBinding implements Unbinder {
        private CategoryViewHolder IconCompatParcelizer;

        public CategoryViewHolder_ViewBinding(CategoryViewHolder categoryViewHolder, View view) {
            this.IconCompatParcelizer = categoryViewHolder;
            categoryViewHolder.imvCategory = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_category, "field 'imvCategory'", ImageView.class);
            categoryViewHolder.txvCategoryName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_category_name, "field 'txvCategoryName'", TextView.class);
        }

        public final void read() {
            CategoryViewHolder categoryViewHolder = this.IconCompatParcelizer;
            if (categoryViewHolder != null) {
                this.IconCompatParcelizer = null;
                categoryViewHolder.imvCategory = null;
                categoryViewHolder.txvCategoryName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CategoryViewHolder categoryViewHolder = (CategoryViewHolder) setcontentview;
        PersonalizeActivity.IconCompatParcelizer iconCompatParcelizer = this.write.get(i);
        categoryViewHolder.txvCategoryName.setText(iconCompatParcelizer.read);
        String str = iconCompatParcelizer.IconCompatParcelizer;
        if (str != null) {
            ImageView imageView = categoryViewHolder.imvCategory;
            StringBuilder sb = new StringBuilder();
            sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
            sb.append(str);
            FragmentBuilder_BindDepositSelectorFragment.write(imageView, sb.toString());
        } else {
            categoryViewHolder.imvCategory.setImageResource(R.drawable.reward_img_placeholder);
        }
        categoryViewHolder.write.setOnClickListener(new confirmResetPin(this, iconCompatParcelizer));
    }

    public final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview) {
        Picasso picasso = this.MediaBrowserCompat$SearchResultReceiver.read;
        ImageView imageView = ((CategoryViewHolder) setcontentview).imvCategory;
        if (imageView != null) {
            picasso.write((Object) imageView);
            return true;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public final /* synthetic */ void write(RecyclerView.setContentView setcontentview) {
        CategoryViewHolder categoryViewHolder = (CategoryViewHolder) setcontentview;
        super.write(categoryViewHolder);
        categoryViewHolder.imvCategory.setImageDrawable((Drawable) null);
        Picasso picasso = this.MediaBrowserCompat$SearchResultReceiver.read;
        ImageView imageView = categoryViewHolder.imvCategory;
        if (imageView != null) {
            picasso.write((Object) imageView);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    @HmlPinActivity
    public CategoriesListAdapter(zaz zaz) {
        this.MediaBrowserCompat$SearchResultReceiver = zaz;
    }

    public final int IconCompatParcelizer() {
        List<PersonalizeActivity.IconCompatParcelizer> list = this.write;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.write.get(i).write == readStringList.ECOUPON ? 2 : 1;
    }

    class CategoryViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView imvCategory;
        @BindView
        TextView txvCategoryName;

        CategoryViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91192131494346, viewGroup, false);
        GridLayoutManager$MediaBrowserCompat$ItemReceiver gridLayoutManager$MediaBrowserCompat$ItemReceiver = (GridLayoutManager$MediaBrowserCompat$ItemReceiver) inflate.getLayoutParams();
        gridLayoutManager$MediaBrowserCompat$ItemReceiver.height = viewGroup.getMeasuredWidth() / 2;
        if (this.MediaBrowserCompat$ItemReceiver == 0) {
            this.MediaBrowserCompat$ItemReceiver = gridLayoutManager$MediaBrowserCompat$ItemReceiver.height;
        }
        inflate.setLayoutParams(gridLayoutManager$MediaBrowserCompat$ItemReceiver);
        return new CategoryViewHolder(inflate);
    }
}
