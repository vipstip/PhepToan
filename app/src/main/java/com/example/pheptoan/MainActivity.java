package com.example.pheptoan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pheptoan.DienTichChuVi.DuongTron;
import com.example.pheptoan.giaiPT.GiaiHePT2An;
import com.example.pheptoan.giaiPT.GiaiPTBac1;
import com.example.pheptoan.giaiPT.GiaiPTBac2;

import io.github.kexanie.library.MathView;

public class MainActivity extends AppCompatActivity {
    Button btnGiaiPTBac1,btnGiaiPTBac2,btnGiaiHePT2An,btnDuongTron;
    MathView testMath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGiaiPTBac1 = findViewById(R.id.btnGiaiPTBac1);
        btnGiaiPTBac2 = findViewById(R.id.btnGiaiPTBac2);
        btnGiaiHePT2An = findViewById(R.id.btnGiaiHePT2An);
        btnDuongTron = findViewById(R.id.btnDuongTron);
        testMath = findViewById(R.id.testMath);
        final Intent ptBac1 = new Intent(this, GiaiPTBac1.class);
        final Intent ptBac2 = new Intent(this, GiaiPTBac2.class);
        final Intent pt2An = new Intent(this, GiaiHePT2An.class);
        final Intent duongtron = new Intent(this, DuongTron.class);
        btnGiaiPTBac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ptBac1);
            }
        });

        btnGiaiPTBac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ptBac2);
            }
        });

        btnGiaiHePT2An.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(pt2An);
            }
        });
        btnDuongTron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(duongtron);
            }
        });
//        Spanned spanned = Html.fromHtml ("&lt;p&gt;a) Tập xác định: \\(D =\\mathbb R\\)&lt;/p&gt;&lt;p&gt;\\(\\eqalign{&lt;br&gt; &amp;amp; y' = 6{x^2} + 6x \\cr &lt;br&gt; &amp;amp; y' = 0 \\Leftrightarrow \\left[ \\matrix{&lt;br&gt; x = 0\\,\\,\\left( {y = 1} \\right) \\hfill \\cr &lt;br&gt; x = - 1\\,\\,\\left( {y = 2} \\right) \\hfill \\cr} \\right. \\cr} \\)&lt;/p&gt;&lt;p&gt;&lt;img style=&quot;width: 100%; max-width: 371px;&quot; src=&quot;https://img.loigiaihay.com/picture/2017/1108/toan-8_14.jpg&quot; alt=&quot;&quot;&gt;&lt;/p&gt;&lt;p&gt;Hàm số đồng biến trên mỗi khoảng \\(\\left( { - \\infty ; - 1} \\right)\\) và \\(\\left( {0; + \\infty } \\right)\\)&amp;nbsp;nghịch biến trên khoảng \\(\\left( { - 1;0} \\right)\\).&lt;/p&gt;&lt;p&gt;b) Tập xác định: \\(D =\\mathbb R\\)&lt;/p&gt;&lt;p&gt;\\(\\eqalign{&lt;br&gt; &amp;amp; y' = 3{x^2} - 4x + 1 \\cr &lt;br&gt; &amp;amp; y' = 0 \\Leftrightarrow \\left[ \\matrix{&lt;br&gt; x = 1\\,\\,\\left( {y = 1} \\right) \\hfill \\cr &lt;br&gt; x = {1 \\over 3}\\,\\,\\left( {y = {{31} \\over {27}}} \\right) \\hfill \\cr} \\right. \\cr} \\)&lt;/p&gt;&lt;p&gt;Bảng biến thiên&lt;/p&gt;&lt;p&gt;&lt;img style=&quot;width: 100%; max-width: 435px;&quot; src=&quot;https://img.loigiaihay.com/picture/2017/1108/toan-8_15.jpg&quot; alt=&quot;&quot;&gt;&lt;/p&gt;&lt;p&gt;Hàm số đồng biến trên mỗi khoảng \\(\\left( { - \\infty ;{1 \\over 3}} \\right)\\) và \\(\\,\\left( {1; + \\infty } \\right)\\)&amp;nbsp;, nghịch biến trên khoảng \\(\\,\\left( {{1 \\over 3};1} \\right)\\).&lt;/p&gt;&lt;p&gt;c) Tập xác định: \\(D =\\mathbb R\\backslash \\left\\{ 0 \\right\\}\\)&lt;/p&gt;&lt;p&gt;\\(\\eqalign{&lt;br&gt; &amp;amp; y' = 1 - {3 \\over {{x^2}}} = {{{x^2} - 3} \\over {{x^2}}} \\cr &lt;br&gt; &amp;amp; y' = 0 \\Leftrightarrow \\left[ \\matrix{&lt;br&gt; x = \\sqrt 3 \\,\\,\\left( {y = 2\\sqrt 3 } \\right) \\hfill \\cr &lt;br&gt; x = - \\sqrt 3 \\,\\,\\left( {y = - 2\\sqrt 3 } \\right) \\hfill \\cr} \\right. \\cr} \\)&lt;/p&gt;&lt;p&gt;Bảng biến thiên&lt;/p&gt;&lt;p&gt;&lt;img style=&quot;width: 100%; max-width: 450px;&quot; src=&quot;https://img.loigiaihay.com/picture/2017/1108/toan-8_16.jpg&quot; alt=&quot;&quot;&gt;&lt;/p&gt;&lt;p&gt;Hàm số đồng biến trên mỗi khoảng \\(\\left( { - \\infty ; - \\sqrt 3 } \\right)\\)&amp;nbsp;và \\(\\,\\left( {\\sqrt 3 ; + \\infty } \\right)\\)&amp;nbsp;, nghịch biến trên khoảng \\(\\left( { - \\sqrt 3 ;0} \\right)\\)&amp;nbsp;và \\(\\,\\left( {0;\\sqrt 3 } \\right)\\).&lt;/p&gt;&lt;p&gt;d) Tập xác định: \\(D = \\mathbb R\\backslash \\left\\{ 0 \\right\\}\\)&lt;/p&gt;&lt;p&gt;\\(y' = 1 + {2 \\over {{x^2}}} &amp;gt; 0\\) với mọi \\(x \\ne 0\\)&lt;/p&gt;&lt;p&gt;Hàm số đồng biến trên mỗi khoảng \\(\\,\\,\\left( { - \\infty ;0} \\right)\\)&amp;nbsp;và \\(\\left( {0; + \\infty } \\right)\\).&lt;/p&gt;&lt;p&gt;e) Tập xác định: \\(D= \\mathbb R\\)&lt;/p&gt;&lt;p&gt;\\(y' = 4{x^3} - 4x = 4x\\left( {{x^2} - 1} \\right);y' = 0 \\)&lt;/p&gt;&lt;p&gt;\\(&amp;nbsp;\\Leftrightarrow&amp;nbsp;\\,\\left[ \\matrix{&lt;br&gt; x = 0\\,\\,\\,\\,\\left( {y = - 5} \\right) \\hfill \\cr &lt;br&gt; x = \\pm 1\\,\\,\\,\\,\\left( {y = - 6} \\right) \\hfill \\cr} \\right.\\)&lt;/p&gt;&lt;p&gt;Bảng biến thiên&lt;/p&gt;&lt;p&gt;&lt;img style=&quot;width: 100%; max-width: 437px;&quot; src=&quot;https://img.loigiaihay.com/picture/2017/1108/toan-8_17.jpg&quot; alt=&quot;&quot;&gt;&lt;/p&gt;&lt;p&gt;Hàm số đồng biến trên mỗi khoảng \\(\\,\\left( { - \\infty ; - 1} \\right)\\)&amp;nbsp;và \\(\\left( {0;1} \\right)\\), đồng biến trên mỗi khoảng \\(\\left( { - 1;0} \\right)\\)&amp;nbsp;và \\(\\left( {1; + \\infty } \\right)\\).&lt;/p&gt;&lt;p&gt;f) Hàm số xác định khi và chỉ khi \\(4 - {x^2} \\ge 0 \\Leftrightarrow&amp;nbsp; - 2 \\le x \\le 2\\)&lt;/p&gt;&lt;p&gt;Tập xác định: \\(D = \\left[ { - 2;2} \\right]\\)&lt;/p&gt;&lt;p&gt;\\(y' = {{ - 2x} \\over {2\\sqrt {4 - {x^2}} }} = {{ - x} \\over {\\sqrt {4 - {x^2}} }};y' = 0 \\Leftrightarrow \\)\\(x = 0\\,\\,\\,\\left( {y = 2} \\right)\\)&lt;/p&gt;&lt;p&gt;Bảng biến thiên&lt;/p&gt;&lt;p&gt;&lt;strong&gt;&lt;img style=&quot;width: 100%; max-width: 442px;&quot; src=&quot;https://img.loigiaihay.com/picture/2017/1108/toan-8_18.jpg&quot; alt=&quot;&quot;&gt;&lt;/strong&gt;&lt;/p&gt;&lt;p&gt;Hàm số đồng biến trên khoảng \\(\\left( { - 2;0} \\right)\\)&amp;nbsp;và nghịch biến trên khoảng \\(\\left( {0;2} \\right)\\)&amp;nbsp;.&lt;/p&gt;");
//        testMath.setText(String.valueOf(spanned));
    }

}
