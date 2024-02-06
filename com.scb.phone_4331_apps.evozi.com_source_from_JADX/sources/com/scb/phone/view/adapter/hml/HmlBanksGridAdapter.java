package com.scb.phone.view.adapter.hml;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import p040o.CrashlyticsController;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class HmlBanksGridAdapter extends BaseAdapter {
    public List<CrashlyticsController.C322922> IconCompatParcelizer = new ArrayList();
    private final FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver;
    private final LayoutInflater write;

    public final class HmlBankViewHolder_ViewBinding implements Unbinder {
        private HmlBankViewHolder MediaBrowserCompat$ItemReceiver;

        public HmlBankViewHolder_ViewBinding(HmlBankViewHolder hmlBankViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = hmlBankViewHolder;
            hmlBankViewHolder.bankIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.img_bank_icon, "field 'bankIcon'", ImageView.class);
            hmlBankViewHolder.bankDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_bank_description, "field 'bankDescription'", TextView.class);
        }

        public final void read() {
            HmlBankViewHolder hmlBankViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (hmlBankViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                hmlBankViewHolder.bankIcon = null;
                hmlBankViewHolder.bankDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public HmlBanksGridAdapter(Context context, FundFactSheetActivity<? super Integer, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) fundFactSheetActivity, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
        this.write = LayoutInflater.from(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        HmlBankViewHolder hmlBankViewHolder;
        if (view == null) {
            view = this.write.inflate(R.layout.f90412131494268, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) view, "rowView");
            hmlBankViewHolder = new HmlBankViewHolder(view);
            view.setTag(hmlBankViewHolder);
        } else {
            Object tag = view.getTag();
            if (tag != null) {
                hmlBankViewHolder = (HmlBankViewHolder) tag;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.adapter.hml.HmlBanksGridAdapter.HmlBankViewHolder");
            }
        }
        CrashlyticsController.C322922 r9 = this.IconCompatParcelizer.get(i);
        FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) r9, "item");
        onGetStartedClick.write((Object) fundFactSheetActivity, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        TextView textView = hmlBankViewHolder.bankDescription;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bankDescription");
        }
        textView.setText(r9.IconCompatParcelizer);
        View view2 = hmlBankViewHolder.write;
        Context context = view2.getContext();
        if (context != null) {
            Drawable write2 = setLastBaselineToBottomHeight.write(context, R.drawable.bankicon_place_holder);
            ImageView imageView = hmlBankViewHolder.bankIcon;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("bankIcon");
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, write2, imageView, r9.MediaBrowserCompat$CustomActionResultReceiver, context.getResources().getDimensionPixelOffset(R.dimen.f72052131165282), setLastBaselineToBottomHeight.read(view2.getContext(), R.color.f66402131099796));
        }
        view2.setOnClickListener(new HmlBankViewHolder.write(r9, fundFactSheetActivity));
        return view;
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }

    public static final class HmlBankViewHolder {
        @BindView
        public TextView bankDescription;
        @BindView
        public ImageView bankIcon;
        final View write;

        public HmlBankViewHolder(View view) {
            onGetStartedClick.write((Object) view, "itemView");
            this.write = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class write implements View.OnClickListener {
            private /* synthetic */ CrashlyticsController.C322922 IconCompatParcelizer;
            private /* synthetic */ FundFactSheetActivity read;

            write(CrashlyticsController.C322922 r1, FundFactSheetActivity fundFactSheetActivity) {
                this.IconCompatParcelizer = r1;
                this.read = fundFactSheetActivity;
            }

            public final void onClick(View view) {
                this.read.invoke(Integer.valueOf(this.IconCompatParcelizer.read));
            }
        }
    }

    public final /* synthetic */ Object getItem(int i) {
        return this.IconCompatParcelizer.get(i);
    }

    public final long getItemId(int i) {
        return (long) this.IconCompatParcelizer.get(i).read;
    }
}
