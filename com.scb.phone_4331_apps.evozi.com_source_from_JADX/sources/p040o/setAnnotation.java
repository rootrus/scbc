package p040o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.List;
import java.util.concurrent.Callable;
import p040o.AbstractMultimap;
import p040o.ZHER2K;
import p040o.setAnnotation$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.setAnnotation */
public final class setAnnotation extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    public int MediaBrowserCompat$ItemReceiver;
    public List<AutoValue_CrashlyticsReport_Session_Event_Application> MediaBrowserCompat$SearchResultReceiver;
    public AutoValue_CrashlyticsReport_Session_Event_Application read;
    public setAnnotation$MediaBrowserCompat$CustomActionResultReceiver write;

    public setAnnotation(Context context) {
        onGetStartedClick.write((Object) context, "context");
    }

    /* renamed from: o.setAnnotation$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Callable {
        private final /* synthetic */ BankingAgentReviewActivity IconCompatParcelizer;
        private final /* synthetic */ String write;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
            this.IconCompatParcelizer = bankingAgentReviewActivity;
            this.write = str;
        }

        public final Object call() {
            BankingAgentReviewActivity bankingAgentReviewActivity = this.IconCompatParcelizer;
            String str = this.write;
            AbstractMultimap.AsMap.AsMapEntries asMapEntries = AbstractMultimap.AsMap.AsMapEntries.LOADING;
            bankingAgentReviewActivity.MediaBrowserCompat$MediaItem = asMapEntries;
            return bankingAgentReviewActivity.write.MediaBrowserCompat$CustomActionResultReceiver(bankingAgentReviewActivity.ParcelableVolumeInfo, str, bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver, bankingAgentReviewActivity.IconCompatParcelizer, asMapEntries, bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == 0) {
            onGetStartedClick.write((Object) viewGroup, "$this$inflate");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90892131494316, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(cont…late(layout, this, false)");
            return new RatingCompat(inflate);
        } else if (i == 1) {
            onGetStartedClick.write((Object) viewGroup, "$this$inflate");
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90882131494315, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, "LayoutInflater.from(cont…late(layout, this, false)");
            setAnnotation$MediaBrowserCompat$CustomActionResultReceiver setannotation_mediabrowsercompat_customactionresultreceiver = this.write;
            if (setannotation_mediabrowsercompat_customactionresultreceiver == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            }
            return new read(inflate2, setannotation_mediabrowsercompat_customactionresultreceiver);
        } else if (i != 2) {
            onGetStartedClick.write((Object) viewGroup, "$this$inflate");
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90872131494314, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, "LayoutInflater.from(cont…late(layout, this, false)");
            return new write(inflate3);
        } else {
            onGetStartedClick.write((Object) viewGroup, "$this$inflate");
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90862131494313, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate4, "LayoutInflater.from(cont…late(layout, this, false)");
            setAnnotation$MediaBrowserCompat$CustomActionResultReceiver setannotation_mediabrowsercompat_customactionresultreceiver2 = this.write;
            if (setannotation_mediabrowsercompat_customactionresultreceiver2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            }
            return new setAnnotation$MediaBrowserCompat$ItemReceiver(inflate4, setannotation_mediabrowsercompat_customactionresultreceiver2);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        if (setcontentview instanceof RatingCompat) {
            RatingCompat ratingCompat = (RatingCompat) setcontentview;
            View view = ratingCompat.write;
            if (i == 0) {
                View view2 = ratingCompat.write;
                onGetStartedClick.IconCompatParcelizer((Object) view2, "itemView");
                TextView textView = (TextView) view2.findViewById(ZHER2K.write.tvTitleWallet);
                onGetStartedClick.IconCompatParcelizer((Object) textView, "itemView.tvTitleWallet");
                textView.setText(view.getContext().getString(R.string.prepaid_travel_wallet_thb_wallet));
            } else if (i == 2) {
                View view3 = ratingCompat.write;
                onGetStartedClick.IconCompatParcelizer((Object) view3, "itemView");
                TextView textView2 = (TextView) view3.findViewById(ZHER2K.write.tvTitleWallet);
                onGetStartedClick.IconCompatParcelizer((Object) textView2, "itemView.tvTitleWallet");
                textView2.setText(view.getContext().getString(R.string.prepaid_travel_wallet_other_currency_wallet));
            }
        } else if (setcontentview instanceof read) {
            read read2 = (read) setcontentview;
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list = this.MediaBrowserCompat$SearchResultReceiver;
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("walletTravelList");
            }
            AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = list.get(0);
            onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "prepaidTravelWalletDisplay");
            View view4 = read2.write;
            Glide.MediaBrowserCompat$ItemReceiver(view4.getContext()).MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_Session_Event_Application.RatingCompat).MediaBrowserCompat$ItemReceiver((ImageView) view4.findViewById(ZHER2K.write.icThbFlag));
            AppCompatTextView appCompatTextView = (AppCompatTextView) view4.findViewById(ZHER2K.write.tvThbName);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView, "tvThbName");
            appCompatTextView.setText(autoValue_CrashlyticsReport_Session_Event_Application.IconCompatParcelizer);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view4.findViewById(ZHER2K.write.tvThb);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView2, "tvThb");
            appCompatTextView2.setText(autoValue_CrashlyticsReport_Session_Event_Application.IconCompatParcelizer);
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) view4.findViewById(ZHER2K.write.tvThbAmount);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView3, "tvThbAmount");
            appCompatTextView3.setText(autoValue_CrashlyticsReport_Session_Event_Application.read);
        } else if (setcontentview instanceof setAnnotation$MediaBrowserCompat$ItemReceiver) {
            setAnnotation$MediaBrowserCompat$ItemReceiver setannotation_mediabrowsercompat_itemreceiver = (setAnnotation$MediaBrowserCompat$ItemReceiver) setcontentview;
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (list2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("walletTravelList");
            }
            AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application2 = list2.get(i - 2);
            AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application3 = this.read;
            if (autoValue_CrashlyticsReport_Session_Event_Application3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("thbWallet");
            }
            List<String> list3 = autoValue_CrashlyticsReport_Session_Event_Application3.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application2, "prepaidTravelWalletDisplay");
            onGetStartedClick.write((Object) list3, "thbWalletAllowTag");
            View view5 = setannotation_mediabrowsercompat_itemreceiver.write;
            Glide.MediaBrowserCompat$ItemReceiver(view5.getContext()).MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_Session_Event_Application2.RatingCompat).MediaBrowserCompat$ItemReceiver((abandon<?>) new isReset().IconCompatParcelizer((int) R.color.f66402131099796)).MediaBrowserCompat$ItemReceiver((ImageView) view5.findViewById(ZHER2K.write.icOtherCurrencyFlag));
            AppCompatTextView appCompatTextView4 = (AppCompatTextView) view5.findViewById(ZHER2K.write.tvOtherCurrencyName);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView4, "tvOtherCurrencyName");
            appCompatTextView4.setText(autoValue_CrashlyticsReport_Session_Event_Application2.IconCompatParcelizer);
            AppCompatTextView appCompatTextView5 = (AppCompatTextView) view5.findViewById(ZHER2K.write.tvOtherCurrency);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView5, "tvOtherCurrency");
            appCompatTextView5.setText(autoValue_CrashlyticsReport_Session_Event_Application2.IconCompatParcelizer);
            AppCompatTextView appCompatTextView6 = (AppCompatTextView) view5.findViewById(ZHER2K.write.tvOtherCurrencyAmount);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView6, "tvOtherCurrencyAmount");
            appCompatTextView6.setText(autoValue_CrashlyticsReport_Session_Event_Application2.read);
            view5.setOnClickListener(new setAnnotation$MediaBrowserCompat$ItemReceiver.read(setannotation_mediabrowsercompat_itemreceiver, autoValue_CrashlyticsReport_Session_Event_Application2, list3));
        }
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (i != 2) {
                return MediaBrowserCompat$CustomActionResultReceiver() ? 3 : 2;
            }
        }
        return 0;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        List<AutoValue_CrashlyticsReport_Session_Event_Application> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("walletTravelList");
        }
        if (list.size() == 1) {
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (list2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("walletTravelList");
            }
            if (list2.get(0).MediaMetadataCompat == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o.setAnnotation$RatingCompat */
    public static final class RatingCompat extends RecyclerView.setContentView {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RatingCompat(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
        }
    }

    /* renamed from: o.setAnnotation$read */
    public static final class read extends RecyclerView.setContentView {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(View view, setAnnotation$MediaBrowserCompat$CustomActionResultReceiver setannotation_mediabrowsercompat_customactionresultreceiver) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            onGetStartedClick.write((Object) setannotation_mediabrowsercompat_customactionresultreceiver, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
    }

    /* renamed from: o.setAnnotation$write */
    public static final class write extends RecyclerView.setContentView {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
        }
    }
}
