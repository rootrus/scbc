package com.thunderhead.trackoption;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.thunderhead.android.infrastructure.p057ui.views.ThunderheadRecyclerView;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import com.thunderhead.android.infrastructure.server.responses.DataAttributesListResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.NetworkOperationError;
import com.thunderhead.utils.SearchEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p040o.C1188xc0532a8d;
import p040o.C6554xc460715d;
import p040o.C6555xdccae8ee;
import p040o.CropDocumentActivity;
import p040o.DeejungTransferInstallmentsConfirmationActivity_ViewBinding;
import p040o.FragmentBuilder_BindGiftingMoneyTransferInputFragment;
import p040o.FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment;
import p040o.FragmentBuilder_BindHmlDocumentUploadGuidelineFragment;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindIpoTabFragment;
import p040o.FragmentBuilder_BindPersonalInformationFragment;
import p040o.Keep;
import p040o.onAccountSummaryClick;
import p040o.onAccountSummaryClick$MediaBrowserCompat$ItemReceiver;

public class ListOfDataAttributesActivity extends AppCompatActivity {
    String IconCompatParcelizer;
    List<AttributeData> MediaBrowserCompat$CustomActionResultReceiver;
    FragmentBuilder_BindPersonalInformationFragment MediaBrowserCompat$ItemReceiver;
    View MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public ThunderheadRecyclerView MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    AttributeData MediaMetadataCompat = null;
    private onAccountSummaryClick MediaSessionCompat$QueueItem;
    private View MediaSessionCompat$Token;
    private AppCompatTextView ParcelableVolumeInfo;
    SearchEditText RatingCompat;
    CropDocumentActivity read;
    Button write;

    static {
        FragmentBuilder_BindGiftingMoneyTransferInputFragment.MediaBrowserCompat$ItemReceiver(ListOfDataAttributesActivity.class);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onCreate(Bundle bundle) {
        View view;
        View view2;
        super.onCreate(bundle);
        setContentView(C6554xc460715d.th_activity_list_data_attributes);
        getWindow().setSoftInputMode(32);
        overridePendingTransition(C1188xc0532a8d.th_slide_from_right, C1188xc0532a8d.th_animation_activity_empty);
        Keep B_ = mo11B_();
        if (B_ != null) {
            B_.MediaSessionCompat$QueueItem();
            B_.MediaBrowserCompat$CustomActionResultReceiver(true);
            B_.mo15750x50fd9e4a();
            B_.IconCompatParcelizer(C6555xdccae8ee.th_data_attribute);
        }
        this.MediaDescriptionCompat = getIntent().getStringExtra("ATTRIBUTE_ID");
        this.ParcelableVolumeInfo = (AppCompatTextView) findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_list_data_attributes_textview_no_results);
        ThunderheadRecyclerView thunderheadRecyclerView = (ThunderheadRecyclerView) findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_list_data_attributes_recyclerview_attributes);
        this.MediaBrowserCompat$SearchResultReceiver = thunderheadRecyclerView;
        thunderheadRecyclerView.setEmptyView(this.ParcelableVolumeInfo);
        this.MediaBrowserCompat$SearchResultReceiver.setHasFixedSize(true);
        this.MediaBrowserCompat$SearchResultReceiver.setLayoutManager(new LinearLayoutManager());
        FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = new FragmentBuilder_BindPersonalInformationFragment(this, true, Collections.emptyList(), new C6271xbf567432(this, (byte) 0));
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindPersonalInformationFragment;
        this.MediaBrowserCompat$SearchResultReceiver.setAdapter(fragmentBuilder_BindPersonalInformationFragment);
        Button button = (Button) findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_list_data_attributes_button_create_attribute);
        this.write = button;
        button.setOnClickListener(new ListOfDataAttributesActivity$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
        this.write.setAllCaps(true);
        View findViewById = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container);
        this.MediaSessionCompat$Token = findViewById;
        View findViewById2 = findViewById.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_text_clear);
        this.MediaBrowserCompat$MediaItem = findViewById2;
        findViewById2.setOnClickListener(new write(this, (byte) 0));
        SearchEditText searchEditText = (SearchEditText) this.MediaSessionCompat$Token.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_edittext_search_input);
        this.RatingCompat = searchEditText;
        searchEditText.setHint(getString(C6555xdccae8ee.th_search_attributes));
        this.RatingCompat.setOnEditorActionListener(new IconCompatParcelizer(this, (byte) 0));
        this.RatingCompat.addTextChangedListener(new C6272x8bdb9253(this, (byte) 0));
        this.RatingCompat.setOnKeyboardListener(new read(this, (byte) 0));
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            onAccountSummaryClick onaccountsummaryclick = new onAccountSummaryClick();
            this.MediaSessionCompat$QueueItem = onaccountsummaryclick;
            onaccountsummaryclick.write = true;
            this.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver(this);
            FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem();
            MediaSessionCompat$QueueItem2.MediaBrowserCompat$ItemReceiver.loadDataAttributes(new NetworkOperationCallback<DataAttributesListResponse>() {
                public final /* synthetic */ void onSuccess(Object obj) {
                    ListOfDataAttributesActivity.read(ListOfDataAttributesActivity.this, (DataAttributesListResponse) obj);
                    ListOfDataAttributesActivity.MediaBrowserCompat$ItemReceiver(ListOfDataAttributesActivity.this);
                }

                public final void onFailure(NetworkOperationError networkOperationError) {
                    ListOfDataAttributesActivity.MediaBrowserCompat$ItemReceiver(ListOfDataAttributesActivity.this);
                    new DeejungTransferInstallmentsConfirmationActivity_ViewBinding().MediaBrowserCompat$ItemReceiver(ListOfDataAttributesActivity.this, networkOperationError, new FragmentBuilder_BindHmlDocumentUploadGuidelineFragment() {
                        public final void MediaBrowserCompat$ItemReceiver(Object obj) {
                        }

                        public final void read() {
                        }

                        public final void write(int i, String str) {
                            ListOfDataAttributesActivity.this.write.setVisibility(8);
                        }
                    }, new onAccountSummaryClick$MediaBrowserCompat$ItemReceiver() {
                        public final void MediaBrowserCompat$CustomActionResultReceiver() {
                            ListOfDataAttributesActivity.this.setResult(-1, ListOfDataAttributesActivity.MediaMetadataCompat());
                            ListOfDataAttributesActivity.this.finish();
                        }
                    });
                }
            });
        }
        List<AttributeData> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if ((list == null || list.size() == 0) && (view2 = this.MediaSessionCompat$Token) != null) {
            view2.setVisibility(8);
            return;
        }
        List<AttributeData> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null && list2.size() > 0 && (view = this.MediaSessionCompat$Token) != null) {
            view.setVisibility(0);
        }
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(C1188xc0532a8d.th_animation_activity_empty, C1188xc0532a8d.th_slide_to_right);
    }

    public void onDestroy() {
        super.onDestroy();
        onAccountSummaryClick onaccountsummaryclick = this.MediaSessionCompat$QueueItem;
        if (onaccountsummaryclick != null) {
            onaccountsummaryclick.read();
            this.MediaSessionCompat$QueueItem = null;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(C1188xc0532a8d.th_animation_activity_empty, C1188xc0532a8d.th_slide_to_right);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        CropDocumentActivity cropDocumentActivity = new CropDocumentActivity(menu, getMenuInflater());
        this.read = cropDocumentActivity;
        C62705 r3 = new View.OnClickListener() {
            public final void onClick(View view) {
                ListOfDataAttributesActivity listOfDataAttributesActivity = ListOfDataAttributesActivity.this;
                listOfDataAttributesActivity.setResult(-1, ListOfDataAttributesActivity.MediaBrowserCompat$CustomActionResultReceiver(listOfDataAttributesActivity));
                ListOfDataAttributesActivity.this.finish();
            }
        };
        cropDocumentActivity.MediaBrowserCompat$ItemReceiver.add(r3);
        new FragmentBuilder_BindIpoTabFragment(r3) {
            private /* synthetic */ View.OnClickListener write;

            {
                this.write = r2;
            }

            public final void MediaBrowserCompat$ItemReceiver() {
                CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.remove(CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.lastIndexOf(this.write));
            }
        };
        CropDocumentActivity cropDocumentActivity2 = this.read;
        if (cropDocumentActivity2 != null) {
            cropDocumentActivity2.write(this.MediaMetadataCompat != null);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r4 = -1
            if (r5 != r4) goto L_0x0067
            if (r6 == 0) goto L_0x0067
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r0 = "ATTRIBUTE_ID"
            java.lang.String r1 = "NEW_DATA_ATTRIBUTE_ID"
            r5.putExtra(r0, r1)
            java.lang.String r0 = "SELECT_TYPE"
            java.lang.String r6 = r6.getStringExtra(r0)
            java.lang.String r0 = "ATTRIBUTE_TYPE"
            r5.putExtra(r0, r6)
            java.lang.String r0 = r3.IconCompatParcelizer
            java.lang.String r1 = "CUSTOMER_META_DATA_ID"
            r5.putExtra(r1, r0)
            int r0 = r6.hashCode()
            r1 = -1282431251(0xffffffffb38fa6ed, float:-6.68932E-8)
            r2 = 1
            if (r0 == r1) goto L_0x003f
            r1 = 782694408(0x2ea6f808, float:7.592865E-11)
            if (r0 != r1) goto L_0x0049
            java.lang.String r0 = "BOOLEAN"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0049
            r6 = 0
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "NUMERIC"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0049
            r6 = r2
            goto L_0x004a
        L_0x0049:
            r6 = r4
        L_0x004a:
            java.lang.String r0 = "ATTRIBUTE_NAME"
            if (r6 == 0) goto L_0x005c
            if (r6 == r2) goto L_0x0056
            java.lang.String r6 = "Text"
            r5.putExtra(r0, r6)
            goto L_0x0061
        L_0x0056:
            java.lang.String r6 = "Number"
            r5.putExtra(r0, r6)
            goto L_0x0061
        L_0x005c:
            java.lang.String r6 = "Boolean"
            r5.putExtra(r0, r6)
        L_0x0061:
            r3.setResult(r4, r5)
            r3.finish()
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thunderhead.trackoption.ListOfDataAttributesActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    class IconCompatParcelizer implements TextView.OnEditorActionListener {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(ListOfDataAttributesActivity listOfDataAttributesActivity, byte b) {
            this();
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) ListOfDataAttributesActivity.this.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(ListOfDataAttributesActivity.this.MediaBrowserCompat$SearchResultReceiver.getWindowToken(), 0);
            }
            return true;
        }
    }

    class read implements SearchEditText.IconCompatParcelizer {
        private read() {
        }

        /* synthetic */ read(ListOfDataAttributesActivity listOfDataAttributesActivity, byte b) {
            this();
        }

        public final void read(boolean z) {
            if (!z) {
                ListOfDataAttributesActivity.this.RatingCompat.clearFocus();
            }
        }
    }

    class write implements View.OnClickListener {
        private write() {
        }

        /* synthetic */ write(ListOfDataAttributesActivity listOfDataAttributesActivity, byte b) {
            this();
        }

        public final void onClick(View view) {
            ListOfDataAttributesActivity.this.RatingCompat.setText("");
        }
    }

    static /* synthetic */ void read(ListOfDataAttributesActivity listOfDataAttributesActivity, DataAttributesListResponse dataAttributesListResponse) {
        AttributeData[] attributes = dataAttributesListResponse.getData().getRootAttribute().getAttributes();
        ArrayList arrayList = new ArrayList();
        for (AttributeData attributeData : attributes) {
            if (attributeData.isDynamic() && attributeData.isEnabled() && !attributeData.getName().equals(AttributeData.CONTROL_GROUP) && !attributeData.getName().equals(AttributeData.CUSTOMER_FIRST_INTERACTION) && !attributeData.getName().equals(AttributeData.RECOGNIZED_CUSTOMER)) {
                arrayList.add(attributeData);
            } else if (attributeData.isEnabled() && attributeData.getName().equals(AttributeData.CUSTOMER_KEY)) {
                arrayList.add(attributeData);
            }
        }
        if (arrayList.size() != 0) {
            Collections.sort(arrayList, new Comparator<AttributeData>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((AttributeData) obj).getName().compareTo(((AttributeData) obj2).getName());
                }
            });
            listOfDataAttributesActivity.MediaBrowserCompat$CustomActionResultReceiver = arrayList;
            FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = listOfDataAttributesActivity.MediaBrowserCompat$ItemReceiver;
            fragmentBuilder_BindPersonalInformationFragment.write = arrayList;
            fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver = -1;
            fragmentBuilder_BindPersonalInformationFragment.IconCompatParcelizer.write();
            listOfDataAttributesActivity.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(listOfDataAttributesActivity.MediaDescriptionCompat);
            FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment2 = listOfDataAttributesActivity.MediaBrowserCompat$ItemReceiver;
            int i = fragmentBuilder_BindPersonalInformationFragment2.MediaBrowserCompat$ItemReceiver;
            listOfDataAttributesActivity.MediaMetadataCompat = i == -1 ? null : fragmentBuilder_BindPersonalInformationFragment2.write.get(i);
            listOfDataAttributesActivity.IconCompatParcelizer = dataAttributesListResponse.getData().getId();
            View view = listOfDataAttributesActivity.MediaSessionCompat$Token;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(ListOfDataAttributesActivity listOfDataAttributesActivity) {
        listOfDataAttributesActivity.ParcelableVolumeInfo.setText(C6555xdccae8ee.th_no_results_found);
        onAccountSummaryClick onaccountsummaryclick = listOfDataAttributesActivity.MediaSessionCompat$QueueItem;
        if (onaccountsummaryclick != null && onaccountsummaryclick.MediaBrowserCompat$MediaItem.equals(listOfDataAttributesActivity)) {
            listOfDataAttributesActivity.MediaSessionCompat$QueueItem.read();
            listOfDataAttributesActivity.MediaSessionCompat$QueueItem = null;
        }
    }

    static /* synthetic */ Intent MediaMetadataCompat() {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 17);
        return intent;
    }

    static /* synthetic */ Intent MediaBrowserCompat$CustomActionResultReceiver(ListOfDataAttributesActivity listOfDataAttributesActivity) {
        Intent intent = new Intent();
        AttributeData attributeData = listOfDataAttributesActivity.MediaMetadataCompat;
        if (attributeData != null) {
            intent.putExtra("ATTRIBUTE_ID", attributeData.getId());
            intent.putExtra("ATTRIBUTE_NAME", listOfDataAttributesActivity.MediaMetadataCompat.getDisplayName());
            intent.putExtra("ATTRIBUTE_TYPE", listOfDataAttributesActivity.MediaMetadataCompat.getDataType());
            intent.putExtra("ATTRIBUTE_KEYAPINAME", listOfDataAttributesActivity.MediaMetadataCompat.getKeyApiName());
        }
        return intent;
    }
}
