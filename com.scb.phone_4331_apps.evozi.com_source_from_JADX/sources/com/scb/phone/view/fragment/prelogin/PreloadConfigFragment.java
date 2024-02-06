package com.scb.phone.view.fragment.prelogin;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseDialogFragment;
import p040o.C4429fk;
import p040o.FragmentBuilder_BindDividendTabFragment;
import p040o.HmlPinActivity;
import p040o.ImmutableAsList;
import p040o.getBelowMinRearImageSize$MediaBrowserCompat$ItemReceiver;
import p040o.getClsId;
import p040o.skipNulls;

public class PreloadConfigFragment extends BaseDialogFragment implements getBelowMinRearImageSize$MediaBrowserCompat$ItemReceiver {
    @BindView
    EditText deviceId;
    @BindView
    Spinner environmentSpinner;
    @BindView
    EditText phoneNumber;
    @HmlPinActivity
    public C4429fk preloadConfigPresenter;
    @BindView
    CheckBox rootCheckBox;
    @BindView
    CheckBox wireMockCheckBox;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88902131494117, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.preloadConfigPresenter.MediaBrowserCompat$ItemReceiver(this);
        String str = null;
        if (getArguments() != null) {
            str = getArguments().getString("BUNDLE_PHONE_NUMBER", (String) null);
        }
        C4429fk fkVar = this.preloadConfigPresenter;
        fkVar.write = Build.MODEL;
        fkVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        fkVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4429fk.IconCompatParcelizer(str));
        return inflate;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        if (onCreateDialog.getWindow() != null) {
            onCreateDialog.getWindow().requestFeature(1);
        }
        return onCreateDialog;
    }

    public void onResume() {
        Window window = getDialog().getWindow();
        Point point = new Point();
        window.getWindowManager().getDefaultDisplay().getSize(point);
        window.setLayout((int) (((double) point.x) * 0.85d), -2);
        window.setGravity(17);
        super.onResume();
    }

    public final void MediaBrowserCompat$ItemReceiver(getClsId getclsid) {
        if (getContext() != null) {
            if (getclsid.MediaMetadataCompat) {
                this.environmentSpinner.setAdapter(ArrayAdapter.createFromResource(getContext(), R.array.f64642130903043, 17367049));
                this.environmentSpinner.setSelection(getclsid.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                this.environmentSpinner.setVisibility(4);
            }
            this.deviceId.setText(getclsid.MediaBrowserCompat$ItemReceiver);
            this.phoneNumber.setText(getclsid.MediaDescriptionCompat);
        }
    }

    public final void write(getClsId getclsid, boolean z) {
        dismiss();
        if (!(getContext() instanceof Activity)) {
            return;
        }
        if (z) {
            Context context = getContext();
            if (context != null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager != null) {
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.addFlags(67108864);
                            ((AlarmManager) context.getSystemService("alarm")).set(1, System.currentTimeMillis() + 500, PendingIntent.getActivity(context, 223344, launchIntentForPackage, 268435456));
                            new Handler().postDelayed(FragmentBuilder_BindDividendTabFragment.IconCompatParcelizer, 500);
                            return;
                        }
                        Log.e("SCB", "Was not able to restart application, mStartActivity null");
                        return;
                    }
                    Log.e("SCB", "Was not able to restart application, PM null");
                } catch (Exception unused) {
                    Log.e("SCB", "Was not able to restart application");
                }
            } else {
                Log.e("SCB", "Was not able to restart application, Context null");
            }
        } else {
            getContext().sendBroadcast(new Intent("com.scb.phone/BROADCAST_PRELOAD_CONFIG").putExtra("com.scb.phone.EXTRA_CONFIG", getclsid));
        }
    }

    @OnClick
    public void confirmClick() {
        int i;
        if (this.deviceId.getText().toString() == null || this.deviceId.getText().toString().isEmpty()) {
            this.deviceId.setError("Please key-in device id");
            return;
        }
        C4429fk fkVar = this.preloadConfigPresenter;
        String obj = this.deviceId.getText().toString();
        String obj2 = this.phoneNumber.getText().toString();
        int selectedItemPosition = this.environmentSpinner.getSelectedItemPosition();
        boolean isChecked = this.rootCheckBox.isChecked();
        boolean isChecked2 = this.wireMockCheckBox.isChecked();
        fkVar.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.write(false);
        skipNulls skipnulls = fkVar.MediaDescriptionCompat;
        ImmutableAsList.SerializedForm serializedForm = r3;
        int i2 = selectedItemPosition;
        boolean z = isChecked2;
        ImmutableAsList.SerializedForm serializedForm2 = new ImmutableAsList.SerializedForm(obj, fkVar.write, obj2 == null || obj2.length() == 0 ? null : obj2, selectedItemPosition, isChecked, fkVar.IconCompatParcelizer.read(selectedItemPosition), fkVar.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(selectedItemPosition), fkVar.IconCompatParcelizer.IconCompatParcelizer(selectedItemPosition), isChecked2);
        skipnulls.IconCompatParcelizer(serializedForm);
        skipNulls skipnulls2 = fkVar.MediaDescriptionCompat;
        getClsId getclsid = new getClsId();
        if (obj2 == null || obj2.length() == 0) {
            obj2 = null;
        }
        getclsid.MediaDescriptionCompat = obj2;
        getclsid.RatingCompat = isChecked;
        getclsid.MediaBrowserCompat$ItemReceiver = obj;
        getclsid.IconCompatParcelizer = fkVar.write;
        getclsid.read = true;
        int i3 = i2;
        if (i3 == -1) {
            i = fkVar.read;
        } else {
            i = i3;
        }
        getclsid.MediaBrowserCompat$CustomActionResultReceiver = i;
        getclsid.MediaBrowserCompat$SearchResultReceiver = z;
        skipnulls2.IconCompatParcelizer(new C4429fk.read(getclsid));
    }
}
