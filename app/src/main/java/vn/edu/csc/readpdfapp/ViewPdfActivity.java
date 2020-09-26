package vn.edu.csc.readpdfapp;

import android.os.Bundle;
import android.text.TextUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import static vn.edu.csc.readpdfapp.ReadPDFController.readPDF;

public class ViewPdfActivity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pdf);
        pdfView = findViewById(R.id.viewPDF);
        if (getIntent() != null) {
            String viewType = getIntent().getStringExtra("ViewType");
            if (!TextUtils.isEmpty(viewType)) {
                if (TextUtils.equals(viewType, "assets")) {
                    readPDF("LearnJava.pdf", pdfView);
                }
            }
        }
    }
}