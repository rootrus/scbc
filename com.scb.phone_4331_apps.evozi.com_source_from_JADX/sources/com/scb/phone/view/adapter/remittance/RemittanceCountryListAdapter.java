package com.scb.phone.view.adapter.remittance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;
import com.scb.phone.view.custom.remittance.TransferOptionView;
import java.util.List;
import java.util.concurrent.Callable;
import p040o.AbstractMultimap;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentReviewActivity;
import p040o.C3085x7c929f5b;
import p040o.FragmentBuilder_BindCreditCardDetailFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.getCode;
import p040o.getImportance;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.validateGER;
import p040o.validateHERK;
import p040o.validateSPMV;

public final class RemittanceCountryListAdapter extends BaseExpandableRecycleViewAdapter {
    public List<? extends getImportance> MediaBrowserCompat$ItemReceiver = HmlNationalIdActivity.IconCompatParcelizer;
    private int MediaBrowserCompat$MediaItem = -1;
    private getCode MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final FundFactSheetActivity<C3085x7c929f5b.C30861, HmlVerifyPhoneValidateOtpActivity> MediaDescriptionCompat;
    private final validateGER MediaMetadataCompat;
    private final FragmentBuilder_BindCreditCardDetailFragment RatingCompat;
    private final Context read;

    interface read {
        void MediaBrowserCompat$CustomActionResultReceiver(int i, getCode getcode);
    }

    public final class TransferOptionViewHolder_ViewBinding implements Unbinder {
        private TransferOptionViewHolder MediaBrowserCompat$ItemReceiver;

        public TransferOptionViewHolder_ViewBinding(TransferOptionViewHolder transferOptionViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = transferOptionViewHolder;
            transferOptionViewHolder.llTransfer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_transfer_option, "field 'llTransfer'", LinearLayout.class);
        }

        public final void read() {
            TransferOptionViewHolder transferOptionViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (transferOptionViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                transferOptionViewHolder.llTransfer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class CountryViewHolder_ViewBinding implements Unbinder {
        private CountryViewHolder IconCompatParcelizer;

        public CountryViewHolder_ViewBinding(CountryViewHolder countryViewHolder, View view) {
            this.IconCompatParcelizer = countryViewHolder;
            countryViewHolder.ivFlag = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_flag, "field 'ivFlag'", ImageView.class);
            countryViewHolder.tvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_name, "field 'tvName'", TextView.class);
        }

        public final void read() {
            CountryViewHolder countryViewHolder = this.IconCompatParcelizer;
            if (countryViewHolder != null) {
                this.IconCompatParcelizer = null;
                countryViewHolder.ivFlag = null;
                countryViewHolder.tvName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class CountryExpandViewHolder_ViewBinding extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder_ViewBinding {
        private CountryExpandViewHolder IconCompatParcelizer;

        public CountryExpandViewHolder_ViewBinding(CountryExpandViewHolder countryExpandViewHolder, View view) {
            super(countryExpandViewHolder, view);
            this.IconCompatParcelizer = countryExpandViewHolder;
            countryExpandViewHolder.ivFlag = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_flag, "field 'ivFlag'", ImageView.class);
            countryExpandViewHolder.tvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_name, "field 'tvName'", TextView.class);
        }

        public final void read() {
            CountryExpandViewHolder countryExpandViewHolder = this.IconCompatParcelizer;
            if (countryExpandViewHolder != null) {
                this.IconCompatParcelizer = null;
                countryExpandViewHolder.ivFlag = null;
                countryExpandViewHolder.tvName = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemittanceCountryListAdapter(Context context, FundFactSheetActivity<? super C3085x7c929f5b.C30861, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, validateGER validateger, FragmentBuilder_BindCreditCardDetailFragment fragmentBuilder_BindCreditCardDetailFragment) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onClick");
        onGetStartedClick.write((Object) validateger, "itemManager");
        onGetStartedClick.write((Object) fragmentBuilder_BindCreditCardDetailFragment, "onGroupClickListener");
        this.read = context;
        this.MediaDescriptionCompat = fundFactSheetActivity;
        this.MediaMetadataCompat = validateger;
        this.RatingCompat = fragmentBuilder_BindCreditCardDetailFragment;
        new View.OnClickListener(this) {
            private /* synthetic */ RemittanceCountryListAdapter MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final void onClick(View view) {
                RemittanceCountryListAdapter remittanceCountryListAdapter = this.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) view, "it");
                RemittanceCountryListAdapter.read(remittanceCountryListAdapter, view);
            }
        };
    }

    public static final class write implements Callable {
        private final /* synthetic */ BankingAgentReviewActivity read;
        private final /* synthetic */ String write;

        private write() {
        }

        public /* synthetic */ write(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
            this.read = bankingAgentReviewActivity;
            this.write = str;
        }

        public final Object call() {
            BankingAgentReviewActivity bankingAgentReviewActivity = this.read;
            String str = this.write;
            AbstractMultimap.AsMap.AsMapEntries asMapEntries = AbstractMultimap.AsMap.AsMapEntries.LOADING;
            bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver = asMapEntries;
            return bankingAgentReviewActivity.write.MediaBrowserCompat$CustomActionResultReceiver(bankingAgentReviewActivity.ParcelableVolumeInfo, str, bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver, bankingAgentReviewActivity.IconCompatParcelizer, bankingAgentReviewActivity.MediaBrowserCompat$MediaItem, asMapEntries);
        }
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83652131493591, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…e_country, parent, false)");
            return new CountryViewHolder(this, inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83662131493592, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, "LayoutInflater.from(pare…try_empty, parent, false)");
            return new RemittanceCountryListAdapter$MediaBrowserCompat$ItemReceiver(inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83672131493593, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, "LayoutInflater.from(pare…xpandable, parent, false)");
            return new CountryExpandViewHolder(this, inflate3);
        }
    }

    public final int MediaMetadataCompat(int i) {
        getImportance getimportance = (getImportance) this.MediaBrowserCompat$ItemReceiver.get(i);
        if (!(getimportance instanceof getCode)) {
            return 0;
        }
        getCode getcode = (getCode) getimportance;
        this.MediaBrowserCompat$SearchResultReceiver = getcode;
        if (getcode == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryDisplay");
        }
        if (getcode.MediaBrowserCompat$ItemReceiver.size() < 2) {
            return 1;
        }
        return 2;
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83692131493595, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…on_expand, parent, false)");
        return new TransferOptionViewHolder(this, inflate);
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        if (setcontentview instanceof read) {
            read read2 = (read) setcontentview;
            getCode getcode = this.MediaBrowserCompat$SearchResultReceiver;
            if (getcode == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryDisplay");
            }
            read2.MediaBrowserCompat$CustomActionResultReceiver(i, getcode);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        if (setcontentview instanceof TransferOptionViewHolder) {
            TransferOptionViewHolder transferOptionViewHolder = (TransferOptionViewHolder) setcontentview;
            getCode getcode = this.MediaBrowserCompat$SearchResultReceiver;
            if (getcode == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryDisplay");
            }
            onGetStartedClick.write((Object) getcode, "display");
            List<C3085x7c929f5b.C30861> list = getcode.MediaBrowserCompat$ItemReceiver;
            LinearLayout linearLayout = transferOptionViewHolder.llTransfer;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("llTransfer");
            }
            linearLayout.removeAllViews();
            for (C3085x7c929f5b.C30861 r8 : list) {
                LinearLayout linearLayout2 = transferOptionViewHolder.llTransfer;
                if (linearLayout2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("llTransfer");
                }
                FundFactSheetActivity<C3085x7c929f5b.C30861, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity = transferOptionViewHolder.PlaybackStateCompat.MediaDescriptionCompat;
                TransferOptionView transferOptionView = new TransferOptionView(transferOptionViewHolder.PlaybackStateCompat.read);
                transferOptionView.setChannel(r8, fundFactSheetActivity);
                linearLayout2.addView(transferOptionView);
            }
        }
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final class CountryViewHolder extends validateSPMV implements read {
        final /* synthetic */ RemittanceCountryListAdapter Keep;
        @BindView
        public ImageView ivFlag;
        @BindView
        public TextView tvName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CountryViewHolder(RemittanceCountryListAdapter remittanceCountryListAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.Keep = remittanceCountryListAdapter;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i, getCode getcode) {
            onGetStartedClick.write((Object) getcode, "display");
            TextView textView = this.tvName;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvName");
            }
            textView.setText(getcode.MediaBrowserCompat$CustomActionResultReceiver);
            View view = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
            view.getContext();
            ImageView imageView = this.ivFlag;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivFlag");
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(imageView, getcode.write);
            this.write.setOnClickListener(new C5782x308caab8(this, getcode));
        }
    }

    protected final class CountryExpandViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder implements read {
        private /* synthetic */ RemittanceCountryListAdapter Keep;
        @BindView
        public ImageView ivFlag;
        @BindView
        public TextView tvName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CountryExpandViewHolder(RemittanceCountryListAdapter remittanceCountryListAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.Keep = remittanceCountryListAdapter;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i, getCode getcode) {
            onGetStartedClick.write((Object) getcode, "display");
            TextView textView = this.tvName;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvName");
            }
            textView.setText(getcode.MediaBrowserCompat$CustomActionResultReceiver);
            View view = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
            view.getContext();
            ImageView imageView = this.ivFlag;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivFlag");
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(imageView, getcode.write);
            if (!(i < this.Keep.MediaBrowserCompat$ItemReceiver.size())) {
                View view2 = this.write;
                onGetStartedClick.IconCompatParcelizer((Object) view2, "itemView");
                view2.setClickable(false);
                ImageView imageView2 = this.expandIcon;
                onGetStartedClick.IconCompatParcelizer((Object) imageView2, "expandIcon");
                imageView2.setVisibility(8);
            } else {
                View view3 = this.write;
                onGetStartedClick.IconCompatParcelizer((Object) view3, "itemView");
                view3.setClickable(true);
                ImageView imageView3 = this.expandIcon;
                onGetStartedClick.IconCompatParcelizer((Object) imageView3, "expandIcon");
                imageView3.setVisibility(0);
            }
            BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(this);
        }
    }

    public final class TransferOptionViewHolder extends validateSPMV {
        final /* synthetic */ RemittanceCountryListAdapter PlaybackStateCompat;
        @BindView
        public LinearLayout llTransfer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TransferOptionViewHolder(RemittanceCountryListAdapter remittanceCountryListAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.PlaybackStateCompat = remittanceCountryListAdapter;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static final /* synthetic */ void read(RemittanceCountryListAdapter remittanceCountryListAdapter, View view) {
        RecyclerView.setContentView IconCompatParcelizer;
        int i;
        long j;
        int i2;
        if (view.getId() == R.id.container && (IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(view)) != null) {
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "RecyclerViewAdapterUtils…iewHolder(view) ?: return");
            RecyclerView recyclerView = IconCompatParcelizer.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
            }
            if (i != -1) {
                validateHERK validateherk = remittanceCountryListAdapter.MediaMetadataCompat.MediaDescriptionCompat;
                if (validateherk == null) {
                    j = -1;
                } else {
                    j = validateherk.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                int i3 = (int) j;
                if (i3 < remittanceCountryListAdapter.MediaBrowserCompat$ItemReceiver.size()) {
                    remittanceCountryListAdapter.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
                    if (((int) (j >>> 32)) == -1) {
                        remittanceCountryListAdapter.RatingCompat.write();
                        if (remittanceCountryListAdapter.MediaMetadataCompat.IconCompatParcelizer(i3)) {
                            validateHERK validateherk2 = remittanceCountryListAdapter.MediaMetadataCompat.MediaDescriptionCompat;
                            if (validateherk2 != null) {
                                boolean MediaBrowserCompat$ItemReceiver2 = validateherk2.MediaBrowserCompat$ItemReceiver(i3, false, (Object) null);
                            }
                        } else {
                            remittanceCountryListAdapter.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
                            validateHERK validateherk3 = remittanceCountryListAdapter.MediaMetadataCompat.MediaDescriptionCompat;
                            if (validateherk3 != null) {
                                boolean read2 = validateherk3.read(i3, false, (Object) null);
                            }
                        }
                    }
                    if ((IconCompatParcelizer instanceof CountryExpandViewHolder) && (i2 = remittanceCountryListAdapter.MediaBrowserCompat$MediaItem) >= 0 && i2 != i) {
                        remittanceCountryListAdapter.IconCompatParcelizer.write();
                    }
                    remittanceCountryListAdapter.MediaBrowserCompat$MediaItem = i;
                }
            }
        }
    }
}
