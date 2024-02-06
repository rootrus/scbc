package com.scb.phone.view.activity.ndid;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.ndid.NdidSelectIdpFragment;
import com.scb.phone.view.fragment.ndid.NdidSelectIdpSuccessFragment;
import java.util.ArrayList;
import java.util.List;

public class NdidSelectIdpActivity extends BaseActivityWithFragment implements NdidSelectIdpFragment.write {
    public static Intent write(Context context, List<String> list) {
        Intent intent = new Intent(context, NdidSelectIdpActivity.class);
        intent.putExtra("com.scb.phone.view.activity.ndid.NdidSelectIdpActivity.EXTRA_IS_PENDING", true);
        if (list != null && !list.isEmpty()) {
            intent.putExtra("com.scb.phone.view.activity.ndid.NdidSelectIdpActivity.EXTRA_REMARK", new ArrayList(list));
        }
        return intent;
    }

    /* access modifiers changed from: protected */
    public NdidSelectIdpSuccessFragment write(List<String> list) {
        return NdidSelectIdpSuccessFragment.write(list);
    }

    /* access modifiers changed from: protected */
    public NdidSelectIdpFragment setContentView() {
        return NdidSelectIdpFragment.IconCompatParcelizer();
    }

    public final String au_() {
        return getString(R.string.ndid_select_idp_title);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        if (!(getSupportFragmentManager().findFragmentById(R.id.container) instanceof NdidSelectIdpSuccessFragment)) {
            super.onBackPressed();
        }
    }

    public final void read(List<String> list) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, write(list)).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        if (!getIntent().getBooleanExtra("com.scb.phone.view.activity.ndid.NdidSelectIdpActivity.EXTRA_IS_PENDING", false)) {
            return setContentView();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (getIntent().hasExtra("com.scb.phone.view.activity.ndid.NdidSelectIdpActivity.EXTRA_REMARK")) {
            arrayList = getIntent().getStringArrayListExtra("com.scb.phone.view.activity.ndid.NdidSelectIdpActivity.EXTRA_REMARK");
        }
        return write(arrayList);
    }
}
