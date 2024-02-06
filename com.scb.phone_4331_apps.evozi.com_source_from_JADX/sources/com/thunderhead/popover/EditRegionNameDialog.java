package com.thunderhead.popover;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.NetworkOperationError;
import java.lang.ref.WeakReference;
import p040o.AlertController$RecycleListView;
import p040o.AmortizationMerchantsActivity;
import p040o.C6554xc460715d;
import p040o.C6555xdccae8ee;
import p040o.C6556x769516c8;
import p040o.FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment;
import p040o.FragmentBuilder_BindHmlDocumentUploadGuidelineFragment;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment;
import p040o.FragmentBuilder_BindPromptPayQRSuccessFragment;
import p040o.onAccountSummaryClick$MediaBrowserCompat$ItemReceiver;

public class EditRegionNameDialog extends DialogFragment implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener {
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private EditText MediaBrowserCompat$ItemReceiver;
    private String read;
    private String write;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.IconCompatParcelizer = arguments.getString("original_name");
        this.write = arguments.getString("interaction_id");
        this.MediaBrowserCompat$CustomActionResultReceiver = arguments.getString("interaction_path");
        if (bundle != null) {
            this.read = bundle.getString("actual_name");
        }
        String str = this.read;
        if (str == null) {
            str = this.IconCompatParcelizer;
        }
        this.read = str;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("actual_name", this.read);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(AlertController$RecycleListView.MediaDescriptionCompat((Context) getActivity()));
        View inflate = LayoutInflater.from(AlertController$RecycleListView.MediaDescriptionCompat((Context) getActivity())).inflate(C6554xc460715d.th_layout_dialog_alert, (ViewGroup) null);
        ((AppCompatTextView) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.dialog_title)).setText(getString(C6555xdccae8ee.th_rename_interaction));
        inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.dialog_message).setVisibility(8);
        EditText editText = (EditText) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.dialog_edit_text);
        this.MediaBrowserCompat$ItemReceiver = editText;
        editText.setRawInputType(1);
        this.MediaBrowserCompat$ItemReceiver.setImeOptions(6);
        this.MediaBrowserCompat$ItemReceiver.setOnEditorActionListener(this);
        this.MediaBrowserCompat$ItemReceiver.addTextChangedListener(this);
        this.MediaBrowserCompat$ItemReceiver.setText(this.read);
        this.MediaBrowserCompat$ItemReceiver.setVisibility(0);
        this.MediaBrowserCompat$ItemReceiver.setSelection(this.read.length());
        inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_positive).setVisibility(0);
        inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_cancel).setVisibility(0);
        ((AppCompatButton) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_positive)).setText(getString(17039370));
        inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_cancel).setOnClickListener(new C6265x4386bede(this));
        inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_positive).setOnClickListener(new C6265x4386bede(this));
        builder.setView(inflate);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        create.getWindow().setSoftInputMode(5);
        return create;
    }

    public void onResume() {
        super.onResume();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.MediaBrowserCompat$ItemReceiver.getLayoutParams();
        int dimension = (int) getResources().getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_interaction_name_dialog_edit_text_margins);
        marginLayoutParams.leftMargin = dimension;
        marginLayoutParams.rightMargin = dimension;
        marginLayoutParams.topMargin = dimension;
        marginLayoutParams.bottomMargin = dimension;
        this.MediaBrowserCompat$ItemReceiver.setLayoutParams(marginLayoutParams);
        IconCompatParcelizer(this.read);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            String str = this.read;
            if (!(str != null && !str.trim().isEmpty())) {
                if (FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver == null) {
                    FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment();
                }
                FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment = FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver;
                int i2 = C6555xdccae8ee.th_enter_valid_name;
                WeakReference<Activity> weakReference = fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.write;
                if (weakReference == null || weakReference.get() == null) {
                    return true;
                }
                Toast.makeText(fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.write.get(), fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.write.get().getString(i2), 0).show();
                return true;
            }
            if (getActivity() != null) {
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.MediaBrowserCompat$ItemReceiver.getWindowToken(), 2);
            }
            dismissAllowingStateLoss();
            if (true ^ this.IconCompatParcelizer.equals(this.read.trim())) {
                IconCompatParcelizer();
            }
        }
        return false;
    }

    public void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        this.read = obj;
        IconCompatParcelizer(obj);
    }

    private void IconCompatParcelizer() {
        FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem();
        String str = this.write;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = this.read;
        if (FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver == null) {
            FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment();
        }
        C6556x769516c8 MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindHmlDocumentUploadGuidelineFragment() {
            public final void MediaBrowserCompat$ItemReceiver(Object obj) {
            }

            public final void write(int i, String str) {
            }

            public final void read() {
                if (!FragmentBuilder_BindHmlIssuerLandingFragment.ActionBarOverlayLayout()) {
                    FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindPromptPayQRSuccessFragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
        });
        if (!MediaSessionCompat$QueueItem.read.read()) {
            MediaBrowserCompat$CustomActionResultReceiver2.write(2, "");
            MediaSessionCompat$QueueItem.IconCompatParcelizer.IconCompatParcelizer(MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver, 2, (NetworkOperationError) null, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
            return;
        }
        String str4 = MediaSessionCompat$QueueItem.MediaBrowserCompat$SearchResultReceiver;
        if (str4 == null || str4.length() == 0) {
            MediaBrowserCompat$CustomActionResultReceiver2.write(20, "");
            MediaSessionCompat$QueueItem.IconCompatParcelizer.IconCompatParcelizer(MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver, 20, (NetworkOperationError) null, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
            return;
        }
        MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver.editInteractionName(str, str3, str2, new NetworkOperationCallback<InteractionRegionResponse>(MediaBrowserCompat$CustomActionResultReceiver2, str2) {
            private /* synthetic */ FragmentBuilder_BindHmlDocumentUploadGuidelineFragment MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ String write;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                this.write = r3;
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                InteractionRegionResponse interactionRegionResponse = (InteractionRegionResponse) obj;
                if (interactionRegionResponse == null) {
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.IconCompatParcelizer, "Null data in the EditInteractionRegion response");
                    FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindHmlDocumentUploadGuidelineFragment != null) {
                        fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(1, "Can not load interaction context: an empty response received");
                    }
                } else if (interactionRegionResponse.getStatus() == 200) {
                    FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.write.MediaBrowserCompat$CustomActionResultReceiver(this.write, interactionRegionResponse);
                    FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindHmlDocumentUploadGuidelineFragment2 != null) {
                        fragmentBuilder_BindHmlDocumentUploadGuidelineFragment2.read();
                    }
                } else {
                    String message = interactionRegionResponse.getMessage();
                    if (message.isEmpty()) {
                        message = "Unknown error";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't create new interaction: ");
                    sb.append(message);
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.IconCompatParcelizer, sb.toString());
                    FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fragmentBuilder_BindHmlDocumentUploadGuidelineFragment3 != null) {
                        fragmentBuilder_BindHmlDocumentUploadGuidelineFragment3.write(1, message);
                    }
                }
            }

            public final void onFailure(NetworkOperationError networkOperationError) {
                FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.IconCompatParcelizer.read(FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.MediaBrowserCompat$CustomActionResultReceiver, networkOperationError, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        });
    }

    public static EditRegionNameDialog MediaBrowserCompat$CustomActionResultReceiver(AmortizationMerchantsActivity amortizationMerchantsActivity) {
        String str = amortizationMerchantsActivity.IconCompatParcelizer;
        String str2 = amortizationMerchantsActivity.read;
        String str3 = amortizationMerchantsActivity.write;
        Bundle bundle = new Bundle();
        bundle.putString("original_name", str);
        bundle.putString("interaction_id", str2);
        bundle.putString("interaction_path", str3);
        EditRegionNameDialog editRegionNameDialog = new EditRegionNameDialog();
        editRegionNameDialog.setArguments(bundle);
        return editRegionNameDialog;
    }

    private void IconCompatParcelizer(String str) {
        if (!(str != null && !str.trim().isEmpty())) {
            if (getDialog() != null) {
                ((AlertDialog) getDialog()).getButton(-1).setEnabled(false);
            }
        } else if (getDialog() != null) {
            ((AlertDialog) getDialog()).getButton(-1).setEnabled(true);
        }
    }

    public void onClick(View view) {
        if (getActivity() != null) {
            ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.MediaBrowserCompat$ItemReceiver.getWindowToken(), 2);
        }
        if (view.getId() == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_positive && (!this.IconCompatParcelizer.equals(this.read.trim()))) {
            IconCompatParcelizer();
        }
        dismiss();
    }
}
