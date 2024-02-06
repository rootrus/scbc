package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.content.Context;
import com.kofax.android.abc.image_classification.ImageClassifier;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.extraction.C0528e;
import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk._internal.extraction.C7901c;
import com.kofax.mobile.sdk._internal.extraction.C7904g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0529g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0530i;
import com.kofax.mobile.sdk._internal.extraction.p004id.C0531n;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7907b;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7909d;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7911f;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7912h;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7913j;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7914k;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7915l;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7917o;
import com.kofax.mobile.sdk._internal.extraction.p004id.IIdFieldNameConvention;
import com.kofax.mobile.sdk._internal.impl.extraction.C0702f;
import com.kofax.mobile.sdk._internal.impl.extraction.C7986b;
import com.kofax.mobile.sdk._internal.impl.extraction.C7988d;
import com.kofax.mobile.sdk._internal.impl.extraction.C7990h;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.IProjectProvider;
import com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider;
import com.kofax.mobile.sdk.extract.p018id.OnDeviceIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.bundle.BundleCacheProvider;
import com.kofax.mobile.sdk.extract.p018id.bundle.IBundleCacheProvider;
import com.kofax.mobile.sdk.p016b.C0862c;
import com.kofax.mobile.sdk.p016b.C0863d;
import com.kofax.mobile.sdk.p016b.C8295a;
import com.kofax.mobile.sdk.p016b.C8296b;
import com.kofax.mobile.sdk.p021i.C0919c;
import com.kofax.mobile.sdk.p021i.C0921g;
import com.kofax.mobile.sdk.p021i.C8404a;
import com.kofax.mobile.sdk.p021i.C8406e;
import com.kofax.mobile.sdk.p029y.C0995b;
import com.kofax.mobile.sdk.p029y.C0999j;
import com.kofax.mobile.sdk.p029y.C1002n;
import com.kofax.mobile.sdk.p029y.C8636a;
import com.kofax.mobile.sdk.p029y.C8637d;
import com.kofax.mobile.sdk.p029y.C8640f;
import com.kofax.mobile.sdk.p029y.C8644h;
import com.kofax.mobile.sdk.p029y.C8647l;
import com.kofax.mobile.sdk.p029y.C8650p;
import com.kofax.mobile.sdk.p029y.C8653r;
import com.kofax.mobile.sdk.p029y.C8656t;
import com.kofax.mobile.sdk.p030z.C1012a;
import com.kofax.mobile.sdk.p070a.C8239a;
import com.kofax.mobile.sdk.p070a.C8240b;
import com.kofax.mobile.sdk.p073c.C8298b;
import com.kofax.mobile.sdk.p073c.C8299c;
import com.kofax.mobile.sdk.p073c.C8300d;
import com.kofax.mobile.sdk.p074d.C8336a;
import com.kofax.mobile.sdk.p074d.C8337b;
import com.kofax.mobile.sdk.p074d.C8339c;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p076h.C8394a;
import com.kofax.mobile.sdk.p076h.C8398c;
import com.kofax.mobile.sdk.p076h.C8401e;
import com.kofax.mobile.sdk.p077m.C8453a;
import com.kofax.mobile.sdk.p077m.C8455c;
import com.kofax.mobile.sdk.p077m.C8457e;
import com.kofax.mobile.sdk.p081u.C8482e;
import com.kofax.mobile.sdk.p082v.C8483a;
import com.kofax.mobile.sdk.p082v.C8485c;
import com.kofax.mobile.sdk.p082v.C8486d;
import com.kofax.mobile.sdk.p082v.C8488f;
import com.kofax.mobile.sdk.p083w.C8490a;
import com.kofax.mobile.sdk.p083w.C8494ab;
import com.kofax.mobile.sdk.p083w.C8496ac;
import com.kofax.mobile.sdk.p083w.C8501af;
import com.kofax.mobile.sdk.p083w.C8504ag;
import com.kofax.mobile.sdk.p083w.C8507ai;
import com.kofax.mobile.sdk.p083w.C8510ak;
import com.kofax.mobile.sdk.p083w.C8513am;
import com.kofax.mobile.sdk.p083w.C8515ao;
import com.kofax.mobile.sdk.p083w.C8518aq;
import com.kofax.mobile.sdk.p083w.C8520as;
import com.kofax.mobile.sdk.p083w.C8522au;
import com.kofax.mobile.sdk.p083w.C8524aw;
import com.kofax.mobile.sdk.p083w.C8526ay;
import com.kofax.mobile.sdk.p083w.C8529ba;
import com.kofax.mobile.sdk.p083w.C8531c;
import com.kofax.mobile.sdk.p083w.C8535e;
import com.kofax.mobile.sdk.p083w.C8537g;
import com.kofax.mobile.sdk.p083w.C8540h;
import com.kofax.mobile.sdk.p083w.C8547k;
import com.kofax.mobile.sdk.p083w.C8549l;
import com.kofax.mobile.sdk.p083w.C8551n;
import com.kofax.mobile.sdk.p083w.C8554p;
import com.kofax.mobile.sdk.p083w.C8556r;
import com.kofax.mobile.sdk.p083w.C8559t;
import com.kofax.mobile.sdk.p083w.C8562v;
import com.kofax.mobile.sdk.p083w.C8564x;
import com.kofax.mobile.sdk.p083w.C8566z;
import com.kofax.mobile.sdk.p084x.C8569a;
import com.kofax.mobile.sdk.p084x.C8570aa;
import com.kofax.mobile.sdk.p084x.C8572ac;
import com.kofax.mobile.sdk.p084x.C8575ae;
import com.kofax.mobile.sdk.p084x.C8577ag;
import com.kofax.mobile.sdk.p084x.C8579ai;
import com.kofax.mobile.sdk.p084x.C8581ak;
import com.kofax.mobile.sdk.p084x.C8584am;
import com.kofax.mobile.sdk.p084x.C8586ao;
import com.kofax.mobile.sdk.p084x.C8588aq;
import com.kofax.mobile.sdk.p084x.C8590as;
import com.kofax.mobile.sdk.p084x.C8592au;
import com.kofax.mobile.sdk.p084x.C8594aw;
import com.kofax.mobile.sdk.p084x.C8596ay;
import com.kofax.mobile.sdk.p084x.C8599ba;
import com.kofax.mobile.sdk.p084x.C8601bc;
import com.kofax.mobile.sdk.p084x.C8603be;
import com.kofax.mobile.sdk.p084x.C8606bh;
import com.kofax.mobile.sdk.p084x.C8608bj;
import com.kofax.mobile.sdk.p084x.C8611c;
import com.kofax.mobile.sdk.p084x.C8613e;
import com.kofax.mobile.sdk.p084x.C8615g;
import com.kofax.mobile.sdk.p084x.C8617i;
import com.kofax.mobile.sdk.p084x.C8620k;
import com.kofax.mobile.sdk.p084x.C8622m;
import com.kofax.mobile.sdk.p084x.C8624o;
import com.kofax.mobile.sdk.p084x.C8626q;
import com.kofax.mobile.sdk.p084x.C8630u;
import com.kofax.mobile.sdk.p084x.C8632w;
import com.kofax.mobile.sdk.p084x.C8634y;
import dagger.Lazy;
import java.io.File;
import java.lang.ref.WeakReference;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ah */
public class C0705ah {
    /* renamed from: a */
    public C7900b mo11639a(C7986b bVar) {
        return bVar;
    }

    /* renamed from: a */
    public C7901c mo11640a(C7988d dVar) {
        return dVar;
    }

    /* renamed from: a */
    public C0528e mo11641a(C0702f fVar) {
        return fVar;
    }

    /* renamed from: a */
    public C7904g mo11642a(C7990h hVar) {
        return hVar;
    }

    /* renamed from: a */
    public IIdFieldNameConvention mo11643a(C8135eh ehVar) {
        return ehVar;
    }

    /* renamed from: a */
    public C7906a mo11644a(C8035af afVar) {
        return afVar;
    }

    /* renamed from: a */
    public C7908c mo11645a(C8144h hVar) {
        return hVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "OCR")
    /* renamed from: a */
    public C7908c mo11646a(C8171w wVar) {
        return wVar;
    }

    /* renamed from: a */
    public C7909d mo11647a(C8137ej ejVar) {
        return ejVar;
    }

    /* renamed from: a */
    public C7910e mo11648a(C8146j jVar) {
        return jVar;
    }

    /* renamed from: a */
    public C7911f mo11649a(C8167t tVar) {
        return tVar;
    }

    /* renamed from: a */
    public C0529g mo11650a(C0721l lVar) {
        return lVar;
    }

    @C1012a
    /* renamed from: a */
    public C7912h mo11651a(C8141en enVar) {
        return enVar;
    }

    /* renamed from: a */
    public C7912h mo11652a(C8644h hVar, @C1012a C7912h hVar2) {
        return hVar;
    }

    @C1012a
    /* renamed from: a */
    public C0530i mo11653a(C0723y yVar) {
        return yVar;
    }

    /* renamed from: a */
    public C0530i mo11654a(C0999j jVar, @C1012a C0530i iVar) {
        return jVar;
    }

    @C1012a
    /* renamed from: a */
    public C7913j mo11655a(C8028aa aaVar) {
        return aaVar;
    }

    /* renamed from: a */
    public C7913j mo11656a(C8647l lVar, @C1012a C7913j jVar) {
        return lVar;
    }

    /* renamed from: a */
    public C7914k mo11657a(C0706a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C7915l mo11658a(C8133ef efVar) {
        return efVar;
    }

    @C1012a
    /* renamed from: a */
    public C7916m mo11659a(C8148n nVar) {
        return nVar;
    }

    /* renamed from: a */
    public C7916m mo11660a(C8656t tVar, @C1012a C7916m mVar) {
        return tVar;
    }

    /* renamed from: a */
    public C7917o mo11662a(C8030ac acVar) {
        return acVar;
    }

    /* renamed from: a */
    public C8295a mo11665a(C8406e eVar) {
        return eVar;
    }

    @C1012a
    /* renamed from: a */
    public C8296b mo11666a(C8404a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C8296b mo11667a(C8640f fVar, C8404a aVar) {
        return fVar;
    }

    @C1012a
    /* renamed from: a */
    public C0862c mo11668a(C0919c cVar) {
        return cVar;
    }

    /* renamed from: a */
    public C0862c mo11669a(C1002n nVar, @C1012a C0862c cVar) {
        return nVar;
    }

    @C0519a
    /* renamed from: a */
    public C0863d mo11670a(C0921g gVar) {
        return gVar;
    }

    @C1012a
    /* renamed from: a */
    public C8298b mo11671a(C8455c cVar) {
        return cVar;
    }

    /* renamed from: a */
    public C8298b mo11672a(C8637d dVar, @C1012a C8298b bVar) {
        return dVar;
    }

    @C1012a
    /* renamed from: a */
    public C8299c mo11673a(C8457e eVar) {
        return eVar;
    }

    /* renamed from: a */
    public C8299c mo11674a(C8653r rVar, @C1012a C8299c cVar) {
        return rVar;
    }

    /* renamed from: a */
    public C8300d mo11675a(C8453a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C8336a mo11676a(C8151p pVar) {
        return pVar;
    }

    /* renamed from: a */
    public C8337b mo11677a(C8165r rVar) {
        return rVar;
    }

    /* renamed from: a */
    public C8339c mo11678a(C8139el elVar) {
        return elVar;
    }

    /* renamed from: a */
    public C8342c mo11694a(C8483a aVar) {
        return aVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.FilterFieldsStage")
    /* renamed from: a */
    public C8342c mo11695a(C8486d dVar) {
        return dVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.FilterPipeline.REMOVE_AADHAR_CITY_STAGE")
    /* renamed from: a */
    public C8342c mo11697a(C8513am amVar) {
        return amVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.SetImageHolderStage")
    /* renamed from: a */
    public C8342c mo11698a(C8518aq aqVar) {
        return aqVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.FilterPipeline.SVK_MRZ_FIELD_STAGE")
    /* renamed from: a */
    public C8342c mo11699a(C8520as asVar) {
        return asVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.FilterPipeline.STRIP_CPF_FIELD_STAGE")
    /* renamed from: a */
    public C8342c mo11700a(C8522au auVar) {
        return auVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.FilterPipeline.STRIP_ID_NUMBER_STAGE")
    /* renamed from: a */
    public C8342c mo11701a(C8524aw awVar) {
        return awVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.FilterPipeline.STRIP_LICENSE_FIELD_STAGE")
    /* renamed from: a */
    public C8342c mo11702a(C8526ay ayVar) {
        return ayVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.FilterPipeline.STRIP_RFC_FIELD_STAGE")
    /* renamed from: a */
    public C8342c mo11703a(C8529ba baVar) {
        return baVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.AustriaTitleFullNameFieldStage")
    /* renamed from: a */
    public C8342c mo11704a(C8535e eVar) {
        return eVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ClearImagesStage")
    /* renamed from: a */
    public C8342c mo11705a(C8549l lVar) {
        return lVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.OcrPipeline.CONVERT_US_HEIGHT_FIELD_STAGE")
    /* renamed from: a */
    public C8342c mo11706a(C8551n nVar) {
        return nVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.FilterPipeline.COPY_ID_TO_LICENSE_FIELD_STAGE")
    /* renamed from: a */
    public C8342c mo11707a(C8554p pVar) {
        return pVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ExtendPhlDl2001FullNameFieldStage")
    /* renamed from: a */
    public C8342c mo11708a(C8562v vVar) {
        return vVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.FilterPipeline.FITER_FIELDS_STAGE")
    /* renamed from: a */
    public C8342c mo11709a(C8564x xVar) {
        return xVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ProcessImageStage")
    /* renamed from: a */
    public C8342c mo11713a(C8601bc bcVar) {
        return bcVar;
    }

    /* renamed from: a */
    public IIdExtractor mo11719a(C8650p pVar, @C1012a IIdExtractor iIdExtractor) {
        return pVar;
    }

    /* renamed from: a */
    public IBundleCacheProvider mo11721a(BundleCacheProvider bundleCacheProvider) {
        return bundleCacheProvider;
    }

    /* renamed from: a */
    public C8490a.C8492a mo11722a(C8569a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public C8531c.C8533a mo11725a(C8611c cVar) {
        return cVar;
    }

    /* renamed from: a */
    public C8566z.C8567a mo11726a(C8581ak akVar) {
        return akVar;
    }

    /* renamed from: b */
    public C7907b mo11727b(C8078c cVar) {
        return cVar;
    }

    /* renamed from: b */
    public C8240b mo11728b(C8398c cVar) {
        return cVar;
    }

    @C1012a
    /* renamed from: b */
    public IIdExtractor mo11729b(OnDeviceIdExtractor onDeviceIdExtractor) {
        return onDeviceIdExtractor;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_COM_KOFAX_MOBILE_SDK_EXTRACT_ID_ODE_CACHE_")
    /* renamed from: d */
    public File mo11730d(Context context) {
        return context.getFilesDir();
    }

    /* renamed from: e */
    public LocalProjectProvider mo11731e(Context context) {
        return new LocalProjectProvider(context);
    }

    /* renamed from: a */
    public IProjectProvider mo11720a(C0704a aVar) {
        return aVar.get();
    }

    /* renamed from: f */
    public C0704a mo11732f(Context context) {
        return new C0704a(context);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ATALABAR")
    /* renamed from: a */
    public C8239a mo11663a(C8394a aVar) {
        return new C8636a(aVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "MANATEE")
    /* renamed from: a */
    public C8239a mo11664a(C8401e eVar) {
        return new C8636a(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0531n mo11661a(Lazy<C0719e> lazy, Lazy<C0995b> lazy2) {
        return lazy2.get();
    }

    /* renamed from: nn */
    public ImageClassifier mo11733nn() {
        return new ImageClassifier();
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.stageInput.ProcessBothImagesStage.PROCESS_FRONT_IMAGE_STAGE")
    /* renamed from: a */
    public C8510ak mo11724a(C8603be beVar, C7916m mVar, C7919g gVar) {
        return new C8510ak(beVar, mVar, gVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.stageInput.ProcessBothImagesStage.PROCESS_BACK_IMAGE_STAGE")
    /* renamed from: a */
    public C8510ak mo11723a(C8599ba baVar, C7916m mVar, C7919g gVar) {
        return new C8510ak(baVar, mVar, gVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ReProcessFrontImageStage")
    /* renamed from: a */
    public C8342c mo11715a(C8608bj bjVar, C7916m mVar, C7919g gVar) {
        return new C8510ak(bjVar, mVar, gVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ReProcessBackImageStage")
    /* renamed from: a */
    public C8342c mo11714a(C8606bh bhVar, C7916m mVar, C7919g gVar) {
        return new C8510ak(bhVar, mVar, gVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ProcessFrontImageCallBackStage")
    /* renamed from: a */
    public C8342c mo11711a(C8579ai aiVar) {
        return new C8507ai(aiVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ProcessBackImageCallBackStage")
    /* renamed from: a */
    public C8342c mo11717a(C8624o oVar) {
        return new C8507ai(oVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.ClassifyImageStage")
    /* renamed from: a */
    public C8342c mo11693a(C8299c cVar, C8572ac acVar, C8617i iVar, C8490a aVar, C8531c cVar2) {
        return new C8485c(new C8547k(cVar, acVar), new C8547k(cVar, iVar), new C8501af(new C8594aw(acVar, iVar)), aVar, cVar2);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.OcrPipeline.FRONT_OCR")
    /* renamed from: a */
    public C8342c mo11683a(C7907b bVar, C8577ag agVar) {
        return new C8496ac(bVar, agVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.OcrPipeline.BACK_OCR")
    /* renamed from: a */
    public C8342c mo11684a(C7907b bVar, C8622m mVar) {
        return new C8496ac(bVar, mVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.OcrPipeline.VERTICAL_OCR")
    /* renamed from: a */
    public C8342c mo11685a(C7907b bVar, C8626q qVar) {
        return new C8496ac(bVar, qVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.OcrPipeline.SET_BACK_IMAGE_FIELDS_STAGE")
    /* renamed from: a */
    public C8342c mo11716a(C8620k kVar, C7910e eVar) {
        return new C8515ao(kVar, eVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.OcrPipeline.SET_FRONT_IMAGE_FIELDS_STAGE")
    /* renamed from: a */
    public C8342c mo11710a(C8575ae aeVar, C7910e eVar) {
        return new C8515ao(aeVar, eVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.OcrPipeline.MERGE_OCR")
    /* renamed from: a */
    public C8342c mo11690a(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "OCR") C7908c cVar, C8592au auVar) {
        return new C8494ab(cVar, auVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.OcrPipeline.POST_OCR")
    /* renamed from: a */
    public C8342c mo11712a(C8596ay ayVar) {
        return new C8504ag(ayVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.OcrBarcodeImageStage")
    /* renamed from: a */
    public C8342c mo11696a(C8488f fVar, C8483a aVar) {
        C8482e eVar = new C8482e();
        eVar.mo55142a(fVar);
        eVar.mo55142a(aVar);
        return eVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.OcrPipeline.INE_NAME_SWAP")
    /* renamed from: a */
    public C8342c mo11692a(C7917o oVar, C8566z.C8567a aVar) {
        return new C8566z(aVar, oVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.DocumentConfidenceStage")
    /* renamed from: a */
    public C8342c mo11691a(C7909d dVar, C8632w wVar) {
        return new C8559t(wVar, dVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.OnDeviceIdExtractor.MergeFieldsStage")
    /* renamed from: a */
    public C8342c mo11689a(C7908c cVar, C8590as asVar) {
        return new C8494ab(cVar, asVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.BarcodePipeline.FrontBarcodeStage")
    /* renamed from: a */
    public C8342c mo11682a(C7906a aVar, C8634y yVar) {
        return new C8537g(aVar, yVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.BarcodePipeline.FrontBarcodeStringStage")
    /* renamed from: a */
    public C8342c mo11679a(C7906a aVar, C8570aa aaVar) {
        return new C8540h(aVar, aaVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.BarcodePipeline.BackBarcodeStage")
    /* renamed from: a */
    public C8342c mo11680a(C7906a aVar, C8613e eVar) {
        return new C8537g(aVar, eVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.BarcodePipeline.BackBarcodeStringStage")
    /* renamed from: a */
    public C8342c mo11681a(C7906a aVar, C8615g gVar) {
        return new C8540h(aVar, gVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.BarcodePipeline.MergeFrontBarcodeStage")
    /* renamed from: a */
    public C8342c mo11688a(C7908c cVar, C8588aq aqVar) {
        return new C8494ab(cVar, aqVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.BarcodePipeline.MergeBackBarcodeStage")
    /* renamed from: a */
    public C8342c mo11686a(C7908c cVar, C8584am amVar) {
        return new C8494ab(cVar, amVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.BarcodePipeline.MergeBarcodeStage")
    /* renamed from: a */
    public C8342c mo11687a(C7908c cVar, C8586ao aoVar) {
        return new C8494ab(cVar, aoVar);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "com.kofax.mobile.sdk._internal.impl.extraction.onDevice.pipeline.pipelines.FilterPipeline.DERIVE_COUNTRY_FIELD_STAGE")
    /* renamed from: a */
    public C8342c mo11718a(C8630u uVar) {
        return new C8556r(uVar);
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ah$a */
    static class C0706a implements C7914k {

        /* renamed from: LU */
        private final WeakReference<Context> f1641LU;

        @HmlPinActivity
        public C0706a(Context context) {
            this.f1641LU = new WeakReference<>(context.getApplicationContext());
        }

        /* renamed from: hp */
        public IIdExtractor mo11734hp() {
            try {
                return new C8650p(Injector.getInjector(this.f1641LU.get()).getOnDeviceIdExtractor());
            } catch (Exception unused) {
                throw new RuntimeException("Could not load extractor");
            }
        }
    }
}
