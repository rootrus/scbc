package p040o;

import p040o.AbstractIdleService;
import p040o.AppMeasurementSdk;

/* renamed from: o.tH */
public class C7500tH extends writeUInt64NoTag<setExpirationYear> {
    public final containsEntry IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final VisibleRegion MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final AbstractIdleService.C29991.C30002 read;
    public final AppMeasurementSdk.OnEventListener write;

    @HmlPinActivity
    public C7500tH(containsEntry containsentry, AppMeasurementSdk.OnEventListener onEventListener, VisibleRegion visibleRegion, AbstractIdleService.C29991.C30002 r4, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = containsentry;
        this.write = onEventListener;
        this.MediaBrowserCompat$ItemReceiver = visibleRegion;
        this.read = r4;
    }

    /* renamed from: o.tH$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTitle> {
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
            if ((r0 != null && (r0.equals("CLS") || r0.equals("CLO") || r0.equals("TRM") || r0.equals("PRG"))) == false) goto L_0x00ac;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(java.lang.Object r7) {
            /*
                r6 = this;
                o.getTitle r7 = (p040o.getTitle) r7
                super.onNext(r7)
                o.tH r0 = p040o.C7500tH.this
                o.startActivityForResult_aroundBody9$advice r1 = p040o.startActivityForResult_aroundBody9$advice.read
                T r2 = r0.RatingCompat
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0011
                r2 = r3
                goto L_0x0012
            L_0x0011:
                r2 = r4
            L_0x0012:
                if (r2 == 0) goto L_0x0019
                T r0 = r0.RatingCompat
                r1.IconCompatParcelizer(r0)
            L_0x0019:
                o.tH r0 = p040o.C7500tH.this
                o.tG r1 = p040o.C7499tG.read
                T r2 = r0.RatingCompat
                if (r2 == 0) goto L_0x0023
                r2 = r3
                goto L_0x0024
            L_0x0023:
                r2 = r4
            L_0x0024:
                if (r2 == 0) goto L_0x002b
                T r0 = r0.RatingCompat
                r1.IconCompatParcelizer(r0)
            L_0x002b:
                o.hideInfoWindow r0 = r7.MediaDescriptionCompat
                if (r0 == 0) goto L_0x00ed
                java.lang.String r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x00ed
                java.lang.String r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
                java.lang.String r2 = "1"
                boolean r2 = r1.equals(r2)
                if (r2 == 0) goto L_0x007d
                if (r0 == 0) goto L_0x004f
                java.lang.String r2 = "ACT"
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L_0x004f
                r2 = r3
                goto L_0x0050
            L_0x004f:
                r2 = r4
            L_0x0050:
                if (r2 == 0) goto L_0x007d
                o.tH r0 = p040o.C7500tH.this
                o.AbstractIdleService$1$2 r0 = r0.read
                o.tH r1 = p040o.C7500tH.this
                o.VisibleRegion r1 = r1.MediaBrowserCompat$ItemReceiver
                o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r1 = r1.write
                boolean r1 = r1.setItemInvoker()
                o.parseSession r7 = r0.MediaBrowserCompat$ItemReceiver(r7, r3, r1)
                o.tH r0 = p040o.C7500tH.this
                o.WorkflowActivity r1 = new o.WorkflowActivity
                r1.<init>(r7)
                T r7 = r0.RatingCompat
                if (r7 == 0) goto L_0x0074
                goto L_0x0075
            L_0x0074:
                r3 = r4
            L_0x0075:
                if (r3 == 0) goto L_0x007c
                T r7 = r0.RatingCompat
                r1.IconCompatParcelizer(r7)
            L_0x007c:
                return
            L_0x007d:
                java.lang.String r2 = "0"
                boolean r5 = r1.equals(r2)
                if (r5 == 0) goto L_0x00ac
                if (r0 == 0) goto L_0x00a9
                java.lang.String r5 = "CLS"
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto L_0x00a7
                java.lang.String r5 = "CLO"
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto L_0x00a7
                java.lang.String r5 = "TRM"
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto L_0x00a7
                java.lang.String r5 = "PRG"
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L_0x00a9
            L_0x00a7:
                r5 = r3
                goto L_0x00aa
            L_0x00a9:
                r5 = r4
            L_0x00aa:
                if (r5 != 0) goto L_0x00ed
            L_0x00ac:
                boolean r7 = r1.equals(r2)
                if (r7 == 0) goto L_0x00db
                if (r0 == 0) goto L_0x00c6
                java.lang.String r7 = "FZM"
                boolean r7 = r0.equals(r7)
                if (r7 != 0) goto L_0x00c4
                java.lang.String r7 = "DOR"
                boolean r7 = r0.equals(r7)
                if (r7 == 0) goto L_0x00c6
            L_0x00c4:
                r7 = r3
                goto L_0x00c7
            L_0x00c6:
                r7 = r4
            L_0x00c7:
                if (r7 == 0) goto L_0x00db
                o.tH r7 = p040o.C7500tH.this
                o.ExtractActivity_MembersInjector r0 = p040o.ExtractActivity_MembersInjector.write
                T r1 = r7.RatingCompat
                if (r1 == 0) goto L_0x00d2
                goto L_0x00d3
            L_0x00d2:
                r3 = r4
            L_0x00d3:
                if (r3 == 0) goto L_0x00da
                T r7 = r7.RatingCompat
                r0.IconCompatParcelizer(r7)
            L_0x00da:
                return
            L_0x00db:
                o.tH r7 = p040o.C7500tH.this
                o.startActivityForResult_aroundBody7$advice r0 = p040o.startActivityForResult_aroundBody7$advice.read
                T r1 = r7.RatingCompat
                if (r1 == 0) goto L_0x00e4
                goto L_0x00e5
            L_0x00e4:
                r3 = r4
            L_0x00e5:
                if (r3 == 0) goto L_0x00ec
                T r7 = r7.RatingCompat
                r0.IconCompatParcelizer(r7)
            L_0x00ec:
                return
            L_0x00ed:
                o.tH r0 = p040o.C7500tH.this
                o.AbstractIdleService$1$2 r0 = r0.read
                o.tH r1 = p040o.C7500tH.this
                o.VisibleRegion r1 = r1.MediaBrowserCompat$ItemReceiver
                o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r1 = r1.write
                boolean r1 = r1.setItemInvoker()
                o.parseSession r7 = r0.MediaBrowserCompat$ItemReceiver(r7, r4, r1)
                o.tH r0 = p040o.C7500tH.this
                o.inject_processor r1 = new o.inject_processor
                r1.<init>(r6, r7)
                T r7 = r0.RatingCompat
                if (r7 == 0) goto L_0x010f
                goto L_0x0110
            L_0x010f:
                r3 = r4
            L_0x0110:
                if (r3 == 0) goto L_0x0117
                T r7 = r0.RatingCompat
                r1.IconCompatParcelizer(r7)
            L_0x0117:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C7500tH.write.onNext(java.lang.Object):void");
        }

        public write(String str) {
        }

        public final void onError(Throwable th) {
            super.onError(th);
            if (!C7500tH.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C7500tH tHVar = C7500tH.this;
                startActivityForResult_aroundBody9$advice startactivityforresult_aroundbody9_advice = startActivityForResult_aroundBody9$advice.read;
                boolean z = true;
                if (tHVar.RatingCompat != null) {
                    startactivityforresult_aroundbody9_advice.IconCompatParcelizer(tHVar.RatingCompat);
                }
                C7500tH tHVar2 = C7500tH.this;
                C7499tG tGVar = C7499tG.read;
                if (tHVar2.RatingCompat != null) {
                    tGVar.IconCompatParcelizer(tHVar2.RatingCompat);
                }
                C7500tH tHVar3 = C7500tH.this;
                startActivityForResult_aroundBody7$advice startactivityforresult_aroundbody7_advice = startActivityForResult_aroundBody7$advice.read;
                if (tHVar3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    startactivityforresult_aroundbody7_advice.IconCompatParcelizer(tHVar3.RatingCompat);
                }
            }
        }
    }
}
