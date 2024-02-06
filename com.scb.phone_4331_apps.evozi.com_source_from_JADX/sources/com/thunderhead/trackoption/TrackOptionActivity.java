package com.thunderhead.trackoption;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.thunderhead.android.infrastructure.server.entitys.ActivityTypeItem;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import com.thunderhead.android.infrastructure.server.entitys.Proposition;
import com.thunderhead.android.infrastructure.server.responses.ActivityTypesResponse;
import com.thunderhead.android.infrastructure.server.responses.DataAttributesListResponse;
import com.thunderhead.android.infrastructure.server.responses.PropositionResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.NetworkOperationError;
import com.thunderhead.trackoption.fragments.ActivityTypesListFragment;
import com.thunderhead.trackoption.fragments.PropositionsRootListFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import p040o.AlertController$RecycleListView;
import p040o.C1188xc0532a8d;
import p040o.C6475xbc4f3007;
import p040o.C6476xb675ec54;
import p040o.C6477xa4e60e23;
import p040o.C6554xc460715d;
import p040o.C6555xdccae8ee;
import p040o.CardView;
import p040o.CropDocumentActivity;
import p040o.DeejungPlansActivity_ViewBinding;
import p040o.DeejungTransferInstallmentsConfirmationActivity_ViewBinding;
import p040o.EStatementsSuccessfulActivity;
import p040o.ExportCardStatementActivity;
import p040o.ExportCardStatementActivity_ViewBinding;
import p040o.FragmentBuilder_BindGiftingMoneyTransferInputFragment;
import p040o.FragmentBuilder_BindHmlDocumentUploadGuidelineFragment;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindIpoTabFragment;
import p040o.Keep;
import p040o.SaveSlipBaseActivity;
import p040o.onAboutClick;
import p040o.onAccountSummaryClick;
import p040o.onClickActionNext;

public class TrackOptionActivity extends AppCompatActivity {
    public ArrayList<String> IconCompatParcelizer = new ArrayList<>();
    CardView MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    boolean MediaBrowserCompat$MediaItem = false;
    public boolean MediaBrowserCompat$SearchResultReceiver = false;
    private onAccountSummaryClick MediaDescriptionCompat;
    private boolean MediaMetadataCompat = false;
    IconCompatParcelizer RatingCompat;
    CropDocumentActivity read;
    String write = "";

    static {
        FragmentBuilder_BindGiftingMoneyTransferInputFragment.MediaBrowserCompat$ItemReceiver(TrackOptionActivity.class);
    }

    static class IconCompatParcelizer {
        Proposition[] MediaBrowserCompat$CustomActionResultReceiver;
        AttributeData[] read;

        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6554xc460715d.th_activity_track_option);
        overridePendingTransition(C1188xc0532a8d.th_slide_from_right, C1188xc0532a8d.th_animation_activity_empty);
        Object lastCustomNonConfigurationInstance = getLastCustomNonConfigurationInstance();
        boolean z = false;
        if (lastCustomNonConfigurationInstance != null) {
            this.RatingCompat = (IconCompatParcelizer) lastCustomNonConfigurationInstance;
        } else {
            this.RatingCompat = new IconCompatParcelizer((byte) 0);
        }
        if (bundle != null && bundle.containsKey("FRAGMENT_TAGS")) {
            this.IconCompatParcelizer = bundle.getStringArrayList("FRAGMENT_TAGS");
        }
        Keep B_ = mo11B_();
        if (B_ != null) {
            B_.MediaSessionCompat$QueueItem();
            B_.MediaBrowserCompat$CustomActionResultReceiver(true);
            B_.mo15750x50fd9e4a();
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int i = extras.getInt("activity_request_type_key");
            this.MediaBrowserCompat$ItemReceiver = i;
            if (i == 1) {
                if (bundle == null) {
                    String string = extras.getString("proposition_id");
                    String string2 = extras.getString("proposition_name");
                    String string3 = extras.getString("attribute_id");
                    String string4 = extras.getString("attribute_name");
                    if (!(string == null || string.length() == 0)) {
                        if (!(string2 == null || string2.length() == 0)) {
                            Proposition proposition = new Proposition();
                            proposition.setId(string);
                            proposition.setName(string2);
                            if (onClickActionNext.IconCompatParcelizer == null) {
                                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                            }
                            onClickActionNext.IconCompatParcelizer = new onClickActionNext(proposition);
                        }
                    }
                    if (string4 == null || string4.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        AttributeData attributeData = new AttributeData();
                        attributeData.setName(string4);
                        attributeData.setId(string3);
                        if (onClickActionNext.IconCompatParcelizer == null) {
                            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                        }
                        onClickActionNext.IconCompatParcelizer = new onClickActionNext(attributeData);
                    }
                }
                if (B_ != null) {
                    B_.IconCompatParcelizer(C6555xdccae8ee.th_select_proposition);
                }
            } else if (i == 2) {
                if (bundle == null) {
                    String string5 = extras.getString("activity_id");
                    String string6 = extras.getString("activity_name");
                    if (!(string5 == null || string5.length() == 0)) {
                        if (string6 == null || string6.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            ActivityTypeItem activityTypeItem = new ActivityTypeItem();
                            activityTypeItem.setId(string5);
                            activityTypeItem.setName(string6);
                            if (onClickActionNext.IconCompatParcelizer == null) {
                                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                            }
                            onClickActionNext.IconCompatParcelizer = new onClickActionNext(activityTypeItem);
                        }
                    }
                }
                if (B_ != null) {
                    B_.IconCompatParcelizer(C6555xdccae8ee.th_select_activity);
                }
            }
        }
        if (getSupportFragmentManager().write() != 0) {
            return;
        }
        if (this.MediaBrowserCompat$ItemReceiver == 2) {
            onAccountSummaryClick onaccountsummaryclick = new onAccountSummaryClick();
            this.MediaDescriptionCompat = onaccountsummaryclick;
            onaccountsummaryclick.write = true;
            this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(this);
            FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem().MediaBrowserCompat$ItemReceiver.loadActivityTypes(new NetworkOperationCallback<ActivityTypesResponse>() {
                public final /* synthetic */ void onSuccess(Object obj) {
                    ActivityTypesResponse activityTypesResponse = (ActivityTypesResponse) obj;
                    if (activityTypesResponse != null) {
                        TrackOptionActivity trackOptionActivity = TrackOptionActivity.this;
                        ActivityTypesListFragment activityTypesListFragment = new ActivityTypesListFragment();
                        ArrayList arrayList = new ArrayList(Arrays.asList(activityTypesResponse.getData().getItems()));
                        Collections.sort(arrayList, new Comparator<ActivityTypeItem>() {
                            public final /* synthetic */ int compare(
/*
Method generation error in method: com.thunderhead.trackoption.fragments.ActivityTypesListFragment.1.compare(java.lang.Object, java.lang.Object):int, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.thunderhead.trackoption.fragments.ActivityTypesListFragment.1.compare(java.lang.Object, java.lang.Object):int, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                        activityTypesListFragment.write = (ActivityTypeItem[]) arrayList.toArray(new ActivityTypeItem[arrayList.size()]);
                        CropDocumentActivity cropDocumentActivity = trackOptionActivity.read;
                        if (cropDocumentActivity != null) {
                            activityTypesListFragment.IconCompatParcelizer(cropDocumentActivity);
                        }
                        CardView read = trackOptionActivity.getSupportFragmentManager().read();
                        trackOptionActivity.MediaBrowserCompat$CustomActionResultReceiver = read;
                        trackOptionActivity.write = "activityTypesListFragment";
                        read.write(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_container, activityTypesListFragment, trackOptionActivity.write);
                        trackOptionActivity.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(trackOptionActivity.write);
                        if (!trackOptionActivity.MediaBrowserCompat$SearchResultReceiver) {
                            trackOptionActivity.MediaBrowserCompat$CustomActionResultReceiver.write();
                            trackOptionActivity.getSupportFragmentManager().IconCompatParcelizer();
                            trackOptionActivity.IconCompatParcelizer.add(trackOptionActivity.write);
                        } else {
                            trackOptionActivity.MediaBrowserCompat$MediaItem = true;
                        }
                    }
                    TrackOptionActivity.this.MediaDescriptionCompat();
                }

                public final void onFailure(NetworkOperationError networkOperationError) {
                    TrackOptionActivity.this.MediaDescriptionCompat();
                    new DeejungTransferInstallmentsConfirmationActivity_ViewBinding().MediaBrowserCompat$ItemReceiver(TrackOptionActivity.this, networkOperationError, new FragmentBuilder_BindHmlDocumentUploadGuidelineFragment() {
                        public final void MediaBrowserCompat$ItemReceiver(Object obj) {
                        }

                        public final void read() {
                        }

                        public final void write(int i, String str) {
                        }
                    }, new EStatementsSuccessfulActivity(this));
                }
            });
            return;
        }
        final int[] iArr = new int[2];
        onAccountSummaryClick onaccountsummaryclick2 = new onAccountSummaryClick();
        this.MediaDescriptionCompat = onaccountsummaryclick2;
        onaccountsummaryclick2.write = true;
        this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(this);
        FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem().MediaBrowserCompat$ItemReceiver.loadDataAttributes(new NetworkOperationCallback<DataAttributesListResponse>() {
            public final /* synthetic */ void onSuccess(Object obj) {
                DataAttributesListResponse dataAttributesListResponse = (DataAttributesListResponse) obj;
                if (dataAttributesListResponse != null) {
                    TrackOptionActivity.this.RatingCompat.read = dataAttributesListResponse.getData().getRootAttribute().getAttributes();
                    iArr[0] = 1;
                } else {
                    iArr[0] = 2;
                }
                if (iArr[1] != 0) {
                    TrackOptionActivity.this.MediaDescriptionCompat();
                    int[] iArr = iArr;
                    if (iArr[0] == 1 && iArr[1] == 1) {
                        TrackOptionActivity trackOptionActivity = TrackOptionActivity.this;
                        trackOptionActivity.MediaBrowserCompat$ItemReceiver(trackOptionActivity.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver, TrackOptionActivity.this.RatingCompat.read);
                    }
                }
            }

            public final void onFailure(NetworkOperationError networkOperationError) {
                iArr[0] = 2;
                TrackOptionActivity.this.MediaDescriptionCompat();
                new DeejungTransferInstallmentsConfirmationActivity_ViewBinding().MediaBrowserCompat$ItemReceiver(TrackOptionActivity.this, networkOperationError, new FragmentBuilder_BindHmlDocumentUploadGuidelineFragment() {
                    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
                    }

                    public final void read() {
                    }

                    public final void write(int i, String str) {
                    }
                }, new onAboutClick(this));
            }
        });
        FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem().MediaBrowserCompat$ItemReceiver.loadPropositions(new NetworkOperationCallback<PropositionResponse>() {
            public final /* synthetic */ void onSuccess(Object obj) {
                PropositionResponse propositionResponse = (PropositionResponse) obj;
                if (propositionResponse != null) {
                    TrackOptionActivity.this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver = propositionResponse.getData().getPropositions();
                    iArr[1] = 1;
                } else {
                    iArr[1] = 2;
                }
                if (iArr[0] != 0) {
                    TrackOptionActivity.this.MediaDescriptionCompat();
                    int[] iArr = iArr;
                    if (iArr[0] == 1 && iArr[1] == 1) {
                        TrackOptionActivity trackOptionActivity = TrackOptionActivity.this;
                        trackOptionActivity.MediaBrowserCompat$ItemReceiver(trackOptionActivity.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver, TrackOptionActivity.this.RatingCompat.read);
                    }
                }
            }

            public final void onFailure(NetworkOperationError networkOperationError) {
                TrackOptionActivity.this.MediaDescriptionCompat();
                iArr[0] = 2;
                new DeejungTransferInstallmentsConfirmationActivity_ViewBinding().MediaBrowserCompat$ItemReceiver(TrackOptionActivity.this, networkOperationError, new FragmentBuilder_BindHmlDocumentUploadGuidelineFragment() {
                    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
                    }

                    public final void read() {
                    }

                    public final void write(int i, String str) {
                    }
                }, new DeejungPlansActivity_ViewBinding(this));
            }
        });
    }

    public void onStart() {
        super.onStart();
        this.MediaBrowserCompat$SearchResultReceiver = false;
    }

    /* access modifiers changed from: package-private */
    public final void MediaDescriptionCompat() {
        onAccountSummaryClick onaccountsummaryclick = this.MediaDescriptionCompat;
        if (onaccountsummaryclick != null && onaccountsummaryclick.MediaBrowserCompat$MediaItem.equals(this)) {
            this.MediaDescriptionCompat.read();
            this.MediaDescriptionCompat = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Proposition[] propositionArr, AttributeData[] attributeDataArr) {
        boolean z;
        PropositionsRootListFragment propositionsRootListFragment = new PropositionsRootListFragment();
        this.MediaBrowserCompat$CustomActionResultReceiver = getSupportFragmentManager().read();
        if (propositionsRootListFragment.IconCompatParcelizer == null) {
            propositionsRootListFragment.IconCompatParcelizer = new ExportCardStatementActivity_ViewBinding();
        }
        ExportCardStatementActivity_ViewBinding exportCardStatementActivity_ViewBinding = propositionsRootListFragment.IconCompatParcelizer;
        Arrays.sort(propositionArr, new Comparator<Proposition>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((Proposition) obj).getName().compareTo(((Proposition) obj2).getName());
            }
        });
        exportCardStatementActivity_ViewBinding.IconCompatParcelizer = propositionArr;
        if (propositionsRootListFragment.MediaBrowserCompat$CustomActionResultReceiver == null) {
            propositionsRootListFragment.MediaBrowserCompat$CustomActionResultReceiver = new ExportCardStatementActivity();
        }
        ExportCardStatementActivity exportCardStatementActivity = propositionsRootListFragment.MediaBrowserCompat$CustomActionResultReceiver;
        C6475xbc4f3007.write write2 = new C6475xbc4f3007.write();
        write2.read = true;
        write2.MediaMetadataCompat = false;
        write2.MediaBrowserCompat$SearchResultReceiver = new String[]{AttributeData.BOOLEAN_TYPE, AttributeData.NUMERIC_TYPE};
        write2.write = new String[]{AttributeData.CUSTOMER_KEY, AttributeData.CONTROL_GROUP, AttributeData.CUSTOMER_FIRST_INTERACTION, AttributeData.RECOGNIZED_CUSTOMER};
        write2.IconCompatParcelizer = true;
        write2.MediaBrowserCompat$ItemReceiver = false;
        write2.MediaBrowserCompat$CustomActionResultReceiver = true;
        C6475xbc4f3007 exportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6475xbc4f3007();
        String[] strArr = write2.write;
        if (strArr != null) {
            exportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver.write.add(new C6477xa4e60e23(strArr));
        }
        if (write2.read) {
            exportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver.write.add(new C6475xbc4f3007.IconCompatParcelizer(false));
        }
        String[] strArr2 = write2.MediaBrowserCompat$SearchResultReceiver;
        if (strArr2 != null) {
            exportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver.write.add(new C6476xb675ec54(strArr2));
        }
        if (write2.IconCompatParcelizer) {
            exportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver.write.add(new C6475xbc4f3007.read(false));
        }
        if (write2.MediaBrowserCompat$CustomActionResultReceiver) {
            exportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver.write.add(new C6475xbc4f3007.MediaDescriptionCompat((byte) 0));
        }
        ArrayList arrayList = new ArrayList();
        for (AttributeData attributeData : attributeDataArr) {
            int i = 0;
            while (true) {
                if (i >= exportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver.write.size()) {
                    z = false;
                    break;
                } else if (exportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver.write.get(i).MediaBrowserCompat$CustomActionResultReceiver(attributeData)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                arrayList.add(attributeData);
            }
        }
        AttributeData[] attributeDataArr2 = (AttributeData[]) arrayList.toArray(new AttributeData[arrayList.size()]);
        Arrays.sort(attributeDataArr2, new Comparator<AttributeData>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((AttributeData) obj).getName().compareToIgnoreCase(((AttributeData) obj2).getName());
            }
        });
        exportCardStatementActivity.write = attributeDataArr2;
        StringBuilder sb = new StringBuilder();
        sb.append("propositionListFragment_");
        sb.append(getSupportFragmentManager().write());
        this.write = sb.toString();
        this.MediaBrowserCompat$CustomActionResultReceiver.write(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_container, propositionsRootListFragment, this.write);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write();
            getSupportFragmentManager().IconCompatParcelizer();
            this.IconCompatParcelizer.add(this.write);
            return;
        }
        this.MediaBrowserCompat$MediaItem = true;
    }

    public void onResume() {
        CardView cardView;
        super.onResume();
        if (this.MediaBrowserCompat$MediaItem && (cardView = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            cardView.write();
            getSupportFragmentManager().IconCompatParcelizer();
            this.IconCompatParcelizer.add(this.write);
            this.MediaBrowserCompat$MediaItem = false;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (getSupportFragmentManager().write() == 0) {
            if (onClickActionNext.IconCompatParcelizer == null) {
                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
            }
            onClickActionNext onclickactionnext = onClickActionNext.IconCompatParcelizer;
            onclickactionnext.MediaBrowserCompat$ItemReceiver = null;
            onclickactionnext.write = null;
            onclickactionnext.read = null;
            onClickActionNext.IconCompatParcelizer = null;
            if (!this.MediaMetadataCompat) {
                this.MediaMetadataCompat = true;
                this.IconCompatParcelizer.clear();
                onBackPressed();
            }
        } else if (this.MediaBrowserCompat$ItemReceiver == 1) {
            this.IconCompatParcelizer.remove(getSupportFragmentManager().write());
            MediaMetadataCompat();
        }
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(C1188xc0532a8d.th_animation_activity_empty, C1188xc0532a8d.th_slide_to_right);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        CropDocumentActivity cropDocumentActivity = new CropDocumentActivity(menu, getMenuInflater());
        this.read = cropDocumentActivity;
        C62784 r1 = new View.OnClickListener() {
            public final void onClick(View view) {
                TrackOptionActivity trackOptionActivity = TrackOptionActivity.this;
                Intent intent = new Intent();
                int i = trackOptionActivity.MediaBrowserCompat$ItemReceiver;
                boolean z = true;
                String str = "";
                if (i == 1) {
                    if (onClickActionNext.IconCompatParcelizer == null) {
                        onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                    }
                    if (onClickActionNext.IconCompatParcelizer.read == null) {
                        z = false;
                    }
                    if (z) {
                        if (onClickActionNext.IconCompatParcelizer == null) {
                            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                        }
                        AttributeData attributeData = onClickActionNext.IconCompatParcelizer.read;
                        intent.putExtra("attribute_name", attributeData.getName());
                        intent.putExtra("attribute_id", attributeData.getId());
                    } else {
                        if (onClickActionNext.IconCompatParcelizer == null) {
                            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                        }
                        Proposition proposition = onClickActionNext.IconCompatParcelizer.write;
                        intent.putExtra("proposition_name", proposition != null ? proposition.getName() : str);
                        if (proposition != null) {
                            str = proposition.getId();
                        }
                        intent.putExtra("proposition_id", str);
                    }
                } else if (i == 2) {
                    if (onClickActionNext.IconCompatParcelizer == null) {
                        onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                    }
                    ActivityTypeItem activityTypeItem = onClickActionNext.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                    intent.putExtra("activity_name", activityTypeItem != null ? activityTypeItem.getName() : str);
                    if (activityTypeItem != null) {
                        str = activityTypeItem.getId();
                    }
                    intent.putExtra("activity_id", str);
                }
                intent.putExtra("RESPONSE_CODE", -1);
                trackOptionActivity.setResult(-1, intent);
                if (onClickActionNext.IconCompatParcelizer == null) {
                    onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                }
                onClickActionNext onclickactionnext = onClickActionNext.IconCompatParcelizer;
                onclickactionnext.MediaBrowserCompat$ItemReceiver = null;
                onclickactionnext.write = null;
                onclickactionnext.read = null;
                onClickActionNext.IconCompatParcelizer = null;
                TrackOptionActivity.this.finish();
            }
        };
        cropDocumentActivity.MediaBrowserCompat$ItemReceiver.add(r1);
        new FragmentBuilder_BindIpoTabFragment(r1) {
            private /* synthetic */ View.OnClickListener write;

            {
                this.write = r2;
            }

            public final void MediaBrowserCompat$ItemReceiver() {
                CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.remove(CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.lastIndexOf(this.write));
            }
        };
        if (menu == null || this.IconCompatParcelizer.size() == 0) {
            return true;
        }
        for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(this.IconCompatParcelizer.get(i));
            getSupportFragmentManager().IconCompatParcelizer();
            if (findFragmentByTag != null && (findFragmentByTag instanceof SaveSlipBaseActivity)) {
                ((SaveSlipBaseActivity) findFragmentByTag).IconCompatParcelizer(this.read);
            }
        }
        MediaMetadataCompat();
        return true;
    }

    public void onDestroy() {
        if (!isChangingConfigurations()) {
            if (onClickActionNext.IconCompatParcelizer == null) {
                onClickActionNext.IconCompatParcelizer = new onClickActionNext();
            }
            onClickActionNext onclickactionnext = onClickActionNext.IconCompatParcelizer;
            onclickactionnext.MediaBrowserCompat$ItemReceiver = null;
            onclickactionnext.write = null;
            onclickactionnext.read = null;
            onClickActionNext.IconCompatParcelizer = null;
        }
        super.onDestroy();
        onAccountSummaryClick onaccountsummaryclick = this.MediaDescriptionCompat;
        if (onaccountsummaryclick != null) {
            onaccountsummaryclick.read();
            this.MediaDescriptionCompat = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AlertController$RecycleListView.IconCompatParcelizer((Activity) this);
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public static Intent MediaBrowserCompat$MediaItem() {
        Intent intent = new Intent();
        intent.putExtra("RESPONSE_CODE", 17);
        return intent;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putStringArrayList("FRAGMENT_TAGS", this.IconCompatParcelizer);
        super.onSaveInstanceState(bundle);
        this.MediaBrowserCompat$SearchResultReceiver = true;
    }

    private void MediaMetadataCompat() {
        ArrayList<String> arrayList = this.IconCompatParcelizer;
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(arrayList.get(this.IconCompatParcelizer.size() - 1));
        getSupportFragmentManager().IconCompatParcelizer();
        if (findFragmentByTag != null && (findFragmentByTag instanceof SaveSlipBaseActivity)) {
            SaveSlipBaseActivity saveSlipBaseActivity = (SaveSlipBaseActivity) findFragmentByTag;
            saveSlipBaseActivity.IconCompatParcelizer(this.read);
            saveSlipBaseActivity.MediaBrowserCompat$ItemReceiver();
        }
    }
}
