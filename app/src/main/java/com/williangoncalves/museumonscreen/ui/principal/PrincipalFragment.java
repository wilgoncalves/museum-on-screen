package com.williangoncalves.museumonscreen.ui.principal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.williangoncalves.museumonscreen.R;
import com.williangoncalves.museumonscreen.adapter.AdapterPrincipal;
import com.williangoncalves.museumonscreen.databinding.FragmentPrincipalBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PrincipalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PrincipalFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private FragmentPrincipalBinding binding;
    private RecyclerView recyclerViewPrincipal;

    public PrincipalFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PrincipalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PrincipalFragment newInstance(String param1, String param2) {
        PrincipalFragment fragment = new PrincipalFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflar o binding do fragment
        binding = FragmentPrincipalBinding.inflate(inflater, container, false);
        View rootView = binding.getRoot();

        // Inicializando RecyclerView
        recyclerViewPrincipal = binding.recyclerViewPrincipal;

        // Configurando Adapter:
        AdapterPrincipal adapterPrincipal = new AdapterPrincipal();

        // Configurando RecyclerView:
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerViewPrincipal.setLayoutManager(layoutManager);
        recyclerViewPrincipal.setHasFixedSize(true);
        recyclerViewPrincipal.setAdapter(adapterPrincipal);

        return rootView;
    }
}