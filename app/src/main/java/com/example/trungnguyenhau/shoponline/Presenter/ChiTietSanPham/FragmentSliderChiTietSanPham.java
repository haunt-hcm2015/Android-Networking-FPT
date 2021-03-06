package com.example.trungnguyenhau.shoponline.Presenter.ChiTietSanPham;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.trungnguyenhau.shoponline.MainActivity;
import com.example.trungnguyenhau.shoponline.R;
import com.squareup.picasso.Picasso;

/**
 * Created by NguyenTrungHau on 8/13/2017.
 */

public class FragmentSliderChiTietSanPham extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragment_slider_chitietsanpham,container,false);
        Bundle bundle = getArguments();
        String linkhinh = bundle.getString("linkhinh");

        ImageView imageView = (ImageView) view.findViewById(R.id.imHinhSlider);

        Picasso.with(getContext()).load(linkhinh).into(imageView);

        return view;
    }
}