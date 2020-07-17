package com.example.pheptoan.DienTichChuVi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.pheptoan.R;

import java.util.ArrayList;
import java.util.List;

import io.github.kexanie.library.MathView;

public class DuongTron extends AppCompatActivity {

    EditText nhapR;
    Spinner spinnerDonViTinh;
    Button btnTinh;
    MathView ketqua;
    String txtKetqua;

    List<String> lstDonVitinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duong_tron);
        init();
        addDonViTinh();
        ArrayAdapter<String> adapterDonViTinh = new ArrayAdapter<String>(getApplicationContext(),
                R.layout.spinner_item,lstDonVitinh);

        adapterDonViTinh.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapterDonViTinh.notifyDataSetChanged();
        spinnerDonViTinh.setAdapter(adapterDonViTinh);
        spinnerDonViTinh.setSelection(1);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nhapR.getText().toString().equals("")){
                    txtKetqua = "Kiểm tra lại R chưa được nhập";
                } else {
                    float R = Float.parseFloat(nhapR.getText().toString());
                    String donvitinh = spinnerDonViTinh.getSelectedItem().toString();
                    txtKetqua = "- Với \\(\\pi\\) ta lấy: \\(\\pi \\approx 3.14 \\) &lt;p&gt;" +
                            "&nbsp;&nbsp;&nbsp; Áp dụng theo công thức ta được: &lt;p&gt;" +
                            "&nbsp;&nbsp;&nbsp; - Chu vi đường tròn : "+ tinhChuVi(R) + " " + donvitinh +"&lt;p&gt;" +
                            "&nbsp;&nbsp;&nbsp; - Diện tích đường tròn : "+tinhDientich(R) + " " + donvitinh;
                    Spanned spanned = Html.fromHtml(txtKetqua);
                    ketqua.setInitialScale(1);
                    ketqua.getSettings().setLoadWithOverviewMode(true);
                    ketqua.getSettings().setUseWideViewPort(true);
                    ketqua.getSettings().setSupportZoom(true);
                    ketqua.getSettings().setBuiltInZoomControls(true);
                    ketqua.getSettings().setDisplayZoomControls(false);
                    ketqua.getSettings().setJavaScriptEnabled(true);
                    ketqua.setText( "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=2, user-scalable=yes\">" + spanned);
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void init(){
        nhapR = findViewById(R.id.nhap_R);
        btnTinh = findViewById(R.id.btnTinhDuongTron);
        ketqua = findViewById(R.id.txtKquaGiaiHePT2An);
        spinnerDonViTinh = findViewById(R.id.spinnerDonVitinh);
        lstDonVitinh = new ArrayList<>();
    }

    public void addDonViTinh(){
        lstDonVitinh.add("mm");
        lstDonVitinh.add("cm");
        lstDonVitinh.add("dm");
        lstDonVitinh.add("m");

    }

    public String tinhChuVi(float BanKinh){
        float ChuVi;
        String txtChuVi;
        ChuVi = (float) (2 * BanKinh * 3.14);
        if (Math.round(ChuVi) - ChuVi == 0){
            txtChuVi = String.valueOf(Math.round(ChuVi));
        } else txtChuVi = String.valueOf(ChuVi);
        return txtChuVi;
    }
    public String tinhDientich(float BanKinh){
        float Dientich;
        String txtDientich;
        Dientich = (float) (BanKinh * BanKinh * 3.14);
        if (Math.round(Dientich) - Dientich == 0){
            txtDientich = String.valueOf(Math.round(Dientich));
        } else txtDientich = String.valueOf(Dientich);
        return txtDientich;
    }
}
