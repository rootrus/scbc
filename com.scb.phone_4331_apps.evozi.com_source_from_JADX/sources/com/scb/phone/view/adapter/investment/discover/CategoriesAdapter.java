package com.scb.phone.view.adapter.investment.discover;

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
import p040o.CurrentTimeProvider;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getDeejungInstallmentsConfirmation;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class CategoriesAdapter extends RecyclerView.IconCompatParcelizer<CategoriesHolder> {

    public class CategoriesHolder_ViewBinding implements Unbinder {
        private CategoriesHolder IconCompatParcelizer;

        public CategoriesHolder_ViewBinding(CategoriesHolder categoriesHolder, View view) {
            this.IconCompatParcelizer = categoriesHolder;
            categoriesHolder.categoryIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.category_icon_image_view, "field 'categoryIcon'", ImageView.class);
            categoriesHolder.categoryDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.category_description_text_view, "field 'categoryDescription'", TextView.class);
        }

        public final void read() {
            CategoriesHolder categoriesHolder = this.IconCompatParcelizer;
            if (categoriesHolder != null) {
                this.IconCompatParcelizer = null;
                categoriesHolder.categoryIcon = null;
                categoriesHolder.categoryDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Context, java.util.List, o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment] */
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CategoriesHolder categoriesHolder = (CategoriesHolder) setcontentview;
        ? r0 = 0;
        CurrentTimeProvider currentTimeProvider = (CurrentTimeProvider) r0.get(i);
        FragmentBuilder_BindDepositSelectorFragment.write(setLastBaselineToBottomHeight.write(r0, R.drawable.shape_circle_lighter_gray_background), categoriesHolder.categoryIcon, currentTimeProvider.read);
        categoriesHolder.categoryDescription.setText(currentTimeProvider.MediaBrowserCompat$CustomActionResultReceiver);
        categoriesHolder.PlaybackStateCompat.setOnClickListener(new getDeejungInstallmentsConfirmation(r0, i));
    }

    public final int IconCompatParcelizer() {
        List list = null;
        return list.size();
    }

    public static class CategoriesHolder extends RecyclerView.setContentView {
        View PlaybackStateCompat;
        @BindView
        TextView categoryDescription;
        @BindView
        ImageView categoryIcon;

        CategoriesHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.PlaybackStateCompat = view;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new CategoriesHolder(LayoutInflater.from((Context) null).inflate(R.layout.f82852131493511, viewGroup, false));
    }
}
