package com.scb.phone.view.adapter.registration;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.List;
import p040o.FundFactSheetActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setCausedBy;

public final class RegistrationCountrySearchAdapter extends RecyclerView.IconCompatParcelizer<CountryItemViewHolder> {
    public List<setCausedBy> MediaBrowserCompat$ItemReceiver = HmlNationalIdActivity.IconCompatParcelizer;
    private final FundFactSheetActivity<setCausedBy, HmlVerifyPhoneValidateOtpActivity> read;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81562131493382, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new CountryItemViewHolder(inflate, this.read);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CountryItemViewHolder countryItemViewHolder = (CountryItemViewHolder) setcontentview;
        onGetStartedClick.write((Object) countryItemViewHolder, "holder");
        setCausedBy setcausedby = this.MediaBrowserCompat$ItemReceiver.get(i);
        onGetStartedClick.write((Object) setcausedby, "countryDisplay");
        countryItemViewHolder.write.setOnClickListener(new CountryItemViewHolder.IconCompatParcelizer(countryItemViewHolder, setcausedby));
        TextView textView = countryItemViewHolder.countryNameTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryNameTextView");
        }
        textView.setText(setcausedby.write);
    }

    public RegistrationCountrySearchAdapter(FundFactSheetActivity<? super setCausedBy, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "onCountryClicked");
        this.read = fundFactSheetActivity;
    }

    public final class CountryItemViewHolder_ViewBinding implements Unbinder {
        private CountryItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public CountryItemViewHolder_ViewBinding(CountryItemViewHolder countryItemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = countryItemViewHolder;
            countryItemViewHolder.countryNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_country_name, "field 'countryNameTextView'", TextView.class);
        }

        public final void read() {
            CountryItemViewHolder countryItemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (countryItemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                countryItemViewHolder.countryNameTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public static final class CountryItemViewHolder extends RecyclerView.setContentView {
        /* access modifiers changed from: private */
        public final FundFactSheetActivity<setCausedBy, HmlVerifyPhoneValidateOtpActivity> AlertController$RecycleListView;
        @BindView
        public TextView countryNameTextView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CountryItemViewHolder(View view, FundFactSheetActivity<? super setCausedBy, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            onGetStartedClick.write((Object) fundFactSheetActivity, "onCountryClicked");
            this.AlertController$RecycleListView = fundFactSheetActivity;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class IconCompatParcelizer implements View.OnClickListener {
            private /* synthetic */ CountryItemViewHolder MediaBrowserCompat$ItemReceiver;
            private /* synthetic */ setCausedBy read;

            IconCompatParcelizer(CountryItemViewHolder countryItemViewHolder, setCausedBy setcausedby) {
                this.MediaBrowserCompat$ItemReceiver = countryItemViewHolder;
                this.read = setcausedby;
            }

            public final void onClick(View view) {
                this.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView.invoke(this.read);
            }
        }
    }
}
