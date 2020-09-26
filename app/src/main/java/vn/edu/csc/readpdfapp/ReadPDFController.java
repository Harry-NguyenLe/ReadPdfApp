package vn.edu.csc.readpdfapp;

import android.graphics.Color;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;

public class ReadPDFController {
    public static void readPDF(String assets, final PDFView view) {
        view.fromAsset(assets)
                .password(null)
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .onRender(new OnRenderListener() {
                    @Override
                    public void onInitiallyRendered(int nbPages, float pageWidth, float pageHeight) {
                        view.fitToWidth();
                    }
                })
                .enableAnnotationRendering(true)
                .invalidPageColor(Color.WHITE)
                .load();
    }
}
