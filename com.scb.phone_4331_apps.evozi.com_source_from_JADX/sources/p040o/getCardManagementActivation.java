package p040o;

import android.app.Activity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.getCardManagementActivation */
public final class getCardManagementActivation extends onActivityCreated implements ViewPager.MediaMetadataCompat {
    public double IconCompatParcelizer;
    public List<IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver;
    public SparseArray<AmountEditText> MediaBrowserCompat$ItemReceiver = new SparseArray<>(3);
    private final getCardManagementActivation$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final C7110xdd0518ac MediaBrowserCompat$SearchResultReceiver;
    private SparseArray<TextInputLayout> RatingCompat = new SparseArray<>(3);
    private final Activity read;
    public int write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public getCardManagementActivation(Activity activity, List<IconCompatParcelizer> list, getCardManagementActivation$MediaBrowserCompat$ItemReceiver getcardmanagementactivation_mediabrowsercompat_itemreceiver, C7110xdd0518ac getcardmanagementactivation_mediabrowsercompat_customactionresultreceiver) {
        this.read = activity;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.MediaBrowserCompat$MediaItem = getcardmanagementactivation_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$SearchResultReceiver = getcardmanagementactivation_mediabrowsercompat_customactionresultreceiver;
        this.write = 0;
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get(i).write;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.size();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.get(i2);
        View inflate = LayoutInflater.from(this.read).inflate(R.layout.f92252131494452, viewGroup2, false);
        viewGroup2.addView(inflate);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.text_error_input_layout);
        AmountEditText amountEditText = (AmountEditText) inflate.findViewById(R.id.edit_amount);
        View view = inflate;
        FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = r5;
        FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment2 = new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText, textInputLayout, 9.9999999999E8d, 0.0d, this.read.getResources().getString(R.string.error_limit), this.read.getResources().getString(R.string.not_enough_funds_on_selected_account), this.read.getResources().getString(R.string.zero_amount_error));
        amountEditText.setCurrencyFormattingTextWatcher(fragmentBuilder_BindEasycashContactInformationFragment);
        amountEditText.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
        amountEditText.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                if (getCardManagementActivation.this.MediaBrowserCompat$SearchResultReceiver != null) {
                    double unused = getCardManagementActivation.this.IconCompatParcelizer = d;
                    getCardManagementActivation.this.MediaBrowserCompat$SearchResultReceiver.write(d);
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                if (getCardManagementActivation.this.MediaBrowserCompat$SearchResultReceiver != null) {
                    getCardManagementActivation.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
                }
            }
        });
        amountEditText.setHandleDismissKeyboard(new getBusinessOwnerApplicationLatest(this.MediaBrowserCompat$MediaItem));
        amountEditText.setOnFocusChangeListener(new getBankingAgentsTransactions(textInputLayout, amountEditText));
        amountEditText.setFormattedAmount(String.valueOf(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver));
        amountEditText.setEnabled(iconCompatParcelizer.IconCompatParcelizer);
        this.MediaBrowserCompat$ItemReceiver.put(i2, amountEditText);
        this.RatingCompat.put(i2, textInputLayout);
        return view;
    }

    static /* synthetic */ void IconCompatParcelizer(TextInputLayout textInputLayout, AmountEditText amountEditText, boolean z) {
        if (z) {
            if (textInputLayout != null) {
                textInputLayout.setHintEnabled(false);
            }
            amountEditText.setHint("");
        } else if (getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(amountEditText.getText().toString())) {
            amountEditText.setText("");
        }
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final void onPageSelected(int i) {
        this.write = i;
        MediaBrowserCompat$ItemReceiver(i);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            String obj = this.MediaBrowserCompat$ItemReceiver.get(i).getText().toString();
            double d = 0.0d;
            if (!obj.isEmpty()) {
                d = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(obj).doubleValue();
            }
            this.IconCompatParcelizer = d;
            this.MediaBrowserCompat$SearchResultReceiver.write(d);
        }
    }

    public final IconCompatParcelizer write() {
        List<IconCompatParcelizer> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (list == null || list.isEmpty()) ? new IconCompatParcelizer() : this.MediaBrowserCompat$CustomActionResultReceiver.get(this.write);
    }

    /* renamed from: o.getCardManagementActivation$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        boolean IconCompatParcelizer = false;
        String MediaBrowserCompat$CustomActionResultReceiver = "0.0";
        public String read = "";
        String write = "";

        IconCompatParcelizer() {
        }
    }

    public static List<IconCompatParcelizer> IconCompatParcelizer(Activity activity, String str, String str2) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        iconCompatParcelizer.write = activity.getString(R.string.loan_label_amount_full);
        iconCompatParcelizer.IconCompatParcelizer = false;
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = str;
        iconCompatParcelizer.read = "full";
        IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer();
        iconCompatParcelizer2.write = activity.getString(R.string.loan_label_amount_partial);
        iconCompatParcelizer2.IconCompatParcelizer = true;
        iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = "0.00";
        iconCompatParcelizer2.read = "partial";
        IconCompatParcelizer iconCompatParcelizer3 = new IconCompatParcelizer();
        iconCompatParcelizer3.write = activity.getString(R.string.loan_label_amount_pay_off);
        iconCompatParcelizer3.IconCompatParcelizer = false;
        iconCompatParcelizer3.MediaBrowserCompat$CustomActionResultReceiver = str2;
        iconCompatParcelizer3.read = "pay off";
        return Arrays.asList(new IconCompatParcelizer[]{iconCompatParcelizer, iconCompatParcelizer2, iconCompatParcelizer3});
    }
}
