package com.thunderhead.trackoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import java.util.ArrayList;
import p040o.C1188xc0532a8d;
import p040o.C6554xc460715d;
import p040o.C6555xdccae8ee;
import p040o.CropDocumentActivity;
import p040o.FragmentBuilder_BindGiftingMoneyTransferInputFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindIpoTabFragment;
import p040o.FragmentBuilder_BindPersonalInformationFragment;
import p040o.Keep;

public class NewDataAttributeActivity extends AppCompatActivity implements View.OnClickListener {
    private CropDocumentActivity IconCompatParcelizer;
    FragmentBuilder_BindPersonalInformationFragment MediaBrowserCompat$ItemReceiver;

    static {
        FragmentBuilder_BindGiftingMoneyTransferInputFragment.MediaBrowserCompat$ItemReceiver(NewDataAttributeActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6554xc460715d.th_activity_new_data_attribute);
        overridePendingTransition(C1188xc0532a8d.th_slide_from_right, C1188xc0532a8d.th_animation_activity_empty);
        Keep B_ = mo11B_();
        if (B_ != null) {
            B_.MediaSessionCompat$QueueItem();
            B_.MediaBrowserCompat$CustomActionResultReceiver(true);
            B_.mo15750x50fd9e4a();
            B_.IconCompatParcelizer(C6555xdccae8ee.th_data_type);
        }
        ArrayList arrayList = new ArrayList(3);
        AttributeData attributeData = new AttributeData();
        attributeData.setId(AttributeData.SYMBOLIC_TYPE);
        attributeData.setName(getString(C6555xdccae8ee.th_global_text));
        attributeData.setType(AttributeData.SYMBOLIC_TYPE);
        arrayList.add(attributeData);
        AttributeData attributeData2 = new AttributeData();
        attributeData2.setId(AttributeData.BOOLEAN_TYPE);
        attributeData2.setName(getString(C6555xdccae8ee.th_global_boolean));
        attributeData2.setType(AttributeData.BOOLEAN_TYPE);
        arrayList.add(attributeData2);
        AttributeData attributeData3 = new AttributeData();
        attributeData3.setId(AttributeData.NUMERIC_TYPE);
        attributeData3.setName(getString(C6555xdccae8ee.th_global_number));
        attributeData3.setType(AttributeData.NUMERIC_TYPE);
        arrayList.add(attributeData3);
        this.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindPersonalInformationFragment(this, true, arrayList, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_new_data_attribute_recycler_attributes);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.MediaBrowserCompat$ItemReceiver);
        if (bundle != null) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(bundle.getString("ATTRIBUTE_SELECT_POSITION", ""));
        }
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(C1188xc0532a8d.th_animation_activity_empty, C1188xc0532a8d.th_slide_to_right);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = this.MediaBrowserCompat$ItemReceiver;
        int i = fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver;
        bundle.putString("ATTRIBUTE_SELECT_POSITION", (i == -1 ? null : fragmentBuilder_BindPersonalInformationFragment.write.get(i)).getId());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z;
        CropDocumentActivity cropDocumentActivity = new CropDocumentActivity(menu, getMenuInflater());
        this.IconCompatParcelizer = cropDocumentActivity;
        FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindPersonalInformationFragment != null) {
            int i = fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver;
            if ((i == -1 ? null : fragmentBuilder_BindPersonalInformationFragment.write.get(i)) != null) {
                z = true;
                cropDocumentActivity.write(z);
                CropDocumentActivity cropDocumentActivity2 = this.IconCompatParcelizer;
                C62734 r0 = new View.OnClickListener() {
                    public final void onClick(View view) {
                        Intent intent = new Intent();
                        FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = NewDataAttributeActivity.this.MediaBrowserCompat$ItemReceiver;
                        int i = fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver;
                        AttributeData attributeData = null;
                        if ((i == -1 ? null : fragmentBuilder_BindPersonalInformationFragment.write.get(i)) != null) {
                            FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment2 = NewDataAttributeActivity.this.MediaBrowserCompat$ItemReceiver;
                            int i2 = fragmentBuilder_BindPersonalInformationFragment2.MediaBrowserCompat$ItemReceiver;
                            if (i2 != -1) {
                                attributeData = fragmentBuilder_BindPersonalInformationFragment2.write.get(i2);
                            }
                            intent.putExtra("SELECT_TYPE", attributeData.getType());
                        }
                        NewDataAttributeActivity.this.setResult(-1, intent);
                        NewDataAttributeActivity.this.finish();
                    }
                };
                cropDocumentActivity2.MediaBrowserCompat$ItemReceiver.add(r0);
                new FragmentBuilder_BindIpoTabFragment(r0) {
                    private /* synthetic */ View.OnClickListener write;

                    {
                        this.write = r2;
                    }

                    public final void MediaBrowserCompat$ItemReceiver() {
                        CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.remove(CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.lastIndexOf(this.write));
                    }
                };
                return true;
            }
        }
        z = false;
        cropDocumentActivity.write(z);
        CropDocumentActivity cropDocumentActivity22 = this.IconCompatParcelizer;
        C62734 r02 = new View.OnClickListener() {
            public final void onClick(View view) {
                Intent intent = new Intent();
                FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = NewDataAttributeActivity.this.MediaBrowserCompat$ItemReceiver;
                int i = fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver;
                AttributeData attributeData = null;
                if ((i == -1 ? null : fragmentBuilder_BindPersonalInformationFragment.write.get(i)) != null) {
                    FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment2 = NewDataAttributeActivity.this.MediaBrowserCompat$ItemReceiver;
                    int i2 = fragmentBuilder_BindPersonalInformationFragment2.MediaBrowserCompat$ItemReceiver;
                    if (i2 != -1) {
                        attributeData = fragmentBuilder_BindPersonalInformationFragment2.write.get(i2);
                    }
                    intent.putExtra("SELECT_TYPE", attributeData.getType());
                }
                NewDataAttributeActivity.this.setResult(-1, intent);
                NewDataAttributeActivity.this.finish();
            }
        };
        cropDocumentActivity22.MediaBrowserCompat$ItemReceiver.add(r02);
        new FragmentBuilder_BindIpoTabFragment(r02) {
            private /* synthetic */ View.OnClickListener write;

            {
                this.write = r2;
            }

            public final void MediaBrowserCompat$ItemReceiver() {
                CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.remove(CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.lastIndexOf(this.write));
            }
        };
        return true;
    }

    public void onClick(View view) {
        CropDocumentActivity cropDocumentActivity = this.IconCompatParcelizer;
        FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = this.MediaBrowserCompat$ItemReceiver;
        int i = fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver;
        cropDocumentActivity.write((i == -1 ? null : fragmentBuilder_BindPersonalInformationFragment.write.get(i)) != null);
    }
}
