package com.scb.phone.view.activity.ccrredemption.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ccrredemption.search.RewardSearchResultActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.C4054b;
import p040o.C5111open;
import p040o.C7198kW;
import p040o.C7199kX;
import p040o.C7224ld;
import p040o.ExceptionResponseImpl;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.FriendsLandingActivity_ViewBinding;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.GoogleSigninService;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PersonalizeActivity;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.getHeadEulerAngleZ;
import p040o.getHintedLanguages;
import p040o.getReuseAddress;
import p040o.getReuseAddress$MediaBrowserCompat$ItemReceiver;
import p040o.intoSetBuilder;
import p040o.onGetStartedClick;
import p040o.readString;
import p040o.readStringList;
import p040o.setFormat;
import p040o.setFormat$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setFormat$MediaBrowserCompat$SearchResultReceiver;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class RewardSearchActivity extends BaseActivity implements ExceptionResponseImpl {
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    @BindView
    public ImageButton btClear;
    @BindView
    public EditText etSearch;
    @BindView
    public LinearLayout historyContainer;
    @HmlPinActivity
    public setFormat presenter;
    @BindView
    public RecyclerView rvHistory;
    @BindView
    public RecyclerView rvSuggestion;
    @BindView
    public Spinner spinner;
    @BindView
    public LinearLayout suggestionContainer;
    @BindView
    public TextView tvCardPoints;
    @BindView
    public TextView tvTitle;

    public static final Intent read(Context context, intoSetBuilder intosetbuilder, chain chain, Integer num, String str) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) intosetbuilder, "rewardCategoriesDto");
        onGetStartedClick.write((Object) chain, "creditCardDisplay");
        Intent putExtra = new Intent(context, RewardSearchActivity.class).putExtra("EXTRA_CATEGORY_ID", num).putExtra("EXTRA_REWARD_CATEGORY_DTO", intosetbuilder).putExtra("EXTRA_CREDIT_CARD_DISPLAY", chain);
        putExtra.putExtra("EXTRA_FIREBASE_SOURCE", str);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, RewardSe…                        }");
        return putExtra;
    }

    public RewardSearchActivity() {
        FundActionsSuccessActivity rewardSearchActivity$MediaBrowserCompat$SearchResultReceiver = new RewardSearchActivity$MediaBrowserCompat$SearchResultReceiver(this);
        onGetStartedClick.write((Object) rewardSearchActivity$MediaBrowserCompat$SearchResultReceiver, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(rewardSearchActivity$MediaBrowserCompat$SearchResultReceiver);
        FundActionsSuccessActivity rewardSearchActivity$MediaBrowserCompat$CustomActionResultReceiver = new C5575x32f03c13(this);
        onGetStartedClick.write((Object) rewardSearchActivity$MediaBrowserCompat$CustomActionResultReceiver, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(rewardSearchActivity$MediaBrowserCompat$CustomActionResultReceiver);
        FundActionsSuccessActivity rewardSearchActivity$MediaBrowserCompat$MediaItem = new RewardSearchActivity$MediaBrowserCompat$MediaItem(this);
        onGetStartedClick.write((Object) rewardSearchActivity$MediaBrowserCompat$MediaItem, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(rewardSearchActivity$MediaBrowserCompat$MediaItem);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.f79712131493196);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        Spinner spinner2 = this.spinner;
        if (spinner2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinner");
        }
        spinner2.setAdapter((C7199kX) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver());
        Spinner spinner3 = this.spinner;
        if (spinner3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinner");
        }
        spinner3.setOnTouchListener(new read(this));
        Spinner spinner4 = this.spinner;
        if (spinner4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinner");
        }
        spinner4.setOnItemSelectedListener(new IconCompatParcelizer(this));
        RecyclerView recyclerView = this.rvSuggestion;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvSuggestion");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        recyclerView.setAdapter((C4054b.C4063c.C40641) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver());
        RecyclerView recyclerView2 = this.rvHistory;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvHistory");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        recyclerView2.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        recyclerView2.setAdapter((C7224ld) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver());
        EditText editText = this.etSearch;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText.addTextChangedListener(new RewardSearchActivity$MediaBrowserCompat$ItemReceiver(this));
        EditText editText2 = this.etSearch;
        if (editText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText2.setOnEditorActionListener(new MediaMetadataCompat(this));
        setFormat setformat = this.presenter;
        if (setformat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setformat.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        String str2 = null;
        intoSetBuilder intosetbuilder = intent != null ? (intoSetBuilder) intent.getParcelableExtra("EXTRA_REWARD_CATEGORY_DTO") : null;
        setFormat setformat2 = this.presenter;
        if (setformat2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Intent intent2 = getIntent();
        setformat2.read = intent2 != null ? Integer.valueOf(intent2.getIntExtra("EXTRA_CATEGORY_ID", -1)) : null;
        setFormat setformat3 = this.presenter;
        if (setformat3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (intosetbuilder != null) {
            str = intosetbuilder.IconCompatParcelizer;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        onGetStartedClick.write((Object) str, "<set-?>");
        setformat3.MediaBrowserCompat$ItemReceiver = str;
        setFormat setformat4 = this.presenter;
        if (setformat4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (setformat4.RatingCompat != null) {
            setformat4.RatingCompat.AlertController$RecycleListView();
        }
        setformat4.MediaBrowserCompat$SearchResultReceiver = setformat4.write.IconCompatParcelizer.IconCompatParcelizer();
        FundFactSheetActivity ratingCompat = new setFormat.RatingCompat(setformat4);
        onGetStartedClick.write((Object) ratingCompat, "action");
        writeUInt64NoTag.IconCompatParcelizer gethintedlanguages = new getHintedLanguages(ratingCompat);
        if (setformat4.RatingCompat != null) {
            gethintedlanguages.IconCompatParcelizer(setformat4.RatingCompat);
        }
        getReuseAddress getreuseaddress = setformat4.MediaMetadataCompat;
        String str3 = setformat4.MediaBrowserCompat$ItemReceiver;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardCode");
        }
        onGetStartedClick.write((Object) str3, "cardCode");
        BScanCNotificationDeepLinkActivity IconCompatParcelizer2 = BScanCNotificationDeepLinkActivity.IconCompatParcelizer(BScanCNotificationDeepLinkActivity.read(getreuseaddress.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(str3).map(getReuseAddress$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver)), getreuseaddress.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(str3, readString.ALL), getReuseAddress.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "Single.zip(\n            …leList\n                })");
        getreuseaddress.read(new FriendsLandingActivity_ViewBinding(IconCompatParcelizer2), new setFormat$MediaBrowserCompat$CustomActionResultReceiver(setformat4), new setFormat$MediaBrowserCompat$SearchResultReceiver(setformat4));
        setFormat setformat5 = this.presenter;
        if (setformat5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        FundFactSheetActivity fundFactSheetActivity = setFormat.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundFactSheetActivity, "action");
        writeUInt64NoTag.IconCompatParcelizer gethintedlanguages2 = new getHintedLanguages(fundFactSheetActivity);
        if (setformat5.RatingCompat != null) {
            gethintedlanguages2.IconCompatParcelizer(setformat5.RatingCompat);
        }
        if (intosetbuilder != null) {
            str2 = intosetbuilder.MediaSessionCompat$Token;
        }
        TextView textView = this.tvCardPoints;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardPoints");
        }
        Object[] objArr = new Object[1];
        if (str2 == null) {
            str2 = "0";
        }
        objArr[0] = str2;
        textView.setText(getString(R.string.you_have_points, objArr));
    }

    static final class read implements View.OnTouchListener {
        private /* synthetic */ RewardSearchActivity MediaBrowserCompat$CustomActionResultReceiver;

        read(RewardSearchActivity rewardSearchActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = rewardSearchActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            onGetStartedClick.IconCompatParcelizer((Object) motionEvent, "event");
            if (motionEvent.getAction() != 0) {
                return false;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction();
            return false;
        }
    }

    public static final class IconCompatParcelizer implements AdapterView.OnItemSelectedListener {
        private /* synthetic */ RewardSearchActivity write;

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        IconCompatParcelizer(RewardSearchActivity rewardSearchActivity) {
            this.write = rewardSearchActivity;
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            setFormat setformat = this.write.presenter;
            if (setformat == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            int i2 = i - 1;
            Integer num = null;
            if (i2 >= 0) {
                List<? extends PersonalizeActivity.IconCompatParcelizer> list = setformat.IconCompatParcelizer;
                PersonalizeActivity.IconCompatParcelizer iconCompatParcelizer = list != null ? (PersonalizeActivity.IconCompatParcelizer) list.get(i2) : null;
                setformat.MediaBrowserCompat$MediaItem = iconCompatParcelizer;
                if (iconCompatParcelizer != null) {
                    num = Integer.valueOf(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                }
                setformat.read = num;
            } else {
                setformat.MediaBrowserCompat$MediaItem = null;
                setformat.read = null;
            }
            setFormat setformat2 = this.write.presenter;
            if (setformat2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            EditText editText = this.write.etSearch;
            if (editText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
            }
            setformat2.MediaBrowserCompat$ItemReceiver(editText.getText().toString());
        }
    }

    static final class MediaMetadataCompat implements TextView.OnEditorActionListener {
        private /* synthetic */ RewardSearchActivity MediaBrowserCompat$ItemReceiver;

        MediaMetadataCompat(RewardSearchActivity rewardSearchActivity) {
            this.MediaBrowserCompat$ItemReceiver = rewardSearchActivity;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            setFormat setformat = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (setformat == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            EditText editText = this.MediaBrowserCompat$ItemReceiver.etSearch;
            if (editText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
            }
            setformat.MediaBrowserCompat$CustomActionResultReceiver(editText.getText().toString(), false);
            return true;
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.ccr_search_rewards_title);
        setTabContainer();
        TextView textView = this.tvCardPoints;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardPoints");
        }
        textView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f66092131099764));
    }

    public final void write(String str, List<String> list) {
        onGetStartedClick.write((Object) str, "keyword");
        onGetStartedClick.write((Object) list, "list");
        LinearLayout linearLayout = this.suggestionContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("suggestionContainer");
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.historyContainer;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("historyContainer");
        }
        linearLayout2.setVisibility(8);
        C4054b.C4063c.C40641 r0 = (C4054b.C4063c.C40641) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        Iterable<String> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (String getheadeuleranglez : iterable) {
            arrayList.add(new getHeadEulerAngleZ(getheadeuleranglez, str));
        }
        List list2 = (List) arrayList;
        onGetStartedClick.write((Object) list2, "<set-?>");
        r0.write.MediaBrowserCompat$ItemReceiver(C7198kW.read[0], list2);
    }

    public final void read(String str, PersonalizeActivity.IconCompatParcelizer iconCompatParcelizer, String str2) {
        Integer num;
        String str3;
        int i;
        String stringExtra;
        onGetStartedClick.write((Object) str, "keyword");
        onGetStartedClick.write((Object) str2, "searchType");
        Intent intent = getIntent();
        readStringList readstringlist = null;
        intoSetBuilder intosetbuilder = intent != null ? (intoSetBuilder) intent.getParcelableExtra("EXTRA_REWARD_CATEGORY_DTO") : null;
        Intent intent2 = getIntent();
        chain chain = intent2 != null ? (chain) intent2.getParcelableExtra("EXTRA_CREDIT_CARD_DISPLAY") : null;
        if (intosetbuilder != null) {
            intosetbuilder.ParcelableVolumeInfo = str;
            setFormat setformat = this.presenter;
            if (setformat == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str4 = setformat.MediaBrowserCompat$ItemReceiver;
            if (str4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardCode");
            }
            intosetbuilder.IconCompatParcelizer = str4;
            if (iconCompatParcelizer != null) {
                num = Integer.valueOf(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                num = null;
            }
            intosetbuilder.MediaBrowserCompat$CustomActionResultReceiver = num;
            if (iconCompatParcelizer != null) {
                str3 = iconCompatParcelizer.read;
            } else {
                str3 = null;
            }
            intosetbuilder.MediaBrowserCompat$SearchResultReceiver = str3;
            if (iconCompatParcelizer != null) {
                readstringlist = iconCompatParcelizer.write;
            }
            intosetbuilder.MediaBrowserCompat$MediaItem = readstringlist;
            intosetbuilder.MediaSessionCompat$QueueItem = readString.ALL;
            ZSYR2K[] zsyr2kArr = new ZSYR2K[4];
            if (iconCompatParcelizer != null) {
                i = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                i = -1;
            }
            zsyr2kArr[0] = new ZSYR2K("CategoryID", String.valueOf(i));
            zsyr2kArr[1] = new ZSYR2K("search_value", str);
            zsyr2kArr[2] = new ZSYR2K("search_type", str2);
            Intent intent3 = getIntent();
            onGetStartedClick.write((Object) "EXTRA_FIREBASE_SOURCE", "name");
            String str5 = "";
            if (!(intent3 == null || (stringExtra = intent3.getStringExtra("EXTRA_FIREBASE_SOURCE")) == null)) {
                str5 = stringExtra;
            }
            zsyr2kArr[3] = new ZSYR2K("source", str5);
            this.scbAnalytics.write("rewards_catalog_category", zsyr2kArr);
            RewardSearchResultActivity.IconCompatParcelizer iconCompatParcelizer2 = RewardSearchResultActivity.MediaMetadataCompat;
            Context context = this;
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) intosetbuilder, "rewardCategoriesDto");
            Intent putExtra = new Intent(context, RewardSearchResultActivity.class).putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductListActivity.CATEGORY_DTO_EXTRA", intosetbuilder).putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductListActivity.CREDIT_CARD_DISPLAY_EXTRA", chain);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, RewardSe…EXTRA, creditCardDisplay)");
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, putExtra).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write(List<String> list) {
        onGetStartedClick.write((Object) list, "searchHistory");
        LinearLayout linearLayout = this.suggestionContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("suggestionContainer");
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.historyContainer;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("historyContainer");
        }
        linearLayout2.setVisibility(0);
        MediaBrowserCompat$ItemReceiver(list);
    }

    @OnClick
    public final void onButtonClearClick() {
        EditText editText = this.etSearch;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText.setText("");
    }

    public final void onDestroy() {
        super.onDestroy();
        setFormat setformat = this.presenter;
        if (setformat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setformat.onDestroy();
    }

    public final void read() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^(?=\\S)[a-zA-Z0-9.,&\\- ']+$"));
        EditText editText = this.etSearch;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        Object[] array = arrayList.toArray(new InputFilter[0]);
        if (array != null) {
            editText.setFilters((InputFilter[]) array);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final class write {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String RatingCompat;
        public final String read;
        public final String write;

        private write() {
        }

        public write(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            onGetStartedClick.write((Object) str, "merchantId");
            onGetStartedClick.write((Object) str2, "nameTH");
            onGetStartedClick.write((Object) str4, "citizenId");
            onGetStartedClick.write((Object) str6, "category");
            onGetStartedClick.write((Object) str7, "subCategory");
            onGetStartedClick.write((Object) str9, "registrationChannel");
            this.write = str;
            this.MediaMetadataCompat = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.IconCompatParcelizer = str4;
            this.MediaBrowserCompat$SearchResultReceiver = str5;
            this.MediaBrowserCompat$ItemReceiver = str6;
            this.MediaBrowserCompat$MediaItem = str7;
            this.read = str8;
            this.RatingCompat = str9;
            this.MediaDescriptionCompat = str10;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<String> list) {
        onGetStartedClick.write((Object) list, "searchHistory");
        onGetStartedClick.write((Object) list, "<set-?>");
        ((C7224ld) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()).write.MediaBrowserCompat$ItemReceiver(C7198kW.read[0], list);
    }

    public final void write(C5111open open, int i) {
        onGetStartedClick.write((Object) open, "categoryList");
        ((C7199kX) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).clear();
        ((C7199kX) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).add(getString(R.string.ccr_search_all_category));
        C7199kX kXVar = (C7199kX) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
        List<PersonalizeActivity.IconCompatParcelizer> list = open.read;
        onGetStartedClick.IconCompatParcelizer((Object) list, "categoryList.categories");
        Iterable<PersonalizeActivity.IconCompatParcelizer> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (PersonalizeActivity.IconCompatParcelizer iconCompatParcelizer : iterable) {
            onGetStartedClick.IconCompatParcelizer((Object) iconCompatParcelizer, "it");
            arrayList.add(iconCompatParcelizer.read);
        }
        kXVar.addAll((List) arrayList);
        if (i >= 0) {
            Spinner spinner2 = this.spinner;
            if (spinner2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinner");
            }
            spinner2.setSelection(i + 1);
        }
    }
}
