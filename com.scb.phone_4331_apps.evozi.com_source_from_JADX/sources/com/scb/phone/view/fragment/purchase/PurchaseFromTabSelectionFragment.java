package com.scb.phone.view.fragment.purchase;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import p040o.CrashlyticsReport;
import p040o.EasycashBusinessAndMaritalInfoRepositoryModule;
import p040o.setTitleMarginStart;
import p040o.setUpWithDisplay;

public class PurchaseFromTabSelectionFragment extends BaseFragment {
    private IconCompatParcelizer IconCompatParcelizer;
    public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TabLayout tabLayout;
    @BindView
    ViewPager viewPager;

    public interface IconCompatParcelizer {
        TabLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89132131494140, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("com.scb.phone.EXTRA_PURCHASE_TYPE");
            String[] stringArray = arguments.getStringArray("com.scb.phone.EXTRA_PURCHASE_CARD_SCHEME_ALLOW");
            if (string != null) {
                MediaBrowserCompat$CustomActionResultReceiver(string, stringArray);
            }
        }
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IconCompatParcelizer) {
            this.IconCompatParcelizer = (IconCompatParcelizer) context;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String[] strArr) {
        this.viewPager.setAdapter(MediaBrowserCompat$ItemReceiver(str, strArr));
        if ("DEPOSIT_AND_CREDIT_CARD".equals(str)) {
            this.tabLayout.setVisibility(0);
            this.tabLayout.setupWithViewPager(this.viewPager);
            this.viewPager.setCurrentItem(1);
        } else {
            this.tabLayout.setVisibility(8);
        }
        IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer != null) {
            this.tabLayout.addOnTabSelectedListener(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver());
        }
    }

    private EasycashBusinessAndMaritalInfoRepositoryModule MediaBrowserCompat$ItemReceiver(String str, String[] strArr) {
        setTitleMarginStart supportFragmentManager = getActivity().getSupportFragmentManager();
        ArrayList arrayList = new ArrayList();
        if ("DEPOSIT_AND_CREDIT_CARD".equals(str)) {
            PurchaseDepositFragment MediaBrowserCompat$CustomActionResultReceiver2 = PurchaseDepositFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            setUpWithDisplay setupwithdisplay = new setUpWithDisplay();
            setupwithdisplay.write = getString(R.string.purchase_account_number);
            setupwithdisplay.read = MediaBrowserCompat$CustomActionResultReceiver2;
            arrayList.add(setupwithdisplay);
        }
        PurchaseCreditCardFragment IconCompatParcelizer2 = PurchaseCreditCardFragment.IconCompatParcelizer(strArr, this.MediaBrowserCompat$CustomActionResultReceiver);
        setUpWithDisplay setupwithdisplay2 = new setUpWithDisplay();
        setupwithdisplay2.write = getString(R.string.credit_card);
        setupwithdisplay2.read = IconCompatParcelizer2;
        arrayList.add(setupwithdisplay2);
        return new EasycashBusinessAndMaritalInfoRepositoryModule(supportFragmentManager, arrayList);
    }

    public void onDestroy() {
        TabLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver2;
        super.onDestroy();
        IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer != null && (MediaBrowserCompat$CustomActionResultReceiver2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()) != null) {
            this.tabLayout.IconCompatParcelizer.remove(MediaBrowserCompat$CustomActionResultReceiver2);
        }
    }
}
