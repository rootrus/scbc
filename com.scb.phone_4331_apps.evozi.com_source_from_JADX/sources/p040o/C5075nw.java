package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.C4014ae;
import p040o.C4017af;
import p040o.GoogleMap;
import p040o.ImmutableSetMultimap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.nw */
public class C5075nw extends writeUInt64NoTag<getBottomLeftCornerWidth> {
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public final validateModelFilesJni MediaBrowserCompat$MediaItem;
    public final setDelegates MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: package-private */
    public final setUserPropertyInternal MediaDescriptionCompat;
    final delegate MediaMetadataCompat;
    private final setInverse MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public final getInheritableThreadLocalsField ParcelableVolumeInfo;
    public String read;
    public String write;

    @HmlPinActivity
    C5075nw(RegularImmutableBiMap regularImmutableBiMap, validateModelFilesJni validatemodelfilesjni, setInverse setinverse, setUserPropertyInternal setuserpropertyinternal, setDelegates setdelegates, delegate delegate, getInheritableThreadLocalsField getinheritablethreadlocalsfield) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$MediaItem = validatemodelfilesjni;
        this.MediaSessionCompat$ResultReceiverWrapper = setinverse;
        this.MediaDescriptionCompat = setuserpropertyinternal;
        this.MediaBrowserCompat$SearchResultReceiver = setdelegates;
        this.MediaMetadataCompat = delegate;
        this.ParcelableVolumeInfo = getinheritablethreadlocalsfield;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(String str, getBottomLeftCornerWidth getbottomleftcornerwidth) {
        getbottomleftcornerwidth.MediaBrowserCompat$ItemReceiver("B".equalsIgnoreCase(str) || "Z".equalsIgnoreCase(str));
    }

    static /* synthetic */ void IconCompatParcelizer(String str, getBottomLeftCornerWidth getbottomleftcornerwidth) {
        getbottomleftcornerwidth.mo13677k_(str);
        getbottomleftcornerwidth.MediaDescriptionCompat();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(Boolean bool, getBottomLeftCornerWidth getbottomleftcornerwidth) {
        if (bool.booleanValue()) {
            getbottomleftcornerwidth.write();
        } else {
            getbottomleftcornerwidth.MediaBrowserCompat$ItemReceiver();
        }
    }

    static /* synthetic */ void read(C5075nw nwVar) {
        if (nwVar.RatingCompat != null) {
            nwVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(C5075nw nwVar, String str, String str2, PlaceBuffer placeBuffer) {
        C10053mQ mQVar = C10053mQ.MediaBrowserCompat$CustomActionResultReceiver;
        if (nwVar.RatingCompat != null) {
            mQVar.IconCompatParcelizer(nwVar.RatingCompat);
        }
        nwVar.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(str, str2, placeBuffer);
        nwVar.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<getMapToolbarEnabled>() {
            public final /* synthetic */ void onNext(Object obj) {
                getMapToolbarEnabled getmaptoolbarenabled = (getMapToolbarEnabled) obj;
                super.onNext(getmaptoolbarenabled);
                C5075nw nwVar = C5075nw.this;
                C10080nq nqVar = C10080nq.IconCompatParcelizer;
                boolean z = true;
                if (nwVar.RatingCompat != null) {
                    nqVar.IconCompatParcelizer(nwVar.RatingCompat);
                }
                if (getmaptoolbarenabled.MediaBrowserCompat$CustomActionResultReceiver) {
                    C5075nw nwVar2 = C5075nw.this;
                    C10082ns nsVar = C10082ns.write;
                    if (nwVar2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        nsVar.IconCompatParcelizer(nwVar2.RatingCompat);
                    }
                } else if (getmaptoolbarenabled.IconCompatParcelizer) {
                    String MediaBrowserCompat$CustomActionResultReceiver2 = C5075nw.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                    if (MediaBrowserCompat$CustomActionResultReceiver2.equals("B") || MediaBrowserCompat$CustomActionResultReceiver2.equals("Z")) {
                        C5075nw nwVar3 = C5075nw.this;
                        C10079nm nmVar = C10079nm.IconCompatParcelizer;
                        if (nwVar3.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            nmVar.IconCompatParcelizer(nwVar3.RatingCompat);
                            return;
                        }
                        return;
                    }
                    C5075nw nwVar4 = C5075nw.this;
                    C10052mP mPVar = C10052mP.read;
                    if (nwVar4.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        mPVar.IconCompatParcelizer(nwVar4.RatingCompat);
                    }
                } else {
                    C5075nw nwVar5 = C5075nw.this;
                    if (nwVar5.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        nwVar5.RatingCompat.AlertController$RecycleListView();
                    }
                    nwVar5.MediaMetadataCompat.write(new ImmutableSetMultimap.SortedKeyBuilderMultimap(new copyOfSorted(nwVar5.MediaDescriptionCompat.RatingCompat.IconCompatParcelizer(), "", nwVar5.MediaBrowserCompat$ItemReceiver, nwVar5.read, nwVar5.write, nwVar5.MediaDescriptionCompat.RatingCompat.MediaBrowserCompat$ItemReceiver() ? DiskLruCache.VERSION_1 : "0"), "", ""), nwVar5.IconCompatParcelizer);
                    nwVar5.MediaMetadataCompat.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMap.OnMarkerDragListener>() {
                        public final /* synthetic */ void onNext(Object obj) {
                            super.onNext((GoogleMap.OnMarkerDragListener) obj);
                            C5075nw.MediaBrowserCompat$SearchResultReceiver(C5075nw.this);
                            C5075nw nwVar = C5075nw.this;
                            C4017af.C40201 r0 = new writeUInt64NoTag.IconCompatParcelizer() {
                                public final void IconCompatParcelizer(
/*
Method generation error in method: o.af.1.IconCompatParcelizer(java.lang.Object):void, dex: classes4.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.af.1.IconCompatParcelizer(java.lang.Object):void, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                            };
                            if (nwVar.RatingCompat != null) {
                                r0.IconCompatParcelizer(nwVar.RatingCompat);
                            }
                        }

                        public final void onError(Throwable th) {
                            super.onError(th);
                            C5075nw.this.MediaBrowserCompat$ItemReceiver(C5075nw.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                        }
                    });
                }
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                if (th instanceof RetrofitException) {
                    ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
                    if (iLocationSourceDelegate == null || iLocationSourceDelegate.write == null) {
                        str = "";
                    } else {
                        str = iLocationSourceDelegate.write.IconCompatParcelizer;
                    }
                    if ("3019".equals(str)) {
                        C5075nw.this.read(Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_default_title, Iterables$3$MediaBrowserCompat$MediaItem.error_ekyc_passport_1001_text, (Runnable) new C4014ae.C4016a(this));
                        return;
                    }
                    C5075nw.MediaBrowserCompat$CustomActionResultReceiver(C5075nw.this, C5075nw.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
                }
            }
        });
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5075nw nwVar, String str) {
        isBusy isbusy = new isBusy(str);
        if (nwVar.RatingCompat != null) {
            isbusy.IconCompatParcelizer(nwVar.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(C5075nw nwVar) {
        if (nwVar.RatingCompat != null) {
            nwVar.RatingCompat.aj_();
        }
    }
}
