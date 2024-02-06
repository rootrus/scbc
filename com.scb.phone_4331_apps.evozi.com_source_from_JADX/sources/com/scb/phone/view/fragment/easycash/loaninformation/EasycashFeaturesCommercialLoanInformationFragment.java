package com.scb.phone.view.fragment.easycash.loaninformation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.gson.annotations.SerializedName;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider$MediaBrowserCompat$ItemReceiver;
import java.util.List;
import java.util.Locale;
import p040o.AnalyticsConnectorReceiver;
import p040o.BasicSettingsProfile;
import p040o.BoundingRect;
import p040o.C10827Iterators;
import p040o.C3143x9c8292e4;
import p040o.C3667xaad65dd;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CustomConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.MultiProcessor;
import p040o.ZSYR2K;
import p040o.dispatchCrashlyticsOriginEvent;
import p040o.forEachClear;
import p040o.getNextExpirable;
import p040o.getNextTransition;
import p040o.getRectBottom;
import p040o.getRectLeft;
import p040o.getRectRight;
import p040o.getRectTop;
import p040o.getRtpSubscriptionRecommandedBiller;
import p040o.getTimeOutParameters;
import p040o.isEmulator;
import p040o.isSupportFragmentClass;
import p040o.onGetStartedClick;
import p040o.publish;
import p040o.setDataCollectionEnabled;
import p040o.setImageBarCodes;
import p040o.setMicrData;
import p040o.setOutputDPI;
import p040o.setRectBottom;
import p040o.show;
import p040o.subscribe;
import p040o.verifyProfileByAtm;
import p040o.writeUInt64NoTag;

public class EasycashFeaturesCommercialLoanInformationFragment extends BasePurposefulCommercialFeaturesLoanInformationFragment implements CheckExtractActivity_MembersInjector.RatingCompat {
    private isEmulator MediaBrowserCompat$MediaItem;
    @BindView
    protected CustomDeltaSlider amountSlider;
    @HmlPinActivity
    public setMicrData presenter;

    public static EasycashFeaturesCommercialLoanInformationFragment IconCompatParcelizer() {
        EasycashFeaturesCommercialLoanInformationFragment easycashFeaturesCommercialLoanInformationFragment = new EasycashFeaturesCommercialLoanInformationFragment();
        easycashFeaturesCommercialLoanInformationFragment.setArguments(new Bundle());
        return easycashFeaturesCommercialLoanInformationFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.write((writeUInt64NoTag) this.presenter);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86992131493926, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        getContext();
        this.durationRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.MediaBrowserCompat$MediaItem = new isEmulator();
        setMicrData setmicrdata = this.presenter;
        if (setmicrdata.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setmicrdata.RatingCompat.AlertController$RecycleListView();
        }
        C10827Iterators.PeekingImpl peekingImpl = setmicrdata.MediaBrowserCompat$MediaItem;
        getRectBottom getrectbottom = new getRectBottom(setmicrdata);
        getRectTop getrecttop = new getRectTop(setmicrdata);
        onGetStartedClick.write((Object) getrectbottom, "onSuccess");
        onGetStartedClick.write((Object) getrecttop, "onError");
        onGetStartedClick.write((Object) "COMMERCIAL_LOAN", "request");
        peekingImpl.IconCompatParcelizer(peekingImpl.read, getrectbottom, getrecttop, new C3143x9c8292e4("COMMERCIAL_LOAN"));
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(subscribe subscribe) {
        this.cardSelector.MediaBrowserCompat$CustomActionResultReceiver(subscribe, true, new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                setMicrData setmicrdata = EasycashFeaturesCommercialLoanInformationFragment.this.presenter;
                setmicrdata.MediaBrowserCompat$ItemReceiver = i;
                getRectLeft getrectleft = new getRectLeft(setmicrdata, i, setmicrdata.MediaBrowserCompat$SearchResultReceiver.write.get(i).IconCompatParcelizer);
                if (setmicrdata.RatingCompat != null) {
                    getrectleft.IconCompatParcelizer(setmicrdata.RatingCompat);
                }
            }
        });
        if (subscribe.read.size() == 1) {
            this.cardSelector.read();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.amountSlider.setVisibility(0);
        this.amountInputLayout.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(AnalyticsConnectorReceiver analyticsConnectorReceiver) {
        this.amountSlider.read(new publish(analyticsConnectorReceiver), (CustomDeltaSlider$MediaBrowserCompat$ItemReceiver) new CustomDeltaSlider$MediaBrowserCompat$ItemReceiver() {
            public final void IconCompatParcelizer(double d) {
            }

            public final void MediaBrowserCompat$ItemReceiver(double d) {
                setMicrData setmicrdata = EasycashFeaturesCommercialLoanInformationFragment.this.presenter;
                getRectRight getrectright = new getRectRight(d);
                if (setmicrdata.RatingCompat != null) {
                    getrectright.IconCompatParcelizer(setmicrdata.RatingCompat);
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                setMicrData setmicrdata = EasycashFeaturesCommercialLoanInformationFragment.this.presenter;
                getRectRight getrectright = new getRectRight(d);
                if (setmicrdata.RatingCompat != null) {
                    getrectright.IconCompatParcelizer(setmicrdata.RatingCompat);
                }
            }
        });
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(dispatchCrashlyticsOriginEvent dispatchcrashlyticsoriginevent) {
        this.IconCompatParcelizer = new getRtpSubscriptionRecommandedBiller(dispatchcrashlyticsoriginevent, new verifyProfileByAtm(this, dispatchcrashlyticsoriginevent));
        super.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(dispatchCrashlyticsOriginEvent dispatchcrashlyticsoriginevent, int i) {
        setMicrData setmicrdata = this.presenter;
        int intValue = dispatchcrashlyticsoriginevent.read.get(i).intValue();
        double d = (double) this.amountSlider.IconCompatParcelizer;
        if (setmicrdata.RatingCompat != null) {
            setmicrdata.RatingCompat.AlertController$RecycleListView();
        }
        setImageBarCodes setimagebarcodes = setImageBarCodes.IconCompatParcelizer;
        if (setmicrdata.RatingCompat != null) {
            setimagebarcodes.IconCompatParcelizer(setmicrdata.RatingCompat);
        }
        C10827Iterators.PeekingImpl peekingImpl = setmicrdata.MediaBrowserCompat$MediaItem;
        BoundingRect boundingRect = new BoundingRect(setmicrdata);
        setOutputDPI setoutputdpi = new setOutputDPI(setmicrdata);
        CustomConcurrentHashMap.EntryFactory.C328710 r1 = new Object(String.format(Locale.getDefault(), setmicrdata.MediaSessionCompat$ResultReceiverWrapper, new Object[]{Double.valueOf(d)}), Integer.toString(intValue), "") {
            @SerializedName("amount")
            private final String IconCompatParcelizer;
            @SerializedName("duration")
            private final String MediaBrowserCompat$ItemReceiver;
            @SerializedName("tilesVersion")
            public String write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C328710)) {
                    return false;
                }
                C328710 r3 = (C328710) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write);
            }

            public final int hashCode() {
                String str = this.IconCompatParcelizer;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.write;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return (((hashCode * 31) + hashCode2) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("CommercialCalculationRequest(amount=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", duration=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(", tilesVersion=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }

            {
                onGetStartedClick.write((Object) r2, "amount");
                onGetStartedClick.write((Object) r3, "duration");
                onGetStartedClick.write((Object) r4, "tilesVersion");
                this.IconCompatParcelizer = r2;
                this.MediaBrowserCompat$ItemReceiver = r3;
                this.write = r4;
            }
        };
        onGetStartedClick.write((Object) boundingRect, "onSuccess");
        onGetStartedClick.write((Object) setoutputdpi, "onError");
        onGetStartedClick.write((Object) r1, "request");
        peekingImpl.IconCompatParcelizer(peekingImpl.MediaBrowserCompat$CustomActionResultReceiver, boundingRect, setoutputdpi, new MultiProcessor.Factory.write(r1));
    }

    public final void write(String str) {
        this.rateDisclaimer.setText(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.rateDisclaimer.setVisibility(z ? 0 : 8);
    }

    @OnClick
    public void onNextButtonClick() {
        setDataCollectionEnabled setdatacollectionenabled;
        String str;
        String str2;
        isSupportFragmentClass issupportfragmentclass;
        isSupportFragmentClass issupportfragmentclass2;
        PlaybackStateCompat$CustomAction();
        setMicrData setmicrdata = this.presenter;
        if (setmicrdata.RatingCompat != null) {
            setmicrdata.RatingCompat.AlertController$RecycleListView();
        }
        String str3 = setmicrdata.f2950x50fd9e4a;
        String str4 = setmicrdata.MediaDescriptionCompat.read.get(setmicrdata.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        String str5 = setmicrdata.MediaDescriptionCompat.read.get(setmicrdata.MediaBrowserCompat$ItemReceiver).write;
        String str6 = setmicrdata.MediaDescriptionCompat.IconCompatParcelizer;
        String str7 = setmicrdata.write.IconCompatParcelizer;
        String str8 = setmicrdata.write.write;
        List<setDataCollectionEnabled> list = setmicrdata.write.read;
        T t = null;
        if (list.isEmpty()) {
            setdatacollectionenabled = null;
        } else {
            show show = new show(list);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, setRectBottom.MediaBrowserCompat$CustomActionResultReceiver));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass2 = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass2 = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            T t2 = issupportfragmentclass2.IconCompatParcelizer;
            if (t2 == null) {
                t2 = null;
            }
            setdatacollectionenabled = (setDataCollectionEnabled) t2;
        }
        if (setdatacollectionenabled != null) {
            str = setdatacollectionenabled.write;
        } else {
            str = setmicrdata.f2950x50fd9e4a;
        }
        List<setDataCollectionEnabled> list2 = setmicrdata.write.read;
        if (!list2.isEmpty()) {
            show show3 = new show(list2);
            show show4 = new show(show3.write, new getNextTransition(show3.IconCompatParcelizer, BasicSettingsProfile.RotateType.write));
            if (show4.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show4.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            T t3 = issupportfragmentclass.IconCompatParcelizer;
            if (t3 != null) {
                t = t3;
            }
            t = (setDataCollectionEnabled) t;
        }
        if (t != null) {
            str2 = t.write;
        } else {
            str2 = setmicrdata.f2950x50fd9e4a;
        }
        getNextExpirable getnextexpirable = new getNextExpirable(str3, str4, str5, str6, str7, str8, str, str2);
        C10827Iterators.PeekingImpl peekingImpl = setmicrdata.MediaBrowserCompat$MediaItem;
        BasicSettingsProfile.FriendBSP friendBSP = new BasicSettingsProfile.FriendBSP(setmicrdata, getnextexpirable);
        BasicSettingsProfile.OutputBitDepth outputBitDepth = new BasicSettingsProfile.OutputBitDepth(setmicrdata);
        onGetStartedClick.write((Object) friendBSP, "onSuccess");
        onGetStartedClick.write((Object) outputBitDepth, "onError");
        onGetStartedClick.write((Object) getnextexpirable, "request");
        peekingImpl.IconCompatParcelizer(peekingImpl.write, friendBSP, outputBitDepth, new C3667xaad65dd(getnextexpirable));
    }

    public final void MediaBrowserCompat$ItemReceiver(getNextExpirable getnextexpirable) {
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.MediaBrowserCompat$CustomActionResultReceiver.write()));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("tenor", getnextexpirable.read));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("amount", getnextexpirable.MediaBrowserCompat$ItemReceiver));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_program", getnextexpirable.MediaMetadataCompat));
        forEachClear foreachclear = this.tracker;
        if (getActivity() != null) {
            foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_feature");
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(getnextexpirable.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem);
        getTimeOutParameters gettimeoutparameters = this.MediaMetadataCompat;
        C5935xc23f28aa easycashCommercialLoanAccountFragment$MediaBrowserCompat$ItemReceiver = EasycashCommercialLoanAccountFragment.MediaBrowserCompat$CustomActionResultReceiver;
        String str = getnextexpirable.MediaMetadataCompat;
        EasycashCommercialLoanAccountFragment easycashCommercialLoanAccountFragment = new EasycashCommercialLoanAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.scb.phone.view.activity.easycash.PRODUCT_PROGRAM", str);
        easycashCommercialLoanAccountFragment.setArguments(bundle);
        gettimeoutparameters.IconCompatParcelizer(this, easycashCommercialLoanAccountFragment);
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaBrowserCompat$MediaItem.AlertController$RecycleListView = str;
    }

    public void onDestroyView() {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.presenter.onDestroy();
        super.onDestroyView();
    }
}
