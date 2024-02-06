package com.scb.phone.view.activity.scheduledtransaction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.scheduledtransaction.CalendarDialogFragment;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;

public class CalendarDialogActivity extends BaseActivity {
    public static Intent IconCompatParcelizer(Context context, int i, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3, OffsetDateTime offsetDateTime4, boolean z, OffsetDateTime offsetDateTime5) {
        if (i == 2 && offsetDateTime3 == null) {
            throw new IllegalStateException("A startIncomingTransaction date must be specified");
        }
        Intent intent = new Intent(context, CalendarDialogActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_MODE", i);
        intent.putExtra("com.scb.phone.EXTRA_DATE", offsetDateTime);
        intent.putExtra("com.scb.phone.EXTRA_SELECT_DATE", offsetDateTime2);
        intent.putExtra("com.scb.phone.EXTRA_STARTDATE", offsetDateTime3);
        intent.putExtra("com.scb.phone.EXTRA_ENDDATE", offsetDateTime4);
        intent.putExtra("com.scb.phone.EXTRA_DISABLED_WEEKENDS", z);
        intent.putExtra("com.scb.phone.EXTRA_CURRENTDATE", offsetDateTime5);
        return intent;
    }

    public static Intent write(Context context, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3, OffsetDateTime offsetDateTime4) {
        return IconCompatParcelizer(context, 2, offsetDateTime, offsetDateTime2, offsetDateTime3, offsetDateTime4, false, (OffsetDateTime) null);
    }

    public static Intent read(Context context, int i, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3, OffsetDateTime offsetDateTime4, OffsetDateTime offsetDateTime5) {
        return IconCompatParcelizer(context, i, offsetDateTime, offsetDateTime2, offsetDateTime3, offsetDateTime4, false, offsetDateTime5);
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76912131492916);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, CalendarDialogFragment.read(getIntent().getIntExtra("com.scb.phone.EXTRA_MODE", 0), (OffsetDateTime) getIntent().getSerializableExtra("com.scb.phone.EXTRA_DATE"), (OffsetDateTime) getIntent().getSerializableExtra("com.scb.phone.EXTRA_SELECT_DATE"), (OffsetDateTime) getIntent().getSerializableExtra("com.scb.phone.EXTRA_STARTDATE"), (OffsetDateTime) getIntent().getSerializableExtra("com.scb.phone.EXTRA_ENDDATE"), getIntent().getBooleanExtra("com.scb.phone.EXTRA_DISABLED_WEEKENDS", false), (OffsetDateTime) getIntent().getSerializableExtra("com.scb.phone.EXTRA_CURRENTDATE"))).write();
    }
}
