package com.thunderhead.trackoption.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.thunderhead.android.infrastructure.p057ui.views.ThunderheadRecyclerView;
import com.thunderhead.android.infrastructure.server.entitys.ActivityTypeItem;
import com.thunderhead.utils.SearchEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p040o.C6554xc460715d;
import p040o.C6555xdccae8ee;
import p040o.CropDocumentActivity;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindPartnerWebViewFragment;
import p040o.SaveSlipBaseActivity;
import p040o.onClickActionNext;

public class ActivityTypesListFragment extends Fragment implements SaveSlipBaseActivity, View.OnClickListener {
    FragmentBuilder_BindPartnerWebViewFragment IconCompatParcelizer;
    private CropDocumentActivity MediaBrowserCompat$CustomActionResultReceiver;
    SearchEditText MediaBrowserCompat$ItemReceiver;
    private View MediaDescriptionCompat;
    View read;
    public ActivityTypeItem[] write;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = true;
        setRetainInstance(true);
        this.MediaDescriptionCompat = LayoutInflater.from(getActivity()).inflate(C6554xc460715d.th_fragment_activity_types_list, (ViewGroup) null);
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        ActivityTypeItem activityTypeItem = onClickActionNext.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        CropDocumentActivity cropDocumentActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (activityTypeItem == null) {
            z = false;
        }
        cropDocumentActivity.write(z);
        return this.MediaDescriptionCompat;
    }

    public final void IconCompatParcelizer(CropDocumentActivity cropDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = cropDocumentActivity;
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.write(onClickActionNext.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver != null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.IconCompatParcelizer = new FragmentBuilder_BindPartnerWebViewFragment(Arrays.asList(this.write), this);
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        ActivityTypeItem activityTypeItem = onClickActionNext.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (activityTypeItem != null) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(activityTypeItem.getId());
        }
        ThunderheadRecyclerView thunderheadRecyclerView = (ThunderheadRecyclerView) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_fragment_activity_types_list_body_recycler_activitytypes);
        thunderheadRecyclerView.setHasFixedSize(true);
        getContext();
        thunderheadRecyclerView.setLayoutManager(new LinearLayoutManager());
        thunderheadRecyclerView.setAdapter(this.IconCompatParcelizer);
        SearchEditText searchEditText = (SearchEditText) this.MediaDescriptionCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_edittext_search_input);
        this.MediaBrowserCompat$ItemReceiver = searchEditText;
        searchEditText.setHint(C6555xdccae8ee.th_search_activities);
        this.read = this.MediaDescriptionCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_text_clear);
        this.MediaBrowserCompat$ItemReceiver.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return false;
                }
                ((InputMethodManager) ActivityTypesListFragment.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(ActivityTypesListFragment.this.getView().getWindowToken(), 0);
                return true;
            }
        });
        this.MediaBrowserCompat$ItemReceiver.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() == 0) {
                    ActivityTypesListFragment.this.read.setVisibility(8);
                } else {
                    ActivityTypesListFragment.this.read.setVisibility(0);
                }
                ArrayList arrayList = new ArrayList();
                if (charSequence == "" || ActivityTypesListFragment.this.write == null) {
                    FragmentBuilder_BindPartnerWebViewFragment fragmentBuilder_BindPartnerWebViewFragment = ActivityTypesListFragment.this.IconCompatParcelizer;
                    fragmentBuilder_BindPartnerWebViewFragment.read = ActivityTypesListFragment.this.write != null ? Arrays.asList(ActivityTypesListFragment.this.write) : Collections.emptyList();
                    fragmentBuilder_BindPartnerWebViewFragment.MediaBrowserCompat$ItemReceiver = -1;
                    fragmentBuilder_BindPartnerWebViewFragment.IconCompatParcelizer.write();
                } else {
                    String lowerCase = charSequence.toString().toLowerCase();
                    for (ActivityTypeItem activityTypeItem : ActivityTypesListFragment.this.write) {
                        if (activityTypeItem.getName().toLowerCase().contains(lowerCase)) {
                            arrayList.add(activityTypeItem);
                        }
                    }
                    FragmentBuilder_BindPartnerWebViewFragment fragmentBuilder_BindPartnerWebViewFragment2 = ActivityTypesListFragment.this.IconCompatParcelizer;
                    fragmentBuilder_BindPartnerWebViewFragment2.read = arrayList;
                    fragmentBuilder_BindPartnerWebViewFragment2.MediaBrowserCompat$ItemReceiver = -1;
                    fragmentBuilder_BindPartnerWebViewFragment2.IconCompatParcelizer.write();
                }
                if (onClickActionNext.IconCompatParcelizer == null) {
                    onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                }
                ActivityTypeItem activityTypeItem2 = onClickActionNext.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                if (activityTypeItem2 != null) {
                    ActivityTypesListFragment.this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(activityTypeItem2.getId());
                }
            }
        });
        this.MediaBrowserCompat$ItemReceiver.setOnKeyboardListener(new SearchEditText.IconCompatParcelizer() {
            public final void read(boolean z) {
                if (!z) {
                    ActivityTypesListFragment.this.MediaBrowserCompat$ItemReceiver.setText("");
                    ActivityTypesListFragment.this.MediaBrowserCompat$ItemReceiver.clearFocus();
                }
            }
        });
        this.read.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ActivityTypesListFragment.this.MediaBrowserCompat$ItemReceiver.setText("");
            }
        });
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(16908292);
        if (this.write.length > 0) {
            this.MediaDescriptionCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container).setVisibility(0);
            appCompatTextView.setText(C6555xdccae8ee.th_no_results_found);
        }
        thunderheadRecyclerView.setEmptyView(appCompatTextView);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            return AnimationUtils.makeInAnimation(getActivity(), false);
        }
        return AnimationUtils.makeOutAnimation(getActivity(), true);
    }

    public void onStart() {
        super.onStart();
        getActivity().getWindow().setSoftInputMode(3);
    }

    public void onClick(View view) {
        FragmentBuilder_BindPartnerWebViewFragment fragmentBuilder_BindPartnerWebViewFragment = this.IconCompatParcelizer;
        int i = fragmentBuilder_BindPartnerWebViewFragment.MediaBrowserCompat$ItemReceiver;
        ActivityTypeItem activityTypeItem = i == -1 ? null : fragmentBuilder_BindPartnerWebViewFragment.read.get(i);
        if (activityTypeItem != null) {
            if (onClickActionNext.IconCompatParcelizer == null) {
                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
            }
            onClickActionNext.IconCompatParcelizer = new onClickActionNext(activityTypeItem);
        }
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.write(onClickActionNext.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver != null);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.write(onClickActionNext.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver != null);
    }
}
