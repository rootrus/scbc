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
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.thunderhead.android.infrastructure.p057ui.views.ThunderheadRecyclerView;
import com.thunderhead.android.infrastructure.server.entitys.Proposition;
import com.thunderhead.trackoption.TrackOptionActivity;
import com.thunderhead.utils.SearchEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import p040o.C6554xc460715d;
import p040o.C6555xdccae8ee;
import p040o.CardView;
import p040o.CropDocumentActivity;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindHowToAddFavouriteTopUpFragment;
import p040o.FragmentBuilder_BindTransferToMeAccountFragment;
import p040o.SaveSlipBaseActivity;
import p040o.onClickActionNext;

public class PropositionListFragment extends Fragment implements SaveSlipBaseActivity {
    CropDocumentActivity IconCompatParcelizer;
    LinkedList<Proposition> MediaBrowserCompat$CustomActionResultReceiver = new LinkedList<>();
    Proposition[] MediaBrowserCompat$ItemReceiver;
    SearchEditText MediaBrowserCompat$SearchResultReceiver;
    HashMap<String, ArrayList<Proposition>> MediaDescriptionCompat = new HashMap<>();
    private View RatingCompat;
    FragmentBuilder_BindTransferToMeAccountFragment read;
    View write;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setRetainInstance(true);
        View inflate = LayoutInflater.from(getActivity()).inflate(C6554xc460715d.th_fragment_proposition_list, (ViewGroup) null);
        this.RatingCompat = inflate;
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Proposition[] propositionArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, propositionArr);
        Collections.sort(arrayList, new Comparator<Proposition>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((Proposition) obj).getName().compareTo(((Proposition) obj2).getName());
            }
        });
        this.MediaBrowserCompat$ItemReceiver = (Proposition[]) arrayList.toArray(new Proposition[arrayList.size()]);
    }

    private void MediaBrowserCompat$ItemReceiver(String str, Proposition[] propositionArr) {
        String str2;
        for (Proposition proposition : propositionArr) {
            proposition.setPath(str);
            this.MediaBrowserCompat$CustomActionResultReceiver.add(proposition);
            if (proposition.getChildren().length != 0) {
                if (str.equals("")) {
                    str2 = proposition.getName();
                } else {
                    String[] split = str.split("path_separator");
                    if (split.length == 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" ");
                        sb.append("path_separator");
                        sb.append("/");
                        sb.append("path_separator");
                        sb.append(" ");
                        sb.append(proposition.getName());
                        str2 = sb.toString();
                    } else if (split[1].length() < 10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(split[0]);
                        sb2.append("path_separator");
                        sb2.append(split[1]);
                        sb2.append("/");
                        sb2.append("path_separator");
                        sb2.append(" ");
                        sb2.append(proposition.getName());
                        str2 = sb2.toString();
                    } else {
                        str2 = "";
                    }
                }
                if (!str2.equals("")) {
                    MediaBrowserCompat$ItemReceiver(str2, proposition.getChildren());
                }
            }
        }
    }

    public final void IconCompatParcelizer(CropDocumentActivity cropDocumentActivity) {
        this.IconCompatParcelizer = cropDocumentActivity;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment = new FragmentBuilder_BindTransferToMeAccountFragment(Arrays.asList(this.MediaBrowserCompat$ItemReceiver));
        this.read = fragmentBuilder_BindTransferToMeAccountFragment;
        fragmentBuilder_BindTransferToMeAccountFragment.write.add(new PropositionListFragment$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
        FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment2 = this.read;
        fragmentBuilder_BindTransferToMeAccountFragment2.read.add(new write(this, (byte) 0));
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        Proposition proposition = onClickActionNext.IconCompatParcelizer.write;
        if (proposition != null) {
            this.read.MediaBrowserCompat$ItemReceiver(proposition.getId());
        }
        ThunderheadRecyclerView thunderheadRecyclerView = (ThunderheadRecyclerView) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_fragment_propositions_list_body_recycler_propositions);
        thunderheadRecyclerView.setHasFixedSize(true);
        getContext();
        thunderheadRecyclerView.setLayoutManager(new LinearLayoutManager());
        thunderheadRecyclerView.setAdapter(this.read);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(16908292);
        if (this.MediaBrowserCompat$ItemReceiver.length > 0) {
            this.RatingCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container).setVisibility(0);
            appCompatTextView.setText(C6555xdccae8ee.th_no_results_found);
        }
        thunderheadRecyclerView.setEmptyView(appCompatTextView);
        this.MediaBrowserCompat$CustomActionResultReceiver.clear();
        MediaBrowserCompat$ItemReceiver("", this.MediaBrowserCompat$ItemReceiver);
        this.write = this.RatingCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_text_clear);
        this.MediaBrowserCompat$SearchResultReceiver = (SearchEditText) this.RatingCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_edittext_search_input);
        if (this.MediaBrowserCompat$ItemReceiver.length != 0) {
            this.RatingCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_search_box_container).setVisibility(0);
            this.MediaBrowserCompat$SearchResultReceiver.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i != 3) {
                        return false;
                    }
                    FragmentActivity activity = PropositionListFragment.this.getActivity();
                    InputMethodManager inputMethodManager = activity != null ? (InputMethodManager) activity.getSystemService("input_method") : null;
                    if (!(inputMethodManager == null || PropositionListFragment.this.getView() == null)) {
                        inputMethodManager.hideSoftInputFromWindow(PropositionListFragment.this.getView().getWindowToken(), 0);
                    }
                    return true;
                }
            });
            this.MediaBrowserCompat$SearchResultReceiver.addTextChangedListener(new TextWatcher() {
                public final void afterTextChanged(Editable editable) {
                }

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    PropositionListFragment.this.MediaDescriptionCompat.clear();
                    String lowerCase = charSequence.toString().toLowerCase();
                    if (lowerCase.length() == 0) {
                        FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment = PropositionListFragment.this.read;
                        fragmentBuilder_BindTransferToMeAccountFragment.MediaBrowserCompat$ItemReceiver = Arrays.asList(PropositionListFragment.this.MediaBrowserCompat$ItemReceiver);
                        fragmentBuilder_BindTransferToMeAccountFragment.RatingCompat = -1;
                        fragmentBuilder_BindTransferToMeAccountFragment.IconCompatParcelizer.write();
                    } else {
                        for (int i4 = 0; i4 < PropositionListFragment.this.MediaBrowserCompat$CustomActionResultReceiver.size(); i4++) {
                            if (PropositionListFragment.this.MediaBrowserCompat$CustomActionResultReceiver.get(i4).getName().toLowerCase().contains(lowerCase)) {
                                ArrayList arrayList = null;
                                if (PropositionListFragment.this.MediaDescriptionCompat.containsKey(PropositionListFragment.this.MediaBrowserCompat$CustomActionResultReceiver.get(i4).getPath())) {
                                    arrayList = PropositionListFragment.this.MediaDescriptionCompat.get(PropositionListFragment.this.MediaBrowserCompat$CustomActionResultReceiver.get(i4).getPath());
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(PropositionListFragment.this.MediaBrowserCompat$CustomActionResultReceiver.get(i4));
                                PropositionListFragment.this.MediaDescriptionCompat.put(PropositionListFragment.this.MediaBrowserCompat$CustomActionResultReceiver.get(i4).getPath(), arrayList);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Map.Entry<String, ArrayList<Proposition>> key : PropositionListFragment.this.MediaDescriptionCompat.entrySet()) {
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
                            arrayList2.addAll(PropositionListFragment.this.MediaDescriptionCompat.get(arrayList3.get(i5)));
                        }
                        FragmentBuilder_BindTransferToMeAccountFragment fragmentBuilder_BindTransferToMeAccountFragment2 = PropositionListFragment.this.read;
                        fragmentBuilder_BindTransferToMeAccountFragment2.MediaBrowserCompat$ItemReceiver = arrayList2;
                        fragmentBuilder_BindTransferToMeAccountFragment2.RatingCompat = -1;
                        fragmentBuilder_BindTransferToMeAccountFragment2.IconCompatParcelizer.write();
                    }
                    if (onClickActionNext.IconCompatParcelizer == null) {
                        onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                    }
                    Proposition proposition = onClickActionNext.IconCompatParcelizer.write;
                    if (proposition != null) {
                        PropositionListFragment.this.read.MediaBrowserCompat$ItemReceiver(proposition.getId());
                    }
                    if (lowerCase.length() == 0) {
                        PropositionListFragment.this.write.setVisibility(8);
                    } else {
                        PropositionListFragment.this.write.setVisibility(0);
                    }
                }
            });
            this.MediaBrowserCompat$SearchResultReceiver.setOnKeyboardListener(new SearchEditText.IconCompatParcelizer() {
                public final void read(boolean z) {
                    if (!z) {
                        PropositionListFragment.this.MediaBrowserCompat$SearchResultReceiver.setText("");
                        PropositionListFragment.this.MediaBrowserCompat$SearchResultReceiver.clearFocus();
                    }
                }
            });
            this.write.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    PropositionListFragment.this.MediaBrowserCompat$SearchResultReceiver.setText("");
                }
            });
        }
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

    class write implements FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Proposition> {
        private write() {
        }

        /* synthetic */ write(PropositionListFragment propositionListFragment, byte b) {
            this();
        }

        public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            InputMethodManager inputMethodManager;
            Proposition proposition = (Proposition) obj;
            if (onClickActionNext.IconCompatParcelizer == null) {
                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
            }
            onClickActionNext.IconCompatParcelizer = new onClickActionNext((Proposition) null);
            PropositionListFragment.this.read.MediaBrowserCompat$ItemReceiver((String) null);
            PropositionListFragment.this.IconCompatParcelizer.write(false);
            CardView read = PropositionListFragment.this.getActivity().getSupportFragmentManager().read();
            PropositionListFragment propositionListFragment = new PropositionListFragment();
            propositionListFragment.MediaBrowserCompat$CustomActionResultReceiver((Proposition[]) proposition.getChildren().clone());
            propositionListFragment.IconCompatParcelizer = PropositionListFragment.this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append("propositionListFragment_");
            sb.append(PropositionListFragment.this.getActivity().getSupportFragmentManager().write());
            String obj2 = sb.toString();
            read.write(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_container, propositionListFragment, obj2);
            read.MediaBrowserCompat$CustomActionResultReceiver(obj2);
            read.write();
            PropositionListFragment.this.getActivity().getSupportFragmentManager().IconCompatParcelizer();
            ((TrackOptionActivity) PropositionListFragment.this.getActivity()).IconCompatParcelizer.add(obj2);
            PropositionListFragment.this.MediaBrowserCompat$SearchResultReceiver.setText("");
            PropositionListFragment.this.MediaBrowserCompat$SearchResultReceiver.clearFocus();
            View currentFocus = PropositionListFragment.this.getActivity().getCurrentFocus();
            if (currentFocus != null && (inputMethodManager = (InputMethodManager) PropositionListFragment.this.getActivity().getSystemService("input_method")) != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        if (onClickActionNext.IconCompatParcelizer.write != null) {
            for (Proposition id : this.MediaBrowserCompat$ItemReceiver) {
                String id2 = id.getId();
                if (onClickActionNext.IconCompatParcelizer == null) {
                    onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                }
                if (id2.equals(onClickActionNext.IconCompatParcelizer.write.getId())) {
                    this.IconCompatParcelizer.write(true);
                    return;
                }
            }
        }
    }
}
