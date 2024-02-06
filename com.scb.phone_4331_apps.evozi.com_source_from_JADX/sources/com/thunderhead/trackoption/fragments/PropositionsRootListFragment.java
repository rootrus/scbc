package com.thunderhead.trackoption.fragments;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.thunderhead.android.infrastructure.p057ui.views.ThunderheadRecyclerView;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import com.thunderhead.android.infrastructure.server.entitys.Proposition;
import com.thunderhead.trackoption.TrackOptionActivity;
import com.thunderhead.utils.SearchEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p040o.C6554xc460715d;
import p040o.C6555xdccae8ee;
import p040o.CardView;
import p040o.CropDocumentActivity;
import p040o.ExportCardStatementActivity;
import p040o.ExportCardStatementActivity_ViewBinding;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindHowToAddFavouriteTopUpFragment;
import p040o.FragmentBuilder_BindPersonalInformationFragment;
import p040o.FragmentBuilder_BindTransferToMeAccountFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SaveSlipBaseActivity;
import p040o.onClickActionNext;

public class PropositionsRootListFragment extends Fragment implements SaveSlipBaseActivity {
    public ExportCardStatementActivity_ViewBinding IconCompatParcelizer;
    public ExportCardStatementActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private write MediaBrowserCompat$SearchResultReceiver;
    private read MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private RadioGroup RatingCompat;
    private int read = 1;
    ViewGroup write;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        setHasOptionsMenu(true);
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new ExportCardStatementActivity_ViewBinding();
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new ExportCardStatementActivity();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C6554xc460715d.th_fragment_top_level_proposition_list, viewGroup, false);
        this.MediaMetadataCompat = inflate;
        this.write = (ViewGroup) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.internal_container);
        read read2 = new read();
        this.MediaDescriptionCompat = read2;
        this.MediaBrowserCompat$MediaItem = read.MediaBrowserCompat$CustomActionResultReceiver(read2, layoutInflater, this.write);
        ExportCardStatementActivity_ViewBinding exportCardStatementActivity_ViewBinding = this.IconCompatParcelizer;
        read read3 = this.MediaDescriptionCompat;
        exportCardStatementActivity_ViewBinding.read = read3;
        read3.MediaBrowserCompat$ItemReceiver = exportCardStatementActivity_ViewBinding;
        exportCardStatementActivity_ViewBinding.read.MediaBrowserCompat$ItemReceiver(exportCardStatementActivity_ViewBinding.IconCompatParcelizer);
        if (exportCardStatementActivity_ViewBinding.IconCompatParcelizer.length == 0) {
            read3.IconCompatParcelizer(false);
        } else {
            read3.IconCompatParcelizer(true);
        }
        write write2 = new write();
        this.MediaBrowserCompat$SearchResultReceiver = write2;
        this.MediaBrowserCompat$ItemReceiver = write.write(write2, layoutInflater, this.write);
        ExportCardStatementActivity exportCardStatementActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        write write3 = this.MediaBrowserCompat$SearchResultReceiver;
        exportCardStatementActivity.MediaBrowserCompat$CustomActionResultReceiver = write3;
        write write4 = exportCardStatementActivity.MediaBrowserCompat$CustomActionResultReceiver;
        AttributeData[] attributeDataArr = exportCardStatementActivity.write;
        List<AttributeData> asList = Arrays.asList(attributeDataArr);
        write4.MediaBrowserCompat$ItemReceiver = asList;
        FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = write4.MediaBrowserCompat$CustomActionResultReceiver;
        fragmentBuilder_BindPersonalInformationFragment.write = asList;
        fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver = -1;
        fragmentBuilder_BindPersonalInformationFragment.IconCompatParcelizer.write();
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        AttributeData attributeData = onClickActionNext.IconCompatParcelizer.read;
        if (attributeData != null) {
            write4.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(attributeData.getId());
        }
        if (attributeDataArr.length == 0) {
            write4.read.setVisibility(8);
        } else {
            write4.read.setVisibility(0);
        }
        if (exportCardStatementActivity.write.length == 0) {
            write3.MediaBrowserCompat$CustomActionResultReceiver(false);
        } else {
            write3.MediaBrowserCompat$CustomActionResultReceiver(true);
        }
        this.RatingCompat = (RadioGroup) this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.segmented_control);
        ((AppCompatRadioButton) this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.manually)).setAllCaps(true);
        ((AppCompatRadioButton) this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.dynamically)).setAllCaps(true);
        return this.MediaMetadataCompat;
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            i = bundle.getInt("ACTIVE_TAB");
        } else {
            if (onClickActionNext.IconCompatParcelizer == null) {
                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
            }
            i = onClickActionNext.IconCompatParcelizer.read != null ? 2 : -1;
        }
        if (i != 2) {
            this.RatingCompat.check(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.manually);
            read(false);
            return;
        }
        this.RatingCompat.check(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.dynamically);
        MediaBrowserCompat$CustomActionResultReceiver(false);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.RatingCompat.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.manually) {
                    PropositionsRootListFragment.this.read(true);
                } else {
                    PropositionsRootListFragment.this.MediaBrowserCompat$CustomActionResultReceiver(true);
                }
            }
        });
        if (this.read == 2) {
            write write2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (bundle != null) {
                write2.IconCompatParcelizer.postDelayed(new Runnable(bundle.getInt("first_position", 0)) {
                    private /* synthetic */ int MediaBrowserCompat$ItemReceiver;

                    {
                        this.MediaBrowserCompat$ItemReceiver = r2;
                    }

                    public final void run() {
                        try {
                            if (this.MediaBrowserCompat$ItemReceiver > 0) {
                                ((LinearLayoutManager) write.this.IconCompatParcelizer.AppCompatActivity).write(this.MediaBrowserCompat$ItemReceiver);
                            }
                        } catch (Exception e) {
                            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                        }
                    }
                }, 200);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("ACTIVE_TAB", this.read);
        bundle.putInt("first_position", ((LinearLayoutManager) this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer.AppCompatActivity).MediaMetadataCompat());
        super.onSaveInstanceState(bundle);
    }

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: package-private */
    public final void read(boolean z) {
        if (!z) {
            this.write.removeAllViews();
            this.write.addView(this.MediaBrowserCompat$MediaItem);
        } else {
            IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, true);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        this.IconCompatParcelizer.IconCompatParcelizer(isResumed());
        this.read = 1;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (!z) {
            this.write.removeAllViews();
            this.write.addView(this.MediaBrowserCompat$ItemReceiver);
        } else {
            IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, false);
        }
        ExportCardStatementActivity_ViewBinding exportCardStatementActivity_ViewBinding = this.IconCompatParcelizer;
        CropDocumentActivity cropDocumentActivity = exportCardStatementActivity_ViewBinding.read.write;
        if (cropDocumentActivity != null) {
            cropDocumentActivity.write(false);
        }
        exportCardStatementActivity_ViewBinding.read.IconCompatParcelizer();
        ExportCardStatementActivity exportCardStatementActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (isResumed()) {
            exportCardStatementActivity.IconCompatParcelizer();
        }
        this.read = 2;
    }

    private void IconCompatParcelizer(View view, boolean z) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        int childCount = this.write.getChildCount();
        ObjectAnimator objectAnimator3 = null;
        final View childAt = childCount > 0 ? this.write.getChildAt(childCount - 1) : null;
        final float x = childAt != null ? childAt.getX() : BitmapDescriptorFactory.HUE_RED;
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.write.addView(view);
        if (z) {
            objectAnimator = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{-(((float) view.getWidth()) + view.getX()), view.getX()});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{(float) this.write.getWidth(), view.getX()});
        }
        if (childAt != null) {
            if (z) {
                objectAnimator2 = ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, new float[]{childAt.getX(), (float) this.write.getWidth()});
            } else {
                objectAnimator2 = ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, new float[]{childAt.getX(), -(((float) childAt.getWidth()) + childAt.getX())});
            }
            objectAnimator3 = objectAnimator2;
            objectAnimator3.addListener(new Animator.AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    PropositionsRootListFragment.this.write.removeView(childAt);
                    childAt.setX(x);
                }
            });
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.setDuration(200);
        AnimatorSet.Builder play = animatorSet.play(objectAnimator);
        if (objectAnimator3 != null) {
            play.with(objectAnimator3);
        }
        animatorSet.start();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        int i = this.read;
        if (i == 1) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (i == 2) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer(CropDocumentActivity cropDocumentActivity) {
        read read2 = this.MediaDescriptionCompat;
        if (read2 != null) {
            read2.write = cropDocumentActivity;
        }
        write write2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (write2 != null) {
            write2.write = cropDocumentActivity;
        }
    }

    public class write implements TextWatcher, SearchEditText.IconCompatParcelizer, View.OnClickListener {
        public ThunderheadRecyclerView IconCompatParcelizer;
        FragmentBuilder_BindPersonalInformationFragment MediaBrowserCompat$CustomActionResultReceiver;
        List<AttributeData> MediaBrowserCompat$ItemReceiver;
        private TextView MediaBrowserCompat$SearchResultReceiver;
        SearchEditText MediaDescriptionCompat;
        private View MediaMetadataCompat;
        private View RatingCompat;
        View read;
        public CropDocumentActivity write;

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        write() {
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            if (z) {
                this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container).setVisibility(0);
                this.MediaBrowserCompat$SearchResultReceiver.setText(C6555xdccae8ee.th_no_results_found);
                return;
            }
            this.MediaBrowserCompat$SearchResultReceiver.setText(PropositionsRootListFragment.this.getString(C6555xdccae8ee.th_dynamic_data_attributes_empty_text));
            this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container).setVisibility(8);
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.toString().length() == 0) {
                this.RatingCompat.setVisibility(8);
            } else {
                this.RatingCompat.setVisibility(0);
            }
            if (charSequence == "" || this.MediaBrowserCompat$ItemReceiver == null) {
                FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
                fragmentBuilder_BindPersonalInformationFragment.write = this.MediaBrowserCompat$ItemReceiver;
                fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver = -1;
                fragmentBuilder_BindPersonalInformationFragment.IconCompatParcelizer.write();
            } else {
                ArrayList arrayList = new ArrayList();
                String lowerCase = charSequence.toString().toLowerCase();
                for (AttributeData next : this.MediaBrowserCompat$ItemReceiver) {
                    if (next.getDisplayName().toLowerCase().contains(lowerCase)) {
                        arrayList.add(next);
                    }
                }
                FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                fragmentBuilder_BindPersonalInformationFragment2.write = arrayList;
                fragmentBuilder_BindPersonalInformationFragment2.MediaBrowserCompat$ItemReceiver = -1;
                fragmentBuilder_BindPersonalInformationFragment2.IconCompatParcelizer.write();
            }
            if (onClickActionNext.IconCompatParcelizer == null) {
                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
            }
            AttributeData attributeData = onClickActionNext.IconCompatParcelizer.read;
            if (attributeData != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(attributeData.getId());
            }
        }

        public final void read(boolean z) {
            if (!z) {
                this.MediaDescriptionCompat.clearFocus();
            }
        }

        public final void onClick(View view) {
            FragmentBuilder_BindPersonalInformationFragment fragmentBuilder_BindPersonalInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = fragmentBuilder_BindPersonalInformationFragment.MediaBrowserCompat$ItemReceiver;
            AttributeData attributeData = i == -1 ? null : fragmentBuilder_BindPersonalInformationFragment.write.get(i);
            if (onClickActionNext.IconCompatParcelizer == null) {
                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
            }
            onClickActionNext.IconCompatParcelizer = new onClickActionNext(attributeData);
            if (attributeData != null) {
                CropDocumentActivity cropDocumentActivity = this.write;
                if (cropDocumentActivity != null) {
                    cropDocumentActivity.write(true);
                    return;
                }
                return;
            }
            CropDocumentActivity cropDocumentActivity2 = this.write;
            if (cropDocumentActivity2 != null) {
                cropDocumentActivity2.write(false);
            }
        }

        static /* synthetic */ View write(write write2, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View inflate = layoutInflater.inflate(C6554xc460715d.th_fragment_propositions_root_list_view_attributes, viewGroup, false);
            write2.MediaMetadataCompat = inflate;
            write2.IconCompatParcelizer = (ThunderheadRecyclerView) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_fragment_propositions_root_list_attribute_recycler);
            View findViewById = write2.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container);
            write2.read = findViewById;
            findViewById.setVisibility(0);
            write2.MediaBrowserCompat$SearchResultReceiver = (TextView) write2.MediaMetadataCompat.findViewById(16908292);
            write2.MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindPersonalInformationFragment(PropositionsRootListFragment.this.getContext(), false, Collections.emptyList(), write2);
            ThunderheadRecyclerView thunderheadRecyclerView = write2.IconCompatParcelizer;
            PropositionsRootListFragment.this.getContext();
            thunderheadRecyclerView.setLayoutManager(new LinearLayoutManager());
            write2.IconCompatParcelizer.setHasFixedSize(true);
            write2.IconCompatParcelizer.setAdapter(write2.MediaBrowserCompat$CustomActionResultReceiver);
            write2.IconCompatParcelizer.setEmptyView(write2.MediaBrowserCompat$SearchResultReceiver);
            SearchEditText searchEditText = (SearchEditText) write2.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_edittext_search_input);
            write2.MediaDescriptionCompat = searchEditText;
            searchEditText.setHint(C6555xdccae8ee.th_search_attributes);
            write2.MediaDescriptionCompat.addTextChangedListener(write2);
            write2.MediaDescriptionCompat.setOnKeyboardListener(write2);
            View findViewById2 = write2.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_text_clear);
            write2.RatingCompat = findViewById2;
            findViewById2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    write.this.MediaDescriptionCompat.setText("");
                }
            });
            return write2.MediaMetadataCompat;
        }
    }

    public class read implements TextWatcher, SearchEditText.IconCompatParcelizer, View.OnClickListener {
        public SearchEditText IconCompatParcelizer;
        FragmentBuilder_BindTransferToMeAccountFragment MediaBrowserCompat$CustomActionResultReceiver;
        ExportCardStatementActivity_ViewBinding MediaBrowserCompat$ItemReceiver;
        private TextView MediaBrowserCompat$MediaItem;
        private View MediaBrowserCompat$SearchResultReceiver;
        private View MediaMetadataCompat;
        public CropDocumentActivity write;

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        read() {
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(Proposition[] propositionArr) {
            FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            fragmentBuilder_BindTransferToMeAccountFragment.MediaBrowserCompat$ItemReceiver = Arrays.asList(propositionArr);
            fragmentBuilder_BindTransferToMeAccountFragment.RatingCompat = -1;
            fragmentBuilder_BindTransferToMeAccountFragment.IconCompatParcelizer.write();
            if (onClickActionNext.IconCompatParcelizer == null) {
                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
            }
            Proposition proposition = onClickActionNext.IconCompatParcelizer.write;
            if (proposition != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(proposition.getId());
            }
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer() {
            View currentFocus = PropositionsRootListFragment.this.getActivity().getCurrentFocus();
            if (currentFocus != null) {
                ((InputMethodManager) PropositionsRootListFragment.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(boolean z) {
            if (z) {
                this.MediaBrowserCompat$MediaItem.setText(C6555xdccae8ee.th_no_results_found);
                this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container).setVisibility(0);
                return;
            }
            this.MediaBrowserCompat$MediaItem.setText(PropositionsRootListFragment.this.getString(C6555xdccae8ee.th_zero_propositions_found));
            this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container).setVisibility(8);
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String charSequence2 = charSequence.toString();
            if (charSequence2.length() == 0) {
                this.MediaBrowserCompat$SearchResultReceiver.setVisibility(8);
            } else {
                this.MediaBrowserCompat$SearchResultReceiver.setVisibility(0);
            }
            ExportCardStatementActivity_ViewBinding exportCardStatementActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
            exportCardStatementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.clear();
            String lowerCase = charSequence2.toLowerCase();
            if (lowerCase.length() == 0) {
                exportCardStatementActivity_ViewBinding.read.MediaBrowserCompat$ItemReceiver(exportCardStatementActivity_ViewBinding.IconCompatParcelizer);
                return;
            }
            for (int i4 = 0; i4 < exportCardStatementActivity_ViewBinding.write.size(); i4++) {
                if (exportCardStatementActivity_ViewBinding.write.get(i4).getName().toLowerCase().contains(lowerCase)) {
                    ArrayList arrayList = null;
                    if (exportCardStatementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.containsKey(exportCardStatementActivity_ViewBinding.write.get(i4).getPath())) {
                        arrayList = exportCardStatementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(exportCardStatementActivity_ViewBinding.write.get(i4).getPath());
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(exportCardStatementActivity_ViewBinding.write.get(i4));
                    exportCardStatementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.put(exportCardStatementActivity_ViewBinding.write.get(i4).getPath(), arrayList);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry<String, ArrayList<Proposition>> key : exportCardStatementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.entrySet()) {
                arrayList3.add(key.getKey());
            }
            Collections.sort(arrayList3, new Comparator<String>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    String str = (String) obj;
                    String str2 = (String) obj2;
                    String[] split = str.split("path_separator");
                    String[] split2 = str2.split("path_separator");
                    if (split.length <= 1 || split2.length <= 1) {
                        if (split.length <= 1 && split2.length <= 1) {
                            return str.compareTo(str2);
                        }
                        if (split.length > 1) {
                            return 1;
                        }
                        return -1;
                    } else if (split[1].length() == split2[1].length()) {
                        return str.compareTo(str2);
                    } else {
                        if (split[1].length() >= split2[1].length()) {
                            return 1;
                        }
                        return -1;
                    }
                }
            });
            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                if (!((String) arrayList3.get(i5)).equals("")) {
                    arrayList2.add(new Proposition(Proposition.SEARCH_GROUP_ID, (String) arrayList3.get(i5)));
                }
                arrayList2.addAll(exportCardStatementActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(arrayList3.get(i5)));
            }
            exportCardStatementActivity_ViewBinding.read.MediaBrowserCompat$ItemReceiver((Proposition[]) arrayList2.toArray(new Proposition[arrayList2.size()]));
        }

        public final void read(boolean z) {
            if (!z) {
                this.IconCompatParcelizer.clearFocus();
            }
        }

        public final void onClick(View view) {
            this.IconCompatParcelizer.setText("");
        }

        static /* synthetic */ View MediaBrowserCompat$CustomActionResultReceiver(read read2, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View inflate = layoutInflater.inflate(C6554xc460715d.th_fragment_proposition_list, viewGroup, false);
            read2.MediaMetadataCompat = inflate;
            inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container).setVisibility(0);
            SearchEditText searchEditText = (SearchEditText) read2.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_edittext_search_input);
            read2.IconCompatParcelizer = searchEditText;
            searchEditText.setHint(C6555xdccae8ee.th_search_propositions);
            read2.IconCompatParcelizer.addTextChangedListener(read2);
            read2.IconCompatParcelizer.setOnKeyboardListener(read2);
            View findViewById = read2.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_text_clear);
            read2.MediaBrowserCompat$SearchResultReceiver = findViewById;
            findViewById.setOnClickListener(read2);
            FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment = new FragmentBuilder_BindTransferToMeAccountFragment(Collections.emptyList());
            read2.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindTransferToMeAccountFragment;
            fragmentBuilder_BindTransferToMeAccountFragment.read.add(new FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Proposition>() {
                public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
                    Proposition proposition = (Proposition) obj;
                    if (onClickActionNext.IconCompatParcelizer == null) {
                        onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                    }
                    onClickActionNext.IconCompatParcelizer = new onClickActionNext((Proposition) null);
                    read.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((String) null);
                    read.this.write.write(false);
                    CardView read = PropositionsRootListFragment.this.getActivity().getSupportFragmentManager().read();
                    PropositionListFragment propositionListFragment = new PropositionListFragment();
                    propositionListFragment.MediaBrowserCompat$CustomActionResultReceiver((Proposition[]) proposition.getChildren().clone());
                    propositionListFragment.IconCompatParcelizer = read.this.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append("propositionListFragment_");
                    sb.append(PropositionsRootListFragment.this.getActivity().getSupportFragmentManager().write());
                    String obj2 = sb.toString();
                    read.write(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_container, propositionListFragment, obj2);
                    read.MediaBrowserCompat$CustomActionResultReceiver(obj2);
                    read.write();
                    PropositionsRootListFragment.this.getActivity().getSupportFragmentManager().IconCompatParcelizer();
                    ((TrackOptionActivity) PropositionsRootListFragment.this.getActivity()).IconCompatParcelizer.add(obj2);
                }
            });
            FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment2 = read2.MediaBrowserCompat$CustomActionResultReceiver;
            fragmentBuilder_BindTransferToMeAccountFragment2.write.add(new View.OnClickListener() {
                public final void onClick(View view) {
                    FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment = read.this.MediaBrowserCompat$CustomActionResultReceiver;
                    int i = fragmentBuilder_BindTransferToMeAccountFragment.RatingCompat;
                    Proposition proposition = i == -1 ? null : fragmentBuilder_BindTransferToMeAccountFragment.MediaBrowserCompat$ItemReceiver.get(i);
                    if (onClickActionNext.IconCompatParcelizer == null) {
                        onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                    }
                    onClickActionNext.IconCompatParcelizer = new onClickActionNext(proposition);
                    read.this.write.write(proposition != null);
                }
            });
            ThunderheadRecyclerView thunderheadRecyclerView = (ThunderheadRecyclerView) read2.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_fragment_propositions_list_body_recycler_propositions);
            thunderheadRecyclerView.setHasFixedSize(true);
            PropositionsRootListFragment.this.getContext();
            thunderheadRecyclerView.setLayoutManager(new LinearLayoutManager());
            thunderheadRecyclerView.setAdapter(read2.MediaBrowserCompat$CustomActionResultReceiver);
            TextView textView = (TextView) read2.MediaMetadataCompat.findViewById(16908292);
            read2.MediaBrowserCompat$MediaItem = textView;
            thunderheadRecyclerView.setEmptyView(textView);
            return read2.MediaMetadataCompat;
        }
    }
}
