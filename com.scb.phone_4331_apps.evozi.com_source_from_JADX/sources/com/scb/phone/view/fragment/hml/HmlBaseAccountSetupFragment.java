package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlRepaymentMethodAboutActivity;
import com.scb.phone.view.custom.easycash.CustomTileToggle;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ActivityBuilder_BindDeejungPlansActivity;
import p040o.FieldType;
import p040o.FieldType$DataType$MediaBrowserCompat$ItemReceiver;
import p040o.FieldType.DataType;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SizeDouble;
import p040o.Text;
import p040o.ZSYR2K;
import p040o.getSessionIdFromSessionFile;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public abstract class HmlBaseAccountSetupFragment<T extends FieldType.DataType> extends BaseFragment implements SizeDouble {
    @BindView
    public FrameLayout emailSeparator;
    @BindView
    public TextView estatementEmail;
    @BindView
    public TextView estatementEmailDisclaimer;
    @BindView
    public TextView estatementEmailTitle;
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public T presenter;
    @BindView
    public ImageView questionIcon;
    @BindView
    public Spinner receivingAccountSpinner;
    @BindView
    public Spinner repaymentAccountSpinner;
    @BindView
    public TextView repaymentAccountTitle;
    @BindView
    public TextView repaymentDateTextView;
    @BindView
    public TextView repaymentDateTitle;
    @BindView
    public TextView repaymentMethodLabel;
    @BindView
    public CustomTileToggle repaymentMethodToggle;
    @BindView
    public Group repaymentSpinnerGroup;

    public abstract String write();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87752131494002, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.MediaBrowserCompat$ItemReceiver(this);
        T t2 = this.presenter;
        if (t2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t2.IconCompatParcelizer();
        return inflate;
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ HmlBaseAccountSetupFragment write;

        write(HmlBaseAccountSetupFragment hmlBaseAccountSetupFragment) {
            this.write = hmlBaseAccountSetupFragment;
        }

        public final void onClick(View view) {
            T t = this.write.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FieldType.DataType.write.read;
            if (t.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(t.RatingCompat);
            }
        }
    }

    static final class read implements CustomTileToggle.read {
        private /* synthetic */ HmlBaseAccountSetupFragment MediaBrowserCompat$ItemReceiver;

        read(HmlBaseAccountSetupFragment hmlBaseAccountSetupFragment) {
            this.MediaBrowserCompat$ItemReceiver = hmlBaseAccountSetupFragment;
        }

        public final void IconCompatParcelizer(int i, View view) {
            T t = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            boolean z = true;
            boolean z2 = i == 0;
            t.IconCompatParcelizer = z2;
            writeUInt64NoTag.IconCompatParcelizer read = new FieldType.DataType.read(z2);
            if (t.RatingCompat == null) {
                z = false;
            }
            if (z) {
                read.IconCompatParcelizer(t.RatingCompat);
            }
        }
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ HmlBaseAccountSetupFragment write;

        IconCompatParcelizer(HmlBaseAccountSetupFragment hmlBaseAccountSetupFragment) {
            this.write = hmlBaseAccountSetupFragment;
        }

        public final void onClick(View view) {
            T t = this.write.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (t.RatingCompat != null) {
                t.RatingCompat.AlertController$RecycleListView();
            }
            getSessionIdFromSessionFile.read read = t.MediaMetadataCompat;
            if (read == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentAccount");
            }
            String str = read.MediaBrowserCompat$CustomActionResultReceiver;
            if (!t.IconCompatParcelizer) {
                str = null;
            }
            Text text = t.write;
            getSessionIdFromSessionFile.read read2 = t.read;
            if (read2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("receivingAccount");
            }
            text.read(read2.MediaBrowserCompat$CustomActionResultReceiver, str);
            t.write.IconCompatParcelizer(new FieldType$DataType$MediaBrowserCompat$ItemReceiver(t, str));
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        Group group = this.repaymentSpinnerGroup;
        if (group == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentSpinnerGroup");
        }
        group.setVisibility(z ? 0 : 8);
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(List<getSessionIdFromSessionFile.read> list, Spinner spinner) {
        Context context = getContext();
        if (context != null) {
            spinner.setAdapter(new ArrayAdapter(context, R.layout.f84812131493708, list));
        }
        spinner.setOnItemSelectedListener(new HmlBaseAccountSetupFragment$MediaBrowserCompat$ItemReceiver(this, list, spinner));
    }

    public void IconCompatParcelizer() {
        Intent read2 = HmlRepaymentMethodAboutActivity.read(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read2 = setTapText.write(activity, read2).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroyView() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.onDestroy();
        super.onDestroyView();
    }

    public final void write(boolean z) {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
        zsyr2kArr[0] = new ZSYR2K("user_type", write());
        zsyr2kArr[1] = new ZSYR2K("loan_type", z ? "business_owner" : "consumer");
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_account_setup", zsyr2kArr);
        }
    }

    public final void IconCompatParcelizer(getSessionIdFromSessionFile getsessionidfromsessionfile) {
        LinearLayout linearLayout;
        onGetStartedClick.write((Object) getsessionidfromsessionfile, "display");
        List<getSessionIdFromSessionFile.read> list = getsessionidfromsessionfile.MediaBrowserCompat$ItemReceiver;
        Spinner spinner = this.receivingAccountSpinner;
        if (spinner == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("receivingAccountSpinner");
        }
        MediaBrowserCompat$CustomActionResultReceiver(list, spinner);
        List<getSessionIdFromSessionFile.read> list2 = getsessionidfromsessionfile.MediaBrowserCompat$MediaItem;
        Spinner spinner2 = this.repaymentAccountSpinner;
        if (spinner2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentAccountSpinner");
        }
        MediaBrowserCompat$CustomActionResultReceiver(list2, spinner2);
        TextView textView = this.repaymentDateTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentDateTextView");
        }
        textView.setText(getString(R.string.hml_account_setup_repayment_date, getsessionidfromsessionfile.write.IconCompatParcelizer, getsessionidfromsessionfile.write.MediaBrowserCompat$CustomActionResultReceiver));
        ImageView imageView = this.questionIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("questionIcon");
        }
        imageView.setOnClickListener(new write(this));
        if (ActivityBuilder_BindDeejungPlansActivity.write[getsessionidfromsessionfile.MediaBrowserCompat$CustomActionResultReceiver.ordinal()] != 1) {
            CustomTileToggle customTileToggle = this.repaymentMethodToggle;
            if (customTileToggle == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentMethodToggle");
            }
            customTileToggle.read(new read(this));
            CustomTileToggle customTileToggle2 = this.repaymentMethodToggle;
            if (customTileToggle2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentMethodToggle");
            }
            if (getsessionidfromsessionfile.IconCompatParcelizer) {
                CustomTileToggle customTileToggle3 = this.repaymentMethodToggle;
                if (customTileToggle3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentMethodToggle");
                }
                linearLayout = customTileToggle3.leftTile;
            } else {
                CustomTileToggle customTileToggle4 = this.repaymentMethodToggle;
                if (customTileToggle4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentMethodToggle");
                }
                linearLayout = customTileToggle4.rightTile;
            }
            customTileToggle2.write(linearLayout);
        } else {
            CustomTileToggle customTileToggle5 = this.repaymentMethodToggle;
            if (customTileToggle5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentMethodToggle");
            }
            customTileToggle5.setVisibility(8);
            ImageView imageView2 = this.questionIcon;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("questionIcon");
            }
            imageView2.setVisibility(8);
            TextView textView2 = this.repaymentMethodLabel;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentMethodLabel");
            }
            textView2.setText(getString(R.string.hml_business_owner_account_setup_repayment_method_label));
            TextView textView3 = this.repaymentAccountTitle;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentAccountTitle");
            }
            textView3.setText(getString(R.string.hml_business_owner_account_setup_repayment_account_title));
        }
        TextView textView4 = this.estatementEmail;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("estatementEmail");
        }
        textView4.setText(getsessionidfromsessionfile.read);
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setOnClickListener(new IconCompatParcelizer(this));
    }
}
