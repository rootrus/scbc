package com.scb.phone.view.adapter.hml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.C5609x5fc43574;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p040o.BaseDiscoverFundFilterActivity;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.getCMContent;
import p040o.getTimestampSeconds;
import p040o.listFilesMatching;
import p040o.onCreateDialog;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class HmlBusinessInfoAdapter extends RecyclerView.IconCompatParcelizer<BankAccountViewHolder> {
    public List<getTimestampSeconds> MediaBrowserCompat$ItemReceiver = new ArrayList();
    /* access modifiers changed from: private */
    public final BaseDiscoverFundFilterActivity<C5609x5fc43574, getTimestampSeconds, HmlVerifyPhoneValidateOtpActivity> RatingCompat;
    public final int read;
    public int write = -1;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        BankAccountViewHolder bankAccountViewHolder;
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == listFilesMatching.PLACE_HOLDER.ordinal()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82022131493428, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…aceholder, parent, false)");
            bankAccountViewHolder = new BankAccountViewHolder(inflate, new C5756xc2774e87(this));
        } else {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82252131493451, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, "LayoutInflater.from(pare…k_account, parent, false)");
            bankAccountViewHolder = new BankAccountViewHolder(inflate2, new HmlBusinessInfoAdapter$MediaBrowserCompat$ItemReceiver(this));
        }
        return bankAccountViewHolder;
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        TextView textView;
        BankAccountViewHolder bankAccountViewHolder = (BankAccountViewHolder) setcontentview;
        onGetStartedClick.write((Object) bankAccountViewHolder, "holder");
        getTimestampSeconds gettimestampseconds = this.MediaBrowserCompat$ItemReceiver.get(i);
        onGetStartedClick.write((Object) gettimestampseconds, "item");
        int i2 = getCMContent.IconCompatParcelizer[gettimestampseconds.MediaDescriptionCompat.ordinal()];
        if (i2 == 1) {
            TextView textView2 = bankAccountViewHolder.accountTitle;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountTitle");
            }
            textView2.setText(gettimestampseconds.MediaBrowserCompat$ItemReceiver);
            FragmentBuilder_BindFundDetailSummaryFragment write2 = Picasso.read().write(gettimestampseconds.write);
            ImageView imageView = bankAccountViewHolder.accountIcon;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountIcon");
            }
            write2.read(imageView, (FragmentBuilder_BindEkycFragment) null);
        } else if (i2 == 2 && (textView = (TextView) bankAccountViewHolder.write.findViewById(R.id.tv_operating_selector)) != null) {
            textView.setBackgroundResource(gettimestampseconds.MediaBrowserCompat$MediaItem ? R.drawable.shape_red_reounded_reactangle_border : R.drawable.shape_gray_rounded_rectangle);
        }
    }

    public final class BankAccountViewHolder_ViewBinding implements Unbinder {
        private BankAccountViewHolder MediaBrowserCompat$CustomActionResultReceiver;
        private View MediaBrowserCompat$ItemReceiver;

        public BankAccountViewHolder_ViewBinding(final BankAccountViewHolder bankAccountViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankAccountViewHolder;
            bankAccountViewHolder.accountIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_account_icon, "field 'accountIcon'", ImageView.class);
            bankAccountViewHolder.accountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_title, "field 'accountTitle'", TextView.class);
            View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.iv_edit, "method 'onItemClick'");
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
            IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    BankAccountViewHolder.this.onItemClick();
                }
            });
        }

        public final void read() {
            BankAccountViewHolder bankAccountViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (bankAccountViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                bankAccountViewHolder.accountIcon = null;
                bankAccountViewHolder.accountTitle = null;
                this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
                this.MediaBrowserCompat$ItemReceiver = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public HmlBusinessInfoAdapter(int i, BaseDiscoverFundFilterActivity<? super C5609x5fc43574, ? super getTimestampSeconds, HmlVerifyPhoneValidateOtpActivity> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "onUserClicked");
        this.read = i;
        this.RatingCompat = baseDiscoverFundFilterActivity;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.MediaBrowserCompat$ItemReceiver.get(i).MediaDescriptionCompat.ordinal();
    }

    public static final class BankAccountViewHolder extends RecyclerView.setContentView {
        private final FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> Keep;
        @BindView
        public ImageView accountIcon;
        @BindView
        public TextView accountTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BankAccountViewHolder(View view, FundFactSheetActivity<? super Integer, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            onGetStartedClick.write((Object) fundFactSheetActivity, "onItemClicked");
            this.Keep = fundFactSheetActivity;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        @OnClick
        public final void onItemClick() {
            int i;
            FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity = this.Keep;
            RecyclerView recyclerView = this.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) this);
            }
            fundFactSheetActivity.invoke(Integer.valueOf(i));
        }
    }

    public static final class write<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable comparable = ((getTimestampSeconds) t).MediaDescriptionCompat;
            Comparable comparable2 = ((getTimestampSeconds) t2).MediaDescriptionCompat;
            if (comparable == comparable2) {
                return 0;
            }
            if (comparable == null) {
                return -1;
            }
            if (comparable2 == null) {
                return 1;
            }
            return comparable.compareTo(comparable2);
        }
    }
}
