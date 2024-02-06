package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OnboardingSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private OnboardingSuccessFragment write;

    public OnboardingSuccessFragment_ViewBinding(final OnboardingSuccessFragment onboardingSuccessFragment, View view) {
        super(onboardingSuccessFragment, view);
        this.write = onboardingSuccessFragment;
        onboardingSuccessFragment.dateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'dateTextView'", TextView.class);
        onboardingSuccessFragment.nameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_name_input, "field 'nameTextView'", TextView.class);
        onboardingSuccessFragment.nicknameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_nickname, "field 'nicknameTextView'", TextView.class);
        onboardingSuccessFragment.accountNoTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_no_input, "field 'accountNoTextView'", TextView.class);
        onboardingSuccessFragment.emailTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_email_input, "field 'emailTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_save_slip, "field 'saveSlipButton' and method 'clickSaveSlip'");
        onboardingSuccessFragment.saveSlipButton = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_save_slip, "field 'saveSlipButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnboardingSuccessFragment.this.clickSaveSlip();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tv_return_to_account, "field 'returnToAccountTextView' and method 'clickReturnToAccount'");
        onboardingSuccessFragment.returnToAccountTextView = (TextView) onStart.write(IconCompatParcelizer3, R.id.tv_return_to_account, "field 'returnToAccountTextView'", TextView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnboardingSuccessFragment.this.clickReturnToAccount();
            }
        });
    }

    public final void read() {
        OnboardingSuccessFragment onboardingSuccessFragment = this.write;
        if (onboardingSuccessFragment != null) {
            this.write = null;
            onboardingSuccessFragment.dateTextView = null;
            onboardingSuccessFragment.nameTextView = null;
            onboardingSuccessFragment.nicknameTextView = null;
            onboardingSuccessFragment.accountNoTextView = null;
            onboardingSuccessFragment.emailTextView = null;
            onboardingSuccessFragment.saveSlipButton = null;
            onboardingSuccessFragment.returnToAccountTextView = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
