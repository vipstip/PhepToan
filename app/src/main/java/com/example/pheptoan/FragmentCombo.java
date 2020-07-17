package com.example.pheptoan;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCombo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCombo extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private String urlGetData = "http://192.168.1.61/hocdot/booksInComboAndPosts.php";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mParam3;

    private static String lop;
    private static String mon;
    private static String combo;

    List<String> lstBooks;
    List<String> lstTerms;

    LinearLayout expandView;
    Button button,button1;
    CardView cardView,cardView1;

    public FragmentCombo() {
        // Required empty public constructor
    }

    public static FragmentCombo newInstance(String lop1, String mon1,String tenCombo1) {
        FragmentCombo fragment = new FragmentCombo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, lop1);
        args.putString(ARG_PARAM2, mon1);
        args.putString(ARG_PARAM3, tenCombo1);
        lop = lop1;
        mon = mon1;
        combo = tenCombo1;

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_combo, container, false);

        expandView = view.findViewById(R.id.childOfBooks);
        button = view.findViewById(R.id.btntest);
        button1 = view.findViewById(R.id.btntest2);
        cardView = view.findViewById(R.id.cardview);
        cardView1 = view.findViewById(R.id.cardview2);
        lstBooks = new ArrayList<>();
        lstTerms = new ArrayList<>();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cardView1.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    cardView1.setVisibility(View.VISIBLE);
                    button.setBackgroundResource(R.drawable.ic_arrow_drop_up_black_24dp);

                } else {
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    cardView1.setVisibility(View.GONE);
                    expandView.setVisibility(View.GONE);
                    button.setBackgroundResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandView.getVisibility() == View.GONE){
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    expandView.setVisibility(View.VISIBLE);
                    button1.setBackgroundResource(R.drawable.ic_arrow_drop_up_black_24dp);
                } else {
                    TransitionManager.beginDelayedTransition(cardView,new AutoTransition());
                    expandView.setVisibility(View.GONE);
                    button1.setBackgroundResource(R.drawable.ic_arrow_drop_down_black_24dp);
                }
            }
        });
        return view;
    }


}
