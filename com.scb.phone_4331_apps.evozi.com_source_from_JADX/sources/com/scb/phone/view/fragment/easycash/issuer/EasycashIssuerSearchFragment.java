package com.scb.phone.view.fragment.easycash.issuer;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.easycash.IssuerSearchAdapter;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import java.util.regex.Pattern;
import p040o.BarCodeDirection;
import p040o.BarCodeDirection$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.FragmentBuilder_BindCardlessWithdrawAmountFragment;
import p040o.HmlPinActivity;
import p040o.convertMemInfoToBytes;
import p040o.getCountryList;
import p040o.getRegistrationsAddresses;
import p040o.postReferralCode;

public class EasycashIssuerSearchFragment extends BaseFragment implements CheckExtractActivity_MembersInjector.ListMenuItemView, FragmentBuilder_BindCardlessWithdrawAmountFragment {
    private IssuerSearchAdapter IconCompatParcelizer;
    public CustomInputDialog MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected Button addButton;
    @BindView
    protected ImageButton clearButton;
    @BindView
    protected LinearLayout emptyContainer;
    @BindView
    protected EditText mSearchEdit;
    @BindView
    protected TextView notFoundInstruction;
    @BindView
    protected TextView notFoundText;
    @BindView
    protected RecyclerView recyclerView;
    @HmlPinActivity
    public BarCodeDirection searchPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f92242131494451, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.searchPresenter.MediaBrowserCompat$ItemReceiver(this);
        BarCodeDirection barCodeDirection = this.searchPresenter;
        if (barCodeDirection.RatingCompat != null) {
            barCodeDirection.RatingCompat.AlertController$RecycleListView();
        }
        barCodeDirection.write.read();
        barCodeDirection.write.IconCompatParcelizer(new BarCodeDirection$MediaBrowserCompat$CustomActionResultReceiver(barCodeDirection, (byte) 0));
        this.mSearchEdit.setText("");
        this.mSearchEdit.setHint(R.string.easycash_issuer_search_hint);
        this.notFoundText.setText(R.string.easycash_issuer_search_no_result_found);
        this.addButton.setText(R.string.easycash_issuer_search_add_dialog_title);
        this.notFoundInstruction.setText(R.string.easycash_issuer_search_add_instruction);
        this.clearButton.setVisibility(8);
        this.mSearchEdit.addTextChangedListener(new IconCompatParcelizer());
        return inflate;
    }

    public final void IconCompatParcelizer(List<convertMemInfoToBytes> list) {
        this.IconCompatParcelizer = new IssuerSearchAdapter(list, this, this.searchPresenter.write.IconCompatParcelizer.setCheckable());
        getContext();
        this.recyclerView.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setAdapter(this.IconCompatParcelizer);
        this.recyclerView.setNestedScrollingEnabled(true);
        this.recyclerView.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.emptyContainer.setVisibility(0);
        this.recyclerView.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        convertMemInfoToBytes convertmeminfotobytes;
        List<convertMemInfoToBytes> list = this.IconCompatParcelizer.read;
        if (list != null) {
            convertmeminfotobytes = list.get(i);
        } else {
            convertmeminfotobytes = null;
        }
        MediaBrowserCompat$ItemReceiver(convertmeminfotobytes);
    }

    public class IconCompatParcelizer implements TextWatcher {
        private C5932x6d7fe24d read;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public IconCompatParcelizer() {
        }

        public final void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 0) {
                EasycashIssuerSearchFragment.this.clearButton.setVisibility(0);
            } else {
                EasycashIssuerSearchFragment.this.clearButton.setVisibility(8);
            }
            C5932x6d7fe24d easycashIssuerSearchFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver = this.read;
            if (easycashIssuerSearchFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver != null) {
                easycashIssuerSearchFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.cancel(true);
            }
            C5932x6d7fe24d easycashIssuerSearchFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver2 = new C5932x6d7fe24d(this, (byte) 0);
            this.read = easycashIssuerSearchFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver2;
            easycashIssuerSearchFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver2.execute(new String[]{editable.toString()});
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(convertMemInfoToBytes convertmeminfotobytes) {
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_RESULT_ISSUER_SEARCH", convertmeminfotobytes);
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onAddButtonClick() {
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
        String string = getString(R.string.easycash_issuer_search_add_dialog_title);
        if (string != null) {
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setText(string);
        }
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        String string2 = getString(R.string.easycash_issuer_search_add_dialog_content);
        if (string2 != null) {
            customInputDialog.mTextTextView.setVisibility(0);
            customInputDialog.mTextTextView.setText(string2);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.setHint(R.string.easycash_issuer_search_add_dialog_hint);
        CustomInputDialog customInputDialog2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog2.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (String.valueOf(EasycashIssuerSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText()).length() < 3 || String.valueOf(EasycashIssuerSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText()).length() > 30) {
                    CustomInputDialog IconCompatParcelizer = EasycashIssuerSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver;
                    String string = EasycashIssuerSearchFragment.this.getString(R.string.easycash_occupation_inline_error_length);
                    IconCompatParcelizer.mErrorTextView.setVisibility(0);
                    IconCompatParcelizer.mErrorTextView.setText(string);
                    EasycashIssuerSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mPositiveButton.setEnabled(false);
                    return;
                }
                if (!Pattern.compile("^(?=\\S)[\\u0E01-\\u0E39\\u0E40-\\u0E4C0-9a-zA-Z ()\\-./]+$").matcher(String.valueOf(EasycashIssuerSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.getText())).matches()) {
                    CustomInputDialog IconCompatParcelizer2 = EasycashIssuerSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver;
                    String string2 = EasycashIssuerSearchFragment.this.getString(R.string.easycash_issuer_input_error_character);
                    IconCompatParcelizer2.mErrorTextView.setVisibility(0);
                    IconCompatParcelizer2.mErrorTextView.setText(string2);
                    EasycashIssuerSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mPositiveButton.setEnabled(false);
                    return;
                }
                EasycashIssuerSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mErrorTextView.setVisibility(8);
                EasycashIssuerSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mPositiveButton.setEnabled(true);
            }
        });
        this.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.setVisibility(0);
        this.MediaBrowserCompat$CustomActionResultReceiver.setCanceledOnTouchOutside(false);
        CustomInputDialog customInputDialog3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog3.write(customInputDialog3.MediaBrowserCompat$ItemReceiver.getString(R.string.cancel), getCountryList.write);
        CustomInputDialog customInputDialog4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String string3 = getString(R.string.ok);
        postReferralCode postreferralcode = new postReferralCode(this);
        if (string3 != null) {
            customInputDialog4.mPositiveButton.setText(string3);
            customInputDialog4.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(customInputDialog4, postreferralcode, false));
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.show();
    }

    @OnClick
    public void onClickClear() {
        this.mSearchEdit.setText("");
    }

    @OnClick
    public void onClickCancel() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
