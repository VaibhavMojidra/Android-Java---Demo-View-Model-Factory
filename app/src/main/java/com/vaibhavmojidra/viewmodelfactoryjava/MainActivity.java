package com.vaibhavmojidra.viewmodelfactoryjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.vaibhavmojidra.viewmodelfactoryjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ViewModelMainActivity viewModelMainActivity;
    private ViewModelFactoryMainActivity viewModelFactoryMainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModelFactoryMainActivity=new ViewModelFactoryMainActivity("Hello no name");
        viewModelMainActivity= new ViewModelProvider(this,viewModelFactoryMainActivity).get(ViewModelMainActivity.class);
        binding.greetTextView.setText(viewModelMainActivity.getName());
        binding.editTextTextPersonName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    viewModelMainActivity.setName(s.toString());
                    binding.greetTextView.setText("Hello "+viewModelMainActivity.getName());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}