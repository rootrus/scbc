package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_SourceOfFundsActivity;
import p040o.C10178z;
import p040o.HmlPinActivity;
import p040o.chain;
import p040o.getCarbonStrip$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getNCBInquiry;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p059me.relex.circleindicator.CircleIndicator;

public final class CardlessCreditCardSelectorFragment extends BaseFragment implements getCarbonStrip$MediaBrowserCompat$CustomActionResultReceiver, getNCBInquiry.write {
    public static final C6192xd0d7758e MediaBrowserCompat$CustomActionResultReceiver = new C6192xd0d7758e((byte) 0);
    getNCBInquiry IconCompatParcelizer;
    public ActivityBuilder_SourceOfFundsActivity RatingCompat;
    @BindView
    public TextView errorDescription;
    @BindView
    public TextView errorTitle;
    @BindView
    public LinearLayout layoutCards;
    @BindView
    public LinearLayout layoutError;
    @BindView
    public LinearLayout layoutNoCard;
    @BindView
    public CircleIndicator mIndicator;
    @BindView
    public ViewPager mViewPager;
    @HmlPinActivity
    public C10178z.C547010 presenter;

    public static final CardlessCreditCardSelectorFragment MediaBrowserCompat$CustomActionResultReceiver(ArrayList<String> arrayList) {
        return C6192xd0d7758e.MediaBrowserCompat$ItemReceiver(arrayList, false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f85982131493825, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        C10178z.C547010 r3 = this.presenter;
        if (r3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        r3.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C10178z.C547010 r3 = this.presenter;
        if (r3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Bundle arguments = getArguments();
        r3.MediaBrowserCompat$CustomActionResultReceiver(arguments != null ? arguments.getStringArrayList("EXTRA_ALLOW_TAGS") : null);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<chain> list) {
        FragmentActivity activity = getActivity();
        if (activity != null && list != null) {
            LinearLayout linearLayout = this.layoutCards;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutCards");
            }
            linearLayout.post(new write(list, activity, this, list));
        }
    }

    static final class write implements Runnable {
        final /* synthetic */ List IconCompatParcelizer;
        final /* synthetic */ CardlessCreditCardSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ List read;
        private /* synthetic */ FragmentActivity write;

        write(List list, FragmentActivity fragmentActivity, CardlessCreditCardSelectorFragment cardlessCreditCardSelectorFragment, List list2) {
            this.IconCompatParcelizer = list;
            this.write = fragmentActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = cardlessCreditCardSelectorFragment;
            this.read = list2;
        }

        public final void run() {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = new getNCBInquiry(this.write, this.read);
            getNCBInquiry getncbinquiry = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            if (getncbinquiry != null) {
                getncbinquiry.read = this.MediaBrowserCompat$CustomActionResultReceiver;
            }
            getNCBInquiry getncbinquiry2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            if (getncbinquiry2 != null) {
                getncbinquiry2.IconCompatParcelizer = CardlessCreditCardSelectorFragment.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            ViewPager viewPager = this.MediaBrowserCompat$CustomActionResultReceiver.mViewPager;
            if (viewPager == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
            }
            viewPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat(this) {
                private /* synthetic */ write MediaBrowserCompat$ItemReceiver;

                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final void onPageSelected(int i) {
                    this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write((chain) this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.get(i), i);
                }
            });
            ViewPager viewPager2 = this.MediaBrowserCompat$CustomActionResultReceiver.mViewPager;
            if (viewPager2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
            }
            viewPager2.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
            ViewPager viewPager3 = this.MediaBrowserCompat$CustomActionResultReceiver.mViewPager;
            if (viewPager3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
            }
            viewPager3.setClipToPadding(false);
            if (this.IconCompatParcelizer.size() == 1) {
                ViewPager viewPager4 = this.MediaBrowserCompat$CustomActionResultReceiver.mViewPager;
                if (viewPager4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
                }
                viewPager4.setPadding(this.MediaBrowserCompat$CustomActionResultReceiver.getResources().getDimensionPixelOffset(R.dimen.f75532131166022), 0, 0, 0);
            } else {
                ViewPager viewPager5 = this.MediaBrowserCompat$CustomActionResultReceiver.mViewPager;
                if (viewPager5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
                }
                viewPager5.setPadding(this.MediaBrowserCompat$CustomActionResultReceiver.getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0, this.MediaBrowserCompat$CustomActionResultReceiver.getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0);
            }
            CircleIndicator circleIndicator = this.MediaBrowserCompat$CustomActionResultReceiver.mIndicator;
            if (circleIndicator == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mIndicator");
            }
            ViewPager viewPager6 = this.MediaBrowserCompat$CustomActionResultReceiver.mViewPager;
            if (viewPager6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
            }
            circleIndicator.setViewPager(viewPager6);
            ViewPager viewPager7 = this.MediaBrowserCompat$CustomActionResultReceiver.mViewPager;
            if (viewPager7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
            }
            viewPager7.setCurrentItem(0);
            ActivityBuilder_SourceOfFundsActivity activityBuilder_SourceOfFundsActivity = this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
            if (activityBuilder_SourceOfFundsActivity != null) {
                activityBuilder_SourceOfFundsActivity.MediaBrowserCompat$CustomActionResultReceiver((chain) this.IconCompatParcelizer.get(0));
            }
            ActivityBuilder_SourceOfFundsActivity activityBuilder_SourceOfFundsActivity2 = this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
            if (activityBuilder_SourceOfFundsActivity2 != null) {
                activityBuilder_SourceOfFundsActivity2.MediaBrowserCompat$ItemReceiver(true);
            }
            if (this.IconCompatParcelizer.size() >= 10) {
                CircleIndicator circleIndicator2 = this.MediaBrowserCompat$CustomActionResultReceiver.mIndicator;
                if (circleIndicator2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mIndicator");
                }
                circleIndicator2.setVisibility(8);
            } else {
                CircleIndicator circleIndicator3 = this.MediaBrowserCompat$CustomActionResultReceiver.mIndicator;
                if (circleIndicator3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mIndicator");
                }
                circleIndicator3.setVisibility(0);
            }
            LinearLayout linearLayout = this.MediaBrowserCompat$CustomActionResultReceiver.layoutCards;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutCards");
            }
            linearLayout.setVisibility(0);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ActivityBuilder_SourceOfFundsActivity activityBuilder_SourceOfFundsActivity = this.RatingCompat;
        if (activityBuilder_SourceOfFundsActivity != null) {
            activityBuilder_SourceOfFundsActivity.MediaBrowserCompat$ItemReceiver(false);
        }
    }

    public final void Keep() {
        super.Keep();
        LinearLayout linearLayout = this.layoutCards;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutCards");
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.layoutNoCard;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutNoCard");
        }
        linearLayout2.setVisibility(8);
        LinearLayout linearLayout3 = this.layoutError;
        if (linearLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutError");
        }
        linearLayout3.setVisibility(8);
    }

    public final void IconCompatParcelizer(chain chain, int i) {
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
        }
        viewPager.setCurrentItem(i, true);
        if (chain != null) {
            write(chain, i);
        }
    }

    public final void IconCompatParcelizer() {
        CircleIndicator circleIndicator = this.mIndicator;
        if (circleIndicator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mIndicator");
        }
        circleIndicator.setVisibility(0);
    }

    public final void read() {
        CircleIndicator circleIndicator = this.mIndicator;
        if (circleIndicator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mIndicator");
        }
        circleIndicator.setVisibility(8);
    }

    public final void write() {
        ActivityBuilder_SourceOfFundsActivity activityBuilder_SourceOfFundsActivity = this.RatingCompat;
        if (activityBuilder_SourceOfFundsActivity != null) {
            activityBuilder_SourceOfFundsActivity.write();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (context instanceof ActivityBuilder_SourceOfFundsActivity) {
            this.RatingCompat = (ActivityBuilder_SourceOfFundsActivity) context;
        } else if (parentFragment instanceof ActivityBuilder_SourceOfFundsActivity) {
            this.RatingCompat = (ActivityBuilder_SourceOfFundsActivity) parentFragment;
        }
    }

    /* access modifiers changed from: private */
    public final void write(chain chain, int i) {
        MediaBrowserCompat$CustomActionResultReceiver(i);
        ActivityBuilder_SourceOfFundsActivity activityBuilder_SourceOfFundsActivity = this.RatingCompat;
        if (activityBuilder_SourceOfFundsActivity != null) {
            activityBuilder_SourceOfFundsActivity.MediaBrowserCompat$CustomActionResultReceiver(chain);
        }
        getNCBInquiry getncbinquiry = this.IconCompatParcelizer;
        if (getncbinquiry != null) {
            getncbinquiry.write = i;
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int[] iArr = {i - 1, i, i + 1};
            if (i == 0) {
                getNCBInquiry getncbinquiry = this.IconCompatParcelizer;
                int dimensionPixelOffset = (getncbinquiry != null ? getncbinquiry.getCount() : 0) != 1 ? activity.getResources().getDimensionPixelOffset(R.dimen.f75512131166020) : 0;
                ViewPager viewPager = this.mViewPager;
                if (viewPager == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
                }
                viewPager.setPadding(activity.getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0, dimensionPixelOffset, 0);
            } else {
                getNCBInquiry getncbinquiry2 = this.IconCompatParcelizer;
                if (getncbinquiry2 != null) {
                    if (i == (getncbinquiry2 != null ? getncbinquiry2.getCount() : 0) - 1) {
                        ViewPager viewPager2 = this.mViewPager;
                        if (viewPager2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
                        }
                        viewPager2.setPadding(activity.getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0, activity.getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0);
                    }
                }
                ViewPager viewPager3 = this.mViewPager;
                if (viewPager3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
                }
                viewPager3.setPadding(activity.getResources().getDimensionPixelOffset(R.dimen.f75502131166019), 0, activity.getResources().getDimensionPixelOffset(R.dimen.f75502131166019), 0);
            }
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                ViewPager viewPager4 = this.mViewPager;
                if (viewPager4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("TAG_ACCOUNT_SOURCE_ADAPTER");
                sb.append(i3);
                View findViewWithTag = viewPager4.findViewWithTag(sb.toString());
                ViewPager viewPager5 = this.mViewPager;
                if (viewPager5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TAG_ACCOUNT_SOURCE_ADAPTER_TEXT");
                sb2.append(i3);
                TextView textView = (TextView) viewPager5.findViewWithTag(sb2.toString());
                if (!(findViewWithTag == null || textView == null)) {
                    if (i == i3) {
                        Context context = activity;
                        findViewWithTag.setBackground(setLastBaselineToBottomHeight.write(context, R.drawable.rounded_purple_view_pager));
                        textView.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
                    } else {
                        Context context2 = activity;
                        findViewWithTag.setBackground(setLastBaselineToBottomHeight.write(context2, MediaBrowserCompat$ItemReceiver()));
                        textView.setTextColor(setLastBaselineToBottomHeight.read(context2, R.color.f66182131099773));
                    }
                }
            }
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C10178z.C547010 r0 = this.presenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        r0.onDestroy();
        this.IconCompatParcelizer = null;
        this.RatingCompat = null;
    }

    public static final /* synthetic */ int read(CardlessCreditCardSelectorFragment cardlessCreditCardSelectorFragment) {
        Bundle arguments = cardlessCreditCardSelectorFragment.getArguments();
        return arguments != null ? arguments.getBoolean("EXTRA_PARENT_TRANSPARENT_BACKGROUND") : false ? R.drawable.bg_white_rounded : R.drawable.bg_white_rounded_with_border;
    }

    private final int MediaBrowserCompat$ItemReceiver() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getBoolean("EXTRA_PARENT_TRANSPARENT_BACKGROUND") : false ? R.drawable.bg_white_rounded : R.drawable.bg_white_rounded_with_border;
    }
}
